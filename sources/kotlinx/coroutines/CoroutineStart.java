package kotlinx.coroutines;

import i0.j.f.p.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.internal.ThreadContextKt;
import m0.l.c;
import m0.l.e;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;
import m0.n.b.r;
import m0.r.t.a.r.m.a1.a;

/* compiled from: CoroutineStart.kt */
public enum CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public final <T> void invoke(l<? super c<? super T>, ? extends Object> lVar, c<? super T> cVar) {
        e context;
        Object c;
        int ordinal = ordinal();
        if (ordinal == 0) {
            a.H3(lVar, cVar);
        } else if (ordinal == 1) {
        } else {
            if (ordinal == 2) {
                i.e(lVar, "$this$startCoroutine");
                i.e(cVar, "completion");
                h.b2(h.e0(lVar, cVar)).resumeWith(m0.i.a);
            } else if (ordinal == 3) {
                i.e(cVar, "completion");
                try {
                    context = cVar.getContext();
                    c = ThreadContextKt.c(context, (Object) null);
                    if (lVar != null) {
                        r.c(lVar, 1);
                        Object invoke = lVar.invoke(cVar);
                        ThreadContextKt.a(context, c);
                        if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            cVar.resumeWith(invoke);
                            return;
                        }
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                } catch (Throwable th) {
                    cVar.resumeWith(h.l0(th));
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    public final <R, T> void invoke(p<? super R, ? super c<? super T>, ? extends Object> pVar, R r, c<? super T> cVar) {
        e context;
        Object c;
        int ordinal = ordinal();
        if (ordinal == 0) {
            a.I3(pVar, r, cVar, (l) null, 4);
        } else if (ordinal == 1) {
        } else {
            if (ordinal == 2) {
                i.e(pVar, "$this$startCoroutine");
                i.e(cVar, "completion");
                h.b2(h.f0(pVar, r, cVar)).resumeWith(m0.i.a);
            } else if (ordinal == 3) {
                i.e(cVar, "completion");
                try {
                    context = cVar.getContext();
                    c = ThreadContextKt.c(context, (Object) null);
                    if (pVar != null) {
                        r.c(pVar, 2);
                        Object invoke = pVar.invoke(r, cVar);
                        ThreadContextKt.a(context, c);
                        if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            cVar.resumeWith(invoke);
                            return;
                        }
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                } catch (Throwable th) {
                    cVar.resumeWith(h.l0(th));
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
