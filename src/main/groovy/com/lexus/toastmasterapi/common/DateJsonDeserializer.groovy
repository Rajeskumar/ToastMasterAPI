package com.lexus.toastmasterapi.common

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import org.apache.logging.log4j.core.util.datetime.FastDateFormat


class DateJsonDeserializer extends JsonDeserializer<Date> {



    @Override
    Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        jsonParser.valueAsString ? FastDateFormat.getInstance(DateJsonSerializer.DATE_FORMAT_WITH_ZONE).parse(jsonParser.valueAsString) : null
    }

}
