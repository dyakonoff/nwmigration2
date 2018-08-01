exec sp_rename '"Order Details".Status ID', 'Status_ID__U03308', 'COLUMN' ^
alter table "Order Details" drop constraint ORDER DETAILS$NEW_ORDERSTATUSLOOKUP ;
exec sp_rename '"Order Details".Order ID', 'Order_ID__U79753', 'COLUMN' ^
alter table "Order Details" alter column Order_ID__U79753 int  ;
alter table "Order Details" drop constraint ORDER DETAILS$NEW_ORDERDETAILS ;
-- alter table "Order Details" add ORDER ID integer ^
-- update "Order Details" set ORDER ID = <default_value> ;
-- alter table "Order Details" alter column Order ID integer not null ;
alter table "Order Details" add ORDER ID integer not null ;
alter table "Order Details" add STATUS ID integer ;
