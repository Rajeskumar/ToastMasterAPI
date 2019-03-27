package com.lexus.toastmasterapi.domain

import groovy.transform.ToString
import org.springframework.data.cassandra.core.mapping.Column
import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table

@ToString(includeNames = true, includeFields = true)
@Table
class TM_Roles {

    @PrimaryKey
    private UUID id

    @Column
    private String roleName

    @Column
    private String roleDesc

    int getId() {
        return id
    }

    void setId(int id) {
        this.id = id
    }

    String getRoleName() {
        return roleName
    }

    void setRoleName(String roleName) {
        this.roleName = roleName
    }

    String getRoleDesc() {
        return roleDesc
    }

    void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc
    }
}
