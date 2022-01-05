package r0;

import androidx.recyclerview.widget.RecyclerView;
import com.instabug.library.util.StringUtility;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import m0.n.b.i;
import okio.ByteString;

/* compiled from: RealBufferedSource.kt */
public final class t implements i {
    public final f c = new f();
    public boolean d;
    public final y q;

    public t(y yVar) {
        i.e(yVar, Stripe3ds2AuthParams.FIELD_SOURCE);
        this.q = yVar;
    }

    public long B() {
        int i;
        z0(1);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!a0(j2)) {
                break;
            }
            byte i2 = this.c.i(j);
            if ((i2 >= ((byte) 48) && i2 <= ((byte) 57)) || (j == 0 && i2 == ((byte) 45))) {
                j = j2;
            } else if (i == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected leading [0-9] or '-' character but was 0x");
                m0.r.t.a.r.m.a1.a.B0(16);
                m0.r.t.a.r.m.a1.a.B0(16);
                String num = Integer.toString(i2, 16);
                i.d(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                sb.append(num);
                throw new NumberFormatException(sb.toString());
            }
        }
        return this.c.B();
    }

    public String D(long j) {
        if (j >= 0) {
            long j2 = j == RecyclerView.FOREVER_NS ? Long.MAX_VALUE : j + 1;
            byte b = (byte) 10;
            long a2 = a(b, 0, j2);
            if (a2 != -1) {
                return r0.a0.a.a(this.c, a2);
            }
            if (j2 < RecyclerView.FOREVER_NS && a0(j2) && this.c.i(j2 - 1) == ((byte) 13) && a0(1 + j2) && this.c.i(j2) == b) {
                return r0.a0.a.a(this.c, j2);
            }
            f fVar = new f();
            f fVar2 = this.c;
            fVar2.f(fVar, 0, Math.min((long) 32, fVar2.d));
            StringBuilder P0 = i0.d.a.a.a.P0("\\n not found: limit=");
            P0.append(Math.min(this.c.d, j));
            P0.append(" content=");
            P0.append(fVar.X().f());
            P0.append(StringUtility.ELLIPSIZE);
            throw new EOFException(P0.toString());
        }
        throw new IllegalArgumentException(i0.d.a.a.a.k0("limit < 0: ", j).toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long E0() {
        /*
            r5 = this;
            r0 = 1
            r5.z0(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.a0(r2)
            if (r2 == 0) goto L_0x0062
            r0.f r2 = r5.c
            long r3 = (long) r0
            byte r2 = r2.i(r3)
            r3 = 48
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0020
            r3 = 57
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x0020:
            r3 = 97
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x002a
            r3 = 102(0x66, float:1.43E-43)
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x002a:
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0037
            r3 = 70
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x0062
        L_0x003a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r3)
            r3 = 16
            m0.r.t.a.r.m.a1.a.B0(r3)
            m0.r.t.a.r.m.a1.a.B0(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            m0.n.b.i.d(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0062:
            r0.f r0 = r5.c
            long r0 = r0.E0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.t.E0():long");
    }

    public InputStream G0() {
        return new a(this);
    }

    public int H0(q qVar) {
        i.e(qVar, "options");
        if (!this.d) {
            while (true) {
                int b = r0.a0.a.b(this.c, qVar, true);
                if (b == -2) {
                    if (this.q.q0(this.c, (long) 8192) == -1) {
                        break;
                    }
                } else if (b != -1) {
                    this.c.skip((long) qVar.d[b].e());
                    return b;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public String P(Charset charset) {
        i.e(charset, "charset");
        this.c.V(this.q);
        return this.c.P(charset);
    }

    public ByteString X() {
        this.c.V(this.q);
        return this.c.X();
    }

    public long a(byte b, long j, long j2) {
        boolean z = true;
        if (!this.d) {
            if (0 > j || j2 < j) {
                z = false;
            }
            if (z) {
                while (j < j2) {
                    long l = this.c.l(b, j, j2);
                    if (l != -1) {
                        return l;
                    }
                    f fVar = this.c;
                    long j3 = fVar.d;
                    if (j3 >= j2 || this.q.q0(fVar, (long) 8192) == -1) {
                        return -1;
                    }
                    j = Math.max(j, j3);
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean a0(long j) {
        f fVar;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(i0.d.a.a.a.k0("byteCount < 0: ", j).toString());
        } else if (!this.d) {
            do {
                fVar = this.c;
                if (fVar.d >= j) {
                    return true;
                }
            } while (this.q.q0(fVar, (long) 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public boolean b(long j, ByteString byteString) {
        i.e(byteString, "bytes");
        int e = byteString.e();
        i.e(byteString, "bytes");
        if (!this.d) {
            if (j >= 0 && e >= 0 && byteString.e() - 0 >= e) {
                int i = 0;
                while (i < e) {
                    long j2 = ((long) i) + j;
                    if (a0(1 + j2) && this.c.i(j2) == byteString.i(0 + i)) {
                        i++;
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    public f c() {
        return this.c;
    }

    public void close() {
        if (!this.d) {
            this.d = true;
            this.q.close();
            f fVar = this.c;
            fVar.skip(fVar.d);
        }
    }

    public z d() {
        return this.q.d();
    }

    public int e() {
        z0(4);
        int readInt = this.c.readInt();
        return ((readInt & 255) << 24) | ((-16777216 & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public String e0() {
        return D(RecyclerView.FOREVER_NS);
    }

    public byte[] h0(long j) {
        if (a0(j)) {
            return this.c.h0(j);
        }
        throw new EOFException();
    }

    public boolean isOpen() {
        return !this.d;
    }

    public ByteString j(long j) {
        if (a0(j)) {
            return this.c.j(j);
        }
        throw new EOFException();
    }

    public long q0(f fVar, long j) {
        i.e(fVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(i0.d.a.a.a.k0("byteCount < 0: ", j).toString());
        } else if (!this.d) {
            f fVar2 = this.c;
            if (fVar2.d == 0 && this.q.q0(fVar2, (long) 8192) == -1) {
                return -1;
            }
            return this.c.q0(fVar, Math.min(j, this.c.d));
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public byte[] r() {
        this.c.V(this.q);
        return this.c.r();
    }

    public int read(ByteBuffer byteBuffer) {
        i.e(byteBuffer, "sink");
        f fVar = this.c;
        if (fVar.d == 0 && this.q.q0(fVar, (long) 8192) == -1) {
            return -1;
        }
        return this.c.read(byteBuffer);
    }

    public byte readByte() {
        z0(1);
        return this.c.readByte();
    }

    public int readInt() {
        z0(4);
        return this.c.readInt();
    }

    public short readShort() {
        z0(2);
        return this.c.readShort();
    }

    public long s0(w wVar) {
        i.e(wVar, "sink");
        long j = 0;
        while (this.q.q0(this.c, (long) 8192) != -1) {
            long e = this.c.e();
            if (e > 0) {
                j += e;
                ((f) wVar).S(this.c, e);
            }
        }
        f fVar = this.c;
        long j2 = fVar.d;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        ((f) wVar).S(fVar, j2);
        return j3;
    }

    public void skip(long j) {
        if (!this.d) {
            while (j > 0) {
                f fVar = this.c;
                if (fVar.d == 0 && this.q.q0(fVar, (long) 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.c.d);
                this.c.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean t() {
        if (!(!this.d)) {
            throw new IllegalStateException("closed".toString());
        } else if (!this.c.t() || this.q.q0(this.c, (long) 8192) != -1) {
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("buffer(");
        P0.append(this.q);
        P0.append(')');
        return P0.toString();
    }

    public void z0(long j) {
        if (!a0(j)) {
            throw new EOFException();
        }
    }

    /* compiled from: RealBufferedSource.kt */
    public static final class a extends InputStream {
        public final /* synthetic */ t c;

        public a(t tVar) {
            this.c = tVar;
        }

        public int available() {
            t tVar = this.c;
            if (!tVar.d) {
                return (int) Math.min(tVar.c.d, (long) Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        public void close() {
            this.c.close();
        }

        public int read() {
            t tVar = this.c;
            if (!tVar.d) {
                f fVar = tVar.c;
                if (fVar.d == 0 && tVar.q.q0(fVar, (long) 8192) == -1) {
                    return -1;
                }
                return this.c.c.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return this.c + ".inputStream()";
        }

        public int read(byte[] bArr, int i, int i2) {
            i.e(bArr, MessageExtension.FIELD_DATA);
            if (!this.c.d) {
                m0.r.t.a.r.m.a1.a.A0((long) bArr.length, (long) i, (long) i2);
                t tVar = this.c;
                f fVar = tVar.c;
                if (fVar.d == 0 && tVar.q.q0(fVar, (long) 8192) == -1) {
                    return -1;
                }
                return this.c.c.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }
}
