package com.lexus.toastmasterapi.controller

import com.lexus.toastmasterapi.service.AhCounterEvaluationService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "false")
@RestController
@RequestMapping("/evaluation")
class EvaluationController {

    @Autowired
    AhCounterEvaluationService ahCounterEvaluationService

    @RequestMapping(value = "/welcome")
    String welcome(){
        return "Welcome to ToastMaster Evaluation REST End point"
    }

    @GetMapping
    @RequestMapping("/ahCounterReport")
    public getAllAhCounterReport(){
        ahCounterEvaluationService.getAllEvaluationReport()
    }

}
