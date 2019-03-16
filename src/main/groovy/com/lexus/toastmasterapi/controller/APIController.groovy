package com.lexus.toastmasterapi.controller

import com.lexus.toastmasterapi.domain.TM_Events
import com.lexus.toastmasterapi.domain.TM_Member
import com.lexus.toastmasterapi.service.EventService
import com.lexus.toastmasterapi.service.MemberService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import io.swagger.annotations.ApiResponse
import io.swagger.annotations.ApiResponses
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
@Api(value = "/toastMaster", description = "Rest End point for Toastmaster Event and Member Details")
class APIController {

    @Autowired
    MemberService memberService

    @Autowired
    EventService eventService

    @RequestMapping(value = "/welcome")
    @ApiOperation(hidden = true, value = "Welcome Message for toastmaster api")
    String welcome(){
        return "Welcome to ToastMaster API Application"
    }

    @ApiResponses(value = [
            @ApiResponse(code = 200, message = 'OK'),
            @ApiResponse(code = 400, message = 'Bad request'),
            @ApiResponse(code = 500, message = 'Internal Server Error')])
    @ApiOperation(value = "Get all Members Registered with Toastmaster session",
    notes = "")
    @GetMapping(value = "/getMembers")
    @ResponseBody
    List<TM_Member> getAllMember(){
        return memberService.getMembers()
    }

    @ApiResponses(value = [
            @ApiResponse(code = 200, message = 'OK'),
            @ApiResponse(code = 400, message = 'Bad request'),
            @ApiResponse(code = 500, message = 'Internal Server Error')])
    @ApiOperation(value = "Get Members Registered with Toastmaster session by member Id",
            notes = """enter a member id to search for member. ex: 2000001""")
    @GetMapping(value = "/getMemberById/{memberId}")
    @ResponseBody
    TM_Member getMemberProfile(@PathVariable("memberId") int id ){
        return memberService.getMemberById(id)
    }


    @ApiResponses(value = [
            @ApiResponse(code = 200, message = 'OK'),
            @ApiResponse(code = 400, message = 'Bad request'),
            @ApiResponse(code = 500, message = 'Internal Server Error')])
    @ApiOperation(value = "Get all Event details",
            notes = """Get all the events details which happened and scheduled for future""")
    @GetMapping(value = "/getEvents")
    @ResponseBody
    List<TM_Events> getToastmasterEvents(){
        return eventService.getEvents()
    }

    @ApiResponses(value = [
            @ApiResponse(code = 200, message = 'OK'),
            @ApiResponse(code = 400, message = 'Bad request'),
            @ApiResponse(code = 500, message = 'Internal Server Error')])
    @ApiOperation(value = "Create next Toastmaster event",
            notes = """
            {
               "key": {
                  "eventDate": "2019-03-12",
                  "eventNo": 1
               },
               "word_of_day": "Impeccable",
               "theme_of_day": "Fun",
               "toastmaster": "Bharani",
               "speaker_1": "Praveen",
               "speaker_2": "Kalai",
               "spkr_evaluator_1": "Parvathi",
               "spkr_evaluator_2": "Jagan",
               "topic_master": "Rajesh",
               "timer_report": "Jagan",
               "ahCounter_report": "Rajesh",
               "gnrl_evaluator": "Bharani",
               "grammarian": "Parvathi"
            }""")
    @PostMapping(value = "/createEvent")
    @ResponseBody
    ResponseEntity createToastmasterEvent(@ApiParam(name = "createToastmasterEvent", value = "Create Toastmaster Event", required = true) String eventData){

        boolean isSuccess = eventService.createEvents(eventData)

        if(isSuccess)
            return new ResponseEntity<String>("New Event Created", HttpStatus.CREATED)
        else
            return new ResponseEntity<String>("Event Couldn't be created", HttpStatus.EXPECTATION_FAILED)
    }

    @ApiResponses(value = [
            @ApiResponse(code = 200, message = 'OK'),
            @ApiResponse(code = 400, message = 'Bad request'),
            @ApiResponse(code = 500, message = 'Internal Server Error')])
    @ApiOperation(value = "Get Event by event Id",
            notes = """enter a event id to search for event. ex: 1|2|3""")
    @GetMapping(value = "/getEventByNo/{eventId}")
    @ResponseBody
    TM_Events getEventbyEventId(@PathVariable("eventId") int eventId){
        return eventService.getEventbyEventId(eventId)
    }

    @ApiResponses(value = [
            @ApiResponse(code = 200, message = 'OK'),
            @ApiResponse(code = 400, message = 'Bad request'),
            @ApiResponse(code = 500, message = 'Internal Server Error')])
    @ApiOperation(value = "Get Event by event date",
            notes = """enter a event date to search for event. ex: 2019-03-12""")
    @GetMapping(value = "/getEventByDate/{eventDate}")
    @ResponseBody
    TM_Events getEventbyEventDate(@PathVariable("eventDate") String eventDate){
        return eventService.getEventbyEventDate(eventDate)
    }
}
