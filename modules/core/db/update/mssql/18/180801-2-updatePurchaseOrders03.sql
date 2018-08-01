alter table "Purchase Orders" add constraint FK_PURCHASE_ORDERS_ON_STATUS ID foreign key (STATUS ID) references "Purchase Order Status"(\"Status ID\");
create index IDX_PURCHASE_ORDERS_ON_STATUS ID on "Purchase Orders" (STATUS ID);
