package com.airbnb.mvrx;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.m;

/* compiled from: DeliveryMode.kt */
public final class DeliveryMode$appendPropertiesToId$1 extends Lambda implements l<m<?, ?>, CharSequence> {
    public static final DeliveryMode$appendPropertiesToId$1 c = new DeliveryMode$appendPropertiesToId$1();

    public DeliveryMode$appendPropertiesToId$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        m mVar = (m) obj;
        i.e(mVar, "it");
        return mVar.getName();
    }
}
