package com.airbnb.paris;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: StyleApplierUtils.kt */
public final class StyleApplierUtils$Companion$getMissingStyleAttributesError$1 extends Lambda implements l<String, CharSequence> {
    public static final StyleApplierUtils$Companion$getMissingStyleAttributesError$1 c = new StyleApplierUtils$Companion$getMissingStyleAttributesError$1();

    public StyleApplierUtils$Companion$getMissingStyleAttributesError$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        i.e(str, "it");
        return "✕ " + str;
    }
}
