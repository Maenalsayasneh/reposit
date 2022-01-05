package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import i0.f.a.c.e;
import i0.f.a.c.i;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayNode extends ContainerNode<ArrayNode> implements Serializable {
    public final List<e> d = new ArrayList();

    public ArrayNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
    }

    public void b(JsonGenerator jsonGenerator, i iVar) throws IOException {
        List<e> list = this.d;
        int size = list.size();
        jsonGenerator.L0(this, size);
        for (int i = 0; i < size; i++) {
            ((BaseJsonNode) list.get(i)).b(jsonGenerator, iVar);
        }
        jsonGenerator.T();
    }

    public void c(JsonGenerator jsonGenerator, i iVar, i0.f.a.c.p.e eVar) throws IOException {
        WritableTypeId e = eVar.e(jsonGenerator, eVar.d(this, JsonToken.START_ARRAY));
        Iterator<e> it = this.d.iterator();
        while (it.hasNext()) {
            ((BaseJsonNode) it.next()).b(jsonGenerator, iVar);
        }
        eVar.f(jsonGenerator, e);
    }

    public boolean e(i iVar) {
        return this.d.isEmpty();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ArrayNode)) {
            return this.d.equals(((ArrayNode) obj).d);
        }
        return false;
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public Iterator<e> k() {
        return this.d.iterator();
    }

    public ArrayNode w(e eVar) {
        if (eVar == null) {
            eVar = v();
        }
        this.d.add(eVar);
        return this;
    }
}
