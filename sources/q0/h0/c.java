package q0.h0;

import com.google.android.gms.recaptcha.RecaptchaActionType;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import i0.j.f.p.h;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.text.Regex;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.b.i;
import okio.ByteString;
import q0.a0;
import q0.d0;
import q0.e0;
import q0.f0;
import q0.v;
import q0.w;
import q0.y;
import r0.f;
import r0.q;

/* compiled from: Util.kt */
public final class c {
    public static final byte[] a;
    public static final v b = v.c.c(new String[0]);
    public static final f0 c;
    public static final q d;
    public static final TimeZone e;
    public static final Regex f = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    public static final String g;

    static {
        int i;
        int i2 = 0;
        byte[] bArr = new byte[0];
        a = bArr;
        c = f0.Companion.d(bArr, (y) null);
        d0.a.b(bArr, (y) null, 0, 0);
        q.a aVar = q.c;
        ByteString.a aVar2 = ByteString.d;
        int i3 = 1;
        ByteString[] byteStringArr = {aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000")};
        i.e(byteStringArr, "byteStrings");
        List m4 = h.m4(byteStringArr);
        i.e(m4, "$this$sort");
        ArrayList arrayList = (ArrayList) m4;
        if (arrayList.size() > 1) {
            Collections.sort(m4);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i4 = 0; i4 < 5; i4++) {
            ByteString byteString = byteStringArr[i4];
            arrayList2.add(-1);
        }
        Object[] array = arrayList2.toArray(new Integer[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        Integer[] numArr = (Integer[]) array;
        List U = g.U((Integer[]) Arrays.copyOf(numArr, numArr.length));
        int i5 = 0;
        int i6 = 0;
        while (i5 < 5) {
            ByteString byteString2 = byteStringArr[i5];
            int i7 = i6 + 1;
            int size = arrayList.size();
            i.e(m4, "$this$binarySearch");
            int size2 = arrayList.size();
            if (size < 0) {
                throw new IllegalArgumentException(a.j0("fromIndex (", 0, ") is greater than toIndex (", size, ")."));
            } else if (size <= size2) {
                int i8 = size - 1;
                int i9 = 0;
                while (true) {
                    if (i9 > i8) {
                        i = -(i9 + 1);
                        break;
                    }
                    i = (i9 + i8) >>> i3;
                    int L = h.L((Comparable) arrayList.get(i), byteString2);
                    if (L >= 0) {
                        if (L <= 0) {
                            break;
                        }
                        i8 = i - 1;
                    } else {
                        i9 = i + 1;
                    }
                    i3 = 1;
                }
                U.set(i, Integer.valueOf(i6));
                i5++;
                i3 = 1;
                i6 = i7;
            } else {
                throw new IndexOutOfBoundsException(a.j0("toIndex (", size, ") is greater than size (", size2, ")."));
            }
        }
        if (((ByteString) arrayList.get(0)).e() > 0) {
            int i10 = 0;
            while (i10 < arrayList.size()) {
                ByteString byteString3 = (ByteString) arrayList.get(i10);
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < arrayList.size()) {
                    ByteString byteString4 = (ByteString) arrayList.get(i12);
                    Objects.requireNonNull(byteString4);
                    i.e(byteString3, "prefix");
                    if (!byteString4.l(0, byteString3, 0, byteString3.e())) {
                        continue;
                        break;
                    }
                    if (!(byteString4.e() != byteString3.e())) {
                        throw new IllegalArgumentException(("duplicate option: " + byteString4).toString());
                    } else if (((Number) U.get(i12)).intValue() > ((Number) U.get(i10)).intValue()) {
                        arrayList.remove(i12);
                        U.remove(i12);
                    } else {
                        i12++;
                    }
                }
                i10 = i11;
            }
            f fVar = new f();
            aVar.a(0, fVar, 0, m4, 0, arrayList.size(), U);
            int[] iArr = new int[((int) aVar.b(fVar))];
            while (!fVar.t()) {
                iArr[i2] = fVar.readInt();
                i2++;
            }
            Object[] copyOf = Arrays.copyOf(byteStringArr, 5);
            i.d(copyOf, "java.util.Arrays.copyOf(this, size)");
            d = new q((ByteString[]) copyOf, iArr, (m0.n.b.f) null);
            TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
            i.c(timeZone);
            e = timeZone;
            Class<a0> cls = a0.class;
            String name = a0.class.getName();
            i.d(name, "OkHttpClient::class.java.name");
            g = StringsKt__IndentKt.y(StringsKt__IndentKt.x(name, "okhttp3."), "Client");
            return;
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
    }

    public static final Throwable A(Exception exc, List<? extends Exception> list) {
        i.e(exc, "$this$withSuppressed");
        i.e(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        for (Exception m : list) {
            h.m(exc, m);
        }
        return exc;
    }

    public static final boolean a(w wVar, w wVar2) {
        i.e(wVar, "$this$canReuseConnectionFor");
        i.e(wVar2, RecaptchaActionType.OTHER);
        return i.a(wVar.g, wVar2.g) && wVar.h == wVar2.h && i.a(wVar.d, wVar2.d);
    }

    public static final int b(String str, long j, TimeUnit timeUnit) {
        i.e(str, "name");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        boolean z = true;
        if (!(i >= 0)) {
            throw new IllegalStateException(a.n0(str, " < 0").toString());
        } else if (1 != 0) {
            long millis = timeUnit.toMillis(j);
            if (millis <= ((long) Integer.MAX_VALUE)) {
                if (millis == 0 && i > 0) {
                    z = false;
                }
                if (z) {
                    return (int) millis;
                }
                throw new IllegalArgumentException(a.n0(str, " too small.").toString());
            }
            throw new IllegalArgumentException(a.n0(str, " too large.").toString());
        } else {
            throw new IllegalStateException("unit == null".toString());
        }
    }

    public static final void c(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void d(Closeable closeable) {
        i.e(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void e(Socket socket) {
        i.e(socket, "$this$closeQuietly");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!i.a(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int f(String str, char c2, int i, int i2) {
        i.e(str, "$this$delimiterOffset");
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int g(String str, String str2, int i, int i2) {
        i.e(str, "$this$delimiterOffset");
        i.e(str2, "delimiters");
        while (i < i2) {
            if (StringsKt__IndentKt.c(str2, str.charAt(i), false, 2)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final boolean h(r0.y yVar, int i, TimeUnit timeUnit) {
        i.e(yVar, "$this$discard");
        i.e(timeUnit, "timeUnit");
        try {
            return u(yVar, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String i(String str, Object... objArr) {
        i.e(str, "format");
        i.e(objArr, "args");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        i.d(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static final boolean j(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        i.e(strArr, "$this$hasIntersection");
        i.e(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String compare : strArr2) {
                        if (comparator.compare(str, compare) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long k(e0 e0Var) {
        i.e(e0Var, "$this$headersContentLength");
        String b2 = e0Var.Z1.b("Content-Length");
        if (b2 != null) {
            i.e(b2, "$this$toLongOrDefault");
            try {
                return Long.parseLong(b2);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    @SafeVarargs
    public static final <T> List<T> l(T... tArr) {
        i.e(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(g.K(Arrays.copyOf(objArr, objArr.length)));
        i.d(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int m(String str) {
        i.e(str, "$this$indexOfControlOrNonAscii");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (i.g(charAt, 31) <= 0 || i.g(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int n(String str, int i, int i2) {
        i.e(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int o(String str, int i, int i2) {
        i.e(str, "$this$indexOfLastNonAsciiWhitespace");
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt == 9 || charAt == 10 || charAt == 12 || charAt == 13 || charAt == ' ') {
                    if (i3 == i) {
                        break;
                    }
                    i3--;
                } else {
                    return i3 + 1;
                }
            }
        }
        return i;
    }

    public static final String[] p(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        i.e(strArr, "$this$intersect");
        i.e(strArr2, RecaptchaActionType.OTHER);
        i.e(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    public static final int q(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        char c3 = 'a';
        if ('a' > c2 || 'f' < c2) {
            c3 = 'A';
            if ('A' > c2 || 'F' < c2) {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    public static final Charset r(r0.i iVar, Charset charset) throws IOException {
        Charset charset2;
        i.e(iVar, "$this$readBomAsCharset");
        i.e(charset, "default");
        int H0 = iVar.H0(d);
        if (H0 == -1) {
            return charset;
        }
        if (H0 == 0) {
            Charset charset3 = StandardCharsets.UTF_8;
            i.d(charset3, "UTF_8");
            return charset3;
        } else if (H0 == 1) {
            Charset charset4 = StandardCharsets.UTF_16BE;
            i.d(charset4, "UTF_16BE");
            return charset4;
        } else if (H0 != 2) {
            if (H0 == 3) {
                m0.t.a aVar = m0.t.a.d;
                charset2 = m0.t.a.c;
                if (charset2 == null) {
                    charset2 = Charset.forName("UTF-32BE");
                    i.d(charset2, "Charset.forName(\"UTF-32BE\")");
                    m0.t.a.c = charset2;
                }
            } else if (H0 == 4) {
                m0.t.a aVar2 = m0.t.a.d;
                charset2 = m0.t.a.b;
                if (charset2 == null) {
                    charset2 = Charset.forName("UTF-32LE");
                    i.d(charset2, "Charset.forName(\"UTF-32LE\")");
                    m0.t.a.b = charset2;
                }
            } else {
                throw new AssertionError();
            }
            return charset2;
        } else {
            Charset charset5 = StandardCharsets.UTF_16LE;
            i.d(charset5, "UTF_16LE");
            return charset5;
        }
    }

    public static final int s(r0.i iVar) throws IOException {
        i.e(iVar, "$this$readMedium");
        return (iVar.readByte() & 255) | ((iVar.readByte() & 255) << 16) | ((iVar.readByte() & 255) << 8);
    }

    public static final int t(f fVar, byte b2) {
        i.e(fVar, "$this$skipAll");
        int i = 0;
        while (!fVar.t() && fVar.i(0) == b2) {
            i++;
            fVar.readByte();
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0053, code lost:
        if (r5 == androidx.recyclerview.widget.RecyclerView.FOREVER_NS) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        if (r5 != androidx.recyclerview.widget.RecyclerView.FOREVER_NS) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
        r11.d().a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        r11.d().d(r0 + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0081, code lost:
        return r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean u(r0.y r11, int r12, java.util.concurrent.TimeUnit r13) throws java.io.IOException {
        /*
            java.lang.String r0 = "$this$skipAll"
            m0.n.b.i.e(r11, r0)
            java.lang.String r0 = "timeUnit"
            m0.n.b.i.e(r13, r0)
            long r0 = java.lang.System.nanoTime()
            r0.z r2 = r11.d()
            boolean r2 = r2.e()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L_0x0027
            r0.z r2 = r11.d()
            long r5 = r2.c()
            long r5 = r5 - r0
            goto L_0x0028
        L_0x0027:
            r5 = r3
        L_0x0028:
            r0.z r2 = r11.d()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.d(r12)
            r0.f r12 = new r0.f     // Catch:{ InterruptedIOException -> 0x006c, all -> 0x0056 }
            r12.<init>()     // Catch:{ InterruptedIOException -> 0x006c, all -> 0x0056 }
        L_0x003e:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.q0(r12, r7)     // Catch:{ InterruptedIOException -> 0x006c, all -> 0x0056 }
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L_0x0050
            long r7 = r12.d     // Catch:{ InterruptedIOException -> 0x006c, all -> 0x0056 }
            r12.skip(r7)     // Catch:{ InterruptedIOException -> 0x006c, all -> 0x0056 }
            goto L_0x003e
        L_0x0050:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0079
            goto L_0x0071
        L_0x0056:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0063
            r0.z r11 = r11.d()
            r11.a()
            goto L_0x006b
        L_0x0063:
            r0.z r11 = r11.d()
            long r0 = r0 + r5
            r11.d(r0)
        L_0x006b:
            throw r12
        L_0x006c:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0079
        L_0x0071:
            r0.z r11 = r11.d()
            r11.a()
            goto L_0x0081
        L_0x0079:
            r0.z r11 = r11.d()
            long r0 = r0 + r5
            r11.d(r0)
        L_0x0081:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.c.u(r0.y, int, java.util.concurrent.TimeUnit):boolean");
    }

    public static final v v(List<q0.h0.j.a> list) {
        i.e(list, "$this$toHeaders");
        ArrayList arrayList = new ArrayList(20);
        for (q0.h0.j.a next : list) {
            ByteString byteString = next.h;
            ByteString byteString2 = next.i;
            String v = byteString.v();
            String v2 = byteString2.v();
            i.e(v, "name");
            i.e(v2, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            arrayList.add(v);
            arrayList.add(StringsKt__IndentKt.X(v2).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return new v((String[]) array, (m0.n.b.f) null);
    }

    public static final String w(w wVar, boolean z) {
        String str;
        i.e(wVar, "$this$toHostHeader");
        if (StringsKt__IndentKt.d(wVar.g, ":", false, 2)) {
            str = a.x0(a.N0('['), wVar.g, ']');
        } else {
            str = wVar.g;
        }
        if (!z && wVar.h == w.b.b(wVar.d)) {
            return str;
        }
        return str + ':' + wVar.h;
    }

    public static final <T> List<T> x(List<? extends T> list) {
        i.e(list, "$this$toImmutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(g.A0(list));
        i.d(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int y(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > ((long) Integer.MAX_VALUE)) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final String z(String str, int i, int i2) {
        i.e(str, "$this$trimSubstring");
        int n = n(str, i, i2);
        String substring = str.substring(n, o(str, n, i2));
        i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }
}
