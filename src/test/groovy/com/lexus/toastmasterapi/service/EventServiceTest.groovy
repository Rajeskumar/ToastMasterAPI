package com.lexus.toastmasterapi.service

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner)
@SpringBootTest
class EventServiceTest {

    @Autowired
    EventService eventService


    @Test
    void createEventTest() {
        String newEventJson = "{\n" +
                "   \"tm_date\": \"2019-03-07\",\n" +
                "   \"word_of_day\": \"Impeccable\",\n" +
                "   \"theme_of_day\": \"Fun\",\n" +
                "   \"memberName\": \"Rajesh\",\n" +
                "   \"roleName\": \"Topic Master\"\n" +
                "}"

        eventService.createEvents(newEventJson)
    }
}
