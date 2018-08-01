exec sp_rename '"Invoices".Order ID', 'Order_ID__U99174', 'COLUMN' ^
alter table "Invoices" drop constraint INVOICES$NEW_ORDERINVOICE ;
alter table "Invoices" add ORDER ID integer ;
