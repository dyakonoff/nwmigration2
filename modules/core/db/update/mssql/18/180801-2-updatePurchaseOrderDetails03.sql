exec sp_rename '"Purchase Order Details".Inventory ID', 'Inventory_ID__U93300', 'COLUMN' ^
alter table "Purchase Order Details" drop constraint PURCHASE ORDER DETAILS$NEW_INVENTORYTRANSACTIONSONPURCHASEORDERS ;
exec sp_rename '"Purchase Order Details".Purchase Order ID', 'Purchase_Order_ID__U96815', 'COLUMN' ^
alter table "Purchase Order Details" alter column Purchase_Order_ID__U96815 int  ;
alter table "Purchase Order Details" drop constraint PURCHASE ORDER DETAILS$NEW_PURCHASEORDERDEATILSONPURCHASEORDER ;
-- alter table "Purchase Order Details" add PURCHASE ORDER ID integer ^
-- update "Purchase Order Details" set PURCHASE ORDER ID = <default_value> ;
-- alter table "Purchase Order Details" alter column Purchase Order ID integer not null ;
alter table "Purchase Order Details" add PURCHASE ORDER ID integer not null ;
alter table "Purchase Order Details" add INVENTORY ID integer ;
