package com.lexus.toastmasterapi.common

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import org.apache.commons.lang3.time.FastDateFormat

class DateJsonSerializer extends JsonSerializer<Date> {

    public static final String DATE_TIME_FORMAT_WITH_ZONE = "yyyy-MM-dd'T'HH:mm:ss z"
    public static final String DATE_FORMAT_WITH_ZONE = "yyyy-MM-dd"


    @Override
    void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        date ? jsonGenerator.writeString(getDateToGMTAsString(date)) : jsonGenerator.writeNull()
    }

    static String getDateTimeToGMTAsString(Date date) {
        FastDateFormat dateFormat = FastDateFormat.getInstance(DATE_TIME_FORMAT_WITH_ZONE, TimeZone.getTimeZone("GMT"))
        dateFormat.format(date)
    }

    static String getDateToGMTAsString(Date date) {
        FastDateFormat dateFormat = FastDateFormat.getInstance(DATE_FORMAT_WITH_ZONE, TimeZone.getTimeZone("GMT"))
        dateFormat.format(date)
    }
}
