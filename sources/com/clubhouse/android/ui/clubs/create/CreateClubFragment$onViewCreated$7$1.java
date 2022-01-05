package com.clubhouse.android.ui.clubs.create;

import com.clubhouse.android.ui.selection.SelectionArgs;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.g3.l.v2.o;
import i0.e.b.g3.l.v2.q;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: CreateClubFragment.kt */
public final class CreateClubFragment$onViewCreated$7$1 extends Lambda implements l<q, i> {
    public final /* synthetic */ CreateClubFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateClubFragment$onViewCreated$7$1(CreateClubFragment createClubFragment) {
        super(1);
        this.c = createClubFragment;
    }

    public Object invoke(Object obj) {
        q qVar = (q) obj;
        m0.n.b.i.e(qVar, "state");
        CreateClubFragment createClubFragment = this.c;
        String string = createClubFragment.getString(R.string.membership);
        MembershipSelection membershipSelection = MembershipSelection.d;
        MembershipSelection membershipSelection2 = MembershipSelection.q;
        LinkedHashSet J = g.J(membershipSelection, membershipSelection2);
        if (qVar.e) {
            membershipSelection2 = membershipSelection;
        }
        SelectionArgs selectionArgs = new SelectionArgs(string, J, membershipSelection2, (String) null, this.c.getString(R.string.by_approval_means), 8);
        m0.n.b.i.e(selectionArgs, "mavericksArg");
        v.a1(createClubFragment, new o(selectionArgs), (h0.t.q) null, 2);
        return i.a;
    }
}
