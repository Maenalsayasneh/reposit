package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import i0.f.a.c.i;
import i0.f.a.c.p.e;
import java.io.IOException;
import java.util.TimeZone;

public class TimeZoneSerializer extends StdScalarSerializer<TimeZone> {
    public TimeZoneSerializer() {
        super(TimeZone.class);
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        jsonGenerator.Q0(((TimeZone) obj).getID());
    }

    public void g(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        TimeZone timeZone = (TimeZone) obj;
        WritableTypeId d = eVar.d(timeZone, JsonToken.VALUE_STRING);
        d.b = TimeZone.class;
        WritableTypeId e = eVar.e(jsonGenerator, d);
        jsonGenerator.Q0(timeZone.getID());
        eVar.f(jsonGenerator, e);
    }
}
