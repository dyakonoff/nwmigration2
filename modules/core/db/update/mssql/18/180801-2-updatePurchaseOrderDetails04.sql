alter table "Purchase Order Details" add constraint FK_PURCHASE_ORDER_DETAILS_ON_PURCHASE ORDER ID foreign key (PURCHASE ORDER ID) references "Purchase Orders"(\"Purchase Order ID\");
create index IDX_PURCHASE_ORDER_DETAILS_ON_PURCHASE ORDER ID on "Purchase Order Details" (PURCHASE ORDER ID);
