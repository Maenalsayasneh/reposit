package androidx.paging;

import kotlin.jvm.internal.FunctionReferenceImpl;
import m0.i;
import m0.j.l;
import m0.l.c;
import m0.n.a.p;

/* compiled from: CachedPageEventFlow.kt */
public final /* synthetic */ class CachedPageEventFlow$multicastedSrc$2 extends FunctionReferenceImpl implements p<l<? extends PageEvent<T>>, c<? super i>, Object> {
    public CachedPageEventFlow$multicastedSrc$2(FlattenedPageController flattenedPageController) {
        super(2, flattenedPageController, FlattenedPageController.class, "record", "record(Lkotlin/collections/IndexedValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((FlattenedPageController) this.receiver).b((l) obj, (c) obj2);
    }
}
