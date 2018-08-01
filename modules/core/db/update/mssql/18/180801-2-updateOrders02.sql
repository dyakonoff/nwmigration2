exec sp_rename '"Orders".Status ID', 'Status_ID__U20351', 'COLUMN' ^
alter table "Orders" drop constraint ORDERS$NEW_ORDERSTATUS ;
alter table "Orders" drop constraint DF__ORDERS__STATUS I__6166761E ;
alter table "Orders" add STATUS ID integer ;
