exec sp_rename '"Inventory Transactions".Purchase Order ID', 'Purchase_Order_ID__U64249', 'COLUMN' ^
alter table "Inventory Transactions" drop constraint INVENTORY TRANSACTIONS$NEW_PUCHASEORDERSONINVENTORYTRANSACTIONS ;
alter table "Inventory Transactions" add PURCHASE ORDER ID integer ;
alter table "Inventory Transactions" add "CUSTOMER ORDER ID" integer ;
