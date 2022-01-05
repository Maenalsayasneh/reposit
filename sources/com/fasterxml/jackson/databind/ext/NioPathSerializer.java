package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import i0.f.a.c.i;
import i0.f.a.c.p.e;
import java.io.IOException;
import java.nio.file.Path;

public class NioPathSerializer extends StdScalarSerializer<Path> {
    public NioPathSerializer() {
        super(Path.class);
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        jsonGenerator.Q0(((Path) obj).toUri().toString());
    }

    public void g(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        Path path = (Path) obj;
        WritableTypeId d = eVar.d(path, JsonToken.VALUE_STRING);
        d.b = Path.class;
        WritableTypeId e = eVar.e(jsonGenerator, d);
        jsonGenerator.Q0(path.toUri().toString());
        eVar.f(jsonGenerator, e);
    }
}
