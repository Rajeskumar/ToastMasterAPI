create table toastmaster.tm_timer_evaluation
(
  id int primary key,
  evaluatorname varchar,
  eventno int,
  membername varchar,
  rolename varchar,
  report varchar
)
  with comment = 'Table that holds Timer evaluation data'
    and caching = {'keys': 'ALL', 'rows_per_partition': 'NONE'}
    and compaction = {'class': 'org.apache.cassandra.db.compaction.SizeTieredCompactionStrategy'}
    and compression = {'sstable_compression': 'org.apache.cassandra.io.compress.LZ4Compressor'};