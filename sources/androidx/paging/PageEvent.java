package androidx.paging;

import h0.u.f0;
import h0.u.j;
import h0.u.k;
import i0.j.f.p.h;
import java.util.List;
import m0.l.c;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: PageEvent.kt */
public abstract class PageEvent<T> {

    /* compiled from: PageEvent.kt */
    public static final class Insert<T> extends PageEvent<T> {
        public static final Insert<Object> a;
        public static final a b;
        public final LoadType c;
        public final List<f0<T>> d;
        public final int e;
        public final int f;
        public final h0.u.b g;

        /* compiled from: PageEvent.kt */
        public static final class a {
            public a(f fVar) {
            }

            public final <T> Insert<T> a(List<f0<T>> list, int i, h0.u.b bVar) {
                i.e(list, "pages");
                i.e(bVar, "combinedLoadStates");
                return new Insert(LoadType.APPEND, list, -1, i, bVar);
            }

            public final <T> Insert<T> b(List<f0<T>> list, int i, h0.u.b bVar) {
                i.e(list, "pages");
                i.e(bVar, "combinedLoadStates");
                return new Insert(LoadType.PREPEND, list, i, -1, bVar);
            }

            public final <T> Insert<T> c(List<f0<T>> list, int i, int i2, h0.u.b bVar) {
                i.e(list, "pages");
                i.e(bVar, "combinedLoadStates");
                return new Insert(LoadType.REFRESH, list, i, i2, bVar);
            }
        }

        static {
            a aVar = new a((f) null);
            b = aVar;
            f0 f0Var = f0.b;
            List<Object> L2 = h.L2(f0.a);
            j.c cVar = j.c.c;
            j.c cVar2 = j.c.b;
            a = aVar.c(L2, 0, 0, new h0.u.b(cVar, cVar2, cVar2, new k(cVar, cVar2, cVar2), (k) null, 16));
        }

