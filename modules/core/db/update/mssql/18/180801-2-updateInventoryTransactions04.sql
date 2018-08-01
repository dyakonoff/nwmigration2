alter table "Inventory Transactions" add constraint FK_INVENTORY_TRANSACTIONS_ON_PURCHASE ORDER ID foreign key (PURCHASE ORDER ID) references "Purchase Orders"(\"Purchase Order ID\");
create index IDX_INVENTORY_TRANSACTIONS_ON_PURCHASE ORDER ID on "Inventory Transactions" (PURCHASE ORDER ID);
