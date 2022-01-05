package androidx.paging.multicast;

import com.pubnub.api.endpoints.objects_api.utils.Include;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineStart;
import m0.i;
import m0.l.c;
import m0.l.e;
import m0.n.a.p;
import m0.n.b.f;
import n0.a.f0;
import n0.a.f2.r;
import n0.a.g2.d;
import n0.a.v;

/* compiled from: ChannelManager.kt */
public final class ChannelManager<T> {
    public final ChannelManager<T>.Actor a = new Actor();
    public final f0 b;
    public final int c;
    public final boolean d;
    public final p<T, c<? super i>, Object> e;
    public final boolean f;
    public final d<T> g;

    /* compiled from: ChannelManager.kt */
    public final class Actor extends StoreRealActor<b<T>> {
        public final h0.u.i0.a<T> f;
        public SharedFlowProducer<T> g;
        public boolean h;
        public v<i> i;
        public final List<a<T>> j;

        public Actor() {
            super(ChannelManager.this.b);
            h0.u.i0.a<T> aVar;
            int i2 = ChannelManager.this.c;
            if (i2 > 0) {
                aVar = new h0.u.i0.b<>(i2);
            } else {
                aVar = new h0.u.i0.d<>();
            }
            this.f = aVar;
            this.j = new ArrayList();
        }

        public void d() {
            for (a a : this.j) {
                a.a();
            }
            this.j.clear();
            SharedFlowProducer<T> sharedFlowProducer = this.g;
            if (sharedFlowProducer != null) {
                m0.r.t.a.r.m.a1.a.o0(sharedFlowProducer.a, (CancellationException) null, 1, (Object) null);
            }
        }

