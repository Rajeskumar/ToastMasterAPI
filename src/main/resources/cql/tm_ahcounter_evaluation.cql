
create table toastmaster.tm_ahcounter_evaluation
(
  id int primary key,
  ahcountnumber bigint,
  evaluatorname varchar,
  eventno int,
  fillerwords varchar,
  membername varchar,
  rolename varchar
)
  with comment = 'Table that holds AhCounter evaluation'
    and caching = {'keys': 'ALL', 'rows_per_partition': 'NONE'}
    and compaction = {'class': 'org.apache.cassandra.db.compaction.SizeTieredCompactionStrategy'}
    and compression = {'sstable_compression': 'org.apache.cassandra.io.compress.LZ4Compressor'};