package com.clubhouse.android.ui.invites;

import androidx.cardview.widget.CardView;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.p;
import m0.r.k;

/* compiled from: InvitesFragment.kt */
public final class InvitesFragment$onViewCreated$5 extends Lambda implements p<Boolean, Integer, i> {
    public final /* synthetic */ InvitesFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvitesFragment$onViewCreated$5(InvitesFragment invitesFragment) {
        super(2);
        this.c = invitesFragment;
    }

    public Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ((Number) obj2).intValue();
        InvitesFragment invitesFragment = this.c;
        k<Object>[] kVarArr = InvitesFragment.Z1;
        InvitesViewModel O0 = invitesFragment.O0();
        Objects.requireNonNull(O0);
        O0.m(new InvitesViewModel$setKeyboardOpened$1(booleanValue));
        if (booleanValue) {
            CardView cardView = this.c.N0().c;
            m0.n.b.i.d(cardView, "binding.letsFind");
            i0.e.b.d3.k.p(cardView);
        }
        return i.a;
    }
}
