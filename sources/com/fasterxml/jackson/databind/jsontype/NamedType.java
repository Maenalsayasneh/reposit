package com.fasterxml.jackson.databind.jsontype;

import i0.d.a.a.a;
import java.io.Serializable;
import java.util.Objects;

public final class NamedType implements Serializable {
    public final Class<?> c;
    public final int d;
    public String q;

    public NamedType(Class<?> cls, String str) {
        this.c = cls;
        this.d = cls.getName().hashCode() + (str == null ? 0 : str.hashCode());
        this.q = (str == null || str.isEmpty()) ? null : str;
    }

    public boolean a() {
        return this.q != null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != NamedType.class) {
            return false;
        }
        NamedType namedType = (NamedType) obj;
        if (this.c != namedType.c || !Objects.equals(this.q, namedType.q)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.d;
    }

    public String toString() {
        StringBuilder P0 = a.P0("[NamedType, class ");
        a.p(this.c, P0, ", name: ");
        return a.y0(P0, this.q == null ? "null" : a.y0(a.P0("'"), this.q, "'"), "]");
    }
}
