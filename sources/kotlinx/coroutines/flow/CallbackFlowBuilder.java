package kotlinx.coroutines.flow;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import m0.i;
import m0.l.c;
import m0.l.e;
import m0.n.a.p;
import n0.a.f2.l;
import n0.a.g2.b;
import n0.a.g2.d0.d;

/* compiled from: Builders.kt */
public final class CallbackFlowBuilder<T> extends b<T> {
    public final p<l<? super T>, c<? super i>, Object> y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallbackFlowBuilder(p pVar, e eVar, int i, BufferOverflow bufferOverflow, int i2) {
        super(pVar, (i2 & 2) != 0 ? EmptyCoroutineContext.c : null, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : null);
        this.y = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object g(n0.a.f2.l<? super T> r5, m0.l.c<? super m0.i> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 r0 = (kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 r0 = new kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.c
            n0.a.f2.l r5 = (n0.a.f2.l) r5
            i0.j.f.p.h.d4(r6)
            goto L_0x0048
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            i0.j.f.p.h.d4(r6)
            r0.c = r5
            r0.x = r3
            m0.n.a.p<n0.a.f2.l<? super T>, m0.l.c<? super m0.i>, java.lang.Object> r6 = r4.x
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            m0.i r6 = m0.i.a
        L_0x0045:
            if (r6 != r1) goto L_0x0048
            return r1
        L_0x0048:
            boolean r5 = r5.u()
            if (r5 == 0) goto L_0x0051
            m0.i r5 = m0.i.a
            return r5
        L_0x0051:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.CallbackFlowBuilder.g(n0.a.f2.l, m0.l.c):java.lang.Object");
    }

    public d<T> h(e eVar, int i, BufferOverflow bufferOverflow) {
        return new CallbackFlowBuilder(this.y, eVar, i, bufferOverflow);
    }

    public CallbackFlowBuilder(p<? super l<? super T>, ? super c<? super i>, ? extends Object> pVar, e eVar, int i, BufferOverflow bufferOverflow) {
        super(pVar, eVar, i, bufferOverflow);
        this.y = pVar;
    }
}
