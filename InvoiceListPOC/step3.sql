SELECT CHAR(SC1.SP_OID) SP_OID
            ,CHAR(SC1.SB_OID) SB_OID
            ,SC1.SERVICE_TYPE
            ,SC1.MAN
            ,SC1.DISP_MAN
            ,SC1.MAN_BILL_DATE
            ,SC1.ORIG_SYSTEM_ID
            ,SC1.BAN
            ,SC1.DISP_BAN
            ,SC1.BILL_DATE
            ,SC1.ABAN
            ,SC1.OPCO
            ,SC1.INVOICE_NBR
            ,SC1.ACCT_NAME
            ,SC1.ACCT_ALIAS
            ,SC1.CURRENCY_CD
            ,CHAR(SC1.TOT_CURR_CHGS) TOT_CURR_CHGS
            ,CHAR(SC1.PREV_BILL_AMT) PREV_BILL_AMT
            ,SC1.PAPER_SUPP_IND
            ,SC1.ADDR_CITY
            ,SC1.ADDR_STATE
            ,SC1.GBR
            ,SC1.REMIT_ACCT_IND
            ,SC1.VES_LARGE
            ,SC1.ACCOUNT_TYPE
            ,CHAR(SC1.START_PAGE) START_PAGE
            ,SC1.PARTIAL_IND
            ,SC1.DUE_DATE
            ,SC1.WTN
            ,SC1.SHIELDED_NBR
            ,SC1.XML_STATUS
       FROM (step2) SC1
    WITH UR;