package androidx.paging;

import h0.u.e;
import n0.a.d0;

/* compiled from: AsyncPagingDataDiffer.kt */
public final class AsyncPagingDataDiffer$differBase$1 extends PagingDataDiffer<T> {
    public final /* synthetic */ AsyncPagingDataDiffer l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer$differBase$1(AsyncPagingDataDiffer asyncPagingDataDiffer, e eVar, d0 d0Var) {
        super(eVar, d0Var);
        this.l = asyncPagingDataDiffer;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: m0.n.a.a<m0.i>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(h0.u.o<T> r6, h0.u.o<T> r7, h0.u.b r8, int r9, m0.n.a.a<m0.i> r10, m0.l.c<? super java.lang.Integer> r11) {
        /*
            r5 = this;
            boolean r8 = r11 instanceof androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$1
            if (r8 == 0) goto L_0x0013
            r8 = r11
            androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$1 r8 = (androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$1) r8
            int r0 = r8.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r8.d = r0
            goto L_0x0018
        L_0x0013:
            androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$1 r8 = new androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$1
            r8.<init>(r5, r11)
        L_0x0018:
            java.lang.Object r11 = r8.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0043
            if (r1 != r2) goto L_0x003b
            int r9 = r8.a2
            java.lang.Object r6 = r8.Z1
            r10 = r6
            m0.n.a.a r10 = (m0.n.a.a) r10
            java.lang.Object r6 = r8.Y1
            h0.u.o r6 = (h0.u.o) r6
            java.lang.Object r7 = r8.y
            h0.u.o r7 = (h0.u.o) r7
            java.lang.Object r8 = r8.x
            androidx.paging.AsyncPagingDataDiffer$differBase$1 r8 = (androidx.paging.AsyncPagingDataDiffer$differBase$1) r8
            i0.j.f.p.h.d4(r11)
            goto L_0x009b
        L_0x003b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0043:
            i0.j.f.p.h.d4(r11)
            h0.u.s r6 = (h0.u.s) r6
            int r11 = r6.e()
            r1 = 0
            if (r11 != 0) goto L_0x0062
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1$1 r10 = (androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1.AnonymousClass1) r10
            r10.invoke()
            androidx.paging.AsyncPagingDataDiffer r6 = r5.l
            h0.u.e r6 = r6.a
            h0.u.s r7 = (h0.u.s) r7
            int r7 = r7.e()
            r6.a(r1, r7)
            goto L_0x00b0
        L_0x0062:
            h0.u.s r7 = (h0.u.s) r7
            int r11 = r7.e()
            if (r11 != 0) goto L_0x007b
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1$1 r10 = (androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1.AnonymousClass1) r10
            r10.invoke()
            androidx.paging.AsyncPagingDataDiffer r7 = r5.l
            h0.u.e r7 = r7.a
            int r6 = r6.e()
            r7.b(r1, r6)
            goto L_0x00b0
        L_0x007b:
            androidx.paging.AsyncPagingDataDiffer r11 = r5.l
            n0.a.d0 r11 = r11.i
            androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1 r1 = new androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1
            r1.<init>(r5, r6, r7, r3)
            r8.x = r5
            r8.y = r6
            r8.Y1 = r7
            r8.Z1 = r10
            r8.a2 = r9
            r8.d = r2
            java.lang.Object r11 = m0.r.t.a.r.m.a1.a.k4(r11, r1, r8)
            if (r11 != r0) goto L_0x0097
            return r0
        L_0x0097:
            r8 = r5
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x009b:
            h0.u.n r11 = (h0.u.n) r11
            r10.invoke()
            androidx.paging.AsyncPagingDataDiffer r8 = r8.l
            h0.v.a.r r8 = r8.g
            g0.a.b.b.a.z(r7, r8, r6, r11)
            int r6 = g0.a.b.b.a.C0(r7, r11, r6, r9)
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r6)
        L_0x00b0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.AsyncPagingDataDiffer$differBase$1.b(h0.u.o, h0.u.o, h0.u.b, int, m0.n.a.a, m0.l.c):java.lang.Object");
    }
}
