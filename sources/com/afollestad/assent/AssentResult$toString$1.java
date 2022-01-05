package com.afollestad.assent;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: AssentResult.kt */
public final class AssentResult$toString$1 extends Lambda implements l<Map.Entry<? extends Permission, ? extends GrantResult>, String> {
    public static final AssentResult$toString$1 c = new AssentResult$toString$1();

    public AssentResult$toString$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        i.f(entry, "it");
        return ((Permission) entry.getKey()) + " -> " + ((GrantResult) entry.getValue());
    }
}
