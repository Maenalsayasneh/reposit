package s0.a.a;

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ConcurrentMap;
import org.bouncycastle.asn1.ASN1Exception;
import s0.a.a.n;
import s0.a.g.l.a;

public class j extends FilterInputStream {
    public final int c;
    public final boolean d;
    public final byte[][] q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(InputStream inputStream) {
        super(inputStream);
        int c2 = a2.c(inputStream);
        this.c = c2;
        this.d = false;
        this.q = new byte[11][];
    }

    public static r b(int i, u1 u1Var, byte[][] bArr) throws IOException {
        int i2;
        if (i == 10) {
            return g.B(e(u1Var, bArr));
        }
        if (i == 12) {
            return new f1(u1Var.b());
        }
        int i3 = 0;
        if (i != 30) {
            switch (i) {
                case 1:
                    return c.B(e(u1Var, bArr));
                case 2:
                    return new k(u1Var.b(), false);
                case 3:
                    int i4 = u1Var.y;
                    if (i4 >= 1) {
                        int read = u1Var.read();
                        int i5 = i4 - 1;
                        byte[] bArr2 = new byte[i5];
                        if (i5 != 0) {
                            if (a.b(u1Var, bArr2, 0, i5) != i5) {
                                throw new EOFException("EOF encountered in middle of BIT STRING");
                            } else if (read > 0 && read < 8) {
                                int i6 = i5 - 1;
                                if (bArr2[i6] != ((byte) (bArr2[i6] & (255 << read)))) {
                                    return new k1(bArr2, read);
                                }
                            }
                        }
                        return new o0(bArr2, read);
                    }
                    throw new IllegalArgumentException("truncated BIT STRING detected");
                case 4:
                    return new x0(u1Var.b());
                case 5:
                    return v0.c;
                case 6:
                    byte[] e = e(u1Var, bArr);
                    ConcurrentMap<n.a, n> concurrentMap = n.c;
                    n nVar = (n) n.c.get(new n.a(e));
                    return nVar == null ? new n(e) : nVar;
                default:
                    switch (i) {
                        case 18:
                            return new w0(u1Var.b());
                        case 19:
                            return new a1(u1Var.b());
                        case 20:
                            return new d1(u1Var.b());
                        case 21:
                            return new h1(u1Var.b());
                        case 22:
                            return new u0(u1Var.b());
                        case 23:
                            return new a0(u1Var.b());
                        case 24:
                            return new i(u1Var.b());
                        case 25:
                            return new t0(u1Var.b());
                        case 26:
                            return new i1(u1Var.b());
                        case 27:
                            return new r0(u1Var.b());
                        case 28:
                            return new g1(u1Var.b());
                        default:
                            throw new IOException(i0.d.a.a.a.g0("unknown tag ", i, " encountered"));
                    }
            }
        } else {
            int i7 = u1Var.y;
            if ((i7 & 1) == 0) {
                int i8 = i7 / 2;
                char[] cArr = new char[i8];
                byte[] bArr3 = new byte[8];
                int i9 = 0;
                while (i7 >= 8) {
                    if (a.b(u1Var, bArr3, 0, 8) == 8) {
                        cArr[i9] = (char) ((bArr3[0] << 8) | (bArr3[1] & 255));
                        cArr[i9 + 1] = (char) ((bArr3[2] << 8) | (bArr3[3] & 255));
                        cArr[i9 + 2] = (char) ((bArr3[4] << 8) | (bArr3[5] & 255));
                        cArr[i9 + 3] = (char) ((bArr3[6] << 8) | (bArr3[7] & 255));
                        i9 += 4;
                        i7 -= 8;
                    } else {
                        throw new EOFException("EOF encountered in middle of BMPString");
                    }
                }
                if (i7 > 0) {
                    if (a.b(u1Var, bArr3, 0, i7) == i7) {
                        while (true) {
                            int i10 = i3 + 1;
                            int i11 = i10 + 1;
                            i2 = i9 + 1;
                            cArr[i9] = (char) ((bArr3[i3] << 8) | (bArr3[i10] & 255));
                            if (i11 >= i7) {
                                break;
                            }
                            i3 = i11;
                            i9 = i2;
                        }
                        i9 = i2;
                    } else {
                        throw new EOFException("EOF encountered in middle of BMPString");
                    }
                }
                if (u1Var.y == 0 && i8 == i9) {
                    return new n0(cArr);
                }
                throw new IllegalStateException();
            }
            throw new IOException("malformed BMPString encoding encountered");
        }
    }

