package androidx.paging;

import h0.u.f0;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.q.e;

/* compiled from: Separators.kt */
public final class SeparatorState$onDrop$1 extends Lambda implements l<f0<T>, Boolean> {
    public final /* synthetic */ e c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SeparatorState$onDrop$1(e eVar) {
        super(1);
        this.c = eVar;
    }

    public Object invoke(Object obj) {
        f0 f0Var = (f0) obj;
        i.e(f0Var, "stash");
        int[] iArr = f0Var.c;
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (this.c.k(iArr[i])) {
                z = true;
                break;
            }
            i++;
        }
        return Boolean.valueOf(z);
    }
}
