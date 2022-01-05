package com.clubhouse.android.shared.data;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.clubhouse.android.shared.data.CompositeSelectableUserDataSource$emitDefaultResults$1", f = "CompositeSelectableUserDataSource.kt", l = {93, 100}, m = "invokeSuspend")
/* compiled from: CompositeSelectableUserDataSource.kt */
public final class CompositeSelectableUserDataSource$emitDefaultResults$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ CompositeSelectableUserDataSource d;
    public final /* synthetic */ String q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompositeSelectableUserDataSource$emitDefaultResults$1(CompositeSelectableUserDataSource compositeSelectableUserDataSource, String str, m0.l.c<? super CompositeSelectableUserDataSource$emitDefaultResults$1> cVar) {
        super(2, cVar);
        this.d = compositeSelectableUserDataSource;
        this.q = str;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new CompositeSelectableUserDataSource$emitDefaultResults$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new CompositeSelectableUserDataSource$emitDefaultResults$1(this.d, this.q, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r14.c
            r2 = 10
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r5) goto L_0x001c
            if (r1 != r3) goto L_0x0014
            i0.j.f.p.h.d4(r15)
            goto L_0x012b
        L_0x0014:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x001c:
            i0.j.f.p.h.d4(r15)     // Catch:{ all -> 0x003f }
            goto L_0x003c
        L_0x0020:
            i0.j.f.p.h.d4(r15)
            com.clubhouse.android.shared.data.CompositeSelectableUserDataSource r15 = r14.d
            java.util.List<i0.e.b.b3.b.e.m> r15 = r15.e
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L_0x007a
            com.clubhouse.android.shared.data.CompositeSelectableUserDataSource r15 = r14.d     // Catch:{ all -> 0x003f }
            com.clubhouse.android.data.repos.UserRepo r15 = r15.b     // Catch:{ all -> 0x003f }
            java.lang.String r1 = r14.q     // Catch:{ all -> 0x003f }
            r14.c = r5     // Catch:{ all -> 0x003f }
            java.lang.Object r15 = r15.o(r1, r14)     // Catch:{ all -> 0x003f }
            if (r15 != r0) goto L_0x003c
            return r0
        L_0x003c:
            com.clubhouse.android.data.models.remote.response.UsersInListResponse r15 = (com.clubhouse.android.data.models.remote.response.UsersInListResponse) r15     // Catch:{ all -> 0x003f }
            goto L_0x0040
        L_0x003f:
            r15 = r4
        L_0x0040:
            com.clubhouse.android.shared.data.CompositeSelectableUserDataSource r1 = r14.d
            if (r15 != 0) goto L_0x0045
            goto L_0x0074
        L_0x0045:
            java.util.List<com.clubhouse.android.data.models.local.user.UserInList> r15 = r15.a
            if (r15 != 0) goto L_0x004a
            goto L_0x0074
        L_0x004a:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = i0.j.f.p.h.K(r15, r2)
            r4.<init>(r6)
            java.util.Iterator r15 = r15.iterator()
        L_0x0057:
            boolean r6 = r15.hasNext()
            if (r6 == 0) goto L_0x0074
            java.lang.Object r6 = r15.next()
            r8 = r6
            com.clubhouse.android.data.models.local.user.UserInList r8 = (com.clubhouse.android.data.models.local.user.UserInList) r8
            i0.e.b.b3.b.e.m r6 = new i0.e.b.b3.b.e.m
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 30
            r7 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r4.add(r6)
            goto L_0x0057
        L_0x0074:
            if (r4 != 0) goto L_0x0078
            kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.c
        L_0x0078:
            r1.e = r4
        L_0x007a:
            com.clubhouse.android.shared.data.CompositeSelectableUserDataSource r15 = r14.d
            java.util.List<i0.e.b.b3.b.e.m> r1 = r15.e
            java.util.Set<i0.e.b.b3.b.e.m> r15 = r15.d
            java.util.List r15 = m0.j.g.Z(r1, r15)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            java.util.Iterator r15 = r15.iterator()
        L_0x0094:
            boolean r6 = r15.hasNext()
            if (r6 == 0) goto L_0x00ba
            java.lang.Object r6 = r15.next()
            r7 = r6
            i0.e.b.b3.b.e.m r7 = (i0.e.b.b3.b.e.m) r7
            com.clubhouse.android.data.models.local.user.UserInList r7 = r7.g
            java.lang.Integer r7 = r7.getId()
            int r7 = r7.intValue()
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r7)
            boolean r7 = r1.add(r8)
            if (r7 == 0) goto L_0x0094
            r4.add(r6)
            goto L_0x0094
        L_0x00ba:
            com.clubhouse.android.shared.data.CompositeSelectableUserDataSource r15 = r14.d
            n0.a.g2.d<h0.u.w<i0.e.b.a3.d.a<i0.e.b.b3.b.e.m>>> r1 = r15.g
            n0.a.g2.q r1 = (n0.a.g2.q) r1
            h0.u.w$b r6 = h0.u.w.c
            java.util.ArrayList r7 = new java.util.ArrayList
            int r2 = i0.j.f.p.h.K(r4, r2)
            r7.<init>(r2)
            java.util.Iterator r2 = r4.iterator()
        L_0x00cf:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x011e
            java.lang.Object r4 = r2.next()
            i0.e.b.b3.b.e.m r4 = (i0.e.b.b3.b.e.m) r4
            java.util.Set<i0.e.b.b3.b.e.m> r8 = r15.d
            boolean r9 = r8 instanceof java.util.Collection
            r10 = 0
            if (r9 == 0) goto L_0x00e9
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x00e9
            goto L_0x0115
        L_0x00e9:
            java.util.Iterator r8 = r8.iterator()
        L_0x00ed:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0115
            java.lang.Object r9 = r8.next()
            i0.e.b.b3.b.e.m r9 = (i0.e.b.b3.b.e.m) r9
            com.clubhouse.android.data.models.local.user.UserInList r9 = r9.g
            java.lang.Integer r9 = r9.getId()
            int r9 = r9.intValue()
            com.clubhouse.android.data.models.local.user.UserInList r11 = r4.g
            java.lang.Integer r11 = r11.getId()
            int r11 = r11.intValue()
            if (r9 != r11) goto L_0x0111
            r9 = r5
            goto L_0x0112
        L_0x0111:
            r9 = r10
        L_0x0112:
            if (r9 == 0) goto L_0x00ed
            r10 = r5
        L_0x0115:
            i0.e.b.a3.d.a r8 = new i0.e.b.a3.d.a
            r8.<init>(r4, r10)
            r7.add(r8)
            goto L_0x00cf
        L_0x011e:
            h0.u.w r15 = r6.b(r7)
            r14.c = r3
            java.lang.Object r15 = r1.emit(r15, r14)
            if (r15 != r0) goto L_0x012b
            return r0
        L_0x012b:
            m0.i r15 = m0.i.a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.shared.data.CompositeSelectableUserDataSource$emitDefaultResults$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
