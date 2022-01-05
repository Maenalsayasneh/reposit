package h0.b0;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import h0.f.e;
import h0.i.i.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Transition */
public abstract class j implements Cloneable {
    public static final int[] c = {2, 1, 3, 4};
    public static final e d = new a();
    public static ThreadLocal<h0.f.a<Animator, b>> q = new ThreadLocal<>();
    public long Y1 = -1;
    public TimeInterpolator Z1 = null;
    public ArrayList<Integer> a2 = new ArrayList<>();
    public ArrayList<View> b2 = new ArrayList<>();
    public ArrayList<Class<?>> c2 = null;
    public s d2 = new s();
    public s e2 = new s();
    public p f2 = null;
    public int[] g2 = c;
    public ArrayList<r> h2;
    public ArrayList<r> i2;
    public boolean j2 = false;
    public ArrayList<Animator> k2 = new ArrayList<>();
    public int l2 = 0;
    public boolean m2 = false;
    public boolean n2 = false;
    public ArrayList<d> o2 = null;
    public ArrayList<Animator> p2 = new ArrayList<>();
    public o q2;
    public c r2;
    public e s2 = d;
    public String x = getClass().getName();
    public long y = -1;

    /* compiled from: Transition */
    public static class a extends e {
        public Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* compiled from: Transition */
    public static class b {
        public View a;
        public String b;
        public r c;
        public g0 d;
        public j e;

        public b(View view, String str, j jVar, g0 g0Var, r rVar) {
            this.a = view;
            this.b = str;
            this.c = rVar;
            this.d = g0Var;
            this.e = jVar;
        }
    }

    /* compiled from: Transition */
    public static abstract class c {
        public abstract Rect a(j jVar);
    }

    /* compiled from: Transition */
    public interface d {
        void a(j jVar);

        void b(j jVar);

        void c(j jVar);

        void d(j jVar);

        void e(j jVar);
    }

    public static void e(s sVar, View view, r rVar) {
        sVar.a.put(view, rVar);
        int id = view.getId();
        if (id >= 0) {
            if (sVar.b.indexOfKey(id) >= 0) {
                sVar.b.put(id, (Object) null);
            } else {
                sVar.b.put(id, view);
            }
        }
        AtomicInteger atomicInteger = q.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (sVar.d.f(transitionName) >= 0) {
                sVar.d.put(transitionName, null);
            } else {
                sVar.d.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                e<View> eVar = sVar.c;
                if (eVar.d) {
                    eVar.g();
                }
                if (h0.f.d.b(eVar.q, eVar.y, itemIdAtPosition) >= 0) {
                    View h = sVar.c.h(itemIdAtPosition);
                    if (h != null) {
                        h.setHasTransientState(false);
                        sVar.c.o(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                sVar.c.o(itemIdAtPosition, view);
            }
        }
    }

    public static h0.f.a<Animator, b> r() {
        h0.f.a<Animator, b> aVar = q.get();
        if (aVar != null) {
            return aVar;
        }
        h0.f.a<Animator, b> aVar2 = new h0.f.a<>();
        q.set(aVar2);
        return aVar2;
    }

    public static boolean w(r rVar, r rVar2, String str) {
        Object obj = rVar.a.get(str);
        Object obj2 = rVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    public void A(View view) {
        if (this.m2) {
            if (!this.n2) {
                h0.f.a<Animator, b> r = r();
                int i = r.Z1;
                c0 c0Var = w.a;
                f0 f0Var = new f0(view);
                for (int i3 = i - 1; i3 >= 0; i3--) {
                    b l = r.l(i3);
                    if (l.a != null && f0Var.equals(l.d)) {
                        r.i(i3).resume();
                    }
                }
                ArrayList<d> arrayList = this.o2;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.o2.clone();
                    int size = arrayList2.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((d) arrayList2.get(i4)).e(this);
                    }
                }
            }
            this.m2 = false;
        }
    }

    public void B() {
        K();
        h0.f.a<Animator, b> r = r();
        Iterator<Animator> it = this.p2.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (r.containsKey(next)) {
                K();
                if (next != null) {
                    next.addListener(new k(this, r));
                    long j = this.Y1;
                    if (j >= 0) {
                        next.setDuration(j);
                    }
                    long j3 = this.y;
                    if (j3 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.Z1;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new l(this));
                    next.start();
                }
            }
        }
        this.p2.clear();
        p();
    }

