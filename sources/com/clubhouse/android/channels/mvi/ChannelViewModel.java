package com.clubhouse.android.channels.mvi;

import android.content.Context;
import android.content.res.Resources;
import com.clubhouse.android.channels.repos.SpeakerStateDataSource;
import com.clubhouse.android.data.repos.ChannelRepo;
import com.clubhouse.android.data.repos.ClubRepo;
import com.clubhouse.android.data.repos.UserRepo;
import com.clubhouse.android.shared.FeatureFlags;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.f3.k.b;
import i0.e.b.z2.e.d;
import i0.e.b.z2.g.l;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineStart;
import m0.c;
import m0.l.e;
import m0.n.b.f;
import m0.n.b.i;
import n0.a.f1;

/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel extends i0.e.b.a3.b.a<l> {
    public static final /* synthetic */ int m = 0;
    public final SpeakerStateDataSource A;
    public final b n;
    public final Context o;
    public final Resources p;
    public final d q;
    public final ChannelControlModel r;
    public final ChannelRepo s;
    public final UserRepo t;
    public final ClubRepo u;
    public final FeatureFlags v;
    public final c w;
    public final c x;
    public f1 y;
    public f1 z;

    static {
        new a((f) null);
    }

    /* JADX WARNING: type inference failed for: r9v23, types: [java.lang.Object, i0.e.b.z2.e.a] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChannelViewModel(i0.e.b.z2.g.l r9, i0.e.b.f3.i.a r10, i0.e.b.f3.k.b r11, android.content.Context r12, android.content.res.Resources r13) {
        /*
            r8 = this;
            java.lang.Class<i0.e.b.c3.i.a> r0 = i0.e.b.c3.i.a.class
            java.lang.String r1 = "initialState"
            m0.n.b.i.e(r9, r1)
            java.lang.String r1 = "userComponentHandler"
            m0.n.b.i.e(r10, r1)
            java.lang.String r1 = "userPrefs"
            m0.n.b.i.e(r11, r1)
            java.lang.String r1 = "applicationContext"
            m0.n.b.i.e(r12, r1)
            java.lang.String r1 = "resources"
            m0.n.b.i.e(r13, r1)
            r8.<init>(r9)
            r8.n = r11
            r8.o = r12
            r8.p = r13
            i0.e.b.h3.a.b r11 = r10.d
            m0.n.b.i.c(r11)
            com.clubhouse.android.channels.ChannelComponentHandler r11 = h0.b0.v.s(r11)
            java.lang.String r12 = r9.t
            com.clubhouse.android.data.models.local.user.SourceLocation r9 = r9.b
            java.util.Objects.requireNonNull(r11)
            java.lang.String r13 = "channelId"
            m0.n.b.i.e(r12, r13)
            java.lang.String r13 = "sourceLocation"
            m0.n.b.i.e(r9, r13)
            i0.e.b.z2.e.a r13 = r11.c
            r1 = 0
            if (r13 != 0) goto L_0x0045
            r13 = r1
            goto L_0x004d
        L_0x0045:
            i0.e.b.z2.e.d r13 = h0.b0.v.b0(r13)
            java.lang.String r13 = r13.b()
        L_0x004d:
            boolean r13 = m0.n.b.i.a(r13, r12)
            if (r13 == 0) goto L_0x0071
            com.clubhouse.android.data.repos.ChannelRepo r13 = r11.b
            n0.a.g2.q<com.clubhouse.android.data.models.local.channel.Channel> r13 = r13.e
            java.lang.Object r13 = r13.getValue()
            com.clubhouse.android.data.models.local.channel.Channel r13 = (com.clubhouse.android.data.models.local.channel.Channel) r13
            if (r13 != 0) goto L_0x0061
            r13 = r1
            goto L_0x0065
        L_0x0061:
            java.lang.String r13 = r13.e()
        L_0x0065:
            boolean r13 = m0.n.b.i.a(r13, r12)
            if (r13 == 0) goto L_0x0071
            i0.e.b.z2.e.a r9 = r11.c
            m0.n.b.i.c(r9)
            goto L_0x00bd
        L_0x0071:
            i0.e.b.z2.e.a r13 = r11.c
            if (r13 != 0) goto L_0x0076
            goto L_0x0085
        L_0x0076:
            i0.e.b.z2.e.d r13 = h0.b0.v.b0(r13)
            i0.e.b.a3.a.b r13 = r13.a()
            if (r13 != 0) goto L_0x0081
            goto L_0x0085
        L_0x0081:
            r2 = 1
            i0.e.b.a3.a.b.a(r13, r1, r2)
        L_0x0085:
            com.clubhouse.android.data.repos.ChannelRepo r13 = r11.b
            n0.a.g2.q<com.clubhouse.android.data.models.local.channel.Channel> r13 = r13.e
            r13.setValue(r1)
            r11.c = r1
            i0.e.b.z2.e.b r13 = r11.a
            i0.e.b.l$i$a r13 = (i0.e.b.l.i.a) r13
            java.util.Objects.requireNonNull(r13)
            r13.c = r12
            r13.d = r9
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            i0.j.f.p.h.C(r12, r9)
            com.clubhouse.android.data.models.local.user.SourceLocation r9 = r13.d
            java.lang.Class<com.clubhouse.android.data.models.local.user.SourceLocation> r12 = com.clubhouse.android.data.models.local.user.SourceLocation.class
            i0.j.f.p.h.C(r9, r12)
            i0.e.b.l$i$b r9 = new i0.e.b.l$i$b
            i0.e.b.l r3 = r13.a
            i0.e.b.l$i r4 = r13.b
            java.lang.String r5 = r13.c
            com.clubhouse.android.data.models.local.user.SourceLocation r6 = r13.d
            r7 = 0
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            i0.e.b.z2.e.d r12 = h0.b0.v.b0(r9)
            r12.c()
            r11.c = r9
        L_0x00bd:
            i0.e.b.z2.e.d r9 = h0.b0.v.b0(r9)
            r8.q = r9
            com.clubhouse.android.channels.mvi.ChannelControlModel r11 = r9.d()
            r8.r = r11
            java.lang.Object r12 = i0.j.f.p.h.L0(r10, r0)
            i0.e.b.c3.i.a r12 = (i0.e.b.c3.i.a) r12
            com.clubhouse.android.data.repos.ChannelRepo r12 = r12.b()
            r8.s = r12
            java.lang.Object r12 = i0.j.f.p.h.L0(r10, r0)
            i0.e.b.c3.i.a r12 = (i0.e.b.c3.i.a) r12
            com.clubhouse.android.data.repos.UserRepo r12 = r12.c()
            r8.t = r12
            java.lang.Object r12 = i0.j.f.p.h.L0(r10, r0)
            i0.e.b.c3.i.a r12 = (i0.e.b.c3.i.a) r12
            com.clubhouse.android.data.repos.ClubRepo r12 = r12.l()
            r8.u = r12
            java.lang.Class<i0.e.b.f3.h> r12 = i0.e.b.f3.h.class
            java.lang.Object r12 = i0.j.f.p.h.L0(r10, r12)
            i0.e.b.f3.h r12 = (i0.e.b.f3.h) r12
            com.clubhouse.android.shared.FeatureFlags r12 = r12.e()
            r8.v = r12
            com.clubhouse.android.channels.mvi.ChannelViewModel$backchannelRepo$2 r13 = new com.clubhouse.android.channels.mvi.ChannelViewModel$backchannelRepo$2
            r13.<init>(r10)
            m0.c r13 = i0.j.f.p.h.H2(r13)
            r8.w = r13
            com.clubhouse.android.channels.mvi.ChannelViewModel$waveRepo$2 r0 = new com.clubhouse.android.channels.mvi.ChannelViewModel$waveRepo$2
            r0.<init>(r10)
            m0.c r10 = i0.j.f.p.h.H2(r0)
            r8.x = r10
            com.clubhouse.android.channels.repos.SpeakerStateDataSource r9 = r9.e()
            r8.A = r9
            n0.a.g2.d r9 = r11.h()
            com.clubhouse.android.channels.mvi.ChannelViewModel$1 r10 = new com.clubhouse.android.channels.mvi.ChannelViewModel$1
            r10.<init>(r8, r1)
            kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1
            r0.<init>(r9, r10)
            n0.a.f0 r9 = r8.c
            m0.r.t.a.r.m.a1.a.F2(r0, r9)
            n0.a.g2.t<i0.e.b.a3.b.b> r9 = r11.l
            com.clubhouse.android.channels.mvi.ChannelViewModel$2 r10 = new com.clubhouse.android.channels.mvi.ChannelViewModel$2
            r10.<init>(r8, r1)
            kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 r11 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1
            r11.<init>(r9, r10)
            n0.a.f0 r9 = r8.c
            m0.r.t.a.r.m.a1.a.F2(r11, r9)
            com.clubhouse.android.channels.mvi.ChannelViewModel$3 r9 = com.clubhouse.android.channels.mvi.ChannelViewModel.AnonymousClass3.c
            com.clubhouse.android.channels.mvi.ChannelViewModel$4 r10 = com.clubhouse.android.channels.mvi.ChannelViewModel.AnonymousClass4.c
            com.clubhouse.android.channels.mvi.ChannelViewModel$5 r11 = new com.clubhouse.android.channels.mvi.ChannelViewModel$5
            r11.<init>(r8, r1)
            r8.k(r9, r10, r11)
            n0.a.g2.t<i0.e.b.a3.b.c> r9 = r8.k
            com.clubhouse.android.channels.mvi.ChannelViewModel$6 r10 = new com.clubhouse.android.channels.mvi.ChannelViewModel$6
            r10.<init>(r8, r1)
            kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 r11 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1
            r11.<init>(r9, r10)
            n0.a.f0 r9 = r8.c
            m0.r.t.a.r.m.a1.a.F2(r11, r9)
            r8.r()
            r8.q()
            kotlin.SynchronizedLazyImpl r13 = (kotlin.SynchronizedLazyImpl) r13
            java.lang.Object r9 = r13.getValue()
            i0.e.c.f.d.a r9 = (i0.e.c.f.d.a) r9
            n0.a.g2.d r9 = r9.j()
            com.clubhouse.android.channels.mvi.ChannelViewModel$subscribeForBackchannel$1 r10 = new com.clubhouse.android.channels.mvi.ChannelViewModel$subscribeForBackchannel$1
            r10.<init>(r8, r1)
            kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 r11 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1
            r11.<init>(r9, r10)
            n0.a.f0 r9 = r8.c
            m0.r.t.a.r.m.a1.a.F2(r11, r9)
            com.clubhouse.android.channels.mvi.ChannelViewModel$initFlags$1 r9 = new com.clubhouse.android.channels.mvi.ChannelViewModel$initFlags$1
            r9.<init>(r8)
            r8.m(r9)
            com.clubhouse.android.channels.mvi.ChannelViewModel$initFollowersCount$1 r9 = new com.clubhouse.android.channels.mvi.ChannelViewModel$initFollowersCount$1
            r9.<init>(r8)
            r8.m(r9)
            com.clubhouse.android.shared.Flag r9 = com.clubhouse.android.shared.Flag.EnableWaves
            boolean r9 = r12.a(r9)
            if (r9 == 0) goto L_0x019f
            n0.a.f0 r2 = r8.c
            r3 = 0
            r4 = 0
            com.clubhouse.android.channels.mvi.ChannelViewModel$presentWaveUpsellAfterDelay$1 r5 = new com.clubhouse.android.channels.mvi.ChannelViewModel$presentWaveUpsellAfterDelay$1
            r5.<init>(r8, r1)
            r6 = 3
            r7 = 0
            m0.r.t.a.r.m.a1.a.E2(r2, r3, r4, r5, r6, r7)
        L_0x019f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.channels.mvi.ChannelViewModel.<init>(i0.e.b.z2.g.l, i0.e.b.f3.i.a, i0.e.b.f3.k.b, android.content.Context, android.content.res.Resources):void");
    }

    public final void q() {
        f1 f1Var = this.z;
        if (f1Var != null) {
            m0.r.t.a.r.m.a1.a.o0(f1Var, (CancellationException) null, 1, (Object) null);
        }
        this.z = m0.r.t.a.r.m.a1.a.E2(this.c, (e) null, (CoroutineStart) null, new ChannelViewModel$startFollowPromptUpdates$1(this, (m0.l.c<? super ChannelViewModel$startFollowPromptUpdates$1>) null), 3, (Object) null);
    }

    public final void r() {
        f1 f1Var = this.y;
        if (f1Var != null) {
            m0.r.t.a.r.m.a1.a.o0(f1Var, (CancellationException) null, 1, (Object) null);
        }
        this.y = m0.r.t.a.r.m.a1.a.E2(this.c, (e) null, (CoroutineStart) null, new ChannelViewModel$startStateUpdates$1(this, (m0.l.c<? super ChannelViewModel$startStateUpdates$1>) null), 3, (Object) null);
    }

    /* compiled from: ChannelViewModel.kt */
    public static final class a implements v<ChannelViewModel, l> {
        public final /* synthetic */ i0.e.b.c3.h.c<ChannelViewModel, l> a = new i0.e.b.c3.h.c<>(ChannelViewModel.class);

        public a() {
        }

        public ChannelViewModel create(j0 j0Var, l lVar) {
            i.e(j0Var, "viewModelContext");
            i.e(lVar, "state");
            return this.a.create(j0Var, lVar);
        }

        public l initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
