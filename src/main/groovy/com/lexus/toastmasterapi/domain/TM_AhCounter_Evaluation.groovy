package com.lexus.toastmasterapi.domain

import groovy.transform.ToString
import org.springframework.data.cassandra.core.mapping.Column
import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table

@ToString(includeFields = true, includeNames = true)
@Table
class TM_AhCounter_Evaluation {

    @PrimaryKey
    private UUID id

    @Column
    private int eventNo

    @Column
    private int evaluatorName

    @Column
    private int memberName

    @Column
    private int ahCountNumber

    @Column
    private String roleName

    @Column
    private String fillerWords

    String getId() {
        return id
    }

    void setId(String id) {
        this.id = id
    }

    int getEventNo() {
        return eventNo
    }

    void setEventNo(int eventNo) {
        this.eventNo = eventNo
    }

    int getEvaluatorId() {
        return evaluatorName
    }

    void setEvaluatorId(int evaluatorId) {
        this.evaluatorName = evaluatorId
    }

    int getMemberId() {
        return memberName
    }

    void setMemberId(int memberId) {
        this.memberName = memberId
    }

    int getAhCountNumber() {
        return ahCountNumber
    }

    void setAhCountNumber(int ahCountNumber) {
        this.ahCountNumber = ahCountNumber
    }

    String getFillerWords() {
        return fillerWords
    }

    void setFillerWords(String fillerWords) {
        this.fillerWords = fillerWords
    }

    String getRoleName() {
        return roleName
    }

    void setRoleName(String roleName) {
        this.roleName = roleName
    }
}
