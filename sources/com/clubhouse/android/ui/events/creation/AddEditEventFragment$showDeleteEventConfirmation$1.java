package com.clubhouse.android.ui.events.creation;

import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.o.w0.m;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: AddEditEventFragment.kt */
public final class AddEditEventFragment$showDeleteEventConfirmation$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ AddEditEventFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddEditEventFragment$showDeleteEventConfirmation$1(AddEditEventFragment addEditEventFragment) {
        super(1);
        this.c = addEditEventFragment;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        aVar.a.d = this.c.getString(R.string.are_you_sure);
        aVar.a.f = this.c.getString(R.string.deleting_this_event_will_remove);
        aVar.c(R.string.cancel, m.c);
        aVar.d(R.string.delete, new i0.e.b.g3.o.w0.l(this.c));
        return i.a;
    }
}
