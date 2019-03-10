package com.lexus.toastmasterapi.dao

import com.lexus.toastmasterapi.domain.TM_Events
import org.springframework.data.annotation.Id
import org.springframework.data.cassandra.repository.CassandraRepository
import org.springframework.stereotype.Repository

@Repository
interface EventDAO extends CassandraRepository<TM_Events, Id>{
}
