package com.lexus.toastmasterapi.domain

import org.springframework.data.cassandra.core.mapping.Column
import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table

@Table
class TM_Evaluation {

    @PrimaryKey
    private EvaluationPrimaryKey key

    @Column
    private String evaluatorName

    @Column
    private int count

    @Column
    private String report

    @Column
    private String memberRole

    EvaluationPrimaryKey getKey() {
        return key
    }

    void setKey(EvaluationPrimaryKey key) {
        this.key = key
    }

    String getEvaluatorName() {
        return evaluatorName
    }

    void setEvaluatorName(String evaluatorName) {
        this.evaluatorName = evaluatorName
    }

    int getCount() {
        return count
    }

    void setCount(int count) {
        this.count = count
    }

    String getReport() {
        return report
    }

    void setReport(String report) {
        this.report = report
    }

    String getMemberRole() {
        return memberRole
    }

    void setMemberRole(String memberRole) {
        this.memberRole = memberRole
    }
}
