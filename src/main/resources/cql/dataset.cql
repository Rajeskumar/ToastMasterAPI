use toastmaster;

create table TS_Member(
  id int PRIMARY KEY,
  name text,
  email text,
  mobile varint
)

INSERT INTO TS_Member(id,name,email,mobile)
VALUES (200001,'Rajeshkumar Ganesan','rajeskumarcse@gmail.com',6516055688);
INSERT INTO TS_Member(id,name,email,mobile)
VALUES (200002,'Praveenkumar Saravanan','be.praveen@gmail.com',6518085235);

select * from TS_Member