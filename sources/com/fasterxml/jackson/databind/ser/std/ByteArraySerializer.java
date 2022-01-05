package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import i0.f.a.c.i;
import i0.f.a.c.j.a;
import i0.f.a.c.p.e;
import java.io.IOException;

@a
public class ByteArraySerializer extends StdSerializer<byte[]> {
    public ByteArraySerializer() {
        super(byte[].class);
    }

    public boolean d(i iVar, Object obj) {
        return ((byte[]) obj).length == 0;
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        byte[] bArr = (byte[]) obj;
        jsonGenerator.M(iVar.q.d.e2, bArr, 0, bArr.length);
    }

    public void g(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        byte[] bArr = (byte[]) obj;
        WritableTypeId e = eVar.e(jsonGenerator, eVar.d(bArr, JsonToken.VALUE_EMBEDDED_OBJECT));
        jsonGenerator.M(iVar.q.d.e2, bArr, 0, bArr.length);
        eVar.f(jsonGenerator, e);
    }
}
