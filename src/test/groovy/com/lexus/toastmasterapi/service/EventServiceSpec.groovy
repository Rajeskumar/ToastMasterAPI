package com.lexus.toastmasterapi.service

import com.lexus.toastmasterapi.dao.EventDAO
import com.lexus.toastmasterapi.domain.TM_Events
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class EventServiceSpec extends Specification {
    @Autowired
    EventService eventService

    @Autowired
    EventDAO eventDAO

    void setup() {
    }

    void cleanup() {
    }

    def "GetEvents"() {

        when:
        List<TM_Events> allEvents = eventService.getEvents()

        then:
        allEvents
        allEvents.size()>0

    }

    def "CreateEvents"() {
    }

    def "UpdateEvents"() {
    }

    def "GetEventbyEventNo"() {
    }

    def "GetEventbyEventDate"() {
    }
}
