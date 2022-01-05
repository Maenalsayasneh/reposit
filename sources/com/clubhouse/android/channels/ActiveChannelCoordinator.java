package com.clubhouse.android.channels;

import android.app.Activity;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.shared.auth.UserManager;
import i0.e.a.b.a;
import i0.j.f.p.h;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.l.c;
import m0.n.a.p;
import m0.n.b.i;
import n0.a.f0;
import n0.a.f1;
import n0.a.g2.a0;
import n0.a.g2.q;

/* compiled from: ActiveChannelCoordinator.kt */
public final class ActiveChannelCoordinator {
    public final Activity a;
    public final a b;
    public f1 c;
    public final q<Boolean> d = a0.a(Boolean.FALSE);

    @m0.l.f.a.c(c = "com.clubhouse.android.channels.ActiveChannelCoordinator$1", f = "ActiveChannelCoordinator.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.channels.ActiveChannelCoordinator$1  reason: invalid class name */
    /* compiled from: ActiveChannelCoordinator.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<Integer, c<? super m0.i>, Object> {
        public final /* synthetic */ ActiveChannelCoordinator c;

        {
            this.c = r1;
        }

        public final c<m0.i> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.c, aVar2, f0Var, cVar);
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj).intValue();
            AnonymousClass1 r4 = new AnonymousClass1(this.c, aVar2, f0Var, (c) obj2);
            m0.i iVar = m0.i.a;
            r4.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            f1 f1Var = this.c.c;
            if (f1Var != null) {
                m0.r.t.a.r.m.a1.a.o0(f1Var, (CancellationException) null, 1, (Object) null);
            }
            ActiveChannelCoordinator activeChannelCoordinator = this.c;
            q<Channel> qVar = ((i0.e.b.c3.i.a) h.L0(aVar2, i0.e.b.c3.i.a.class)).b().e;
            final ActiveChannelCoordinator activeChannelCoordinator2 = this.c;
            activeChannelCoordinator.c = m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(qVar, new p<Channel, c<? super m0.i>, Object>((c<? super AnonymousClass1>) null) {
                public /* synthetic */ Object c;

                public final c<m0.i> create(Object obj, c<?> cVar) {
                    AnonymousClass1 r02 = 

                    public ActiveChannelCoordinator(Activity activity, a aVar, final f0 f0Var, UserManager userManager, final i0.e.b.f3.i.a aVar2) {
                        i.e(activity, "activity");
                        i.e(aVar, "actionTrailRecorder");
                        i.e(f0Var, "coroutineScope");
                        i.e(userManager, "userManager");
                        i.e(aVar2, "userComponentHandler");
                        this.a = activity;
                        this.b = aVar;
                        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(userManager.f, new AnonymousClass1(this, (c<? super AnonymousClass1>) null)), f0Var);
                        ((h0.q.p) activity).getLifecycle().a(new ActiveChannelCoordinator$special$$inlined$observeResume$1(userManager, this));
                    }
                }
