package k0.a.a.a;

import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import io.michaelrocks.libphonenumber.android.Phonemetadata$NumberFormat;
import io.michaelrocks.libphonenumber.android.Phonemetadata$PhoneMetadata;
import io.michaelrocks.libphonenumber.android.internal.RegexCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: AsYouTypeFormatter */
public class a {
    public static final Phonemetadata$PhoneMetadata a;
    public static final Pattern b = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*)+");
    public static final Pattern c = Pattern.compile("[- ]");
    public static final Pattern d = Pattern.compile(" ");
    public String e = "";
    public StringBuilder f = new StringBuilder();
    public String g = "";
    public StringBuilder h = new StringBuilder();
    public StringBuilder i = new StringBuilder();
    public boolean j = true;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public final PhoneNumberUtil n;
    public String o;
    public Phonemetadata$PhoneMetadata p;
    public Phonemetadata$PhoneMetadata q;
    public int r = 0;
    public StringBuilder s = new StringBuilder();
    public boolean t = false;
    public String u = "";
    public StringBuilder v = new StringBuilder();
    public List<Phonemetadata$NumberFormat> w = new ArrayList();
    public RegexCache x = new RegexCache(64);

    static {
        Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata = new Phonemetadata$PhoneMetadata();
        phonemetadata$PhoneMetadata.D2 = "NA";
        a = phonemetadata$PhoneMetadata;
    }

    public a(PhoneNumberUtil phoneNumberUtil, String str) {
        this.n = phoneNumberUtil;
        this.o = str;
        Phonemetadata$PhoneMetadata h2 = h(str);
        this.q = h2;
        this.p = h2;
    }

    public final String a(String str) {
        int length = this.s.length();
        if (!this.t || length <= 0 || this.s.charAt(length - 1) == ' ') {
            return this.s + str;
        }
        return new String(this.s) + ' ' + str;
    }

    public final String b() {
        List<Phonemetadata$NumberFormat> list;
        if (this.v.length() < 3) {
            return a(this.v.toString());
        }
        String sb = this.v.toString();
        if (!(this.l && this.u.length() == 0) || this.q.Q2.size() <= 0) {
            list = this.q.P2;
        } else {
            list = this.q.Q2;
        }
        for (Phonemetadata$NumberFormat next : list) {
            if ((this.u.length() <= 0 || !PhoneNumberUtil.f(next.y) || next.Y1 || next.Z1) && ((this.u.length() != 0 || this.l || PhoneNumberUtil.f(next.y) || next.Y1) && b.matcher(next.d).matches())) {
                this.w.add(next);
            }
        }
        m(sb);
        String f2 = f();
        if (f2.length() > 0) {
            return f2;
        }
        return l() ? i() : this.h.toString();
    }

    public final String c() {
        this.j = true;
        this.m = false;
        this.w.clear();
        this.r = 0;
        this.f.setLength(0);
        this.g = "";
        return b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r0 = new java.lang.StringBuilder();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d() {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = r4.v
            int r0 = r0.length()
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            io.michaelrocks.libphonenumber.android.PhoneNumberUtil r2 = r4.n
            java.lang.StringBuilder r3 = r4.v
            int r2 = r2.d(r3, r0)
            if (r2 != 0) goto L_0x001a
            return r1
        L_0x001a:
            java.lang.StringBuilder r3 = r4.v
            r3.setLength(r1)
            java.lang.StringBuilder r1 = r4.v
            r1.append(r0)
            io.michaelrocks.libphonenumber.android.PhoneNumberUtil r0 = r4.n
            java.lang.String r0 = r0.n(r2)
            java.lang.String r1 = "001"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x003b
            io.michaelrocks.libphonenumber.android.PhoneNumberUtil r0 = r4.n
            io.michaelrocks.libphonenumber.android.Phonemetadata$PhoneMetadata r0 = r0.h(r2)
            r4.q = r0
            goto L_0x0049
        L_0x003b:
            java.lang.String r1 = r4.o
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0049
            io.michaelrocks.libphonenumber.android.Phonemetadata$PhoneMetadata r0 = r4.h(r0)
            r4.q = r0
        L_0x0049:
            java.lang.String r0 = java.lang.Integer.toString(r2)
            java.lang.StringBuilder r1 = r4.s
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            java.lang.String r0 = ""
            r4.u = r0
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.a.a.a.a.d():boolean");
    }

    public final boolean e() {
        RegexCache regexCache = this.x;
        StringBuilder P0 = i0.d.a.a.a.P0("\\+|");
        P0.append(this.q.D2);
        Matcher matcher = regexCache.a(P0.toString()).matcher(this.i);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.l = true;
        int end = matcher.end();
        this.v.setLength(0);
        this.v.append(this.i.substring(end));
        this.s.setLength(0);
        this.s.append(this.i.substring(0, end));
        if (this.i.charAt(0) != '+') {
            this.s.append(' ');
        }
        return true;
    }

    public String f() {
        for (Phonemetadata$NumberFormat next : this.w) {
            Matcher matcher = this.x.a(next.c).matcher(this.v);
            if (matcher.matches()) {
                this.t = c.matcher(next.y).find();
                String a2 = a(matcher.replaceAll(next.d));
                if (PhoneNumberUtil.x(a2, PhoneNumberUtil.c, true).contentEquals(this.i)) {
                    return a2;
                }
            }
        }
        return "";
    }

    public void g() {
        this.e = "";
        this.h.setLength(0);
        this.i.setLength(0);
        this.f.setLength(0);
        this.r = 0;
        this.g = "";
        this.s.setLength(0);
        this.u = "";
        this.v.setLength(0);
        this.j = true;
        this.k = false;
        this.l = false;
        this.m = false;
        this.w.clear();
        this.t = false;
        if (!this.q.equals(this.p)) {
            this.q = h(this.o);
        }
    }

    public final Phonemetadata$PhoneMetadata h(String str) {
        int i2;
        PhoneNumberUtil phoneNumberUtil = this.n;
        if (!phoneNumberUtil.r(str)) {
            Logger logger = PhoneNumberUtil.a;
            Level level = Level.WARNING;
            StringBuilder P0 = i0.d.a.a.a.P0("Invalid or missing region code (");
            if (str == null) {
                str = "null";
            }
            P0.append(str);
            P0.append(") provided.");
            logger.log(level, P0.toString());
            i2 = 0;
        } else {
            i2 = phoneNumberUtil.g(str);
        }
        Phonemetadata$PhoneMetadata i3 = this.n.i(this.n.n(i2));
        if (i3 != null) {
            return i3;
        }
        return a;
    }

    public final String i() {
        int length = this.v.length();
        if (length <= 0) {
            return this.s.toString();
        }
        String str = "";
        for (int i2 = 0; i2 < length; i2++) {
            str = k(this.v.charAt(i2));
        }
        return this.j ? a(str) : this.h.toString();
    }

    public String j(char c2) {
        String str;
        this.h.append(c2);
        if (!(Character.isDigit(c2) || (this.h.length() == 1 && PhoneNumberUtil.h.matcher(Character.toString(c2)).matches()))) {
            this.j = false;
            this.k = true;
        } else if (c2 == '+') {
            this.i.append(c2);
        } else {
            c2 = Character.forDigit(Character.digit(c2, 10), 10);
            this.i.append(c2);
            this.v.append(c2);
        }
        if (this.j) {
            int length = this.i.length();
            if (length == 0 || length == 1 || length == 2) {
                str = this.h.toString();
            } else {
                if (length == 3) {
                    if (e()) {
                        this.m = true;
                    } else {
                        this.u = n();
                        str = b();
                    }
                }
                if (this.m) {
                    if (d()) {
                        this.m = false;
                    }
                    str = this.s + this.v.toString();
                } else if (this.w.size() > 0) {
                    String k2 = k(c2);
                    String f2 = f();
                    if (f2.length() > 0) {
                        str = f2;
                    } else {
                        m(this.v.toString());
                        if (l()) {
                            str = i();
                        } else if (this.j) {
                            str = a(k2);
                        } else {
                            str = this.h.toString();
                        }
                    }
                } else {
                    str = b();
                }
            }
        } else if (this.k) {
            str = this.h.toString();
        } else {
            if (!e()) {
                if (this.u.length() > 0) {
                    this.v.insert(0, this.u);
                    this.s.setLength(this.s.lastIndexOf(this.u));
                }
                if (!this.u.equals(n())) {
                    this.s.append(' ');
                    str = c();
                }
            } else if (d()) {
                str = c();
            }
            str = this.h.toString();
        }
        this.e = str;
        return str;
    }

    public final String k(char c2) {
        Matcher matcher = d.matcher(this.f);
        if (matcher.find(this.r)) {
            String replaceFirst = matcher.replaceFirst(Character.toString(c2));
            this.f.replace(0, replaceFirst.length(), replaceFirst);
            int start = matcher.start();
            this.r = start;
            return this.f.substring(0, start + 1);
        }
        if (this.w.size() == 1) {
            this.j = false;
        }
        this.g = "";
        return this.h.toString();
    }

    public final boolean l() {
        String str;
        boolean z;
        Iterator<Phonemetadata$NumberFormat> it = this.w.iterator();
        while (it.hasNext()) {
            Phonemetadata$NumberFormat next = it.next();
            String str2 = next.c;
            if (this.g.equals(str2)) {
                return false;
            }
            String str3 = next.c;
            this.f.setLength(0);
            String str4 = next.d;
            Matcher matcher = this.x.a(str3).matcher("999999999999999");
            matcher.find();
            String group = matcher.group();
            if (group.length() < this.v.length()) {
                str = "";
            } else {
                str = group.replaceAll(str3, str4).replaceAll("9", " ");
            }
            if (str.length() > 0) {
                this.f.append(str);
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.g = str2;
                this.t = c.matcher(next.y).find();
                this.r = 0;
                return true;
            }
            it.remove();
        }
        this.j = false;
        return false;
    }

    public final void m(String str) {
        int length = str.length() - 3;
        Iterator<Phonemetadata$NumberFormat> it = this.w.iterator();
        while (it.hasNext()) {
            Phonemetadata$NumberFormat next = it.next();
            if (next.a() != 0) {
                if (!this.x.a(next.q.get(Math.min(length, next.a() - 1))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    public final String n() {
        int i2 = 1;
        if (this.q.C2 == 1 && this.v.charAt(0) == '1' && this.v.charAt(1) != '0' && this.v.charAt(1) != '1') {
            StringBuilder sb = this.s;
            sb.append('1');
            sb.append(' ');
            this.l = true;
        } else {
            Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata = this.q;
            if (phonemetadata$PhoneMetadata.K2) {
                Matcher matcher = this.x.a(phonemetadata$PhoneMetadata.L2).matcher(this.v);
                if (matcher.lookingAt() && matcher.end() > 0) {
                    this.l = true;
                    i2 = matcher.end();
                    this.s.append(this.v.substring(0, i2));
                }
            }
            i2 = 0;
        }
        String substring = this.v.substring(0, i2);
        this.v.delete(0, i2);
        return substring;
    }
}
