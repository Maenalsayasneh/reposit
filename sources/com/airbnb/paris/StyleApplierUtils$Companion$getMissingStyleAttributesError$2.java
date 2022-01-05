package com.airbnb.paris;

import android.content.Context;
import i0.b.c.g.e;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: StyleApplierUtils.kt */
public final class StyleApplierUtils$Companion$getMissingStyleAttributesError$2 extends Lambda implements l<e, CharSequence> {
    public final /* synthetic */ Context c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StyleApplierUtils$Companion$getMissingStyleAttributesError$2(Context context) {
        super(1);
        this.c = context;
    }

    public Object invoke(Object obj) {
        e eVar = (e) obj;
        i.e(eVar, "it");
        Context context = this.c;
        i.d(context, "context");
        return eVar.c(context);
    }
}
