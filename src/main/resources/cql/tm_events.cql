create table toastmaster.tm_events
(
  eventId int,
  toastmaster varchar,
  speaker_1 varchar,
  speaker_2 varchar,
  spkr_evaluator_1 varchar,
  spkr_evaluator_2 varchar,
  topic_master varchar,
  timer_report varchar,
  ahCounter_report varchar,
  gnrl_evaluator varchar,
  grammarian varchar,
  theme_of_day varchar,
  tm_date timestamp,
  word_of_day varchar,
  PRIMARY KEY  (tm_date,eventId)
)
  with clustering order by (eventId ASC)
    and comment = 'Table that holds Toastmaster session data'
    and caching = {'keys': 'ALL', 'rows_per_partition': 'NONE'}
    and compaction = {'class': 'org.apache.cassandra.db.compaction.SizeTieredCompactionStrategy'}
    and compression = {'sstable_compression': 'org.apache.cassandra.io.compress.LZ4Compressor'};


Create index eventIdIndex on toastmaster.tm_events(eventId);


INSERT INTO tm_events (id, eventno, membername, rolename,theme_of_day, tm_date, word_of_day)
                                                                           values (uuid(), 1, 'Bharani', 'Toastmaster','Fun',toDate(now()), 'Impeccable');

INSERT INTO tm_events (id, eventno, membername, rolename,theme_of_day, tm_date, word_of_day)
values (uuid(), 1, 'Praveen', 'Speaker','Fun',toDate(now()), 'Impeccable');

INSERT INTO tm_events (id, eventno, membername, rolename,theme_of_day, tm_date, word_of_day)
values (uuid(), 1, 'Kalai', 'Speaker','Fun',toDate(now()), 'Impeccable');