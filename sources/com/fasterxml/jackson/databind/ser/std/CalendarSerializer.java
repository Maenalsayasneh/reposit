package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import i0.f.a.c.i;
import i0.f.a.c.j.a;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;

@a
public class CalendarSerializer extends DateTimeSerializerBase<Calendar> {
    public static final CalendarSerializer Y1 = new CalendarSerializer();

    public CalendarSerializer() {
        super(Calendar.class, (Boolean) null, (DateFormat) null);
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        long j;
        Calendar calendar = (Calendar) obj;
        if (v(iVar)) {
            if (calendar == null) {
                j = 0;
            } else {
                j = calendar.getTimeInMillis();
            }
            jsonGenerator.i0(j);
            return;
        }
        w(calendar.getTime(), jsonGenerator, iVar);
    }

    public DateTimeSerializerBase x(Boolean bool, DateFormat dateFormat) {
        return new CalendarSerializer(bool, dateFormat);
    }

    public CalendarSerializer(Boolean bool, DateFormat dateFormat) {
        super(Calendar.class, bool, dateFormat);
    }
}
