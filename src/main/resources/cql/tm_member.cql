use toastmaster;

create table TM_Member(
  id int PRIMARY KEY,
  name text,
  email text,
  mobile varint
)

INSERT INTO TM_Member(id,name,email,mobile)
VALUES (200001,'Rajeshkumar Ganesan','rajeskumarcse@gmail.com',6516055688);
INSERT INTO TM_Member(id,name,email,mobile)
VALUES (200002,'Praveenkumar Saravanan','be.praveen@gmail.com',6518085235);
INSERT INTO TM_Member(id,name,email,mobile)
VALUES (200003,'Parvathi Tejaswini','rptejaswini@gmail.com',6122958817);

select * from TM_Member;


SELECT * FROM tm_member WHERE id=200001;

update TM_Member set shortname='Rajesh' where id=200001;
update TM_Member set shortname='Praveen' where id=200002;
update TM_Member set shortname='Parvathi' where id=200003;
