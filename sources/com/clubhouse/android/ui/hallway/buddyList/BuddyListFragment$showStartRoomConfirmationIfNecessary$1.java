package com.clubhouse.android.ui.hallway.buddyList;

import android.widget.FrameLayout;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import i0.e.b.g3.p.b0.m;
import i0.e.b.g3.p.b0.q;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: BuddyListFragment.kt */
public final class BuddyListFragment$showStartRoomConfirmationIfNecessary$1 extends Lambda implements l<q, i> {
    public final /* synthetic */ BuddyListFragment c;
    public final /* synthetic */ c d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuddyListFragment$showStartRoomConfirmationIfNecessary$1(BuddyListFragment buddyListFragment, c cVar) {
        super(1);
        this.c = buddyListFragment;
        this.d = cVar;
    }

    public Object invoke(Object obj) {
        q qVar = (q) obj;
        m0.n.b.i.e(qVar, "state");
        if (qVar.i) {
            final BuddyListFragment buddyListFragment = this.c;
            final c cVar = this.d;
            AnonymousClass1 r02 = new l<d.a, i>() {
                public Object invoke(Object obj) {
                    d.a aVar = (d.a) obj;
                    a.j(aVar, "$this$alertDialog", R.string.start_new_room_title, R.string.start_new_room_message);
                    aVar.c(R.string.no, m.c);
                    aVar.d(R.string.yes, new i0.e.b.g3.p.b0.l(BuddyListFragment.this, cVar));
                    return i.a;
                }
            };
            m0.n.b.i.e(buddyListFragment, "<this>");
            m0.n.b.i.e(r02, "f");
            d.a aVar = new d.a(buddyListFragment.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
            r02.invoke(aVar);
            aVar.g();
        } else {
            BuddyListFragment buddyListFragment2 = this.c;
            k<Object>[] kVarArr = BuddyListFragment.Z1;
            FrameLayout frameLayout = buddyListFragment2.N0().g;
            m0.n.b.i.d(frameLayout, "binding.roomLoading");
            i0.e.b.d3.k.K(frameLayout);
            this.c.O0().p(this.d);
        }
        return i.a;
    }
}
