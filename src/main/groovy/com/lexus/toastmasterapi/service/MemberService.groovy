package com.lexus.toastmasterapi.service

import com.lexus.toastmasterapi.dao.MemberDAO
import com.lexus.toastmasterapi.domain.TS_Member
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MemberService {

    @Autowired
    MemberDAO memberDAO

    List<TS_Member> getMembers(){
        return memberDAO.findAll()
    }
}
