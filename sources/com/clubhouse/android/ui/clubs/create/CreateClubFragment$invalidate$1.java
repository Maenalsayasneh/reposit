package com.clubhouse.android.ui.clubs.create;

import android.net.Uri;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.b.b.f;
import i0.e.b.g3.l.v2.q;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;
import m0.r.k;

/* compiled from: CreateClubFragment.kt */
public final class CreateClubFragment$invalidate$1 extends Lambda implements l<q, i> {
    public final /* synthetic */ CreateClubFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateClubFragment$invalidate$1(CreateClubFragment createClubFragment) {
        super(1);
        this.c = createClubFragment;
    }

    public Object invoke(Object obj) {
        int i;
        CreateClubFragment createClubFragment;
        int i2;
        CreateClubFragment createClubFragment2;
        q qVar = (q) obj;
        m0.n.b.i.e(qVar, "state");
        CreateClubFragment createClubFragment3 = this.c;
        k<Object>[] kVarArr = CreateClubFragment.e2;
        ProgressBar progressBar = createClubFragment3.R0().i;
        m0.n.b.i.d(progressBar, "binding.loading");
        i0.e.b.d3.k.L(progressBar, Boolean.valueOf(qVar.a instanceof f));
        this.c.R0().h.setEnabled(qVar.k);
        Uri uri = qVar.h;
        if (uri != null) {
            AvatarView avatarView = this.c.R0().a;
            m0.n.b.i.d(avatarView, "binding.addPhotoButton");
            v.P0(avatarView, uri);
        }
        if (qVar.j.isEmpty()) {
            this.c.R0().p.setText(this.c.getString(R.string.add));
        } else {
            this.c.R0().p.setText(g.E(qVar.j, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, AnonymousClass2.c, 31));
        }
        TextView textView = this.c.R0().m;
        if (qVar.e) {
            createClubFragment = this.c;
            i = R.string.open_to_all;
        } else {
            createClubFragment = this.c;
            i = R.string.by_approval;
        }
        textView.setText(createClubFragment.getString(i));
        TextView textView2 = this.c.R0().s;
        if (qVar.g) {
            createClubFragment2 = this.c;
            i2 = R.string.any_member;
        } else {
            createClubFragment2 = this.c;
            i2 = R.string.leaders_only;
        }
        textView2.setText(createClubFragment2.getString(i2));
        CardView cardView = this.c.R0().d;
        m0.n.b.i.d(cardView, "binding.byApprovalSettings");
        i0.e.b.d3.k.L(cardView, Boolean.valueOf(!qVar.e));
        this.c.R0().c.setChecked(qVar.d);
        this.c.R0().j.setChecked(!qVar.f);
        return i.a;
    }
}
