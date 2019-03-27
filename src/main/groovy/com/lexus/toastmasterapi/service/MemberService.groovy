package com.lexus.toastmasterapi.service

import com.lexus.toastmasterapi.dao.MemberDAO
import com.lexus.toastmasterapi.domain.TM_Member
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
@Slf4j
class MemberService {

    @Autowired
    MemberDAO memberDAO

    List<TM_Member> getMembers(){
        log.info("Fetching ToastMaster members from DB :")
        List<TM_Member> memberList = memberDAO.findAll()
        log.info("Current MemberList :"+memberList)
        log.debug("Debug Current MemberList :"+memberList)

        return memberList
    }

    TM_Member getMemberById(int memberId){
        Optional<TM_Member> member =  memberDAO.findById(memberId)
        if(member.isPresent()){
            return member.get()
        }else{
            return new TM_Member()
        }
    }
}
