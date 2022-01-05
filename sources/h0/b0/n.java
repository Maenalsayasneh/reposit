package h0.b0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.transition.R;
import h0.i.i.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: TransitionManager */
public class n {
    public static j a = new a();
    public static ThreadLocal<WeakReference<h0.f.a<ViewGroup, ArrayList<j>>>> b = new ThreadLocal<>();
    public static ArrayList<ViewGroup> c = new ArrayList<>();

    /* compiled from: TransitionManager */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public j c;
        public ViewGroup d;

        /* renamed from: h0.b0.n$a$a  reason: collision with other inner class name */
        /* compiled from: TransitionManager */
        public class C0024a extends m {
            public final /* synthetic */ h0.f.a a;

            public C0024a(h0.f.a aVar) {
                this.a = aVar;
            }

            public void c(j jVar) {
                ((ArrayList) this.a.get(a.this.d)).remove(jVar);
                jVar.y(this);
            }
        }

        public a(j jVar, ViewGroup viewGroup) {
            this.c = jVar;
            this.d = viewGroup;
        }

        /* JADX WARNING: Removed duplicated region for block: B:104:0x0242  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:133:0x01ef A[EDGE_INSN: B:133:0x01ef->B:88:0x01ef ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x01f4  */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x0215  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onPreDraw() {
            /*
                r19 = this;
                r0 = r19
                android.view.ViewGroup r1 = r0.d
                android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                r1.removeOnPreDrawListener(r0)
                android.view.ViewGroup r1 = r0.d
                r1.removeOnAttachStateChangeListener(r0)
                java.util.ArrayList<android.view.ViewGroup> r1 = h0.b0.n.c
                android.view.ViewGroup r2 = r0.d
                boolean r1 = r1.remove(r2)
                r2 = 1
                if (r1 != 0) goto L_0x001c
                return r2
            L_0x001c:
                h0.f.a r1 = h0.b0.n.b()
                android.view.ViewGroup r3 = r0.d
                java.lang.Object r3 = r1.get(r3)
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                r4 = 0
                if (r3 != 0) goto L_0x0036
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                android.view.ViewGroup r5 = r0.d
                r1.put(r5, r3)
                goto L_0x0042
            L_0x0036:
                int r5 = r3.size()
                if (r5 <= 0) goto L_0x0042
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r3)
                goto L_0x0043
            L_0x0042:
                r5 = r4
            L_0x0043:
                h0.b0.j r6 = r0.c
                r3.add(r6)
                h0.b0.j r3 = r0.c
                h0.b0.n$a$a r6 = new h0.b0.n$a$a
                r6.<init>(r1)
                r3.b(r6)
                h0.b0.j r1 = r0.c
                android.view.ViewGroup r3 = r0.d
                r6 = 0
                r1.j(r3, r6)
                if (r5 == 0) goto L_0x0072
                java.util.Iterator r1 = r5.iterator()
            L_0x0060:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0072
                java.lang.Object r3 = r1.next()
                h0.b0.j r3 = (h0.b0.j) r3
                android.view.ViewGroup r5 = r0.d
                r3.A(r5)
                goto L_0x0060
            L_0x0072:
                h0.b0.j r1 = r0.c
                android.view.ViewGroup r8 = r0.d
                java.util.Objects.requireNonNull(r1)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.h2 = r3
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.i2 = r3
                h0.b0.s r3 = r1.d2
                h0.b0.s r5 = r1.e2
                h0.f.a r7 = new h0.f.a
                h0.f.a<android.view.View, h0.b0.r> r9 = r3.a
                r7.<init>((h0.f.h) r9)
                h0.f.a r9 = new h0.f.a
                h0.f.a<android.view.View, h0.b0.r> r10 = r5.a
                r9.<init>((h0.f.h) r10)
                r10 = r6
            L_0x009a:
                int[] r11 = r1.g2
                int r12 = r11.length
                if (r10 >= r12) goto L_0x01ef
                r11 = r11[r10]
                if (r11 == r2) goto L_0x01af
                r12 = 2
                if (r11 == r12) goto L_0x0161
                r12 = 3
                if (r11 == r12) goto L_0x010d
                r12 = 4
                if (r11 == r12) goto L_0x00af
            L_0x00ac:
                r17 = r3
                goto L_0x0109
            L_0x00af:
                h0.f.e<android.view.View> r11 = r3.c
                h0.f.e<android.view.View> r12 = r5.c
                int r13 = r11.r()
                r14 = r6
            L_0x00b8:
                if (r14 >= r13) goto L_0x00ac
                java.lang.Object r15 = r11.s(r14)
                android.view.View r15 = (android.view.View) r15
                if (r15 == 0) goto L_0x00ff
                boolean r16 = r1.v(r15)
                if (r16 == 0) goto L_0x00ff
                r17 = r3
                long r2 = r11.m(r14)
                java.lang.Object r2 = r12.h(r2)
                android.view.View r2 = (android.view.View) r2
                if (r2 == 0) goto L_0x0101
                boolean r3 = r1.v(r2)
                if (r3 == 0) goto L_0x0101
                java.lang.Object r3 = r7.getOrDefault(r15, r4)
                h0.b0.r r3 = (h0.b0.r) r3
                java.lang.Object r18 = r9.getOrDefault(r2, r4)
                r6 = r18
                h0.b0.r r6 = (h0.b0.r) r6
                if (r3 == 0) goto L_0x0101
                if (r6 == 0) goto L_0x0101
                java.util.ArrayList<h0.b0.r> r4 = r1.h2
                r4.add(r3)
                java.util.ArrayList<h0.b0.r> r3 = r1.i2
                r3.add(r6)
                r7.remove(r15)
                r9.remove(r2)
                goto L_0x0101
            L_0x00ff:
                r17 = r3
            L_0x0101:
                int r14 = r14 + 1
                r3 = r17
                r2 = 1
                r4 = 0
                r6 = 0
                goto L_0x00b8
            L_0x0109:
                r2 = r17
                goto L_0x01e5
            L_0x010d:
                r2 = r3
                android.util.SparseArray<android.view.View> r3 = r2.b
                android.util.SparseArray<android.view.View> r4 = r5.b
                int r6 = r3.size()
                r11 = 0
            L_0x0117:
                if (r11 >= r6) goto L_0x01e5
                java.lang.Object r12 = r3.valueAt(r11)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x015c
                boolean r13 = r1.v(r12)
                if (r13 == 0) goto L_0x015c
                int r13 = r3.keyAt(r11)
                java.lang.Object r13 = r4.get(r13)
                android.view.View r13 = (android.view.View) r13
                if (r13 == 0) goto L_0x015c
                boolean r14 = r1.v(r13)
                if (r14 == 0) goto L_0x015c
                r14 = 0
                java.lang.Object r15 = r7.getOrDefault(r12, r14)
                h0.b0.r r15 = (h0.b0.r) r15
                java.lang.Object r17 = r9.getOrDefault(r13, r14)
                r14 = r17
                h0.b0.r r14 = (h0.b0.r) r14
                if (r15 == 0) goto L_0x015c
                if (r14 == 0) goto L_0x015c
                java.util.ArrayList<h0.b0.r> r0 = r1.h2
                r0.add(r15)
                java.util.ArrayList<h0.b0.r> r0 = r1.i2
                r0.add(r14)
                r7.remove(r12)
                r9.remove(r13)
            L_0x015c:
                int r11 = r11 + 1
                r0 = r19
                goto L_0x0117
            L_0x0161:
                r2 = r3
                h0.f.a<java.lang.String, android.view.View> r0 = r2.d
                h0.f.a<java.lang.String, android.view.View> r3 = r5.d
                int r4 = r0.Z1
                r6 = 0
            L_0x0169:
                if (r6 >= r4) goto L_0x01e5
                java.lang.Object r11 = r0.l(r6)
                android.view.View r11 = (android.view.View) r11
                if (r11 == 0) goto L_0x01ac
                boolean r12 = r1.v(r11)
                if (r12 == 0) goto L_0x01ac
                java.lang.Object r12 = r0.i(r6)
                java.lang.Object r12 = r3.get(r12)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x01ac
                boolean r13 = r1.v(r12)
                if (r13 == 0) goto L_0x01ac
                r13 = 0
                java.lang.Object r14 = r7.getOrDefault(r11, r13)
                h0.b0.r r14 = (h0.b0.r) r14
                java.lang.Object r15 = r9.getOrDefault(r12, r13)
                h0.b0.r r15 = (h0.b0.r) r15
                if (r14 == 0) goto L_0x01ac
                if (r15 == 0) goto L_0x01ac
                java.util.ArrayList<h0.b0.r> r13 = r1.h2
                r13.add(r14)
                java.util.ArrayList<h0.b0.r> r13 = r1.i2
                r13.add(r15)
                r7.remove(r11)
                r9.remove(r12)
            L_0x01ac:
                int r6 = r6 + 1
                goto L_0x0169
            L_0x01af:
                r2 = r3
                int r0 = r7.Z1
            L_0x01b2:
                int r0 = r0 + -1
                if (r0 < 0) goto L_0x01e5
                java.lang.Object r3 = r7.i(r0)
                android.view.View r3 = (android.view.View) r3
                if (r3 == 0) goto L_0x01b2
                boolean r4 = r1.v(r3)
                if (r4 == 0) goto L_0x01b2
                java.lang.Object r3 = r9.remove(r3)
                h0.b0.r r3 = (h0.b0.r) r3
                if (r3 == 0) goto L_0x01b2
                android.view.View r4 = r3.b
                boolean r4 = r1.v(r4)
                if (r4 == 0) goto L_0x01b2
                java.lang.Object r4 = r7.j(r0)
                h0.b0.r r4 = (h0.b0.r) r4
                java.util.ArrayList<h0.b0.r> r6 = r1.h2
                r6.add(r4)
                java.util.ArrayList<h0.b0.r> r4 = r1.i2
                r4.add(r3)
                goto L_0x01b2
            L_0x01e5:
                int r10 = r10 + 1
                r0 = r19
                r3 = r2
                r2 = 1
                r4 = 0
                r6 = 0
                goto L_0x009a
            L_0x01ef:
                r0 = 0
            L_0x01f0:
                int r2 = r7.Z1
                if (r0 >= r2) goto L_0x0210
                java.lang.Object r2 = r7.l(r0)
                h0.b0.r r2 = (h0.b0.r) r2
                android.view.View r3 = r2.b
                boolean r3 = r1.v(r3)
                if (r3 == 0) goto L_0x020d
                java.util.ArrayList<h0.b0.r> r3 = r1.h2
                r3.add(r2)
                java.util.ArrayList<h0.b0.r> r2 = r1.i2
                r3 = 0
                r2.add(r3)
            L_0x020d:
                int r0 = r0 + 1
                goto L_0x01f0
            L_0x0210:
                r0 = 0
            L_0x0211:
                int r2 = r9.Z1
                if (r0 >= r2) goto L_0x0231
                java.lang.Object r2 = r9.l(r0)
                h0.b0.r r2 = (h0.b0.r) r2
                android.view.View r3 = r2.b
                boolean r3 = r1.v(r3)
                if (r3 == 0) goto L_0x022e
                java.util.ArrayList<h0.b0.r> r3 = r1.i2
                r3.add(r2)
                java.util.ArrayList<h0.b0.r> r2 = r1.h2
                r3 = 0
                r2.add(r3)
            L_0x022e:
                int r0 = r0 + 1
                goto L_0x0211
            L_0x0231:
                h0.f.a r0 = h0.b0.j.r()
                int r2 = r0.Z1
                h0.b0.c0 r3 = h0.b0.w.a
                h0.b0.f0 r3 = new h0.b0.f0
                r3.<init>(r8)
                r4 = 1
                int r2 = r2 - r4
            L_0x0240:
                if (r2 < 0) goto L_0x02a3
                java.lang.Object r4 = r0.i(r2)
                android.animation.Animator r4 = (android.animation.Animator) r4
                r5 = 0
                if (r4 == 0) goto L_0x02a0
                java.lang.Object r6 = r0.getOrDefault(r4, r5)
                h0.b0.j$b r6 = (h0.b0.j.b) r6
                if (r6 == 0) goto L_0x02a0
                android.view.View r7 = r6.a
                if (r7 == 0) goto L_0x02a0
                h0.b0.g0 r7 = r6.d
                boolean r7 = r3.equals(r7)
                if (r7 == 0) goto L_0x02a0
                h0.b0.r r7 = r6.c
                android.view.View r9 = r6.a
                r10 = 1
                h0.b0.r r11 = r1.t(r9, r10)
                h0.b0.r r12 = r1.q(r9, r10)
                if (r11 != 0) goto L_0x027b
                if (r12 != 0) goto L_0x027b
                h0.b0.s r10 = r1.e2
                h0.f.a<android.view.View, h0.b0.r> r10 = r10.a
                java.lang.Object r9 = r10.get(r9)
                r12 = r9
                h0.b0.r r12 = (h0.b0.r) r12
            L_0x027b:
                if (r11 != 0) goto L_0x027f
                if (r12 == 0) goto L_0x0289
            L_0x027f:
                h0.b0.j r6 = r6.e
                boolean r6 = r6.u(r7, r12)
                if (r6 == 0) goto L_0x0289
                r6 = 1
                goto L_0x028a
            L_0x0289:
                r6 = 0
            L_0x028a:
                if (r6 == 0) goto L_0x02a0
                boolean r6 = r4.isRunning()
                if (r6 != 0) goto L_0x029d
                boolean r6 = r4.isStarted()
                if (r6 == 0) goto L_0x0299
                goto L_0x029d
            L_0x0299:
                r0.remove(r4)
                goto L_0x02a0
            L_0x029d:
                r4.cancel()
            L_0x02a0:
                int r2 = r2 + -1
                goto L_0x0240
            L_0x02a3:
                h0.b0.s r9 = r1.d2
                h0.b0.s r10 = r1.e2
                java.util.ArrayList<h0.b0.r> r11 = r1.h2
                java.util.ArrayList<h0.b0.r> r12 = r1.i2
                r7 = r1
                r7.o(r8, r9, r10, r11, r12)
                r1.B()
                r0 = 1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: h0.b0.n.a.onPreDraw():boolean");
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            this.d.getViewTreeObserver().removeOnPreDrawListener(this);
            this.d.removeOnAttachStateChangeListener(this);
            n.c.remove(this.d);
            ArrayList arrayList = n.b().get(this.d);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((j) it.next()).A(this.d);
                }
            }
            this.c.l(true);
        }
    }

    public static void a(ViewGroup viewGroup, j jVar) {
        if (!c.contains(viewGroup)) {
            AtomicInteger atomicInteger = q.a;
            if (viewGroup.isLaidOut()) {
                c.add(viewGroup);
                if (jVar == null) {
                    jVar = a;
                }
                j m = jVar.clone();
                d(viewGroup, m);
                viewGroup.setTag(R.id.transition_current_scene, (Object) null);
                if (m != null) {
                    a aVar = new a(m, viewGroup);
                    viewGroup.addOnAttachStateChangeListener(aVar);
                    viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                }
            }
        }
    }

    public static h0.f.a<ViewGroup, ArrayList<j>> b() {
        h0.f.a<ViewGroup, ArrayList<j>> aVar;
        WeakReference weakReference = b.get();
        if (weakReference != null && (aVar = (h0.f.a) weakReference.get()) != null) {
            return aVar;
        }
        h0.f.a<ViewGroup, ArrayList<j>> aVar2 = new h0.f.a<>();
        b.set(new WeakReference(aVar2));
        return aVar2;
    }

    public static void c(g gVar, j jVar) {
        ViewGroup viewGroup = gVar.a;
        if (!c.contains(viewGroup)) {
            g.b(viewGroup);
            c.add(viewGroup);
            j m = jVar.clone();
            m.H(viewGroup);
            d(viewGroup, m);
            gVar.a();
            if (viewGroup != null) {
                a aVar = new a(m, viewGroup);
                viewGroup.addOnAttachStateChangeListener(aVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
            }
        }
    }

    public static void d(ViewGroup viewGroup, j jVar) {
        ArrayList orDefault = b().getOrDefault(viewGroup, null);
        if (orDefault != null && orDefault.size() > 0) {
            Iterator it = orDefault.iterator();
            while (it.hasNext()) {
                ((j) it.next()).x(viewGroup);
            }
        }
        if (jVar != null) {
            jVar.j(viewGroup, true);
        }
        g gVar = (g) viewGroup.getTag(R.id.transition_current_scene);
        if (gVar != null) {
            g.b(gVar.a);
        }
    }
}
