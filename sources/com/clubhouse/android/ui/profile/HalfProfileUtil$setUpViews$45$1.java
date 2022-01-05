package com.clubhouse.android.ui.profile;

import android.os.Bundle;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.o.a.c0;
import i0.e.b.g3.u.q4;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$setUpViews$45$1 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$setUpViews$45$1(HalfProfileFragment halfProfileFragment) {
        super(1);
        this.c = halfProfileFragment;
    }

    public Object invoke(Object obj) {
        q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "state");
        if (q4Var.o) {
            final String obj2 = !m0.n.b.i.a(this.c.S0().d.getText().toString(), this.c.getString(R.string.add_a_bio)) ? this.c.S0().d.getText().toString() : "";
            v.G(this.c, new l<c0, i>() {
                public Object invoke(Object obj) {
                    c0 c0Var = (c0) obj;
                    m0.n.b.i.e(c0Var, "$this$commitSafe");
                    EditBioArgs editBioArgs = new EditBioArgs(obj2);
                    m0.n.b.i.e(editBioArgs, "arg");
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("mavericks:arg", editBioArgs);
                    c0Var.c(c0Var.k(EditBioFragment.class, bundle), (String) null);
                    return i.a;
                }
            });
        }
        return i.a;
    }
}
