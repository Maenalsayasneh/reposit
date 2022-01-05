package okhttp3.internal.publicsuffix;

import i0.j.f.p.h;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import q0.h0.c;

/* compiled from: PublicSuffixDatabase.kt */
public final class PublicSuffixDatabase {
    public static final byte[] a = {(byte) 42};
    public static final List<String> b = h.L2("*");
    public static final PublicSuffixDatabase c = new PublicSuffixDatabase();
    public static final a d = new a((f) null);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final CountDownLatch f = new CountDownLatch(1);
    public byte[] g;
    public byte[] h;

    /* compiled from: PublicSuffixDatabase.kt */
    public static final class a {
        public a(f fVar) {
        }

        public static final String a(a aVar, byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            byte b;
            int i3;
            byte[] bArr3 = bArr;
            byte[][] bArr4 = bArr2;
            int length = bArr3.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = (i4 + length) / 2;
                while (i5 > -1 && bArr3[i5] != ((byte) 10)) {
                    i5--;
                }
                int i6 = i5 + 1;
                int i7 = 1;
                while (true) {
                    i2 = i6 + i7;
                    if (bArr3[i2] == ((byte) 10)) {
                        break;
                    }
                    i7++;
                }
                int i8 = i2 - i6;
                int i9 = i;
                boolean z2 = false;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (z2) {
                        b = 46;
                        z = false;
                    } else {
                        byte b2 = bArr4[i9][i10];
                        byte[] bArr5 = c.a;
                        byte b3 = b2 & 255;
                        z = z2;
                        b = b3;
                    }
                    byte b4 = bArr3[i6 + i11];
                    byte[] bArr6 = c.a;
                    i3 = b - (b4 & 255);
                    if (i3 == 0) {
                        i11++;
                        i10++;
                        if (i11 == i8) {
                            break;
                        } else if (bArr4[i9].length != i10) {
                            z2 = z;
                        } else if (i9 == bArr4.length - 1) {
                            break;
                        } else {
                            i9++;
                            i10 = -1;
                            z2 = true;
                        }
                    } else {
                        break;
                    }
                }
                if (i3 >= 0) {
                    if (i3 <= 0) {
                        int i12 = i8 - i11;
                        int length2 = bArr4[i9].length - i10;
                        int length3 = bArr4.length;
                        for (int i13 = i9 + 1; i13 < length3; i13++) {
                            length2 += bArr4[i13].length;
                        }
                        if (length2 >= i12) {
                            if (length2 <= i12) {
                                Charset charset = StandardCharsets.UTF_8;
                                i.d(charset, "UTF_8");
                                return new String(bArr3, i6, i8, charset);
                            }
                        }
                    }
                    i4 = i2 + 1;
                }
                length = i6 - 1;
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r1 == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r1 != false) goto L_0x003a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0042 */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x014f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0150  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = "domain"
            m0.n.b.i.e(r14, r0)
            java.lang.String r0 = java.net.IDN.toUnicode(r14)
            java.lang.String r1 = "unicodeDomain"
            m0.n.b.i.d(r0, r1)
            java.util.List r0 = r13.c(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r13.e
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0051
            java.util.concurrent.atomic.AtomicBoolean r1 = r13.e
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0051
            r1 = r3
        L_0x0025:
            r13.b()     // Catch:{ InterruptedIOException -> 0x0042, IOException -> 0x002d }
            if (r1 == 0) goto L_0x005e
            goto L_0x003a
        L_0x002b:
            r14 = move-exception
            goto L_0x0047
        L_0x002d:
            r4 = move-exception
            q0.h0.l.h$a r5 = q0.h0.l.h.c     // Catch:{ all -> 0x002b }
            q0.h0.l.h r5 = q0.h0.l.h.a     // Catch:{ all -> 0x002b }
            java.lang.String r6 = "Failed to read public suffix list"
            r7 = 5
            r5.i(r6, r7, r4)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x005e
        L_0x003a:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            goto L_0x005e
        L_0x0042:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x002b }
            r1 = r2
            goto L_0x0025
        L_0x0047:
            if (r1 == 0) goto L_0x0050
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0050:
            throw r14
        L_0x0051:
            java.util.concurrent.CountDownLatch r1 = r13.f     // Catch:{ InterruptedException -> 0x0057 }
            r1.await()     // Catch:{ InterruptedException -> 0x0057 }
            goto L_0x005e
        L_0x0057:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x005e:
            byte[] r1 = r13.g
            if (r1 == 0) goto L_0x0064
            r1 = r2
            goto L_0x0065
        L_0x0064:
            r1 = r3
        L_0x0065:
            if (r1 == 0) goto L_0x01dd
            int r1 = r0.size()
            byte[][] r4 = new byte[r1][]
            r5 = r3
        L_0x006e:
            if (r5 >= r1) goto L_0x0090
            java.lang.Object r6 = r0.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r8 = "UTF_8"
            m0.n.b.i.d(r7, r8)
            java.lang.String r8 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r6, r8)
            byte[] r6 = r6.getBytes(r7)
            java.lang.String r7 = "(this as java.lang.String).getBytes(charset)"
            m0.n.b.i.d(r6, r7)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x006e
        L_0x0090:
            r5 = r3
        L_0x0091:
            java.lang.String r6 = "publicSuffixListBytes"
            r7 = 0
            if (r5 >= r1) goto L_0x00aa
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r8 = d
            byte[] r9 = r13.g
            if (r9 == 0) goto L_0x00a6
            java.lang.String r8 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a.a(r8, r9, r4, r5)
            if (r8 == 0) goto L_0x00a3
            goto L_0x00ab
        L_0x00a3:
            int r5 = r5 + 1
            goto L_0x0091
        L_0x00a6:
            m0.n.b.i.m(r6)
            throw r7
        L_0x00aa:
            r8 = r7
        L_0x00ab:
            if (r1 <= r2) goto L_0x00d0
            java.lang.Object r5 = r4.clone()
            byte[][] r5 = (byte[][]) r5
            int r9 = r5.length
            int r9 = r9 - r2
            r10 = r3
        L_0x00b6:
            if (r10 >= r9) goto L_0x00d0
            byte[] r11 = a
            r5[r10] = r11
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r11 = d
            byte[] r12 = r13.g
            if (r12 == 0) goto L_0x00cc
            java.lang.String r11 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a.a(r11, r12, r5, r10)
            if (r11 == 0) goto L_0x00c9
            goto L_0x00d1
        L_0x00c9:
            int r10 = r10 + 1
            goto L_0x00b6
        L_0x00cc:
            m0.n.b.i.m(r6)
            throw r7
        L_0x00d0:
            r11 = r7
        L_0x00d1:
            if (r11 == 0) goto L_0x00ed
            int r1 = r1 - r2
            r5 = r3
        L_0x00d5:
            if (r5 >= r1) goto L_0x00ed
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r6 = d
            byte[] r9 = r13.h
            if (r9 == 0) goto L_0x00e7
            java.lang.String r6 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a.a(r6, r9, r4, r5)
            if (r6 == 0) goto L_0x00e4
            goto L_0x00ee
        L_0x00e4:
            int r5 = r5 + 1
            goto L_0x00d5
        L_0x00e7:
            java.lang.String r14 = "publicSuffixExceptionListBytes"
            m0.n.b.i.m(r14)
            throw r7
        L_0x00ed:
            r6 = r7
        L_0x00ee:
            r1 = 6
            r4 = 46
            r5 = 33
            if (r6 == 0) goto L_0x010d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            char[] r8 = new char[r2]
            r8[r3] = r4
            java.util.List r1 = kotlin.text.StringsKt__IndentKt.D(r6, r8, r3, r3, r1)
            goto L_0x0139
        L_0x010d:
            if (r8 != 0) goto L_0x0114
            if (r11 != 0) goto L_0x0114
            java.util.List<java.lang.String> r1 = b
            goto L_0x0139
        L_0x0114:
            if (r8 == 0) goto L_0x011f
            char[] r6 = new char[r2]
            r6[r3] = r4
            java.util.List r6 = kotlin.text.StringsKt__IndentKt.D(r8, r6, r3, r3, r1)
            goto L_0x0121
        L_0x011f:
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.c
        L_0x0121:
            if (r11 == 0) goto L_0x012c
            char[] r8 = new char[r2]
            r8[r3] = r4
            java.util.List r1 = kotlin.text.StringsKt__IndentKt.D(r11, r8, r3, r3, r1)
            goto L_0x012e
        L_0x012c:
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.c
        L_0x012e:
            int r4 = r6.size()
            int r8 = r1.size()
            if (r4 <= r8) goto L_0x0139
            r1 = r6
        L_0x0139:
            int r4 = r0.size()
            int r6 = r1.size()
            if (r4 != r6) goto L_0x0150
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            char r4 = r4.charAt(r3)
            if (r4 == r5) goto L_0x0150
            return r7
        L_0x0150:
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            char r4 = r4.charAt(r3)
            if (r4 != r5) goto L_0x0165
            int r0 = r0.size()
            int r1 = r1.size()
            goto L_0x016e
        L_0x0165:
            int r0 = r0.size()
            int r1 = r1.size()
            int r1 = r1 + r2
        L_0x016e:
            int r0 = r0 - r1
            java.util.List r14 = r13.c(r14)
            m0.s.h r14 = m0.j.g.e(r14)
            m0.s.h r14 = kotlin.sequences.SequencesKt___SequencesKt.c(r14, r0)
            java.lang.String r0 = "."
            java.lang.String r1 = ""
            java.lang.String r4 = "..."
            java.lang.String r5 = "$this$joinToString"
            m0.n.b.i.e(r14, r5)
            java.lang.String r5 = "separator"
            m0.n.b.i.e(r0, r5)
            java.lang.String r6 = "prefix"
            m0.n.b.i.e(r1, r6)
            java.lang.String r8 = "postfix"
            m0.n.b.i.e(r1, r8)
            java.lang.String r9 = "truncated"
            m0.n.b.i.e(r4, r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "$this$joinTo"
            m0.n.b.i.e(r14, r11)
            java.lang.String r11 = "buffer"
            m0.n.b.i.e(r10, r11)
            m0.n.b.i.e(r0, r5)
            m0.n.b.i.e(r1, r6)
            m0.n.b.i.e(r1, r8)
            m0.n.b.i.e(r4, r9)
            r10.append(r1)
            java.util.Iterator r14 = r14.iterator()
        L_0x01bc:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L_0x01d0
            java.lang.Object r4 = r14.next()
            int r3 = r3 + r2
            if (r3 <= r2) goto L_0x01cc
            r10.append(r0)
        L_0x01cc:
            m0.r.t.a.r.m.a1.a.O(r10, r4, r7)
            goto L_0x01bc
        L_0x01d0:
            r10.append(r1)
            java.lang.String r14 = r10.toString()
            java.lang.String r0 = "joinTo(StringBuilder(), …ed, transform).toString()"
            m0.n.b.i.d(r14, r0)
            return r14
        L_0x01dd:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to load publicsuffixes.gz resource from the classpath."
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        i0.j.f.p.h.H(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() throws java.io.IOException {
        /*
            r5 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 == 0) goto L_0x0049
            r0.m r1 = new r0.m
            r0.y r0 = m0.r.t.a.r.m.a1.a.D3(r0)
            r1.<init>(r0)
            r0.i r0 = m0.r.t.a.r.m.a1.a.c0(r1)
            r1 = 0
            int r2 = r0.readInt()     // Catch:{ all -> 0x0042 }
            long r2 = (long) r2     // Catch:{ all -> 0x0042 }
            byte[] r2 = r0.h0(r2)     // Catch:{ all -> 0x0042 }
            int r3 = r0.readInt()     // Catch:{ all -> 0x0042 }
            long r3 = (long) r3     // Catch:{ all -> 0x0042 }
            byte[] r3 = r0.h0(r3)     // Catch:{ all -> 0x0042 }
            i0.j.f.p.h.H(r0, r1)
            monitor-enter(r5)
            m0.n.b.i.c(r2)     // Catch:{ all -> 0x003f }
            r5.g = r2     // Catch:{ all -> 0x003f }
            m0.n.b.i.c(r3)     // Catch:{ all -> 0x003f }
            r5.h = r3     // Catch:{ all -> 0x003f }
            monitor-exit(r5)
            java.util.concurrent.CountDownLatch r0 = r5.f
            r0.countDown()
            return
        L_0x003f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0042:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r2 = move-exception
            i0.j.f.p.h.H(r0, r1)
            throw r2
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.b():void");
    }

    public final List<String> c(String str) {
        List<String> D = StringsKt__IndentKt.D(str, new char[]{'.'}, false, 0, 6);
        return i.a((String) g.G(D), "") ? g.m(D, 1) : D;
    }
}
