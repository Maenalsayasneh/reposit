package i0.e.b.g3.i;

import android.view.View;
import android.view.ViewParent;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.g3.i.d;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: ActionItem_ */
public class f extends d implements z<d.a>, e {
    public void A(int i, Object obj) {
        super.G(i, (d.a) obj);
    }

    public void B(Object obj) {
        super.H((d.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new d.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        d.a aVar = (d.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (d.a) rVar);
    }

    public void H(r rVar) {
        super.H((d.a) rVar);
    }

    public void I(int i, i0.e.b.a3.f.d dVar) {
        super.G(i, (d.a) dVar);
    }

    public void J(i0.e.b.a3.f.d dVar) {
        super.H((d.a) dVar);
    }

    public e L(c cVar) {
        w();
        this.j = cVar;
        return this;
    }

    public e M(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public e N(View.OnClickListener onClickListener) {
        w();
        this.l = onClickListener;
        return this;
    }

    public e O(boolean z) {
        w();
        this.k = z;
        return this;
    }

    public void c(Object obj, int i) {
        d.a aVar = (d.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f) || !super.equals(obj)) {
            return false;
        }
        f fVar = (f) obj;
        Objects.requireNonNull(fVar);
        c cVar = this.j;
        if (cVar == null ? fVar.j != null : !cVar.equals(fVar.j)) {
            return false;
        }
        if (this.k != fVar.k) {
            return false;
        }
        View.OnClickListener onClickListener = this.l;
        if (onClickListener == null ? fVar.l != null : !onClickListener.equals(fVar.l)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? fVar.i == null : aVar.equals(fVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        d.a aVar = (d.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        c cVar = this.j;
        int hashCode2 = (((hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        View.OnClickListener onClickListener = this.l;
        int hashCode3 = (hashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        a<i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode3 + i;
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
        StringBuilder P0 = i0.d.a.a.a.P0("ActionItem_{action=");
        P0.append(this.j);
        P0.append(", selected=");
        P0.append(this.k);
        P0.append(", onClickListener=");
        P0.append(this.l);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        d.a aVar = (d.a) obj;
    }
}
