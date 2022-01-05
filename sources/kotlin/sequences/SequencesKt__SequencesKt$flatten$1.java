package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.s.h;

/* compiled from: Sequences.kt */
public final class SequencesKt__SequencesKt$flatten$1 extends Lambda implements l<h<? extends T>, Iterator<? extends T>> {
    public static final SequencesKt__SequencesKt$flatten$1 c = new SequencesKt__SequencesKt$flatten$1();

    public SequencesKt__SequencesKt$flatten$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        h hVar = (h) obj;
        i.e(hVar, "it");
        return hVar.iterator();
    }
}
