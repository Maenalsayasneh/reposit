package com.clubhouse.android.ui.clubs.create;

import com.clubhouse.android.data.models.local.Topic;
import i0.e.b.g3.l.v2.y;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: CreateClubFragment.kt */
public final class CreateClubFragment$onViewCreated$9 extends Lambda implements l<List<? extends Topic>, i> {
    public final /* synthetic */ CreateClubFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateClubFragment$onViewCreated$9(CreateClubFragment createClubFragment) {
        super(1);
        this.c = createClubFragment;
    }

    public Object invoke(Object obj) {
        List list = (List) obj;
        m0.n.b.i.e(list, "topics");
        CreateClubFragment createClubFragment = this.c;
        k<Object>[] kVarArr = CreateClubFragment.e2;
        createClubFragment.S0().p(new y(list));
        return i.a;
    }
}
