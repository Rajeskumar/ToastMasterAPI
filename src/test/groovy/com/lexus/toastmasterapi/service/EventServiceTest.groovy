package com.lexus.toastmasterapi.service

import com.lexus.toastmasterapi.common.DateJsonSerializer
import com.lexus.toastmasterapi.domain.TM_Events
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

import java.text.SimpleDateFormat

@RunWith(SpringRunner)
@SpringBootTest
class EventServiceTest {

    @Autowired
    EventService eventService

    @Test
    void createEventTest() {
        String newEventJson = "{\n" +
                "   \"key\": {\n" +
                "      \"eventDate\": \"2019-03-12\",\n" +
                "      \"eventId\": 1\n" +
                "   },\n" +
                "   \"word_of_day\": \"Impeccable\",\n" +
                "   \"theme_of_day\": \"Fun\",\n" +
                "   \"toastmaster\": \"Bharani\",\n" +
                "   \"speaker_1\": \"Praveen\",\n" +
                "   \"speaker_2\": \"Kalai\",\n" +
                "   \"spkr_evaluator_1\": \"Parvathi\",\n" +
                "   \"spkr_evaluator_2\": \"Jagan\",\n" +
                "   \"topic_master\": \"Rajesh\",\n" +
                "   \"timer_report\": \"Jagan\",\n" +
                "   \"ahCounter_report\": \"Rajesh\",\n" +
                "   \"gnrl_evaluator\": \"Bharani\",\n" +
                "   \"grammarian\": \"Parvathi\"\n" +
                "}"

        boolean isCreated = eventService.createEvents(newEventJson)

        Assert.assertTrue(isCreated)
    }

    @Test
    void getEventsTest(){
        List<TM_Events> allEvents = eventService.getEvents()

        Assert.assertNotNull(allEvents)
        Assert.assertTrue(allEvents.size()>0)
    }


    @Test
    void getEventbyeventIdTest(){
        int eventId = 1;

        TM_Events event = eventService.getEventbyEventId(eventId)

        Assert.assertNotNull(event)
        Assert.assertEquals(1, event.key.eventId)
    }

    @Test
    void updateEventsTest(){

        String updateEventJson = "{\n" +
                "   \"key\": {\n" +
                "      \"eventDate\": \"2019-03-26\",\n" +
                "      \"eventId\": 3\n" +
                "   },\n" +
                "   \"word_of_day\": \"\",\n" +
                "   \"theme_of_day\": \"Digitization\",\n" +
                "   \"toastmaster\": \"Rajesh\",\n" +
                "   \"speaker_1\": \"Bharani\",\n" +
                "   \"speaker_2\": \"Parvathi\",\n" +
                "   \"spkr_evaluator_1\": \"Praveen\",\n" +
                "   \"spkr_evaluator_2\": \"Jagan\",\n" +
                "   \"topic_master\": \"Kalai\",\n" +
                "   \"timer_report\": \"Praveen\",\n" +
                "   \"ahCounter_report\": \"Kalai\",\n" +
                "   \"gnrl_evaluator\": \"Rajesh\",\n" +
                "   \"grammarian\": \"Jagan\"\n" +
                "}"

        boolean isUpdated = eventService.updateEvents(updateEventJson)

        Assert.assertTrue(isUpdated)
    }

    @Test
    void getEventbyEventDateTest(){
        String eventDate ="2019-03-12"

        TM_Events event = eventService.getEventbyEventDate(eventDate)

        Assert.assertNotNull(event)
        Assert.assertEquals(eventDate, new SimpleDateFormat(DateJsonSerializer.DATE_FORMAT_WITH_ZONE).format(event.key.eventDate))
    }
}
