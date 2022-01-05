package j$.time.format;

import androidx.core.app.NotificationCompat;
import com.instabug.library.model.State;
import j$.time.ZoneId;
import j$.time.chrono.h;
import j$.time.format.c;
import j$.time.temporal.j;
import j$.time.temporal.k;
import j$.time.temporal.l;
import j$.time.temporal.r;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

public final class DateTimeFormatter {
    public static final DateTimeFormatter a;
    public static final DateTimeFormatter b;
    public static final DateTimeFormatter c;
    private final c.C0310c d;
    private final Locale e;
    private final i f;
    private final k g;
    private final Set h;
    private final h i;
    private final ZoneId j;

    static {
        c cVar = new c();
        j jVar = j.YEAR;
        l lVar = l.EXCEEDS_PAD;
        c q = cVar.q(jVar, 4, 10, lVar);
        q.e('-');
        j jVar2 = j.MONTH_OF_YEAR;
        q.p(jVar2, 2);
        q.e('-');
        j jVar3 = j.DAY_OF_MONTH;
        q.p(jVar3, 2);
        k kVar = k.STRICT;
        j$.time.chrono.j jVar4 = j$.time.chrono.j.a;
        DateTimeFormatter y = q.y(kVar, jVar4);
        a = y;
        c cVar2 = new c();
        cVar2.u();
        cVar2.a(y);
        cVar2.j();
        cVar2.y(kVar, jVar4);
        c cVar3 = new c();
        cVar3.u();
        cVar3.a(y);
        cVar3.t();
        cVar3.j();
        cVar3.y(kVar, jVar4);
        c cVar4 = new c();
        j jVar5 = j.HOUR_OF_DAY;
        cVar4.p(jVar5, 2);
        cVar4.e(':');
        j jVar6 = j.MINUTE_OF_HOUR;
        cVar4.p(jVar6, 2);
        cVar4.t();
        cVar4.e(':');
        j jVar7 = j.SECOND_OF_MINUTE;
        cVar4.p(jVar7, 2);
        cVar4.t();
        cVar4.b(j.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter y2 = cVar4.y(kVar, (h) null);
        c cVar5 = new c();
        cVar5.u();
        cVar5.a(y2);
        cVar5.j();
        cVar5.y(kVar, (h) null);
        c cVar6 = new c();
        cVar6.u();
        cVar6.a(y2);
        cVar6.t();
        cVar6.j();
        cVar6.y(kVar, (h) null);
        c cVar7 = new c();
        cVar7.u();
        cVar7.a(y);
        cVar7.e('T');
        cVar7.a(y2);
        DateTimeFormatter y3 = cVar7.y(kVar, jVar4);
        c cVar8 = new c();
        cVar8.u();
        cVar8.a(y3);
        cVar8.j();
        DateTimeFormatter y4 = cVar8.y(kVar, jVar4);
        b = y4;
        c cVar9 = new c();
        cVar9.a(y4);
        cVar9.t();
        cVar9.e('[');
        cVar9.v();
        cVar9.r();
        cVar9.e(']');
        cVar9.y(kVar, jVar4);
        c cVar10 = new c();
        cVar10.a(y3);
        cVar10.t();
        cVar10.j();
        cVar10.t();
        cVar10.e('[');
        cVar10.v();
        cVar10.r();
        cVar10.e(']');
        cVar10.y(kVar, jVar4);
        c cVar11 = new c();
        cVar11.u();
        c q2 = cVar11.q(jVar, 4, 10, lVar);
        q2.e('-');
        q2.p(j.DAY_OF_YEAR, 3);
        q2.t();
        q2.j();
        q2.y(kVar, jVar4);
        c cVar12 = new c();
        cVar12.u();
        c q3 = cVar12.q(k.c, 4, 10, lVar);
        q3.f("-W");
        q3.p(k.b, 2);
        q3.e('-');
        j jVar8 = j.DAY_OF_WEEK;
        q3.p(jVar8, 1);
        q3.t();
        q3.j();
        q3.y(kVar, jVar4);
        c cVar13 = new c();
        cVar13.u();
        cVar13.c();
        c = cVar13.y(kVar, (h) null);
        c cVar14 = new c();
        cVar14.u();
        cVar14.p(jVar, 4);
        cVar14.p(jVar2, 2);
        cVar14.p(jVar3, 2);
        cVar14.t();
        cVar14.i("+HHMMss", "Z");
        cVar14.y(kVar, jVar4);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        j$.time.chrono.j jVar9 = jVar4;
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        c cVar15 = new c();
        cVar15.u();
        cVar15.w();
        cVar15.t();
        cVar15.m(jVar8, hashMap);
        cVar15.f(", ");
        cVar15.s();
        c q4 = cVar15.q(jVar3, 1, 2, l.NOT_NEGATIVE);
        q4.e(' ');
        q4.m(jVar2, hashMap2);
        q4.e(' ');
        q4.p(jVar, 4);
        q4.e(' ');
        q4.p(jVar5, 2);
        q4.e(':');
        q4.p(jVar6, 2);
        q4.t();
        q4.e(':');
        q4.p(jVar7, 2);
        q4.s();
        q4.e(' ');
        q4.i("+HHMM", "GMT");
        q4.y(k.SMART, jVar9);
    }

    DateTimeFormatter(c.C0310c cVar, Locale locale, i iVar, k kVar, Set set, h hVar, ZoneId zoneId) {
        Objects.requireNonNull(cVar, "printerParser");
        this.d = cVar;
        this.h = set;
        Objects.requireNonNull(locale, State.KEY_LOCALE);
        this.e = locale;
        Objects.requireNonNull(iVar, "decimalStyle");
        this.f = iVar;
        Objects.requireNonNull(kVar, "resolverStyle");
        this.g = kVar;
        this.i = hVar;
        this.j = zoneId;
    }

    private l g(CharSequence charSequence, ParsePosition parsePosition) {
        String str;
        ParsePosition parsePosition2 = new ParsePosition(0);
        d dVar = new d(this);
        int o = this.d.o(dVar, charSequence, parsePosition2.getIndex());
        if (o < 0) {
            parsePosition2.setErrorIndex(~o);
            dVar = null;
        } else {
            parsePosition2.setIndex(o);
        }
        if (dVar != null && parsePosition2.getErrorIndex() < 0 && parsePosition2.getIndex() >= charSequence.length()) {
            return dVar.t(this.g, this.h);
        }
        if (charSequence.length() > 64) {
            str = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            str = charSequence.toString();
        }
        if (parsePosition2.getErrorIndex() >= 0) {
            throw new e("Text '" + str + "' could not be parsed at index " + parsePosition2.getErrorIndex(), charSequence, parsePosition2.getErrorIndex());
        }
        throw new e("Text '" + str + "' could not be parsed, unparsed text found at index " + parsePosition2.getIndex(), charSequence, parsePosition2.getIndex());
    }

    public static DateTimeFormatter ofLocalizedTime(FormatStyle formatStyle) {
        Objects.requireNonNull(formatStyle, "timeStyle");
        c cVar = new c();
        cVar.g((FormatStyle) null, formatStyle);
        return cVar.y(k.SMART, j$.time.chrono.j.a);
    }

    public static DateTimeFormatter ofPattern(String str) {
        c cVar = new c();
        cVar.k(str);
        return cVar.x();
    }

    public String a(l lVar) {
        StringBuilder sb = new StringBuilder(32);
        try {
            this.d.k(new g(lVar, this), sb);
            return sb.toString();
        } catch (IOException e2) {
            throw new j$.time.c(e2.getMessage(), e2);
        }
    }

    public h b() {
        return this.i;
    }

    public i c() {
        return this.f;
    }

    public Locale d() {
        return this.e;
    }

    public ZoneId e() {
        return this.j;
    }

    public Object f(CharSequence charSequence, r rVar) {
        String str;
        Objects.requireNonNull(charSequence, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
        try {
            return ((j) g(charSequence, (ParsePosition) null)).d(rVar);
        } catch (e e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (charSequence.length() > 64) {
                str = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                str = charSequence.toString();
            }
            throw new e("Text '" + str + "' could not be parsed: " + e3.getMessage(), charSequence, 0, e3);
        }
    }

    /* access modifiers changed from: package-private */
    public c.C0310c h(boolean z) {
        return this.d.a(z);
    }

    public String toString() {
        String cVar = this.d.toString();
        return cVar.startsWith("[") ? cVar : cVar.substring(1, cVar.length() - 1);
    }

    public DateTimeFormatter withZone(ZoneId zoneId) {
        return Objects.equals(this.j, zoneId) ? this : new DateTimeFormatter(this.d, this.e, this.f, this.g, this.h, this.i, zoneId);
    }
}
