package com.google.android.gms.internal.recaptcha;

import i0.d.a.a.a;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class zzda extends zzdd {
    public final int x;
    public final int y;

    public zzda(byte[] bArr, int i, int i2) {
        super(bArr);
        zzct.x(i, i + i2, bArr.length);
        this.x = i;
        this.y = i2;
    }

    public final byte b(int i) {
        int i2 = this.y;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.q[this.x + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(a.Q(22, "Index < 0: ", i));
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("Index > length: ");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    public final int c() {
        return this.y;
    }

    public final byte w(int i) {
        return this.q[this.x + i];
    }

    public final int z() {
        return this.x;
    }
}
