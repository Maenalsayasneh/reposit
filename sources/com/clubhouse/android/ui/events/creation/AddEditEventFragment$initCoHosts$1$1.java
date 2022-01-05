package com.clubhouse.android.ui.events.creation;

import android.os.Bundle;
import com.clubhouse.android.ui.creation.ChooseUsersArgs;
import com.clubhouse.android.ui.creation.ChooseUsersFragment;
import h0.b0.v;
import h0.o.a.c0;
import i0.e.b.g3.o.w0.w;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: AddEditEventFragment.kt */
public final class AddEditEventFragment$initCoHosts$1$1 extends Lambda implements l<w, i> {
    public final /* synthetic */ AddEditEventFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddEditEventFragment$initCoHosts$1$1(AddEditEventFragment addEditEventFragment) {
        super(1);
        this.c = addEditEventFragment;
    }

    public Object invoke(Object obj) {
        final w wVar = (w) obj;
        m0.n.b.i.e(wVar, "state");
        v.G(this.c, new l<c0, i>() {
            public Object invoke(Object obj) {
                c0 c0Var = (c0) obj;
                m0.n.b.i.e(c0Var, "$this$commitSafe");
                ChooseUsersArgs chooseUsersArgs = new ChooseUsersArgs(w.this.j);
                m0.n.b.i.e(chooseUsersArgs, "arg");
                Bundle bundle = new Bundle();
                bundle.putParcelable("mavericks:arg", chooseUsersArgs);
                c0Var.c(c0Var.k(ChooseUsersFragment.class, bundle), (String) null);
                return i.a;
            }
        });
        return i.a;
    }
}
