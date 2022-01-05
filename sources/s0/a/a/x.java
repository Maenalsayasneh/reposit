package s0.a.a;

import i0.d.a.a.a;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Exception;

public class x {
    public final InputStream a;
    public final int b;
    public final byte[][] c = new byte[11][];

    public x(InputStream inputStream) {
        int c2 = a2.c(inputStream);
        this.a = inputStream;
        this.b = c2;
    }

    public x(InputStream inputStream, int i) {
        this.a = inputStream;
        this.b = i;
    }

    public e a() throws IOException {
        int read = this.a.read();
        if (read == -1) {
            return null;
        }
        InputStream inputStream = this.a;
        boolean z = false;
        if (inputStream instanceof w1) {
            w1 w1Var = (w1) inputStream;
            w1Var.Y1 = false;
            w1Var.b();
        }
        int k = j.k(this.a, read);
        boolean z2 = (read & 32) != 0;
        InputStream inputStream2 = this.a;
        int i = this.b;
        if (k == 4 || k == 16 || k == 17 || k == 8) {
            z = true;
        }
        int f = j.f(inputStream2, i, z);
        if (f >= 0) {
            u1 u1Var = new u1(this.a, f, this.b);
            if ((read & 64) != 0) {
                return new j1(z2, k, u1Var.b());
            }
            if ((read & 128) != 0) {
                return new l0(z2, k, new x(u1Var));
            }
            if (z2) {
                if (k == 4) {
                    return new f0(new x(u1Var));
                }
                if (k == 8) {
                    return new q0(new x(u1Var));
                }
                if (k == 16) {
                    return new p1(new x(u1Var));
                }
                if (k == 17) {
                    return new r1(new x(u1Var));
                }
                throw new IOException(a.g0("unknown tag ", k, " encountered"));
            } else if (k == 4) {
                return new y0(u1Var);
            } else {
                try {
                    return j.b(k, u1Var, this.c);
                } catch (IllegalArgumentException e) {
                    throw new ASN1Exception("corrupted stream detected", e);
                }
            }
        } else if (z2) {
            x xVar = new x(new w1(this.a, this.b), this.b);
            if ((read & 64) != 0) {
                return new c0(k, xVar);
            }
            if ((read & 128) != 0) {
                return new l0(true, k, xVar);
            }
            if (k == 4) {
                return new f0(xVar);
            }
            if (k == 8) {
                return new q0(xVar);
            }
            if (k == 16) {
                return new h0(xVar);
            }
            if (k == 17) {
                return new j0(xVar);
            }
            throw new ASN1Exception(a.R(k, a.P0("unknown BER object encountered: 0x")));
        } else {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
    }

    public r b(boolean z, int i) throws IOException {
        if (!z) {
            return new s1(false, i, new x0(((u1) this.a).b()));
        }
        f c2 = c();
        if (this.a instanceof w1) {
            int i2 = c2.c;
            if (i2 == 1) {
                return new k0(true, i, c2.c(0));
            }
            g0 g0Var = d0.a;
            return new k0(false, i, i2 < 1 ? d0.a : new g0(c2));
        }
        int i3 = c2.c;
        if (i3 == 1) {
            return new s1(true, i, c2.c(0));
        }
        s sVar = m1.a;
        return new s1(false, i, i3 < 1 ? m1.a : new o1(c2));
    }

    public f c() throws IOException {
        e a2 = a();
        if (a2 == null) {
            return new f(0);
        }
        f fVar = new f(10);
        do {
            fVar.a(a2 instanceof v1 ? ((v1) a2).j() : a2.c());
            a2 = a();
        } while (a2 != null);
        return fVar;
    }
}
