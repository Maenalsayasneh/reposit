package com.afollestad.assent;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import m0.j.g;
import m0.n.b.i;

/* compiled from: AssentResult.kt */
public final class AssentResult {
    public final Map<Permission, GrantResult> a;

    public AssentResult(Map<Permission, ? extends GrantResult> map) {
        i.f(map, "resultsMap");
        this.a = map;
    }

    public final GrantResult a(Permission permission) {
        i.f(permission, "permission");
        GrantResult grantResult = this.a.get(permission);
        if (grantResult != null) {
            return grantResult;
        }
        throw new IllegalStateException(("No GrantResult for permission " + permission).toString());
    }

    public final Set<Permission> b() {
        Map<Permission, GrantResult> map = this.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (((GrantResult) next.getValue()) == GrantResult.GRANTED) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        return g.D0(linkedHashMap.keySet());
    }

    public boolean equals(Object obj) {
        return (obj instanceof AssentResult) && i.a(((AssentResult) obj).a, this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return g.E(this.a.entrySet(), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, AssentResult$toString$1.c, 30);
    }
}
