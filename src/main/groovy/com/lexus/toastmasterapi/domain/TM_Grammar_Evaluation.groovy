package com.lexus.toastmasterapi.domain

import org.springframework.data.cassandra.core.mapping.Column
import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table

@Table
class TM_Grammar_Evaluation {

    @PrimaryKey
    private UUID id

    @Column
    private int eventNo

    @Column
    private String evaluatorName

    @Column
    private String memberName

    @Column
    private int wordOfDayCounter

    @Column
    private String report

    int getId() {
        return id
    }

    void setId(int id) {
        this.id = id
    }

    int getWordOfDayCounter() {
        return wordOfDayCounter
    }

    void setWordOfDayCounter(int wordOfDayCounter) {
        this.wordOfDayCounter = wordOfDayCounter
    }

    String getReport() {
        return report
    }

    void setReport(String report) {
        this.report = report
    }

    int getEventNo() {
        return eventNo
    }

    void setEventNo(int eventNo) {
        this.eventNo = eventNo
    }

    String getMemberName() {
        return memberName
    }

    void setMemberName(String memberName) {
        this.memberName = memberName
    }

    String getEvaluatorName() {
        return evaluatorName
    }

    void setEvaluatorName(String evaluatorName) {
        this.evaluatorName = evaluatorName
    }
}
