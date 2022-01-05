package q0.h0.j;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import q0.h0.c;
import q0.h0.j.b;
import r0.f;
import r0.i;
import r0.y;
import r0.z;

/* compiled from: Http2Reader.kt */
public final class l implements Closeable {
    public static final Logger c;
    public static final l d = null;
    public final boolean Y1;
    public final a q;
    public final b.a x;
    public final i y;

    /* compiled from: Http2Reader.kt */
    public static final class a implements y {
        public final i Y1;
        public int c;
        public int d;
        public int q;
        public int x;
        public int y;

        public a(i iVar) {
            m0.n.b.i.e(iVar, Stripe3ds2AuthParams.FIELD_SOURCE);
            this.Y1 = iVar;
        }

        public void close() throws IOException {
        }

        public z d() {
            return this.Y1.d();
        }

        public long q0(f fVar, long j) throws IOException {
            int i;
            int readInt;
            m0.n.b.i.e(fVar, "sink");
            do {
                int i2 = this.x;
                if (i2 == 0) {
                    this.Y1.skip((long) this.y);
                    this.y = 0;
                    if ((this.d & 4) != 0) {
                        return -1;
                    }
                    i = this.q;
                    int s = c.s(this.Y1);
                    this.x = s;
                    this.c = s;
                    byte readByte = this.Y1.readByte() & 255;
                    this.d = this.Y1.readByte() & 255;
                    l lVar = l.d;
                    Logger logger = l.c;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(c.e.b(true, this.q, this.c, readByte, this.d));
                    }
                    readInt = this.Y1.readInt() & Integer.MAX_VALUE;
                    this.q = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                } else {
                    long q02 = this.Y1.q0(fVar, Math.min(j, (long) i2));
                    if (q02 == -1) {
                        return -1;
                    }
                    this.x -= (int) q02;
                    return q02;
                }
            } while (readInt == i);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }
    }

    /* compiled from: Http2Reader.kt */
    public interface b {
        void a();

        void b(boolean z, r rVar);

        void c(boolean z, int i, int i2, List<a> list);

        void d(int i, long j);

        void e(boolean z, int i, i iVar, int i2) throws IOException;

        void f(boolean z, int i, int i2);

        void g(int i, int i2, int i3, boolean z);

        void i(int i, ErrorCode errorCode);

        void j(int i, int i2, List<a> list) throws IOException;

        void k(int i, ErrorCode errorCode, ByteString byteString);
    }

    static {
        Logger logger = Logger.getLogger(c.class.getName());
        m0.n.b.i.d(logger, "Logger.getLogger(Http2::class.java.name)");
        c = logger;
    }

    public l(i iVar, boolean z) {
        m0.n.b.i.e(iVar, Stripe3ds2AuthParams.FIELD_SOURCE);
        this.y = iVar;
        this.Y1 = z;
        a aVar = new a(iVar);
        this.q = aVar;
        this.x = new b.a(aVar, 4096, 0, 4);
    }

    public static final int a(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException(i0.d.a.a.a.h0("PROTOCOL_ERROR padding ", i3, " > remaining length ", i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01b4, code lost:
        throw new java.io.IOException(i0.d.a.a.a.e0("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r12));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(boolean r17, q0.h0.j.l.b r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            java.lang.String r2 = "handler"
            m0.n.b.i.e(r1, r2)
            r2 = 0
            r0.i r3 = r0.y     // Catch:{ EOFException -> 0x02ca }
            r4 = 9
            r3.z0(r4)     // Catch:{ EOFException -> 0x02ca }
            r0.i r3 = r0.y
            int r3 = q0.h0.c.s(r3)
            r10 = 16384(0x4000, float:2.2959E-41)
            if (r3 > r10) goto L_0x02be
            r0.i r4 = r0.y
            byte r4 = r4.readByte()
            r11 = r4 & 255(0xff, float:3.57E-43)
            r0.i r4 = r0.y
            byte r4 = r4.readByte()
            r12 = r4 & 255(0xff, float:3.57E-43)
            r0.i r4 = r0.y
            int r4 = r4.readInt()
            r13 = 2147483647(0x7fffffff, float:NaN)
            r14 = r4 & r13
            java.util.logging.Logger r15 = c
            java.util.logging.Level r4 = java.util.logging.Level.FINE
            boolean r4 = r15.isLoggable(r4)
            if (r4 == 0) goto L_0x004e
            q0.h0.j.c r4 = q0.h0.j.c.e
            r5 = 1
            r6 = r14
            r7 = r3
            r8 = r11
            r9 = r12
            java.lang.String r4 = r4.b(r5, r6, r7, r8, r9)
            r15.fine(r4)
        L_0x004e:
            r4 = 4
            if (r17 == 0) goto L_0x006d
            if (r11 != r4) goto L_0x0054
            goto L_0x006d
        L_0x0054:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Expected a SETTINGS frame but was "
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
            q0.h0.j.c r3 = q0.h0.j.c.e
            java.lang.String r3 = r3.a(r11)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x006d:
            r5 = 5
            r6 = 8
            r7 = 1
            switch(r11) {
                case 0: goto L_0x027d;
                case 1: goto L_0x0248;
                case 2: goto L_0x0229;
                case 3: goto L_0x01f0;
                case 4: goto L_0x0150;
                case 5: goto L_0x0122;
                case 6: goto L_0x00f4;
                case 7: goto L_0x00ab;
                case 8: goto L_0x007c;
                default: goto L_0x0074;
            }
        L_0x0074:
            r0.i r1 = r0.y
            long r2 = (long) r3
            r1.skip(r2)
            goto L_0x02bd
        L_0x007c:
            if (r3 != r4) goto L_0x009f
            r0.i r2 = r0.y
            int r2 = r2.readInt()
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            byte[] r5 = q0.h0.c.a
            long r5 = (long) r2
            long r2 = r5 & r3
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0097
            r1.d(r14, r2)
            goto L_0x02bd
        L_0x0097:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "windowSizeIncrement was 0"
            r1.<init>(r2)
            throw r1
        L_0x009f:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_WINDOW_UPDATE length !=4: "
            java.lang.String r2 = i0.d.a.a.a.e0(r2, r3)
            r1.<init>(r2)
            throw r1
        L_0x00ab:
            if (r3 < r6) goto L_0x00e8
            if (r14 != 0) goto L_0x00e0
            r0.i r2 = r0.y
            int r2 = r2.readInt()
            r0.i r4 = r0.y
            int r4 = r4.readInt()
            int r3 = r3 - r6
            okhttp3.internal.http2.ErrorCode$a r5 = okhttp3.internal.http2.ErrorCode.Companion
            okhttp3.internal.http2.ErrorCode r5 = r5.a(r4)
            if (r5 == 0) goto L_0x00d4
            okio.ByteString r4 = okio.ByteString.c
            if (r3 <= 0) goto L_0x00cf
            r0.i r4 = r0.y
            long r8 = (long) r3
            okio.ByteString r4 = r4.j(r8)
        L_0x00cf:
            r1.k(r2, r5, r4)
            goto L_0x02bd
        L_0x00d4:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_GOAWAY unexpected error code: "
            java.lang.String r2 = i0.d.a.a.a.e0(r2, r4)
            r1.<init>(r2)
            throw r1
        L_0x00e0:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_GOAWAY streamId != 0"
            r1.<init>(r2)
            throw r1
        L_0x00e8:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_GOAWAY length < 8: "
            java.lang.String r2 = i0.d.a.a.a.e0(r2, r3)
            r1.<init>(r2)
            throw r1
        L_0x00f4:
            if (r3 != r6) goto L_0x0116
            if (r14 != 0) goto L_0x010e
            r0.i r3 = r0.y
            int r3 = r3.readInt()
            r0.i r4 = r0.y
            int r4 = r4.readInt()
            r5 = r12 & 1
            if (r5 == 0) goto L_0x0109
            r2 = r7
        L_0x0109:
            r1.f(r2, r3, r4)
            goto L_0x02bd
        L_0x010e:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_PING streamId != 0"
            r1.<init>(r2)
            throw r1
        L_0x0116:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_PING length != 8: "
            java.lang.String r2 = i0.d.a.a.a.e0(r2, r3)
            r1.<init>(r2)
            throw r1
        L_0x0122:
            if (r14 == 0) goto L_0x0148
            r4 = r12 & 8
            if (r4 == 0) goto L_0x0132
            r0.i r2 = r0.y
            byte r2 = r2.readByte()
            byte[] r4 = q0.h0.c.a
            r2 = r2 & 255(0xff, float:3.57E-43)
        L_0x0132:
            r0.i r4 = r0.y
            int r4 = r4.readInt()
            r4 = r4 & r13
            int r3 = r3 + -4
            int r3 = a(r3, r12, r2)
            java.util.List r2 = r0.f(r3, r2, r12, r14)
            r1.j(r14, r4, r2)
            goto L_0x02bd
        L_0x0148:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            r1.<init>(r2)
            throw r1
        L_0x0150:
            if (r14 != 0) goto L_0x01e8
            r6 = r12 & 1
            if (r6 == 0) goto L_0x0165
            if (r3 != 0) goto L_0x015d
            r18.a()
            goto L_0x02bd
        L_0x015d:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "FRAME_SIZE_ERROR ack frame should be empty!"
            r1.<init>(r2)
            throw r1
        L_0x0165:
            int r6 = r3 % 6
            if (r6 != 0) goto L_0x01dc
            q0.h0.j.r r6 = new q0.h0.j.r
            r6.<init>()
            m0.q.e r3 = m0.q.i.f(r2, r3)
            r8 = 6
            m0.q.c r3 = m0.q.i.e(r3, r8)
            int r8 = r3.c
            int r9 = r3.d
            int r3 = r3.q
            if (r3 < 0) goto L_0x0182
            if (r8 > r9) goto L_0x01d7
            goto L_0x0184
        L_0x0182:
            if (r8 < r9) goto L_0x01d7
        L_0x0184:
            r0.i r11 = r0.y
            short r11 = r11.readShort()
            r12 = 65535(0xffff, float:9.1834E-41)
            byte[] r13 = q0.h0.c.a
            r11 = r11 & r12
            r0.i r12 = r0.y
            int r12 = r12.readInt()
            r13 = 2
            if (r11 == r13) goto L_0x01c3
            r13 = 3
            if (r11 == r13) goto L_0x01c1
            if (r11 == r4) goto L_0x01b5
            if (r11 == r5) goto L_0x01a1
            goto L_0x01d0
        L_0x01a1:
            if (r12 < r10) goto L_0x01a9
            r13 = 16777215(0xffffff, float:2.3509886E-38)
            if (r12 > r13) goto L_0x01a9
            goto L_0x01d0
        L_0x01a9:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            java.lang.String r2 = i0.d.a.a.a.e0(r2, r12)
            r1.<init>(r2)
            throw r1
        L_0x01b5:
            r11 = 7
            if (r12 < 0) goto L_0x01b9
            goto L_0x01d0
        L_0x01b9:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            r1.<init>(r2)
            throw r1
        L_0x01c1:
            r11 = r4
            goto L_0x01d0
        L_0x01c3:
            if (r12 == 0) goto L_0x01d0
            if (r12 != r7) goto L_0x01c8
            goto L_0x01d0
        L_0x01c8:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            r1.<init>(r2)
            throw r1
        L_0x01d0:
            r6.c(r11, r12)
            if (r8 == r9) goto L_0x01d7
            int r8 = r8 + r3
            goto L_0x0184
        L_0x01d7:
            r1.b(r2, r6)
            goto L_0x02bd
        L_0x01dc:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_SETTINGS length % 6 != 0: "
            java.lang.String r2 = i0.d.a.a.a.e0(r2, r3)
            r1.<init>(r2)
            throw r1
        L_0x01e8:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_SETTINGS streamId != 0"
            r1.<init>(r2)
            throw r1
        L_0x01f0:
            if (r3 != r4) goto L_0x021b
            if (r14 == 0) goto L_0x0213
            r0.i r2 = r0.y
            int r2 = r2.readInt()
            okhttp3.internal.http2.ErrorCode$a r3 = okhttp3.internal.http2.ErrorCode.Companion
            okhttp3.internal.http2.ErrorCode r3 = r3.a(r2)
            if (r3 == 0) goto L_0x0207
            r1.i(r14, r3)
            goto L_0x02bd
        L_0x0207:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r3 = "TYPE_RST_STREAM unexpected error code: "
            java.lang.String r2 = i0.d.a.a.a.e0(r3, r2)
            r1.<init>(r2)
            throw r1
        L_0x0213:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_RST_STREAM streamId == 0"
            r1.<init>(r2)
            throw r1
        L_0x021b:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_RST_STREAM length: "
            java.lang.String r4 = " != 4"
            java.lang.String r2 = i0.d.a.a.a.g0(r2, r3, r4)
            r1.<init>(r2)
            throw r1
        L_0x0229:
            if (r3 != r5) goto L_0x023a
            if (r14 == 0) goto L_0x0232
            r0.i(r1, r14)
            goto L_0x02bd
        L_0x0232:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_PRIORITY streamId == 0"
            r1.<init>(r2)
            throw r1
        L_0x023a:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_PRIORITY length: "
            java.lang.String r4 = " != 5"
            java.lang.String r2 = i0.d.a.a.a.g0(r2, r3, r4)
            r1.<init>(r2)
            throw r1
        L_0x0248:
            if (r14 == 0) goto L_0x0275
            r4 = r12 & 1
            if (r4 == 0) goto L_0x0250
            r4 = r7
            goto L_0x0251
        L_0x0250:
            r4 = r2
        L_0x0251:
            r5 = r12 & 8
            if (r5 == 0) goto L_0x025f
            r0.i r2 = r0.y
            byte r2 = r2.readByte()
            byte[] r5 = q0.h0.c.a
            r2 = r2 & 255(0xff, float:3.57E-43)
        L_0x025f:
            r5 = r12 & 32
            if (r5 == 0) goto L_0x0268
            r0.i(r1, r14)
            int r3 = r3 + -5
        L_0x0268:
            int r3 = a(r3, r12, r2)
            java.util.List r2 = r0.f(r3, r2, r12, r14)
            r3 = -1
            r1.c(r4, r14, r3, r2)
            goto L_0x02bd
        L_0x0275:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            r1.<init>(r2)
            throw r1
        L_0x027d:
            if (r14 == 0) goto L_0x02b5
            r4 = r12 & 1
            if (r4 == 0) goto L_0x0285
            r4 = r7
            goto L_0x0286
        L_0x0285:
            r4 = r2
        L_0x0286:
            r5 = r12 & 32
            if (r5 == 0) goto L_0x028c
            r5 = r7
            goto L_0x028d
        L_0x028c:
            r5 = r2
        L_0x028d:
            if (r5 != 0) goto L_0x02ad
            r5 = r12 & 8
            if (r5 == 0) goto L_0x029d
            r0.i r2 = r0.y
            byte r2 = r2.readByte()
            byte[] r5 = q0.h0.c.a
            r2 = r2 & 255(0xff, float:3.57E-43)
        L_0x029d:
            int r3 = a(r3, r12, r2)
            r0.i r5 = r0.y
            r1.e(r4, r14, r5, r3)
            r0.i r1 = r0.y
            long r2 = (long) r2
            r1.skip(r2)
            goto L_0x02bd
        L_0x02ad:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            r1.<init>(r2)
            throw r1
        L_0x02b5:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            r1.<init>(r2)
            throw r1
        L_0x02bd:
            return r7
        L_0x02be:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "FRAME_SIZE_ERROR: "
            java.lang.String r2 = i0.d.a.a.a.e0(r2, r3)
            r1.<init>(r2)
            throw r1
        L_0x02ca:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.j.l.b(boolean, q0.h0.j.l$b):boolean");
    }

    public void close() throws IOException {
        this.y.close();
    }

    public final void e(b bVar) throws IOException {
        m0.n.b.i.e(bVar, "handler");
        if (!this.Y1) {
            i iVar = this.y;
            ByteString byteString = c.a;
            ByteString j = iVar.j((long) byteString.e());
            Logger logger = c;
            if (logger.isLoggable(Level.FINE)) {
                StringBuilder P0 = i0.d.a.a.a.P0("<< CONNECTION ");
                P0.append(j.f());
                logger.fine(c.i(P0.toString(), new Object[0]));
            }
            if (!m0.n.b.i.a(byteString, j)) {
                StringBuilder P02 = i0.d.a.a.a.P0("Expected a connection header but was ");
                P02.append(j.v());
                throw new IOException(P02.toString());
            }
        } else if (!b(true, bVar)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<q0.h0.j.a> f(int r3, int r4, int r5, int r6) throws java.io.IOException {
        /*
            r2 = this;
            q0.h0.j.l$a r0 = r2.q
            r0.x = r3
            r0.c = r3
            r0.y = r4
            r0.d = r5
            r0.q = r6
            q0.h0.j.b$a r3 = r2.x
        L_0x000e:
            r0.i r4 = r3.b
            boolean r4 = r4.t()
            if (r4 != 0) goto L_0x0132
            r0.i r4 = r3.b
            byte r4 = r4.readByte()
            byte[] r5 = q0.h0.c.a
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L_0x012a
            r6 = r4 & 128(0x80, float:1.794E-43)
            r0 = 1
            if (r6 != r5) goto L_0x007c
            r5 = 127(0x7f, float:1.78E-43)
            int r4 = r3.g(r4, r5)
            int r4 = r4 - r0
            if (r4 < 0) goto L_0x003c
            q0.h0.j.b r5 = q0.h0.j.b.c
            q0.h0.j.a[] r5 = q0.h0.j.b.a
            int r5 = r5.length
            int r5 = r5 - r0
            if (r4 > r5) goto L_0x003c
            r5 = r0
            goto L_0x003d
        L_0x003c:
            r5 = 0
        L_0x003d:
            if (r5 == 0) goto L_0x004b
            q0.h0.j.b r5 = q0.h0.j.b.c
            q0.h0.j.a[] r5 = q0.h0.j.b.a
            r4 = r5[r4]
            java.util.List<q0.h0.j.a> r5 = r3.a
            r5.add(r4)
            goto L_0x000e
        L_0x004b:
            q0.h0.j.b r5 = q0.h0.j.b.c
            q0.h0.j.a[] r5 = q0.h0.j.b.a
            int r5 = r5.length
            int r5 = r4 - r5
            int r5 = r3.b(r5)
            if (r5 < 0) goto L_0x0068
            q0.h0.j.a[] r6 = r3.c
            int r1 = r6.length
            if (r5 >= r1) goto L_0x0068
            java.util.List<q0.h0.j.a> r4 = r3.a
            r5 = r6[r5]
            m0.n.b.i.c(r5)
            r4.add(r5)
            goto L_0x000e
        L_0x0068:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r5 = "Header index too large "
            java.lang.StringBuilder r5 = i0.d.a.a.a.P0(r5)
            int r4 = r4 + r0
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L_0x007c:
            r5 = -1
            r6 = 64
            if (r4 != r6) goto L_0x0098
            q0.h0.j.b r4 = q0.h0.j.b.c
            okio.ByteString r6 = r3.f()
            r4.a(r6)
            okio.ByteString r4 = r3.f()
            q0.h0.j.a r0 = new q0.h0.j.a
            r0.<init>((okio.ByteString) r6, (okio.ByteString) r4)
            r3.e(r5, r0)
            goto L_0x000e
        L_0x0098:
            r1 = r4 & 64
            if (r1 != r6) goto L_0x00b5
            r6 = 63
            int r4 = r3.g(r4, r6)
            int r4 = r4 - r0
            okio.ByteString r4 = r3.d(r4)
            okio.ByteString r6 = r3.f()
            q0.h0.j.a r0 = new q0.h0.j.a
            r0.<init>((okio.ByteString) r4, (okio.ByteString) r6)
            r3.e(r5, r0)
            goto L_0x000e
        L_0x00b5:
            r5 = r4 & 32
            r6 = 32
            if (r5 != r6) goto L_0x00ef
            r5 = 31
            int r4 = r3.g(r4, r5)
            r3.h = r4
            if (r4 < 0) goto L_0x00da
            int r5 = r3.g
            if (r4 > r5) goto L_0x00da
            int r5 = r3.f
            if (r4 >= r5) goto L_0x000e
            if (r4 != 0) goto L_0x00d4
            r3.a()
            goto L_0x000e
        L_0x00d4:
            int r5 = r5 - r4
            r3.c(r5)
            goto L_0x000e
        L_0x00da:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "Invalid dynamic table size update "
            java.lang.StringBuilder r5 = i0.d.a.a.a.P0(r5)
            int r3 = r3.h
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L_0x00ef:
            r5 = 16
            if (r4 == r5) goto L_0x0111
            if (r4 != 0) goto L_0x00f6
            goto L_0x0111
        L_0x00f6:
            r5 = 15
            int r4 = r3.g(r4, r5)
            int r4 = r4 - r0
            okio.ByteString r4 = r3.d(r4)
            okio.ByteString r5 = r3.f()
            java.util.List<q0.h0.j.a> r6 = r3.a
            q0.h0.j.a r0 = new q0.h0.j.a
            r0.<init>((okio.ByteString) r4, (okio.ByteString) r5)
            r6.add(r0)
            goto L_0x000e
        L_0x0111:
            q0.h0.j.b r4 = q0.h0.j.b.c
            okio.ByteString r5 = r3.f()
            r4.a(r5)
            okio.ByteString r4 = r3.f()
            java.util.List<q0.h0.j.a> r6 = r3.a
            q0.h0.j.a r0 = new q0.h0.j.a
            r0.<init>((okio.ByteString) r5, (okio.ByteString) r4)
            r6.add(r0)
            goto L_0x000e
        L_0x012a:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "index == 0"
            r3.<init>(r4)
            throw r3
        L_0x0132:
            q0.h0.j.b$a r3 = r2.x
            java.util.List<q0.h0.j.a> r4 = r3.a
            java.util.List r4 = m0.j.g.v0(r4)
            java.util.List<q0.h0.j.a> r3 = r3.a
            r3.clear()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.j.l.f(int, int, int, int):java.util.List");
    }

    public final void i(b bVar, int i) throws IOException {
        int readInt = this.y.readInt();
        boolean z = (((int) 2147483648L) & readInt) != 0;
        byte readByte = this.y.readByte();
        byte[] bArr = c.a;
        bVar.g(i, readInt & Integer.MAX_VALUE, (readByte & 255) + 1, z);
    }
}
