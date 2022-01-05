package com.clubhouse.android.ui;

import androidx.recyclerview.widget.RecyclerView;
import com.clubhouse.android.channels.ActiveChannelCoordinator;
import com.clubhouse.android.databinding.ActivityClubhouseBinding;
import com.clubhouse.android.shared.auth.UserManager;
import com.clubhouse.wave.WaveBarViewModel;
import h0.b0.j;
import h0.o.a.k;
import i0.e.b.f3.i.a;
import i0.j.f.p.h;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.l.c;
import m0.l.e;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;
import n0.a.d0;
import n0.a.f0;
import n0.a.f1;
import n0.a.h2.o;
import n0.a.i0;
import n0.a.l1;
import n0.a.m0;

/* compiled from: BottomBarCoordinator.kt */
public final class BottomBarCoordinator {
    public final k a;
    public final j b;
    public ActivityClubhouseBinding c;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.BottomBarCoordinator$1", f = "BottomBarCoordinator.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.BottomBarCoordinator$1  reason: invalid class name */
    /* compiled from: BottomBarCoordinator.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<Integer, c<? super m0.i>, Object> {
        public final c<m0.i> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(f0Var2, aVar3, bVar2, this, activeChannelCoordinator2, cVar);
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj).intValue();
            AnonymousClass1 r02 = new AnonymousClass1(f0Var2, aVar3, bVar2, this, activeChannelCoordinator2, (c) obj2);
            m0.i iVar = m0.i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            f0 f0Var = f0Var2;
            final f1 E2 = m0.r.t.a.r.m.a1.a.E2(f0Var, (e) null, (CoroutineStart) null, new BottomBarCoordinator$1$bottomBarCoordinatorJob$1(bVar2, this, activeChannelCoordinator2, f0Var, (c<? super BottomBarCoordinator$1$bottomBarCoordinatorJob$1>) null), 3, (Object) null);
            i0<Integer> i0Var = ((i0.e.b.h3.a.a) h.L0(aVar3, i0.e.b.h3.a.a.class)).a().a;
            final f0 f0Var2 = f0Var2;
            final BottomBarCoordinator bottomBarCoordinator = this;
            i0Var.E(new l<Throwable, m0.i>() {
                public Object invoke(Object obj) {
                    Throwable th = (Throwable) obj;
                    f0 f0Var = f0Var2;
                    d0 d0Var = m0.a;
                    l1 l1Var = o.c;
                    final BottomBarCoordinator bottomBarCoordinator = bottomBarCoordinator;
                    m0.r.t.a.r.m.a1.a.E2(f0Var, l1Var, (CoroutineStart) null, new p<f0, c<? super m0.i>, Object>((c<? super AnonymousClass1>) null) {
                        public final c<m0.i> create(Object obj, c<?> cVar) {
                            return 

                            public BottomBarCoordinator(k kVar, a aVar, UserManager userManager, WaveBarViewModel.b bVar, ActiveChannelCoordinator activeChannelCoordinator, f0 f0Var) {
                                i.e(kVar, "activity");
                                i.e(aVar, "userComponentHandler");
                                i.e(userManager, "userManager");
                                i.e(bVar, "viewModelFactory");
                                i.e(activeChannelCoordinator, "activeChannelCoordinator");
                                i.e(f0Var, "coroutineScope");
                                this.a = kVar;
                                h0.b0.a aVar2 = new h0.b0.a();
                                Class<RecyclerView> cls = RecyclerView.class;
                                ArrayList<Class<?>> arrayList = aVar2.c2;
                                arrayList = arrayList == null ? new ArrayList<>() : arrayList;
                                if (!arrayList.contains(cls)) {
                                    arrayList.add(cls);
                                }
                                aVar2.c2 = arrayList;
                                i.d(aVar2, "AutoTransition().excludeChildren(RecyclerView::class.java, true)");
                                this.b = aVar2;
                                final f0 f0Var2 = f0Var;
                                final a aVar3 = aVar;
                                final WaveBarViewModel.b bVar2 = bVar;
                                final ActiveChannelCoordinator activeChannelCoordinator2 = activeChannelCoordinator;
                                m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(userManager.f, new AnonymousClass1((c<? super AnonymousClass1>) null)), f0Var);
                            }
                        }
