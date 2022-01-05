package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import i0.f.a.c.i;
import i0.f.a.c.p.e;
import i0.f.a.c.r.d;
import java.io.IOException;
import java.net.InetAddress;

public class InetAddressSerializer extends StdScalarSerializer<InetAddress> implements d {
    public final boolean q;

    public InetAddressSerializer() {
        super(InetAddress.class);
        this.q = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.g<?> a(i0.f.a.c.i r2, com.fasterxml.jackson.databind.BeanProperty r3) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r1 = this;
            java.lang.Class<T> r0 = r1.d
            com.fasterxml.jackson.annotation.JsonFormat$Value r2 = r1.m(r2, r3, r0)
            if (r2 == 0) goto L_0x0016
            com.fasterxml.jackson.annotation.JsonFormat$Shape r2 = r2.q
            boolean r3 = r2.isNumeric()
            if (r3 != 0) goto L_0x0014
            com.fasterxml.jackson.annotation.JsonFormat$Shape r3 = com.fasterxml.jackson.annotation.JsonFormat.Shape.ARRAY
            if (r2 != r3) goto L_0x0016
        L_0x0014:
            r2 = 1
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            boolean r3 = r1.q
            if (r2 == r3) goto L_0x0021
            com.fasterxml.jackson.databind.ser.std.InetAddressSerializer r3 = new com.fasterxml.jackson.databind.ser.std.InetAddressSerializer
            r3.<init>(r2)
            return r3
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.InetAddressSerializer.a(i0.f.a.c.i, com.fasterxml.jackson.databind.BeanProperty):i0.f.a.c.g");
    }

    public /* bridge */ /* synthetic */ void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        v((InetAddress) obj, jsonGenerator);
    }

    public void g(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        InetAddress inetAddress = (InetAddress) obj;
        WritableTypeId d = eVar.d(inetAddress, JsonToken.VALUE_STRING);
        d.b = InetAddress.class;
        WritableTypeId e = eVar.e(jsonGenerator, d);
        v(inetAddress, jsonGenerator);
        eVar.f(jsonGenerator, e);
    }

    public void v(InetAddress inetAddress, JsonGenerator jsonGenerator) throws IOException {
        String str;
        if (this.q) {
            str = inetAddress.getHostAddress();
        } else {
            str = inetAddress.toString().trim();
            int indexOf = str.indexOf(47);
            if (indexOf >= 0) {
                if (indexOf == 0) {
                    str = str.substring(1);
                } else {
                    str = str.substring(0, indexOf);
                }
            }
        }
        jsonGenerator.Q0(str);
    }

    public InetAddressSerializer(boolean z) {
        super(InetAddress.class);
        this.q = z;
    }
}
