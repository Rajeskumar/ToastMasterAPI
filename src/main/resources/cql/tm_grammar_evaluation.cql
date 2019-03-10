create table toastmaster.tm_grammar_evaluation
(
  id int primary key,
  evaluatorname varchar,
  eventno int,
  membername varchar,
  wordOfDayCounter varchar,
  report varchar
)
  with comment = 'Table that holds Grammarian evaluation'
    and caching = {'keys': 'ALL', 'rows_per_partition': 'NONE'}
    and compaction = {'class': 'org.apache.cassandra.db.compaction.SizeTieredCompactionStrategy'}
    and compression = {'sstable_compression': 'org.apache.cassandra.io.compress.LZ4Compressor'};
