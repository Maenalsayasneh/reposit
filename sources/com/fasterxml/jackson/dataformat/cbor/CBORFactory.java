package com.fasterxml.jackson.dataformat.cbor;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.dataformat.cbor.CBORParser;
import i0.f.a.b.d;
import i0.f.a.b.i.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;

public class CBORFactory extends JsonFactory {
    public static final int f2 = CBORParser.Feature.collectDefaults();
    public static final int g2 = CBORGenerator$Feature.collectDefaults();
    public int h2 = f2;

    public CBORFactory() {
        super((d) null);
    }

    public b a(Object obj, boolean z) {
        return new b(d(), obj, z);
    }

    public JsonGenerator b(Writer writer, b bVar) throws IOException {
        throw new UnsupportedOperationException("Can not create generator for non-byte-based target");
    }

    public JsonParser e(byte[] bArr) throws IOException, JsonParseException {
        return c(bArr, 0, bArr.length, new b(d(), bArr, true));
    }

    /* renamed from: g */
    public CBORParser c(byte[] bArr, int i, int i2, b bVar) throws IOException {
        return new CBORParser(bVar, this.a2, this.c2, this.Y1.q(this.Z1), (InputStream) null, bArr, i, i + i2, false);
    }
}
