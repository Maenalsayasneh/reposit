package i0.e.b.g3.x.g;

import android.view.ViewParent;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.x.g.c;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: SelectionItemDivider_ */
public class e extends c implements z<c.a>, d {
    public void A(int i, Object obj) {
        super.G(i, (c.a) obj);
    }

    public void B(Object obj) {
        super.H((c.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new c.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        c.a aVar = (c.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (c.a) rVar);
    }

    public void H(r rVar) {
        super.H((c.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (c.a) dVar);
    }

    public void J(d dVar) {
        super.H((c.a) dVar);
    }

    public d K(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public void c(Object obj, int i) {
        c.a aVar = (c.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e) || !super.equals(obj)) {
            return false;
        }
        e eVar = (e) obj;
        Objects.requireNonNull(eVar);
        a<i> aVar = this.i;
        return aVar == null ? eVar.i == null : aVar.equals(eVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        c.a aVar = (c.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        a<i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
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
        StringBuilder P0 = i0.d.a.a.a.P0("SelectionItemDivider_{}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        c.a aVar = (c.a) obj;
    }
}
