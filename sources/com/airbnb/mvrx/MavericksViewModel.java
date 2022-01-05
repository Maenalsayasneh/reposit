package com.airbnb.mvrx;

import com.airbnb.mvrx.MavericksViewModelConfig;
import i0.b.b.c0;
import i0.b.b.g;
import i0.b.b.i0;
import i0.b.b.j;
import i0.b.b.l;
import i0.b.b.t;
import i0.b.b.u;
import i0.b.b.z;
import i0.j.f.p.h;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.l.e;
import m0.n.a.p;
import m0.n.a.q;
import m0.n.b.i;
import m0.r.m;
import m0.r.t.a.r.m.a1.a;
import n0.a.d0;
import n0.a.f0;
import n0.a.f1;
import n0.a.g2.d;
import n0.a.g2.s;
import n0.a.h2.o;
import n0.a.m0;
import n0.a.v;
import n0.a.w;
import n0.a.x;

/* compiled from: MavericksViewModel.kt */
public abstract class MavericksViewModel<S extends j> {
    public final u a;
    public final MavericksViewModelConfig<S> b;
    public final f0 c;
    public final l<S> d;
    public final ConcurrentHashMap<String, Object> e;
    public final Set<String> f;
    public final c g;
    public final z<S> h;

    @m0.l.f.a.c(c = "com.airbnb.mvrx.MavericksViewModel$1", f = "MavericksViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.airbnb.mvrx.MavericksViewModel$1  reason: invalid class name */
    /* compiled from: MavericksViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<f0, m0.l.c<? super m0.i>, Object> {
        public final /* synthetic */ MavericksViewModel c;

        {
            this.c = r1;
        }

        public final m0.l.c<m0.i> create(Object obj, m0.l.c<?> cVar) {
            i.e(cVar, "completion");
            return new AnonymousClass1(this.c, s, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            m0.l.c cVar = (m0.l.c) obj2;
            i.e(cVar, "completion");
            AnonymousClass1 r3 = new AnonymousClass1(this.c, s, cVar);
            m0.i iVar = m0.i.a;
            r3.invokeSuspend(iVar);
            return iVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:39:0x00b9  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x023c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                i0.j.f.p.h.d4(r15)
                com.airbnb.mvrx.MavericksViewModel r15 = r14.c
                i0.b.b.j r0 = r11
                i0.b.b.j r1 = r15.g()
                java.lang.Class r1 = r1.getClass()
                m0.r.d r1 = m0.n.b.m.a(r1)
                java.lang.String r2 = "$this$assertImmutability"
                m0.n.b.i.e(r1, r2)
                java.lang.Class r2 = i0.j.f.p.h.l1(r1)
                java.lang.String r3 = "$this$isData"
                m0.n.b.i.e(r2, r3)
                java.lang.reflect.Method[] r3 = r2.getDeclaredMethods()
                java.lang.String r4 = "declaredMethods"
                m0.n.b.i.d(r3, r4)
                int r5 = r3.length
                r6 = 0
                r7 = r6
            L_0x002f:
                java.lang.String r8 = "it"
                r9 = 1
                if (r7 >= r5) goto L_0x004e
                r10 = r3[r7]
                java.lang.String r11 = "copy$default"
                boolean r11 = i0.d.a.a.a.z(r10, r8, r11)
                if (r11 == 0) goto L_0x0046
                boolean r10 = r10.isSynthetic()
                if (r10 == 0) goto L_0x0046
                r10 = r9
                goto L_0x0047
            L_0x0046:
                r10 = r6
            L_0x0047:
                if (r10 == 0) goto L_0x004b
                r3 = r9
                goto L_0x004f
            L_0x004b:
                int r7 = r7 + 1
                goto L_0x002f
            L_0x004e:
                r3 = r6
            L_0x004f:
                r5 = 2
                if (r3 != 0) goto L_0x0054
                goto L_0x00b6
            L_0x0054:
                java.lang.reflect.Method[] r3 = r2.getDeclaredMethods()
                m0.n.b.i.d(r3, r4)
                int r7 = r3.length
                r10 = r6
            L_0x005d:
                if (r10 >= r7) goto L_0x0079
                r11 = r3[r10]
                m0.n.b.i.d(r11, r8)
                java.lang.String r12 = r11.getName()
                java.lang.String r13 = "it.name"
                m0.n.b.i.d(r12, r13)
                java.lang.String r13 = "component1"
                boolean r12 = kotlin.text.StringsKt__IndentKt.J(r12, r13, r6, r5)
                if (r12 == 0) goto L_0x0076
                goto L_0x007a
            L_0x0076:
                int r10 = r10 + 1
                goto L_0x005d
            L_0x0079:
                r11 = 0
            L_0x007a:
                if (r11 == 0) goto L_0x00b6
                java.lang.reflect.Method[] r3 = r2.getDeclaredMethods()
                m0.n.b.i.d(r3, r4)
                int r7 = r3.length
                r10 = r6
            L_0x0085:
                if (r10 >= r7) goto L_0x0095
                r11 = r3[r10]
                java.lang.String r12 = "equals"
                boolean r12 = i0.d.a.a.a.z(r11, r8, r12)
                if (r12 == 0) goto L_0x0092
                goto L_0x0096
            L_0x0092:
                int r10 = r10 + 1
                goto L_0x0085
            L_0x0095:
                r11 = 0
            L_0x0096:
                if (r11 == 0) goto L_0x00b6
                java.lang.reflect.Method[] r2 = r2.getDeclaredMethods()
                m0.n.b.i.d(r2, r4)
                int r3 = r2.length
                r4 = r6
            L_0x00a1:
                if (r4 >= r3) goto L_0x00b1
                r7 = r2[r4]
                java.lang.String r10 = "hashCode"
                boolean r10 = i0.d.a.a.a.z(r7, r8, r10)
                if (r10 == 0) goto L_0x00ae
                goto L_0x00b2
            L_0x00ae:
                int r4 = r4 + 1
                goto L_0x00a1
            L_0x00b1:
                r7 = 0
            L_0x00b2:
                if (r7 == 0) goto L_0x00b6
                r2 = r9
                goto L_0x00b7
            L_0x00b6:
                r2 = r6
            L_0x00b7:
                if (r2 == 0) goto L_0x023c
                com.airbnb.mvrx.MavericksMutabilityHelperKt$assertImmutability$2 r2 = com.airbnb.mvrx.MavericksMutabilityHelperKt$assertImmutability$2.c
                java.lang.Class r2 = i0.j.f.p.h.l1(r1)
                java.lang.reflect.Field[] r2 = r2.getDeclaredFields()
                java.lang.String r3 = "java.declaredFields"
                m0.n.b.i.d(r2, r3)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                int r4 = r2.length
                r7 = r6
            L_0x00cf:
                if (r7 >= r4) goto L_0x00e6
                r10 = r2[r7]
                m0.n.b.i.d(r10, r8)
                int r11 = r10.getModifiers()
                boolean r11 = java.lang.reflect.Modifier.isTransient(r11)
                if (r11 != 0) goto L_0x00e3
                r3.add(r10)
            L_0x00e3:
                int r7 = r7 + 1
                goto L_0x00cf
            L_0x00e6:
                java.util.Iterator r2 = r3.iterator()
            L_0x00ea:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x022e
                java.lang.Object r3 = r2.next()
                java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
                java.lang.String r4 = "prop"
                m0.n.b.i.d(r3, r4)
                int r4 = r3.getModifiers()
                boolean r4 = java.lang.reflect.Modifier.isFinal(r4)
                if (r4 != 0) goto L_0x0113
                java.lang.String r4 = "State property "
                java.lang.StringBuilder r4 = i0.d.a.a.a.P0(r4)
                java.lang.String r7 = " must be a val, not a var."
                java.lang.String r3 = i0.d.a.a.a.F0(r3, r4, r7)
                goto L_0x0203
            L_0x0113:
                com.airbnb.mvrx.MavericksMutabilityHelperKt$assertImmutability$2 r4 = com.airbnb.mvrx.MavericksMutabilityHelperKt$assertImmutability$2.c
                m0.r.d[] r7 = new m0.r.d[r9]
                java.lang.Class<java.util.ArrayList> r8 = java.util.ArrayList.class
                m0.r.d r8 = m0.n.b.m.a(r8)
                r7[r6] = r8
                boolean r7 = r4.a(r3, r7)
                java.lang.String r8 = ".\nUse the immutable listOf(...) method instead. You can append it with `val newList = listA + listB`"
                if (r7 == 0) goto L_0x0133
                java.lang.String r4 = "You cannot use ArrayList for "
                java.lang.StringBuilder r4 = i0.d.a.a.a.P0(r4)
                java.lang.String r3 = i0.d.a.a.a.F0(r3, r4, r8)
                goto L_0x0203
            L_0x0133:
                m0.r.d[] r7 = new m0.r.d[r9]
                java.lang.Class<android.util.SparseArray> r10 = android.util.SparseArray.class
                m0.r.d r10 = m0.n.b.m.a(r10)
                r7[r6] = r10
                boolean r7 = r4.a(r3, r7)
                if (r7 == 0) goto L_0x014f
                java.lang.String r4 = "You cannot use SparseArray for "
                java.lang.StringBuilder r4 = i0.d.a.a.a.P0(r4)
                java.lang.String r3 = i0.d.a.a.a.F0(r3, r4, r8)
                goto L_0x0203
            L_0x014f:
                m0.r.d[] r7 = new m0.r.d[r9]
                java.lang.Class<h0.f.e> r10 = h0.f.e.class
                m0.r.d r10 = m0.n.b.m.a(r10)
                r7[r6] = r10
                boolean r7 = r4.a(r3, r7)
                if (r7 == 0) goto L_0x016b
                java.lang.String r4 = "You cannot use LongSparseArray for "
                java.lang.StringBuilder r4 = i0.d.a.a.a.P0(r4)
                java.lang.String r3 = i0.d.a.a.a.F0(r3, r4, r8)
                goto L_0x0203
            L_0x016b:
                m0.r.d[] r7 = new m0.r.d[r9]
                java.lang.Class<h0.f.i> r10 = h0.f.i.class
                m0.r.d r10 = m0.n.b.m.a(r10)
                r7[r6] = r10
                boolean r7 = r4.a(r3, r7)
                if (r7 == 0) goto L_0x0187
                java.lang.String r4 = "You cannot use SparseArrayCompat for "
                java.lang.StringBuilder r4 = i0.d.a.a.a.P0(r4)
                java.lang.String r3 = i0.d.a.a.a.F0(r3, r4, r8)
                goto L_0x0203
            L_0x0187:
                m0.r.d[] r7 = new m0.r.d[r9]
                java.lang.Class<h0.f.a> r8 = h0.f.a.class
                m0.r.d r8 = m0.n.b.m.a(r8)
                r7[r6] = r8
                boolean r7 = r4.a(r3, r7)
                java.lang.String r8 = "You cannot use ArrayMap for "
                java.lang.String r10 = ".\nUse the immutable mapOf(...) method instead. You can append it with `val newMap = mapA + mapB`"
                if (r7 == 0) goto L_0x01a4
                java.lang.StringBuilder r4 = i0.d.a.a.a.P0(r8)
                java.lang.String r3 = i0.d.a.a.a.F0(r3, r4, r10)
                goto L_0x0203
            L_0x01a4:
                m0.r.d[] r7 = new m0.r.d[r9]
                java.lang.Class<android.util.ArrayMap> r11 = android.util.ArrayMap.class
                m0.r.d r11 = m0.n.b.m.a(r11)
                r7[r6] = r11
                boolean r7 = r4.a(r3, r7)
                if (r7 == 0) goto L_0x01bd
                java.lang.StringBuilder r4 = i0.d.a.a.a.P0(r8)
                java.lang.String r3 = i0.d.a.a.a.F0(r3, r4, r10)
                goto L_0x0203
            L_0x01bd:
                m0.r.d[] r7 = new m0.r.d[r9]
                java.lang.Class<java.util.HashMap> r8 = java.util.HashMap.class
                m0.r.d r8 = m0.n.b.m.a(r8)
                r7[r6] = r8
                boolean r7 = r4.a(r3, r7)
                if (r7 == 0) goto L_0x01d8
                java.lang.String r4 = "You cannot use HashMap for "
                java.lang.StringBuilder r4 = i0.d.a.a.a.P0(r4)
                java.lang.String r3 = i0.d.a.a.a.F0(r3, r4, r10)
                goto L_0x0203
            L_0x01d8:
                m0.r.d[] r7 = new m0.r.d[r5]
                java.lang.Class<m0.a> r8 = m0.a.class
                m0.r.d r8 = m0.n.b.m.a(r8)
                r7[r6] = r8
                java.lang.Class<m0.r.c> r8 = m0.r.c.class
                m0.r.d r8 = m0.n.b.m.a(r8)
                r7[r9] = r8
                boolean r4 = r4.a(r3, r7)
                if (r4 == 0) goto L_0x0202
                java.lang.String r4 = "You cannot use functions inside MvRx state. Only pure data should be represented: "
                java.lang.StringBuilder r4 = i0.d.a.a.a.P0(r4)
                java.lang.String r3 = r3.getName()
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                goto L_0x0203
            L_0x0202:
                r3 = 0
            L_0x0203:
                if (r3 != 0) goto L_0x0207
                goto L_0x00ea
            L_0x0207:
                java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Invalid property in state "
                java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
                java.lang.Class r1 = r1.getClass()
                m0.r.d r1 = m0.n.b.m.a(r1)
                java.lang.String r1 = r1.e()
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r15.<init>(r0)
                throw r15
            L_0x022e:
                i0.b.b.j r15 = r15.g()
                android.os.Bundle r15 = h0.b0.v.n1(r15, r9)
                h0.b0.v.O1(r15, r0, r9)
                m0.i r15 = m0.i.a
                return r15
            L_0x023c:
                java.lang.String r15 = "MvRx state must be a data class! - "
                java.lang.StringBuilder r15 = i0.d.a.a.a.P0(r15)
                java.lang.Class r0 = r1.getClass()
                m0.r.d r0 = m0.n.b.m.a(r0)
                java.lang.String r0 = r0.e()
                r15.append(r0)
                java.lang.String r15 = r15.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r15 = r15.toString()
                r0.<init>(r15)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.mvrx.MavericksViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public MavericksViewModel(final S s) {
        i.e(s, "initialState");
        u uVar = g.b;
        if (uVar != null) {
            this.a = uVar;
            i.e(this, "viewModel");
            i.e(s, "initialState");
            i.e(this, "viewModel");
            i.e(s, "initialState");
            x z = a.z((f1) null, 1);
            d0 d0Var = m0.a;
            f0 h2 = a.h(e.a.C0242a.d((JobSupport) z, o.c.T()).plus(uVar.c));
            t tVar = new t(uVar, s, h2, uVar.b, new CoroutinesStateStore(s, h2, uVar.d), h2);
            for (p invoke : uVar.a) {
                invoke.invoke(this, tVar);
            }
            this.b = tVar;
            f0 f0Var = tVar.c;
            this.c = f0Var;
            this.d = tVar.b;
            this.e = new ConcurrentHashMap<>();
            this.f = Collections.newSetFromMap(new ConcurrentHashMap());
            this.g = h.H2(new MavericksViewModel$tag$2(this));
            this.h = tVar.a ? new z<>(s) : null;
            if (tVar.a) {
                a.E2(f0Var, m0.a, (CoroutineStart) null, new AnonymousClass1(this, (m0.l.c) null), 2, (Object) null);
                return;
            }
            return;
        }
        throw new IllegalStateException("You must initialize Mavericks. Add Mavericks.initialize(...) to your Application.onCreate().".toString());
    }

    public static f1 f(MavericksViewModel mavericksViewModel, m0.n.a.l lVar, d0 d0Var, m mVar, p pVar, int i, Object obj) {
        MavericksViewModel mavericksViewModel2 = mavericksViewModel;
        p pVar2 = pVar;
        e eVar = (i & 1) != 0 ? null : d0Var;
        int i2 = i & 2;
        Objects.requireNonNull(mavericksViewModel);
        m0.n.a.l lVar2 = lVar;
        i.e(lVar, "$this$execute");
        i.e(pVar, "reducer");
        MavericksViewModelConfig.BlockExecutions a2 = mavericksViewModel2.b.a(mavericksViewModel);
        if (a2 != MavericksViewModelConfig.BlockExecutions.No) {
            if (a2 == MavericksViewModelConfig.BlockExecutions.WithLoading) {
                mavericksViewModel.m(new MavericksViewModel$execute$2(pVar));
            }
            return a.E2(mavericksViewModel2.c, (e) null, (CoroutineStart) null, new MavericksViewModel$execute$3((m0.l.c) null), 3, (Object) null);
        }
        mavericksViewModel.m(new MavericksViewModel$execute$4(pVar, (m) null));
        f0 f0Var = mavericksViewModel2.c;
        if (eVar == null) {
            eVar = EmptyCoroutineContext.c;
        }
        return a.E2(f0Var, eVar, (CoroutineStart) null, new MavericksViewModel$execute$5(mavericksViewModel, lVar, pVar, (m) null, (m0.l.c) null), 2, (Object) null);
    }

    public final Object e(m0.l.c<? super S> cVar) {
        v g2 = a.g((f1) null, 1);
        n(new MavericksViewModel$awaitState$2(g2));
        return ((w) g2).w(cVar);
    }

    public final S g() {
        return (j) this.d.getState();
    }

    public final d<S> h() {
        return this.d.a();
    }

    public void i() {
        a.n0(this.c, (CancellationException) null, 1);
    }

    public final <A> f1 j(m<S, ? extends A> mVar, p<? super A, ? super m0.l.c<? super m0.i>, ? extends Object> pVar) {
        i.e(mVar, "prop1");
        i.e(pVar, "action");
        return h0.b0.v.c(this, (h0.q.p) null, mVar, c0.a, pVar);
    }

    public final <A, B> f1 k(m<S, ? extends A> mVar, m<S, ? extends B> mVar2, q<? super A, ? super B, ? super m0.l.c<? super m0.i>, ? extends Object> qVar) {
        i.e(mVar, "prop1");
        i.e(mVar2, "prop2");
        i.e(qVar, "action");
        return h0.b0.v.d(this, (h0.q.p) null, mVar, mVar2, c0.a, qVar);
    }

    public final <T> f1 l(d<? extends T> dVar, h0.q.p pVar, DeliveryMode deliveryMode, p<? super T, ? super m0.l.c<? super m0.i>, ? extends Object> pVar2) {
        i.e(dVar, "$this$resolveSubscription");
        i.e(deliveryMode, "deliveryMode");
        i.e(pVar2, "action");
        if (pVar != null) {
            int i = i0.b.b.m.a;
            i.d(Boolean.FALSE, "MavericksTestOverrides.F…_LIFECYCLE_AWARE_OBSERVER");
            if (deliveryMode instanceof i0) {
                i0 i0Var = (i0) deliveryMode;
                Object obj = this.e.get(i0Var.a);
                MavericksViewModel$assertOneActiveSubscription$observer$1 mavericksViewModel$assertOneActiveSubscription$observer$1 = new MavericksViewModel$assertOneActiveSubscription$observer$1(this, i0Var);
                pVar.getLifecycle().a(mavericksViewModel$assertOneActiveSubscription$observer$1);
                n0.a.g2.i iVar = new n0.a.g2.i(new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(dVar, new MavericksViewModel$assertOneActiveSubscription$1(this, i0Var, pVar, mavericksViewModel$assertOneActiveSubscription$observer$1, (m0.l.c) null)), new MavericksViewModel$resolveSubscription$flow$1(obj, (m0.l.c) null));
                i.e(iVar, "$this$flowWhenStarted");
                i.e(pVar, "owner");
                dVar = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(a.f1(new s(new MavericksLifecycleAwareFlowKt$flowWhenStarted$1(iVar, pVar, (m0.l.c) null))), new MavericksViewModel$resolveSubscription$flow$2(this, deliveryMode, (m0.l.c) null));
            } else {
                i.e(dVar, "$this$flowWhenStarted");
                i.e(pVar, "owner");
                dVar = new s<>(new MavericksLifecycleAwareFlowKt$flowWhenStarted$1(dVar, pVar, (m0.l.c) null));
            }
        }
        return a.E2(a.T2(pVar != null ? h0.q.q.a(pVar) : this.c, this.a.e), (e) null, CoroutineStart.UNDISPATCHED, new MavericksViewModel$resolveSubscription$1(dVar, pVar2, (m0.l.c) null), 1, (Object) null);
    }

    public final void m(m0.n.a.l<? super S, ? extends S> lVar) {
        i.e(lVar, "reducer");
        if (this.b.a) {
            this.d.c(new MavericksViewModel$setState$1(this, lVar));
        } else {
            this.d.c(lVar);
        }
    }

    public final void n(m0.n.a.l<? super S, m0.i> lVar) {
        i.e(lVar, "action");
        this.d.b(lVar);
    }

    public String toString() {
        return getClass().getSimpleName() + ' ' + g();
    }
}
