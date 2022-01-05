package com.nimbusds.jose.shaded.json;

import i0.l.a.i.a.b;
import i0.l.a.i.a.d;
import i0.l.a.i.a.e;
import i0.l.a.i.a.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JSONArray extends ArrayList<Object> implements List<Object>, b, d {
    public static void e(Iterable<? extends Object> iterable, Appendable appendable, e eVar) throws IOException {
        if (iterable == null) {
            appendable.append("null");
            return;
        }
        Objects.requireNonNull(eVar);
        appendable.append('[');
        boolean z = true;
        for (Object next : iterable) {
            if (z) {
                z = false;
            } else {
                appendable.append(',');
            }
            if (next == null) {
                appendable.append("null");
            } else {
                f.b(next, appendable, eVar);
            }
        }
        appendable.append(']');
    }

    public void b(Appendable appendable) throws IOException {
        e(this, appendable, f.a);
    }

    public String c(e eVar) {
        StringBuilder sb = new StringBuilder();
        try {
            e(this, sb, eVar);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public String toJSONString() {
        e eVar = f.a;
        StringBuilder sb = new StringBuilder();
        try {
            e(this, sb, eVar);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public String toString() {
        e eVar = f.a;
        StringBuilder sb = new StringBuilder();
        try {
            e(this, sb, eVar);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public void v(Appendable appendable, e eVar) throws IOException {
        e(this, appendable, eVar);
    }
}
