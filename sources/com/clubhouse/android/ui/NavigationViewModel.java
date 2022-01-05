package com.clubhouse.android.ui;

import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.repos.ChannelRepo;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.g3.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.l.c;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: NavigationViewModel.kt */
public final class NavigationViewModel extends i0.e.b.a3.b.a<h> {
    public ChannelRepo m;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.NavigationViewModel$1", f = "NavigationViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.NavigationViewModel$1  reason: invalid class name */
    /* compiled from: NavigationViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<Channel, c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ NavigationViewModel d;

        {
            this.d = r1;
        }

        public final c<m0.i> create(Object obj, c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            NavigationViewModel navigationViewModel = this.d;
            AnonymousClass1 r02 = new AnonymousClass1(navigationViewModel, (c) obj2);
            r02.c = (Channel) obj;
            m0.i iVar = m0.i.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i0.j.f.p.h.d4(iVar);
            if (((Channel) r02.c) == null) {
                navigationViewModel.q(ChannelDisplayState.NONE);
            }
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i0.j.f.p.h.d4(obj);
            if (((Channel) this.c) == null) {
                this.d.q(ChannelDisplayState.NONE);
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationViewModel(h hVar, i0.e.b.f3.i.a aVar) {
        super(hVar);
        i.e(hVar, "initialState");
        i.e(aVar, "userComponentHandler");
        ChannelRepo b = ((i0.e.b.c3.i.a) i0.j.f.p.h.L0(aVar, i0.e.b.c3.i.a.class)).b();
        this.m = b;
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(b.e, new AnonymousClass1(this, (c<? super AnonymousClass1>) null)), this.c);
    }

    public final void q(ChannelDisplayState channelDisplayState) {
        i.e(channelDisplayState, "channelDisplayState");
        m(new NavigationViewModel$setChannelDisplayState$1(channelDisplayState));
    }

    /* compiled from: NavigationViewModel.kt */
    public static final class a implements v<NavigationViewModel, h> {
        public final /* synthetic */ i0.e.b.c3.h.c<NavigationViewModel, h> a = new i0.e.b.c3.h.c<>(NavigationViewModel.class);

        public a() {
        }

        public NavigationViewModel create(j0 j0Var, h hVar) {
            i.e(j0Var, "viewModelContext");
            i.e(hVar, "state");
            return this.a.create(j0Var, hVar);
        }

        public h initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
