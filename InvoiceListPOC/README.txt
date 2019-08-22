***********************************************************************
Invoice List README.txt
By: MD Ramesh
Date: July 25, 2019
***********************************************************************
1. File InvListTablesDDL.sql contains lot of tables. You do not have to 
create all of them. You only need the following tables:
INVOICE_LIST_T
CURRENT_BAN_T    
ACCT_SUM_T       
MASTER_ACCT_NO_T 
ORIGIN_SYSTEM_T 
OPCO_MASTER_T   
PAYMENT_INELIGIBLE_T  
SHIELD_XREF_T   
COLUMBIA_STATUS_T

2. Files *.del are the unload files for these tables. Once you create the 
tables, you should be able to use dbload to load data

3. File invlist_sql.txt is the original SQL that has everything in one big SQL

4. File Invoice-list-sql-modified-with-temp-table.sql is a modifed SQL that uses
IBM DB2 Warehouse's Global Temporary Table concept that greatly improves query performance

5. Here are the invoice list details for the users tested 

LOGIN ID                 USER OID      INVOICE_LIST REPORT_ID_TS      INVOICE LIST COUNT
VAM_DW_TEST_MEDIUM       1000000003    2019-05-31-13.39.25.367876               7978	(7960)
VAM_DW_TEST_XL           1000000004    2019-05-31-10.56.18.238481              43534	(36369)
***********************************************************************


