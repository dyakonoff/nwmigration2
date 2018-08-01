alter table "Order Details" add constraint FK_ORDER_DETAILS_ON_STATUS ID foreign key (STATUS ID) references "Order Details Status"(\"Status ID\");
create index IDX_ORDER_DETAILS_ON_STATUS ID on "Order Details" (STATUS ID);
