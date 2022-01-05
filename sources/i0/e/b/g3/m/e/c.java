package i0.e.b.g3.m.e;

import android.view.ViewParent;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.m.e.a;
import java.util.Objects;
import m0.i;

/* compiled from: Divider_ */
public class c extends a implements z<a.C0202a>, b {
    public void A(int i, Object obj) {
        super.G(i, (a.C0202a) obj);
    }

    public void B(Object obj) {
        super.H((a.C0202a) obj);
    }

    public r E(ViewParent viewParent) {
        return new a.C0202a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        a.C0202a aVar = (a.C0202a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (a.C0202a) rVar);
    }

    public void H(r rVar) {
        super.H((a.C0202a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (a.C0202a) dVar);
    }

    public void J(d dVar) {
        super.H((a.C0202a) dVar);
    }

    public b K(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public b L(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public void c(Object obj, int i) {
        a.C0202a aVar = (a.C0202a) obj;
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
        m0.n.a.a<i> aVar = this.i;
        return aVar == null ? cVar.i == null : aVar.equals(cVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        a.C0202a aVar = (a.C0202a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        m0.n.a.a<i> aVar = this.i;
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
        StringBuilder P0 = i0.d.a.a.a.P0("Divider_{}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        a.C0202a aVar = (a.C0202a) obj;
    }
}
