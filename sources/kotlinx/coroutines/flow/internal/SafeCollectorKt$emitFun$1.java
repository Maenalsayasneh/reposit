package kotlinx.coroutines.flow.internal;

import kotlin.jvm.internal.FunctionReferenceImpl;
import m0.i;
import m0.l.c;
import m0.n.a.q;
import n0.a.g2.e;

/* compiled from: SafeCollector.kt */
public /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements q<e<? super Object>, Object, i> {
    public static final SafeCollectorKt$emitFun$1 c = new SafeCollectorKt$emitFun$1();

    public SafeCollectorKt$emitFun$1() {
        super(3, e.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        return ((e) obj).emit(obj2, (c) obj3);
    }
}
