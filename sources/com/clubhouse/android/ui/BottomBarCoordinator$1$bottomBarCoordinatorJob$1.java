package com.clubhouse.android.ui;

import androidx.lifecycle.Lifecycle;
import com.clubhouse.android.channels.ActiveChannelCoordinator;
import com.clubhouse.android.databinding.ActivityClubhouseBinding;
import com.clubhouse.app.R;
import com.clubhouse.wave.WaveBarViewModel;
import h0.o.a.k;
import i0.e.b.g3.a;
import i0.e.b.g3.b;
import i0.j.f.p.h;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.n.b.f;
import n0.a.f0;
import n0.a.g2.d;
import n0.a.g2.o;
import n0.a.g2.q;

@c(c = "com.clubhouse.android.ui.BottomBarCoordinator$1$bottomBarCoordinatorJob$1", f = "BottomBarCoordinator.kt", l = {57}, m = "invokeSuspend")
/* compiled from: BottomBarCoordinator.kt */
public final class BottomBarCoordinator$1$bottomBarCoordinatorJob$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ WaveBarViewModel.b d;
    public final /* synthetic */ BottomBarCoordinator q;
    public final /* synthetic */ ActiveChannelCoordinator x;
    public final /* synthetic */ f0 y;

    @c(c = "com.clubhouse.android.ui.BottomBarCoordinator$1$bottomBarCoordinatorJob$1$1", f = "BottomBarCoordinator.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.BottomBarCoordinator$1$bottomBarCoordinatorJob$1$1  reason: invalid class name */
    /* compiled from: BottomBarCoordinator.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
        public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
            return new AnonymousClass1(bottomBarCoordinator, b, activeChannelCoordinator, f0Var, cVar);
        }

        public Object invoke(Object obj, Object obj2) {
            f0 f0Var = (f0) obj;
            AnonymousClass1 r02 = new AnonymousClass1(bottomBarCoordinator, b, activeChannelCoordinator, f0Var, (m0.l.c) obj2);
            i iVar = i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            BottomBarCoordinator bottomBarCoordinator = bottomBarCoordinator;
            ActivityClubhouseBinding bind = ActivityClubhouseBinding.bind(bottomBarCoordinator.a.findViewById(R.id.activity_root));
            m0.n.b.i.d(bind, "bind(activity.findViewById(R.id.activity_root))");
            bottomBarCoordinator.c = bind;
            ActivityClubhouseBinding activityClubhouseBinding = bottomBarCoordinator.c;
            if (activityClubhouseBinding != null) {
                activityClubhouseBinding.d.setExpandClickListener(new a(b));
                ActivityClubhouseBinding activityClubhouseBinding2 = bottomBarCoordinator.c;
                if (activityClubhouseBinding2 != null) {
                    activityClubhouseBinding2.d.setDeclineClickListener(new i0.e.b.g3.c(b));
                    ActivityClubhouseBinding activityClubhouseBinding3 = bottomBarCoordinator.c;
                    if (activityClubhouseBinding3 != null) {
                        activityClubhouseBinding3.e.setOnClickListener(new b(b));
                        d h = b.h();
                        q<Boolean> qVar = activeChannelCoordinator.d;
                        final BottomBarCoordinator bottomBarCoordinator2 = bottomBarCoordinator;
                        m0.r.t.a.r.m.a1.a.F2(new o(h, qVar, new m0.n.a.q<i0.e.e.i, Boolean, m0.l.c<? super i>, Object>((m0.l.c<? super AnonymousClass4>) null) {
                            public /* synthetic */ Object c;
                            public /* synthetic */ boolean d;

                            public Object invoke(Object obj, Object obj2, Object obj3) {
                                boolean booleanValue = ((Boolean) obj2).booleanValue();
                                AnonymousClass4 r02 = 

                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                public BottomBarCoordinator$1$bottomBarCoordinatorJob$1(WaveBarViewModel.b bVar, BottomBarCoordinator bottomBarCoordinator, ActiveChannelCoordinator activeChannelCoordinator, f0 f0Var, m0.l.c<? super BottomBarCoordinator$1$bottomBarCoordinatorJob$1> cVar) {
                                    super(2, cVar);
                                    this.d = bVar;
                                    this.q = bottomBarCoordinator;
                                    this.x = activeChannelCoordinator;
                                    this.y = f0Var;
                                }

                                public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
                                    return new BottomBarCoordinator$1$bottomBarCoordinatorJob$1(this.d, this.q, this.x, this.y, cVar);
                                }

                                public Object invoke(Object obj, Object obj2) {
                                    f0 f0Var = (f0) obj;
                                    return new BottomBarCoordinator$1$bottomBarCoordinatorJob$1(this.d, this.q, this.x, this.y, (m0.l.c) obj2).invokeSuspend(i.a);
                                }

                                public final Object invokeSuspend(Object obj) {
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    int i = this.c;
                                    if (i == 0) {
                                        h.d4(obj);
                                        final WaveBarViewModel b = this.d.b(new i0.e.e.i((List) null, false, false, 7, (f) null));
                                        final BottomBarCoordinator bottomBarCoordinator = this.q;
                                        k kVar = bottomBarCoordinator.a;
                                        final ActiveChannelCoordinator activeChannelCoordinator = this.x;
                                        final f0 f0Var = this.y;
                                        AnonymousClass1 r11 = new AnonymousClass1((m0.l.c<? super AnonymousClass1>) null);
                                        this.c = 1;
                                        Lifecycle lifecycle = kVar.getLifecycle();
                                        m0.n.b.i.d(lifecycle, "lifecycle");
                                        if (g0.a.b.b.a.F0(lifecycle, Lifecycle.State.CREATED, r11, this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    } else if (i == 1) {
                                        h.d4(obj);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    return i.a;
                                }
                            }
