
         SELECT DISTINCT INV.SP_OID
               ,INV.SB_OID
               ,CASE WHEN (INV.ORIG_SYSTEM_ID = 'PO'
                          AND INV.SERVICE_TYPE = 'BTN'
                          AND INV.Q2C_FLAG = 'Y')
                     THEN 'BTNE2EI'
                     WHEN INV.SERVICE_TYPE = 'CGI'
                     THEN 'CORP'
                     ELSE INV.SERVICE_TYPE
                END SERVICE_TYPE
               ,INV.MAN
               ,INV.DISP_MAN
               ,ACT.MAN_BILL_DATE
               ,INV.ORIG_SYSTEM_ID
               ,INV.BAN
               ,INV.DISP_ACCT_NUM DISP_BAN
               ,ACT.BILL_DATE
               ,ACT.ABAN
               ,COALESCE(ACT.OPCO,'') OPCO
               ,ACT.INVOICE_NBR
               ,ACT.ACCT_NAME
               ,INV.ACCT_ALIAS
               ,ACT.BILL_CURR CURRENCY_CD
               ,ACT.TOT_CURR_CHGS
               ,ACT.PREV_BILL_AMT
               ,INV.PAPER_SUPP_IND
               ,INV.ADDR_CITY
               ,INV.ADDR_STATE
               ,INV.GBR
               ,CASE WHEN COALESCE(ACT.REMIT_ACCT_IND,
                                   INV.REMIT_ACCT_IND) = 'B'
                     THEN 'N'
                     ELSE COALESCE(ACT.REMIT_ACCT_IND,
                                   INV.REMIT_ACCT_IND)
                END REMIT_ACCT_IND
               ,INV.ACCOUNT_TYPE
               ,CASE WHEN INV.ORIG_SYSTEM_ID = '07'
                      AND (INV.STAND_ALONE_IND = 'Y'
                        OR INV.MAN <> INV.BAN
                        OR INV.ABAN NOT IN ('0000000','00000000'))
                     THEN 903
                     WHEN INV.ORIG_SYSTEM_ID IN ('GD','IC','ID','RA')
                     THEN OSYS.PORTAL_START_PAGE
                     WHEN MST.INTERNATIONAL_IND IS NULL
                     THEN 5200
                     WHEN MST.INTERNATIONAL_IND = 'Y'
                      AND INV.ORIG_SYSTEM_ID NOT IN
                           ('IC','ID','25','26','GD','PO')
                     THEN 0
                     WHEN INV.ORIG_SYSTEM_ID = 'PO'
                      AND OPCM.OPCO IS NULL
                     THEN OSYS.PORTAL_START_PAGE
                     WHEN INV.ORIG_SYSTEM_ID = 'PO'
                      AND INV.MAN <> INV.BAN
                     THEN OPCM.PORTAL_START_PAGE
                     WHEN INV.ORIG_SYSTEM_ID = 'PO'
                      AND INV.MAN = INV.BAN
                     THEN OPCM.PORTAL_START_PAGE_MAN
                     WHEN OSYS.PORTAL_LINK = 'I'
                     THEN OSYS.PORTAL_START_PAGE
                     ELSE 5200
                END AS START_PAGE
               ,MST.MAN_PARTIAL_IND PARTIAL_IND
               ,CASE WHEN ACT.PAY_BY_DATE = '0000-00-00'
                      THEN '9999-12-31'
                      WHEN ACT.PAY_BY_DATE IS NULL
                      THEN '9999-12-31'
                      ELSE ACT.PAY_BY_DATE
                END DUE_DATE
               ,' ' WTN
               ,COALESCE(SHLD.NEW_SYS_BAN,' ') SHIELDED_NBR
               ,CASE WHEN INELG.MAN IS NOT NULL
                     THEN 'Y'
                     ELSE ' '
                END AS VES_LARGE
               ,COALESCE(CST.STATUS,' ') XML_STATUS
         FROM (step1) LST
         INNER JOIN BMGVZP.INVOICE_LIST_T INV
            ON INV.REPORT_ID_TS = LST.REPORT_ID_TS
           AND INV.ORIG_SYSTEM_ID = LST.ORIG_SYSTEM_ID
           AND INV.MAN = LST.MAN
           AND INV.BAN = LST.BAN
           AND INV.MAN_BILL_DATE = LST.MAN_BILL_DATE
         INNER JOIN BMGVZP.ACCT_SUM_T ACT
            ON INV.BAN = ACT.BAN
           AND INV.BILL_DATE = ACT.BILL_DATE
           AND INV.MAN = ACT.MAN
           AND INV.MAN_BILL_DATE = ACT.MAN_BILL_DATE
           AND INV.ORIG_SYSTEM_ID = ACT.ORIG_SYSTEM_ID
           AND (ACT.ORIG_SYSTEM_ID NOT IN ('M1','M2','PO')
                OR ACT.RECORD_LEVEL = '5')
           AND (ACT.ORIG_SYSTEM_ID NOT IN
                       ('07','10','PO','GC','GD','IC','ID')
                OR ACT.ABAN = INV.ABAN)
         INNER JOIN BMGVZP.MASTER_ACCT_NO_T MST
            ON INV.MAN = MST.MAN
           AND INV.MAN_BILL_DATE = MST.MAN_BILL_DATE
           AND INV.ORIG_SYSTEM_ID = MST.ORIG_SYSTEM_ID
           AND MST.LOCATION = 'V'
         INNER JOIN BMGVZP.ORIGIN_SYSTEM_T OSYS
            ON INV.ORIG_SYSTEM_ID = OSYS.ORIG_SYSTEM_ID
         LEFT OUTER JOIN BMGVZP.OPCO_MASTER_T OPCM
            ON INV.OPCO = OPCM.OPCO
         LEFT OUTER JOIN BMGVZP.PAYMENT_INELIGIBLE_T INELG
            ON INV.MAN = INELG.MAN
           AND INV.BAN = INELG.BAN
           AND INV.ORIG_SYSTEM_ID = INELG.ORIG_SYSTEM_ID
         LEFT OUTER JOIN BMGVZP.OPCO_MASTER_T OPCM
            ON INV.OPCO = OPCM.OPCO
         LEFT OUTER JOIN BMGVZP.SHIELD_XREF_T SHLD
            ON INV.MAN = SHLD.LEG_MAN
           AND INV.BAN = SHLD.LEG_BAN
           AND INV.ORIG_SYSTEM_ID = SHLD.LEG_OSID
           AND ACT.MAN_BILL_DATE BETWEEN SHLD.FIRST_BILL_DATE
                                     AND SHLD.LAST_BILL_DATE
         LEFT OUTER JOIN BMGVZP.COLUMBIA_STATUS_T CST
            ON INV.OPCO = '2803'
           AND CST.MAN = ACT.MAN
           AND CST.OSID = ACT.ORIG_SYSTEM_ID
           AND CST.BAN = ACT.BAN
           AND CST.BILL_DATE = ACT.BILL_DATE
           AND CST.INVOICE_NBR = ACT.INVOICE_NBR
       