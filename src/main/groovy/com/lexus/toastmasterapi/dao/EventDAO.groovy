package com.lexus.toastmasterapi.dao

import com.lexus.toastmasterapi.domain.EventPrimaryKey
import com.lexus.toastmasterapi.domain.TM_Events
import org.springframework.data.cassandra.repository.CassandraRepository
import org.springframework.stereotype.Repository

@Repository
interface EventDAO extends CassandraRepository<TM_Events, EventPrimaryKey>{

    TM_Events findByKeyEventId (final int eventId)

    TM_Events findByKeyEventDate (final Date eventDate)
}
