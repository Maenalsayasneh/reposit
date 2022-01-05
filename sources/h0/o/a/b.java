package h0.o.a;

import android.content.Context;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.SpecialEffectsController;
import h0.f.g;
import h0.i.i.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultSpecialEffectsController */
public class b extends SpecialEffectsController {

    /* compiled from: DefaultSpecialEffectsController */
    public class a implements Runnable {
        public final /* synthetic */ List c;
        public final /* synthetic */ SpecialEffectsController.Operation d;

        public a(List list, SpecialEffectsController.Operation operation) {
            this.c = list;
            this.d = operation;
        }

        public void run() {
            if (this.c.contains(this.d)) {
                this.c.remove(this.d);
                b bVar = b.this;
                SpecialEffectsController.Operation operation = this.d;
                Objects.requireNonNull(bVar);
                operation.a.applyState(operation.c.mView);
            }
        }
    }

    /* renamed from: h0.o.a.b$b  reason: collision with other inner class name */
    /* compiled from: DefaultSpecialEffectsController */
    public static class C0060b extends c {
        public boolean c;
        public boolean d = false;
        public o e;

        public C0060b(SpecialEffectsController.Operation operation, h0.i.e.a aVar, boolean z) {
            super(operation, aVar);
            this.c = z;
        }

