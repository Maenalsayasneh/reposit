package n0.a;

import i0.d.a.a.a;
import java.util.Objects;
import m0.i;
import m0.n.a.l;

/* compiled from: CancellableContinuationImpl.kt */
public final class y {
    public final Object a;
    public final k b;
    public final l<Throwable, i> c;
    public final Object d;
    public final Throwable e;

    public y(Object obj, k kVar, l<? super Throwable, i> lVar, Object obj2, Throwable th) {
        this.a = obj;
        this.b = kVar;
        this.c = lVar;
        this.d = obj2;
        this.e = th;
    }

    public static y a(y yVar, Object obj, k kVar, l lVar, Object obj2, Throwable th, int i) {
        Object obj3 = null;
        Object obj4 = (i & 1) != 0 ? yVar.a : null;
        if ((i & 2) != 0) {
            kVar = yVar.b;
        }
        k kVar2 = kVar;
        l<Throwable, i> lVar2 = (i & 4) != 0 ? yVar.c : null;
        if ((i & 8) != 0) {
            obj3 = yVar.d;
        }
        Object obj5 = obj3;
        if ((i & 16) != 0) {
            th = yVar.e;
        }
        Objects.requireNonNull(yVar);
        return new y(obj4, kVar2, lVar2, obj5, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return m0.n.b.i.a(this.a, yVar.a) && m0.n.b.i.a(this.b, yVar.b) && m0.n.b.i.a(this.c, yVar.c) && m0.n.b.i.a(this.d, yVar.d) && m0.n.b.i.a(this.e, yVar.e);
    }

    public int hashCode() {
        Object obj = this.a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        k kVar = this.b;
        int hashCode2 = (hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        l<Throwable, i> lVar = this.c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("CompletedContinuation(result=");
        P0.append(this.a);
        P0.append(", cancelHandler=");
        P0.append(this.b);
        P0.append(", onCancellation=");
        P0.append(this.c);
        P0.append(", idempotentResume=");
        P0.append(this.d);
        P0.append(", cancelCause=");
        P0.append(this.e);
        P0.append(')');
        return P0.toString();
    }

    public y(Object obj, k kVar, l<Throwable, i> lVar, Object obj2, Throwable th, int i) {
        kVar = (i & 2) != 0 ? null : kVar;
        lVar = (i & 4) != 0 ? null : lVar;
        obj2 = (i & 8) != 0 ? null : obj2;
        th = (i & 16) != 0 ? null : th;
        this.a = obj;
        this.b = kVar;
        this.c = lVar;
        this.d = obj2;
        this.e = th;
    }
}
