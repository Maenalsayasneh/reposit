package m0.r.t.a.r.h;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* compiled from: CodedInputStream */
public final class d {
    public final byte[] a = new byte[4096];
    public final boolean b;
    public int c = 0;
    public int d;
    public int e = 0;
    public final InputStream f;
    public int g;
    public int h = 0;
    public int i = Integer.MAX_VALUE;
    public int j;

    public d(InputStream inputStream) {
        this.f = inputStream;
        this.b = false;
    }

    public void a(int i2) throws InvalidProtocolBufferException {
        if (this.g != i2) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public int b() {
        int i2 = this.i;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - (this.h + this.e);
    }

    public void c(int i2) {
        this.i = i2;
        p();
    }

    public int d(int i2) throws InvalidProtocolBufferException {
        if (i2 >= 0) {
            int i3 = this.h + this.e + i2;
            int i4 = this.i;
            if (i3 <= i4) {
                this.i = i3;
                p();
                return i4;
            }
            throw InvalidProtocolBufferException.d();
        }
        throw InvalidProtocolBufferException.a();
    }

    public boolean e() throws IOException {
        return m() != 0;
    }

    public c f() throws IOException {
        int l = l();
        int i2 = this.c;
        int i3 = this.e;
        if (l <= i2 - i3 && l > 0) {
            byte[] bArr = this.a;
            c cVar = c.c;
            byte[] bArr2 = new byte[l];
            System.arraycopy(bArr, i3, bArr2, 0, l);
            k kVar = new k(bArr2);
            this.e += l;
            return kVar;
        } else if (l == 0) {
            return c.c;
        } else {
            return new k(i(l));
        }
    }

    public int g() throws IOException {
        return l();
    }

    public <T extends l> T h(n<T> nVar, e eVar) throws IOException {
        int l = l();
        if (this.j < 64) {
            int d2 = d(l);
            this.j++;
            T t = (l) nVar.a(this, eVar);
            a(0);
            this.j--;
            this.i = d2;
            p();
            return t;
        }
        throw InvalidProtocolBufferException.b();
    }

    public final byte[] i(int i2) throws IOException {
        if (i2 > 0) {
            int i3 = this.h;
            int i4 = this.e;
            int i5 = i3 + i4 + i2;
            int i6 = this.i;
            if (i5 > i6) {
                s((i6 - i3) - i4);
                throw InvalidProtocolBufferException.d();
            } else if (i2 < 4096) {
                byte[] bArr = new byte[i2];
                int i7 = this.c - i4;
                System.arraycopy(this.a, i4, bArr, 0, i7);
                int i8 = this.c;
                this.e = i8;
                int i9 = i2 - i7;
                if (i8 - i8 >= i9 || t(i9)) {
                    System.arraycopy(this.a, 0, bArr, i7, i9);
                    this.e = i9;
                    return bArr;
                }
                throw InvalidProtocolBufferException.d();
            } else {
                int i10 = this.c;
                this.h = i3 + i10;
                this.e = 0;
                this.c = 0;
                int i11 = i10 - i4;
                int i12 = i2 - i11;
                ArrayList arrayList = new ArrayList();
                while (i12 > 0) {
                    int min = Math.min(i12, 4096);
                    byte[] bArr2 = new byte[min];
                    int i13 = 0;
                    while (i13 < min) {
                        InputStream inputStream = this.f;
                        int read = inputStream == null ? -1 : inputStream.read(bArr2, i13, min - i13);
                        if (read != -1) {
                            this.h += read;
                            i13 += read;
                        } else {
                            throw InvalidProtocolBufferException.d();
                        }
                    }
                    i12 -= min;
                    arrayList.add(bArr2);
                }
                byte[] bArr3 = new byte[i2];
                System.arraycopy(this.a, i4, bArr3, 0, i11);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    byte[] bArr4 = (byte[]) it.next();
                    System.arraycopy(bArr4, 0, bArr3, i11, bArr4.length);
                    i11 += bArr4.length;
                }
                return bArr3;
            }
        } else if (i2 == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        } else {
            throw InvalidProtocolBufferException.a();
        }
    }

    public int j() throws IOException {
        int i2 = this.e;
        if (this.c - i2 < 4) {
            q(4);
            i2 = this.e;
        }
        byte[] bArr = this.a;
        this.e = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public long k() throws IOException {
        int i2 = this.e;
        if (this.c - i2 < 8) {
            q(8);
            i2 = this.e;
        }
        byte[] bArr = this.a;
        this.e = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        if (r2[r3] < 0) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int l() throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.e
            int r1 = r9.c
            if (r1 != r0) goto L_0x0008
            goto L_0x007c
        L_0x0008:
            byte[] r2 = r9.a
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0013
            r9.e = r3
            return r0
        L_0x0013:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x0019
            goto L_0x007c
        L_0x0019:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x002d
            r5 = -128(0xffffffffffffff80, double:NaN)
        L_0x0029:
            long r2 = r3 ^ r5
            int r0 = (int) r2
            goto L_0x0082
        L_0x002d:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            long r7 = (long) r0
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x003f
            r0 = 16256(0x3f80, double:8.0315E-320)
            long r0 = r0 ^ r7
            int r0 = (int) r0
        L_0x003d:
            r1 = r3
            goto L_0x0082
        L_0x003f:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            long r3 = (long) r0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x004f
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L_0x0029
        L_0x004f:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            long r4 = (long) r0
            r6 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r4 = r4 ^ r6
            int r0 = (int) r4
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0082
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0082
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 >= 0) goto L_0x0082
        L_0x007c:
            long r0 = r9.n()
            int r0 = (int) r0
            return r0
        L_0x0082:
            r9.e = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.h.d.l():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
        if (((long) r2[r0]) < 0) goto L_0x00b8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long m() throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.e
            int r1 = r9.c
            if (r1 != r0) goto L_0x0008
            goto L_0x00b8
        L_0x0008:
            byte[] r2 = r9.a
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0014
            r9.e = r3
            long r0 = (long) r0
            return r0
        L_0x0014:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x001b
            goto L_0x00b8
        L_0x001b:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x002f
            r5 = -128(0xffffffffffffff80, double:NaN)
        L_0x002b:
            long r2 = r3 ^ r5
            goto L_0x00bf
        L_0x002f:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            long r7 = (long) r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0042
            r1 = 16256(0x3f80, double:8.0315E-320)
        L_0x003d:
            long r2 = r3 ^ r1
            r1 = r0
            goto L_0x00bf
        L_0x0042:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            int r0 = r0 << 21
            long r7 = (long) r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0052
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L_0x002b
        L_0x0052:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 28
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0063
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            goto L_0x003d
        L_0x0063:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0076
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            goto L_0x002b
        L_0x0076:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0089
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x003d
        L_0x0089:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x009c
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x002b
        L_0x009c:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x00bd
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00be
        L_0x00b8:
            long r0 = r9.n()
            return r0
        L_0x00bd:
            r1 = r0
        L_0x00be:
            r2 = r3
        L_0x00bf:
            r9.e = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.h.d.m():long");
    }

