package com.airbnb.mvrx;

import android.os.Bundle;
import android.os.Parcelable;
import h0.b0.v;
import i0.b.b.j;
import java.io.Serializable;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: MavericksViewModelProvider.kt */
public final class MavericksViewModelProvider$getSavedStateBundle$1 extends Lambda implements l<S, Bundle> {
    public final /* synthetic */ Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MavericksViewModelProvider$getSavedStateBundle$1(Object obj) {
        super(1);
        this.c = obj;
    }

    public Object invoke(Object obj) {
        j jVar = (j) obj;
        i.e(jVar, "state");
        Bundle bundle = new Bundle();
        bundle.putBundle("mvrx:saved_instance_state", v.n1(jVar, false));
        Object obj2 = this.c;
        if (obj2 != null) {
            if (obj2 instanceof Parcelable) {
                bundle.putParcelable("mvrx:saved_args", (Parcelable) obj2);
            } else if (obj2 instanceof Serializable) {
                bundle.putSerializable("mvrx:saved_args", (Serializable) obj2);
            } else {
                throw new IllegalStateException("Args must be parcelable or serializable".toString());
            }
        }
        return bundle;
    }
}
