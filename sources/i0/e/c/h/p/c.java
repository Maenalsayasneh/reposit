package i0.e.c.h.p;

import android.view.View;
import android.view.ViewParent;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.c.h.p.a;
import java.util.Objects;
import m0.i;

/* compiled from: InboxItem_ */
public class c extends a implements z<a.C0217a>, b {
    public void A(int i, Object obj) {
        super.G(i, (a.C0217a) obj);
    }

    public void B(Object obj) {
        super.H((a.C0217a) obj);
    }

    public r E(ViewParent viewParent) {
        return new a.C0217a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        a.C0217a aVar = (a.C0217a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (a.C0217a) rVar);
    }

    public void H(r rVar) {
        super.H((a.C0217a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (a.C0217a) dVar);
    }

    public void J(d dVar) {
        super.H((a.C0217a) dVar);
    }

    public b L(i0.e.c.f.b.a.a aVar) {
        w();
        this.j = aVar;
        return this;
    }

    public b M(View.OnClickListener onClickListener) {
        w();
        this.k = onClickListener;
        return this;
    }

    public b N(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public b O(View.OnLongClickListener onLongClickListener) {
        w();
        this.l = onLongClickListener;
        return this;
    }

    public void c(Object obj, int i) {
        a.C0217a aVar = (a.C0217a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c) || !super.equals(obj)) {
            return false;
        }
        c cVar = (c) obj;
        Objects.requireNonNull(cVar);
        i0.e.c.f.b.a.a aVar = this.j;
        if (aVar == null ? cVar.j != null : !aVar.equals(cVar.j)) {
            return false;
        }
        View.OnClickListener onClickListener = this.k;
        if (onClickListener == null ? cVar.k != null : !onClickListener.equals(cVar.k)) {
            return false;
        }
        View.OnLongClickListener onLongClickListener = this.l;
        if (onLongClickListener == null ? cVar.l != null : !onLongClickListener.equals(cVar.l)) {
            return false;
        }
        m0.n.a.a<i> aVar2 = this.i;
        return aVar2 == null ? cVar.i == null : aVar2.equals(cVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        a.C0217a aVar = (a.C0217a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        i0.e.c.f.b.a.a aVar = this.j;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener = this.k;
        int hashCode3 = (hashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        View.OnLongClickListener onLongClickListener = this.l;
        int hashCode4 = (hashCode3 + (onLongClickListener != null ? onLongClickListener.hashCode() : 0)) * 31;
        m0.n.a.a<i> aVar2 = this.i;
        if (aVar2 != null) {
            i = aVar2.hashCode();
        }
        return hashCode4 + i;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("InboxItem_{chat=");
        P0.append(this.j);
        P0.append(", clickListener=");
        P0.append(this.k);
        P0.append(", longClickListener=");
        P0.append(this.l);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        a.C0217a aVar = (a.C0217a) obj;
    }
}
