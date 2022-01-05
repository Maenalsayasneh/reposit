package kotlin.sequences;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;

/* compiled from: _Sequences.kt */
public final class SequencesKt___SequencesKt$onEach$1 extends Lambda implements l<T, T> {
    public final /* synthetic */ l c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$onEach$1(l lVar) {
        super(1);
        this.c = lVar;
    }

    public final T invoke(T t) {
        this.c.invoke(t);
        return t;
    }
}