        public o c(Context context) {
            if (this.d) {
                return this.e;
            }
            SpecialEffectsController.Operation operation = this.a;
            o b0 = g0.a.b.b.a.b0(context, operation.c, operation.a == SpecialEffectsController.Operation.State.VISIBLE, this.c);
            this.e = b0;
            this.d = true;
            return b0;
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    public static class c {
        public final SpecialEffectsController.Operation a;
        public final h0.i.e.a b;

        public c(SpecialEffectsController.Operation operation, h0.i.e.a aVar) {
            this.a = operation;
            this.b = aVar;
        }

        public void a() {
            SpecialEffectsController.Operation operation = this.a;
            if (operation.e.remove(this.b) && operation.e.isEmpty()) {
                operation.b();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
            r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean b() {
            /*
                r3 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r3.a
                androidx.fragment.app.Fragment r0 = r0.c
                android.view.View r0 = r0.mView
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.from((android.view.View) r0)
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r3.a
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r1.a
                if (r0 == r1) goto L_0x0019
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                if (r0 == r2) goto L_0x0017
                if (r1 == r2) goto L_0x0017
                goto L_0x0019
            L_0x0017:
                r0 = 0
                goto L_0x001a
            L_0x0019:
                r0 = 1
            L_0x001a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: h0.o.a.b.c.b():boolean");
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    public static class d extends c {
        public final Object c;
        public final boolean d;
        public final Object e;

        public d(SpecialEffectsController.Operation operation, h0.i.e.a aVar, boolean z, boolean z2) {
            super(operation, aVar);
            Object obj;
            Object obj2;
            boolean z3;
            if (operation.a == SpecialEffectsController.Operation.State.VISIBLE) {
                if (z) {
                    obj2 = operation.c.getReenterTransition();
                } else {
                    obj2 = operation.c.getEnterTransition();
                }
                this.c = obj2;
                if (z) {
                    z3 = operation.c.getAllowReturnTransitionOverlap();
                } else {
                    z3 = operation.c.getAllowEnterTransitionOverlap();
                }
                this.d = z3;
            } else {
                if (z) {
                    obj = operation.c.getReturnTransition();
                } else {
                    obj = operation.c.getExitTransition();
                }
                this.c = obj;
                this.d = true;
            }
            if (!z2) {
                this.e = null;
            } else if (z) {
                this.e = operation.c.getSharedElementReturnTransition();
            } else {
                this.e = operation.c.getSharedElementEnterTransition();
            }
        }

        public final l0 c(Object obj) {
            if (obj == null) {
                return null;
            }
            l0 l0Var = j0.b;
            if (obj instanceof Transition) {
                return l0Var;
            }
            l0 l0Var2 = j0.c;
            if (l0Var2 != null && l0Var2.e(obj)) {
                return l0Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.a.c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public b(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX WARNING: Removed duplicated region for block: B:191:0x05fb  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x06a8  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0740 A[LOOP:13: B:234:0x073a->B:236:0x0740, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r34, boolean r35) {
        /*
            r33 = this;
            r7 = r33
            r6 = r35
            java.util.Iterator r0 = r34.iterator()
            r1 = 0
            r2 = 0
            r8 = r1
            r9 = r2
        L_0x000c:
            boolean r1 = r0.hasNext()
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0040
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            androidx.fragment.app.Fragment r4 = r1.c
            android.view.View r4 = r4.mView
            androidx.fragment.app.SpecialEffectsController$Operation$State r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.from((android.view.View) r4)
            androidx.fragment.app.SpecialEffectsController$Operation$State r5 = r1.a
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x0038
            if (r5 == r3) goto L_0x0032
            if (r5 == r2) goto L_0x0038
            r2 = 3
            if (r5 == r2) goto L_0x0038
            goto L_0x000c
        L_0x0032:
            androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r4 == r2) goto L_0x000c
            r9 = r1
            goto L_0x000c
        L_0x0038:
            androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r4 != r2) goto L_0x000c
            if (r8 != 0) goto L_0x000c
            r8 = r1
            goto L_0x000c
        L_0x0040:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r0 = r34
            r12.<init>(r0)
            java.util.Iterator r0 = r34.iterator()
        L_0x0055:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a0
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            h0.i.e.a r2 = new h0.i.e.a
            r2.<init>()
            r1.d()
            java.util.HashSet<h0.i.e.a> r4 = r1.e
            r4.add(r2)
            h0.o.a.b$b r4 = new h0.o.a.b$b
            r4.<init>(r1, r2, r6)
            r10.add(r4)
            h0.i.e.a r2 = new h0.i.e.a
            r2.<init>()
            r1.d()
            java.util.HashSet<h0.i.e.a> r4 = r1.e
            r4.add(r2)
            h0.o.a.b$d r4 = new h0.o.a.b$d
            if (r6 == 0) goto L_0x008a
            if (r1 != r8) goto L_0x008e
            goto L_0x008c
        L_0x008a:
            if (r1 != r9) goto L_0x008e
        L_0x008c:
            r5 = r3
            goto L_0x008f
        L_0x008e:
            r5 = 0
        L_0x008f:
            r4.<init>(r1, r2, r6, r5)
            r11.add(r4)
            h0.o.a.b$a r2 = new h0.o.a.b$a
            r2.<init>(r12, r1)
            java.util.List<java.lang.Runnable> r1 = r1.d
            r1.add(r2)
            goto L_0x0055
        L_0x00a0:
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.util.Iterator r0 = r11.iterator()
            r1 = 0
            r15 = r1
        L_0x00ab:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x012b
            java.lang.Object r1 = r0.next()
            h0.o.a.b$d r1 = (h0.o.a.b.d) r1
            boolean r2 = r1.b()
            if (r2 == 0) goto L_0x00be
            goto L_0x00ab
        L_0x00be:
            java.lang.Object r2 = r1.c
            h0.o.a.l0 r2 = r1.c(r2)
            java.lang.Object r3 = r1.e
            h0.o.a.l0 r3 = r1.c(r3)
            java.lang.String r4 = " returned Transition "
            java.lang.String r5 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            if (r2 == 0) goto L_0x00fc
            if (r3 == 0) goto L_0x00fc
            if (r2 != r3) goto L_0x00d5
            goto L_0x00fc
        L_0x00d5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r5)
            androidx.fragment.app.SpecialEffectsController$Operation r3 = r1.a
            androidx.fragment.app.Fragment r3 = r3.c
            r2.append(r3)
            r2.append(r4)
            java.lang.Object r3 = r1.c
            r2.append(r3)
            java.lang.String r3 = " which uses a different Transition  type than its shared element transition "
            r2.append(r3)
            java.lang.Object r1 = r1.e
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x00fc:
            if (r2 == 0) goto L_0x00ff
            goto L_0x0100
        L_0x00ff:
            r2 = r3
        L_0x0100:
            if (r15 != 0) goto L_0x0104
            r15 = r2
            goto L_0x00ab
        L_0x0104:
            if (r2 == 0) goto L_0x00ab
            if (r15 != r2) goto L_0x0109
            goto L_0x00ab
        L_0x0109:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r5)
            androidx.fragment.app.SpecialEffectsController$Operation r3 = r1.a
            androidx.fragment.app.Fragment r3 = r3.c
            r2.append(r3)
            r2.append(r4)
            java.lang.Object r1 = r1.c
            r2.append(r1)
            java.lang.String r1 = " which uses a different Transition  type than other Fragments."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x012b:
            java.lang.String r14 = "FragmentManager"
            if (r15 != 0) goto L_0x0152
            java.util.Iterator r0 = r11.iterator()
        L_0x0133:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x014a
            java.lang.Object r1 = r0.next()
            h0.o.a.b$d r1 = (h0.o.a.b.d) r1
            androidx.fragment.app.SpecialEffectsController$Operation r2 = r1.a
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r13.put(r2, r3)
            r1.a()
            goto L_0x0133
        L_0x014a:
            r23 = r10
            r26 = r12
            r12 = r13
            r11 = r14
            goto L_0x05b8
        L_0x0152:
            android.view.View r5 = new android.view.View
            android.view.ViewGroup r0 = r7.a
            android.content.Context r0 = r0.getContext()
            r5.<init>(r0)
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            h0.f.a r1 = new h0.f.a
            r1.<init>()
            java.util.Iterator r22 = r11.iterator()
            r0 = 0
            r16 = 0
            r17 = 0
            r34 = r4
            r4 = r8
            r23 = r10
            r10 = r16
            r24 = r17
            r16 = r5
            r5 = r9
        L_0x0186:
            boolean r17 = r22.hasNext()
            if (r17 == 0) goto L_0x03f2
            java.lang.Object r17 = r22.next()
            r18 = r14
            r14 = r17
            h0.o.a.b$d r14 = (h0.o.a.b.d) r14
            java.lang.Object r14 = r14.e
            if (r14 == 0) goto L_0x019d
            r17 = 1
            goto L_0x019f
        L_0x019d:
            r17 = 0
        L_0x019f:
            if (r17 == 0) goto L_0x03c1
            if (r4 == 0) goto L_0x03c1
            if (r5 == 0) goto L_0x03c1
            java.lang.Object r0 = r15.g(r14)
            java.lang.Object r14 = r15.y(r0)
            androidx.fragment.app.Fragment r0 = r5.c
            java.util.ArrayList r0 = r0.getSharedElementSourceNames()
            r25 = r10
            androidx.fragment.app.Fragment r10 = r4.c
            java.util.ArrayList r10 = r10.getSharedElementSourceNames()
            r26 = r12
            androidx.fragment.app.Fragment r12 = r4.c
            java.util.ArrayList r12 = r12.getSharedElementTargetNames()
            r17 = 0
            r27 = r11
            r28 = r13
            r11 = r17
        L_0x01cb:
            int r13 = r12.size()
            if (r11 >= r13) goto L_0x01ea
            java.lang.Object r13 = r12.get(r11)
            int r13 = r0.indexOf(r13)
            r17 = r12
            r12 = -1
            if (r13 == r12) goto L_0x01e5
            java.lang.Object r12 = r10.get(r11)
            r0.set(r13, r12)
        L_0x01e5:
            int r11 = r11 + 1
            r12 = r17
            goto L_0x01cb
        L_0x01ea:
            androidx.fragment.app.Fragment r10 = r5.c
            java.util.ArrayList r10 = r10.getSharedElementTargetNames()
            if (r6 != 0) goto L_0x01ff
            androidx.fragment.app.Fragment r11 = r4.c
            androidx.core.app.SharedElementCallback r11 = r11.getExitTransitionCallback()
            androidx.fragment.app.Fragment r12 = r5.c
            androidx.core.app.SharedElementCallback r12 = r12.getEnterTransitionCallback()
            goto L_0x020b
        L_0x01ff:
            androidx.fragment.app.Fragment r11 = r4.c
            androidx.core.app.SharedElementCallback r11 = r11.getEnterTransitionCallback()
            androidx.fragment.app.Fragment r12 = r5.c
            androidx.core.app.SharedElementCallback r12 = r12.getExitTransitionCallback()
        L_0x020b:
            int r13 = r0.size()
            r17 = 0
            r19 = r14
            r14 = r17
        L_0x0215:
            if (r14 >= r13) goto L_0x0235
            java.lang.Object r17 = r0.get(r14)
            r20 = r13
            r13 = r17
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r17 = r10.get(r14)
            r21 = r15
            r15 = r17
            java.lang.String r15 = (java.lang.String) r15
            r1.put(r13, r15)
            int r14 = r14 + 1
            r13 = r20
            r15 = r21
            goto L_0x0215
        L_0x0235:
            r21 = r15
            h0.f.a r13 = new h0.f.a
            r13.<init>()
            androidx.fragment.app.Fragment r14 = r4.c
            android.view.View r14 = r14.mView
            r7.k(r13, r14)
            h0.f.g.k(r13, r0)
            if (r11 == 0) goto L_0x028a
            r11.onMapSharedElements(r0, r13)
            int r11 = r0.size()
            int r11 = r11 + -1
        L_0x0251:
            if (r11 < 0) goto L_0x0287
            java.lang.Object r14 = r0.get(r11)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r13.get(r14)
            android.view.View r15 = (android.view.View) r15
            if (r15 != 0) goto L_0x0267
            r1.remove(r14)
            r20 = r0
            goto L_0x0282
        L_0x0267:
            java.util.concurrent.atomic.AtomicInteger r17 = h0.i.i.q.a
            r20 = r0
            java.lang.String r0 = r15.getTransitionName()
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0282
            java.lang.Object r0 = r1.remove(r14)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r14 = r15.getTransitionName()
            r1.put(r14, r0)
        L_0x0282:
            int r11 = r11 + -1
            r0 = r20
            goto L_0x0251
        L_0x0287:
            r20 = r0
            goto L_0x0293
        L_0x028a:
            r20 = r0
            java.util.Set r0 = r13.keySet()
            h0.f.g.k(r1, r0)
        L_0x0293:
            h0.f.a r11 = new h0.f.a
            r11.<init>()
            androidx.fragment.app.Fragment r0 = r5.c
            android.view.View r0 = r0.mView
            r7.k(r11, r0)
            h0.f.g.k(r11, r10)
            java.util.Collection r0 = r1.values()
            h0.f.g.k(r11, r0)
            if (r12 == 0) goto L_0x02ea
            r12.onMapSharedElements(r10, r11)
            int r0 = r10.size()
            int r0 = r0 + -1
        L_0x02b4:
            if (r0 < 0) goto L_0x02ed
            java.lang.Object r12 = r10.get(r0)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r14 = r11.get(r12)
            android.view.View r14 = (android.view.View) r14
            if (r14 != 0) goto L_0x02ce
            java.lang.String r12 = h0.o.a.j0.i(r1, r12)
            if (r12 == 0) goto L_0x02e7
            r1.remove(r12)
            goto L_0x02e7
        L_0x02ce:
            java.util.concurrent.atomic.AtomicInteger r15 = h0.i.i.q.a
            java.lang.String r15 = r14.getTransitionName()
            boolean r15 = r12.equals(r15)
            if (r15 != 0) goto L_0x02e7
            java.lang.String r12 = h0.o.a.j0.i(r1, r12)
            if (r12 == 0) goto L_0x02e7
            java.lang.String r14 = r14.getTransitionName()
            r1.put(r12, r14)
        L_0x02e7:
            int r0 = r0 + -1
            goto L_0x02b4
        L_0x02ea:
            h0.o.a.j0.o(r1, r11)
        L_0x02ed:
            java.util.Set r0 = r1.keySet()
            r7.l(r13, r0)
            java.util.Collection r0 = r1.values()
            r7.l(r11, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x031a
            r3.clear()
            r2.clear()
            r0 = 0
            r6 = r34
            r29 = r1
            r11 = r3
            r13 = r8
            r15 = r9
            r8 = r16
            r10 = r18
            r12 = r28
            r9 = r2
            r2 = r21
            goto L_0x03d8
        L_0x031a:
            androidx.fragment.app.Fragment r0 = r5.c
            androidx.fragment.app.Fragment r4 = r4.c
            r5 = 1
            h0.o.a.j0.c(r0, r4, r6, r13, r5)
            android.view.ViewGroup r12 = r7.a
            h0.o.a.g r14 = new h0.o.a.g
            r5 = r20
            r0 = r14
            r29 = r1
            r1 = r33
            r4 = r2
            r2 = r9
            r15 = r3
            r3 = r8
            r6 = r34
            r30 = r9
            r9 = r4
            r4 = r35
            r31 = r8
            r8 = r16
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            h0.i.i.p.a(r12, r14)
            java.util.Collection r0 = r13.values()
            r15.addAll(r0)
            boolean r0 = r20.isEmpty()
            if (r0 != 0) goto L_0x0367
            r0 = r20
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r13.get(r0)
            android.view.View r0 = (android.view.View) r0
            r3 = r19
            r2 = r21
            r2.t(r3, r0)
            goto L_0x036e
        L_0x0367:
            r3 = r19
            r2 = r21
            r1 = 0
            r0 = r25
        L_0x036e:
            java.util.Collection r4 = r11.values()
            r9.addAll(r4)
            boolean r4 = r10.isEmpty()
            if (r4 != 0) goto L_0x0395
            java.lang.Object r1 = r10.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.get(r1)
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x0395
            android.view.ViewGroup r4 = r7.a
            h0.o.a.h r5 = new h0.o.a.h
            r5.<init>(r7, r2, r1, r6)
            h0.i.i.p.a(r4, r5)
            r24 = 1
        L_0x0395:
            r2.w(r3, r8, r15)
            r16 = 0
            r17 = 0
            r1 = 0
            r19 = 0
            r10 = r18
            r14 = r2
            r11 = r15
            r15 = r3
            r18 = r1
            r20 = r3
            r21 = r9
            r14.r(r15, r16, r17, r18, r19, r20, r21)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r12 = r28
            r13 = r31
            r12.put(r13, r1)
            r15 = r30
            r12.put(r15, r1)
            r25 = r0
            r0 = r3
            r4 = r13
            r5 = r15
            goto L_0x03d8
        L_0x03c1:
            r6 = r34
            r29 = r1
            r25 = r10
            r27 = r11
            r26 = r12
            r12 = r13
            r10 = r18
            r11 = r3
            r13 = r8
            r8 = r16
            r32 = r9
            r9 = r2
            r2 = r15
            r15 = r32
        L_0x03d8:
            r34 = r6
            r16 = r8
            r14 = r10
            r3 = r11
            r8 = r13
            r10 = r25
            r11 = r27
            r1 = r29
            r6 = r35
            r13 = r12
            r12 = r26
            r32 = r15
            r15 = r2
            r2 = r9
            r9 = r32
            goto L_0x0186
        L_0x03f2:
            r6 = r34
            r29 = r1
            r25 = r10
            r27 = r11
            r26 = r12
            r12 = r13
            r10 = r14
            r8 = r16
            r11 = r3
            r32 = r9
            r9 = r2
            r2 = r15
            r15 = r32
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r3 = r27.iterator()
            r13 = 0
            r14 = 0
        L_0x0412:
            boolean r16 = r3.hasNext()
            if (r16 == 0) goto L_0x052e
            java.lang.Object r16 = r3.next()
            r34 = r3
            r3 = r16
            h0.o.a.b$d r3 = (h0.o.a.b.d) r3
            boolean r16 = r3.b()
            if (r16 == 0) goto L_0x0446
            r35 = r14
            androidx.fragment.app.SpecialEffectsController$Operation r14 = r3.a
            r30 = r15
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
            r12.put(r14, r15)
            r3.a()
            r14 = r35
            r28 = r0
            r31 = r8
            r22 = r10
            r20 = r11
            r10 = r25
            r8 = r30
            goto L_0x051f
        L_0x0446:
            r35 = r14
            r30 = r15
            java.lang.Object r14 = r3.c
            java.lang.Object r15 = r2.g(r14)
            androidx.fragment.app.SpecialEffectsController$Operation r14 = r3.a
            if (r0 == 0) goto L_0x045a
            if (r14 == r4) goto L_0x0458
            if (r14 != r5) goto L_0x045a
        L_0x0458:
            r5 = 1
            goto L_0x045b
        L_0x045a:
            r5 = 0
        L_0x045b:
            if (r15 != 0) goto L_0x0477
            if (r5 != 0) goto L_0x0467
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r12.put(r14, r5)
            r3.a()
        L_0x0467:
            r14 = r35
            r28 = r0
            r31 = r8
            r22 = r10
            r20 = r11
            r10 = r25
            r8 = r30
            goto L_0x051e
        L_0x0477:
            r22 = r10
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r28 = r0
            androidx.fragment.app.Fragment r0 = r14.c
            android.view.View r0 = r0.mView
            r7.j(r10, r0)
            if (r5 == 0) goto L_0x0492
            if (r14 != r4) goto L_0x048f
            r10.removeAll(r11)
            goto L_0x0492
        L_0x048f:
            r10.removeAll(r9)
        L_0x0492:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x04a6
            r2.a(r15, r8)
            r0 = r35
            r31 = r8
            r20 = r11
            r5 = r14
            r11 = r15
            r8 = r30
            goto L_0x04f3
        L_0x04a6:
            r2.b(r15, r10)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r0 = r35
            r5 = r14
            r14 = r2
            r31 = r8
            r35 = r15
            r8 = r30
            r16 = r35
            r17 = r10
            r14.r(r15, r16, r17, r18, r19, r20, r21)
            androidx.fragment.app.SpecialEffectsController$Operation$State r14 = r5.a
            androidx.fragment.app.SpecialEffectsController$Operation$State r15 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            if (r14 != r15) goto L_0x04ef
            r15 = r26
            r15.remove(r5)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r10)
            androidx.fragment.app.Fragment r15 = r5.c
            android.view.View r15 = r15.mView
            r14.remove(r15)
            androidx.fragment.app.Fragment r15 = r5.c
            android.view.View r15 = r15.mView
            r20 = r11
            r11 = r35
            r2.q(r11, r15, r14)
            android.view.ViewGroup r14 = r7.a
            h0.o.a.i r15 = new h0.o.a.i
            r15.<init>(r7, r10)
            h0.i.i.p.a(r14, r15)
            goto L_0x04f3
        L_0x04ef:
            r20 = r11
            r11 = r35
        L_0x04f3:
            androidx.fragment.app.SpecialEffectsController$Operation$State r14 = r5.a
            androidx.fragment.app.SpecialEffectsController$Operation$State r15 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r14 != r15) goto L_0x0504
            r1.addAll(r10)
            if (r24 == 0) goto L_0x0501
            r2.s(r11, r6)
        L_0x0501:
            r10 = r25
            goto L_0x0509
        L_0x0504:
            r10 = r25
            r2.t(r11, r10)
        L_0x0509:
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            r12.put(r5, r14)
            boolean r3 = r3.d
            if (r3 == 0) goto L_0x0518
            r3 = 0
            java.lang.Object r14 = r2.m(r0, r11, r3)
            goto L_0x051e
        L_0x0518:
            r3 = 0
            java.lang.Object r13 = r2.m(r13, r11, r3)
            r14 = r0
        L_0x051e:
            r5 = r8
        L_0x051f:
            r3 = r34
            r15 = r8
            r25 = r10
            r11 = r20
            r10 = r22
            r0 = r28
            r8 = r31
            goto L_0x0412
        L_0x052e:
            r3 = r0
            r22 = r10
            r20 = r11
            r0 = r14
            r8 = r15
            java.lang.Object r0 = r2.l(r0, r13, r3)
            java.util.Iterator r5 = r27.iterator()
        L_0x053d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x05ac
            java.lang.Object r6 = r5.next()
            h0.o.a.b$d r6 = (h0.o.a.b.d) r6
            boolean r10 = r6.b()
            if (r10 == 0) goto L_0x0550
            goto L_0x053d
        L_0x0550:
            java.lang.Object r10 = r6.c
            androidx.fragment.app.SpecialEffectsController$Operation r11 = r6.a
            if (r3 == 0) goto L_0x055c
            if (r11 == r4) goto L_0x055a
            if (r11 != r8) goto L_0x055c
        L_0x055a:
            r13 = 1
            goto L_0x055d
        L_0x055c:
            r13 = 0
        L_0x055d:
            if (r10 != 0) goto L_0x0565
            if (r13 == 0) goto L_0x0562
            goto L_0x0565
        L_0x0562:
            r11 = r22
            goto L_0x05a9
        L_0x0565:
            android.view.ViewGroup r10 = r7.a
            java.util.concurrent.atomic.AtomicInteger r13 = h0.i.i.q.a
            boolean r10 = r10.isLaidOut()
            if (r10 != 0) goto L_0x0599
            r10 = 2
            boolean r10 = androidx.fragment.app.FragmentManager.R(r10)
            if (r10 == 0) goto L_0x0593
            java.lang.String r10 = "SpecialEffectsController: Container "
            java.lang.StringBuilder r10 = i0.d.a.a.a.P0(r10)
            android.view.ViewGroup r13 = r7.a
            r10.append(r13)
            java.lang.String r13 = " has not been laid out. Completing operation "
            r10.append(r13)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r11 = r22
            android.util.Log.v(r11, r10)
            goto L_0x0595
        L_0x0593:
            r11 = r22
        L_0x0595:
            r6.a()
            goto L_0x05a9
        L_0x0599:
            r11 = r22
            androidx.fragment.app.SpecialEffectsController$Operation r10 = r6.a
            androidx.fragment.app.Fragment r10 = r10.c
            h0.i.e.a r13 = r6.b
            h0.o.a.j r14 = new h0.o.a.j
            r14.<init>(r7, r6)
            r2.u(r10, r0, r13, r14)
        L_0x05a9:
            r22 = r11
            goto L_0x053d
        L_0x05ac:
            r11 = r22
            android.view.ViewGroup r4 = r7.a
            java.util.concurrent.atomic.AtomicInteger r5 = h0.i.i.q.a
            boolean r4 = r4.isLaidOut()
            if (r4 != 0) goto L_0x05bc
        L_0x05b8:
            r0 = 0
            r8 = r26
            goto L_0x05e0
        L_0x05bc:
            r4 = 4
            h0.o.a.j0.q(r1, r4)
            java.util.ArrayList r18 = r2.n(r9)
            android.view.ViewGroup r4 = r7.a
            r2.c(r4, r0)
            android.view.ViewGroup r15 = r7.a
            r14 = r2
            r8 = r26
            r16 = r20
            r17 = r9
            r19 = r29
            r14.v(r15, r16, r17, r18, r19)
            r0 = 0
            h0.o.a.j0.q(r1, r0)
            r1 = r20
            r2.x(r3, r1, r9)
        L_0x05e0:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r9 = r12.containsValue(r1)
            android.view.ViewGroup r10 = r7.a
            android.content.Context r13 = r10.getContext()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r15 = r23.iterator()
        L_0x05f5:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x069e
            java.lang.Object r1 = r15.next()
            r6 = r1
            h0.o.a.b$b r6 = (h0.o.a.b.C0060b) r6
            boolean r1 = r6.b()
            if (r1 == 0) goto L_0x060c
            r6.a()
            goto L_0x05f5
        L_0x060c:
            h0.o.a.o r1 = r6.c(r13)
            if (r1 != 0) goto L_0x0616
            r6.a()
            goto L_0x05f5
        L_0x0616:
            android.animation.Animator r5 = r1.b
            if (r5 != 0) goto L_0x061e
            r14.add(r6)
            goto L_0x05f5
        L_0x061e:
            androidx.fragment.app.SpecialEffectsController$Operation r4 = r6.a
            androidx.fragment.app.Fragment r1 = r4.c
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Object r3 = r12.get(r4)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0652
            r2 = 2
            boolean r2 = androidx.fragment.app.FragmentManager.R(r2)
            if (r2 == 0) goto L_0x064e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Ignoring Animator set on "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " as this Fragment was involved in a Transition."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.v(r11, r1)
        L_0x064e:
            r6.a()
            goto L_0x05f5
        L_0x0652:
            androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r4.a
            androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            if (r0 != r2) goto L_0x065a
            r0 = 1
            goto L_0x065b
        L_0x065a:
            r0 = 0
        L_0x065b:
            r16 = r0
            if (r16 == 0) goto L_0x0662
            r8.remove(r4)
        L_0x0662:
            android.view.View r3 = r1.mView
            r10.startViewTransition(r3)
            h0.o.a.c r2 = new h0.o.a.c
            r0 = r2
            r1 = r33
            r28 = r12
            r12 = r2
            r2 = r10
            r34 = r3
            r17 = r4
            r4 = r16
            r35 = r15
            r15 = r5
            r5 = r17
            r16 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r15.addListener(r12)
            r0 = r34
            r15.setTarget(r0)
            r15.start()
            r1 = r16
            h0.i.e.a r0 = r1.b
            h0.o.a.d r1 = new h0.o.a.d
            r1.<init>(r7, r15)
            r0.b(r1)
            r0 = 1
            r15 = r35
            r12 = r28
            goto L_0x05f5
        L_0x069e:
            java.util.Iterator r1 = r14.iterator()
        L_0x06a2:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0736
            java.lang.Object r2 = r1.next()
            h0.o.a.b$b r2 = (h0.o.a.b.C0060b) r2
            androidx.fragment.app.SpecialEffectsController$Operation r3 = r2.a
            androidx.fragment.app.Fragment r4 = r3.c
            java.lang.String r5 = "Ignoring Animation set on "
            if (r9 == 0) goto L_0x06d8
            r3 = 2
            boolean r3 = androidx.fragment.app.FragmentManager.R(r3)
            if (r3 == 0) goto L_0x06d4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r4)
            java.lang.String r4 = " as Animations cannot run alongside Transitions."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r11, r3)
        L_0x06d4:
            r2.a()
            goto L_0x06a2
        L_0x06d8:
            if (r0 == 0) goto L_0x06fc
            r3 = 2
            boolean r3 = androidx.fragment.app.FragmentManager.R(r3)
            if (r3 == 0) goto L_0x06f8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r4)
            java.lang.String r4 = " as Animations cannot run alongside Animators."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r11, r3)
        L_0x06f8:
            r2.a()
            goto L_0x06a2
        L_0x06fc:
            android.view.View r4 = r4.mView
            h0.o.a.o r5 = r2.c(r13)
            java.util.Objects.requireNonNull(r5)
            android.view.animation.Animation r5 = r5.a
            java.util.Objects.requireNonNull(r5)
            androidx.fragment.app.SpecialEffectsController$Operation$State r3 = r3.a
            androidx.fragment.app.SpecialEffectsController$Operation$State r6 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
            if (r3 == r6) goto L_0x0717
            r4.startAnimation(r5)
            r2.a()
            goto L_0x072a
        L_0x0717:
            r10.startViewTransition(r4)
            h0.o.a.p r3 = new h0.o.a.p
            r3.<init>(r5, r10, r4)
            h0.o.a.e r5 = new h0.o.a.e
            r5.<init>(r7, r10, r4, r2)
            r3.setAnimationListener(r5)
            r4.startAnimation(r3)
        L_0x072a:
            h0.i.e.a r3 = r2.b
            h0.o.a.f r5 = new h0.o.a.f
            r5.<init>(r7, r4, r10, r2)
            r3.b(r5)
            goto L_0x06a2
        L_0x0736:
            java.util.Iterator r0 = r8.iterator()
        L_0x073a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0750
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            androidx.fragment.app.Fragment r2 = r1.c
            android.view.View r2 = r2.mView
            androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r1.a
            r1.applyState(r2)
            goto L_0x073a
        L_0x0750:
            r8.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.o.a.b.b(java.util.List, boolean):void");
    }

    public void j(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!viewGroup.isTransitionGroup()) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        j(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public void k(Map<String, View> map, View view) {
        AtomicInteger atomicInteger = q.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    k(map, childAt);
                }
            }
        }
    }

    public void l(h0.f.a<String, View> aVar, Collection<String> collection) {
        Iterator it = ((g.b) aVar.entrySet()).iterator();
        while (true) {
            g.d dVar = (g.d) it;
            if (dVar.hasNext()) {
                dVar.next();
                AtomicInteger atomicInteger = q.a;
                if (!collection.contains(((View) dVar.getValue()).getTransitionName())) {
                    dVar.remove();
                }
            } else {
                return;
            }
        }
    }
}
