package kotlin.sequences;

import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: Sequences.kt */
public final class SequencesKt__SequencesKt$generateSequence$1 extends Lambda implements l<T, T> {
    public final /* synthetic */ a c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$generateSequence$1(a aVar) {
        super(1);
        this.c = aVar;
    }

    public final T invoke(T t) {
        i.e(t, "it");
        return this.c.invoke();
    }
}
