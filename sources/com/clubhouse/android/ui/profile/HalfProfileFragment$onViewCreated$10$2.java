package com.clubhouse.android.ui.profile;

import com.clubhouse.android.channels.mvi.ChannelViewModel;
import h0.q.q;
import i0.e.b.g3.u.q4;
import i0.e.b.z2.g.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.l.c;
import m0.n.a.p;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.f1;
import n0.a.g2.d;

/* compiled from: HalfProfileFragment.kt */
public final class HalfProfileFragment$onViewCreated$10$2 extends Lambda implements p<q4, l, f1> {
    public final /* synthetic */ ChannelViewModel c;
    public final /* synthetic */ HalfProfileFragment d;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.profile.HalfProfileFragment$onViewCreated$10$2$1", f = "HalfProfileFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.profile.HalfProfileFragment$onViewCreated$10$2$1  reason: invalid class name */
    /* compiled from: HalfProfileFragment.kt */
    public final class AnonymousClass1 extends SuspendLambda implements p<Boolean, c<? super m0.i>, Object> {
        public /* synthetic */ boolean c;

        public final c<m0.i> create(Object obj, c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(q4Var, halfProfileFragment, cVar);
            r02.c = ((Boolean) obj).booleanValue();
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            Boolean valueOf = Boolean.valueOf(((Boolean) obj).booleanValue());
            AnonymousClass1 r02 = new AnonymousClass1(q4Var, halfProfileFragment, (c) obj2);
            r02.c = valueOf.booleanValue();
            m0.i iVar = m0.i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0052  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                i0.j.f.p.h.d4(r6)
                boolean r6 = r5.c
                i0.e.b.z2.g.l r0 = i0.e.b.z2.g.l.this
                boolean r1 = r0.q
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0029
                i0.e.b.g3.u.q4 r1 = r5
                boolean r4 = r1.o
                if (r4 != 0) goto L_0x0029
                i0.e.b.b3.a.a.c.a r0 = r0.p
                com.clubhouse.android.user.model.User r1 = r1.a
                java.lang.Integer r1 = r1.getId()
                int r1 = r1.intValue()
                boolean r0 = r0.i(r1)
                if (r0 == 0) goto L_0x0029
                r0 = r2
                goto L_0x002a
            L_0x0029:
                r0 = r3
            L_0x002a:
                com.clubhouse.android.ui.profile.HalfProfileFragment r1 = r2
                com.clubhouse.android.databinding.FragmentHalfProfileBinding r1 = r1.T0()
                android.widget.ImageView r1 = r1.z
                java.lang.String r4 = "halfProfileBinding.mute"
                m0.n.b.i.d(r1, r4)
                if (r0 == 0) goto L_0x003d
                if (r6 == 0) goto L_0x003c
                goto L_0x003d
            L_0x003c:
                r2 = r3
            L_0x003d:
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
                java.lang.String r0 = "<this>"
                m0.n.b.i.e(r1, r0)
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                boolean r6 = m0.n.b.i.a(r6, r0)
                if (r6 == 0) goto L_0x0052
                i0.e.b.d3.k.r(r1)
                goto L_0x0055
            L_0x0052:
                i0.e.b.d3.k.K(r1)
            L_0x0055:
                m0.i r6 = m0.i.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.profile.HalfProfileFragment$onViewCreated$10$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileFragment$onViewCreated$10$2(ChannelViewModel channelViewModel, HalfProfileFragment halfProfileFragment) {
        super(2);
        this.c = channelViewModel;
        this.d = halfProfileFragment;
    }

    public Object invoke(Object obj, Object obj2) {
        final q4 q4Var = (q4) obj;
        final l lVar = (l) obj2;
        i.e(q4Var, "state");
        i.e(lVar, "channelState");
        d<Boolean> b = this.c.A.b(q4Var.a.getId());
        final HalfProfileFragment halfProfileFragment = this.d;
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(b, new AnonymousClass1((c<? super AnonymousClass1>) null));
        h0.q.p viewLifecycleOwner = this.d.getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        return a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
    }
}
