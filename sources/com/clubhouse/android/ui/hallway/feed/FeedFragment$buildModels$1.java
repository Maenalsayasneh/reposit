package com.clubhouse.android.ui.hallway.feed;

import android.content.res.Resources;
import com.clubhouse.android.channels.model.AudienceType;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.android.data.models.local.channel.ChannelInFeed;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.UserInFeed;
import com.clubhouse.android.user.model.UserInRoom;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.b.a.o;
import i0.e.b.b3.a.a.d.a.a;
import i0.e.b.b3.a.a.d.a.b;
import i0.e.b.b3.a.a.d.a.c;
import i0.e.b.b3.a.a.d.a.d;
import i0.e.b.b3.a.a.d.a.e;
import i0.e.b.b3.a.a.d.a.g;
import i0.e.b.b3.b.e.m;
import i0.e.b.g3.p.c0.e0.a1;
import i0.e.b.g3.p.c0.e0.c0;
import i0.e.b.g3.p.c0.e0.k0;
import i0.e.b.g3.p.c0.e0.m0;
import i0.e.b.g3.p.c0.e0.o0;
import i0.e.b.g3.p.c0.e0.r0;
import i0.e.b.g3.p.c0.e0.s;
import i0.e.b.g3.p.c0.e0.t0;
import i0.e.b.g3.p.c0.e0.v0;
import i0.e.b.g3.p.c0.e0.x;
import i0.e.b.g3.p.c0.h;
import i0.e.b.g3.p.c0.j;
import i0.e.b.g3.p.c0.n;
import i0.e.b.g3.p.c0.t;
import i0.e.e.m.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: FeedFragment.kt */
public final class FeedFragment$buildModels$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ FeedFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedFragment$buildModels$1(FeedFragment feedFragment) {
        super(1);
        this.c = feedFragment;
    }

    public Object invoke(Object obj) {
        final o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$null");
        FeedFragment feedFragment = this.c;
        k<Object>[] kVarArr = FeedFragment.Z1;
        FeedViewModel P0 = feedFragment.P0();
        final FeedFragment feedFragment2 = this.c;
        v.v2(P0, new l<i0.e.b.g3.p.c0.v, i>() {
            public Object invoke(Object obj) {
                String str;
                String str2;
                i0.e.b.g3.p.c0.v vVar = (i0.e.b.g3.p.c0.v) obj;
                m0.n.b.i.e(vVar, "state");
                List<e> a = vVar.a.a();
                if (vVar.m) {
                    o oVar = o.this;
                    FeedFragment feedFragment = feedFragment2;
                    f fVar = new f();
                    fVar.s("waves");
                    fVar.L(vVar.c);
                    FeedFragment$buildModels$1$1$1$1 feedFragment$buildModels$1$1$1$1 = FeedFragment$buildModels$1$1$1$1.c;
                    fVar.w();
                    fVar.i = feedFragment$buildModels$1$1$1$1;
                    i0.e.b.g3.p.c0.l lVar = new i0.e.b.g3.p.c0.l(feedFragment);
                    fVar.w();
                    fVar.k = lVar;
                    oVar.add(fVar);
                }
                int i = 0;
                if (a != null) {
                    o oVar2 = o.this;
                    FeedFragment feedFragment2 = feedFragment2;
                    for (e eVar : a) {
                        if (eVar instanceof g) {
                            o0 o0Var = new o0();
                            o0Var.s("invite_prompt");
                            b0 b0Var = new b0(i, feedFragment2, eVar);
                            o0Var.w();
                            o0Var.i = b0Var;
                            i0.e.b.g3.p.c0.g gVar = new i0.e.b.g3.p.c0.g(feedFragment2);
                            o0Var.w();
                            o0Var.j = gVar;
                            oVar2.add(o0Var);
                        } else if (eVar instanceof d) {
                            k0 k0Var = new k0();
                            k0Var.s("hallway_events");
                            d dVar = (d) eVar;
                            k0Var.M(dVar.a);
                            k0Var.N(dVar.b);
                            t tVar = new t(feedFragment2);
                            k0Var.w();
                            k0Var.l = tVar;
                            oVar2.add(k0Var);
                        } else if (eVar instanceof i0.e.b.b3.a.a.d.a.f) {
                            ChannelInFeed channelInFeed = ((i0.e.b.b3.a.a.d.a.f) eVar).a;
                            m0 m0Var = new m0();
                            m0Var.s(m0.n.b.i.k("hidden", Integer.valueOf(channelInFeed.i2)));
                            i0.e.b.g3.p.c0.e eVar2 = new i0.e.b.g3.p.c0.e(feedFragment2, channelInFeed);
                            m0Var.w();
                            m0Var.j = eVar2;
                            oVar2.add(m0Var);
                        } else if (eVar instanceof a) {
                            ChannelInFeed channelInFeed2 = ((a) eVar).a;
                            List<UserInFeed> list = channelInFeed2.c;
                            ArrayList arrayList = new ArrayList();
                            for (T next : list) {
                                if (((UserInFeed) next).c) {
                                    arrayList.add(next);
                                }
                            }
                            boolean z = vVar.l;
                            i0.e.b.g3.p.c0.e0.o oVar3 = new i0.e.b.g3.p.c0.e0.o();
                            Number[] numberArr = new Number[1];
                            numberArr[i] = Integer.valueOf(channelInFeed2.i2);
                            oVar3.t(numberArr);
                            b0 b0Var2 = new b0(1, feedFragment2, eVar);
                            oVar3.w();
                            oVar3.i = b0Var2;
                            ClubWithAdmin clubWithAdmin = channelInFeed2.g2;
                            if (clubWithAdmin == null) {
                                str = null;
                            } else {
                                str = clubWithAdmin.y;
                            }
                            oVar3.w();
                            oVar3.j = str;
                            String str3 = channelInFeed2.b2;
                            oVar3.w();
                            oVar3.k = str3;
                            String valueOf = String.valueOf(channelInFeed2.d);
                            oVar3.w();
                            oVar3.l = valueOf;
                            String valueOf2 = String.valueOf(channelInFeed2.q);
                            oVar3.w();
                            oVar3.m = valueOf2;
                            oVar3.w();
                            oVar3.n = (UserInRoom) m0.j.g.z(arrayList, i);
                            oVar3.w();
                            oVar3.o = (UserInRoom) m0.j.g.z(arrayList, 1);
                            oVar3.P(channelInFeed2.c);
                            AudienceType o = v.o(channelInFeed2);
                            oVar3.w();
                            oVar3.q = o;
                            Resources resources = feedFragment2.getResources();
                            m0.n.b.i.d(resources, "resources");
                            m0.n.b.i.e(channelInFeed2, "<this>");
                            m0.n.b.i.e(resources, "resources");
                            ArrayList arrayList2 = new ArrayList();
                            String str4 = channelInFeed2.b2;
                            if (str4 != null) {
                                if ((str4.length() > 0 ? 1 : i) != 0) {
                                    arrayList2.add(str4);
                                }
                            }
                            ClubWithAdmin clubWithAdmin2 = channelInFeed2.g2;
                            if (!(clubWithAdmin2 == null || (str2 = clubWithAdmin2.y) == null)) {
                                Object[] objArr = new Object[1];
                                objArr[i] = str2;
                                String string = resources.getString(R.string.cd_hosted_by_club, objArr);
                                m0.n.b.i.d(string, "resources.getString(R.string.cd_hosted_by_club, it)");
                                arrayList2.add(string);
                            }
                            if (channelInFeed2.d2) {
                                String string2 = resources.getString(R.string.cd_social_room);
                                m0.n.b.i.d(string2, "resources.getString(R.string.cd_social_room)");
                                arrayList2.add(string2);
                            } else if (channelInFeed2.c2) {
                                String string3 = resources.getString(R.string.cd_private_room);
                                m0.n.b.i.d(string3, "resources.getString(R.string.cd_private_room)");
                                arrayList2.add(string3);
                            }
                            List<UserInFeed> list2 = channelInFeed2.c;
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            for (T next2 : list2) {
                                if (((UserInFeed) next2).c) {
                                    arrayList3.add(next2);
                                } else {
                                    arrayList4.add(next2);
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                String string4 = resources.getString(R.string.cd_speaking);
                                m0.n.b.i.d(string4, "resources.getString(R.string.cd_speaking)");
                                arrayList2.add(string4);
                                ArrayList arrayList5 = new ArrayList();
                                Iterator it = arrayList3.iterator();
                                while (it.hasNext()) {
                                    String F = ((UserInFeed) it.next()).F();
                                    if (F != null) {
                                        arrayList5.add(F);
                                    }
                                }
                                arrayList2.addAll(arrayList5);
                            }
                            if (!arrayList4.isEmpty()) {
                                String string5 = resources.getString(R.string.cd_listening);
                                m0.n.b.i.d(string5, "resources.getString(R.string.cd_listening)");
                                arrayList2.add(string5);
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it2 = arrayList4.iterator();
                                while (it2.hasNext()) {
                                    String F2 = ((UserInFeed) it2.next()).F();
                                    if (F2 != null) {
                                        arrayList6.add(F2);
                                    }
                                }
                                arrayList2.addAll(arrayList6);
                            }
                            String string6 = resources.getString(R.string.cd_num_listening, new Object[]{Integer.valueOf(channelInFeed2.q)});
                            m0.n.b.i.d(string6, "resources.getString(R.string.cd_num_listening, numAll)");
                            arrayList2.add(string6);
                            String string7 = resources.getString(R.string.cd_num_speakers, new Object[]{Integer.valueOf(channelInFeed2.d)});
                            m0.n.b.i.d(string7, "resources.getString(R.string.cd_num_speakers, numSpeakers)");
                            arrayList2.add(string7);
                            String E = m0.j.g.E(arrayList2, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);
                            oVar3.w();
                            oVar3.r = E;
                            oVar3.w();
                            oVar3.s = z;
                            i0.e.b.g3.p.c0.i iVar = new i0.e.b.g3.p.c0.i(feedFragment2, channelInFeed2);
                            oVar3.w();
                            oVar3.t = iVar;
                            j jVar = new j(feedFragment2, channelInFeed2);
                            oVar3.w();
                            oVar3.u = jVar;
                            h hVar = new h(feedFragment2, channelInFeed2);
                            oVar3.w();
                            oVar3.v = hVar;
                            oVar2.add(oVar3);
                        } else if (eVar instanceof i0.e.b.b3.a.a.d.a.i) {
                            v0 v0Var = new v0();
                            i0.e.b.b3.a.a.d.a.i iVar2 = (i0.e.b.b3.a.a.d.a.i) eVar;
                            v0Var.s(iVar2.a);
                            b0 b0Var3 = new b0(2, feedFragment2, eVar);
                            v0Var.w();
                            v0Var.i = b0Var3;
                            String str5 = iVar2.a;
                            v0Var.w();
                            v0Var.j = str5;
                            List<Topic> list3 = iVar2.b;
                            v0Var.w();
                            v0Var.k = list3;
                            FeedFragment$buildModels$1$1$2$5$2 feedFragment$buildModels$1$1$2$5$2 = new FeedFragment$buildModels$1$1$2$5$2(feedFragment2);
                            v0Var.w();
                            v0Var.l = feedFragment$buildModels$1$1$2$5$2;
                            oVar2.add(v0Var);
                        } else if (eVar instanceof i0.e.b.b3.a.a.d.a.j) {
                            a1 a1Var = new a1();
                            i0.e.b.b3.a.a.d.a.j jVar2 = (i0.e.b.b3.a.a.d.a.j) eVar;
                            a1Var.s(jVar2.a);
                            FeedFragment$buildModels$1$1$2$6$1 feedFragment$buildModels$1$1$2$6$1 = new FeedFragment$buildModels$1$1$2$6$1(feedFragment2);
                            a1Var.w();
                            a1Var.m = feedFragment$buildModels$1$1$2$6$1;
                            String str6 = jVar2.a;
                            a1Var.w();
                            a1Var.j = str6;
                            List<m> list4 = jVar2.b;
                            a1Var.w();
                            a1Var.k = list4;
                            FeedFragment$buildModels$1$1$2$6$2 feedFragment$buildModels$1$1$2$6$2 = new FeedFragment$buildModels$1$1$2$6$2(feedFragment2);
                            a1Var.w();
                            a1Var.l = feedFragment$buildModels$1$1$2$6$2;
                            p pVar = new p(0, feedFragment2);
                            a1Var.w();
                            a1Var.n = pVar;
                            p pVar2 = new p(1, feedFragment2);
                            a1Var.w();
                            a1Var.o = pVar2;
                            oVar2.add(a1Var);
                        } else if (eVar instanceof b) {
                            s sVar = new s();
                            b bVar = (b) eVar;
                            sVar.s(bVar.a);
                            y yVar = new y(0, feedFragment2);
                            sVar.w();
                            sVar.m = yVar;
                            String str7 = bVar.a;
                            sVar.w();
                            sVar.j = str7;
                            List<Club> list5 = bVar.b;
                            sVar.w();
                            sVar.k = list5;
                            y yVar2 = new y(1, feedFragment2);
                            sVar.w();
                            sVar.l = yVar2;
                            y yVar3 = new y(2, feedFragment2);
                            sVar.w();
                            sVar.n = yVar3;
                            y yVar4 = new y(3, feedFragment2);
                            sVar.w();
                            sVar.o = yVar4;
                            y yVar5 = new y(4, feedFragment2);
                            sVar.w();
                            sVar.p = yVar5;
                            oVar2.add(sVar);
                        } else if (eVar instanceof c) {
                            x xVar = new x();
                            c cVar = (c) eVar;
                            xVar.s(cVar.a);
                            u uVar = new u(0, feedFragment2);
                            xVar.w();
                            xVar.m = uVar;
                            String str8 = cVar.a;
                            xVar.w();
                            xVar.j = str8;
                            List<EventInClub> list6 = cVar.b;
                            xVar.w();
                            xVar.k = list6;
                            k<Object>[] kVarArr = FeedFragment.Z1;
                            Integer num = feedFragment2.P0().z;
                            xVar.w();
                            xVar.l = num;
                            u uVar2 = new u(1, feedFragment2);
                            xVar.w();
                            xVar.n = uVar2;
                            u uVar3 = new u(2, feedFragment2);
                            xVar.w();
                            xVar.o = uVar3;
                            u uVar4 = new u(3, feedFragment2);
                            xVar.w();
                            xVar.p = uVar4;
                            oVar2.add(xVar);
                        } else if (eVar instanceof i0.e.b.b3.a.a.d.a.h) {
                            r0 r0Var = new r0();
                            r0Var.s("language_picker");
                            b0 b0Var4 = new b0(3, feedFragment2, eVar);
                            r0Var.w();
                            r0Var.i = b0Var4;
                            i0.e.b.b3.a.a.d.a.h hVar2 = (i0.e.b.b3.a.a.d.a.h) eVar;
                            r0Var.N(hVar2.a);
                            r0Var.M(hVar2.b);
                            r0Var.L(hVar2.c);
                            i0.e.b.g3.p.c0.m mVar = new i0.e.b.g3.p.c0.m(feedFragment2);
                            r0Var.w();
                            r0Var.m = mVar;
                            i0.e.b.g3.p.c0.k kVar = new i0.e.b.g3.p.c0.k(feedFragment2);
                            r0Var.w();
                            r0Var.n = kVar;
                            oVar2.add(r0Var);
                        }
                        i = 0;
                    }
                }
                if (vVar.e) {
                    o oVar4 = o.this;
                    FeedFragment feedFragment3 = feedFragment2;
                    c0 c0Var = new c0();
                    c0Var.s("explore");
                    n nVar = new n(feedFragment3);
                    c0Var.w();
                    c0Var.j = nVar;
                    oVar4.add(c0Var);
                }
                if (vVar.f) {
                    o oVar5 = o.this;
                    FeedFragment feedFragment4 = feedFragment2;
                    t0 t0Var = new t0();
                    t0Var.s("blocked");
                    if (vVar.g) {
                        Resources resources2 = feedFragment4.getResources();
                        int i2 = vVar.i;
                        String quantityString = resources2.getQuantityString(R.plurals.hide_blocked, i2, new Object[]{Integer.valueOf(i2)});
                        t0Var.w();
                        t0Var.j = quantityString;
                    } else {
                        Resources resources3 = feedFragment4.getResources();
                        int i3 = vVar.i;
                        String quantityString2 = resources3.getQuantityString(R.plurals.show_blocked, i3, new Object[]{Integer.valueOf(i3)});
                        t0Var.w();
                        t0Var.j = quantityString2;
                    }
                    i0.e.b.g3.p.c0.f fVar2 = new i0.e.b.g3.p.c0.f(feedFragment4);
                    t0Var.w();
                    t0Var.k = fVar2;
                    oVar5.add(t0Var);
                }
                return i.a;
            }
        });
        return i.a;
    }
}
