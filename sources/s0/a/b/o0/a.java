package s0.a.b.o0;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Hashtable;
import java.util.Objects;
import org.bouncycastle.crypto.util.SSHNamedCurves;
import s0.a.a.b1;
import s0.a.a.d3.h;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.n;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.v;
import s0.a.a.y2.c;
import s0.a.a.z;
import s0.a.b.k0.a0;
import s0.a.b.k0.b;
import s0.a.b.k0.b0;
import s0.a.b.k0.e0;
import s0.a.b.k0.f0;
import s0.a.b.k0.l1;
import s0.a.b.k0.p;
import s0.a.b.k0.q;
import s0.a.e.b.b0.c.h3;
import s0.a.g.j;

public class a {
    public static final byte[] a = j.c("openssh-key-v1\u0000");

    public static boolean a(s sVar) {
        for (int i = 0; i < sVar.size(); i++) {
            if (!(sVar.D(i) instanceof k)) {
                return false;
            }
        }
        return true;
    }

    public static byte[] b(b bVar) throws IOException {
        if (bVar instanceof l1) {
            r rVar = (r) d.a(bVar, (v) null).u();
            Objects.requireNonNull(rVar);
            return rVar.getEncoded();
        } else if (bVar instanceof b0) {
            r rVar2 = (r) d.a(bVar, (v) null).u();
            Objects.requireNonNull(rVar2);
            return rVar2.getEncoded();
        } else if (bVar instanceof q) {
            q qVar = (q) bVar;
            p pVar = qVar.d;
            f fVar = new f(10);
            fVar.a(new k(0));
            fVar.a(new k(pVar.q));
            fVar.a(new k(pVar.d));
            fVar.a(new k(pVar.c));
            fVar.a(new k(pVar.c.modPow(qVar.q, pVar.q)));
            fVar.a(new k(qVar.q));
            try {
                return new b1(fVar).getEncoded();
            } catch (Exception e) {
                throw new IllegalStateException(i0.d.a.a.a.a0(e, i0.d.a.a.a.P0("unable to encode DSAPrivateKeyParameters ")));
            }
        } else if (bVar instanceof e0) {
            e0 e0Var = (e0) bVar;
            f0 a2 = e0Var.a();
            f fVar2 = new f();
            try {
                fVar2.a.write(a);
                fVar2.e("none");
                fVar2.e("none");
                fVar2.e("");
                fVar2.b(1);
                fVar2.d(m0.r.t.a.r.m.a1.a.m1(a2));
                f fVar3 = new f();
                int nextInt = s0.a.b.j.a().nextInt();
                fVar3.b(nextInt);
                fVar3.b(nextInt);
                fVar3.e("ssh-ed25519");
                byte[] encoded = a2.getEncoded();
                fVar3.d(encoded);
                fVar3.d(h3.R(h3.I(e0Var.d), encoded));
                fVar3.e("");
                int size = fVar3.a.size() % 8;
                if (size != 0) {
                    int i = 8 - size;
                    for (int i2 = 1; i2 <= i; i2++) {
                        fVar3.a.write(i2);
                    }
                }
                fVar2.d(fVar3.a.toByteArray());
                return fVar2.a();
            } catch (IOException e2) {
                throw new IllegalStateException(e2.getMessage(), e2);
            }
        } else {
            StringBuilder P0 = i0.d.a.a.a.P0("unable to convert ");
            P0.append(bVar.getClass().getName());
            P0.append(" to openssh private key");
            throw new IllegalArgumentException(P0.toString());
        }
    }

    public static b c(byte[] bArr) {
        byte[] bArr2;
        byte b;
        b bVar = null;
        if (bArr[0] == 48) {
            s B = s.B(bArr);
            if (B.size() == 6) {
                if (a(B) && ((k) B.D(0)).D().equals(s0.a.g.b.a)) {
                    bVar = new q(((k) B.D(5)).D(), new p(((k) B.D(1)).D(), ((k) B.D(2)).D(), ((k) B.D(3)).D()));
                }
            } else if (B.size() == 9) {
                if (a(B) && ((k) B.D(0)).D().equals(s0.a.g.b.a)) {
                    s0.a.a.w2.s s = s0.a.a.w2.s.s(B);
                    bVar = new l1(s.d, s.q, s.x, s.y, s.Y1, s.Z1, s.a2, s.b2);
                }
            } else if (B.size() == 4 && (B.D(3) instanceof z) && (B.D(2) instanceof z)) {
                s0.a.a.y2.a s2 = s0.a.a.y2.a.s(B);
                n nVar = (n) s2.u(0);
                bVar = new b0(s2.t(), new a0(nVar, m0.r.t.a.r.m.a1.a.H1(nVar)));
            }
        } else {
            e eVar = new e(a, bArr);
            if ("none".equals(eVar.d())) {
                eVar.f();
                eVar.f();
                if (eVar.e() == 1) {
                    m0.r.t.a.r.m.a1.a.S2(eVar.c());
                    int e = eVar.e();
                    if (e == 0) {
                        bArr2 = new byte[0];
                    } else {
                        int i = eVar.b;
                        if (i > bArr.length - e) {
                            throw new IllegalArgumentException("not enough data for block");
                        } else if (e % 8 == 0) {
                            int i2 = i + e;
                            eVar.b = i2;
                            if (e > 0 && (b = bArr[i2 - 1] & 255) > 0 && b < 8) {
                                i2 -= b;
                                int i3 = 1;
                                int i4 = i2;
                                while (i3 <= b) {
                                    if (i3 == (eVar.a[i4] & 255)) {
                                        i3++;
                                        i4++;
                                    } else {
                                        throw new IllegalArgumentException("incorrect padding");
                                    }
                                }
                            }
                            bArr2 = h3.q0(eVar.a, i, i2);
                        } else {
                            throw new IllegalArgumentException("missing padding");
                        }
                    }
                    if (!eVar.a()) {
                        e eVar2 = new e(bArr2);
                        if (eVar2.e() == eVar2.e()) {
                            String d = eVar2.d();
                            if ("ssh-ed25519".equals(d)) {
                                eVar2.c();
                                byte[] c = eVar2.c();
                                if (c.length == 64) {
                                    bVar = new e0(c, 0);
                                } else {
                                    throw new IllegalStateException("private key value of wrong length");
                                }
                            } else if (d.startsWith("ecdsa")) {
                                n nVar2 = SSHNamedCurves.b.get(j.a(eVar2.c()));
                                if (nVar2 != null) {
                                    Hashtable hashtable = s0.a.a.r2.a.a;
                                    h e2 = c.e(nVar2);
                                    if (e2 != null) {
                                        eVar2.c();
                                        bVar = new b0(new BigInteger(1, eVar2.c()), new a0(nVar2, e2));
                                    } else {
                                        throw new IllegalStateException("Curve not found for: " + nVar2);
                                    }
                                } else {
                                    throw new IllegalStateException(i0.d.a.a.a.n0("OID not found for: ", d));
                                }
                            }
                            eVar2.f();
                            if (eVar2.a()) {
                                throw new IllegalArgumentException("private key block has trailing data");
                            }
                        } else {
                            throw new IllegalStateException("private key check values are not the same");
                        }
                    } else {
                        throw new IllegalArgumentException("decoded key has trailing data");
                    }
                } else {
                    throw new IllegalStateException("multiple keys not supported");
                }
            } else {
                throw new IllegalStateException("encrypted keys not supported");
            }
        }
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("unable to parse key");
    }
}
