package com.lexus.toastmasterapi.dao

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.lexus.toastmasterapi.common.DateJsonDeserializer
import com.lexus.toastmasterapi.common.DateJsonSerializer
import org.springframework.data.cassandra.core.cql.Ordering
import org.springframework.data.cassandra.core.cql.PrimaryKeyType
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn

@PrimaryKeyClass
class EventPrimaryKey implements Serializable {

    @PrimaryKeyColumn(name = "tm_date", type = PrimaryKeyType.PARTITIONED)
    @JsonSerialize(using = DateJsonSerializer)
    @JsonDeserialize(using = DateJsonDeserializer)
    private Date eventDate

    @PrimaryKeyColumn(name = "eventno", ordinal = 0, ordering = Ordering.ASCENDING)
    private int eventNo

    Date getEventDate() {
        return eventDate
    }

    void setEventDate(Date eventDate) {
        this.eventDate = eventDate
    }

    int getEventNo() {
        return eventNo
    }

    void setEventNo(int eventNo) {
        this.eventNo = eventNo
    }
}
