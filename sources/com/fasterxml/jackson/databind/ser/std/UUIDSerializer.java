package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import i0.f.a.c.i;
import i0.f.a.c.r.d;
import i0.f.a.c.t.r;
import java.io.IOException;
import java.util.UUID;

public class UUIDSerializer extends StdScalarSerializer<UUID> implements d {
    public static final char[] q = "0123456789abcdef".toCharArray();
    public final Boolean x;

    public UUIDSerializer() {
        super(UUID.class);
        this.x = null;
    }

    public static final void v(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >> 24);
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >> 16);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >> 8);
        bArr[i4 + 1] = (byte) i;
    }

    public static void w(int i, char[] cArr, int i2) {
        char[] cArr2 = q;
        cArr[i2] = cArr2[(i >> 12) & 15];
        int i3 = i2 + 1;
        cArr[i3] = cArr2[(i >> 8) & 15];
        int i4 = i3 + 1;
        cArr[i4] = cArr2[(i >> 4) & 15];
        cArr[i4 + 1] = cArr2[i & 15];
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.g<?> a(i0.f.a.c.i r2, com.fasterxml.jackson.databind.BeanProperty r3) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r1 = this;
            java.lang.Class<T> r0 = r1.d
            com.fasterxml.jackson.annotation.JsonFormat$Value r2 = r1.m(r2, r3, r0)
            if (r2 == 0) goto L_0x0018
            com.fasterxml.jackson.annotation.JsonFormat$Shape r2 = r2.q
            com.fasterxml.jackson.annotation.JsonFormat$Shape r3 = com.fasterxml.jackson.annotation.JsonFormat.Shape.BINARY
            if (r2 != r3) goto L_0x0011
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            goto L_0x0019
        L_0x0011:
            com.fasterxml.jackson.annotation.JsonFormat$Shape r3 = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING
            if (r2 != r3) goto L_0x0018
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            java.lang.Boolean r3 = r1.x
            boolean r3 = java.util.Objects.equals(r2, r3)
            if (r3 != 0) goto L_0x0027
            com.fasterxml.jackson.databind.ser.std.UUIDSerializer r3 = new com.fasterxml.jackson.databind.ser.std.UUIDSerializer
            r3.<init>(r2)
            return r3
        L_0x0027:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.UUIDSerializer.a(i0.f.a.c.i, com.fasterxml.jackson.databind.BeanProperty):i0.f.a.c.g");
    }

    public boolean d(i iVar, Object obj) {
        UUID uuid = (UUID) obj;
        return uuid.getLeastSignificantBits() == 0 && uuid.getMostSignificantBits() == 0;
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        boolean z;
        UUID uuid = (UUID) obj;
        Boolean bool = this.x;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = !(jsonGenerator instanceof r) && jsonGenerator.b();
        }
        if (z) {
            byte[] bArr = new byte[16];
            long mostSignificantBits = uuid.getMostSignificantBits();
            long leastSignificantBits = uuid.getLeastSignificantBits();
            v((int) (mostSignificantBits >> 32), bArr, 0);
            v((int) mostSignificantBits, bArr, 4);
            v((int) (leastSignificantBits >> 32), bArr, 8);
            v((int) leastSignificantBits, bArr, 12);
            jsonGenerator.N(bArr);
            return;
        }
        char[] cArr = new char[36];
        long mostSignificantBits2 = uuid.getMostSignificantBits();
        int i = (int) (mostSignificantBits2 >> 32);
        w(i >> 16, cArr, 0);
        w(i, cArr, 4);
        cArr[8] = '-';
        int i2 = (int) mostSignificantBits2;
        w(i2 >>> 16, cArr, 9);
        cArr[13] = '-';
        w(i2, cArr, 14);
        cArr[18] = '-';
        long leastSignificantBits2 = uuid.getLeastSignificantBits();
        w((int) (leastSignificantBits2 >>> 48), cArr, 19);
        cArr[23] = '-';
        w((int) (leastSignificantBits2 >>> 32), cArr, 24);
        int i3 = (int) leastSignificantBits2;
        w(i3 >> 16, cArr, 28);
        w(i3, cArr, 32);
        jsonGenerator.R0(cArr, 0, 36);
    }

    public UUIDSerializer(Boolean bool) {
        super(UUID.class);
        this.x = bool;
    }
}
