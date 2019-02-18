package com.lexus.toastmasterapi.dao

import com.lexus.toastmasterapi.domain.TS_Member
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import spock.lang.Specification

@RunWith(SpringRunner)
@SpringBootTest
class MemberDAOTest extends  Specification{

    @Autowired
    MemberDAO memberDAO

    @Test
    void testGetMembers(){

        List<TS_Member> allMembers = memberDAO.findAll()

        Assert.assertEquals(3, allMembers.size())

    }
}
