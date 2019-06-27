package com.lexus.toastmasterapi.dao

import com.lexus.toastmasterapi.domain.TM_Member
import groovy.util.logging.Slf4j
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import spock.lang.Specification

@RunWith(SpringRunner)
@SpringBootTest
class MemberDAOTest {

    @Autowired
    MemberDAO memberDAO

    @Test
    void testGetMembers(){

        List<TM_Member> allMembers = memberDAO.findAll()

        Assert.assertEquals(6, allMembers.size())

    }
}
