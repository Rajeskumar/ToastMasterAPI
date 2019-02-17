package com.lexus.toastmasterapi.domain

class Member {

    Member(String id, String name) {
        this.id = id
        this.name = name
    }
    String id

    String name

    String getId() {
        return id
    }

    void setId(String id) {
        this.id = id
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }
}
