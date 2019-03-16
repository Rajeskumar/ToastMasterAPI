package com.lexus.toastmasterapi.service

import com.lexus.toastmasterapi.dao.EvaluationDAO
import com.lexus.toastmasterapi.domain.TM_Evaluation
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
@Slf4j
class EvaluationService {

    @Autowired
    EvaluationDAO evaluationDAO

    List<TM_Evaluation> getAllEvaluationReport(){
        return evaluationDAO.findAll()
    }

    List<TM_Evaluation> getEvaluationReportByName(String memberName){
        return evaluationDAO.findByKeyMemberName(memberName)
    }

    List<TM_Evaluation> getEvaluationReportByEventId(int eventId){
        return evaluationDAO.findByKeyEventId(eventId)
    }

}
