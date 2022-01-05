package i0.e.b.g3.w.j0;

import android.view.ViewParent;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.w.j0.i;
import java.util.Objects;
import m0.n.a.a;

/* compiled from: ExploreHeader_ */
public class j extends i implements z<i.a> {
    public void A(int i, Object obj) {
        super.G(i, (i.a) obj);
    }

    public void B(Object obj) {
        super.H((i.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new i.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        i.a aVar = (i.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (i.a) rVar);
    }

    public void H(r rVar) {
        super.H((i.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (i.a) dVar);
    }

    public void J(d dVar) {
        super.H((i.a) dVar);
    }

    public void c(Object obj, int i) {
        i.a aVar = (i.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j) || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        Objects.requireNonNull(jVar);
        String str = this.j;
        if (str == null ? jVar.j != null : !str.equals(jVar.j)) {
            return false;
        }
        a<m0.i> aVar = this.i;
        return aVar == null ? jVar.i == null : aVar.equals(jVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        i.a aVar = (i.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.j;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        a<m0.i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode2 + i;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.explore_header;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ExploreHeader_{header=");
        P0.append(this.j);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        i.a aVar = (i.a) obj;
    }
}
