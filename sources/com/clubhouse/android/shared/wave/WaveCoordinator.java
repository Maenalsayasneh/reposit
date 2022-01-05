package com.clubhouse.android.shared.wave;

import com.clubhouse.android.channels.ActiveChannelCoordinator;
import com.clubhouse.android.shared.auth.UserManager;
import com.clubhouse.wave.WaveCoordinatorViewModel;
import h0.o.a.k;
import i0.e.b.a3.f.b;
import i0.e.b.f3.i.a;
import i0.e.e.j;
import i0.j.f.p.h;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.l.c;
import m0.l.e;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;
import n0.a.f0;
import n0.a.f1;
import n0.a.i0;

/* compiled from: WaveCoordinator.kt */
public final class WaveCoordinator {
    public final k a;
    public final b b;
    public boolean c;
    public WaveCoordinatorViewModel d;

    @m0.l.f.a.c(c = "com.clubhouse.android.shared.wave.WaveCoordinator$1", f = "WaveCoordinator.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.shared.wave.WaveCoordinator$1  reason: invalid class name */
    /* compiled from: WaveCoordinator.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<Integer, c<? super m0.i>, Object> {
        public final /* synthetic */ WaveCoordinator c;

        {
            this.c = r1;
        }

        public final c<m0.i> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.c, bVar3, f0Var2, aVar2, activeChannelCoordinator2, cVar);
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj).intValue();
            AnonymousClass1 r02 = new AnonymousClass1(this.c, bVar3, f0Var2, aVar2, activeChannelCoordinator2, (c) obj2);
            m0.i iVar = m0.i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            this.c.d = bVar3.a(new j(false, false, false, 7, (f) null));
            f0 f0Var = f0Var2;
            final f1 E2 = m0.r.t.a.r.m.a1.a.E2(f0Var, (e) null, (CoroutineStart) null, new WaveCoordinator$1$waveCoordinatorJob$1(this.c, f0Var, activeChannelCoordinator2, (c<? super WaveCoordinator$1$waveCoordinatorJob$1>) null), 3, (Object) null);
            i0<Integer> i0Var = ((i0.e.b.h3.a.a) h.L0(aVar2, i0.e.b.h3.a.a.class)).a().a;
            final WaveCoordinator waveCoordinator = this.c;
            i0Var.E(new l<Throwable, m0.i>() {
                public Object invoke(Object obj) {
                    Throwable th = (Throwable) obj;
                    WaveCoordinatorViewModel waveCoordinatorViewModel = waveCoordinator.d;
                    if (waveCoordinatorViewModel != null) {
                        waveCoordinatorViewModel.i();
                        m0.r.t.a.r.m.a1.a.o0(E2, (CancellationException) null, 1, (Object) null);
                        return m0.i.a;
                    }
                    i.m("viewModel");
                    throw null;
                }
            });
            return m0.i.a;
        }
    }

    public WaveCoordinator(k kVar, WaveCoordinatorViewModel.b bVar, ActiveChannelCoordinator activeChannelCoordinator, b bVar2, a aVar, UserManager userManager, f0 f0Var) {
        i.e(kVar, "activity");
        i.e(bVar, "viewModelFactory");
        i.e(activeChannelCoordinator, "activeChannelCoordinator");
        i.e(bVar2, "bannerHandler");
        i.e(aVar, "userComponentHandler");
        i.e(userManager, "userManager");
        i.e(f0Var, "coroutineScope");
        this.a = kVar;
        this.b = bVar2;
        final WaveCoordinatorViewModel.b bVar3 = bVar;
        final f0 f0Var2 = f0Var;
        final a aVar2 = aVar;
        final ActiveChannelCoordinator activeChannelCoordinator2 = activeChannelCoordinator;
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(userManager.f, new AnonymousClass1(this, (c<? super AnonymousClass1>) null)), f0Var);
    }
}
