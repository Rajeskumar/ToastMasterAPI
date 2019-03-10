package com.lexus.toastmasterapi.domain

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.lexus.toastmasterapi.common.DateJsonDeserializer
import com.lexus.toastmasterapi.common.DateJsonSerializer
import groovy.transform.ToString
import org.springframework.data.cassandra.core.mapping.Column
import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table


@ToString(includeFields = true, includeNames = true)
@Table
class TM_Events {

    @PrimaryKey
    @JsonIgnore
    private UUID id

    @Column
    private int eventNo

    @Column
    @JsonSerialize(using = DateJsonSerializer)
    @JsonDeserialize(using = DateJsonDeserializer)
    private Date tm_date

    @Column
    private String word_of_day

    @Column
    private String theme_of_day

    @Column
    private String memberName

    @Column
    private String roleName

    Date getTm_date() {
        return tm_date
    }

    void setTm_date(Date tm_date) {
        this.tm_date = tm_date
    }

    String getWord_of_day() {
        return word_of_day
    }

    void setWord_of_day(String word_of_day) {
        this.word_of_day = word_of_day
    }

    String getTheme_of_day() {
        return theme_of_day
    }

    void setTheme_of_day(String theme_of_day) {
        this.theme_of_day = theme_of_day
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

    String getRoleName() {
        return roleName
    }

    void setRoleName(String roleName) {
        this.roleName = roleName
    }

    UUID getId() {
        return id
    }

    void setId(UUID id) {
        this.id = id
    }
}
