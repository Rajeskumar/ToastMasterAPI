CREATE TABLE TM_Roles (
  id UUID PRIMARY KEY,
  roleName TEXT,
  roleDesc TEXT
                      );

-- Data Insertion
insert into TM_Roles(id, roleName, roleDesc) VALUES (uuid(), 'Toastmaster','Role who drives the toastmaster session');
insert into TM_Roles(id, roleName, roleDesc) VALUES (uuid(), 'Ah Counter','Role who counts the filler words');
insert into TM_Roles(id, roleName, roleDesc) VALUES (uuid(), 'Timer','Role who gets the timer report for the session');
insert into TM_Roles(id, roleName, roleDesc) VALUES (uuid(), 'Speaker','Role who does the Research Topic');
insert into TM_Roles(id, roleName, roleDesc) VALUES (uuid(), 'Topic Master','Role who drives the Topic Speak session of the toastmaster event');
insert into TM_Roles(id, roleName, roleDesc) VALUES (uuid(), 'Speaker Evaluator','Role who evaluates the Research Topic');
insert into TM_Roles(id, roleName, roleDesc) VALUES (uuid(), 'General Evaluator','Role who evaluates the toastmaster session completely');
insert into TM_Roles(id, roleName, roleDesc) VALUES (uuid(), 'Grammarian','Role who evaluates grammar report for everyone');
select * from TM_Roles;