package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import i0.d.a.a.a;
import i0.f.a.b.m.c;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public class UUIDDeserializer extends FromStringDeserializer<UUID> {
    public static final int[] y;

    static {
        int[] iArr = new int[127];
        y = iArr;
        Arrays.fill(iArr, -1);
        for (int i = 0; i < 10; i++) {
            y[i + 48] = i;
        }
        for (int i2 = 0; i2 < 6; i2++) {
            int[] iArr2 = y;
            int i3 = i2 + 10;
            iArr2[i2 + 97] = i3;
            iArr2[i2 + 65] = i3;
        }
    }

    public UUIDDeserializer() {
        super(UUID.class);
    }

    public static int E0(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long F0(byte[] bArr, int i) {
        return ((((long) E0(bArr, i + 4)) << 32) >>> 32) | (((long) E0(bArr, i)) << 32);
    }

    public int C0(String str, DeserializationContext deserializationContext, char c) throws JsonMappingException {
        throw deserializationContext.t0(str, this.d, String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", new Object[]{Character.valueOf(c), Integer.toHexString(c)}));
    }

    public final UUID D0(byte[] bArr, DeserializationContext deserializationContext) throws JsonMappingException {
        if (bArr.length == 16) {
            return new UUID(F0(bArr, 0), F0(bArr, 8));
        }
        throw new InvalidFormatException(deserializationContext.Z1, a.u0(a.P0("Can only construct UUIDs from byte[16]; got "), bArr.length, " bytes"), bArr, this.d);
    }

    public int G0(String str, int i, DeserializationContext deserializationContext) throws JsonMappingException {
        char charAt = str.charAt(i);
        char charAt2 = str.charAt(i + 1);
        if (charAt <= 127 && charAt2 <= 127) {
            int[] iArr = y;
            int i2 = iArr[charAt2] | (iArr[charAt] << 4);
            if (i2 >= 0) {
                return i2;
            }
        }
        if (charAt > 127 || y[charAt] < 0) {
            C0(str, deserializationContext, charAt);
            throw null;
        }
        C0(str, deserializationContext, charAt2);
        throw null;
    }

    public int H0(String str, int i, DeserializationContext deserializationContext) throws JsonMappingException {
        return G0(str, i + 6, deserializationContext) + (G0(str, i, deserializationContext) << 24) + (G0(str, i + 2, deserializationContext) << 16) + (G0(str, i + 4, deserializationContext) << 8);
    }

    public int I0(String str, int i, DeserializationContext deserializationContext) throws JsonMappingException {
        return G0(str, i + 2, deserializationContext) + (G0(str, i, deserializationContext) << 8);
    }

    public Object k(DeserializationContext deserializationContext) {
        return new UUID(0, 0);
    }

    public Object y0(String str, DeserializationContext deserializationContext) throws IOException {
        if (str.length() != 36) {
            if (str.length() == 24) {
                Base64Variant base64Variant = i0.f.a.b.a.b;
                Objects.requireNonNull(base64Variant);
                c cVar = new c();
                base64Variant.d(str, cVar);
                return D0(cVar.k(), deserializationContext);
            }
            deserializationContext.Z(this.d, str, "UUID has to be represented by standard 36-char representation", new Object[0]);
            throw null;
        } else if (str.charAt(8) == '-' && str.charAt(13) == '-' && str.charAt(18) == '-' && str.charAt(23) == '-') {
            int I0 = I0(str, 24, deserializationContext);
            return new UUID((((long) H0(str, 0, deserializationContext)) << 32) + ((((long) I0(str, 9, deserializationContext)) << 16) | ((long) I0(str, 14, deserializationContext))), ((((long) H0(str, 28, deserializationContext)) << 32) >>> 32) | (((long) (I0 | (I0(str, 19, deserializationContext) << 16))) << 32));
        } else {
            deserializationContext.Z(this.d, str, "UUID has to be represented by standard 36-char representation", new Object[0]);
            throw null;
        }
    }

    public Object z0(Object obj, DeserializationContext deserializationContext) throws IOException {
        if (obj instanceof byte[]) {
            return D0((byte[]) obj, deserializationContext);
        }
        super.z0(obj, deserializationContext);
        throw null;
    }
}
