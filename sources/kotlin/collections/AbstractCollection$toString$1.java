package kotlin.collections;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;

/* compiled from: AbstractCollection.kt */
public final class AbstractCollection$toString$1 extends Lambda implements l<E, CharSequence> {
    public final /* synthetic */ AbstractCollection c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractCollection$toString$1(AbstractCollection abstractCollection) {
        super(1);
        this.c = abstractCollection;
    }

    public Object invoke(Object obj) {
        return obj == this.c ? "(this Collection)" : String.valueOf(obj);
    }
}
