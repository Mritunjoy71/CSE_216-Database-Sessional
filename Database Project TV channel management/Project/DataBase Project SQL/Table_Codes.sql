CREATE TABLE "Agriculture" (
  "Program_id" int,
  "Program_name" varchar2(50),
  "cast" varchar2(50)
);

CREATE INDEX "pk" ON  "Agriculture" ("Program_id");

CREATE TABLE "Ad_during_program" (
  "product_id" int,
  "program_id" int
);

CREATE INDEX "pk" ON  "Ad_during_program" ("product_id");

CREATE INDEX "fk" ON  "Ad_during_program" ("program_id");

CREATE TABLE "Reality_Show" (
  "program_id" int,
  "Program_name" varchar2(50),
  "cast" varchar2(50)
);

CREATE INDEX "pk" ON  "Reality_Show" ("program_id");

CREATE TABLE "News" (
  "Program_id" int,
  "news_hour" int,
  "cast" varchar2(50)
);

CREATE INDEX "pk" ON  "News" ("Program_id");

CREATE TABLE "serials" (
  "Program_id" int,
  "Cast" varchar2(50),
  "serial_name" varchar2(50)
);

CREATE INDEX "pk" ON  "serials" ("Program_id");

CREATE TABLE "Channel" (
  "Program_id" int,
  "Emp_id" int,
  "" <type>
);

CREATE INDEX "pk" ON  "Channel" ("Program_id");

CREATE TABLE "Talk_show" (
  "Program_id" int,
  "program_name" varchar2(50),
  "cast" varchar2(50)
);

CREATE INDEX "pk" ON  "Talk_show" ("Program_id");

CREATE TABLE "Programs" (
  "Program_id" int,
  "Program_type" varchar2(50),
  "Sponsor" varchar2(50),
  "TRP" varchar2(50),
  "Starting_date" varchar2(50),
  "end_date" date,
  "Starting_time" varchar2(50),
  "Number_of_epi" int,
  "emp_id" int
);

CREATE INDEX "pk" ON  "Programs" ("Program_id");

CREATE TABLE "Life_style" (
  "Program_id" Type,
  "Program_name" varchar2(50),
  "cast" varchar2(50)
);

CREATE INDEX "pk" ON  "Life_style" ("Program_id");

CREATE TABLE "Employee" (
  "Emp_id" int,
  "Emp_name" varchar2(50),
  "Email" varchar2(50),
  "Gender" varchar2(50),
  "Mobile" int,
  "Address" varchar2(50),
  "Salary" int,
  "Designation" varchar2(50),
  "Hire_date" date
);

CREATE INDEX "pk" ON  "Employee" ("Emp_id");

CREATE TABLE "Advertisement" (
  "Product_id" int,
  "Product_name" varchar2(50),
  "Slot" int,
  "Sponsor_fee" int
);

CREATE INDEX "pk" ON  "Advertisement" ("Product_id");

CREATE TABLE "Casting" (
  "Casting_id" int,
  "Cast_name" varchar2(50),
  "Casting_fee" varchar2(50)
);

CREATE INDEX "pk" ON  "Casting" ("Casting_id");

CREATE TABLE "Cast" (
  "Casting_id" int,
  "program_id" int,
  "" <type>
);

CREATE INDEX "Key" ON  "Cast" ("Casting_id");

CREATE INDEX "fk" ON  "Cast" ("program_id");

