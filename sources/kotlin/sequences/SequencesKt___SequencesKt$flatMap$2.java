package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import m0.n.a.l;
import m0.n.b.i;
import m0.s.h;

/* compiled from: _Sequences.kt */
public final /* synthetic */ class SequencesKt___SequencesKt$flatMap$2 extends FunctionReferenceImpl implements l<h<? extends R>, Iterator<? extends R>> {
    public static final SequencesKt___SequencesKt$flatMap$2 c = new SequencesKt___SequencesKt$flatMap$2();

    public SequencesKt___SequencesKt$flatMap$2() {
        super(1, h.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    public Object invoke(Object obj) {
        h hVar = (h) obj;
        i.e(hVar, "p1");
        return hVar.iterator();
    }
}
