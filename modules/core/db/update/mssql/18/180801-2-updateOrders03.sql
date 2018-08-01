alter table "Orders" add constraint FK_ORDERS_ON_STATUS ID foreign key (STATUS ID) references "Orders Status"(\"Status ID\");
create index IDX_ORDERS_ON_STATUS ID on "Orders" (STATUS ID);
