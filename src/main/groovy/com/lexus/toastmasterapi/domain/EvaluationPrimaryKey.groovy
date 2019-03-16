package com.lexus.toastmasterapi.domain

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.lexus.toastmasterapi.common.DateJsonDeserializer
import com.lexus.toastmasterapi.common.DateJsonSerializer
import org.springframework.data.cassandra.core.cql.Ordering
import org.springframework.data.cassandra.core.cql.PrimaryKeyType
import org.springframework.data.cassandra.core.mapping.Column
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn

@PrimaryKeyClass
class EvaluationPrimaryKey implements Serializable {

    @PrimaryKeyColumn(name = "id", type = PrimaryKeyType.PARTITIONED)
    private UUID id

    @PrimaryKeyColumn(name = "eventId", ordinal = 0, ordering = Ordering.ASCENDING)
    private int eventId

    @Column
    private String memberName

    int getEventId() {
        return eventId
    }

    void setEventId(int eventId) {
        this.eventId = eventId
    }

    UUID getId() {
        return id
    }

    void setId(UUID id) {
        this.id = id
    }

    String getMemberName() {
        return memberName
    }

    void setMemberName(String memberName) {
        this.memberName = memberName
    }
}
