package kotlin.sequences;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;

/* compiled from: _Sequences.kt */
public final class SequencesKt___SequencesKt$filterNotNull$1 extends Lambda implements l<T, Boolean> {
    public static final SequencesKt___SequencesKt$filterNotNull$1 c = new SequencesKt___SequencesKt$filterNotNull$1();

    public SequencesKt___SequencesKt$filterNotNull$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        return Boolean.valueOf(obj == null);
    }
}
