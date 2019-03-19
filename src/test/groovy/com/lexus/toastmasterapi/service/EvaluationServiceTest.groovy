package com.lexus.toastmasterapi.service

import com.lexus.toastmasterapi.domain.TM_Evaluation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification
import spock.lang.Unroll

@SpringBootTest
class EvaluationServiceTest extends Specification {

    @Autowired
    EvaluationService evaluationService

    def "GetAllEvaluationReport"() {

        List<TM_Evaluation> evaluationReport

        when:
        evaluationReport = evaluationService.getAllEvaluationReport()

        then:
        evaluationReport !=null
        evaluationReport.size()>0
    }

    @Unroll('#testName')
    def "GetEvaluationReportByName"() {

        List<TM_Evaluation> evaluationReport

        when:
        evaluationReport = evaluationService.getEvaluationReportByName(memberName)

        then:
        !evaluationReport?.any{TM_Evaluation evaluation -> evaluation.key.memberName != memberName}

        where:
        testName                   | memberName
        'Query Report for Praveen' | 'Praveen'
        'Query Report for Kalai'   | 'Kalai'
    }

    @Unroll('#testName')
    def "GetEvaluationReportByEventId"() {
        List<TM_Evaluation> evaluationReport

        when:
        evaluationReport = evaluationService.getEvaluationReportByEventId(eventId)

        then:
        !evaluationReport?.any{TM_Evaluation evaluation -> evaluation.key.eventId != eventId}

        where:
        testName                   | eventId
        'Query Report for event 1' | 1
        'Query Report for event 2' | 2
    }

    def "Verify the evaluation report insert to backend"() {

        String evaluationJson = "{\n" +
                "  \"key\": {\n" +
                "    \"memberName\": \"Rajesh\",\n" +
                "    \"eventId\": 1\n" +
                "  },\n" +
                "  \"evaluatorName\": \"Bharani\",\n" +
                "  \"count\": \"0\",\n" +
                "  \"report\": \"Give Pause between sentence. Speak Slowly and Clearly. Pronounce words clearly.\",\n" +
                "  \"evaluatorRole\": \"Toastmaster\",\n" +
                "  \"memberRole\": \"Topic Speaker\"\n" +
                "}"

        when:
        boolean isSuccess = evaluationService.insertEvaluationReport(evaluationJson)

        then:
        isSuccess
    }
}