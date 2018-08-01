exec sp_rename '"Purchase Orders".Status ID', 'Status_ID__U04421', 'COLUMN' ^
alter table "Purchase Orders" drop constraint PURCHASE ORDERS$NEW_PURCHASEORDERSTATUSLOOKUP ;
alter table "Purchase Orders" drop constraint DF__PURCHASE __STATU__671F4F74 ;
alter table "Purchase Orders" add STATUS ID integer ;
