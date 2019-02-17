package com.lexus.toastmasterapi.dao

import com.lexus.toastmasterapi.domain.Member
import org.springframework.stereotype.Repository

@Repository
class MemberDAO {

    List<Member> getMembers(){
        List<Member> result = new ArrayList<Member>()

        Member mb1 = new Member("1", "Rajeshkumar")
        Member mb2 = new Member("2", "Praveenkumar")

        result.add(mb1)
        result.add(mb2)

        return result
    }
}
