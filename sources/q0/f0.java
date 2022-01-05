package q0;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.regex.Pattern;
import m0.n.b.f;
import okio.ByteString;
import q0.h0.c;
import q0.y;
import r0.i;

/* compiled from: ResponseBody.kt */
public abstract class f0 implements Closeable {
    public static final b Companion = new b((f) null);
    private Reader reader;

    /* compiled from: ResponseBody.kt */
    public static final class a extends Reader {
        public boolean c;
        public Reader d;
        public final i q;
        public final Charset x;

        public a(i iVar, Charset charset) {
            m0.n.b.i.e(iVar, Stripe3ds2AuthParams.FIELD_SOURCE);
            m0.n.b.i.e(charset, "charset");
            this.q = iVar;
            this.x = charset;
        }

        public void close() throws IOException {
            this.c = true;
            Reader reader = this.d;
            if (reader != null) {
                reader.close();
            } else {
                this.q.close();
            }
        }

        public int read(char[] cArr, int i, int i2) throws IOException {
            m0.n.b.i.e(cArr, "cbuf");
            if (!this.c) {
                Reader reader = this.d;
                if (reader == null) {
                    reader = new InputStreamReader(this.q.G0(), c.r(this.q, this.x));
                    this.d = reader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    /* compiled from: ResponseBody.kt */
    public static final class b {

        /* compiled from: ResponseBody.kt */
        public static final class a extends f0 {
            public final /* synthetic */ i c;
            public final /* synthetic */ y d;
            public final /* synthetic */ long q;

            public a(i iVar, y yVar, long j) {
                this.c = iVar;
                this.d = yVar;
                this.q = j;
            }

            public long contentLength() {
                return this.q;
            }

            public y contentType() {
                return this.d;
            }

            public i source() {
                return this.c;
            }
        }

        public b(f fVar) {
        }

        public final f0 a(String str, y yVar) {
            m0.n.b.i.e(str, "$this$toResponseBody");
            Charset charset = m0.t.a.a;
            if (yVar != null) {
                Pattern pattern = y.a;
                Charset a2 = yVar.a((Charset) null);
                if (a2 == null) {
                    y.a aVar = y.c;
                    yVar = y.a.b(yVar + "; charset=utf-8");
                } else {
                    charset = a2;
                }
            }
            r0.f fVar = new r0.f();
            m0.n.b.i.e(str, "string");
            m0.n.b.i.e(charset, "charset");
            fVar.T(str, 0, str.length(), charset);
            return b(fVar, yVar, fVar.d);
        }

        public final f0 b(i iVar, y yVar, long j) {
            m0.n.b.i.e(iVar, "$this$asResponseBody");
            return new a(iVar, yVar, j);
        }

        public final f0 c(ByteString byteString, y yVar) {
            m0.n.b.i.e(byteString, "$this$toResponseBody");
            r0.f fVar = new r0.f();
            fVar.F(byteString);
            return b(fVar, yVar, (long) byteString.e());
        }

        public final f0 d(byte[] bArr, y yVar) {
            m0.n.b.i.e(bArr, "$this$toResponseBody");
            r0.f fVar = new r0.f();
            fVar.G(bArr);
            return b(fVar, yVar, (long) bArr.length);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.a(m0.t.a.a);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.nio.charset.Charset charset() {
        /*
            r2 = this;
            q0.y r0 = r2.contentType()
            if (r0 == 0) goto L_0x000f
            java.nio.charset.Charset r1 = m0.t.a.a
            java.nio.charset.Charset r0 = r0.a(r1)
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            java.nio.charset.Charset r0 = m0.t.a.a
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.f0.charset():java.nio.charset.Charset");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        i0.j.f.p.h.H(r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> T consumeSource(m0.n.a.l<? super r0.i, ? extends T> r5, m0.n.a.l<? super T, java.lang.Integer> r6) {
        /*
            r4 = this;
            long r0 = r4.contentLength()
            r2 = 2147483647(0x7fffffff, float:NaN)
            long r2 = (long) r2
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x005a
            r0.i r2 = r4.source()
            r3 = 0
            java.lang.Object r5 = r5.invoke(r2)     // Catch:{ all -> 0x0053 }
            i0.j.f.p.h.H(r2, r3)
            java.lang.Object r6 = r6.invoke(r5)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0052
            long r2 = (long) r6
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x002e
            goto L_0x0052
        L_0x002e:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Content-Length ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") and stream length ("
            r2.append(r0)
            r2.append(r6)
            java.lang.String r6 = ") disagree"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r5.<init>(r6)
            throw r5
        L_0x0052:
            return r5
        L_0x0053:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r6 = move-exception
            i0.j.f.p.h.H(r2, r5)
            throw r6
        L_0x005a:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "Cannot buffer entire body for content length: "
            java.lang.String r6 = i0.d.a.a.a.k0(r6, r0)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.f0.consumeSource(m0.n.a.l, m0.n.a.l):java.lang.Object");
    }

    public static final f0 create(String str, y yVar) {
        return Companion.a(str, yVar);
    }

    public static final f0 create(ByteString byteString, y yVar) {
        return Companion.c(byteString, yVar);
    }

    public static final f0 create(y yVar, long j, i iVar) {
        b bVar = Companion;
        Objects.requireNonNull(bVar);
        m0.n.b.i.e(iVar, "content");
        return bVar.b(iVar, yVar, j);
    }

    public static final f0 create(i iVar, y yVar, long j) {
        return Companion.b(iVar, yVar, j);
    }

    public static final f0 create(byte[] bArr, y yVar) {
        return Companion.d(bArr, yVar);
    }

    public final InputStream byteStream() {
        return source().G0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        i0.j.f.p.h.H(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okio.ByteString byteString() throws java.io.IOException {
        /*
            r7 = this;
            long r0 = r7.contentLength()
            r2 = 2147483647(0x7fffffff, float:NaN)
            long r2 = (long) r2
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0054
            r0.i r2 = r7.source()
            r3 = 0
            okio.ByteString r4 = r2.X()     // Catch:{ all -> 0x004d }
            i0.j.f.p.h.H(r2, r3)
            int r2 = r4.e()
            r5 = -1
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x004c
            long r5 = (long) r2
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0028
            goto L_0x004c
        L_0x0028:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Content-Length ("
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ") and stream length ("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ") disagree"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L_0x004c:
            return r4
        L_0x004d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004f:
            r1 = move-exception
            i0.j.f.p.h.H(r2, r0)
            throw r1
        L_0x0054:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Cannot buffer entire body for content length: "
            java.lang.String r0 = i0.d.a.a.a.k0(r3, r0)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.f0.byteString():okio.ByteString");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        i0.j.f.p.h.H(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] bytes() throws java.io.IOException {
        /*
            r7 = this;
            long r0 = r7.contentLength()
            r2 = 2147483647(0x7fffffff, float:NaN)
            long r2 = (long) r2
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0051
            r0.i r2 = r7.source()
            r3 = 0
            byte[] r4 = r2.r()     // Catch:{ all -> 0x004a }
            i0.j.f.p.h.H(r2, r3)
            int r2 = r4.length
            r5 = -1
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0049
            long r5 = (long) r2
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0025
            goto L_0x0049
        L_0x0025:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Content-Length ("
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ") and stream length ("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ") disagree"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L_0x0049:
            return r4
        L_0x004a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r1 = move-exception
            i0.j.f.p.h.H(r2, r0)
            throw r1
        L_0x0051:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Cannot buffer entire body for content length: "
            java.lang.String r0 = i0.d.a.a.a.k0(r3, r0)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.f0.bytes():byte[]");
    }

    public final Reader charStream() {
        Reader reader2 = this.reader;
        if (reader2 != null) {
            return reader2;
        }
        a aVar = new a(source(), charset());
        this.reader = aVar;
        return aVar;
    }

    public void close() {
        c.d(source());
    }

    public abstract long contentLength();

    public abstract y contentType();

    public abstract i source();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        i0.j.f.p.h.H(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String string() throws java.io.IOException {
        /*
            r3 = this;
            r0.i r0 = r3.source()
            java.nio.charset.Charset r1 = r3.charset()     // Catch:{ all -> 0x0015 }
            java.nio.charset.Charset r1 = q0.h0.c.r(r0, r1)     // Catch:{ all -> 0x0015 }
            java.lang.String r1 = r0.P(r1)     // Catch:{ all -> 0x0015 }
            r2 = 0
            i0.j.f.p.h.H(r0, r2)
            return r1
        L_0x0015:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r2 = move-exception
            i0.j.f.p.h.H(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.f0.string():java.lang.String");
    }

    public static final f0 create(y yVar, String str) {
        b bVar = Companion;
        Objects.requireNonNull(bVar);
        m0.n.b.i.e(str, "content");
        return bVar.a(str, yVar);
    }

    public static final f0 create(y yVar, ByteString byteString) {
        b bVar = Companion;
        Objects.requireNonNull(bVar);
        m0.n.b.i.e(byteString, "content");
        return bVar.c(byteString, yVar);
    }

    public static final f0 create(y yVar, byte[] bArr) {
        b bVar = Companion;
        Objects.requireNonNull(bVar);
        m0.n.b.i.e(bArr, "content");
        return bVar.d(bArr, yVar);
    }
}
