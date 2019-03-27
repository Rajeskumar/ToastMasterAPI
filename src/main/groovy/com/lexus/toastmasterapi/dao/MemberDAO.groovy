package com.lexus.toastmasterapi.dao

import com.lexus.toastmasterapi.domain.TM_Member
import org.springframework.data.annotation.Id
import org.springframework.data.cassandra.repository.CassandraRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberDAO extends CassandraRepository<TM_Member, Id>{

}
