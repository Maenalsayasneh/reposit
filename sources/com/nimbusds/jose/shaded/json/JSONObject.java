package com.nimbusds.jose.shaded.json;

import i0.l.a.i.a.a;
import i0.l.a.i.a.b;
import i0.l.a.i.a.d;
import i0.l.a.i.a.e;
import i0.l.a.i.a.f;
import i0.l.a.i.a.i.l;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class JSONObject extends HashMap<String, Object> implements a, b, d {
    public static final /* synthetic */ int c = 0;

    public static String d(Map<String, ? extends Object> map, e eVar) {
        StringBuilder sb = new StringBuilder();
        try {
            f(map, sb, eVar);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public static void f(Map<String, ? extends Object> map, Appendable appendable, e eVar) throws IOException {
        if (map == null) {
            appendable.append("null");
            return;
        }
        Objects.requireNonNull(eVar);
        appendable.append('{');
        boolean z = true;
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            if (value != null || !eVar.e) {
                if (z) {
                    z = false;
                } else {
                    appendable.append(',');
                }
                l.b(next.getKey().toString(), value, appendable, eVar);
            }
        }
        appendable.append('}');
    }

    public void b(Appendable appendable) throws IOException {
        f(this, appendable, f.a);
    }

    public String c(e eVar) {
        return d(this, eVar);
    }

    public String toJSONString() {
        return d(this, f.a);
    }

    public String toString() {
        return d(this, f.a);
    }

    public void v(Appendable appendable, e eVar) throws IOException {
        f(this, appendable, eVar);
    }
}