    public j C(long j) {
        this.Y1 = j;
        return this;
    }

    public void D(c cVar) {
        this.r2 = cVar;
    }

    public j E(TimeInterpolator timeInterpolator) {
        this.Z1 = timeInterpolator;
        return this;
    }

    public void F(e eVar) {
        if (eVar == null) {
            this.s2 = d;
        } else {
            this.s2 = eVar;
        }
    }

    public void G(o oVar) {
        this.q2 = oVar;
    }

    public j H(ViewGroup viewGroup) {
        return this;
    }

    public j I(long j) {
        this.y = j;
        return this;
    }

    public void K() {
        if (this.l2 == 0) {
            ArrayList<d> arrayList = this.o2;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.o2.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((d) arrayList2.get(i)).a(this);
                }
            }
            this.n2 = false;
        }
        this.l2++;
    }

    public String L(String str) {
        StringBuilder P0 = i0.d.a.a.a.P0(str);
        P0.append(getClass().getSimpleName());
        P0.append("@");
        P0.append(Integer.toHexString(hashCode()));
        P0.append(": ");
        String sb = P0.toString();
        if (this.Y1 != -1) {
            StringBuilder S0 = i0.d.a.a.a.S0(sb, "dur(");
            S0.append(this.Y1);
            S0.append(") ");
            sb = S0.toString();
        }
        if (this.y != -1) {
            StringBuilder S02 = i0.d.a.a.a.S0(sb, "dly(");
            S02.append(this.y);
            S02.append(") ");
            sb = S02.toString();
        }
        if (this.Z1 != null) {
            StringBuilder S03 = i0.d.a.a.a.S0(sb, "interp(");
            S03.append(this.Z1);
            S03.append(") ");
            sb = S03.toString();
        }
        if (this.a2.size() <= 0 && this.b2.size() <= 0) {
            return sb;
        }
        String n02 = i0.d.a.a.a.n0(sb, "tgts(");
        if (this.a2.size() > 0) {
            for (int i = 0; i < this.a2.size(); i++) {
                if (i > 0) {
                    n02 = i0.d.a.a.a.n0(n02, ", ");
                }
                StringBuilder P02 = i0.d.a.a.a.P0(n02);
                P02.append(this.a2.get(i));
                n02 = P02.toString();
            }
        }
        if (this.b2.size() > 0) {
            for (int i3 = 0; i3 < this.b2.size(); i3++) {
                if (i3 > 0) {
                    n02 = i0.d.a.a.a.n0(n02, ", ");
                }
                StringBuilder P03 = i0.d.a.a.a.P0(n02);
                P03.append(this.b2.get(i3));
                n02 = P03.toString();
            }
        }
        return i0.d.a.a.a.n0(n02, ")");
    }

    public j b(d dVar) {
        if (this.o2 == null) {
            this.o2 = new ArrayList<>();
        }
        this.o2.add(dVar);
        return this;
    }

    public j c(int i) {
        if (i != 0) {
            this.a2.add(Integer.valueOf(i));
        }
        return this;
    }

    public void cancel() {
        for (int size = this.k2.size() - 1; size >= 0; size--) {
            this.k2.get(size).cancel();
        }
        ArrayList<d> arrayList = this.o2;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.o2.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((d) arrayList2.get(i)).d(this);
            }
        }
    }

    public j d(View view) {
        this.b2.add(view);
        return this;
    }

    public abstract void f(r rVar);

    public final void g(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                r rVar = new r(view);
                if (z) {
                    i(rVar);
                } else {
                    f(rVar);
                }
                rVar.c.add(this);
                h(rVar);
                if (z) {
                    e(this.d2, view, rVar);
                } else {
                    e(this.e2, view, rVar);
                }
            }
            if (view instanceof ViewGroup) {
                ArrayList<Class<?>> arrayList = this.c2;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        if (!this.c2.get(i).isInstance(view)) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    g(viewGroup.getChildAt(i3), z);
                }
            }
        }
    }

    public void h(r rVar) {
        boolean z;
        if (this.q2 != null && !rVar.a.isEmpty()) {
            Objects.requireNonNull(this.q2);
            String[] strArr = h.a;
            int i = 0;
            while (true) {
                if (i >= strArr.length) {
                    z = true;
                    break;
                } else if (!rVar.a.containsKey(strArr[i])) {
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                Objects.requireNonNull((h) this.q2);
                View view = rVar.b;
                Integer num = (Integer) rVar.a.get("android:visibility:visibility");
                if (num == null) {
                    num = Integer.valueOf(view.getVisibility());
                }
                rVar.a.put("android:visibilityPropagation:visibility", num);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                iArr[0] = Math.round(view.getTranslationX()) + iArr[0];
                iArr[0] = (view.getWidth() / 2) + iArr[0];
                iArr[1] = Math.round(view.getTranslationY()) + iArr[1];
                iArr[1] = (view.getHeight() / 2) + iArr[1];
                rVar.a.put("android:visibilityPropagation:center", iArr);
            }
        }
    }

    public abstract void i(r rVar);

    public void j(ViewGroup viewGroup, boolean z) {
        l(z);
        if (this.a2.size() > 0 || this.b2.size() > 0) {
            for (int i = 0; i < this.a2.size(); i++) {
                View findViewById = viewGroup.findViewById(this.a2.get(i).intValue());
                if (findViewById != null) {
                    r rVar = new r(findViewById);
                    if (z) {
                        i(rVar);
                    } else {
                        f(rVar);
                    }
                    rVar.c.add(this);
                    h(rVar);
                    if (z) {
                        e(this.d2, findViewById, rVar);
                    } else {
                        e(this.e2, findViewById, rVar);
                    }
                }
            }
            for (int i3 = 0; i3 < this.b2.size(); i3++) {
                View view = this.b2.get(i3);
                r rVar2 = new r(view);
                if (z) {
                    i(rVar2);
                } else {
                    f(rVar2);
                }
                rVar2.c.add(this);
                h(rVar2);
                if (z) {
                    e(this.d2, view, rVar2);
                } else {
                    e(this.e2, view, rVar2);
                }
            }
            return;
        }
        g(viewGroup, z);
    }

    public void l(boolean z) {
        if (z) {
            this.d2.a.clear();
            this.d2.b.clear();
            this.d2.c.c();
            return;
        }
        this.e2.a.clear();
        this.e2.b.clear();
        this.e2.c.c();
    }

    /* renamed from: m */
    public j clone() {
        try {
            j jVar = (j) super.clone();
            jVar.p2 = new ArrayList<>();
            jVar.d2 = new s();
            jVar.e2 = new s();
            jVar.h2 = null;
            jVar.i2 = null;
            return jVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator n(ViewGroup viewGroup, r rVar, r rVar2) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0191, code lost:
        if (r15 != false) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01a5, code lost:
        if ((r28.getLayoutDirection() == 1) != false) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01aa, code lost:
        r11 = 5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o(android.view.ViewGroup r28, h0.b0.s r29, h0.b0.s r30, java.util.ArrayList<h0.b0.r> r31, java.util.ArrayList<h0.b0.r> r32) {
        /*
            r27 = this;
            r6 = r27
            r7 = r28
            h0.f.a r8 = r()
            android.util.SparseIntArray r9 = new android.util.SparseIntArray
            r9.<init>()
            int r10 = r31.size()
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 0
        L_0x0017:
            if (r12 >= r10) goto L_0x0255
            r13 = r31
            java.lang.Object r2 = r13.get(r12)
            h0.b0.r r2 = (h0.b0.r) r2
            r14 = r32
            java.lang.Object r3 = r14.get(r12)
            h0.b0.r r3 = (h0.b0.r) r3
            if (r2 == 0) goto L_0x0034
            java.util.ArrayList<h0.b0.j> r5 = r2.c
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x0034
            r2 = 0
        L_0x0034:
            if (r3 == 0) goto L_0x003f
            java.util.ArrayList<h0.b0.j> r5 = r3.c
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x003f
            r3 = 0
        L_0x003f:
            if (r2 != 0) goto L_0x004a
            if (r3 != 0) goto L_0x004a
        L_0x0043:
            r2 = r8
            r18 = r10
            r20 = r12
            goto L_0x024e
        L_0x004a:
            if (r2 == 0) goto L_0x0057
            if (r3 == 0) goto L_0x0057
            boolean r15 = r6.u(r2, r3)
            if (r15 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r15 = 0
            goto L_0x0058
        L_0x0057:
            r15 = 1
        L_0x0058:
            if (r15 == 0) goto L_0x0043
            android.animation.Animator r15 = r6.n(r7, r2, r3)
            if (r15 == 0) goto L_0x0043
            if (r3 == 0) goto L_0x00e4
            android.view.View r4 = r3.b
            java.lang.String[] r5 = r27.s()
            if (r5 == 0) goto L_0x00d9
            int r11 = r5.length
            if (r11 <= 0) goto L_0x00d9
            h0.b0.r r11 = new h0.b0.r
            r11.<init>(r4)
            r18 = r10
            r10 = r30
            h0.f.a<android.view.View, h0.b0.r> r13 = r10.a
            java.lang.Object r13 = r13.get(r4)
            h0.b0.r r13 = (h0.b0.r) r13
            if (r13 == 0) goto L_0x00a2
            r10 = 0
        L_0x0081:
            int r14 = r5.length
            if (r10 >= r14) goto L_0x00a2
            java.util.Map<java.lang.String, java.lang.Object> r14 = r11.a
            r19 = r15
            r15 = r5[r10]
            r20 = r12
            java.util.Map<java.lang.String, java.lang.Object> r12 = r13.a
            r21 = r13
            r13 = r5[r10]
            java.lang.Object r12 = r12.get(r13)
            r14.put(r15, r12)
            int r10 = r10 + 1
            r15 = r19
            r12 = r20
            r13 = r21
            goto L_0x0081
        L_0x00a2:
            r20 = r12
            r19 = r15
            int r5 = r8.Z1
            r10 = 0
        L_0x00a9:
            if (r10 >= r5) goto L_0x00d6
            java.lang.Object r12 = r8.i(r10)
            android.animation.Animator r12 = (android.animation.Animator) r12
            java.lang.Object r12 = r8.get(r12)
            h0.b0.j$b r12 = (h0.b0.j.b) r12
            h0.b0.r r13 = r12.c
            if (r13 == 0) goto L_0x00d3
            android.view.View r13 = r12.a
            if (r13 != r4) goto L_0x00d3
            java.lang.String r13 = r12.b
            java.lang.String r14 = r6.x
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x00d3
            h0.b0.r r12 = r12.c
            boolean r12 = r12.equals(r11)
            if (r12 == 0) goto L_0x00d3
            r15 = 0
            goto L_0x00e2
        L_0x00d3:
            int r10 = r10 + 1
            goto L_0x00a9
        L_0x00d6:
            r15 = r19
            goto L_0x00e2
        L_0x00d9:
            r18 = r10
            r20 = r12
            r19 = r15
            r15 = r19
            r11 = 0
        L_0x00e2:
            r5 = r11
            goto L_0x00ed
        L_0x00e4:
            r18 = r10
            r20 = r12
            r19 = r15
            android.view.View r4 = r2.b
            r5 = 0
        L_0x00ed:
            if (r15 == 0) goto L_0x024d
            h0.b0.o r10 = r6.q2
            if (r10 == 0) goto L_0x0223
            h0.b0.h r10 = (h0.b0.h) r10
            if (r2 != 0) goto L_0x0103
            if (r3 != 0) goto L_0x0103
            r25 = r5
            r29 = r8
            r24 = r15
            r11 = 0
            goto L_0x0214
        L_0x0103:
            h0.b0.j$c r13 = r6.r2
            if (r13 != 0) goto L_0x0109
            r13 = 0
            goto L_0x010d
        L_0x0109:
            android.graphics.Rect r13 = r13.a(r6)
        L_0x010d:
            if (r3 == 0) goto L_0x012b
            if (r2 != 0) goto L_0x0112
            goto L_0x011e
        L_0x0112:
            java.util.Map<java.lang.String, java.lang.Object> r14 = r2.a
            java.lang.String r11 = "android:visibilityPropagation:visibility"
            java.lang.Object r11 = r14.get(r11)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 != 0) goto L_0x0121
        L_0x011e:
            r11 = 8
            goto L_0x0125
        L_0x0121:
            int r11 = r11.intValue()
        L_0x0125:
            if (r11 != 0) goto L_0x0128
            goto L_0x012b
        L_0x0128:
            r2 = r3
            r3 = 1
            goto L_0x012c
        L_0x012b:
            r3 = -1
        L_0x012c:
            r11 = 0
            int r12 = h0.b0.h.a(r2, r11)
            r14 = 1
            int r2 = h0.b0.h.a(r2, r14)
            r14 = 2
            r29 = r8
            int[] r8 = new int[r14]
            r7.getLocationOnScreen(r8)
            r17 = r8[r11]
            float r19 = r28.getTranslationX()
            int r19 = java.lang.Math.round(r19)
            int r19 = r19 + r17
            r16 = 1
            r8 = r8[r16]
            float r17 = r28.getTranslationY()
            int r17 = java.lang.Math.round(r17)
            int r17 = r17 + r8
            int r8 = r28.getWidth()
            int r8 = r8 + r19
            int r22 = r28.getHeight()
            int r22 = r22 + r17
            if (r13 == 0) goto L_0x016f
            int r14 = r13.centerX()
            int r13 = r13.centerY()
            goto L_0x017b
        L_0x016f:
            int r13 = r19 + r8
            int r13 = r13 / r14
            int r23 = r17 + r22
            int r14 = r23 / 2
            r26 = r14
            r14 = r13
            r13 = r26
        L_0x017b:
            int r11 = r10.b
            r24 = r15
            r15 = 8388611(0x800003, float:1.1754948E-38)
            r25 = r5
            if (r11 != r15) goto L_0x0194
            java.util.concurrent.atomic.AtomicInteger r11 = h0.i.i.q.a
            int r11 = r28.getLayoutDirection()
            r15 = 1
            if (r11 != r15) goto L_0x0190
            goto L_0x0191
        L_0x0190:
            r15 = 0
        L_0x0191:
            if (r15 == 0) goto L_0x01a7
            goto L_0x01aa
        L_0x0194:
            r5 = 8388613(0x800005, float:1.175495E-38)
            r15 = 1
            if (r11 != r5) goto L_0x01ab
            java.util.concurrent.atomic.AtomicInteger r5 = h0.i.i.q.a
            int r5 = r28.getLayoutDirection()
            if (r5 != r15) goto L_0x01a4
            r5 = r15
            goto L_0x01a5
        L_0x01a4:
            r5 = 0
        L_0x01a5:
            if (r5 == 0) goto L_0x01aa
        L_0x01a7:
            r5 = 3
            r11 = 3
            goto L_0x01ac
        L_0x01aa:
            r11 = 5
        L_0x01ab:
            r5 = 3
        L_0x01ac:
            if (r11 == r5) goto L_0x01d8
            r5 = 5
            if (r11 == r5) goto L_0x01ce
            r5 = 48
            if (r11 == r5) goto L_0x01c4
            r5 = 80
            if (r11 == r5) goto L_0x01bb
            r5 = 0
            goto L_0x01e0
        L_0x01bb:
            int r2 = r2 - r17
            int r14 = r14 - r12
            int r5 = java.lang.Math.abs(r14)
            int r5 = r5 + r2
            goto L_0x01e0
        L_0x01c4:
            int r22 = r22 - r2
            int r14 = r14 - r12
            int r2 = java.lang.Math.abs(r14)
            int r5 = r2 + r22
            goto L_0x01e0
        L_0x01ce:
            int r12 = r12 - r19
            int r13 = r13 - r2
            int r2 = java.lang.Math.abs(r13)
            int r5 = r2 + r12
            goto L_0x01e0
        L_0x01d8:
            int r8 = r8 - r12
            int r13 = r13 - r2
            int r2 = java.lang.Math.abs(r13)
            int r5 = r2 + r8
        L_0x01e0:
            float r2 = (float) r5
            int r5 = r10.b
            r8 = 3
            if (r5 == r8) goto L_0x01f8
            r8 = 5
            if (r5 == r8) goto L_0x01f8
            r8 = 8388611(0x800003, float:1.1754948E-38)
            if (r5 == r8) goto L_0x01f8
            r8 = 8388613(0x800005, float:1.175495E-38)
            if (r5 == r8) goto L_0x01f8
            int r5 = r28.getHeight()
            goto L_0x01fc
        L_0x01f8:
            int r5 = r28.getWidth()
        L_0x01fc:
            float r5 = (float) r5
            float r2 = r2 / r5
            long r10 = r6.Y1
            r12 = 0
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 >= 0) goto L_0x0208
            r10 = 300(0x12c, double:1.48E-321)
        L_0x0208:
            long r12 = (long) r3
            long r10 = r10 * r12
            float r3 = (float) r10
            r5 = 1077936128(0x40400000, float:3.0)
            float r3 = r3 / r5
            float r3 = r3 * r2
            int r2 = java.lang.Math.round(r3)
            long r11 = (long) r2
        L_0x0214:
            java.util.ArrayList<android.animation.Animator> r2 = r6.p2
            int r2 = r2.size()
            int r3 = (int) r11
            r9.put(r2, r3)
            long r0 = java.lang.Math.min(r11, r0)
            goto L_0x0229
        L_0x0223:
            r25 = r5
            r29 = r8
            r24 = r15
        L_0x0229:
            r10 = r0
            h0.b0.j$b r8 = new h0.b0.j$b
            java.lang.String r2 = r6.x
            h0.b0.c0 r0 = h0.b0.w.a
            h0.b0.f0 r5 = new h0.b0.f0
            r5.<init>(r7)
            r0 = r8
            r1 = r4
            r3 = r27
            r4 = r5
            r5 = r25
            r0.<init>(r1, r2, r3, r4, r5)
            r2 = r29
            r15 = r24
            r2.put(r15, r8)
            java.util.ArrayList<android.animation.Animator> r0 = r6.p2
            r0.add(r15)
            r0 = r10
            goto L_0x024e
        L_0x024d:
            r2 = r8
        L_0x024e:
            int r12 = r20 + 1
            r8 = r2
            r10 = r18
            goto L_0x0017
        L_0x0255:
            int r2 = r9.size()
            if (r2 == 0) goto L_0x027f
            r11 = 0
        L_0x025c:
            int r2 = r9.size()
            if (r11 >= r2) goto L_0x027f
            int r2 = r9.keyAt(r11)
            java.util.ArrayList<android.animation.Animator> r3 = r6.p2
            java.lang.Object r2 = r3.get(r2)
            android.animation.Animator r2 = (android.animation.Animator) r2
            int r3 = r9.valueAt(r11)
            long r3 = (long) r3
            long r3 = r3 - r0
            long r7 = r2.getStartDelay()
            long r7 = r7 + r3
            r2.setStartDelay(r7)
            int r11 = r11 + 1
            goto L_0x025c
        L_0x027f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b0.j.o(android.view.ViewGroup, h0.b0.s, h0.b0.s, java.util.ArrayList, java.util.ArrayList):void");
    }

    public void p() {
        int i = this.l2 - 1;
        this.l2 = i;
        if (i == 0) {
            ArrayList<d> arrayList = this.o2;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.o2.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((d) arrayList2.get(i3)).c(this);
                }
            }
            for (int i4 = 0; i4 < this.d2.c.r(); i4++) {
                View s = this.d2.c.s(i4);
                if (s != null) {
                    AtomicInteger atomicInteger = q.a;
                    s.setHasTransientState(false);
                }
            }
            for (int i5 = 0; i5 < this.e2.c.r(); i5++) {
                View s3 = this.e2.c.s(i5);
                if (s3 != null) {
                    AtomicInteger atomicInteger2 = q.a;
                    s3.setHasTransientState(false);
                }
            }
            this.n2 = true;
        }
    }

    public r q(View view, boolean z) {
        p pVar = this.f2;
        if (pVar != null) {
            return pVar.q(view, z);
        }
        ArrayList<r> arrayList = z ? this.h2 : this.i2;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            r rVar = arrayList.get(i3);
            if (rVar == null) {
                return null;
            }
            if (rVar.b == view) {
                i = i3;
                break;
            }
            i3++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? this.i2 : this.h2).get(i);
    }

    public String[] s() {
        return null;
    }

    public r t(View view, boolean z) {
        p pVar = this.f2;
        if (pVar != null) {
            return pVar.t(view, z);
        }
        return (z ? this.d2 : this.e2).a.getOrDefault(view, null);
    }

    public String toString() {
        return L("");
    }

    public boolean u(r rVar, r rVar2) {
        if (rVar == null || rVar2 == null) {
            return false;
        }
        String[] s = s();
        if (s != null) {
            int length = s.length;
            int i = 0;
            while (i < length) {
                if (!w(rVar, rVar2, s[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String w : rVar.a.keySet()) {
            if (w(rVar, rVar2, w)) {
            }
        }
        return false;
        return true;
    }

    public boolean v(View view) {
        int id = view.getId();
        if ((this.a2.size() != 0 || this.b2.size() != 0) && !this.a2.contains(Integer.valueOf(id)) && !this.b2.contains(view)) {
            return false;
        }
        return true;
    }

    public void x(View view) {
        if (!this.n2) {
            h0.f.a<Animator, b> r = r();
            int i = r.Z1;
            c0 c0Var = w.a;
            f0 f0Var = new f0(view);
            for (int i3 = i - 1; i3 >= 0; i3--) {
                b l = r.l(i3);
                if (l.a != null && f0Var.equals(l.d)) {
                    r.i(i3).pause();
                }
            }
            ArrayList<d> arrayList = this.o2;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.o2.clone();
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((d) arrayList2.get(i4)).b(this);
                }
            }
            this.m2 = true;
        }
    }

    public j y(d dVar) {
        ArrayList<d> arrayList = this.o2;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(dVar);
        if (this.o2.size() == 0) {
            this.o2 = null;
        }
        return this;
    }

    public j z(View view) {
        this.b2.remove(view);
        return this;
    }
}
