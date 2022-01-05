package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import i0.f.a.c.i;
import i0.f.a.c.p.e;
import java.io.IOException;

public abstract class ValueNode extends BaseJsonNode {
    public void c(JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        WritableTypeId e = eVar.e(jsonGenerator, eVar.d(this, v()));
        b(jsonGenerator, iVar);
        eVar.f(jsonGenerator, e);
    }

    public abstract JsonToken v();
}
