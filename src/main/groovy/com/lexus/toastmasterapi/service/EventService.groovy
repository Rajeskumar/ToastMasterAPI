package com.lexus.toastmasterapi.service

import com.fasterxml.jackson.databind.ObjectMapper
import com.lexus.toastmasterapi.common.DateJsonSerializer
import com.lexus.toastmasterapi.dao.EventDAO
import com.lexus.toastmasterapi.domain.TM_Events
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import java.text.SimpleDateFormat

@Service
@Slf4j
class EventService {

    @Autowired
    EventDAO eventDAO

    @Autowired
    ObjectMapper mapper

    List<TM_Events> getEvents(){

        List<TM_Events> eventsList = eventDAO.findAll()

        return eventsList
    }

    boolean createEvents(String createEventJson){

        TM_Events newEvent = mapper.readValue(createEventJson, TM_Events.class)

        log.debug("New Event Object :"+newEvent.toString())
        TM_Events insertedEvent = eventDAO.insert(newEvent)
        if(insertedEvent) {
           true
        }else{
            false
        }
    }

    boolean updateEvents(String updateEventJson){
        TM_Events updatedEvent = mapper.readValue(updateEventJson, TM_Events.class)

        eventDAO.save(updatedEvent)? true : false
    }

    TM_Events getEventbyEventNo(int eventNo){

        eventDAO.findByKeyEventNo(eventNo)

    }

    TM_Events getEventbyEventDate(String eventDate){

        Date date = new SimpleDateFormat(DateJsonSerializer.DATE_FORMAT_WITH_ZONE).parse(eventDate)
        eventDAO.findByKeyEventDate(date)

    }
}
