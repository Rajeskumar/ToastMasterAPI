package com.lexus.toastmasterapi.domain

import org.springframework.data.cassandra.core.mapping.Column
import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table

@Table
class TM_Speaker_Evaluation {

    @PrimaryKey
    private UUID id

    @Column
    private int eventNo

    @Column
    private String evaluatorName

    @Column
    private String speakerName

    @Column
    private String topicName

    @Column
    private String report

    int getId() {
        return id
    }

    void setId(int id) {
        this.id = id
    }

    int getEventNo() {
        return eventNo
    }

    void setEventNo(int eventNo) {
        this.eventNo = eventNo
    }

    String getTopicName() {
        return topicName
    }

    void setTopicName(String topicName) {
        this.topicName = topicName
    }

    String getReport() {
        return report
    }

    void setReport(String report) {
        this.report = report
    }

    String getEvaluatorName() {
        return evaluatorName
    }

    void setEvaluatorName(String evaluatorName) {
        this.evaluatorName = evaluatorName
    }

    String getSpeakerName() {
        return speakerName
    }

    void setSpeakerName(String speakerName) {
        this.speakerName = speakerName
    }
}
