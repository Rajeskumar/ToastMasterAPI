package com.lexus.toastmasterapi.service

import com.lexus.toastmasterapi.dao.MemberDAO
import com.lexus.toastmasterapi.domain.Member
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MemberService {

    @Autowired
    MemberDAO memberDAO

    List<Member> getMembers(){
        return memberDAO.getMembers()
    }
}
