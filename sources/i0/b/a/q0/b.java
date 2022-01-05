package i0.b.a.q0;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import i0.b.a.d;
import i0.b.a.q0.c;
import i0.b.a.t;
import i0.j.f.p.h;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import m0.i;
import m0.n.a.a;
import m0.n.a.p;
import m0.q.e;

/* compiled from: EpoxyPreloader.kt */
public final class b<P extends c> extends RecyclerView.s {
    public e a;
    public m0.q.c b;
    public int c = -1;
    public final Map<Class<? extends t<?>>, a<?, ?, ? extends P>> d;
    public final d<P> e;
    public final e f;
    public final d g;
    public final int h;

    public b(d dVar, a<? extends P> aVar, p<? super Context, ? super RuntimeException, i> pVar, int i, List<? extends a<?, ?, ? extends P>> list) {
        this.g = dVar;
        this.h = i;
        e eVar = e.y;
        e eVar2 = e.x;
        this.a = eVar2;
        this.b = eVar2;
        int R2 = h.R2(h.K(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(R2 < 16 ? 16 : R2);
        for (T next : list) {
            Objects.requireNonNull((a) next);
            linkedHashMap.put((Object) null, next);
        }
        this.d = linkedHashMap;
        this.e = new d<>(this.h, aVar);
        this.f = new e(this.g, pVar);
        if (!(this.h > 0)) {
            StringBuilder P0 = i0.d.a.a.a.P0("maxItemsToPreload must be greater than 0. Was ");
            P0.append(this.h);
            throw new IllegalArgumentException(P0.toString().toString());
        }
    }

    public void a(RecyclerView recyclerView, int i) {
        m0.n.b.i.e(recyclerView, "recyclerView");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0174 A[EDGE_INSN: B:106:0x0174->B:79:0x0174 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(androidx.recyclerview.widget.RecyclerView r13, int r14, int r15) {
        /*
            r12 = this;
            java.lang.String r0 = "recyclerView"
            m0.n.b.i.e(r13, r0)
            if (r14 != 0) goto L_0x000a
            if (r15 != 0) goto L_0x000a
            return
        L_0x000a:
            int r14 = java.lang.Math.abs(r14)
            r0 = 75
            r1 = 0
            r2 = 1
            if (r14 <= r0) goto L_0x0016
            r14 = r2
            goto L_0x0017
        L_0x0016:
            r14 = r1
        L_0x0017:
            if (r14 != 0) goto L_0x01da
            int r14 = java.lang.Math.abs(r15)
            if (r14 <= r0) goto L_0x0021
            r14 = r2
            goto L_0x0022
        L_0x0021:
            r14 = r1
        L_0x0022:
            if (r14 == 0) goto L_0x0026
            goto L_0x01da
        L_0x0026:
            androidx.recyclerview.widget.RecyclerView$Adapter r14 = r13.getAdapter()
            if (r14 == 0) goto L_0x0031
            int r14 = r14.getItemCount()
            goto L_0x0032
        L_0x0031:
            r14 = r1
        L_0x0032:
            r12.c = r14
            androidx.recyclerview.widget.RecyclerView$n r13 = r13.getLayoutManager()
            java.lang.String r14 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            java.util.Objects.requireNonNull(r13, r14)
            androidx.recyclerview.widget.LinearLayoutManager r13 = (androidx.recyclerview.widget.LinearLayoutManager) r13
            int r14 = r13.findFirstVisibleItemPosition()
            int r13 = r13.findLastVisibleItemPosition()
            r15 = -1
            if (r14 == r15) goto L_0x0051
            int r0 = r12.c
            if (r14 < r0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r0 = r1
            goto L_0x0052
        L_0x0051:
            r0 = r2
        L_0x0052:
            if (r0 != 0) goto L_0x01d2
            if (r13 == r15) goto L_0x005d
            int r0 = r12.c
            if (r13 < r0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r0 = r1
            goto L_0x005e
        L_0x005d:
            r0 = r2
        L_0x005e:
            if (r0 == 0) goto L_0x0062
            goto L_0x01d2
        L_0x0062:
            m0.q.e r0 = new m0.q.e
            r0.<init>(r14, r13)
            m0.q.e r3 = r12.a
            boolean r3 = m0.n.b.i.a(r0, r3)
            if (r3 == 0) goto L_0x0070
            return
        L_0x0070:
            m0.q.e r3 = r12.a
            int r4 = r3.c
            if (r14 > r4) goto L_0x007f
            int r4 = r0.d
            int r3 = r3.d
            if (r4 <= r3) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r3 = r1
            goto L_0x0080
        L_0x007f:
            r3 = r2
        L_0x0080:
            if (r3 == 0) goto L_0x0084
            int r13 = r13 + r2
            goto L_0x0086
        L_0x0084:
            int r13 = r14 + -1
        L_0x0086:
            int r14 = r12.h
            if (r3 == 0) goto L_0x008c
            int r14 = r14 - r2
            goto L_0x008e
        L_0x008c:
            int r14 = 1 - r14
        L_0x008e:
            int r14 = r14 + r13
            int r4 = r12.c
            int r4 = r4 + r15
            int r13 = java.lang.Math.max(r13, r1)
            int r13 = java.lang.Math.min(r4, r13)
            int r4 = r12.c
            int r4 = r4 + r15
            int r14 = java.lang.Math.max(r14, r1)
            int r14 = java.lang.Math.min(r4, r14)
            if (r3 == 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r2 = r15
        L_0x00a9:
            m0.q.c r15 = new m0.q.c
            r15.<init>(r13, r14, r2)
            m0.q.c r13 = r12.b
            java.util.Set r13 = m0.j.g.o0(r15, r13)
            java.util.Iterator r13 = r13.iterator()
        L_0x00b8:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x01cd
            java.lang.Object r14 = r13.next()
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            i0.b.a.d r1 = r12.g
            java.lang.String r2 = "$this$getModelForPositionInternal"
            m0.n.b.i.e(r1, r2)
            i0.b.a.t r1 = r1.d(r14)
            boolean r2 = r1 instanceof i0.b.a.t
            r3 = 0
            if (r2 != 0) goto L_0x00d9
            r1 = r3
        L_0x00d9:
            if (r1 == 0) goto L_0x00b8
            java.util.Map<java.lang.Class<? extends i0.b.a.t<?>>, i0.b.a.q0.a<?, ?, ? extends P>> r2 = r12.d
            java.lang.Class r4 = r1.getClass()
            java.lang.Object r2 = r2.get(r4)
            boolean r4 = r2 instanceof i0.b.a.q0.a
            if (r4 != 0) goto L_0x00ea
            r2 = r3
        L_0x00ea:
            i0.b.a.q0.a r2 = (i0.b.a.q0.a) r2
            if (r2 == 0) goto L_0x00b8
            i0.b.a.q0.e r4 = r12.f
            java.util.Objects.requireNonNull(r4)
            java.lang.String r5 = "preloader"
            m0.n.b.i.e(r2, r5)
            java.lang.String r5 = "epoxyModel"
            m0.n.b.i.e(r1, r5)
            i0.b.a.q0.e$a r14 = r4.a(r2, r1, r14)
            java.util.Map<i0.b.a.q0.e$a, java.util.List<i0.b.a.q0.f<?>>> r5 = r4.a
            java.lang.Object r6 = r5.get(r14)
            if (r6 != 0) goto L_0x0195
            i0.b.a.d r6 = r4.b
            java.lang.String r7 = "$this$boundViewHoldersInternal"
            m0.n.b.i.e(r6, r7)
            i0.b.a.e r6 = r6.b()
            java.lang.String r7 = "adapter.boundViewHoldersInternal()"
            m0.n.b.i.d(r6, r7)
            java.util.Iterator r6 = r6.iterator()
        L_0x011d:
            r7 = r6
            i0.b.a.e$b r7 = (i0.b.a.e.b) r7
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0173
            java.lang.Object r7 = r7.next()
            r8 = r7
            i0.b.a.w r8 = (i0.b.a.w) r8
            java.lang.String r9 = "it"
            m0.n.b.i.d(r8, r9)
            r8.a()
            i0.b.a.t r9 = r8.a
            java.lang.Class r10 = r9.getClass()
            m0.r.d r10 = m0.n.b.m.a(r10)
            java.lang.Class r11 = r1.getClass()
            m0.r.d r11 = m0.n.b.m.a(r11)
            boolean r10 = m0.n.b.i.a(r10, r11)
            if (r10 == 0) goto L_0x016f
            android.view.View r10 = r8.itemView
            java.util.concurrent.atomic.AtomicInteger r11 = h0.i.i.q.a
            boolean r10 = r10.isAttachedToWindow()
            if (r10 == 0) goto L_0x016f
            android.view.View r10 = r8.itemView
            boolean r10 = r10.isLaidOut()
            if (r10 == 0) goto L_0x016f
            int r8 = r8.getAdapterPosition()
            i0.b.a.q0.e$a r8 = r4.a(r2, r9, r8)
            boolean r8 = m0.n.b.i.a(r8, r14)
            if (r8 == 0) goto L_0x016f
            r8 = 1
            goto L_0x0170
        L_0x016f:
            r8 = 0
        L_0x0170:
            if (r8 == 0) goto L_0x011d
            goto L_0x0174
        L_0x0173:
            r7 = r3
        L_0x0174:
            i0.b.a.w r7 = (i0.b.a.w) r7
            if (r7 == 0) goto L_0x0191
            android.view.View r4 = r7.itemView
            if (r4 != 0) goto L_0x017d
            goto L_0x0191
        L_0x017d:
            java.lang.String r13 = "holderMatch?.itemView ?: return null"
            m0.n.b.i.d(r4, r13)
            java.lang.String r13 = "$this$objectToBindInternal"
            m0.n.b.i.e(r7, r13)
            java.lang.Object r13 = r7.c()
            java.lang.String r14 = "objectToBind()"
            m0.n.b.i.d(r13, r14)
            throw r3
        L_0x0191:
            r5.put(r14, r3)
            r6 = r3
        L_0x0195:
            boolean r14 = r6 instanceof java.util.List
            if (r14 != 0) goto L_0x019a
            goto L_0x019b
        L_0x019a:
            r3 = r6
        L_0x019b:
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x01a0
            goto L_0x01a2
        L_0x01a0:
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.c
        L_0x01a2:
            java.util.Iterator r14 = r3.iterator()
        L_0x01a6:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x00b8
            java.lang.Object r3 = r14.next()
            i0.b.a.q0.f r3 = (i0.b.a.q0.f) r3
            i0.b.a.q0.d<P> r4 = r12.e
            java.util.ArrayDeque<P> r5 = r4.a
            java.lang.Object r5 = r5.poll()
            i0.b.a.q0.c r5 = (i0.b.a.q0.c) r5
            java.util.ArrayDeque<P> r4 = r4.a
            r4.offer(r5)
            r5.clear()
            java.lang.String r4 = "result"
            m0.n.b.i.d(r5, r4)
            r2.a(r1, r5, r3)
            goto L_0x01a6
        L_0x01cd:
            r12.a = r0
            r12.b = r15
            return
        L_0x01d2:
            m0.q.e r13 = m0.q.e.y
            m0.q.e r13 = m0.q.e.x
            r12.a = r13
            r12.b = r13
        L_0x01da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.b.a.q0.b.c(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
