package com.clubhouse.android.ui.hallway.buddyList;

import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.data.models.local.club.ClubInStatus;
import com.clubhouse.android.data.models.local.user.UserInStatus;
import com.clubhouse.wave.data.models.local.ReceivedWave;
import com.clubhouse.wave.data.models.local.SentWave;
import h0.b0.v;
import i0.b.b.c0;
import i0.j.f.p.h;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.n.a.s;
import m0.r.k;
import n0.a.f0;

@c(c = "com.clubhouse.android.ui.hallway.buddyList.BuddyListFragment$onViewCreated$5", f = "BuddyListFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: BuddyListFragment.kt */
public final class BuddyListFragment$onViewCreated$5 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ BuddyListFragment c;

    @c(c = "com.clubhouse.android.ui.hallway.buddyList.BuddyListFragment$onViewCreated$5$5", f = "BuddyListFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.hallway.buddyList.BuddyListFragment$onViewCreated$5$5  reason: invalid class name */
    /* compiled from: BuddyListFragment.kt */
    public static final class AnonymousClass5 extends SuspendLambda implements s<List<? extends ClubInStatus>, List<? extends UserInStatus>, List<? extends ReceivedWave>, List<? extends SentWave>, m0.l.c<? super i>, Object> {
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            BuddyListFragment buddyListFragment = buddyListFragment4;
            k<Object>[] kVarArr = BuddyListFragment.Z1;
            buddyListFragment.N0().a.g();
            return i.a;
        }

        public Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            List list = (List) obj;
            List list2 = (List) obj2;
            List list3 = (List) obj3;
            List list4 = (List) obj4;
            BuddyListFragment buddyListFragment = buddyListFragment4;
            new AnonymousClass5(buddyListFragment, (m0.l.c) obj5);
            i iVar = i.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(iVar);
            k<Object>[] kVarArr = BuddyListFragment.Z1;
            buddyListFragment.N0().a.g();
            return iVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuddyListFragment$onViewCreated$5(BuddyListFragment buddyListFragment, m0.l.c<? super BuddyListFragment$onViewCreated$5> cVar) {
        super(2, cVar);
        this.c = buddyListFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new BuddyListFragment$onViewCreated$5(this.c, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        BuddyListFragment$onViewCreated$5 buddyListFragment$onViewCreated$5 = new BuddyListFragment$onViewCreated$5(this.c, (m0.l.c) obj2);
        i iVar = i.a;
        buddyListFragment$onViewCreated$5.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        BuddyListFragment buddyListFragment = this.c;
        k<Object>[] kVarArr = BuddyListFragment.Z1;
        EpoxyRecyclerView epoxyRecyclerView = buddyListFragment.N0().a;
        m0.n.b.i.d(epoxyRecyclerView, "binding.buddyList");
        BuddyListFragment buddyListFragment2 = this.c;
        Objects.requireNonNull(buddyListFragment2);
        i0.e.b.d3.k.D(epoxyRecyclerView, buddyListFragment2, new BuddyListFragment$buildModels$1(buddyListFragment2));
        BuddyListFragment buddyListFragment3 = this.c;
        BuddyListViewModel O0 = buddyListFragment3.O0();
        AnonymousClass1 r4 = AnonymousClass1.c;
        AnonymousClass2 r5 = AnonymousClass2.c;
        AnonymousClass3 r6 = AnonymousClass3.c;
        AnonymousClass4 r7 = AnonymousClass4.c;
        final BuddyListFragment buddyListFragment4 = this.c;
        v.k1(buddyListFragment3, O0, r4, r5, r6, r7, c0.a, new AnonymousClass5((m0.l.c<? super AnonymousClass5>) null));
        return i.a;
    }
}
