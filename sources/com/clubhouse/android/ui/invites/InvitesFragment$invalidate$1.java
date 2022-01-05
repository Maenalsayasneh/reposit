package com.clubhouse.android.ui.invites;

import android.widget.ProgressBar;
import androidx.cardview.widget.CardView;
import com.clubhouse.app.R;
import i0.e.b.g3.q.m;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: InvitesFragment.kt */
public final class InvitesFragment$invalidate$1 extends Lambda implements l<m, i> {
    public final /* synthetic */ InvitesFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvitesFragment$invalidate$1(InvitesFragment invitesFragment) {
        super(1);
        this.c = invitesFragment;
    }

    public Object invoke(Object obj) {
        m mVar = (m) obj;
        m0.n.b.i.e(mVar, "state");
        if (mVar.b) {
            InvitesFragment invitesFragment = this.c;
            k<Object>[] kVarArr = InvitesFragment.Z1;
            ProgressBar progressBar = invitesFragment.N0().d;
            m0.n.b.i.d(progressBar, "binding.loading");
            i0.e.b.d3.k.L(progressBar, Boolean.valueOf(mVar.c));
            CardView cardView = this.c.N0().c;
            m0.n.b.i.d(cardView, "binding.letsFind");
            i0.e.b.d3.k.p(cardView);
            this.c.N0().e.setHint(this.c.getString(R.string.search_or_invite_a_phone));
        } else {
            InvitesFragment invitesFragment2 = this.c;
            k<Object>[] kVarArr2 = InvitesFragment.Z1;
            ProgressBar progressBar2 = invitesFragment2.N0().d;
            m0.n.b.i.d(progressBar2, "binding.loading");
            i0.e.b.d3.k.p(progressBar2);
            CardView cardView2 = this.c.N0().c;
            m0.n.b.i.d(cardView2, "binding.letsFind");
            i0.e.b.d3.k.L(cardView2, Boolean.valueOf(mVar.f));
            this.c.N0().e.setHint(this.c.getString(R.string.invite_a_phone));
        }
        this.c.N0().b.g();
        return i.a;
    }
}
