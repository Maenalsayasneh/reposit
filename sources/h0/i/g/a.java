package h0.i.g;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import h0.i.g.d;
import java.util.Locale;

/* compiled from: BidiFormatter */
public final class a {
    public static final c a;
    public static final String b = Character.toString(8206);
    public static final String c = Character.toString(8207);
    public static final a d;
    public static final a e;
    public final boolean f;
    public final int g;
    public final c h;

    /* renamed from: h0.i.g.a$a  reason: collision with other inner class name */
    /* compiled from: BidiFormatter */
    public static class C0043a {
        public static final byte[] a = new byte[1792];
        public final CharSequence b;
        public final int c;
        public int d;
        public char e;

        static {
            for (int i = 0; i < 1792; i++) {
                a[i] = Character.getDirectionality(i);
            }
        }

        public C0043a(CharSequence charSequence, boolean z) {
            this.b = charSequence;
            this.c = charSequence.length();
        }

        public byte a() {
            char charAt = this.b.charAt(this.d - 1);
            this.e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.b, this.d);
                this.d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.d--;
            char c2 = this.e;
            return c2 < 1792 ? a[c2] : Character.getDirectionality(c2);
        }
    }

    static {
        c cVar = d.c;
        a = cVar;
        d = new a(false, 2, cVar);
        e = new a(true, 2, cVar);
    }

    public a(boolean z, int i, c cVar) {
        this.f = z;
        this.g = i;
        this.h = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.CharSequence r9) {
        /*
            h0.i.g.a$a r0 = new h0.i.g.a$a
            r1 = 0
            r0.<init>(r9, r1)
            r0.d = r1
            r9 = -1
            r2 = 1
            r3 = r1
            r4 = r3
            r5 = r4
        L_0x000d:
            int r6 = r0.d
            int r7 = r0.c
            if (r6 >= r7) goto L_0x0070
            if (r3 != 0) goto L_0x0070
            java.lang.CharSequence r7 = r0.b
            char r6 = r7.charAt(r6)
            r0.e = r6
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L_0x0039
            java.lang.CharSequence r6 = r0.b
            int r7 = r0.d
            int r6 = java.lang.Character.codePointAt(r6, r7)
            int r7 = r0.d
            int r8 = java.lang.Character.charCount(r6)
            int r8 = r8 + r7
            r0.d = r8
            byte r6 = java.lang.Character.getDirectionality(r6)
            goto L_0x004d
        L_0x0039:
            int r6 = r0.d
            int r6 = r6 + r2
            r0.d = r6
            char r6 = r0.e
            r7 = 1792(0x700, float:2.511E-42)
            if (r6 >= r7) goto L_0x0049
            byte[] r7 = h0.i.g.a.C0043a.a
            byte r6 = r7[r6]
            goto L_0x004d
        L_0x0049:
            byte r6 = java.lang.Character.getDirectionality(r6)
        L_0x004d:
            if (r6 == 0) goto L_0x006b
            if (r6 == r2) goto L_0x0068
            r7 = 2
            if (r6 == r7) goto L_0x0068
            r7 = 9
            if (r6 == r7) goto L_0x000d
            switch(r6) {
                case 14: goto L_0x0064;
                case 15: goto L_0x0064;
                case 16: goto L_0x0060;
                case 17: goto L_0x0060;
                case 18: goto L_0x005c;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x006e
        L_0x005c:
            int r5 = r5 + -1
            r4 = r1
            goto L_0x000d
        L_0x0060:
            int r5 = r5 + 1
            r4 = r2
            goto L_0x000d
        L_0x0064:
            int r5 = r5 + 1
            r4 = r9
            goto L_0x000d
        L_0x0068:
            if (r5 != 0) goto L_0x006e
            goto L_0x0088
        L_0x006b:
            if (r5 != 0) goto L_0x006e
            goto L_0x008c
        L_0x006e:
            r3 = r5
            goto L_0x000d
        L_0x0070:
            if (r3 != 0) goto L_0x0073
            goto L_0x0091
        L_0x0073:
            if (r4 == 0) goto L_0x0077
            r1 = r4
            goto L_0x0091
        L_0x0077:
            int r4 = r0.d
            if (r4 <= 0) goto L_0x0091
            byte r4 = r0.a()
            switch(r4) {
                case 14: goto L_0x008a;
                case 15: goto L_0x008a;
                case 16: goto L_0x0086;
                case 17: goto L_0x0086;
                case 18: goto L_0x0083;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x0077
        L_0x0083:
            int r5 = r5 + 1
            goto L_0x0077
        L_0x0086:
            if (r3 != r5) goto L_0x008e
        L_0x0088:
            r1 = r2
            goto L_0x0091
        L_0x008a:
            if (r3 != r5) goto L_0x008e
        L_0x008c:
            r1 = r9
            goto L_0x0091
        L_0x008e:
            int r5 = r5 + -1
            goto L_0x0077
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.i.g.a.a(java.lang.CharSequence):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(java.lang.CharSequence r6) {
        /*
            h0.i.g.a$a r0 = new h0.i.g.a$a
            r1 = 0
            r0.<init>(r6, r1)
            int r6 = r0.c
            r0.d = r6
            r6 = r1
        L_0x000b:
            r2 = r6
        L_0x000c:
            int r3 = r0.d
            r4 = 1
            if (r3 <= 0) goto L_0x0041
            byte r3 = r0.a()
            if (r3 == 0) goto L_0x0039
            if (r3 == r4) goto L_0x0032
            r5 = 2
            if (r3 == r5) goto L_0x0032
            r5 = 9
            if (r3 == r5) goto L_0x000c
            switch(r3) {
                case 14: goto L_0x002c;
                case 15: goto L_0x002c;
                case 16: goto L_0x0029;
                case 17: goto L_0x0029;
                case 18: goto L_0x0026;
                default: goto L_0x0023;
            }
        L_0x0023:
            if (r6 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0029:
            if (r6 != r2) goto L_0x002f
            goto L_0x0034
        L_0x002c:
            if (r6 != r2) goto L_0x002f
            goto L_0x003b
        L_0x002f:
            int r2 = r2 + -1
            goto L_0x000c
        L_0x0032:
            if (r2 != 0) goto L_0x0036
        L_0x0034:
            r1 = r4
            goto L_0x0041
        L_0x0036:
            if (r6 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0039:
            if (r2 != 0) goto L_0x003d
        L_0x003b:
            r1 = -1
            goto L_0x0041
        L_0x003d:
            if (r6 != 0) goto L_0x000c
        L_0x003f:
            r6 = r2
            goto L_0x000b
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.i.g.a.b(java.lang.CharSequence):int");
    }

    public static a c() {
        Locale locale = Locale.getDefault();
        Locale locale2 = e.a;
        boolean z = true;
        if (TextUtils.getLayoutDirectionFromLocale(locale) != 1) {
            z = false;
        }
        c cVar = a;
        if (cVar == a) {
            return z ? e : d;
        }
        return new a(z, 2, cVar);
    }

    public CharSequence d(CharSequence charSequence) {
        return e(charSequence, this.h, true);
    }

    public CharSequence e(CharSequence charSequence, c cVar, boolean z) {
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean b2 = ((d.c) cVar).b(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str2 = "";
        if (((this.g & 2) != 0) && z) {
            boolean b3 = ((d.c) (b2 ? d.b : d.a)).b(charSequence, 0, charSequence.length());
            if (this.f || (!b3 && a(charSequence) != 1)) {
                str = (!this.f || (b3 && a(charSequence) != -1)) ? str2 : c;
            } else {
                str = b;
            }
            spannableStringBuilder.append(str);
        }
        if (b2 != this.f) {
            spannableStringBuilder.append(b2 ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            boolean b4 = ((d.c) (b2 ? d.b : d.a)).b(charSequence, 0, charSequence.length());
            if (!this.f && (b4 || b(charSequence) == 1)) {
                str2 = b;
            } else if (this.f && (!b4 || b(charSequence) == -1)) {
                str2 = c;
            }
            spannableStringBuilder.append(str2);
        }
        return spannableStringBuilder;
    }
}
