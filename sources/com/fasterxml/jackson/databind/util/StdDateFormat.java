package com.fasterxml.jackson.databind.util;

import androidx.core.app.NotificationManagerCompat;
import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StdDateFormat extends DateFormat {
    public static final DateFormat Y1;
    public static final StdDateFormat Z1 = new StdDateFormat();
    public static final Calendar a2;
    public static final Pattern c = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d");
    public static final Pattern d = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?");
    public static final String[] q = {"yyyy-MM-dd'T'HH:mm:ss.SSSX", "yyyy-MM-dd'T'HH:mm:ss.SSS", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd"};
    public static final TimeZone x;
    public static final Locale y;
    public transient TimeZone b2;
    public final Locale c2;
    public Boolean d2;
    public transient Calendar e2;
    public transient DateFormat f2;
    public boolean g2;

    static {
        try {
            TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
            x = timeZone;
            Locale locale = Locale.US;
            y = locale;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", locale);
            Y1 = simpleDateFormat;
            simpleDateFormat.setTimeZone(timeZone);
            a2 = new GregorianCalendar(timeZone, locale);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public StdDateFormat() {
        this.g2 = true;
        this.c2 = y;
    }

    public static int c(String str, int i) {
        return (str.charAt(i + 1) - '0') + ((str.charAt(i) - '0') * 10);
    }

    public static int d(String str, int i) {
        int charAt = ((str.charAt(i + 1) - '0') * 100) + ((str.charAt(i) - '0') * 1000);
        return (str.charAt(i + 3) - '0') + ((str.charAt(i + 2) - '0') * 10) + charAt;
    }

    public static void g(StringBuffer stringBuffer, int i) {
        int i2 = i / 10;
        if (i2 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i2 + 48));
            i -= i2 * 10;
        }
        stringBuffer.append((char) (i + 48));
    }

    public static void h(StringBuffer stringBuffer, int i) {
        int i2 = i / 100;
        if (i2 == 0) {
            stringBuffer.append('0');
            stringBuffer.append('0');
        } else {
            if (i2 > 99) {
                stringBuffer.append(i2);
            } else {
                g(stringBuffer, i2);
            }
            i -= i2 * 100;
        }
        g(stringBuffer, i);
    }

    public Calendar b(TimeZone timeZone) {
        Calendar calendar = this.e2;
        if (calendar == null) {
            calendar = (Calendar) a2.clone();
            this.e2 = calendar;
        }
        if (!calendar.getTimeZone().equals(timeZone)) {
            calendar.setTimeZone(timeZone);
        }
        calendar.setLenient(isLenient());
        return calendar;
    }

    public Object clone() {
        return new StdDateFormat(this.b2, this.c2, this.d2, this.g2);
    }

    public Date e(String str) throws IllegalArgumentException, ParseException {
        char c3;
        String str2;
        String str3 = str;
        int length = str.length();
        TimeZone timeZone = x;
        if (!(this.b2 == null || 'Z' == str3.charAt(length - 1))) {
            timeZone = this.b2;
        }
        Calendar b = b(timeZone);
        b.clear();
        int i = 0;
        if (length > 10) {
            Matcher matcher = d.matcher(str3);
            if (matcher.matches()) {
                int start = matcher.start(2);
                int end = matcher.end(2);
                int i2 = end - start;
                if (i2 > 1) {
                    int c4 = c(str3, start + 1) * 3600;
                    if (i2 >= 5) {
                        c4 += c(str3, end - 2) * 60;
                    }
                    b.set(15, str3.charAt(start) == '-' ? c4 * NotificationManagerCompat.IMPORTANCE_UNSPECIFIED : c4 * 1000);
                    b.set(16, 0);
                }
                int d3 = d(str3, 0);
                int c5 = c(str3, 5) - 1;
                Matcher matcher2 = matcher;
                b.set(d3, c5, c(str3, 8), c(str3, 11), c(str3, 14), (length <= 16 || str3.charAt(16) != ':') ? 0 : c(str3, 17));
                int start2 = matcher2.start(1) + 1;
                int end2 = matcher2.end(1);
                if (start2 >= end2) {
                    b.set(14, 0);
                } else {
                    int i3 = end2 - start2;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 == 3 || i3 <= 9) {
                                    i = 0 + (str3.charAt(start2 + 2) - '0');
                                } else {
                                    throw new ParseException(String.format("Cannot parse date \"%s\": invalid fractional seconds '%s'; can use at most 9 digits", new Object[]{str3, matcher2.group(1).substring(1)}), start2);
                                }
                            }
                            i += (str3.charAt(start2 + 1) - '0') * 10;
                        }
                        i += (str3.charAt(start2) - '0') * 100;
                    }
                    b.set(14, i);
                }
                return b.getTime();
            }
            c3 = 1;
            str2 = "yyyy-MM-dd'T'HH:mm:ss.SSSX";
        } else if (c.matcher(str3).matches()) {
            b.set(d(str3, 0), c(str3, 5) - 1, c(str3, 8), 0, 0, 0);
            b.set(14, 0);
            return b.getTime();
        } else {
            str2 = "yyyy-MM-dd";
            c3 = 1;
        }
        Object[] objArr = new Object[3];
        objArr[0] = str3;
        objArr[c3] = str2;
        objArr[2] = this.d2;
        throw new ParseException(String.format("Cannot parse date \"%s\": while it seems to fit format '%s', parsing fails (leniency? %s)", objArr), 0);
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0096, code lost:
        if (r5 < 0) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009f, code lost:
        if (r0 == false) goto L_0x00bf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Date f(java.lang.String r8, java.text.ParsePosition r9) throws java.text.ParseException {
        /*
            r7 = this;
            int r0 = r8.length()
            r1 = 7
            r2 = 45
            r3 = 1
            r4 = 0
            if (r0 < r1) goto L_0x0034
            char r0 = r8.charAt(r4)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 3
            char r0 = r8.charAt(r0)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 4
            char r0 = r8.charAt(r0)
            if (r0 != r2) goto L_0x0034
            r0 = 5
            char r0 = r8.charAt(r0)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L_0x0034
            r0 = r3
            goto L_0x0035
        L_0x0034:
            r0 = r4
        L_0x0035:
            if (r0 == 0) goto L_0x0058
            java.util.Date r8 = r7.e(r8)     // Catch:{ IllegalArgumentException -> 0x003c }
            return r8
        L_0x003c:
            r0 = move-exception
            java.text.ParseException r1 = new java.text.ParseException
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r8
            java.lang.String r8 = r0.getMessage()
            r2[r3] = r8
            java.lang.String r8 = "Cannot parse date \"%s\", problem: %s"
            java.lang.String r8 = java.lang.String.format(r8, r2)
            int r9 = r9.getErrorIndex()
            r1.<init>(r8, r9)
            throw r1
        L_0x0058:
            int r0 = r8.length()
        L_0x005c:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0070
            char r1 = r8.charAt(r0)
            r5 = 48
            if (r1 < r5) goto L_0x006c
            r5 = 57
            if (r1 <= r5) goto L_0x005c
        L_0x006c:
            if (r0 > 0) goto L_0x0070
            if (r1 == r2) goto L_0x005c
        L_0x0070:
            if (r0 >= 0) goto L_0x00bf
            char r0 = r8.charAt(r4)
            if (r0 == r2) goto L_0x00a1
            java.lang.String r0 = i0.f.a.b.i.e.b
            int r1 = r0.length()
            int r2 = r8.length()
            if (r2 >= r1) goto L_0x0085
            goto L_0x0098
        L_0x0085:
            if (r2 <= r1) goto L_0x0088
            goto L_0x009a
        L_0x0088:
            r2 = r4
        L_0x0089:
            if (r2 >= r1) goto L_0x0098
            char r5 = r8.charAt(r2)
            char r6 = r0.charAt(r2)
            int r5 = r5 - r6
            if (r5 == 0) goto L_0x009c
            if (r5 >= 0) goto L_0x009a
        L_0x0098:
            r0 = r3
            goto L_0x009f
        L_0x009a:
            r0 = r4
            goto L_0x009f
        L_0x009c:
            int r2 = r2 + 1
            goto L_0x0089
        L_0x009f:
            if (r0 == 0) goto L_0x00bf
        L_0x00a1:
            long r8 = i0.f.a.b.i.e.f(r8)     // Catch:{ NumberFormatException -> 0x00ab }
            java.util.Date r0 = new java.util.Date
            r0.<init>(r8)
            return r0
        L_0x00ab:
            java.text.ParseException r0 = new java.text.ParseException
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r8
            java.lang.String r8 = "Timestamp value %s out of 64-bit value range"
            java.lang.String r8 = java.lang.String.format(r8, r1)
            int r9 = r9.getErrorIndex()
            r0.<init>(r8, r9)
            throw r0
        L_0x00bf:
            java.text.DateFormat r0 = r7.f2
            if (r0 != 0) goto L_0x00f8
            java.text.DateFormat r0 = Y1
            java.util.TimeZone r1 = r7.b2
            java.util.Locale r2 = r7.c2
            java.lang.Boolean r3 = r7.d2
            java.util.Locale r4 = y
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x00e2
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r4 = "EEE, dd MMM yyyy HH:mm:ss zzz"
            r0.<init>(r4, r2)
            if (r1 != 0) goto L_0x00de
            java.util.TimeZone r1 = x
        L_0x00de:
            r0.setTimeZone(r1)
            goto L_0x00ed
        L_0x00e2:
            java.lang.Object r0 = r0.clone()
            java.text.DateFormat r0 = (java.text.DateFormat) r0
            if (r1 == 0) goto L_0x00ed
            r0.setTimeZone(r1)
        L_0x00ed:
            if (r3 == 0) goto L_0x00f6
            boolean r1 = r3.booleanValue()
            r0.setLenient(r1)
        L_0x00f6:
            r7.f2 = r0
        L_0x00f8:
            java.text.DateFormat r0 = r7.f2
            java.util.Date r8 = r0.parse(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.util.StdDateFormat.f(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        TimeZone timeZone = this.b2;
        if (timeZone == null) {
            timeZone = x;
        }
        Calendar b = b(timeZone);
        b.setTime(date);
        int i = b.get(1);
        char c3 = '+';
        if (b.get(0) != 0) {
            if (i > 9999) {
                stringBuffer.append('+');
            }
            h(stringBuffer, i);
        } else if (i == 1) {
            stringBuffer.append("+0000");
        } else {
            stringBuffer.append('-');
            h(stringBuffer, i - 1);
        }
        stringBuffer.append('-');
        g(stringBuffer, b.get(2) + 1);
        stringBuffer.append('-');
        g(stringBuffer, b.get(5));
        stringBuffer.append('T');
        g(stringBuffer, b.get(11));
        stringBuffer.append(':');
        g(stringBuffer, b.get(12));
        stringBuffer.append(':');
        g(stringBuffer, b.get(13));
        stringBuffer.append('.');
        int i2 = b.get(14);
        int i3 = i2 / 100;
        if (i3 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i3 + 48));
            i2 -= i3 * 100;
        }
        g(stringBuffer, i2);
        int offset = timeZone.getOffset(b.getTimeInMillis());
        if (offset != 0) {
            int i4 = offset / 60000;
            int abs = Math.abs(i4 / 60);
            int abs2 = Math.abs(i4 % 60);
            if (offset < 0) {
                c3 = '-';
            }
            stringBuffer.append(c3);
            g(stringBuffer, abs);
            if (this.g2) {
                stringBuffer.append(':');
            }
            g(stringBuffer, abs2);
        } else if (this.g2) {
            stringBuffer.append("+00:00");
        } else {
            stringBuffer.append("+0000");
        }
        return stringBuffer;
    }

    public TimeZone getTimeZone() {
        return this.b2;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    public StdDateFormat i(Boolean bool) {
        Boolean bool2 = this.d2;
        if (bool == bool2 || bool.equals(bool2)) {
            return this;
        }
        return new StdDateFormat(this.b2, this.c2, bool, this.g2);
    }

    public boolean isLenient() {
        Boolean bool = this.d2;
        return bool == null || bool.booleanValue();
    }

    public StdDateFormat l(Locale locale) {
        if (locale.equals(this.c2)) {
            return this;
        }
        return new StdDateFormat(this.b2, locale, this.d2, this.g2);
    }

    public StdDateFormat m(TimeZone timeZone) {
        if (timeZone == null) {
            timeZone = x;
        }
        TimeZone timeZone2 = this.b2;
        return (timeZone == timeZone2 || timeZone.equals(timeZone2)) ? this : new StdDateFormat(timeZone, this.c2, this.d2, this.g2);
    }

    public Date parse(String str) throws ParseException {
        String trim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date f = f(trim, parsePosition);
        if (f != null) {
            return f;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : q) {
            if (sb.length() > 0) {
                sb.append("\", \"");
            } else {
                sb.append('\"');
            }
            sb.append(str2);
        }
        sb.append('\"');
        throw new ParseException(String.format("Cannot parse date \"%s\": not compatible with any of standard forms (%s)", new Object[]{trim, sb.toString()}), parsePosition.getErrorIndex());
    }

    public void setLenient(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Boolean bool = this.d2;
        if (!(valueOf == bool || (valueOf != null && valueOf.equals(bool)))) {
            this.d2 = valueOf;
            this.f2 = null;
        }
    }

    public void setTimeZone(TimeZone timeZone) {
        if (!timeZone.equals(this.b2)) {
            this.f2 = null;
            this.b2 = timeZone;
        }
    }

    public String toString() {
        return String.format("DateFormat %s: (timezone: %s, locale: %s, lenient: %s)", new Object[]{StdDateFormat.class.getName(), this.b2, this.c2, this.d2});
    }

    public StdDateFormat(TimeZone timeZone, Locale locale, Boolean bool, boolean z) {
        this.g2 = true;
        this.b2 = timeZone;
        this.c2 = locale;
        this.d2 = bool;
        this.g2 = z;
    }

    public Date parse(String str, ParsePosition parsePosition) {
        try {
            return f(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }
}
