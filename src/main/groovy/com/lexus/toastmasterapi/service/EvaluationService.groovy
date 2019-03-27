package com.lexus.toastmasterapi.service

import com.fasterxml.jackson.databind.ObjectMapper
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

    @Autowired
    ObjectMapper mapper

    List<TM_Evaluation> getAllEvaluationReport(){
        return evaluationDAO.findAll()
    }

    List<TM_Evaluation> getEvaluationReportByName(String memberName){
        return evaluationDAO.findByKeyMemberName(memberName)
    }

    List<TM_Evaluation> getEvaluationReportByEventId(int eventId){
        return evaluationDAO.findByKeyEventId(eventId)
    }

    List<TM_Evaluation> getEvaluationReportByEvaluatorRole(String evaluatorRole){
        return evaluationDAO.findByKeyEvaluatorRole(evaluatorRole)
    }

    boolean insertEvaluationReport (String jsonMessage){

        TM_Evaluation evaluationData = mapper.readValue(jsonMessage, TM_Evaluation.class)

        evaluationData.key.id = UUID.randomUUID()

        TM_Evaluation insertedReport = evaluationDAO.insert(evaluationData)

        if(insertedReport){
            return true
        }else{
            return false
        }
    }

    boolean updateEvaluationReport (String jsonMessage){

        TM_Evaluation evaluationData = mapper.readValue(jsonMessage, TM_Evaluation.class)

        evaluationData.key.id = UUID.randomUUID()

        TM_Evaluation updatedReport = evaluationDAO.save(evaluationData)

        if(updatedReport){
            return true
        }else{
            return false
        }
    }
}
