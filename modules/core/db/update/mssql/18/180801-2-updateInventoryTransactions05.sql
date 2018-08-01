alter table "Inventory Transactions" add constraint FK_INVENTORY_TRANSACTIONS_ON_CUSTOMER_ORDER foreign key ("Customer Order ID") references "Orders"(\"Order ID\");
create index IDX_INVENTORY_TRANSACTIONS_ON_CUSTOMER_ORDER on "Inventory Transactions" ("Customer Order ID");