    public static byte[] e(u1 u1Var, byte[][] bArr) throws IOException {
        int i = u1Var.y;
        if (i >= bArr.length) {
            return u1Var.b();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        if (i == bArr2.length) {
            if (i != 0) {
                int i2 = u1Var.d;
                if (i < i2) {
                    int b = i - a.b(u1Var.c, bArr2, 0, bArr2.length);
                    u1Var.y = b;
                    if (b == 0) {
                        u1Var.a(true);
                    } else {
                        StringBuilder P0 = i0.d.a.a.a.P0("DEF length ");
                        P0.append(u1Var.x);
                        P0.append(" object truncated by ");
                        P0.append(u1Var.y);
                        throw new EOFException(P0.toString());
                    }
                } else {
                    StringBuilder P02 = i0.d.a.a.a.P0("corrupted stream - out of bounds length found: ");
                    P02.append(u1Var.y);
                    P02.append(" >= ");
                    P02.append(i2);
                    throw new IOException(P02.toString());
                }
            }
            return bArr2;
        }
        throw new IllegalArgumentException("buffer length not right for data");
    }

    public static int f(InputStream inputStream, int i, boolean z) throws IOException {
        int read = inputStream.read();
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        } else if (read == 128) {
            return -1;
        } else {
            if (read <= 127) {
                return read;
            }
            int i2 = read & 127;
            if (i2 <= 4) {
                int i3 = 0;
                int i4 = 0;
                while (i4 < i2) {
                    int read2 = inputStream.read();
                    if (read2 >= 0) {
                        i3 = (i3 << 8) + read2;
                        i4++;
                    } else {
                        throw new EOFException("EOF found reading length");
                    }
                }
                if (i3 < 0) {
                    throw new IOException("corrupted stream - negative length found");
                } else if (i3 < i || z) {
                    return i3;
                } else {
                    throw new IOException(i0.d.a.a.a.h0("corrupted stream - out of bounds length found: ", i3, " >= ", i));
                }
            } else {
                throw new IOException(i0.d.a.a.a.e0("DER length more than 4 bytes: ", i2));
            }
        }
    }

    public static int k(InputStream inputStream, int i) throws IOException {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int i3 = 0;
        int read = inputStream.read();
        if ((read & 127) != 0) {
            while (read >= 0 && (read & 128) != 0) {
                i3 = (i3 | (read & 127)) << 7;
                read = inputStream.read();
            }
            if (read >= 0) {
                return i3 | (read & 127);
            }
            throw new EOFException("EOF found inside tag value.");
        }
        throw new IOException("corrupted stream - invalid high tag number found");
    }

    public r a(int i, int i2, int i3) throws IOException {
        int i4 = 0;
        boolean z = (i & 32) != 0;
        u1 u1Var = new u1(this, i3, this.c);
        if ((i & 64) != 0) {
            return new j1(z, i2, u1Var.b());
        }
        if ((i & 128) != 0) {
            return new x(u1Var).b(z, i2);
        }
        if (!z) {
            return b(i2, u1Var, this.q);
        }
        if (i2 == 4) {
            f l = l(u1Var);
            int i5 = l.c;
            o[] oVarArr = new o[i5];
            while (i4 != i5) {
                e c2 = l.c(i4);
                if (c2 instanceof o) {
                    oVarArr[i4] = (o) c2;
                    i4++;
                } else {
                    StringBuilder P0 = i0.d.a.a.a.P0("unknown object encountered in constructed OCTET STRING: ");
                    P0.append(c2.getClass());
                    throw new ASN1Exception(P0.toString());
                }
            }
            return new e0(oVarArr);
        } else if (i2 == 8) {
            return new l1(l(u1Var));
        } else {
            if (i2 != 16) {
                if (i2 == 17) {
                    f l2 = l(u1Var);
                    s sVar = m1.a;
                    return l2.c < 1 ? m1.b : new q1(l2);
                }
                throw new IOException(i0.d.a.a.a.g0("unknown tag ", i2, " encountered"));
            } else if (this.d) {
                return new y1(u1Var.b());
            } else {
                f l3 = l(u1Var);
                s sVar2 = m1.a;
                return l3.c < 1 ? m1.a : new o1(l3);
            }
        }
    }

    public r i() throws IOException {
        int read = read();
        if (read > 0) {
            int k = k(this, read);
            boolean z = (read & 32) != 0;
            int f = f(this, this.c, false);
            if (f >= 0) {
                try {
                    return a(read, k, f);
                } catch (IllegalArgumentException e) {
                    throw new ASN1Exception("corrupted stream detected", e);
                }
            } else if (z) {
                x xVar = new x(new w1(this, this.c), this.c);
                if ((read & 64) != 0) {
                    return new b0(k, xVar.c());
                }
                if ((read & 128) != 0) {
                    return xVar.b(true, k);
                }
                if (k == 4) {
                    return new e0(a.a(new m0(xVar)));
                }
                if (k == 8) {
                    try {
                        return new l1(xVar.c());
                    } catch (IllegalArgumentException e2) {
                        throw new ASN1Exception(e2.getMessage(), e2);
                    }
                } else if (k == 16) {
                    return new g0(xVar.c());
                } else {
                    if (k == 17) {
                        return new i0(xVar.c());
                    }
                    throw new IOException("unknown BER object encountered");
                }
            } else {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
        } else if (read != 0) {
            return null;
        } else {
            throw new IOException("unexpected end-of-contents marker");
        }
    }

    public f l(u1 u1Var) throws IOException {
        if (u1Var.y < 1) {
            return new f(0);
        }
        j jVar = new j((InputStream) u1Var);
        f fVar = new f(10);
        while (true) {
            r i = jVar.i();
            if (i == null) {
                return fVar;
            }
            fVar.a(i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(InputStream inputStream, boolean z) {
        super(inputStream);
        int c2 = a2.c(inputStream);
        this.c = c2;
        this.d = z;
        this.q = new byte[11][];
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j(byte[] r2) {
        /*
            r1 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r2)
            int r2 = r2.length
            r1.<init>(r0)
            r1.c = r2
            r2 = 0
            r1.d = r2
            r2 = 11
            byte[][] r2 = new byte[r2][]
            r1.q = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.a.j.<init>(byte[]):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j(byte[] r2, boolean r3) {
        /*
            r1 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r2)
            int r2 = r2.length
            r1.<init>(r0)
            r1.c = r2
            r1.d = r3
            r2 = 11
            byte[][] r2 = new byte[r2][]
            r1.q = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.a.j.<init>(byte[], boolean):void");
    }
}
