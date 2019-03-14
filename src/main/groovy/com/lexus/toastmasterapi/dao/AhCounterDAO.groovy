package com.lexus.toastmasterapi.dao

import com.lexus.toastmasterapi.domain.TM_AhCounter_Evaluation
import org.springframework.data.annotation.Id
import org.springframework.data.cassandra.repository.CassandraRepository
import org.springframework.stereotype.Repository

@Repository
interface AhCounterDAO extends CassandraRepository<TM_AhCounter_Evaluation, Id>{
}
