package n0.a.g2;

import i0.d.a.a.a;
import kotlinx.coroutines.channels.BufferOverflow;
import m0.i;
import m0.l.c;
import m0.l.e;
import m0.n.a.p;
import n0.a.f2.l;
import n0.a.g2.d0.d;

/* compiled from: Builders.kt */
public class b<T> extends d<T> {
    public final p<l<? super T>, c<? super i>, Object> x;

    public b(p<? super l<? super T>, ? super c<? super i>, ? extends Object> pVar, e eVar, int i, BufferOverflow bufferOverflow) {
        super(eVar, i, bufferOverflow);
        this.x = pVar;
    }

    public String toString() {
        StringBuilder P0 = a.P0("block[");
        P0.append(this.x);
        P0.append("] -> ");
        P0.append(super.toString());
        return P0.toString();
    }
}
