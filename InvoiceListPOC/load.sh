db2 connect to BMGVZP;
db2 load from /tmp/ACCT_SUM_T.del of del insert into BMGVZP.ACCT_SUM_T;
db2 load from /tmp/COLUMBIA_STATUS_T.del of del insert into BMGVZP.COLUMBIA_STATUS_T;
db2 load from /tmp/CURRENT_BAN_T.del of del insert into BMGVZP.CURRENT_BAN_T;
db2 load from /tmp/INVOICE_LIST_T.del of del insert into BMGVZP.INVOICE_LIST_T;
db2 load from /tmp/MASTER_ACCT_NO_T.del of del insert into BMGVZP.MASTER_ACCT_NO_T;
db2 load from /tmp/OPCO_MASTER_T.del of del insert into BMGVZP.OPCO_MASTER_T;
db2 load from /tmp/ORIGIN_SYSTEM_T.del of del insert into BMGVZP.ORIGIN_SYSTEM_T;
db2 load from /tmp/PAYMENT_INELIGIBLE_T.del of del insert into BMGVZP.PAYMENT_INELIGIBLE_T;
db2 load from /tmp/SHIELD_XREF_T.del of del insert into BMGVZP.SHIELD_XREF_T;
db2 disconnect BMGVZP;