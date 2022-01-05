package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import i0.d.a.a.a;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.r.d;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public abstract class DateTimeSerializerBase<T> extends StdScalarSerializer<T> implements d {
    public final Boolean q;
    public final DateFormat x;
    public final AtomicReference<DateFormat> y;

    public DateTimeSerializerBase(Class<T> cls, Boolean bool, DateFormat dateFormat) {
        super(cls);
        AtomicReference<DateFormat> atomicReference;
        this.q = bool;
        this.x = dateFormat;
        if (dateFormat == null) {
            atomicReference = null;
        } else {
            atomicReference = new AtomicReference<>();
        }
        this.y = atomicReference;
    }

    public g<?> a(i iVar, BeanProperty beanProperty) throws JsonMappingException {
        SimpleDateFormat simpleDateFormat;
        Locale locale;
        TimeZone timeZone;
        JsonFormat.Value m = m(iVar, beanProperty, this.d);
        if (m == null) {
            return this;
        }
        JsonFormat.Shape shape = m.q;
        if (shape.isNumeric()) {
            return x(Boolean.TRUE, (DateFormat) null);
        }
        String str = m.d;
        boolean z = true;
        if (str != null && str.length() > 0) {
            if (m.d()) {
                locale = m.x;
            } else {
                locale = iVar.q.d.c2;
            }
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(m.d, locale);
            if (m.e()) {
                timeZone = m.c();
            } else {
                timeZone = iVar.q.d.d2;
                if (timeZone == null) {
                    timeZone = BaseSettings.c;
                }
            }
            simpleDateFormat2.setTimeZone(timeZone);
            return x(Boolean.FALSE, simpleDateFormat2);
        }
        boolean d = m.d();
        boolean e = m.e();
        boolean z2 = shape == JsonFormat.Shape.STRING;
        if (!d && !e && !z2) {
            return this;
        }
        DateFormat dateFormat = iVar.q.d.b2;
        if (dateFormat instanceof StdDateFormat) {
            StdDateFormat stdDateFormat = (StdDateFormat) dateFormat;
            if (m.d()) {
                stdDateFormat = stdDateFormat.l(m.x);
            }
            if (m.e()) {
                stdDateFormat = stdDateFormat.m(m.c());
            }
            return x(Boolean.FALSE, stdDateFormat);
        }
        if (!(dateFormat instanceof SimpleDateFormat)) {
            iVar.p(this.d, String.format("Configured `DateFormat` (%s) not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`", new Object[]{dateFormat.getClass().getName()}));
        }
        SimpleDateFormat simpleDateFormat3 = (SimpleDateFormat) dateFormat;
        if (d) {
            simpleDateFormat = new SimpleDateFormat(simpleDateFormat3.toPattern(), m.x);
        } else {
            simpleDateFormat = (SimpleDateFormat) simpleDateFormat3.clone();
        }
        TimeZone c = m.c();
        if (c == null || c.equals(simpleDateFormat.getTimeZone())) {
            z = false;
        }
        if (z) {
            simpleDateFormat.setTimeZone(c);
        }
        return x(Boolean.FALSE, simpleDateFormat);
    }

    public boolean d(i iVar, T t) {
        return false;
    }

    public boolean v(i iVar) {
        Boolean bool = this.q;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.x != null) {
            return false;
        }
        if (iVar != null) {
            return iVar.Y(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        }
        throw new IllegalArgumentException(a.W(this.d, a.P0("Null SerializerProvider passed for ")));
    }

    public void w(Date date, JsonGenerator jsonGenerator, i iVar) throws IOException {
        if (this.x == null) {
            Objects.requireNonNull(iVar);
            if (iVar.Y(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)) {
                jsonGenerator.i0(date.getTime());
            } else {
                jsonGenerator.Q0(iVar.x().format(date));
            }
        } else {
            DateFormat andSet = this.y.getAndSet((Object) null);
            if (andSet == null) {
                andSet = (DateFormat) this.x.clone();
            }
            jsonGenerator.Q0(andSet.format(date));
            this.y.compareAndSet((Object) null, andSet);
        }
    }

    public abstract DateTimeSerializerBase<T> x(Boolean bool, DateFormat dateFormat);
}
