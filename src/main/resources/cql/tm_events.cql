create table toastmaster.tm_events
(
  id UUID,
  eventno int,
  membername varchar,
  rolename varchar,
  theme_of_day varchar,
  tm_date date,
  word_of_day varchar,
  PRIMARY KEY (id, tm_date)
)
  with comment = 'Table that holds Toastmaster session data'
    and caching = {'keys': 'ALL', 'rows_per_partition': 'NONE'}
    and compaction = {'class': 'org.apache.cassandra.db.compaction.SizeTieredCompactionStrategy'}
    and compression = {'sstable_compression': 'org.apache.cassandra.io.compress.LZ4Compressor'};


INSERT INTO tm_events (id, eventno, membername, rolename,theme_of_day, tm_date, word_of_day)
                                                                           values (uuid(), 1, 'Bharani', 'Toastmaster','Fun',toDate(now()), 'Impeccable');

INSERT INTO tm_events (id, eventno, membername, rolename,theme_of_day, tm_date, word_of_day)
values (uuid(), 1, 'Praveen', 'Speaker','Fun',toDate(now()), 'Impeccable');

INSERT INTO tm_events (id, eventno, membername, rolename,theme_of_day, tm_date, word_of_day)
values (uuid(), 1, 'Kalai', 'Speaker','Fun',toDate(now()), 'Impeccable');