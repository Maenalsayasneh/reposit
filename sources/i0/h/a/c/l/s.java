package i0.h.a.c.l;

import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: UtcDates */
public class s {
    public static AtomicReference<r> a = new AtomicReference<>();

    public static long a(long j) {
        Calendar e = e();
        e.setTimeInMillis(j);
        return b(e).getTimeInMillis();
    }

    public static Calendar b(Calendar calendar) {
        Calendar f = f(calendar);
        Calendar e = e();
        e.set(f.get(1), f.get(2), f.get(5));
        return e;
    }

    public static TimeZone c() {
        return DesugarTimeZone.getTimeZone("UTC");
    }

    public static Calendar d() {
        r rVar = a.get();
        if (rVar == null) {
            rVar = r.a;
        }
        TimeZone timeZone = rVar.c;
        Calendar instance = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = rVar.b;
        if (l != null) {
            instance.setTimeInMillis(l.longValue());
        }
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.setTimeZone(c());
        return instance;
    }

    public static Calendar e() {
        return f((Calendar) null);
    }

    public static Calendar f(Calendar calendar) {
        Calendar instance = Calendar.getInstance(c());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }
}
