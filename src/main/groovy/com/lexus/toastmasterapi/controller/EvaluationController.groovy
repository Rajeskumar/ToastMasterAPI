package com.lexus.toastmasterapi.controller

import com.lexus.toastmasterapi.service.EvaluationService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiResponse
import io.swagger.annotations.ApiResponses
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
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

    @ApiResponses(value = [
            @ApiResponse(code = 200, message = 'OK'),
            @ApiResponse(code = 400, message = 'Bad request'),
            @ApiResponse(code = 500, message = 'Internal Server Error')])
    @ApiOperation(value = "Add Evaluation Report into the application",
            notes = """
            {
               "key": {
                  "memberName": "Rajesh|Praveen|Kalai|Parvathi|Jagan|Bharani",
                  "eventId": 1
               },
               "evaluatorName": "Rajesh|Praveen|Kalai|Parvathi|Jagan|Bharani",
               "count": "1|2|... | 0",
               "report": " Detailed Report",
               "evaluatorRole": "Toastmaster|AhCounter|Timer|Grammarian|Evaluator|..",
               "memberRole": "Toastmaster|AhCounter|Timer|Grammarian|Evaluator|.."
            }""")
    @PostMapping(value = "/insertEvaluationReport")
    @ResponseBody
    ResponseEntity insertEvaluationReport(@RequestBody String evaluationRequest){

        boolean isSuccess = evaluationService.insertEvaluationReport(evaluationRequest)

        if(isSuccess)
            return new ResponseEntity<String>("New Event Created", HttpStatus.CREATED)
        else
            return new ResponseEntity<String>("Event Couldn't be created", HttpStatus.EXPECTATION_FAILED)
    }

    @ApiResponses(value = [
            @ApiResponse(code = 200, message = 'OK'),
            @ApiResponse(code = 400, message = 'Bad request'),
            @ApiResponse(code = 500, message = 'Internal Server Error')])
    @ApiOperation(value = "Update Evaluation Report into the application",
            notes = """
            {
               "key": {
                  "memberName": "Rajesh|Praveen|Kalai|Parvathi|Jagan|Bharani",
                  "eventId": 1
               },
               "evaluatorName": "Rajesh|Praveen|Kalai|Parvathi|Jagan|Bharani",
               "count": "1|2|... | 0",
               "report": " Detailed Report",
               "evaluatorRole": "Toastmaster|AhCounter|Timer|Grammarian|Evaluator|..",
               "memberRole": "Toastmaster|AhCounter|Timer|Grammarian|Evaluator|.."
            }""")
    @PostMapping(value = "/updateEvaluationReport")
    @ResponseBody
    ResponseEntity updateEvaluationReport(@RequestBody String evaluationRequest){

        boolean isSuccess = evaluationService.updateEvaluationReport(evaluationRequest)

        if(isSuccess)
            return new ResponseEntity<String>("Event Updated", HttpStatus.OK)
        else
            return new ResponseEntity<String>("Event Couldn't be Updated", HttpStatus.EXPECTATION_FAILED)
    }

    @GetMapping(value = "/reportByEvaluatorRole/{evaluatorRole}")
    @ResponseBody
    @ApiOperation(value = "Get evaluation report by evaluator Role",
            notes = """enter a evaluator Role to search for evaluation report for his/her event. ex: AhCounter|Timer""")
    public getEvaluationReportByEvaluatorRole(@PathVariable("evaluatorRole") String evaluatorRole ){
        return evaluationService.getEvaluationReportByEvaluatorRole(evaluatorRole)
    }
}
