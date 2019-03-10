create table toastmaster.tm_speaker_evaluation
(
  id int primary key,
  evaluatorname varchar,
  eventno int,
  speakername varchar,
  topicname varchar,
  report varchar
)
  with comment = 'Table that holds Speaker evaluation data'
    and caching = {'keys': 'ALL', 'rows_per_partition': 'NONE'}
    and compaction = {'class': 'org.apache.cassandra.db.compaction.SizeTieredCompactionStrategy'}
    and compression = {'sstable_compression': 'org.apache.cassandra.io.compress.LZ4Compressor'};