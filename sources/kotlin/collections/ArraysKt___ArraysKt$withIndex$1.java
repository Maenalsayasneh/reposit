package kotlin.collections;

import i0.j.f.p.h;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: _Arrays.kt */
public final class ArraysKt___ArraysKt$withIndex$1 extends Lambda implements a<Iterator<? extends T>> {
    public final /* synthetic */ Object[] c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArraysKt___ArraysKt$withIndex$1(Object[] objArr) {
        super(0);
        this.c = objArr;
    }

    public Object invoke() {
        return h.C2(this.c);
    }
}
