package s0.a.a;

import i0.d.a.a.a;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import s0.a.e.b.b0.c.h3;
import s0.a.g.j;

public class i extends r {
    public byte[] c;

    public i(String str) {
        this.c = j.c(str);
        try {
            D();
        } catch (ParseException e) {
            StringBuilder P0 = a.P0("invalid date string: ");
            P0.append(e.getMessage());
            throw new IllegalArgumentException(P0.toString());
        }
    }

    public i(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'", t1.c);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.c = j.c(simpleDateFormat.format(date));
    }

    public i(byte[] bArr) {
        if (bArr.length >= 4) {
            this.c = bArr;
            if (!K(0) || !K(1) || !K(2) || !K(3)) {
                throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
            }
            return;
        }
        throw new IllegalArgumentException("GeneralizedTime string too short");
    }

    public static i E(Object obj) {
        if (obj == null || (obj instanceof i)) {
            return (i) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (i) r.x((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException(a.b0(e, a.P0("encoding error in getInstance: ")));
            }
        } else {
            throw new IllegalArgumentException(a.c0(obj, a.P0("illegal object in getInstance: ")));
        }
    }

    public static i F(z zVar, boolean z) {
        r C = zVar.C();
        return (z || (C instanceof i)) ? E(C) : new i(o.B(C).c);
    }

    public r A() {
        return new s0(this.c);
    }

    public final SimpleDateFormat B() {
        SimpleDateFormat simpleDateFormat = H() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz") : J() ? new SimpleDateFormat("yyyyMMddHHmmssz") : I() ? new SimpleDateFormat("yyyyMMddHHmmz") : new SimpleDateFormat("yyyyMMddHHz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    public final String C(int i) {
        return i < 10 ? a.e0("0", i) : Integer.toString(i);
    }

    public Date D() throws ParseException {
        SimpleDateFormat simpleDateFormat;
        String a = j.a(this.c);
        if (a.endsWith("Z")) {
            simpleDateFormat = H() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'") : J() ? new SimpleDateFormat("yyyyMMddHHmmss'Z'") : I() ? new SimpleDateFormat("yyyyMMddHHmm'Z'") : new SimpleDateFormat("yyyyMMddHH'Z'");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (a.indexOf(45) > 0 || a.indexOf(43) > 0) {
            a = G();
            simpleDateFormat = B();
        } else {
            simpleDateFormat = H() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS") : J() ? new SimpleDateFormat("yyyyMMddHHmmss") : I() ? new SimpleDateFormat("yyyyMMddHHmm") : new SimpleDateFormat("yyyyMMddHH");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (H()) {
            a = L(a);
        }
        return t1.a(simpleDateFormat.parse(a));
    }

    public String G() {
        String str;
        String a = j.a(this.c);
        int i = 1;
        if (a.charAt(a.length() - 1) == 'Z') {
            return a.substring(0, a.length() - 1) + "GMT+00:00";
        }
        int length = a.length() - 6;
        char charAt = a.charAt(length);
        if ((charAt == '-' || charAt == '+') && a.indexOf("GMT") == length - 3) {
            return a;
        }
        int length2 = a.length() - 5;
        char charAt2 = a.charAt(length2);
        if (charAt2 == '-' || charAt2 == '+') {
            StringBuilder sb = new StringBuilder();
            sb.append(a.substring(0, length2));
            sb.append("GMT");
            int i2 = length2 + 3;
            sb.append(a.substring(length2, i2));
            sb.append(":");
            sb.append(a.substring(i2));
            return sb.toString();
        }
        int length3 = a.length() - 3;
        char charAt3 = a.charAt(length3);
        if (charAt3 == '-' || charAt3 == '+') {
            return a.substring(0, length3) + "GMT" + a.substring(length3) + ":00";
        }
        StringBuilder P0 = a.P0(a);
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str = "-";
        } else {
            str = "+";
        }
        int i3 = rawOffset / 3600000;
        int i4 = (rawOffset - (((i3 * 60) * 60) * 1000)) / 60000;
        try {
            if (timeZone.useDaylightTime()) {
                if (H()) {
                    a = L(a);
                }
                if (timeZone.inDaylightTime(B().parse(a + "GMT" + str + C(i3) + ":" + C(i4)))) {
                    if (!str.equals("+")) {
                        i = -1;
                    }
                    i3 += i;
                }
            }
        } catch (ParseException unused) {
        }
        StringBuilder S0 = a.S0("GMT", str);
        S0.append(C(i3));
        S0.append(":");
        S0.append(C(i4));
        P0.append(S0.toString());
        return P0.toString();
    }

    public boolean H() {
        int i = 0;
        while (true) {
            byte[] bArr = this.c;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    public boolean I() {
        return K(10) && K(11);
    }

    public boolean J() {
        return K(12) && K(13);
    }

    public final boolean K(int i) {
        byte[] bArr = this.c;
        return bArr.length > i && bArr[i] >= 48 && bArr[i] <= 57;
    }

    public final String L(String str) {
        String str2;
        StringBuilder sb;
        String substring = str.substring(14);
        int i = 1;
        while (i < substring.length() && '0' <= (r4 = substring.charAt(i)) && r4 <= '9') {
            i++;
        }
        int i2 = i - 1;
        if (i2 > 3) {
            str2 = substring.substring(0, 4) + substring.substring(i);
            sb = new StringBuilder();
        } else if (i2 == 1) {
            str2 = substring.substring(0, i) + "00" + substring.substring(i);
            sb = new StringBuilder();
        } else if (i2 != 2) {
            return str;
        } else {
            str2 = substring.substring(0, i) + "0" + substring.substring(i);
            sb = new StringBuilder();
        }
        sb.append(str.substring(0, 14));
        sb.append(str2);
        return sb.toString();
    }

    public int hashCode() {
        return h3.m1(this.c);
    }

    public boolean s(r rVar) {
        if (!(rVar instanceof i)) {
            return false;
        }
        return Arrays.equals(this.c, ((i) rVar).c);
    }

    public void t(q qVar, boolean z) throws IOException {
        qVar.g(z, 24, this.c);
    }

    public int u() {
        int length = this.c.length;
        return a2.a(length) + 1 + length;
    }

    public boolean y() {
        return false;
    }

    public r z() {
        return new s0(this.c);
    }
}
