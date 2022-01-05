package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import i0.f.a.c.f;
import i0.f.a.c.i;
import java.io.IOException;

public class POJONode extends ValueNode {
    public final Object c;

    public POJONode(Object obj) {
        this.c = obj;
    }

    public final void b(JsonGenerator jsonGenerator, i iVar) throws IOException {
        Object obj = this.c;
        if (obj == null) {
            iVar.z(jsonGenerator);
        } else if (obj instanceof f) {
            ((f) obj).b(jsonGenerator, iVar);
        } else if (obj != null) {
            iVar.I(obj.getClass(), true, (BeanProperty) null).f(obj, jsonGenerator, iVar);
        } else if (iVar.g2) {
            jsonGenerator.c0();
        } else {
            iVar.c2.f(null, jsonGenerator, iVar);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof POJONode)) {
            return false;
        }
        POJONode pOJONode = (POJONode) obj;
        Object obj2 = this.c;
        if (obj2 != null) {
            return obj2.equals(pOJONode.c);
        }
        if (pOJONode.c == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public JsonToken v() {
        return JsonToken.VALUE_EMBEDDED_OBJECT;
    }
}
