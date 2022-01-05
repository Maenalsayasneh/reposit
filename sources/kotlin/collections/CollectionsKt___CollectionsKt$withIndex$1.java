package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: _Collections.kt */
public final class CollectionsKt___CollectionsKt$withIndex$1 extends Lambda implements a<Iterator<? extends T>> {
    public final /* synthetic */ Iterable c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionsKt___CollectionsKt$withIndex$1(Iterable iterable) {
        super(0);
        this.c = iterable;
    }

    public Object invoke() {
        return this.c.iterator();
    }
}
