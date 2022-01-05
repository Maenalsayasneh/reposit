package com.clubhouse.android.ui.creation;

import com.clubhouse.android.channels.model.AudienceType;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.remote.response.GetCreateChannelTargetsResponse;
import com.clubhouse.android.ui.creation.CreateChannelFragment;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.b.a.o;
import i0.e.b.g3.n.t;
import i0.e.b.g3.n.x.c;
import i0.e.b.z2.f.d;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: CreateChannelFragment.kt */
public final class CreateChannelFragment$buildModels$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ CreateChannelFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateChannelFragment$buildModels$1(CreateChannelFragment createChannelFragment) {
        super(1);
        this.c = createChannelFragment;
    }

    public Object invoke(Object obj) {
        final o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$null");
        CreateChannelFragment createChannelFragment = this.c;
        CreateChannelFragment.a aVar = CreateChannelFragment.p2;
        CreateChannelViewModel W0 = createChannelFragment.W0();
        final CreateChannelFragment createChannelFragment2 = this.c;
        v.v2(W0, new l<t, i>() {
            public Object invoke(Object obj) {
                List<ClubWithAdmin> list;
                t tVar = (t) obj;
                m0.n.b.i.e(tVar, "state");
                List<AudienceType> K = g.K(AudienceType.Open, AudienceType.Social, AudienceType.Closed);
                o oVar = o.this;
                CreateChannelFragment createChannelFragment = createChannelFragment2;
                for (AudienceType audienceType : K) {
                    c cVar = new c();
                    cVar.Q(new Number[]{Integer.valueOf(audienceType.ordinal())});
                    cVar.S(createChannelFragment.getString(audienceType.getTitle()));
                    cVar.N(audienceType.getIcon());
                    cVar.R(tVar.c == audienceType);
                    cVar.L(new i0.e.b.g3.n.g(createChannelFragment, audienceType));
                    oVar.add(cVar);
                }
                GetCreateChannelTargetsResponse a = tVar.b.a();
                if (!(a == null || (list = a.a) == null)) {
                    ArrayList arrayList = new ArrayList(h.K(list, 10));
                    for (ClubWithAdmin dVar : list) {
                        arrayList.add(new d(dVar));
                    }
                    o oVar2 = o.this;
                    CreateChannelFragment createChannelFragment2 = createChannelFragment2;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        d dVar2 = (d) it.next();
                        c cVar2 = new c();
                        cVar2.P(m0.n.b.i.k("club", Integer.valueOf(dVar2.c.getId())));
                        cVar2.S(dVar2.c.getName());
                        cVar2.O(dVar2.c.b());
                        cVar2.R(m0.n.b.i.a(tVar.c, dVar2));
                        cVar2.M(createChannelFragment2.getString(R.string.cd_club_name, dVar2.c.getName()));
                        cVar2.L(new i0.e.b.g3.n.h(createChannelFragment2, dVar2));
                        oVar2.add(cVar2);
                    }
                }
                return i.a;
            }
        });
        return i.a;
    }
}
