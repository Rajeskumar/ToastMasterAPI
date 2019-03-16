
use toastmaster;

create table toastmaster.tm_evaluation
(
  id uuid,
  eventId int,
  evaluatorname varchar,
  memberName varchar,
  count int,
  report varchar,
  evaluatorRole varchar,
  memberRole varchar,
  PRIMARY KEY ( id,eventId )
)
  with comment = 'Table that holds all evaluation report'
    and caching = {'keys': 'ALL', 'rows_per_partition': 'NONE'}
    and compaction = {'class': 'org.apache.cassandra.db.compaction.SizeTieredCompactionStrategy'}
    and compression = {'sstable_compression': 'org.apache.cassandra.io.compress.LZ4Compressor'};



Create index eval_eventIdindex on toastmaster.tm_evaluation(eventId);
Create index eval_memberNameIndex on toastmaster.tm_evaluation(memberName);


select * from tm_evaluation where eventId=1;

select * from tm_evaluation where memberName = 'Praveen';


INSERT INTO tm_evaluation (id, eventId, evaluatorname,memberName, count, report, evaluatorRole, memberRole)
values (uuid(), 1, 'Parvathi', 'Praveen',0,'Should use tenses properly. ','Grammarian','Speaker');

INSERT INTO tm_evaluation (id, eventId, evaluatorname,memberName, count, report, evaluatorRole, memberRole)
values (uuid(), 1, 'Parvathi', 'Kalai',0,'Should use tenses properly. ','Grammarian','Speaker');

INSERT INTO tm_evaluation (id, eventId, evaluatorname,memberName, count, report, evaluatorRole, memberRole)
values (uuid(), 1, 'Parvathi', 'Jagan',0,'Should use tenses properly. ','Grammarian','Topic Speaker');

INSERT INTO tm_evaluation (id, eventId, evaluatorname,memberName, count, report, evaluatorRole, memberRole)
values (uuid(), 1, 'Rajesh', 'Praveen',12,'ah, like, just, hmmm','AhCounter','Speaker');

INSERT INTO tm_evaluation (id, eventId, evaluatorname,memberName, count, report, evaluatorRole, memberRole)
values (uuid(), 1, 'Rajesh', 'Kalai',10,'hmm, ah, stretching words','AhCounter','Speaker');

INSERT INTO tm_evaluation (id, eventId, evaluatorname,memberName, count, report, evaluatorRole, memberRole)
values (uuid(), 1, 'Jagan', 'Kalai',0,'Good choice of topic. Have good starting, ending.  ','Speaker Evaluator','Speaker');
