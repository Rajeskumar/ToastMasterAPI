package com.lexus.toastmasterapi.dao

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
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner


class MemberDAOTest {

    static void main(String[] args){
        println("Welcome to test")

        int port = 9042


        Cluster cluster = Cluster.builder()
                .addContactPoint('localhost')
                .withPort(port).withoutMetrics()
                .build()

        Session session = cluster.connect('toastmaster')

        println('Connected')
    }
}
