package com.lexus.toastmasterapi.controller

import com.lexus.toastmasterapi.domain.TM_Events
import com.lexus.toastmasterapi.domain.TM_Member
import com.lexus.toastmasterapi.service.EventService
import com.lexus.toastmasterapi.service.MemberService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

import java.nio.file.Path

@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "false")
@RestController
@RequestMapping("/toastMaster")
class APIController {

    @Autowired
    MemberService memberService

    @Autowired
    EventService eventService

    @RequestMapping(value = "/welcome")
    String welcome(){
        return "Welcome to ToastMaster API Application"
    }

    @GetMapping(value = "/getMembers")
    @ResponseBody
    List<TM_Member> getAllMember(){
        return memberService.getMembers()
    }

    @GetMapping(value = "/getMemberById/{memberId}")
    @ResponseBody
    TM_Member getMemberProfile(@PathVariable("memberId") int id ){
        return memberService.getMemberById(id)
    }


    @GetMapping(value = "/getEvents")
    @ResponseBody
    List<TM_Events> getToastmasterEvents(){
        return eventService.getEvents()
    }

    @PostMapping(value = "/createEvent")
    ResponseEntity createToastmasterEvent(String eventData){

        boolean isSuccess = eventService.createEvents(eventData)

        if(isSuccess)
            return new ResponseEntity<String>("New Event Created", HttpStatus.CREATED)
        else
            return new ResponseEntity<String>("Event Couldn't be created", HttpStatus.EXPECTATION_FAILED)
    }

    @GetMapping(value = "/getEventByNo/{eventNo}")
    @ResponseBody
    TM_Events getEventbyEventNo(@PathVariable("eventNo") int eventNo){
        return eventService.getEventbyEventNo(eventNo)
    }

    @GetMapping(value = "/getEventByDate/{eventDate}")
    @ResponseBody
    TM_Events getEventbyEventDate(@PathVariable("eventDate") String eventDate){
        return eventService.getEventbyEventDate(eventDate)
    }
}
