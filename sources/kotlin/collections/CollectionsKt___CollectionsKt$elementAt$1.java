package kotlin.collections;

import i0.d.a.a.a;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;

/* compiled from: _Collections.kt */
public final class CollectionsKt___CollectionsKt$elementAt$1 extends Lambda implements l<Integer, T> {
    public final /* synthetic */ int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionsKt___CollectionsKt$elementAt$1(int i) {
        super(1);
        this.c = i;
    }

    public Object invoke(Object obj) {
        ((Number) obj).intValue();
        throw new IndexOutOfBoundsException(a.s0(a.P0("Collection doesn't contain element at index "), this.c, '.'));
    }
}
