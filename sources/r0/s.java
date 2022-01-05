package r0;

import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.d.a.a.a;
import java.nio.ByteBuffer;
import m0.n.b.i;
import okio.ByteString;

/* compiled from: RealBufferedSink.kt */
public final class s implements h {
    public final f c = new f();
    public boolean d;
    public final w q;

    public s(w wVar) {
        i.e(wVar, "sink");
        this.q = wVar;
    }

    public h A() {
        if (!this.d) {
            long e = this.c.e();
            if (e > 0) {
                this.q.S(this.c, e);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public h B0(long j) {
        if (!this.d) {
            this.c.B0(j);
            A();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public h K(String str) {
        i.e(str, "string");
        if (!this.d) {
            this.c.U(str);
            return A();
        }
        throw new IllegalStateException("closed".toString());
    }

    public h R(byte[] bArr, int i, int i2) {
        i.e(bArr, Stripe3ds2AuthParams.FIELD_SOURCE);
        if (!this.d) {
            this.c.H(bArr, i, i2);
            A();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public void S(f fVar, long j) {
        i.e(fVar, Stripe3ds2AuthParams.FIELD_SOURCE);
        if (!this.d) {
            this.c.S(fVar, j);
            A();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public long V(y yVar) {
        i.e(yVar, Stripe3ds2AuthParams.FIELD_SOURCE);
        long j = 0;
        while (true) {
            long q02 = ((o) yVar).q0(this.c, (long) 8192);
            if (q02 == -1) {
                return j;
            }
            j += q02;
            A();
        }
    }

    public h W(long j) {
        if (!this.d) {
            this.c.W(j);
            return A();
        }
        throw new IllegalStateException("closed".toString());
    }

    public f c() {
        return this.c;
    }

    public void close() {
        if (!this.d) {
            Throwable th = null;
            try {
                f fVar = this.c;
                long j = fVar.d;
                if (j > 0) {
                    this.q.S(fVar, j);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.q.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.d = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public z d() {
        return this.q.d();
    }

    public void flush() {
        if (!this.d) {
            f fVar = this.c;
            long j = fVar.d;
            if (j > 0) {
                this.q.S(fVar, j);
            }
            this.q.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean isOpen() {
        return !this.d;
    }

    public h k0(byte[] bArr) {
        i.e(bArr, Stripe3ds2AuthParams.FIELD_SOURCE);
        if (!this.d) {
            this.c.G(bArr);
            A();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public h l0(ByteString byteString) {
        i.e(byteString, "byteString");
        if (!this.d) {
            this.c.F(byteString);
            A();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public h m(int i) {
        if (!this.d) {
            this.c.Q(i);
            A();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public h o(int i) {
        if (!this.d) {
            this.c.O(i);
            A();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public String toString() {
        StringBuilder P0 = a.P0("buffer(");
        P0.append(this.q);
        P0.append(')');
        return P0.toString();
    }

    public h u(int i) {
        if (!this.d) {
            this.c.I(i);
            A();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public int write(ByteBuffer byteBuffer) {
        i.e(byteBuffer, Stripe3ds2AuthParams.FIELD_SOURCE);
        if (!this.d) {
            int write = this.c.write(byteBuffer);
            A();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }
}
