package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.remote.response.GetClubResponse;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: ClubFragment.kt */
public final class ClubFragment$buildHeaderModelForStranger$2$1$2 extends Lambda implements l<String, i> {
    public final /* synthetic */ ClubFragment c;
    public final /* synthetic */ GetClubResponse d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$buildHeaderModelForStranger$2$1$2(ClubFragment clubFragment, GetClubResponse getClubResponse) {
        super(1);
        this.c = clubFragment;
        this.d = getClubResponse;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        m0.n.b.i.e(str, "it");
        ClubFragment clubFragment = this.c;
        GetClubResponse getClubResponse = this.d;
        k<Object>[] kVarArr = ClubFragment.e2;
        clubFragment.U0(getClubResponse, str);
        return i.a;
    }
}
