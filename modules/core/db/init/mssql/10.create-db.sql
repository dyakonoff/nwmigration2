-- begin "CUSTOMERS"
create table "Customers" (
    ID int identity,
    --
    "Company" varchar(50),
    "Last Name" varchar(50),
    "First Name" varchar(50),
    "E-mail Address" varchar(50),
    "Job Title" varchar(50),
    "Business Phone" varchar(25),
    "Home Phone" varchar(25),
    "Mobile Phone" varchar(25),
    "Fax Number" varchar(25),
    "Address" varchar(max),
    "City" varchar(50),
    "State/Province" varchar(50),
    "ZIP/Postal Code" varchar(15),
    "Country/Region" varchar(50),
    "Web Page" varchar(max),
    "Notes" varchar(max),
    "Attachments" varchar(8000),
    "SSMA_TimeStamp" image not null,
    --
    primary key (ID)
)^
-- end "CUSTOMERS"
-- begin "EMPLOYEES"
create table "Employees" (
    ID int identity,
    --
    "Company" varchar(50),
    "Last Name" varchar(50),
    "First Name" varchar(50),
    "E-mail Address" varchar(50),
    "Job Title" varchar(50),
    "Business Phone" varchar(25),
    "Home Phone" varchar(25),
    "Mobile Phone" varchar(25),
    "Fax Number" varchar(25),
    "Address" varchar(max),
    "City" varchar(50),
    "State/Province" varchar(50),
    "ZIP/Postal Code" varchar(15),
    "Country/Region" varchar(50),
    "Web Page" varchar(max),
    "Notes" varchar(max),
    "Attachments" varchar(8000),
    "SSMA_TimeStamp" image not null,
    --
    primary key (ID)
)^
-- end "EMPLOYEES"
-- begin "INVENTORY TRANSACTION TYPES"
create table "Inventory Transaction Types" (
    ID integer,
    --
    "Type Name" varchar(50) not null,
    --
    primary key (ID)
)^
-- end "INVENTORY TRANSACTION TYPES"
-- begin "INVENTORY TRANSACTIONS"
create table "Inventory Transactions" (
    "Transaction ID" int identity,
    --
    "Transaction Type" integer not null,
    "Transaction Created Date" datetime2,
    "Transaction Modified Date" datetime2,
    "Product ID" integer not null,
    "Quantity" integer not null,
    "Purchase Order ID" integer,
    "Customer Order ID" integer,
    "Comments" varchar(255),
    --
    primary key (\"TRANSACTION ID\")
)^
-- end "INVENTORY TRANSACTIONS"
-- begin "INVOICES"
create table "Invoices" (
    "Invoice ID" int identity,
    --
    "Order ID" integer,
    "Invoice Date" datetime2,
    "Due Date" datetime2,
    "Tax" decimal(19, 4),
    "Shipping" decimal(19, 4),
    "Amount Due" decimal(19, 4),
    --
    primary key (\"INVOICE ID\")
)^
-- end "INVOICES"
-- begin "ORDER DETAILS STATUS"
create table "Order Details Status" (
    "Status ID" integer,
    --
    "Status Name" varchar(50) not null,
    --
    primary key (\"STATUS ID\")
)^
-- end "ORDER DETAILS STATUS"
-- begin "ORDER DETAILS"
create table "Order Details" (
    ID int identity,
    --
    "Order ID" integer not null,
    "Product ID" integer,
    "Quantity" double precision not null,
    "Unit Price" decimal(19, 4),
    "Discount" double precision not null,
    "Status ID" integer,
    "Date Allocated" datetime2,
    "Purchase Order ID" integer,
    "Inventory ID" integer,
    "SSMA_TimeStamp" image not null,
    --
    primary key (ID)
)^
-- end "ORDER DETAILS"
-- begin "ORDERS STATUS"
create table "Orders Status" (
    "Status ID" integer,
    --
    "Status Name" varchar(50) not null,
    --
    primary key (\"STATUS ID\")
)^
-- end "ORDERS STATUS"
-- begin "ORDERS TAX STATUS"
create table "Orders Tax Status" (
    ID integer,
    --
    "Tax Status Name" varchar(50) not null,
    --
    primary key (ID)
)^
-- end "ORDERS TAX STATUS"
-- begin "ORDERS"
create table "Orders" (
    "Order ID" int identity,
    --
    "Employee ID" integer,
    "Customer ID" integer,
    "Order Date" datetime2,
    "Shipped Date" datetime2,
    "Shipper ID" integer,
    "Ship Name" varchar(50),
    "Ship Address" varchar(max),
    "Ship City" varchar(50),
    "Ship State/Province" varchar(50),
    "Ship ZIP/Postal Code" varchar(50),
    "Ship Country/Region" varchar(50),
    "Shipping Fee" decimal(19, 4),
    "Taxes" decimal(19, 4),
    "Payment Type" varchar(50),
    "Paid Date" datetime2,
    "Notes" varchar(max),
    "Tax Rate" double precision,
    "Tax Status" integer,
    "Status ID" integer,
    "SSMA_TimeStamp" image not null,
    --
    primary key (\"ORDER ID\")
)^
-- end "ORDERS"
-- begin "PRIVILEGESNW"
create table "Privilegesnw" (
    "Privilege ID" int identity,
    --
    "Privilege Name" varchar(50),
    --
    primary key (\"PRIVILEGE ID\")
)^
-- end "PRIVILEGESNW"
-- begin "PRODUCTS"
create table "Products" (
    ID int identity,
    --
    "Supplier IDs" varchar(8000),
    "Product Code" varchar(25),
    "Product Name" varchar(50),
    "Description" varchar(max),
    "Standard Cost" decimal(19, 4),
    "List Price" decimal(19, 4) not null,
    "Reorder Level" integer,
    "Target Level" integer,
    "Quantity Per Unit" varchar(50),
    "Discontinued" tinyint not null,
    "Minimum Reorder Quantity" integer,
    "Category" varchar(50),
    "Attachments" varchar(8000),
    "SSMA_TimeStamp" image not null,
    --
    primary key (ID)
)^
-- end "PRODUCTS"
-- begin "PURCHASE ORDER DETAILS"
create table "Purchase Order Details" (
    ID int identity,
    --
    "Purchase Order ID" integer not null,
    "Product ID" integer,
    "Quantity" double precision not null,
    "Unit Cost" decimal(19, 4) not null,
    "Date Received" datetime2,
    "Posted To Inventory" tinyint not null,
    "Inventory ID" integer,
    "SSMA_TimeStamp" image not null,
    --
    primary key (ID)
)^
-- end "PURCHASE ORDER DETAILS"
-- begin "PURCHASE ORDER STATUS"
create table "Purchase Order Status" (
    "Status ID" integer,
    --
    "Status" varchar(50),
    --
    primary key (\"STATUS ID\")
)^
-- end "PURCHASE ORDER STATUS"
-- begin "PURCHASE ORDERS"
create table "Purchase Orders" (
    "Purchase Order ID" int identity,
    --
    "Supplier ID" integer,
    "Created By" integer,
    "Submitted Date" datetime2,
    "Creation Date" datetime2,
    "Status ID" integer,
    "Expected Date" datetime2,
    "Shipping Fee" decimal(19, 4) not null,
    "Taxes" decimal(19, 4) not null,
    "Payment Date" datetime2,
    "Payment Amount" decimal(19, 4),
    "Payment Method" varchar(50),
    "Notes" varchar(max),
    "Approved By" integer,
    "Approved Date" datetime2,
    "Submitted By" integer,
    "SSMA_TimeStamp" image not null,
    --
    primary key (\"PURCHASE ORDER ID\")
)^
-- end "PURCHASE ORDERS"
-- begin "SALES REPORTS"
create table "Sales Reports" (
    "Group By" varchar(50),
    --
    "Display" varchar(50),
    "Title" varchar(50),
    "Filter Row Source" varchar(max),
    "Default" tinyint not null,
    "SSMA_TimeStamp" image not null,
    --
    primary key ("GROUP BY")
)^
-- end "SALES REPORTS"
-- begin "SHIPPERS"
create table "Shippers" (
    ID int identity,
    --
    "Company" varchar(50),
    "Last Name" varchar(50),
    "First Name" varchar(50),
    "E-mail Address" varchar(50),
    "Job Title" varchar(50),
    "Business Phone" varchar(25),
    "Home Phone" varchar(25),
    "Mobile Phone" varchar(25),
    "Fax Number" varchar(25),
    "Address" varchar(max),
    "City" varchar(50),
    "State/Province" varchar(50),
    "ZIP/Postal Code" varchar(15),
    "Country/Region" varchar(50),
    "Web Page" varchar(max),
    "Notes" varchar(max),
    "Attachments" varchar(8000),
    "SSMA_TimeStamp" image not null,
    --
    primary key (ID)
)^
-- end "SHIPPERS"
-- begin "STRINGS"
create table "Strings" (
    "String ID" int identity,
    --
    "String Data" varchar(255),
    --
    primary key (\"STRING ID\")
)^
-- end "STRINGS"
-- begin "SUPPLIERS"
create table "Suppliers" (
    ID int identity,
    --
    "Company" varchar(50),
    "Last Name" varchar(50),
    "First Name" varchar(50),
    "E-mail Address" varchar(50),
    "Job Title" varchar(50),
    "Business Phone" varchar(25),
    "Home Phone" varchar(25),
    "Mobile Phone" varchar(25),
    "Fax Number" varchar(25),
    "Address" varchar(max),
    "City" varchar(50),
    "State/Province" varchar(50),
    "ZIP/Postal Code" varchar(15),
    "Country/Region" varchar(50),
    "Web Page" varchar(max),
    "Notes" varchar(max),
    "Attachments" varchar(8000),
    "SSMA_TimeStamp" image not null,
    --
    primary key (ID)
)^
-- end "SUPPLIERS"
PRIVILEGES
