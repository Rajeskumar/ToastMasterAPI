package com.lexus.toastmasterapi.config

import com.datastax.driver.core.Cluster
import com.datastax.driver.core.Session
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories

@Configuration
@EnableCassandraRepositories
class CassandraConfig{

    @Value('${cassandra.keyspace}')
    String keyspace

    @Value('${cassandra.port}')
    int port

    @Bean
    Cluster cluster() {

        return Cluster.builder()
                .addContactPoint('localhost')
                .withPort(port).withoutMetrics()
                .build()
    }

    @Bean
    Session session(Cluster cluster) throws Exception {

        cluster.connect(keyspace)

    }
}
