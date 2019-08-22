SELECT DISTINCT INV.REPORT_ID_TS
                     ,INV.ORIG_SYSTEM_ID
                     ,INV.MAN
                     ,INV.BAN
                     ,INV.MAN_BILL_DATE
               FROM BMGVZP.INVOICE_LIST_T INV
               INNER JOIN BMGVZP.CURRENT_BAN_T CRB
                  ON CRB.BAN = INV.BAN
                 AND CRB.MAN = INV.MAN
                 AND CRB.ORIG_SYSTEM_ID = INV.ORIG_SYSTEM_ID
                 AND CRB.LAST_DATE = INV.MAN_BILL_DATE
               WHERE INV.REPORT_ID_TS = '2019-02-07-01.30.28.944631'
                 AND INV.MAN_BILL_DATE < '9999-12-31'
                 AND INV.MAN_BILL_DATE > CURRENT DATE - 13 MONTHS
                 AND INV.ORIG_SYSTEM_ID NOT IN (
                      '23','T0','T2','T8','??','ML'
                     ,'CA','ZI','Z2','Z3')


