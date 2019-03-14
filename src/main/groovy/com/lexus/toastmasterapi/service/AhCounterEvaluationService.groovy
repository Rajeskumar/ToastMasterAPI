package com.lexus.toastmasterapi.service

import com.lexus.toastmasterapi.dao.AhCounterDAO
import com.lexus.toastmasterapi.domain.TM_AhCounter_Evaluation
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
@Slf4j
class AhCounterEvaluationService implements EvaluationService{

    @Autowired
    AhCounterDAO ahCounterDAO

    @Override
    List<TM_AhCounter_Evaluation> getAllEvaluationReport() {
        return ahCounterDAO.findAll()
    }

    @Override
    List<TM_AhCounter_Evaluation> getEvaluationReportByName() {
        return null
    }

    @Override
    List<TM_AhCounter_Evaluation> getEvaluationReportByEventNo() {
        return null
    }
}
