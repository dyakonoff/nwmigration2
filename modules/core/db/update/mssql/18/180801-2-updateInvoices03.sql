alter table "Invoices" add constraint FK_INVOICES_ON_ORDER ID foreign key (ORDER ID) references "Orders"(\"Order ID\");
create index IDX_INVOICES_ON_ORDER ID on "Invoices" (ORDER ID);
