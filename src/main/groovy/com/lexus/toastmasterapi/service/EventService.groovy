package com.lexus.toastmasterapi.service

import com.fasterxml.jackson.databind.ObjectMapper
import com.lexus.toastmasterapi.dao.EventDAO
import com.lexus.toastmasterapi.domain.TM_Events
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

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

    void createEvents(String createEventJson){

        TM_Events newEvent = mapper.readValue(createEventJson, TM_Events.class)

        UUID uuid = UUID.randomUUID()
        newEvent.setId(uuid)
        newEvent.setEventNo(1)

        log.debug("New Event Object :"+newEvent.toString())
        eventDAO.insert(newEvent)


    }

}
