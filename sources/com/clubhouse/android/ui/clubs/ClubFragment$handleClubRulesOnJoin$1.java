package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import i0.e.b.g3.l.d2;
import i0.e.b.g3.l.v1;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubFragment.kt */
public final class ClubFragment$handleClubRulesOnJoin$1 extends Lambda implements l<v1, i> {
    public final /* synthetic */ ClubFragment c;
    public final /* synthetic */ String d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$handleClubRulesOnJoin$1(ClubFragment clubFragment, String str) {
        super(1);
        this.c = clubFragment;
        this.d = str;
    }

    public Object invoke(Object obj) {
        SourceLocation sourceLocation;
        v1 v1Var = (v1) obj;
        m0.n.b.i.e(v1Var, "it");
        ClubViewModel T0 = this.c.T0();
        String str = this.d;
        ClubArgs clubArgs = v1Var.b;
        if (clubArgs == null) {
            sourceLocation = SourceLocation.UNKNOWN;
        } else {
            sourceLocation = clubArgs.Y1;
        }
        T0.p(new d2(str, sourceLocation));
        return i.a;
    }
}