        public final void f() {
            if (this.g == null) {
                ChannelManager channelManager = ChannelManager.this;
                SharedFlowProducer<T> sharedFlowProducer = new SharedFlowProducer<>(channelManager.b, channelManager.g, new ChannelManager$Actor$newProducer$1(this));
                this.g = sharedFlowProducer;
                this.h = false;
                m0.n.b.i.c(sharedFlowProducer);
                m0.r.t.a.r.m.a1.a.E2(sharedFlowProducer.b, (e) null, (CoroutineStart) null, new SharedFlowProducer$start$1(sharedFlowProducer, (c) null), 3, (Object) null);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00e6  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object g(androidx.paging.multicast.ChannelManager.a<T> r7, m0.l.c<? super m0.i> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof androidx.paging.multicast.ChannelManager$Actor$addEntry$1
                if (r0 == 0) goto L_0x0013
                r0 = r8
                androidx.paging.multicast.ChannelManager$Actor$addEntry$1 r0 = (androidx.paging.multicast.ChannelManager$Actor$addEntry$1) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.d = r1
                goto L_0x0018
            L_0x0013:
                androidx.paging.multicast.ChannelManager$Actor$addEntry$1 r0 = new androidx.paging.multicast.ChannelManager$Actor$addEntry$1
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.c
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.d
                r3 = 1
                if (r2 == 0) goto L_0x0038
                if (r2 != r3) goto L_0x0030
                java.lang.Object r7 = r0.y
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r2 = r0.x
                androidx.paging.multicast.ChannelManager$a r2 = (androidx.paging.multicast.ChannelManager.a) r2
                i0.j.f.p.h.d4(r8)
                goto L_0x009b
            L_0x0030:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0038:
                i0.j.f.p.h.d4(r8)
                java.util.List<androidx.paging.multicast.ChannelManager$a<T>> r8 = r6.j
                boolean r2 = r8 instanceof java.util.Collection
                r4 = 0
                if (r2 == 0) goto L_0x0049
                boolean r2 = r8.isEmpty()
                if (r2 == 0) goto L_0x0049
                goto L_0x0075
            L_0x0049:
                java.util.Iterator r8 = r8.iterator()
            L_0x004d:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L_0x0075
                java.lang.Object r2 = r8.next()
                androidx.paging.multicast.ChannelManager$a r2 = (androidx.paging.multicast.ChannelManager.a) r2
                java.util.Objects.requireNonNull(r2)
                java.lang.String r5 = "entry"
                m0.n.b.i.e(r7, r5)
                n0.a.f2.r<androidx.paging.multicast.ChannelManager$b$b$c<T>> r2 = r2.a
                n0.a.f2.r<androidx.paging.multicast.ChannelManager$b$b$c<T>> r5 = r7.a
                if (r2 != r5) goto L_0x0069
                r2 = r3
                goto L_0x006a
            L_0x0069:
                r2 = r4
            L_0x006a:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L_0x004d
                goto L_0x0076
            L_0x0075:
                r4 = r3
            L_0x0076:
                if (r4 == 0) goto L_0x00e6
                boolean r8 = r7.b
                r8 = r8 ^ r3
                if (r8 == 0) goto L_0x00cb
                java.util.List<androidx.paging.multicast.ChannelManager$a<T>> r8 = r6.j
                r8.add(r7)
                h0.u.i0.a<T> r8 = r6.f
                java.util.Collection r8 = r8.b()
                boolean r8 = r8.isEmpty()
                r8 = r8 ^ r3
                if (r8 == 0) goto L_0x00bf
                h0.u.i0.a<T> r8 = r6.f
                java.util.Collection r8 = r8.b()
                java.util.Iterator r8 = r8.iterator()
                r2 = r7
                r7 = r8
            L_0x009b:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x00c8
                java.lang.Object r8 = r7.next()
                androidx.paging.multicast.ChannelManager$b$b$c r8 = (androidx.paging.multicast.ChannelManager.b.C0004b.c) r8
                r0.x = r2
                r0.y = r7
                r0.d = r3
                r2.b = r3
                n0.a.f2.r<androidx.paging.multicast.ChannelManager$b$b$c<T>> r4 = r2.a
                java.lang.Object r8 = r4.t(r8, r0)
                kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                if (r8 != r4) goto L_0x00ba
                goto L_0x00bc
            L_0x00ba:
                m0.i r8 = m0.i.a
            L_0x00bc:
                if (r8 != r1) goto L_0x009b
                return r1
            L_0x00bf:
                n0.a.v<m0.i> r7 = r6.i
                if (r7 == 0) goto L_0x00c8
                m0.i r8 = m0.i.a
                r7.H(r8)
            L_0x00c8:
                m0.i r7 = m0.i.a
                return r7
            L_0x00cb:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r7)
                java.lang.String r7 = " already received a value"
                r8.append(r7)
                java.lang.String r7 = r8.toString()
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r7 = r7.toString()
                r8.<init>(r7)
                throw r8
            L_0x00e6:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r7)
                java.lang.String r7 = " is already in the list."
                r8.append(r7)
                java.lang.String r7 = r8.toString()
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r7 = r7.toString()
                r8.<init>(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.multicast.ChannelManager.Actor.g(androidx.paging.multicast.ChannelManager$a, m0.l.c):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object h(androidx.paging.multicast.ChannelManager.b.a<T> r6, m0.l.c<? super m0.i> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof androidx.paging.multicast.ChannelManager$Actor$doAdd$1
                if (r0 == 0) goto L_0x0013
                r0 = r7
                androidx.paging.multicast.ChannelManager$Actor$doAdd$1 r0 = (androidx.paging.multicast.ChannelManager$Actor$doAdd$1) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.d = r1
                goto L_0x0018
            L_0x0013:
                androidx.paging.multicast.ChannelManager$Actor$doAdd$1 r0 = new androidx.paging.multicast.ChannelManager$Actor$doAdd$1
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.c
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.d
                r3 = 1
                if (r2 == 0) goto L_0x0033
                if (r2 != r3) goto L_0x002b
                java.lang.Object r6 = r0.x
                androidx.paging.multicast.ChannelManager$Actor r6 = (androidx.paging.multicast.ChannelManager.Actor) r6
                i0.j.f.p.h.d4(r7)
                goto L_0x004b
            L_0x002b:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0033:
                i0.j.f.p.h.d4(r7)
                androidx.paging.multicast.ChannelManager$a r7 = new androidx.paging.multicast.ChannelManager$a
                n0.a.f2.r<androidx.paging.multicast.ChannelManager$b$b$c<T>> r6 = r6.a
                r2 = 0
                r4 = 2
                r7.<init>(r6, r2, r4)
                r0.x = r5
                r0.d = r3
                java.lang.Object r6 = r5.g(r7, r0)
                if (r6 != r1) goto L_0x004a
                return r1
            L_0x004a:
                r6 = r5
            L_0x004b:
                r6.f()
                m0.i r6 = m0.i.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.multicast.ChannelManager.Actor.h(androidx.paging.multicast.ChannelManager$b$a, m0.l.c):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object i(androidx.paging.multicast.ChannelManager.b.C0004b.c<T> r7, m0.l.c<? super m0.i> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof androidx.paging.multicast.ChannelManager$Actor$doDispatchValue$1
                if (r0 == 0) goto L_0x0013
                r0 = r8
                androidx.paging.multicast.ChannelManager$Actor$doDispatchValue$1 r0 = (androidx.paging.multicast.ChannelManager$Actor$doDispatchValue$1) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.d = r1
                goto L_0x0018
            L_0x0013:
                androidx.paging.multicast.ChannelManager$Actor$doDispatchValue$1 r0 = new androidx.paging.multicast.ChannelManager$Actor$doDispatchValue$1
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.c
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.d
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0046
                if (r2 == r4) goto L_0x003a
                if (r2 != r3) goto L_0x0032
                java.lang.Object r7 = r0.y
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r2 = r0.x
                androidx.paging.multicast.ChannelManager$b$b$c r2 = (androidx.paging.multicast.ChannelManager.b.C0004b.c) r2
                i0.j.f.p.h.d4(r8)
                goto L_0x0078
            L_0x0032:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x003a:
                java.lang.Object r7 = r0.y
                androidx.paging.multicast.ChannelManager$b$b$c r7 = (androidx.paging.multicast.ChannelManager.b.C0004b.c) r7
                java.lang.Object r2 = r0.x
                androidx.paging.multicast.ChannelManager$Actor r2 = (androidx.paging.multicast.ChannelManager.Actor) r2
                i0.j.f.p.h.d4(r8)
                goto L_0x005d
            L_0x0046:
                i0.j.f.p.h.d4(r8)
                androidx.paging.multicast.ChannelManager r8 = androidx.paging.multicast.ChannelManager.this
                m0.n.a.p<T, m0.l.c<? super m0.i>, java.lang.Object> r8 = r8.e
                T r2 = r7.a
                r0.x = r6
                r0.y = r7
                r0.d = r4
                java.lang.Object r8 = r8.invoke(r2, r0)
                if (r8 != r1) goto L_0x005c
                return r1
            L_0x005c:
                r2 = r6
            L_0x005d:
                h0.u.i0.a<T> r8 = r2.f
                r8.a(r7)
                r2.h = r4
                h0.u.i0.a<T> r8 = r2.f
                boolean r8 = r8.isEmpty()
                if (r8 == 0) goto L_0x0070
                n0.a.v<m0.i> r8 = r7.b
                r2.i = r8
            L_0x0070:
                java.util.List<androidx.paging.multicast.ChannelManager$a<T>> r8 = r2.j
                java.util.Iterator r8 = r8.iterator()
                r2 = r7
                r7 = r8
            L_0x0078:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x009c
                java.lang.Object r8 = r7.next()
                androidx.paging.multicast.ChannelManager$a r8 = (androidx.paging.multicast.ChannelManager.a) r8
                r0.x = r2
                r0.y = r7
                r0.d = r3
                r8.b = r4
                n0.a.f2.r<androidx.paging.multicast.ChannelManager$b$b$c<T>> r8 = r8.a
                java.lang.Object r8 = r8.t(r2, r0)
                kotlin.coroutines.intrinsics.CoroutineSingletons r5 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                if (r8 != r5) goto L_0x0097
                goto L_0x0099
            L_0x0097:
                m0.i r8 = m0.i.a
            L_0x0099:
                if (r8 != r1) goto L_0x0078
                return r1
            L_0x009c:
                m0.i r7 = m0.i.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.multicast.ChannelManager.Actor.i(androidx.paging.multicast.ChannelManager$b$b$c, m0.l.c):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object j(n0.a.f2.r<? super androidx.paging.multicast.ChannelManager.b.C0004b.c<T>> r8, m0.l.c<? super m0.i> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof androidx.paging.multicast.ChannelManager$Actor$doRemove$1
                if (r0 == 0) goto L_0x0013
                r0 = r9
                androidx.paging.multicast.ChannelManager$Actor$doRemove$1 r0 = (androidx.paging.multicast.ChannelManager$Actor$doRemove$1) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.d = r1
                goto L_0x0018
            L_0x0013:
                androidx.paging.multicast.ChannelManager$Actor$doRemove$1 r0 = new androidx.paging.multicast.ChannelManager$Actor$doRemove$1
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.c
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.d
                r3 = 1
                if (r2 == 0) goto L_0x0030
                if (r2 != r3) goto L_0x0028
                i0.j.f.p.h.d4(r9)
                goto L_0x0099
            L_0x0028:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x0030:
                i0.j.f.p.h.d4(r9)
                java.util.List<androidx.paging.multicast.ChannelManager$a<T>> r9 = r7.j
                java.util.Iterator r9 = r9.iterator()
                r2 = 0
                r4 = r2
            L_0x003b:
                boolean r5 = r9.hasNext()
                if (r5 == 0) goto L_0x0064
                java.lang.Object r5 = r9.next()
                androidx.paging.multicast.ChannelManager$a r5 = (androidx.paging.multicast.ChannelManager.a) r5
                java.util.Objects.requireNonNull(r5)
                java.lang.String r6 = "channel"
                m0.n.b.i.e(r8, r6)
                n0.a.f2.r<androidx.paging.multicast.ChannelManager$b$b$c<T>> r5 = r5.a
                if (r5 != r8) goto L_0x0055
                r5 = r3
                goto L_0x0056
            L_0x0055:
                r5 = r2
            L_0x0056:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L_0x0061
                goto L_0x0065
            L_0x0061:
                int r4 = r4 + 1
                goto L_0x003b
            L_0x0064:
                r4 = -1
            L_0x0065:
                if (r4 < 0) goto L_0x0099
                java.util.List<androidx.paging.multicast.ChannelManager$a<T>> r8 = r7.j
                r8.remove(r4)
                java.util.List<androidx.paging.multicast.ChannelManager$a<T>> r8 = r7.j
                boolean r8 = r8.isEmpty()
                if (r8 == 0) goto L_0x0099
                androidx.paging.multicast.ChannelManager r8 = androidx.paging.multicast.ChannelManager.this
                boolean r8 = r8.f
                if (r8 != 0) goto L_0x0099
                androidx.paging.multicast.SharedFlowProducer<T> r8 = r7.g
                if (r8 == 0) goto L_0x0099
                r0.d = r3
                n0.a.f1 r8 = r8.a
                r9 = 0
                m0.r.t.a.r.m.a1.a.o0(r8, r9, r3, r9)
                java.lang.Object r8 = r8.l(r0)
                kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                if (r8 != r9) goto L_0x008f
                goto L_0x0091
            L_0x008f:
                m0.i r8 = m0.i.a
            L_0x0091:
                if (r8 != r9) goto L_0x0094
                goto L_0x0096
            L_0x0094:
                m0.i r8 = m0.i.a
            L_0x0096:
                if (r8 != r1) goto L_0x0099
                return r1
            L_0x0099:
                m0.i r8 = m0.i.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.multicast.ChannelManager.Actor.j(n0.a.f2.r, m0.l.c):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object c(androidx.paging.multicast.ChannelManager.b<T> r7, m0.l.c<? super m0.i> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof androidx.paging.multicast.ChannelManager$Actor$handle$1
                if (r0 == 0) goto L_0x0013
                r0 = r8
                androidx.paging.multicast.ChannelManager$Actor$handle$1 r0 = (androidx.paging.multicast.ChannelManager$Actor$handle$1) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.d = r1
                goto L_0x0018
            L_0x0013:
                androidx.paging.multicast.ChannelManager$Actor$handle$1 r0 = new androidx.paging.multicast.ChannelManager$Actor$handle$1
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.c
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.d
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 == r5) goto L_0x0032
                if (r2 == r4) goto L_0x0032
                if (r2 != r3) goto L_0x002a
                goto L_0x0032
            L_0x002a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0032:
                i0.j.f.p.h.d4(r8)
                goto L_0x0102
            L_0x0037:
                i0.j.f.p.h.d4(r8)
                boolean r8 = r7 instanceof androidx.paging.multicast.ChannelManager.b.a
                if (r8 == 0) goto L_0x0049
                androidx.paging.multicast.ChannelManager$b$a r7 = (androidx.paging.multicast.ChannelManager.b.a) r7
                r0.d = r5
                java.lang.Object r7 = r6.h(r7, r0)
                if (r7 != r1) goto L_0x0102
                return r1
            L_0x0049:
                boolean r8 = r7 instanceof androidx.paging.multicast.ChannelManager.b.c
                if (r8 == 0) goto L_0x005a
                androidx.paging.multicast.ChannelManager$b$c r7 = (androidx.paging.multicast.ChannelManager.b.c) r7
                n0.a.f2.r<androidx.paging.multicast.ChannelManager$b$b$c<T>> r7 = r7.a
                r0.d = r4
                java.lang.Object r7 = r6.j(r7, r0)
                if (r7 != r1) goto L_0x0102
                return r1
            L_0x005a:
                boolean r8 = r7 instanceof androidx.paging.multicast.ChannelManager.b.C0004b.c
                if (r8 == 0) goto L_0x0069
                androidx.paging.multicast.ChannelManager$b$b$c r7 = (androidx.paging.multicast.ChannelManager.b.C0004b.c) r7
                r0.d = r3
                java.lang.Object r7 = r6.i(r7, r0)
                if (r7 != r1) goto L_0x0102
                return r1
            L_0x0069:
                boolean r8 = r7 instanceof androidx.paging.multicast.ChannelManager.b.C0004b.a
                if (r8 == 0) goto L_0x0095
                androidx.paging.multicast.ChannelManager$b$b$a r7 = (androidx.paging.multicast.ChannelManager.b.C0004b.a) r7
                r6.h = r5
                java.util.List<androidx.paging.multicast.ChannelManager$a<T>> r8 = r6.j
                java.util.Iterator r8 = r8.iterator()
            L_0x0077:
                boolean r0 = r8.hasNext()
                if (r0 == 0) goto L_0x0102
                java.lang.Object r0 = r8.next()
                androidx.paging.multicast.ChannelManager$a r0 = (androidx.paging.multicast.ChannelManager.a) r0
                java.lang.Throwable r1 = r7.a
                java.util.Objects.requireNonNull(r0)
                java.lang.String r2 = "error"
                m0.n.b.i.e(r1, r2)
                r0.b = r5
                n0.a.f2.r<androidx.paging.multicast.ChannelManager$b$b$c<T>> r0 = r0.a
                r0.o(r1)
                goto L_0x0077
            L_0x0095:
                boolean r8 = r7 instanceof androidx.paging.multicast.ChannelManager.b.C0004b.C0005b
                if (r8 == 0) goto L_0x0102
                androidx.paging.multicast.ChannelManager$b$b$b r7 = (androidx.paging.multicast.ChannelManager.b.C0004b.C0005b) r7
                androidx.paging.multicast.SharedFlowProducer<T> r7 = r7.a
                androidx.paging.multicast.SharedFlowProducer<T> r8 = r6.g
                if (r8 == r7) goto L_0x00a2
                goto L_0x0102
            L_0x00a2:
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.List<androidx.paging.multicast.ChannelManager$a<T>> r0 = r6.j
                java.util.Iterator r0 = r0.iterator()
            L_0x00b2:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x00e6
                java.lang.Object r1 = r0.next()
                androidx.paging.multicast.ChannelManager$a r1 = (androidx.paging.multicast.ChannelManager.a) r1
                boolean r2 = r1.b
                if (r2 == 0) goto L_0x00d0
                androidx.paging.multicast.ChannelManager r2 = androidx.paging.multicast.ChannelManager.this
                boolean r2 = r2.d
                if (r2 != 0) goto L_0x00cc
                r1.a()
                goto L_0x00b2
            L_0x00cc:
                r7.add(r1)
                goto L_0x00b2
            L_0x00d0:
                boolean r2 = r6.h
                if (r2 == 0) goto L_0x00d8
                r8.add(r1)
                goto L_0x00b2
            L_0x00d8:
                androidx.paging.multicast.ChannelManager r2 = androidx.paging.multicast.ChannelManager.this
                boolean r2 = r2.d
                if (r2 != 0) goto L_0x00e2
                r1.a()
                goto L_0x00b2
            L_0x00e2:
                r7.add(r1)
                goto L_0x00b2
            L_0x00e6:
                java.util.List<androidx.paging.multicast.ChannelManager$a<T>> r0 = r6.j
                r0.clear()
                java.util.List<androidx.paging.multicast.ChannelManager$a<T>> r0 = r6.j
                r0.addAll(r8)
                java.util.List<androidx.paging.multicast.ChannelManager$a<T>> r0 = r6.j
                r0.addAll(r7)
                r7 = 0
                r6.g = r7
                boolean r7 = r8.isEmpty()
                r7 = r7 ^ r5
                if (r7 == 0) goto L_0x0102
                r6.f()
            L_0x0102:
                m0.i r7 = m0.i.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.multicast.ChannelManager.Actor.c(androidx.paging.multicast.ChannelManager$b, m0.l.c):java.lang.Object");
        }
    }

    /* compiled from: ChannelManager.kt */
    public static final class a<T> {
        public final r<b.C0004b.c<T>> a;
        public boolean b;

        public a(r rVar, boolean z, int i) {
            z = (i & 2) != 0 ? false : z;
            m0.n.b.i.e(rVar, Include.INCLUDE_CHANNEL_PARAM_VALUE);
            this.a = rVar;
            this.b = z;
        }

        public final void a() {
            m0.r.t.a.r.m.a1.a.D0(this.a, (Throwable) null, 1, (Object) null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m0.n.b.i.a(this.a, aVar.a) && this.b == aVar.b;
        }

        public int hashCode() {
            r<b.C0004b.c<T>> rVar = this.a;
            int hashCode = (rVar != null ? rVar.hashCode() : 0) * 31;
            boolean z = this.b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("ChannelEntry(channel=");
            P0.append(this.a);
            P0.append(", _receivedValue=");
            return i0.d.a.a.a.D0(P0, this.b, ")");
        }
    }

    /* compiled from: ChannelManager.kt */
    public static abstract class b<T> {

        /* compiled from: ChannelManager.kt */
        public static final class a<T> extends b<T> {
            public final r<C0004b.c<T>> a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(r<? super C0004b.c<T>> rVar) {
                super((f) null);
                m0.n.b.i.e(rVar, Include.INCLUDE_CHANNEL_PARAM_VALUE);
                this.a = rVar;
            }
        }

        /* renamed from: androidx.paging.multicast.ChannelManager$b$b  reason: collision with other inner class name */
        /* compiled from: ChannelManager.kt */
        public static abstract class C0004b<T> extends b<T> {

            /* renamed from: androidx.paging.multicast.ChannelManager$b$b$a */
            /* compiled from: ChannelManager.kt */
            public static final class a<T> extends C0004b<T> {
                public final Throwable a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public a(Throwable th) {
                    super((f) null);
                    m0.n.b.i.e(th, "error");
                    this.a = th;
                }
            }

            /* renamed from: androidx.paging.multicast.ChannelManager$b$b$b  reason: collision with other inner class name */
            /* compiled from: ChannelManager.kt */
            public static final class C0005b<T> extends C0004b<T> {
                public final SharedFlowProducer<T> a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0005b(SharedFlowProducer<T> sharedFlowProducer) {
                    super((f) null);
                    m0.n.b.i.e(sharedFlowProducer, "producer");
                    this.a = sharedFlowProducer;
                }
            }

            /* renamed from: androidx.paging.multicast.ChannelManager$b$b$c */
            /* compiled from: ChannelManager.kt */
            public static final class c<T> extends C0004b<T> {
                public final T a;
                public final v<i> b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public c(T t, v<i> vVar) {
                    super((f) null);
                    m0.n.b.i.e(vVar, "delivered");
                    this.a = t;
                    this.b = vVar;
                }
            }

            public C0004b(f fVar) {
                super((f) null);
            }
        }

        /* compiled from: ChannelManager.kt */
        public static final class c<T> extends b<T> {
            public final r<C0004b.c<T>> a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(r<? super C0004b.c<T>> rVar) {
                super((f) null);
                m0.n.b.i.e(rVar, Include.INCLUDE_CHANNEL_PARAM_VALUE);
                this.a = rVar;
            }
        }

        public b() {
        }

        public b(f fVar) {
        }
    }

    public ChannelManager(f0 f0Var, int i, boolean z, p<? super T, ? super c<? super i>, ? extends Object> pVar, boolean z2, d<? extends T> dVar) {
        m0.n.b.i.e(f0Var, "scope");
        m0.n.b.i.e(pVar, "onEach");
        m0.n.b.i.e(dVar, "upstream");
        this.b = f0Var;
        this.c = i;
        this.d = z;
        this.e = pVar;
        this.f = z2;
        this.g = dVar;
    }
}
