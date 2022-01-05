package androidx.paging.multicast;

import androidx.paging.multicast.ChannelManager;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.g2.d;
import n0.a.g2.e;

@c(c = "androidx.paging.multicast.Multicaster$flow$1$invokeSuspend$$inlined$transform$1", f = "Multicaster.kt", l = {215}, m = "invokeSuspend")
/* compiled from: Emitters.kt */
public final class Multicaster$flow$1$invokeSuspend$$inlined$transform$1 extends SuspendLambda implements p<e<? super T>, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ d q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Multicaster$flow$1$invokeSuspend$$inlined$transform$1(d dVar, m0.l.c cVar) {
        super(2, cVar);
        this.q = dVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        Multicaster$flow$1$invokeSuspend$$inlined$transform$1 multicaster$flow$1$invokeSuspend$$inlined$transform$1 = new Multicaster$flow$1$invokeSuspend$$inlined$transform$1(this.q, cVar);
        multicaster$flow$1$invokeSuspend$$inlined$transform$1.c = obj;
        return multicaster$flow$1$invokeSuspend$$inlined$transform$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        Multicaster$flow$1$invokeSuspend$$inlined$transform$1 multicaster$flow$1$invokeSuspend$$inlined$transform$1 = new Multicaster$flow$1$invokeSuspend$$inlined$transform$1(this.q, (m0.l.c) obj2);
        multicaster$flow$1$invokeSuspend$$inlined$transform$1.c = obj;
        return multicaster$flow$1$invokeSuspend$$inlined$transform$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            h.d4(obj);
            final e eVar = (e) this.c;
            d dVar = this.q;
            AnonymousClass1 r3 = new e<ChannelManager.b.C0004b.c<T>>(this) {
                /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Object emit(java.lang.Object r5, m0.l.c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.paging.multicast.Multicaster$flow$1$invokeSuspend$$inlined$transform$1.AnonymousClass1.AnonymousClass1
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        androidx.paging.multicast.Multicaster$flow$1$invokeSuspend$$inlined$transform$1$1$1 r0 = (androidx.paging.multicast.Multicaster$flow$1$invokeSuspend$$inlined$transform$1.AnonymousClass1.AnonymousClass1) r0
                        int r1 = r0.d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.d = r1
                        goto L_0x0018
                    L_0x0013:
                        androidx.paging.multicast.Multicaster$flow$1$invokeSuspend$$inlined$transform$1$1$1 r0 = new androidx.paging.multicast.Multicaster$flow$1$invokeSuspend$$inlined$transform$1$1$1
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.c
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r2 = r0.d
                        r3 = 1
                        if (r2 == 0) goto L_0x0033
                        if (r2 != r3) goto L_0x002b
                        java.lang.Object r5 = r0.x
                        androidx.paging.multicast.ChannelManager$b$b$c r5 = (androidx.paging.multicast.ChannelManager.b.C0004b.c) r5
                        i0.j.f.p.h.d4(r6)
                        goto L_0x0047
                    L_0x002b:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0033:
                        i0.j.f.p.h.d4(r6)
                        n0.a.g2.e r6 = r5
                        androidx.paging.multicast.ChannelManager$b$b$c r5 = (androidx.paging.multicast.ChannelManager.b.C0004b.c) r5
                        T r2 = r5.a
                        r0.x = r5
                        r0.d = r3
                        java.lang.Object r6 = r6.emit(r2, r0)
                        if (r6 != r1) goto L_0x0047
                        return r1
                    L_0x0047:
                        n0.a.v<m0.i> r5 = r5.b
                        m0.i r6 = m0.i.a
                        r5.H(r6)
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.multicast.Multicaster$flow$1$invokeSuspend$$inlined$transform$1.AnonymousClass1.emit(java.lang.Object, m0.l.c):java.lang.Object");
                }
            };
            this.d = 1;
            if (dVar.collect(r3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
