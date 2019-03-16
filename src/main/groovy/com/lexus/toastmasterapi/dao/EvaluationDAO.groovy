package com.lexus.toastmasterapi.dao

import com.lexus.toastmasterapi.domain.EvaluationPrimaryKey
import com.lexus.toastmasterapi.domain.TM_Evaluation
import org.springframework.data.cassandra.repository.CassandraRepository
import org.springframework.stereotype.Repository

@Repository
interface EvaluationDAO extends CassandraRepository<TM_Evaluation, EvaluationPrimaryKey>{

    List<TM_Evaluation> findByKeyEventId (int eventId)

    List<TM_Evaluation> findByKeyMemberName (String memberName)
}
