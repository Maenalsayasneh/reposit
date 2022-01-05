package n0.a.f2;

import java.util.ArrayList;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.internal.UndeliveredElementException;
import m0.i;
import m0.n.a.l;
import m0.r.t.a.r.m.a1.a;
import n0.a.f2.b;
import n0.a.h2.k;
import n0.a.h2.t;

/* compiled from: LinkedListChannel.kt */
public class j<E> extends AbstractChannel<E> {
    public j(l<? super E, i> lVar) {
        super(lVar);
    }

    public void C(Object obj, h<?> hVar) {
        UndeliveredElementException undeliveredElementException = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                q qVar = (q) obj;
                if (qVar instanceof b.a) {
                    l<E, i> lVar = this.d;
                    if (lVar != null) {
                        undeliveredElementException = a.i0(lVar, ((b.a) qVar).x, (UndeliveredElementException) null);
                    }
                } else {
                    qVar.K(hVar);
                }
            } else {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    UndeliveredElementException undeliveredElementException2 = null;
                    while (true) {
                        int i = size - 1;
                        q qVar2 = (q) arrayList.get(size);
                        if (qVar2 instanceof b.a) {
                            l<E, i> lVar2 = this.d;
                            undeliveredElementException2 = lVar2 == null ? null : a.i0(lVar2, ((b.a) qVar2).x, undeliveredElementException2);
                        } else {
                            qVar2.K(hVar);
                        }
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    }
                    undeliveredElementException = undeliveredElementException2;
                }
            }
        }
        if (undeliveredElementException != null) {
            throw undeliveredElementException;
        }
    }

    public final boolean k() {
        return false;
    }

    public final boolean l() {
        return false;
    }

    public Object p(E e) {
        o oVar;
        do {
            Object p = super.p(e);
            t tVar = a.b;
            if (p == tVar) {
                return tVar;
            }
            if (p == a.c) {
                n0.a.h2.i iVar = this.q;
                b.a aVar = new b.a(e);
                while (true) {
                    k y = iVar.y();
                    if (!(y instanceof o)) {
                        if (y.s(aVar, iVar)) {
                            oVar = null;
                            break;
                        }
                    } else {
                        oVar = (o) y;
                        break;
                    }
                }
                if (oVar == null) {
                    return a.b;
                }
            } else if (p instanceof h) {
                return p;
            } else {
                throw new IllegalStateException(m0.n.b.i.k("Invalid offerInternal result ", p).toString());
            }
        } while (!(oVar instanceof h));
        return oVar;
    }

    public final boolean y() {
        return true;
    }

    public final boolean z() {
        return true;
    }
}
