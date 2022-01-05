package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import i0.f.a.c.d;
import i0.f.a.c.j.a;
import i0.f.a.c.l.c;
import i0.f.a.c.t.f;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.TimeZone;

public class DateDeserializers {
    public static final HashSet<String> a;

    @a
    public static class DateDeserializer extends DateBasedDeserializer<Date> {
        public static final DateDeserializer Y1 = new DateDeserializer();

        public DateDeserializer() {
            super(Date.class);
        }

        public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            return c0(jsonParser, deserializationContext);
        }

        public Object k(DeserializationContext deserializationContext) {
            return new Date(0);
        }

        public DateBasedDeserializer y0(DateFormat dateFormat, String str) {
            return new DateDeserializer(this, dateFormat, str);
        }

        public DateDeserializer(DateDeserializer dateDeserializer, DateFormat dateFormat, String str) {
            super(dateDeserializer, dateFormat, str);
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        a = hashSet;
        hashSet.add("java.util.Calendar");
        hashSet.add("java.util.GregorianCalendar");
        hashSet.add("java.util.Date");
    }

    @a
    public static class CalendarDeserializer extends DateBasedDeserializer<Calendar> {
        public final Constructor<Calendar> Y1;

        public CalendarDeserializer() {
            super(Calendar.class);
            this.Y1 = null;
        }

        public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            Date c0 = c0(jsonParser, deserializationContext);
            if (c0 == null) {
                return null;
            }
            Constructor<Calendar> constructor = this.Y1;
            if (constructor == null) {
                Calendar instance = Calendar.getInstance(deserializationContext.J());
                instance.setTime(c0);
                return instance;
            }
            try {
                Calendar newInstance = constructor.newInstance(new Object[0]);
                newInstance.setTimeInMillis(c0.getTime());
                TimeZone J = deserializationContext.J();
                if (J != null) {
                    newInstance.setTimeZone(J);
                }
                return newInstance;
            } catch (Exception e) {
                deserializationContext.N(this.d, c0, e);
                throw null;
            }
        }

        public Object k(DeserializationContext deserializationContext) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(0);
            return gregorianCalendar;
        }

        public DateBasedDeserializer y0(DateFormat dateFormat, String str) {
            return new CalendarDeserializer(this, dateFormat, str);
        }

        public CalendarDeserializer(Class<? extends Calendar> cls) {
            super(cls);
            this.Y1 = f.l(cls, false);
        }

        public CalendarDeserializer(CalendarDeserializer calendarDeserializer, DateFormat dateFormat, String str) {
            super(calendarDeserializer, dateFormat, str);
            this.Y1 = calendarDeserializer.Y1;
        }
    }

    public static abstract class DateBasedDeserializer<T> extends StdScalarDeserializer<T> implements c {
        public final DateFormat x;
        public final String y;

        public DateBasedDeserializer(Class<?> cls) {
            super(cls);
            this.x = null;
            this.y = null;
        }

        public d<?> a(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
            StdDateFormat stdDateFormat;
            StdDateFormat stdDateFormat2;
            Locale locale;
            Locale locale2;
            JsonFormat.Value t02 = t0(deserializationContext, beanProperty, this.d);
            if (t02 != null) {
                TimeZone c = t02.c();
                Boolean bool = t02.Y1;
                String str = t02.d;
                if (str != null && str.length() > 0) {
                    String str2 = t02.d;
                    if (t02.d()) {
                        locale2 = t02.x;
                    } else {
                        locale2 = deserializationContext.q.d.c2;
                    }
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, locale2);
                    if (c == null) {
                        c = deserializationContext.J();
                    }
                    simpleDateFormat.setTimeZone(c);
                    if (bool != null) {
                        simpleDateFormat.setLenient(bool.booleanValue());
                    }
                    return y0(simpleDateFormat, str2);
                } else if (c != null) {
                    DateFormat dateFormat = deserializationContext.q.d.b2;
                    if (dateFormat.getClass() == StdDateFormat.class) {
                        if (t02.d()) {
                            locale = t02.x;
                        } else {
                            locale = deserializationContext.q.d.c2;
                        }
                        StdDateFormat l = ((StdDateFormat) dateFormat).m(c).l(locale);
                        stdDateFormat2 = l;
                        if (bool != null) {
                            stdDateFormat2 = l.i(bool);
                        }
                    } else {
                        DateFormat dateFormat2 = (DateFormat) dateFormat.clone();
                        dateFormat2.setTimeZone(c);
                        stdDateFormat2 = dateFormat2;
                        if (bool != null) {
                            dateFormat2.setLenient(bool.booleanValue());
                            stdDateFormat2 = dateFormat2;
                        }
                    }
                    return y0(stdDateFormat2, this.y);
                } else if (bool != null) {
                    DateFormat dateFormat3 = deserializationContext.q.d.b2;
                    String str3 = this.y;
                    if (dateFormat3.getClass() == StdDateFormat.class) {
                        StdDateFormat i = ((StdDateFormat) dateFormat3).i(bool);
                        StringBuilder sb = new StringBuilder(100);
                        sb.append("[one of: '");
                        sb.append("yyyy-MM-dd'T'HH:mm:ss.SSSX");
                        sb.append("', '");
                        sb.append("EEE, dd MMM yyyy HH:mm:ss zzz");
                        sb.append("' (");
                        str3 = i0.d.a.a.a.y0(sb, Boolean.FALSE.equals(i.d2) ? "strict" : "lenient", ")]");
                        stdDateFormat = i;
                    } else {
                        DateFormat dateFormat4 = (DateFormat) dateFormat3.clone();
                        dateFormat4.setLenient(bool.booleanValue());
                        boolean z = dateFormat4 instanceof SimpleDateFormat;
                        stdDateFormat = dateFormat4;
                        if (z) {
                            ((SimpleDateFormat) dateFormat4).toPattern();
                            stdDateFormat = dateFormat4;
                        }
                    }
                    if (str3 == null) {
                        str3 = "[unknown]";
                    }
                    return y0(stdDateFormat, str3);
                }
            }
            return this;
        }

        public Date c0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            Date parse;
            if (this.x == null || !jsonParser.y0(JsonToken.VALUE_STRING)) {
                return super.c0(jsonParser, deserializationContext);
            }
            String trim = jsonParser.Z().trim();
            if (!trim.isEmpty()) {
                synchronized (this.x) {
                    try {
                        parse = this.x.parse(trim);
                    } catch (ParseException unused) {
                        deserializationContext.Z(this.d, trim, "expected format \"%s\"", this.y);
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return parse;
            } else if (C(deserializationContext, trim, q(), n()).ordinal() != 3) {
                return null;
            } else {
                return new Date(0);
            }
        }

        public LogicalType q() {
            return LogicalType.DateTime;
        }

        public abstract DateBasedDeserializer<T> y0(DateFormat dateFormat, String str);

        public DateBasedDeserializer(DateBasedDeserializer<T> dateBasedDeserializer, DateFormat dateFormat, String str) {
            super(dateBasedDeserializer.d);
            this.x = dateFormat;
            this.y = str;
        }
    }
}
