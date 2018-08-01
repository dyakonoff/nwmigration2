alter table "Order Details" add constraint FK_ORDER_DETAILS_ON_ORDER ID foreign key (ORDER ID) references "Orders"(\"Order ID\");
create index IDX_ORDER_DETAILS_ON_ORDER ID on "Order Details" (ORDER ID);
