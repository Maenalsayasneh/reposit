package com.clubhouse.android.ui.profile;

import android.net.Uri;
import com.clubhouse.android.channels.mvi.ChannelViewModel;
import com.clubhouse.android.ui.profile.reports.ReportProfileArgs;
import com.clubhouse.android.user.model.User;
import com.clubhouse.app.R;
import h0.b.a.d;
import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.a3.f.j;
import i0.e.b.g3.u.q4;
import i0.e.b.z2.g.l;
import i0.e.b.z2.g.t0;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.profile.HalfProfileFragment$onViewCreated$10$1", f = "HalfProfileFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: HalfProfileFragment.kt */
public final class HalfProfileFragment$onViewCreated$10$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ HalfProfileFragment d;
    public final /* synthetic */ ChannelViewModel q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileFragment$onViewCreated$10$1(HalfProfileFragment halfProfileFragment, ChannelViewModel channelViewModel, m0.l.c<? super HalfProfileFragment$onViewCreated$10$1> cVar) {
        super(2, cVar);
        this.d = halfProfileFragment;
        this.q = channelViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        HalfProfileFragment$onViewCreated$10$1 halfProfileFragment$onViewCreated$10$1 = new HalfProfileFragment$onViewCreated$10$1(this.d, this.q, cVar);
        halfProfileFragment$onViewCreated$10$1.c = obj;
        return halfProfileFragment$onViewCreated$10$1;
    }

    public Object invoke(Object obj, Object obj2) {
        HalfProfileFragment$onViewCreated$10$1 halfProfileFragment$onViewCreated$10$1 = new HalfProfileFragment$onViewCreated$10$1(this.d, this.q, (m0.l.c) obj2);
        halfProfileFragment$onViewCreated$10$1.c = (b) obj;
        i iVar = i.a;
        halfProfileFragment$onViewCreated$10$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof t0) {
            HalfProfileViewModel U0 = this.d.U0();
            ChannelViewModel channelViewModel = this.q;
            final HalfProfileFragment halfProfileFragment = this.d;
            v.u2(U0, channelViewModel, new p<q4, l, i>() {
                public Object invoke(Object obj, Object obj2) {
                    q4 q4Var = (q4) obj;
                    l lVar = (l) obj2;
                    m0.n.b.i.e(q4Var, "state");
                    m0.n.b.i.e(lVar, "channelState");
                    final HalfProfileFragment halfProfileFragment = halfProfileFragment;
                    final b bVar = bVar;
                    v.c2(halfProfileFragment, new m0.n.a.l<j, i>() {
                        public Object invoke(Object obj) {
                            j jVar = (j) obj;
                            m0.n.b.i.e(jVar, "$this$showBanner");
                            jVar.e(HalfProfileFragment.this.getString(R.string.block_from_channel_success, ((t0) bVar).a.getName()));
                            return i.a;
                        }
                    });
                    if (q4Var.d) {
                        if (!q4Var.q) {
                            HalfProfileFragment halfProfileFragment2 = halfProfileFragment;
                            User user = q4Var.a;
                            HalfProfileViewModel U0 = halfProfileFragment2.U0();
                            m0.n.b.i.e(halfProfileFragment2, "<this>");
                            m0.n.b.i.e(user, "user");
                            m0.n.b.i.e(U0, "viewModel");
                            HalfProfileUtil$showBlockConfirmationDialog$1 halfProfileUtil$showBlockConfirmationDialog$1 = new HalfProfileUtil$showBlockConfirmationDialog$1(halfProfileFragment2, user, U0);
                            m0.n.b.i.e(halfProfileFragment2, "<this>");
                            m0.n.b.i.e(halfProfileUtil$showBlockConfirmationDialog$1, "f");
                            d.a aVar = new d.a(halfProfileFragment2.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
                            halfProfileUtil$showBlockConfirmationDialog$1.invoke(aVar);
                            aVar.g();
                        }
                    } else if (((t0) bVar).b) {
                        HalfProfileFragment halfProfileFragment3 = halfProfileFragment;
                        m0.n.b.i.e(halfProfileFragment3, "<this>");
                        v.v2(halfProfileFragment3.U0(), new HalfProfileUtil$showReportConfirmationDialog$1(halfProfileFragment3));
                    } else {
                        HalfProfileFragment halfProfileFragment4 = halfProfileFragment;
                        User user2 = q4Var.a;
                        HalfProfileFragment.O0(halfProfileFragment4, new ReportProfileArgs(user2, lVar.t, lVar.p.e(user2.getId().intValue()), lVar.p.i(q4Var.a.getId().intValue()), (Uri) null, 16));
                    }
                    return i.a;
                }
            });
        }
        return i.a;
    }
}
