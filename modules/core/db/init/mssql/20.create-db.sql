-- begin "INVENTORY TRANSACTIONS"
alter table "Inventory Transactions" add constraint FK_INVENTORY_TRANSACTIONS_ON_TRANSACTION_TYPE foreign key ("Transaction Type") references "Inventory Transaction Types"(ID)^
alter table "Inventory Transactions" add constraint FK_INVENTORY_TRANSACTIONS_ON_PRODUCT foreign key ("Product ID") references "Products"(ID)^
alter table "Inventory Transactions" add constraint FK_INVENTORY_TRANSACTIONS_ON_PURCHASE_ORDER foreign key ("Purchase Order ID") references "Purchase Orders"(\"Purchase Order ID\")^
alter table "Inventory Transactions" add constraint FK_INVENTORY_TRANSACTIONS_ON_CUSTOMER_ORDER foreign key ("Customer Order ID") references "Orders"(\"Order ID\")^
create index IDX_INVENTORY_TRANSACTIONS_ON_TRANSACTION_TYPE on "Inventory Transactions" ("Transaction Type")^
create index IDX_INVENTORY_TRANSACTIONS_ON_PRODUCT on "Inventory Transactions" ("Product ID")^
create index IDX_INVENTORY_TRANSACTIONS_ON_PURCHASE_ORDER on "Inventory Transactions" ("Purchase Order ID")^
create index IDX_INVENTORY_TRANSACTIONS_ON_CUSTOMER_ORDER on "Inventory Transactions" ("Customer Order ID")^
-- end "INVENTORY TRANSACTIONS"
-- begin "INVOICES"
alter table "Invoices" add constraint FK_INVOICES_ON_ORDER foreign key ("Order ID") references "Orders"(\"Order ID\")^
create index IDX_INVOICES_ON_ORDER on "Invoices" ("Order ID")^
-- end "INVOICES"
-- begin "ORDER DETAILS"
alter table "Order Details" add constraint FK_ORDER_DETAILS_ON_ORDER foreign key ("Order ID") references "Orders"(\"Order ID\")^
alter table "Order Details" add constraint FK_ORDER_DETAILS_ON_PRODUCT foreign key ("Product ID") references "Products"(ID)^
alter table "Order Details" add constraint FK_ORDER_DETAILS_ON_STATUS foreign key ("Status ID") references "Order Details Status"(\"Status ID\")^
create index IDX_ORDER_DETAILS_ON_ORDER on "Order Details" ("Order ID")^
create index IDX_ORDER_DETAILS_ON_PRODUCT on "Order Details" ("Product ID")^
create index IDX_ORDER_DETAILS_ON_STATUS on "Order Details" ("Status ID")^
-- end "ORDER DETAILS"
-- begin "ORDERS"
alter table "Orders" add constraint FK_ORDERS_ON_EMPLOYEE foreign key ("Employee ID") references "Employees"(ID)^
alter table "Orders" add constraint FK_ORDERS_ON_CUSTOMER foreign key ("Customer ID") references "Customers"(ID)^
alter table "Orders" add constraint FK_ORDERS_ON_SHIPPER foreign key ("Shipper ID") references "Shippers"(ID)^
alter table "Orders" add constraint FK_ORDERS_ON_TAX_STATUS foreign key ("Tax Status") references "Orders Tax Status"(ID)^
alter table "Orders" add constraint FK_ORDERS_ON_STATUS foreign key ("Status ID") references "Orders Status"(\"Status ID\")^
create index IDX_ORDERS_ON_EMPLOYEE on "Orders" ("Employee ID")^
create index IDX_ORDERS_ON_CUSTOMER on "Orders" ("Customer ID")^
create index IDX_ORDERS_ON_SHIPPER on "Orders" ("Shipper ID")^
create index IDX_ORDERS_ON_TAX_STATUS on "Orders" ("Tax Status")^
create index IDX_ORDERS_ON_STATUS on "Orders" ("Status ID")^
-- end "ORDERS"
-- begin "PURCHASE ORDER DETAILS"
alter table "Purchase Order Details" add constraint FK_PURCHASE_ORDER_DETAILS_ON_PURCHASE_ORDER foreign key ("Purchase Order ID") references "Purchase Orders"(\"Purchase Order ID\")^
alter table "Purchase Order Details" add constraint FK_PURCHASE_ORDER_DETAILS_ON_PRODUCT foreign key ("Product ID") references "Products"(ID)^
alter table "Purchase Order Details" add constraint FK_PURCHASE_ORDER_DETAILS_ON_INVENTORY foreign key ("Inventory ID") references "Inventory Transactions"(\"Transaction ID\")^
create index IDX_PURCHASE_ORDER_DETAILS_ON_PURCHASE_ORDER on "Purchase Order Details" ("Purchase Order ID")^
create index IDX_PURCHASE_ORDER_DETAILS_ON_PRODUCT on "Purchase Order Details" ("Product ID")^
create index IDX_PURCHASE_ORDER_DETAILS_ON_INVENTORY on "Purchase Order Details" ("Inventory ID")^
-- end "PURCHASE ORDER DETAILS"
-- begin "PURCHASE ORDERS"
alter table "Purchase Orders" add constraint FK_PURCHASE_ORDERS_ON_SUPPLIER foreign key ("Supplier ID") references "Suppliers"(ID)^
alter table "Purchase Orders" add constraint FK_PURCHASE_ORDERS_ON_CREATED_BY foreign key ("Created By") references "Employees"(ID)^
alter table "Purchase Orders" add constraint FK_PURCHASE_ORDERS_ON_STATUS foreign key ("Status ID") references "Purchase Order Status"(\"Status ID\")^
create index IDX_PURCHASE_ORDERS_ON_SUPPLIER on "Purchase Orders" ("Supplier ID")^
create index IDX_PURCHASE_ORDERS_ON_CREATED_BY on "Purchase Orders" ("Created By")^
create index IDX_PURCHASE_ORDERS_ON_STATUS on "Purchase Orders" ("Status ID")^
-- end "PURCHASE ORDERS"
PRIVILEGES
