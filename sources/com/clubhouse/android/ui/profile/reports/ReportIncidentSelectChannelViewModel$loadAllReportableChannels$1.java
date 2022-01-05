package com.clubhouse.android.ui.profile.reports;

import android.net.Uri;
import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.IncidentChannel;
import com.clubhouse.android.data.models.local.channel.BaseChannelInRoom;
import com.clubhouse.android.data.models.remote.response.GetReportableChannelsResponse;
import com.clubhouse.android.data.repos.UserRepo;
import com.clubhouse.android.user.model.User;
import com.clubhouse.app.R;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.g3.r.n1;
import i0.e.b.g3.u.y5.t0;
import i0.e.b.g3.u.y5.u0;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.m;
import n0.a.d0;

/* compiled from: ReportIncidentSelectChannelViewModel.kt */
public final class ReportIncidentSelectChannelViewModel$loadAllReportableChannels$1 extends Lambda implements l<t0, i> {
    public final /* synthetic */ u0 c;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.profile.reports.ReportIncidentSelectChannelViewModel$loadAllReportableChannels$1$1", f = "ReportIncidentSelectChannelViewModel.kt", l = {62}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.profile.reports.ReportIncidentSelectChannelViewModel$loadAllReportableChannels$1$1  reason: invalid class name */
    /* compiled from: ReportIncidentSelectChannelViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super GetReportableChannelsResponse>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(t0Var, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(t0Var, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                UserRepo userRepo = u0.this.o;
                int intValue = t0Var.a.getId().intValue();
                this.c = 1;
                obj = userRepo.m(intValue, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                h.d4(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportIncidentSelectChannelViewModel$loadAllReportableChannels$1(u0 u0Var) {
        super(1);
        this.c = u0Var;
    }

    public Object invoke(Object obj) {
        final t0 t0Var = (t0) obj;
        m0.n.b.i.e(t0Var, "state");
        final u0 u0Var = this.c;
        AnonymousClass1 r2 = new AnonymousClass1((c<? super AnonymousClass1>) null);
        final u0 u0Var2 = this.c;
        MavericksViewModel.f(u0Var, r2, (d0) null, (m) null, new p<t0, b<? extends GetReportableChannelsResponse>, t0>() {
            public Object invoke(Object obj, Object obj2) {
                final List list;
                t0 t0Var = (t0) obj;
                b bVar = (b) obj2;
                m0.n.b.i.e(t0Var, "$this$execute");
                m0.n.b.i.e(bVar, "it");
                if (bVar instanceof f0) {
                    final List<BaseChannelInRoom> list2 = ((GetReportableChannelsResponse) ((f0) bVar).b).a;
                    if (list2.isEmpty()) {
                        String string = u0.this.n.getString(R.string.continue_anyway);
                        m0.n.b.i.d(string, "resources.getString(R.string.continue_anyway)");
                        list = h.L2(new IncidentChannel(string, (String) null));
                    } else {
                        u0 u0Var = u0.this;
                        ArrayList arrayList = new ArrayList(h.K(list2, 10));
                        for (BaseChannelInRoom baseChannelInRoom : list2) {
                            String str = baseChannelInRoom.e2;
                            if (str == null) {
                                str = u0Var.n.getString(R.string.unnamed_room);
                                m0.n.b.i.d(str, "resources.getString(R.string.unnamed_room)");
                            }
                            arrayList.add(new IncidentChannel(str, baseChannelInRoom.d2));
                        }
                        list = arrayList;
                    }
                    u0 u0Var2 = u0.this;
                    AnonymousClass1 r2 = new l<t0, t0>() {
                        public Object invoke(Object obj) {
                            t0 t0Var = (t0) obj;
                            m0.n.b.i.e(t0Var, "$this$setState");
                            return t0.copy$default(t0Var, (User) null, list, Boolean.valueOf(list2.isEmpty()), (Uri) null, 9, (Object) null);
                        }
                    };
                    int i = u0.m;
                    u0Var2.m(r2);
                } else if (bVar instanceof i0.b.b.c) {
                    u0 u0Var3 = u0.this;
                    n1 n1Var = n1.a;
                    int i2 = u0.m;
                    u0Var3.o(n1Var);
                }
                return t0Var;
            }
        }, 3, (Object) null);
        return i.a;
    }
}