    public long n() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            if (this.e == this.c) {
                q(1);
            }
            byte[] bArr = this.a;
            int i3 = this.e;
            this.e = i3 + 1;
            byte b2 = bArr[i3];
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i2;
            if ((b2 & 128) == 0) {
                return j2;
            }
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    public int o() throws IOException {
        boolean z = true;
        if (this.e != this.c || t(1)) {
            z = false;
        }
        if (z) {
            this.g = 0;
            return 0;
        }
        int l = l();
        this.g = l;
        if ((l >>> 3) != 0) {
            return l;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    public final void p() {
        int i2 = this.c + this.d;
        this.c = i2;
        int i3 = this.h + i2;
        int i4 = this.i;
        if (i3 > i4) {
            int i5 = i3 - i4;
            this.d = i5;
            this.c = i2 - i5;
            return;
        }
        this.d = 0;
    }

    public final void q(int i2) throws IOException {
        if (!t(i2)) {
            throw InvalidProtocolBufferException.d();
        }
    }

    public boolean r(int i2, CodedOutputStream codedOutputStream) throws IOException {
        int o;
        int i3 = i2 & 7;
        if (i3 == 0) {
            long m = m();
            codedOutputStream.y(i2);
            codedOutputStream.z(m);
            return true;
        } else if (i3 == 1) {
            long k = k();
            codedOutputStream.y(i2);
            codedOutputStream.x(k);
            return true;
        } else if (i3 == 2) {
            c f2 = f();
            codedOutputStream.y(i2);
            codedOutputStream.m(f2);
            return true;
        } else if (i3 == 3) {
            codedOutputStream.y(i2);
            do {
                o = o();
                if (o == 0 || !r(o, codedOutputStream)) {
                    int i4 = ((i2 >>> 3) << 3) | 4;
                    a(i4);
                    codedOutputStream.y(i4);
                }
                o = o();
                break;
            } while (!r(o, codedOutputStream));
            int i42 = ((i2 >>> 3) << 3) | 4;
            a(i42);
            codedOutputStream.y(i42);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                int j2 = j();
                codedOutputStream.y(i2);
                codedOutputStream.w(j2);
                return true;
            }
            throw new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
        }
    }

    public void s(int i2) throws IOException {
        int i3 = this.c;
        int i4 = this.e;
        if (i2 <= i3 - i4 && i2 >= 0) {
            this.e = i4 + i2;
        } else if (i2 >= 0) {
            int i5 = this.h;
            int i6 = i5 + i4 + i2;
            int i7 = this.i;
            if (i6 <= i7) {
                int i8 = i3 - i4;
                this.e = i3;
                q(1);
                while (true) {
                    int i9 = i2 - i8;
                    int i10 = this.c;
                    if (i9 > i10) {
                        i8 += i10;
                        this.e = i10;
                        q(1);
                    } else {
                        this.e = i9;
                        return;
                    }
                }
            } else {
                s((i7 - i5) - i4);
                throw InvalidProtocolBufferException.d();
            }
        } else {
            throw InvalidProtocolBufferException.a();
        }
    }

    public final boolean t(int i2) throws IOException {
        int i3 = this.e;
        int i4 = i3 + i2;
        int i5 = this.c;
        if (i4 > i5) {
            if (this.h + i3 + i2 <= this.i && this.f != null) {
                if (i3 > 0) {
                    if (i5 > i3) {
                        byte[] bArr = this.a;
                        System.arraycopy(bArr, i3, bArr, 0, i5 - i3);
                    }
                    this.h += i3;
                    this.c -= i3;
                    this.e = 0;
                }
                InputStream inputStream = this.f;
                byte[] bArr2 = this.a;
                int i6 = this.c;
                int read = inputStream.read(bArr2, i6, bArr2.length - i6);
                if (read == 0 || read < -1 || read > this.a.length) {
                    StringBuilder sb = new StringBuilder(102);
                    sb.append("InputStream#read(byte[]) returned invalid result: ");
                    sb.append(read);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                } else if (read > 0) {
                    this.c += read;
                    if ((this.h + i2) - 67108864 <= 0) {
                        p();
                        if (this.c >= i2) {
                            return true;
                        }
                        return t(i2);
                    }
                    throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
            }
            return false;
        }
        StringBuilder sb2 = new StringBuilder(77);
        sb2.append("refillBuffer() called when ");
        sb2.append(i2);
        sb2.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb2.toString());
    }
}
