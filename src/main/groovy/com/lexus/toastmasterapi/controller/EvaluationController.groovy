package com.lexus.toastmasterapi.controller

import com.lexus.toastmasterapi.service.EvaluationService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "false")
@RestController
@RequestMapping("/evaluation")
@Api(value = "/evaluation", description = "Rest End point for all evaluation report for the toastmaster")
class EvaluationController {

    @Autowired
    EvaluationService evaluationService

    @RequestMapping(value = "/welcome")
    @ApiOperation(hidden = true, value = "Welcome Message for evaluation toastmaster api")
    String welcome(){
        return "Welcome to ToastMaster Evaluation REST End point"
    }

    @GetMapping("/allReport")
    @ApiOperation(value = "Get All evaluation report for the toastmaster event",
            notes = """""")
    public getAllEvaluationReport(){
        evaluationService.getAllEvaluationReport()
    }

    @GetMapping(value = "/reportById/{eventId}")
    @ResponseBody
    @ApiOperation(value = "Get evaluation report by event id.",
            notes = """enter a event id to search for evaluation report for that event. ex: 1|2|3""")
    public getEvaluationReportById(@PathVariable("eventId") int id ){
        return evaluationService.getEvaluationReportByEventId(id)
    }

    @GetMapping(value = "/reportByName/{memberName}")
    @ResponseBody
    @ApiOperation(value = "Get evaluation report by member name",
            notes = """enter a member name to search for evaluation report for his/her event. ex: Rajesh|Praveen""")
    public getEvaluationReportByMemberName(@PathVariable("memberName") String memberName ){
        return evaluationService.getEvaluationReportByName(memberName)
    }
}
