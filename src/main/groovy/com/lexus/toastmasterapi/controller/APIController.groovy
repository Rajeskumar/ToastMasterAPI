package com.lexus.toastmasterapi.controller

import com.lexus.toastmasterapi.domain.Member
import com.lexus.toastmasterapi.service.MemberService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class APIController {

    @Autowired
    MemberService memberService

    @RequestMapping(value = "/welcome")
    String welcome(){
        return "Welcome to ToastMaster API Applications"
    }

    @GetMapping(value = "/getMembers")
    @ResponseBody
    Member getAllMember(){
        return new Member('1','Rajeshkumar')
    }
}
