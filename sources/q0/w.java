package q0;

import com.pubnub.api.builder.PubNubErrorBuilder;
import i0.j.f.p.h;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.f;
import m0.n.b.i;
import q0.h0.c;

/* compiled from: HttpUrl.kt */
public final class w {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final b b = new b((f) null);
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final List<String> i;
    public final List<String> j;
    public final String k;
    public final String l;

    /* compiled from: HttpUrl.kt */
    public static final class a {
        public static final C0293a a = new C0293a((f) null);
        public String b;
        public String c = "";
        public String d = "";
        public String e;
        public int f = -1;
        public final List<String> g;
        public List<String> h;
        public String i;

        /* renamed from: q0.w$a$a  reason: collision with other inner class name */
        /* compiled from: HttpUrl.kt */
        public static final class C0293a {
            public C0293a(f fVar) {
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.g = arrayList;
            arrayList.add("");
        }

        public final a a(String str, String str2) {
            i.e(str, "name");
            if (this.h == null) {
                this.h = new ArrayList();
            }
            List<String> list = this.h;
            i.c(list);
            b bVar = w.b;
            list.add(b.a(bVar, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219));
            List<String> list2 = this.h;
            i.c(list2);
            list2.add(str2 != null ? b.a(bVar, str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219) : null);
            return this;
        }

