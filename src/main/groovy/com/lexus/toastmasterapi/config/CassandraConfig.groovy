package com.lexus.toastmasterapi.config

import com.datastax.driver.core.Cluster
import com.datastax.driver.core.ConsistencyLevel
import com.datastax.driver.core.QueryOptions
import com.datastax.driver.core.Session
import com.datastax.driver.core.SocketOptions
import com.datastax.driver.core.policies.ConstantReconnectionPolicy
import com.datastax.driver.core.policies.DCAwareRoundRobinPolicy
import com.datastax.driver.core.policies.DefaultRetryPolicy
import com.datastax.driver.core.policies.LoggingRetryPolicy
import com.datastax.driver.core.policies.TokenAwarePolicy
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class CassandraConfig {

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
