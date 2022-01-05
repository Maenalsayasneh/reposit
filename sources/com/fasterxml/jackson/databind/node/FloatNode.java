package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import i0.f.a.c.i;
import java.io.IOException;

public class FloatNode extends NumericNode {
    public final float c;

    public FloatNode(float f) {
        this.c = f;
    }

    public final void b(JsonGenerator jsonGenerator, i iVar) throws IOException {
        jsonGenerator.f0(this.c);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof FloatNode)) {
            return false;
        }
        if (Float.compare(this.c, ((FloatNode) obj).c) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.c);
    }

    public JsonToken v() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }
}
