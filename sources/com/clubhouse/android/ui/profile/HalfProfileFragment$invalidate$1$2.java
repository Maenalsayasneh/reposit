package com.clubhouse.android.ui.profile;

import android.widget.TextView;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import i0.e.b.b3.a.a.c.a;
import i0.e.b.g3.u.q4;
import i0.e.b.z2.g.l;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.p;

/* compiled from: HalfProfileFragment.kt */
public final class HalfProfileFragment$invalidate$1$2 extends Lambda implements p<q4, l, i> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileFragment$invalidate$1$2(HalfProfileFragment halfProfileFragment) {
        super(2);
        this.c = halfProfileFragment;
    }

    public Object invoke(Object obj, Object obj2) {
        q4 q4Var = (q4) obj;
        l lVar = (l) obj2;
        m0.n.b.i.e(q4Var, "state");
        m0.n.b.i.e(lVar, "channelViewState");
        int intValue = q4Var.a.getId().intValue();
        TextView textView = this.c.T0().t;
        m0.n.b.i.d(textView, "halfProfileBinding.isModerator");
        int i = 8;
        textView.setVisibility(lVar.p.e(intValue) ? 0 : 8);
        TextView textView2 = this.c.S0().x;
        m0.n.b.i.d(textView2, "fullProfileBinding.isModerator");
        if (lVar.p.e(intValue)) {
            i = 0;
        }
        textView2.setVisibility(i);
        if (q4Var.o) {
            a aVar = lVar.p;
            UserInChannel userInChannel = aVar.a;
            if ((userInChannel != null && aVar.c.contains(userInChannel.getId())) && !lVar.p.i(intValue)) {
                this.c.T0().b.setVisibility(0);
            } else if (lVar.p.i(intValue)) {
                this.c.T0().y.setVisibility(0);
            }
        } else if (lVar.q) {
            if (lVar.p.e(intValue)) {
                this.c.T0().y.setVisibility(0);
            } else if (lVar.p.i(intValue)) {
                this.c.T0().y.setVisibility(0);
                this.c.T0().w.setVisibility(0);
            } else {
                this.c.T0().s.setVisibility(0);
            }
        }
        return i.a;
    }
}
