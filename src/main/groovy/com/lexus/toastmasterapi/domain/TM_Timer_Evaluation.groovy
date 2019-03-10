package com.lexus.toastmasterapi.domain

import org.springframework.data.cassandra.core.mapping.Column
import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table

@Table
class TM_Timer_Evaluation {

    @PrimaryKey
    private UUID id

    @Column
    private int eventNo

    @Column
    private String evaluatorName

    @Column
    private String memberName

    @Column
    private String roleName

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

    String getEvaluatorName() {
        return evaluatorName
    }

    void setEvaluatorName(String evaluatorName) {
        this.evaluatorName = evaluatorName
    }

    String getMemberName() {
        return memberName
    }

    void setMemberName(String memberName) {
        this.memberName = memberName
    }

    String getRoleName() {
        return roleName
    }

    void setRoleName(String roleName) {
        this.roleName = roleName
    }

    String getReport() {
        return report
    }

    void setReport(String report) {
        this.report = report
    }
}
