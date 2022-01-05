package com.clubhouse.android.ui.hallway.feed.viewholder;

import android.content.res.Resources;
import com.clubhouse.android.shared.ui.ImpressionTrackingEpoxyRecyclerView;
import h0.b0.v;
import i0.e.b.b3.b.e.m;
import i0.e.b.g3.p.c0.e0.z0;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;
import m0.n.a.p;

/* compiled from: UserSuggestions.kt */
public final class UserSuggestions$bindUserSuggestions$1$1$1$1$2 extends Lambda implements p<m, Boolean, i> {
    public final /* synthetic */ z0 c;
    public final /* synthetic */ z0.a d;
    public final /* synthetic */ List<m> q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserSuggestions$bindUserSuggestions$1$1$1$1$2(z0 z0Var, z0.a aVar, List<m> list) {
        super(2);
        this.c = z0Var;
        this.d = aVar;
        this.q = list;
    }

    public Object invoke(Object obj, Object obj2) {
        m mVar = (m) obj;
        Boolean bool = (Boolean) obj2;
        l<? super m, i> lVar = this.c.n;
        if (lVar != null) {
            m0.n.b.i.d(mVar, "user");
            lVar.invoke(mVar);
        }
        z0 z0Var = this.c;
        z0.a aVar = this.d;
        List<m> list = this.q;
        m0.n.b.i.d(mVar, "user");
        m0.n.b.i.d(bool, "checkedAfter");
        boolean booleanValue = bool.booleanValue();
        Objects.requireNonNull(z0Var);
        if (!m0.n.b.i.a(g.G(list), mVar) && booleanValue) {
            ImpressionTrackingEpoxyRecyclerView impressionTrackingEpoxyRecyclerView = aVar.b().a;
            i0.e.b.g3.p.c0.e0.l lVar2 = new i0.e.b.g3.p.c0.e0.l(impressionTrackingEpoxyRecyclerView, list, mVar);
            Resources resources = impressionTrackingEpoxyRecyclerView.getResources();
            m0.n.b.i.d(resources, "resources");
            impressionTrackingEpoxyRecyclerView.postDelayed(lVar2, v.Y1(resources));
        }
        return i.a;
    }
}