        public final w b() {
            int i2;
            ArrayList arrayList;
            String str = this.b;
            if (str != null) {
                b bVar = w.b;
                b bVar2 = bVar;
                String d2 = b.d(bVar2, this.c, 0, 0, false, 7);
                String d3 = b.d(bVar2, this.d, 0, 0, false, 7);
                String str2 = this.e;
                if (str2 != null) {
                    int i3 = this.f;
                    if (i3 != -1) {
                        i2 = i3;
                    } else {
                        String str3 = this.b;
                        i.c(str3);
                        i2 = bVar.b(str3);
                    }
                    List<String> list = this.g;
                    ArrayList arrayList2 = new ArrayList(h.K(list, 10));
                    for (String d4 : list) {
                        arrayList2.add(b.d(w.b, d4, 0, 0, false, 7));
                    }
                    List<String> list2 = this.h;
                    if (list2 != null) {
                        arrayList = new ArrayList(h.K(list2, 10));
                        for (String str4 : list2) {
                            arrayList.add(str4 != null ? b.d(w.b, str4, 0, 0, true, 3) : null);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str5 = this.i;
                    return new w(str, d2, d3, str2, i2, arrayList2, arrayList, str5 != null ? b.d(w.b, str5, 0, 0, false, 7) : null, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final a c(String str) {
            List<String> list;
            if (str != null) {
                b bVar = w.b;
                list = bVar.e(b.a(bVar, str, 0, 0, " \"'<>#", true, false, true, false, (Charset) null, 211));
            } else {
                list = null;
            }
            this.h = list;
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: int} */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:134:0x0312  */
        /* JADX WARNING: Removed duplicated region for block: B:214:0x03da A[SYNTHETIC] */
        public final q0.w.a d(q0.w r26, java.lang.String r27) {
            /*
                r25 = this;
                r0 = r25
                r1 = r26
                r12 = r27
                java.lang.String r2 = "input"
                m0.n.b.i.e(r12, r2)
                byte[] r2 = q0.h0.c.a
                int r2 = r27.length()
                r3 = 0
                int r2 = q0.h0.c.n(r12, r3, r2)
                int r4 = r27.length()
                int r13 = q0.h0.c.o(r12, r2, r4)
                int r4 = r13 - r2
                r5 = -1
                r14 = 58
                r6 = 1
                r7 = 2
                if (r4 >= r7) goto L_0x0029
                goto L_0x0082
            L_0x0029:
                char r4 = r12.charAt(r2)
                r8 = 97
                int r9 = m0.n.b.i.g(r4, r8)
                r10 = 122(0x7a, float:1.71E-43)
                r11 = 65
                r15 = 90
                if (r9 < 0) goto L_0x0041
                int r9 = m0.n.b.i.g(r4, r10)
                if (r9 <= 0) goto L_0x004e
            L_0x0041:
                int r9 = m0.n.b.i.g(r4, r11)
                if (r9 < 0) goto L_0x0082
                int r4 = m0.n.b.i.g(r4, r15)
                if (r4 <= 0) goto L_0x004e
                goto L_0x0082
            L_0x004e:
                r4 = r2
            L_0x004f:
                int r4 = r4 + r6
                if (r4 >= r13) goto L_0x0082
                char r9 = r12.charAt(r4)
                if (r8 <= r9) goto L_0x0059
                goto L_0x005c
            L_0x0059:
                if (r10 < r9) goto L_0x005c
                goto L_0x007a
            L_0x005c:
                if (r11 <= r9) goto L_0x005f
                goto L_0x0062
            L_0x005f:
                if (r15 < r9) goto L_0x0062
                goto L_0x007a
            L_0x0062:
                r8 = 57
                r10 = 48
                if (r10 <= r9) goto L_0x0069
                goto L_0x006c
            L_0x0069:
                if (r8 < r9) goto L_0x006c
                goto L_0x007a
            L_0x006c:
                r8 = 43
                if (r9 != r8) goto L_0x0071
                goto L_0x007a
            L_0x0071:
                r8 = 45
                if (r9 != r8) goto L_0x0076
                goto L_0x007a
            L_0x0076:
                r8 = 46
                if (r9 != r8) goto L_0x007f
            L_0x007a:
                r8 = 97
                r10 = 122(0x7a, float:1.71E-43)
                goto L_0x004f
            L_0x007f:
                if (r9 != r14) goto L_0x0082
                goto L_0x0083
            L_0x0082:
                r4 = r5
            L_0x0083:
                java.lang.String r15 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                if (r4 == r5) goto L_0x00c4
                java.lang.String r8 = "https:"
                boolean r8 = kotlin.text.StringsKt__IndentKt.F(r12, r8, r2, r6)
                if (r8 == 0) goto L_0x0096
                java.lang.String r4 = "https"
                r0.b = r4
                int r2 = r2 + 6
                goto L_0x00ca
            L_0x0096:
                java.lang.String r8 = "http:"
                boolean r8 = kotlin.text.StringsKt__IndentKt.F(r12, r8, r2, r6)
                if (r8 == 0) goto L_0x00a5
                java.lang.String r4 = "http"
                r0.b = r4
                int r2 = r2 + 5
                goto L_0x00ca
            L_0x00a5:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Expected URL scheme 'http' or 'https' but was '"
                java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
                java.lang.String r3 = r12.substring(r3, r4)
                m0.n.b.i.d(r3, r15)
                r2.append(r3)
                java.lang.String r3 = "'"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x00c4:
                if (r1 == 0) goto L_0x0454
                java.lang.String r4 = r1.d
                r0.b = r4
            L_0x00ca:
                r4 = r2
            L_0x00cb:
                r8 = 92
                r9 = 47
                if (r4 >= r13) goto L_0x00de
                char r10 = r12.charAt(r4)
                if (r10 == r8) goto L_0x00d9
                if (r10 != r9) goto L_0x00de
            L_0x00d9:
                int r3 = r3 + 1
                int r4 = r4 + 1
                goto L_0x00cb
            L_0x00de:
                r4 = 63
                r10 = 35
                if (r3 >= r7) goto L_0x0127
                if (r1 == 0) goto L_0x0127
                java.lang.String r7 = r1.d
                java.lang.String r11 = r0.b
                boolean r7 = m0.n.b.i.a(r7, r11)
                r7 = r7 ^ r6
                if (r7 == 0) goto L_0x00f2
                goto L_0x0127
            L_0x00f2:
                java.lang.String r3 = r26.e()
                r0.c = r3
                java.lang.String r3 = r26.a()
                r0.d = r3
                java.lang.String r3 = r1.g
                r0.e = r3
                int r3 = r1.h
                r0.f = r3
                java.util.List<java.lang.String> r3 = r0.g
                r3.clear()
                java.util.List<java.lang.String> r3 = r0.g
                java.util.List r4 = r26.c()
                r3.addAll(r4)
                if (r2 == r13) goto L_0x011c
                char r3 = r12.charAt(r2)
                if (r3 != r10) goto L_0x0123
            L_0x011c:
                java.lang.String r1 = r26.d()
                r0.c(r1)
            L_0x0123:
                r20 = r13
                goto L_0x02c8
            L_0x0127:
                int r2 = r2 + r3
                r1 = 0
                r3 = 0
                r16 = r1
                r11 = r2
                r17 = r3
            L_0x012f:
                java.lang.String r1 = "@/\\?#"
                int r7 = q0.h0.c.g(r12, r1, r11, r13)
                if (r7 == r13) goto L_0x013c
                char r1 = r12.charAt(r7)
                goto L_0x013d
            L_0x013c:
                r1 = r5
            L_0x013d:
                if (r1 == r5) goto L_0x01ed
                if (r1 == r10) goto L_0x01ed
                if (r1 == r9) goto L_0x01ed
                if (r1 == r8) goto L_0x01ed
                if (r1 == r4) goto L_0x01ed
                r2 = 64
                if (r1 == r2) goto L_0x014f
                r20 = r13
                goto L_0x01de
            L_0x014f:
                java.lang.String r10 = "%40"
                if (r16 != 0) goto L_0x01ad
                int r9 = q0.h0.c.f(r12, r14, r11, r7)
                q0.w$b r18 = q0.w.b
                r6 = 1
                r8 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r18
                r2 = r27
                r3 = r11
                r4 = r9
                r11 = r7
                r7 = r8
                r8 = r19
                r14 = r9
                r9 = r20
                r23 = r10
                r10 = r21
                r20 = r13
                r13 = r11
                r11 = r22
                java.lang.String r1 = q0.w.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r17 == 0) goto L_0x018e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.c
                r4 = r23
                java.lang.String r1 = i0.d.a.a.a.z0(r2, r3, r4, r1)
            L_0x018e:
                r0.c = r1
                if (r14 == r13) goto L_0x01aa
                int r3 = r14 + 1
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r18
                r2 = r27
                r4 = r13
                java.lang.String r1 = q0.w.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r0.d = r1
                r16 = 1
            L_0x01aa:
                r17 = 1
                goto L_0x01dc
            L_0x01ad:
                r4 = r10
                r20 = r13
                r13 = r7
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r1 = r0.d
                r14.append(r1)
                r14.append(r4)
                q0.w$b r1 = q0.w.b
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r18 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r2 = r27
                r3 = r11
                r4 = r13
                r11 = r18
                java.lang.String r1 = q0.w.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r14.append(r1)
                java.lang.String r1 = r14.toString()
                r0.d = r1
            L_0x01dc:
                int r11 = r13 + 1
            L_0x01de:
                r10 = 35
                r4 = 63
                r9 = 47
                r8 = 92
                r5 = -1
                r13 = r20
                r14 = 58
                goto L_0x012f
            L_0x01ed:
                r20 = r13
                r13 = r7
                r7 = r11
            L_0x01f1:
                if (r7 >= r13) goto L_0x0213
                char r1 = r12.charAt(r7)
                r2 = 58
                if (r1 == r2) goto L_0x020f
                r3 = 91
                if (r1 == r3) goto L_0x0200
                goto L_0x020c
            L_0x0200:
                int r7 = r7 + 1
                if (r7 >= r13) goto L_0x020c
                char r1 = r12.charAt(r7)
                r3 = 93
                if (r1 != r3) goto L_0x0200
            L_0x020c:
                int r7 = r7 + 1
                goto L_0x01f1
            L_0x020f:
                r1 = 1
                r14 = r1
                r10 = r7
                goto L_0x0216
            L_0x0213:
                r1 = 1
                r14 = r1
                r10 = r13
            L_0x0216:
                int r9 = r10 + 1
                r7 = 34
                if (r9 >= r13) goto L_0x0299
                q0.w$b r7 = q0.w.b
                r5 = 0
                r6 = 4
                r1 = r7
                r2 = r27
                r3 = r11
                r4 = r10
                java.lang.String r1 = q0.w.b.d(r1, r2, r3, r4, r5, r6)
                java.lang.String r1 = m0.r.t.a.r.m.a1.a.Y3(r1)
                r0.e = r1
                java.lang.String r5 = ""
                r6 = 0
                r8 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 248(0xf8, float:3.48E-43)
                r1 = r7
                r2 = r27
                r3 = r9
                r4 = r13
                r7 = r8
                r8 = r16
                r24 = r9
                r9 = r17
                r26 = r10
                r10 = r18
                r16 = r11
                r11 = r19
                java.lang.String r1 = q0.w.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ NumberFormatException -> 0x0266 }
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0266 }
                r2 = 65535(0xffff, float:9.1834E-41)
                if (r14 <= r1) goto L_0x025d
                goto L_0x0266
            L_0x025d:
                if (r2 < r1) goto L_0x0266
                goto L_0x0267
            L_0x0260:
                r24 = r9
                r26 = r10
                r16 = r11
            L_0x0266:
                r1 = -1
            L_0x0267:
                r0.f = r1
                r2 = -1
                if (r1 == r2) goto L_0x026e
                r1 = r14
                goto L_0x026f
            L_0x026e:
                r1 = 0
            L_0x026f:
                if (r1 == 0) goto L_0x0274
                r7 = 34
                goto L_0x02bd
            L_0x0274:
                java.lang.String r1 = "Invalid URL port: \""
                java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
                r10 = r24
                java.lang.String r2 = r12.substring(r10, r13)
                m0.n.b.i.d(r2, r15)
                r1.append(r2)
                r2 = 34
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L_0x0299:
                r26 = r10
                r16 = r11
                q0.w$b r8 = q0.w.b
                r5 = 0
                r6 = 4
                r1 = r8
                r2 = r27
                r3 = r16
                r4 = r26
                java.lang.String r1 = q0.w.b.d(r1, r2, r3, r4, r5, r6)
                java.lang.String r1 = m0.r.t.a.r.m.a1.a.Y3(r1)
                r0.e = r1
                java.lang.String r1 = r0.b
                m0.n.b.i.c(r1)
                int r1 = r8.b(r1)
                r0.f = r1
            L_0x02bd:
                java.lang.String r1 = r0.e
                if (r1 == 0) goto L_0x02c3
                r1 = r14
                goto L_0x02c4
            L_0x02c3:
                r1 = 0
            L_0x02c4:
                if (r1 == 0) goto L_0x042f
                r2 = r13
                r6 = r14
            L_0x02c8:
                java.lang.String r1 = "?#"
                r3 = r20
                int r1 = q0.h0.c.g(r12, r1, r2, r3)
                if (r2 != r1) goto L_0x02d7
                r15 = r0
                r14 = r3
                r13 = r12
                goto L_0x03de
            L_0x02d7:
                char r4 = r12.charAt(r2)
                java.lang.String r5 = ""
                r7 = 47
                if (r4 == r7) goto L_0x02fb
                r7 = 92
                if (r4 != r7) goto L_0x02e6
                goto L_0x02fb
            L_0x02e6:
                java.util.List<java.lang.String> r4 = r0.g
                int r7 = r4.size()
                int r7 = r7 - r6
                r4.set(r7, r5)
                r8 = r0
                r9 = r8
                r4 = r1
                r13 = r3
                r7 = r6
                r3 = r4
                r6 = r5
                r1 = r12
                r5 = r2
                r2 = r1
                goto L_0x0310
            L_0x02fb:
                java.util.List<java.lang.String> r4 = r0.g
                r4.clear()
                java.util.List<java.lang.String> r4 = r0.g
                r4.add(r5)
                r8 = r0
                r9 = r8
                r4 = r1
                r13 = r3
                r7 = r6
                r3 = r4
                r6 = r5
                r1 = r12
                r5 = r2
                r2 = r1
            L_0x030f:
                int r5 = r5 + r7
            L_0x0310:
                if (r5 >= r4) goto L_0x03da
                java.lang.String r10 = "/\\"
                int r10 = q0.h0.c.g(r1, r10, r5, r4)
                if (r10 >= r4) goto L_0x031c
                r11 = r7
                goto L_0x031d
            L_0x031c:
                r11 = 0
            L_0x031d:
                r19 = 1
                q0.w$b r14 = q0.w.b
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 240(0xf0, float:3.36E-43)
                java.lang.String r18 = " \"<>^`{}|/\\?#"
                r15 = r1
                r16 = r5
                r17 = r10
                java.lang.String r5 = q0.w.b.a(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                java.lang.String r14 = "."
                boolean r14 = m0.n.b.i.a(r5, r14)
                if (r14 != 0) goto L_0x0349
                java.lang.String r14 = "%2e"
                boolean r14 = kotlin.text.StringsKt__IndentKt.f(r5, r14, r7)
                if (r14 == 0) goto L_0x0347
                goto L_0x0349
            L_0x0347:
                r14 = 0
                goto L_0x034a
            L_0x0349:
                r14 = r7
            L_0x034a:
                if (r14 == 0) goto L_0x034e
                goto L_0x03d5
            L_0x034e:
                java.lang.String r14 = ".."
                boolean r14 = m0.n.b.i.a(r5, r14)
                if (r14 != 0) goto L_0x0371
                java.lang.String r14 = "%2e."
                boolean r14 = kotlin.text.StringsKt__IndentKt.f(r5, r14, r7)
                if (r14 != 0) goto L_0x0371
                java.lang.String r14 = ".%2e"
                boolean r14 = kotlin.text.StringsKt__IndentKt.f(r5, r14, r7)
                if (r14 != 0) goto L_0x0371
                java.lang.String r14 = "%2e%2e"
                boolean r14 = kotlin.text.StringsKt__IndentKt.f(r5, r14, r7)
                if (r14 == 0) goto L_0x036f
                goto L_0x0371
            L_0x036f:
                r14 = 0
                goto L_0x0372
            L_0x0371:
                r14 = r7
            L_0x0372:
                if (r14 == 0) goto L_0x03a6
                java.util.List<java.lang.String> r5 = r9.g
                int r14 = r5.size()
                int r14 = r14 - r7
                java.lang.Object r5 = r5.remove(r14)
                java.lang.String r5 = (java.lang.String) r5
                int r5 = r5.length()
                if (r5 != 0) goto L_0x0389
                r5 = r7
                goto L_0x038a
            L_0x0389:
                r5 = 0
            L_0x038a:
                if (r5 == 0) goto L_0x03a0
                java.util.List<java.lang.String> r5 = r9.g
                boolean r5 = r5.isEmpty()
                r5 = r5 ^ r7
                if (r5 == 0) goto L_0x03a0
                java.util.List<java.lang.String> r5 = r9.g
                int r14 = r5.size()
                int r14 = r14 - r7
                r5.set(r14, r6)
                goto L_0x03d5
            L_0x03a0:
                java.util.List<java.lang.String> r5 = r9.g
                r5.add(r6)
                goto L_0x03d5
            L_0x03a6:
                java.util.List<java.lang.String> r14 = r9.g
                int r15 = r14.size()
                int r15 = r15 - r7
                java.lang.Object r14 = r14.get(r15)
                java.lang.CharSequence r14 = (java.lang.CharSequence) r14
                int r14 = r14.length()
                if (r14 != 0) goto L_0x03bb
                r14 = r7
                goto L_0x03bc
            L_0x03bb:
                r14 = 0
            L_0x03bc:
                if (r14 == 0) goto L_0x03c9
                java.util.List<java.lang.String> r14 = r9.g
                int r15 = r14.size()
                int r15 = r15 - r7
                r14.set(r15, r5)
                goto L_0x03ce
            L_0x03c9:
                java.util.List<java.lang.String> r14 = r9.g
                r14.add(r5)
            L_0x03ce:
                if (r11 == 0) goto L_0x03d5
                java.util.List<java.lang.String> r5 = r9.g
                r5.add(r6)
            L_0x03d5:
                r5 = r10
                if (r11 == 0) goto L_0x0310
                goto L_0x030f
            L_0x03da:
                r1 = r3
                r15 = r8
                r14 = r13
                r13 = r2
            L_0x03de:
                if (r1 >= r14) goto L_0x040e
                char r2 = r12.charAt(r1)
                r3 = 63
                if (r2 != r3) goto L_0x040e
                r2 = 35
                int r16 = q0.h0.c.f(r12, r2, r1, r14)
                q0.w$b r11 = q0.w.b
                int r3 = r1 + 1
                r6 = 1
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r17 = 208(0xd0, float:2.91E-43)
                java.lang.String r5 = " \"'<>#"
                r1 = r11
                r2 = r13
                r4 = r16
                r0 = r11
                r11 = r17
                java.lang.String r1 = q0.w.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                java.util.List r0 = r0.e(r1)
                r15.h = r0
                r1 = r16
            L_0x040e:
                if (r1 >= r14) goto L_0x042e
                char r0 = r12.charAt(r1)
                r2 = 35
                if (r0 != r2) goto L_0x042e
                q0.w$b r0 = q0.w.b
                int r3 = r1 + 1
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 1
                r10 = 0
                r11 = 176(0xb0, float:2.47E-43)
                java.lang.String r5 = ""
                r1 = r0
                r2 = r13
                r4 = r14
                java.lang.String r0 = q0.w.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r15.i = r0
            L_0x042e:
                return r15
            L_0x042f:
                java.lang.String r0 = "Invalid URL host: \""
                java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
                r13 = r26
                r2 = r16
                java.lang.String r1 = r12.substring(r2, r13)
                m0.n.b.i.d(r1, r15)
                r0.append(r1)
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L_0x0454:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expected URL scheme 'http' or 'https' but no colon was found"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: q0.w.a.d(q0.w, java.lang.String):q0.w$a");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
            if ((r6.d.length() > 0) != false) goto L_0x0035;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x009a, code lost:
            if (r1 != r5.b(r3)) goto L_0x009c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.b
                if (r1 == 0) goto L_0x0012
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L_0x0017
            L_0x0012:
                java.lang.String r1 = "//"
                r0.append(r1)
            L_0x0017:
                java.lang.String r1 = r6.c
                int r1 = r1.length()
                r2 = 0
                r3 = 1
                if (r1 <= 0) goto L_0x0023
                r1 = r3
                goto L_0x0024
            L_0x0023:
                r1 = r2
            L_0x0024:
                r4 = 58
                if (r1 != 0) goto L_0x0035
                java.lang.String r1 = r6.d
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0032
                r1 = r3
                goto L_0x0033
            L_0x0032:
                r1 = r2
            L_0x0033:
                if (r1 == 0) goto L_0x0053
            L_0x0035:
                java.lang.String r1 = r6.c
                r0.append(r1)
                java.lang.String r1 = r6.d
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0043
                goto L_0x0044
            L_0x0043:
                r3 = r2
            L_0x0044:
                if (r3 == 0) goto L_0x004e
                r0.append(r4)
                java.lang.String r1 = r6.d
                r0.append(r1)
            L_0x004e:
                r1 = 64
                r0.append(r1)
            L_0x0053:
                java.lang.String r1 = r6.e
                if (r1 == 0) goto L_0x0076
                m0.n.b.i.c(r1)
                r3 = 2
                boolean r1 = kotlin.text.StringsKt__IndentKt.c(r1, r4, r2, r3)
                if (r1 == 0) goto L_0x0071
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.e
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L_0x0076
            L_0x0071:
                java.lang.String r1 = r6.e
                r0.append(r1)
            L_0x0076:
                int r1 = r6.f
                r3 = -1
                if (r1 != r3) goto L_0x007f
                java.lang.String r5 = r6.b
                if (r5 == 0) goto L_0x00a2
            L_0x007f:
                if (r1 == r3) goto L_0x0082
                goto L_0x008d
            L_0x0082:
                q0.w$b r1 = q0.w.b
                java.lang.String r3 = r6.b
                m0.n.b.i.c(r3)
                int r1 = r1.b(r3)
            L_0x008d:
                java.lang.String r3 = r6.b
                if (r3 == 0) goto L_0x009c
                q0.w$b r5 = q0.w.b
                m0.n.b.i.c(r3)
                int r3 = r5.b(r3)
                if (r1 == r3) goto L_0x00a2
            L_0x009c:
                r0.append(r4)
                r0.append(r1)
            L_0x00a2:
                java.util.List<java.lang.String> r1 = r6.g
                java.lang.String r3 = "$this$toPathString"
                m0.n.b.i.e(r1, r3)
                java.lang.String r3 = "out"
                m0.n.b.i.e(r0, r3)
                int r3 = r1.size()
            L_0x00b2:
                if (r2 >= r3) goto L_0x00c5
                r4 = 47
                r0.append(r4)
                java.lang.Object r4 = r1.get(r2)
                java.lang.String r4 = (java.lang.String) r4
                r0.append(r4)
                int r2 = r2 + 1
                goto L_0x00b2
            L_0x00c5:
                java.util.List<java.lang.String> r1 = r6.h
                if (r1 == 0) goto L_0x00d8
                r1 = 63
                r0.append(r1)
                q0.w$b r1 = q0.w.b
                java.util.List<java.lang.String> r2 = r6.h
                m0.n.b.i.c(r2)
                r1.f(r2, r0)
            L_0x00d8:
                java.lang.String r1 = r6.i
                if (r1 == 0) goto L_0x00e6
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.i
                r0.append(r1)
            L_0x00e6:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                m0.n.b.i.d(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: q0.w.a.toString():java.lang.String");
        }
    }

    /* compiled from: HttpUrl.kt */
    public static final class b {
        public b(f fVar) {
        }

        public static String a(b bVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3) {
            b bVar2 = bVar;
            String str3 = str;
            String str4 = str2;
            int i4 = i3;
            int i5 = (i4 & 1) != 0 ? 0 : i;
            int length = (i4 & 2) != 0 ? str.length() : i2;
            boolean z5 = (i4 & 8) != 0 ? false : z;
            boolean z6 = (i4 & 16) != 0 ? false : z2;
            boolean z7 = (i4 & 32) != 0 ? false : z3;
            boolean z8 = (i4 & 64) != 0 ? false : z4;
            int i6 = 128;
            Charset charset2 = (i4 & 128) != 0 ? null : charset;
            i.e(str3, "$this$canonicalize");
            i.e(str4, "encodeSet");
            int i7 = i5;
            while (i7 < length) {
                int codePointAt = str3.codePointAt(i7);
                int i8 = 32;
                int i9 = 2;
                if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= i6 && !z8) || StringsKt__IndentKt.c(str4, (char) codePointAt, false, 2) || ((codePointAt == 37 && (!z5 || (z6 && !bVar2.c(str3, i7, length)))) || (codePointAt == 43 && z7)))) {
                    r0.f fVar = new r0.f();
                    fVar.Y(str3, i5, i7);
                    r0.f fVar2 = null;
                    while (i7 < length) {
                        int codePointAt2 = str3.codePointAt(i7);
                        if (!z5 || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                            if (codePointAt2 != 43 || !z7) {
                                if (codePointAt2 >= i8 && codePointAt2 != 127 && (codePointAt2 < 128 || z8)) {
                                    if (!StringsKt__IndentKt.c(str4, (char) codePointAt2, false, i9) && (codePointAt2 != 37 || (z5 && (!z6 || bVar2.c(str3, i7, length))))) {
                                        fVar.Z(codePointAt2);
                                        i7 += Character.charCount(codePointAt2);
                                        i9 = 2;
                                        i8 = 32;
                                    }
                                }
                                if (fVar2 == null) {
                                    fVar2 = new r0.f();
                                }
                                if (charset2 == null || i.a(charset2, StandardCharsets.UTF_8)) {
                                    fVar2.Z(codePointAt2);
                                } else {
                                    fVar2.T(str3, i7, Character.charCount(codePointAt2) + i7, charset2);
                                }
                                while (!fVar2.t()) {
                                    byte readByte = fVar2.readByte() & 255;
                                    fVar.I(37);
                                    char[] cArr = w.a;
                                    fVar.I(cArr[(readByte >> 4) & 15]);
                                    fVar.I(cArr[readByte & 15]);
                                }
                                i7 += Character.charCount(codePointAt2);
                                i9 = 2;
                                i8 = 32;
                            } else {
                                fVar.U(z5 ? "+" : "%2B");
                            }
                        }
                        i7 += Character.charCount(codePointAt2);
                        i9 = 2;
                        i8 = 32;
                    }
                    return fVar.w();
                }
                i7 += Character.charCount(codePointAt);
                i6 = 128;
            }
            String substring = str3.substring(i5, length);
            i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public static String d(b bVar, String str, int i, int i2, boolean z, int i3) {
            int i4;
            int i5;
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            i.e(str, "$this$percentDecode");
            int i6 = i;
            while (i4 < i2) {
                char charAt = str.charAt(i4);
                if (charAt == '%' || (charAt == '+' && z)) {
                    r0.f fVar = new r0.f();
                    fVar.Y(str, i, i4);
                    while (i4 < i2) {
                        int codePointAt = str.codePointAt(i4);
                        if (codePointAt == 37 && (i5 = i4 + 2) < i2) {
                            int q = c.q(str.charAt(i4 + 1));
                            int q2 = c.q(str.charAt(i5));
                            if (!(q == -1 || q2 == -1)) {
                                fVar.I((q << 4) + q2);
                                i4 = Character.charCount(codePointAt) + i5;
                            }
                        } else if (codePointAt == 43 && z) {
                            fVar.I(32);
                            i4++;
                        }
                        fVar.Z(codePointAt);
                        i4 += Character.charCount(codePointAt);
                    }
                    return fVar.w();
                }
                i6 = i4 + 1;
            }
            String substring = str.substring(i, i2);
            i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final int b(String str) {
            i.e(str, "scheme");
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        public final boolean c(String str, int i, int i2) {
            int i3 = i + 2;
            if (i3 >= i2 || str.charAt(i) != '%' || c.q(str.charAt(i + 1)) == -1 || c.q(str.charAt(i3)) == -1) {
                return false;
            }
            return true;
        }

        public final List<String> e(String str) {
            i.e(str, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int l = StringsKt__IndentKt.l(str, '&', i, false, 4);
                if (l == -1) {
                    l = str.length();
                }
                int l2 = StringsKt__IndentKt.l(str, '=', i, false, 4);
                if (l2 == -1 || l2 > l) {
                    String substring = str.substring(i, l);
                    i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add((Object) null);
                } else {
                    String substring2 = str.substring(i, l2);
                    i.d(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(l2 + 1, l);
                    i.d(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i = l + 1;
            }
            return arrayList;
        }

        public final void f(List<String> list, StringBuilder sb) {
            i.e(list, "$this$toQueryString");
            i.e(sb, "out");
            m0.q.c e = m0.q.i.e(m0.q.i.f(0, list.size()), 2);
            int i = e.c;
            int i2 = e.d;
            int i3 = e.q;
            if (i3 >= 0) {
                if (i > i2) {
                    return;
                }
            } else if (i < i2) {
                return;
            }
            while (true) {
                String str = list.get(i);
                String str2 = list.get(i + 1);
                if (i > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (i != i2) {
                    i += i3;
                } else {
                    return;
                }
            }
        }
    }

    public w(String str, String str2, String str3, String str4, int i2, List<String> list, List<String> list2, String str5, String str6) {
        i.e(str, "scheme");
        i.e(str2, "username");
        i.e(str3, "password");
        i.e(str4, "host");
        i.e(list, "pathSegments");
        i.e(str6, "url");
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = i2;
        this.i = list;
        this.j = list2;
        this.k = str5;
        this.l = str6;
        this.c = i.a(str, "https");
    }

    public final String a() {
        if (this.f.length() == 0) {
            return "";
        }
        int l2 = StringsKt__IndentKt.l(this.l, '@', 0, false, 6);
        String str = this.l;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(StringsKt__IndentKt.l(this.l, ':', this.d.length() + 3, false, 4) + 1, l2);
        i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int l2 = StringsKt__IndentKt.l(this.l, '/', this.d.length() + 3, false, 4);
        String str = this.l;
        int g2 = c.g(str, "?#", l2, str.length());
        String str2 = this.l;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(l2, g2);
        i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final List<String> c() {
        int l2 = StringsKt__IndentKt.l(this.l, '/', this.d.length() + 3, false, 4);
        String str = this.l;
        int g2 = c.g(str, "?#", l2, str.length());
        ArrayList arrayList = new ArrayList();
        while (l2 < g2) {
            int i2 = l2 + 1;
            int f2 = c.f(this.l, '/', i2, g2);
            String str2 = this.l;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String substring = str2.substring(i2, f2);
            i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring);
            l2 = f2;
        }
        return arrayList;
    }

    public final String d() {
        if (this.j == null) {
            return null;
        }
        int l2 = StringsKt__IndentKt.l(this.l, '?', 0, false, 6) + 1;
        String str = this.l;
        int f2 = c.f(str, '#', l2, str.length());
        String str2 = this.l;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(l2, f2);
        i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.e.length() == 0) {
            return "";
        }
        int length = this.d.length() + 3;
        String str = this.l;
        int g2 = c.g(str, ":@", length, str.length());
        String str2 = this.l;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(length, g2);
        i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof w) && i.a(((w) obj).l, this.l);
    }

    public final a f() {
        String str;
        a aVar = new a();
        aVar.b = this.d;
        String e2 = e();
        i.e(e2, "<set-?>");
        aVar.c = e2;
        String a2 = a();
        i.e(a2, "<set-?>");
        aVar.d = a2;
        aVar.e = this.g;
        aVar.f = this.h != b.b(this.d) ? this.h : -1;
        aVar.g.clear();
        aVar.g.addAll(c());
        aVar.c(d());
        if (this.k == null) {
            str = null;
        } else {
            String str2 = this.l;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            str = str2.substring(StringsKt__IndentKt.l(this.l, '#', 0, false, 6) + 1);
            i.d(str, "(this as java.lang.String).substring(startIndex)");
        }
        aVar.i = str;
        return aVar;
    }

    public final a g(String str) {
        i.e(str, "link");
        try {
            a aVar = new a();
            aVar.d(this, str);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String h(String str) {
        i.e(str, "name");
        List<String> list = this.j;
        if (list == null) {
            return null;
        }
        m0.q.c e2 = m0.q.i.e(m0.q.i.f(0, list.size()), 2);
        int i2 = e2.c;
        int i3 = e2.d;
        int i4 = e2.q;
        if (i4 < 0 ? i2 >= i3 : i2 <= i3) {
            while (!i.a(str, this.j.get(i2))) {
                if (i2 != i3) {
                    i2 += i4;
                }
            }
            return this.j.get(i2 + 1);
        }
        return null;
    }

    public int hashCode() {
        return this.l.hashCode();
    }

    public final String i() {
        a g2 = g("/...");
        i.c(g2);
        i.e("", "username");
        b bVar = b;
        g2.c = b.a(bVar, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
        i.e("", "password");
        g2.d = b.a(bVar, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
        return g2.b().l;
    }

    public final URI j() {
        String str;
        a f2 = f();
        String str2 = f2.e;
        String str3 = null;
        if (str2 != null) {
            i.e("[\"<>^`{|}]", "pattern");
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            i.d(compile, "Pattern.compile(pattern)");
            i.e(compile, "nativePattern");
            i.e(str2, "input");
            i.e("", "replacement");
            str = compile.matcher(str2).replaceAll("");
            i.d(str, "nativePattern.matcher(in…).replaceAll(replacement)");
        } else {
            str = null;
        }
        f2.e = str;
        int size = f2.g.size();
        for (int i2 = 0; i2 < size; i2++) {
            List<String> list = f2.g;
            list.set(i2, b.a(b, list.get(i2), 0, 0, "[]", true, true, false, false, (Charset) null, 227));
        }
        List<String> list2 = f2.h;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str4 = list2.get(i3);
                list2.set(i3, str4 != null ? b.a(b, str4, 0, 0, "\\^`{|}", true, true, true, false, (Charset) null, 195) : null);
            }
        }
        String str5 = f2.i;
        if (str5 != null) {
            str3 = b.a(b, str5, 0, 0, " \"#<>\\^`{|}", true, true, false, true, (Charset) null, PubNubErrorBuilder.PNERR_HISTORY_MESSAGE_ACTIONS_MULTIPLE_CHANNELS);
        }
        f2.i = str3;
        String aVar = f2.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e2) {
            try {
                i.e("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", "pattern");
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                i.d(compile2, "Pattern.compile(pattern)");
                i.e(compile2, "nativePattern");
                i.e(aVar, "input");
                i.e("", "replacement");
                String replaceAll = compile2.matcher(aVar).replaceAll("");
                i.d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                URI create = URI.create(replaceAll);
                i.d(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final URL k() {
        try {
            return new URL(this.l);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    public String toString() {
        return this.l;
    }
}
