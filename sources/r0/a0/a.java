package r0.a0;

import m0.n.b.i;
import r0.f;
import r0.q;
import r0.u;

/* compiled from: Buffer.kt */
public final class a {
    public static final byte[] a;

    static {
        i.e("0123456789abcdef", "$this$asUtf8ToByteArray");
        byte[] bytes = "0123456789abcdef".getBytes(m0.t.a.a);
        i.d(bytes, "(this as java.lang.String).getBytes(charset)");
        a = bytes;
    }

    public static final String a(f fVar, long j) {
        i.e(fVar, "$this$readUtf8Line");
        if (j > 0) {
            long j2 = j - 1;
            if (fVar.i(j2) == ((byte) 13)) {
                String y = fVar.y(j2);
                fVar.skip(2);
                return y;
            }
        }
        String y2 = fVar.y(j);
        fVar.skip(1);
        return y2;
    }

    public static final int b(f fVar, q qVar, boolean z) {
        int i;
        int i2;
        int i3;
        u uVar;
        int i4;
        f fVar2 = fVar;
        q qVar2 = qVar;
        i.e(fVar2, "$this$selectPrefix");
        i.e(qVar2, "options");
        u uVar2 = fVar2.c;
        if (uVar2 != null) {
            byte[] bArr = uVar2.a;
            int i5 = uVar2.b;
            int i6 = uVar2.c;
            int[] iArr = qVar2.q;
            u uVar3 = uVar2;
            int i7 = -1;
            int i8 = 0;
            loop0:
            while (true) {
                int i9 = i8 + 1;
                int i10 = iArr[i8];
                int i11 = i9 + 1;
                int i12 = iArr[i9];
                if (i12 != -1) {
                    i7 = i12;
                }
                if (uVar3 == null) {
                    break;
                }
                if (i10 < 0) {
                    int i13 = (i10 * -1) + i11;
                    while (true) {
                        int i14 = i5 + 1;
                        int i15 = i11 + 1;
                        if ((bArr[i5] & 255) != iArr[i11]) {
                            return i7;
                        }
                        boolean z2 = i15 == i13;
                        if (i14 == i6) {
                            i.c(uVar3);
                            u uVar4 = uVar3.f;
                            i.c(uVar4);
                            i4 = uVar4.b;
                            byte[] bArr2 = uVar4.a;
                            i3 = uVar4.c;
                            if (uVar4 != uVar2) {
                                byte[] bArr3 = bArr2;
                                uVar = uVar4;
                                bArr = bArr3;
                            } else if (!z2) {
                                break loop0;
                            } else {
                                bArr = bArr2;
                                uVar = null;
                            }
                        } else {
                            u uVar5 = uVar3;
                            i3 = i6;
                            i4 = i14;
                            uVar = uVar5;
                        }
                        if (z2) {
                            i2 = iArr[i15];
                            i = i4;
                            i6 = i3;
                            uVar3 = uVar;
                            break;
                        }
                        i5 = i4;
                        i6 = i3;
                        i11 = i15;
                        uVar3 = uVar;
                    }
                } else {
                    i = i5 + 1;
                    byte b = bArr[i5] & 255;
                    int i16 = i11 + i10;
                    while (i11 != i16) {
                        if (b == iArr[i11]) {
                            i2 = iArr[i11 + i10];
                            if (i == i6) {
                                uVar3 = uVar3.f;
                                i.c(uVar3);
                                i = uVar3.b;
                                bArr = uVar3.a;
                                i6 = uVar3.c;
                                if (uVar3 == uVar2) {
                                    uVar3 = null;
                                }
                            }
                        } else {
                            i11++;
                        }
                    }
                    return i7;
                }
                if (i2 >= 0) {
                    return i2;
                }
                i8 = -i2;
                i5 = i;
            }
            if (z) {
                return -2;
            }
            return i7;
        } else if (z) {
            return -2;
        } else {
            return -1;
        }
    }
}
