# InvoiceListPOC
Application is a initial loader using Hibernate, that loads all tables from DB2 into space and executes SQL query within java.

# Content:
 - InvoiceList - main app
 - InvoiceListPOC - files with queries and DDL
 - tables - archives with data for DB2
 - configure vm.txt - instruction how to setup working instance

# To run application:
 - start instance i-0d9bab1829eda6111
 - ssh to instance as ubuntu user
 - login as db2inst1 (su - db2inst1)
 - start db2 (db2start)
 - login as ubuntu
 - start IE (gigaspaces-insightedge-enterprise-14.5.0/bin/gs.sh demo)
 - build project (mvn clean package)
 - deploy as pu
