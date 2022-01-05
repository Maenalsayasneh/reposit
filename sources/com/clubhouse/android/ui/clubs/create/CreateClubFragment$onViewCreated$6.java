package com.clubhouse.android.ui.clubs.create;

import com.clubhouse.android.ui.selection.Selection;
import i0.e.b.g3.l.v2.t;
import i0.e.b.g3.l.v2.v;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: CreateClubFragment.kt */
public final class CreateClubFragment$onViewCreated$6 extends Lambda implements l<Pair<? extends String, ? extends Selection>, i> {
    public final /* synthetic */ CreateClubFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateClubFragment$onViewCreated$6(CreateClubFragment createClubFragment) {
        super(1);
        this.c = createClubFragment;
    }

    public Object invoke(Object obj) {
        Pair pair = (Pair) obj;
        m0.n.b.i.e(pair, "selectedItem");
        Selection selection = (Selection) pair.d;
        if (selection instanceof MembershipSelection) {
            CreateClubFragment createClubFragment = this.c;
            k<Object>[] kVarArr = CreateClubFragment.e2;
            createClubFragment.S0().p(new v(m0.n.b.i.a(pair.d, MembershipSelection.d)));
        } else if (selection instanceof WhoCanStartSelection) {
            CreateClubFragment createClubFragment2 = this.c;
            k<Object>[] kVarArr2 = CreateClubFragment.e2;
            createClubFragment2.S0().p(new t(m0.n.b.i.a(pair.d, WhoCanStartSelection.d)));
        }
        return i.a;
    }
}
