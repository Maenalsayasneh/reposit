package kotlinx.coroutines.flow.internal;

import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt__IndentKt;
import m0.i;
import m0.l.c;
import m0.l.f.a.b;
import m0.r.t.a.r.m.a1.a;
import n0.a.g2.d0.g;
import n0.a.g2.d0.l;
import n0.a.g2.e;

/* compiled from: SafeCollector.kt */
public final class SafeCollector<T> extends ContinuationImpl implements e<T>, b {
    public final e<T> c;
    public final m0.l.e d;
    public final int q;
    public m0.l.e x;
    public c<? super i> y;

    public SafeCollector(e<? super T> eVar, m0.l.e eVar2) {
        super(l.c, EmptyCoroutineContext.c);
        this.c = eVar;
        this.d = eVar2;
        this.q = ((Number) eVar2.fold(0, SafeCollector$collectContextSize$1.c)).intValue();
    }

    public Object emit(T t, c<? super i> cVar) {
        try {
            Object f = f(cVar, t);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (f == coroutineSingletons) {
                m0.n.b.i.e(cVar, "frame");
            }
            if (f == coroutineSingletons) {
                return f;
            }
            return i.a;
        } catch (Throwable th) {
            this.x = new g(th);
            throw th;
        }
    }

    public final Object f(c<? super i> cVar, T t) {
        m0.l.e context = cVar.getContext();
        a.n1(context);
        m0.l.e eVar = this.x;
        if (eVar != context) {
            if (eVar instanceof g) {
                StringBuilder P0 = i0.d.a.a.a.P0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
                P0.append(((g) eVar).d);
                P0.append(", but then emission attempt of value '");
                P0.append(t);
                P0.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
                throw new IllegalStateException(StringsKt__IndentKt.Y(P0.toString()).toString());
            } else if (((Number) context.fold(0, new SafeCollector_commonKt$checkContext$result$1(this))).intValue() == this.q) {
                this.x = context;
            } else {
                StringBuilder P02 = i0.d.a.a.a.P0("Flow invariant is violated:\n\t\tFlow was collected in ");
                P02.append(this.d);
                P02.append(",\n\t\tbut emission happened in ");
                P02.append(context);
                P02.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                throw new IllegalStateException(P02.toString().toString());
            }
        }
        this.y = cVar;
        return SafeCollectorKt.a.invoke(this.c, t, this);
    }

    public b getCallerFrame() {
        c<? super i> cVar = this.y;
        if (cVar instanceof b) {
            return (b) cVar;
        }
        return null;
    }

    public m0.l.e getContext() {
        c<? super i> cVar = this.y;
        m0.l.e context = cVar == null ? null : cVar.getContext();
        return context == null ? EmptyCoroutineContext.c : context;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public Object invokeSuspend(Object obj) {
        Throwable a = Result.a(obj);
        if (a != null) {
            this.x = new g(a);
        }
        c<? super i> cVar = this.y;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
