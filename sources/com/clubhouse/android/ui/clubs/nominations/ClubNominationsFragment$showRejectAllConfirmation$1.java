package com.clubhouse.android.ui.clubs.nominations;

import com.clubhouse.app.R;
import h0.b.a.d;
import i0.d.a.a.a;
import i0.e.b.g3.l.a3.k;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubNominationsFragment.kt */
public final class ClubNominationsFragment$showRejectAllConfirmation$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ ClubNominationsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubNominationsFragment$showRejectAllConfirmation$1(ClubNominationsFragment clubNominationsFragment) {
        super(1);
        this.c = clubNominationsFragment;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        a.j(aVar, "$this$alertDialog", R.string.delete_all_confirm_title, R.string.action_all_confirm_message);
        aVar.d(R.string.delete_all, new k(this.c));
        aVar.c(R.string.cancel, i0.e.b.g3.l.a3.l.c);
        return i.a;
    }
}
