package com.clubhouse.android.ui.events.creation;

import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.o.w0.n;
import i0.e.b.g3.o.w0.o;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: AddEditEventFragment.kt */
public final class AddEditEventFragment$showRemoveCoHostConfirmation$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ AddEditEventFragment c;
    public final /* synthetic */ UserInList d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddEditEventFragment$showRemoveCoHostConfirmation$1(AddEditEventFragment addEditEventFragment, UserInList userInList) {
        super(1);
        this.c = addEditEventFragment;
        this.d = userInList;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        aVar.a.d = this.c.getString(R.string.remove_somone_as_host, this.d.y);
        aVar.a.f = this.c.getString(R.string.will_no_longer_appear, this.d.y);
        aVar.c(R.string.cancel, o.c);
        aVar.d(R.string.remove, new n(this.c, this.d));
        return i.a;
    }
}
