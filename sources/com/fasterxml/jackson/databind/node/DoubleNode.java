package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import i0.f.a.c.i;
import java.io.IOException;

public class DoubleNode extends NumericNode {
    public final double c;

    public DoubleNode(double d) {
        this.c = d;
    }

    public final void b(JsonGenerator jsonGenerator, i iVar) throws IOException {
        jsonGenerator.d0(this.c);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof DoubleNode)) {
            return false;
        }
        if (Double.compare(this.c, ((DoubleNode) obj).c) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.c);
        return ((int) (doubleToLongBits >> 32)) ^ ((int) doubleToLongBits);
    }

    public JsonToken v() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }
}