        public Insert(LoadType loadType, List<f0<T>> list, int i, int i2, h0.u.b bVar) {
            super((f) null);
            this.c = loadType;
            this.d = list;
            this.e = i;
            this.f = i2;
            this.g = bVar;
            boolean z = false;
            if (loadType == LoadType.APPEND || i >= 0) {
                if (loadType == LoadType.PREPEND || i2 >= 0) {
                    if (!((loadType != LoadType.REFRESH || (list.isEmpty() ^ true)) ? true : z)) {
                        throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.".toString());
                    }
                    return;
                }
                throw new IllegalArgumentException(("Append insert defining placeholdersAfter must be > 0, but was" + ' ' + i2).toString());
            }
            throw new IllegalArgumentException(("Prepend insert defining placeholdersBefore must be > 0, but was" + ' ' + i).toString());
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00b9  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00c1  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0101  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(m0.n.a.p<? super T, ? super m0.l.c<? super java.lang.Boolean>, ? extends java.lang.Object> r19, m0.l.c<? super androidx.paging.PageEvent<T>> r20) {
            /*
                r18 = this;
                r0 = r18
                r1 = r20
                boolean r2 = r1 instanceof androidx.paging.PageEvent$Insert$filter$1
                if (r2 == 0) goto L_0x0017
                r2 = r1
                androidx.paging.PageEvent$Insert$filter$1 r2 = (androidx.paging.PageEvent$Insert$filter$1) r2
                int r3 = r2.d
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L_0x0017
                int r3 = r3 - r4
                r2.d = r3
                goto L_0x001c
            L_0x0017:
                androidx.paging.PageEvent$Insert$filter$1 r2 = new androidx.paging.PageEvent$Insert$filter$1
                r2.<init>(r0, r1)
            L_0x001c:
                java.lang.Object r1 = r2.c
                kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r4 = r2.d
                r5 = 1
                if (r4 == 0) goto L_0x006d
                if (r4 != r5) goto L_0x0065
                int r4 = r2.i2
                int r6 = r2.h2
                java.lang.Object r7 = r2.g2
                java.util.Collection r7 = (java.util.Collection) r7
                java.lang.Object r8 = r2.f2
                java.lang.Object r9 = r2.e2
                java.util.Iterator r9 = (java.util.Iterator) r9
                java.lang.Object r10 = r2.d2
                java.util.List r10 = (java.util.List) r10
                java.lang.Object r11 = r2.c2
                java.util.List r11 = (java.util.List) r11
                java.lang.Object r12 = r2.b2
                h0.u.f0 r12 = (h0.u.f0) r12
                java.lang.Object r13 = r2.a2
                java.util.Iterator r13 = (java.util.Iterator) r13
                java.lang.Object r14 = r2.Z1
                java.util.Collection r14 = (java.util.Collection) r14
                java.lang.Object r15 = r2.Y1
                androidx.paging.LoadType r15 = (androidx.paging.LoadType) r15
                java.lang.Object r5 = r2.y
                androidx.paging.PageEvent$Insert r5 = (androidx.paging.PageEvent.Insert) r5
                r16 = r3
                java.lang.Object r3 = r2.x
                m0.n.a.p r3 = (m0.n.a.p) r3
                i0.j.f.p.h.d4(r1)
                r0 = r4
                r4 = r13
                r13 = r12
                r12 = r11
                r11 = r10
                r10 = r9
                r9 = r6
                r6 = r5
                r5 = r14
                goto L_0x00f9
            L_0x0065:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x006d:
                r16 = r3
                i0.j.f.p.h.d4(r1)
                androidx.paging.LoadType r1 = r0.c
                java.util.List<h0.u.f0<T>> r3 = r0.d
                java.util.ArrayList r4 = new java.util.ArrayList
                r5 = 10
                int r5 = i0.j.f.p.h.K(r3, r5)
                r4.<init>(r5)
                java.util.Iterator r3 = r3.iterator()
                r6 = r0
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r19
            L_0x008b:
                boolean r7 = r4.hasNext()
                if (r7 == 0) goto L_0x013f
                java.lang.Object r7 = r4.next()
                h0.u.f0 r7 = (h0.u.f0) r7
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                java.util.List<T> r10 = r7.d
                r11 = 0
                java.util.Iterator r10 = r10.iterator()
                r12 = r7
                r13 = r16
                r7 = r5
                r17 = r10
                r10 = r8
                r8 = r11
                r11 = r9
                r9 = r17
            L_0x00b3:
                boolean r14 = r9.hasNext()
                if (r14 == 0) goto L_0x012d
                java.lang.Object r14 = r9.next()
                int r15 = r8 + 1
                if (r8 < 0) goto L_0x0128
                java.lang.Integer r0 = new java.lang.Integer
                r0.<init>(r8)
                int r0 = r0.intValue()
                r2.x = r1
                r2.y = r6
                r2.Y1 = r3
                r2.Z1 = r5
                r2.a2 = r4
                r2.b2 = r12
                r2.c2 = r11
                r2.d2 = r10
                r2.e2 = r9
                r2.f2 = r14
                r2.g2 = r7
                r2.h2 = r15
                r2.i2 = r0
                r8 = 1
                r2.d = r8
                java.lang.Object r8 = r1.invoke(r14, r2)
                if (r8 != r13) goto L_0x00ee
                return r13
            L_0x00ee:
                r16 = r13
                r13 = r12
                r12 = r11
                r11 = r10
                r10 = r9
                r9 = r15
                r15 = r3
                r3 = r1
                r1 = r8
                r8 = r14
            L_0x00f9:
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L_0x011c
                r11.add(r8)
                java.util.List<java.lang.Integer> r1 = r13.f
                if (r1 == 0) goto L_0x0114
                java.lang.Object r1 = r1.get(r0)
                java.lang.Integer r1 = (java.lang.Integer) r1
                if (r1 == 0) goto L_0x0114
                int r0 = r1.intValue()
            L_0x0114:
                java.lang.Integer r1 = new java.lang.Integer
                r1.<init>(r0)
                r12.add(r1)
            L_0x011c:
                r0 = r18
                r1 = r3
                r8 = r9
                r9 = r10
                r10 = r11
                r11 = r12
                r12 = r13
                r3 = r15
                r13 = r16
                goto L_0x00b3
            L_0x0128:
                m0.j.g.r0()
                r0 = 0
                throw r0
            L_0x012d:
                h0.u.f0 r0 = new h0.u.f0
                int[] r8 = r12.c
                int r9 = r12.e
                r0.<init>(r8, r10, r9, r11)
                r7.add(r0)
                r0 = r18
                r16 = r13
                goto L_0x008b
            L_0x013f:
                r4 = r5
                java.util.List r4 = (java.util.List) r4
                int r5 = r6.e
                int r0 = r6.f
                h0.u.b r7 = r6.g
                androidx.paging.PageEvent$Insert r1 = new androidx.paging.PageEvent$Insert
                r2 = r1
                r6 = r0
                r2.<init>(r3, r4, r5, r6, r7)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.Insert.a(m0.n.a.p, m0.l.c):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x008a  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00d1  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <R> java.lang.Object b(m0.n.a.p<? super T, ? super m0.l.c<? super R>, ? extends java.lang.Object> r19, m0.l.c<? super androidx.paging.PageEvent<R>> r20) {
            /*
                r18 = this;
                r0 = r18
                r1 = r20
                boolean r2 = r1 instanceof androidx.paging.PageEvent$Insert$map$1
                if (r2 == 0) goto L_0x0017
                r2 = r1
                androidx.paging.PageEvent$Insert$map$1 r2 = (androidx.paging.PageEvent$Insert$map$1) r2
                int r3 = r2.d
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L_0x0017
                int r3 = r3 - r4
                r2.d = r3
                goto L_0x001c
            L_0x0017:
                androidx.paging.PageEvent$Insert$map$1 r2 = new androidx.paging.PageEvent$Insert$map$1
                r2.<init>(r0, r1)
            L_0x001c:
                java.lang.Object r1 = r2.c
                kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r4 = r2.d
                r5 = 1
                r6 = 10
                if (r4 == 0) goto L_0x006c
                if (r4 != r5) goto L_0x0064
                java.lang.Object r4 = r2.g2
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.Object r7 = r2.f2
                java.util.Collection r7 = (java.util.Collection) r7
                java.lang.Object r8 = r2.e2
                java.util.Iterator r8 = (java.util.Iterator) r8
                java.lang.Object r9 = r2.d2
                java.util.Collection r9 = (java.util.Collection) r9
                java.lang.Object r10 = r2.c2
                int[] r10 = (int[]) r10
                java.lang.Object r11 = r2.b2
                h0.u.f0 r11 = (h0.u.f0) r11
                java.lang.Object r12 = r2.a2
                java.util.Iterator r12 = (java.util.Iterator) r12
                java.lang.Object r13 = r2.Z1
                java.util.Collection r13 = (java.util.Collection) r13
                java.lang.Object r14 = r2.Y1
                androidx.paging.LoadType r14 = (androidx.paging.LoadType) r14
                java.lang.Object r15 = r2.y
                androidx.paging.PageEvent$Insert r15 = (androidx.paging.PageEvent.Insert) r15
                java.lang.Object r5 = r2.x
                m0.n.a.p r5 = (m0.n.a.p) r5
                i0.j.f.p.h.d4(r1)
                r16 = r11
                r11 = r8
                r8 = r15
                r15 = 1
                r17 = r14
                r14 = r9
                r9 = r17
                goto L_0x00d9
            L_0x0064:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x006c:
                i0.j.f.p.h.d4(r1)
                androidx.paging.LoadType r1 = r0.c
                java.util.List<h0.u.f0<T>> r4 = r0.d
                java.util.ArrayList r5 = new java.util.ArrayList
                int r7 = i0.j.f.p.h.K(r4, r6)
                r5.<init>(r7)
                java.util.Iterator r4 = r4.iterator()
                r7 = r0
                r8 = r1
                r1 = r19
            L_0x0084:
                boolean r9 = r4.hasNext()
                if (r9 == 0) goto L_0x00f7
                java.lang.Object r9 = r4.next()
                h0.u.f0 r9 = (h0.u.f0) r9
                int[] r10 = r9.c
                java.util.List<T> r11 = r9.d
                java.util.ArrayList r12 = new java.util.ArrayList
                int r13 = i0.j.f.p.h.K(r11, r6)
                r12.<init>(r13)
                java.util.Iterator r11 = r11.iterator()
                r13 = r9
                r9 = r8
                r8 = r7
                r7 = r5
                r5 = r4
                r4 = r7
            L_0x00a7:
                boolean r14 = r11.hasNext()
                if (r14 == 0) goto L_0x00e3
                java.lang.Object r14 = r11.next()
                r2.x = r1
                r2.y = r8
                r2.Y1 = r9
                r2.Z1 = r7
                r2.a2 = r5
                r2.b2 = r13
                r2.c2 = r10
                r2.d2 = r12
                r2.e2 = r11
                r2.f2 = r12
                r2.g2 = r4
                r15 = 1
                r2.d = r15
                java.lang.Object r14 = r1.invoke(r14, r2)
                if (r14 != r3) goto L_0x00d1
                return r3
            L_0x00d1:
                r16 = r13
                r13 = r7
                r7 = r12
                r12 = r5
                r5 = r1
                r1 = r14
                r14 = r7
            L_0x00d9:
                r7.add(r1)
                r1 = r5
                r5 = r12
                r7 = r13
                r12 = r14
                r13 = r16
                goto L_0x00a7
            L_0x00e3:
                r15 = 1
                java.util.List r12 = (java.util.List) r12
                int r11 = r13.e
                java.util.List<java.lang.Integer> r13 = r13.f
                h0.u.f0 r14 = new h0.u.f0
                r14.<init>(r10, r12, r11, r13)
                r4.add(r14)
                r4 = r5
                r5 = r7
                r7 = r8
                r8 = r9
                goto L_0x0084
            L_0x00f7:
                r9 = r5
                java.util.List r9 = (java.util.List) r9
                int r10 = r7.e
                int r11 = r7.f
                h0.u.b r12 = r7.g
                androidx.paging.PageEvent$Insert r1 = new androidx.paging.PageEvent$Insert
                r7 = r1
                r7.<init>(r8, r9, r10, r11, r12)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.Insert.b(m0.n.a.p, m0.l.c):java.lang.Object");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Insert)) {
                return false;
            }
            Insert insert = (Insert) obj;
            return i.a(this.c, insert.c) && i.a(this.d, insert.d) && this.e == insert.e && this.f == insert.f && i.a(this.g, insert.g);
        }

        public int hashCode() {
            LoadType loadType = this.c;
            int i = 0;
            int hashCode = (loadType != null ? loadType.hashCode() : 0) * 31;
            List<f0<T>> list = this.d;
            int M = i0.d.a.a.a.M(this.f, i0.d.a.a.a.M(this.e, (hashCode + (list != null ? list.hashCode() : 0)) * 31, 31), 31);
            h0.u.b bVar = this.g;
            if (bVar != null) {
                i = bVar.hashCode();
            }
            return M + i;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Insert(loadType=");
            P0.append(this.c);
            P0.append(", pages=");
            P0.append(this.d);
            P0.append(", placeholdersBefore=");
            P0.append(this.e);
            P0.append(", placeholdersAfter=");
            P0.append(this.f);
            P0.append(", combinedLoadStates=");
            P0.append(this.g);
            P0.append(")");
            return P0.toString();
        }
    }

    /* compiled from: PageEvent.kt */
    public static final class a<T> extends PageEvent<T> {
        public final LoadType a;
        public final int b;
        public final int c;
        public final int d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(LoadType loadType, int i, int i2, int i3) {
            super((f) null);
            i.e(loadType, "loadType");
            this.a = loadType;
            this.b = i;
            this.c = i2;
            this.d = i3;
            boolean z = true;
            if (loadType != LoadType.REFRESH) {
                if (c() > 0) {
                    if (!(i3 < 0 ? false : z)) {
                        throw new IllegalArgumentException(i0.d.a.a.a.e0("Invalid placeholdersRemaining ", i3).toString());
                    }
                    return;
                }
                StringBuilder P0 = i0.d.a.a.a.P0("Drop count must be > 0, but was ");
                P0.append(c());
                throw new IllegalArgumentException(P0.toString().toString());
            }
            throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND".toString());
        }

        public final int c() {
            return (this.c - this.b) + 1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return i.a(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public int hashCode() {
            LoadType loadType = this.a;
            return Integer.hashCode(this.d) + i0.d.a.a.a.M(this.c, i0.d.a.a.a.M(this.b, (loadType != null ? loadType.hashCode() : 0) * 31, 31), 31);
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Drop(loadType=");
            P0.append(this.a);
            P0.append(", minPageOffset=");
            P0.append(this.b);
            P0.append(", maxPageOffset=");
            P0.append(this.c);
            P0.append(", placeholdersRemaining=");
            return i0.d.a.a.a.u0(P0, this.d, ")");
        }
    }

    /* compiled from: PageEvent.kt */
    public static final class b<T> extends PageEvent<T> {
        public final LoadType a;
        public final boolean b;
        public final j c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(LoadType loadType, boolean z, j jVar) {
            super((f) null);
            i.e(loadType, "loadType");
            i.e(jVar, "loadState");
            this.a = loadType;
            this.b = z;
            this.c = jVar;
            if (!(loadType != LoadType.REFRESH || z || !(jVar instanceof j.c) || !jVar.a)) {
                throw new IllegalArgumentException("LoadStateUpdate for local REFRESH may not set endOfPaginationReached = true".toString());
            } else if (!c(jVar, z)) {
                throw new IllegalArgumentException("LoadStateUpdates cannot be used to dispatch NotLoading unless it is from remote mediator and remote mediator reached end of pagination.".toString());
            }
        }

        public static final boolean c(j jVar, boolean z) {
            i.e(jVar, "loadState");
            return (jVar instanceof j.b) || (jVar instanceof j.a) || z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return i.a(this.a, bVar.a) && this.b == bVar.b && i.a(this.c, bVar.c);
        }

        public int hashCode() {
            LoadType loadType = this.a;
            int i = 0;
            int hashCode = (loadType != null ? loadType.hashCode() : 0) * 31;
            boolean z = this.b;
            if (z) {
                z = true;
            }
            int i2 = (hashCode + (z ? 1 : 0)) * 31;
            j jVar = this.c;
            if (jVar != null) {
                i = jVar.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("LoadStateUpdate(loadType=");
            P0.append(this.a);
            P0.append(", fromMediator=");
            P0.append(this.b);
            P0.append(", loadState=");
            P0.append(this.c);
            P0.append(")");
            return P0.toString();
        }
    }

    public PageEvent() {
    }

    public Object a(p<? super T, ? super c<? super Boolean>, ? extends Object> pVar, c<? super PageEvent<T>> cVar) {
        return this;
    }

    public <R> Object b(p<? super T, ? super c<? super R>, ? extends Object> pVar, c<? super PageEvent<R>> cVar) {
        return this;
    }

    public PageEvent(f fVar) {
    }
}
