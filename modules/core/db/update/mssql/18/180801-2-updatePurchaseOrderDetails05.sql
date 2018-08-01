alter table "Purchase Order Details" add constraint FK_PURCHASE_ORDER_DETAILS_ON_INVENTORY ID foreign key (INVENTORY ID) references "Inventory Transactions"(\"Transaction ID\");
create index IDX_PURCHASE_ORDER_DETAILS_ON_INVENTORY ID on "Purchase Order Details" (INVENTORY ID);
