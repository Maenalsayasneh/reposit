package com.airbnb.mvrx;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.c0;
import i0.b.b.i0;
import i0.d.a.a.a;
import i0.j.f.p.h;
import kotlin.NoWhenBranchMatchedException;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.m;

/* compiled from: DeliveryMode.kt */
public abstract class DeliveryMode {
    public DeliveryMode(f fVar) {
    }

    public final DeliveryMode a(m<?, ?>... mVarArr) {
        i.e(mVarArr, "properties");
        if (this instanceof c0) {
            return c0.a;
        }
        if (this instanceof i0) {
            return new i0(h.E2(mVarArr, InstabugDbContract.COMMA_SEP, a.y0(new StringBuilder(), ((i0) this).a, "_"), (CharSequence) null, 0, (CharSequence) null, DeliveryMode$appendPropertiesToId$1.c, 28));
        }
        throw new NoWhenBranchMatchedException();
    }
}
