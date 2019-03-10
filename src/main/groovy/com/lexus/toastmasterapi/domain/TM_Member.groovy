package com.lexus.toastmasterapi.domain

import groovy.transform.ToString
import org.springframework.data.cassandra.core.mapping.Column
import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table

@ToString(includeNames = true, includeFields = true)
@Table
class TM_Member {

    TM_Member(){

    }

    TM_Member(int id, String name, String email, long mobile, String shortName) {
        this.id = id
        this.name = name
        this.email = email
        this.mobile = mobile
        this.shortName = shortName
    }

    @PrimaryKey
    int id

    @Column
    String name

    @Column
    String email

    @Column
    long mobile

    @Column
    String shortName

    String getEmail() {
        return email
    }

    void setEmail(String email) {
        this.email = email
    }

    long getMobile() {
        return mobile
    }

    void setMobile(long mobile) {
        this.mobile = mobile
    }

    int getId() {
        return id
    }

    void setId(int id) {
        this.id = id
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    String getShortName() {
        return shortName
    }

    void setShortName(String shortName) {
        this.shortName = shortName
    }
}
