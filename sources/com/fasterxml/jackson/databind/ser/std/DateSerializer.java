package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import i0.f.a.c.i;
import i0.f.a.c.j.a;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

@a
public class DateSerializer extends DateTimeSerializerBase<Date> {
    public static final DateSerializer Y1 = new DateSerializer();

    public DateSerializer() {
        super(Date.class, (Boolean) null, (DateFormat) null);
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        long j;
        Date date = (Date) obj;
        if (v(iVar)) {
            if (date == null) {
                j = 0;
            } else {
                j = date.getTime();
            }
            jsonGenerator.i0(j);
            return;
        }
        w(date, jsonGenerator, iVar);
    }

    public DateTimeSerializerBase x(Boolean bool, DateFormat dateFormat) {
        return new DateSerializer(bool, dateFormat);
    }

    public DateSerializer(Boolean bool, DateFormat dateFormat) {
        super(Date.class, bool, dateFormat);
    }
}
