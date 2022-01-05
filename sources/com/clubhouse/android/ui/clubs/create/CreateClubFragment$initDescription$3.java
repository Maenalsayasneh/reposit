package com.clubhouse.android.ui.clubs.create;

import i0.e.b.g3.l.v2.q;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: CreateClubFragment.kt */
public final class CreateClubFragment$initDescription$3 extends Lambda implements l<q, i> {
    public final /* synthetic */ CreateClubFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateClubFragment$initDescription$3(CreateClubFragment createClubFragment) {
        super(1);
        this.c = createClubFragment;
    }

    public Object invoke(Object obj) {
        q qVar = (q) obj;
        m0.n.b.i.e(qVar, "state");
        String str = qVar.c;
        CreateClubFragment createClubFragment = this.c;
        k<Object>[] kVarArr = CreateClubFragment.e2;
        createClubFragment.R0().f.setText(str);
        return i.a;
    }
}
