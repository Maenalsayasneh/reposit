package i0.e.b.g3.l.c3;

import android.view.ViewParent;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.l.c3.g;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: ClubDescription_ */
public class h extends g implements z<g.a> {
    public void A(int i, Object obj) {
        super.G(i, (g.a) obj);
    }

    public void B(Object obj) {
        super.H((g.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new g.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        g.a aVar = (g.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (g.a) rVar);
    }

    public void H(r rVar) {
        super.H((g.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (g.a) dVar);
    }

    public void J(d dVar) {
        super.H((g.a) dVar);
    }

    public void c(Object obj, int i) {
        g.a aVar = (g.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h) || !super.equals(obj)) {
            return false;
        }
        h hVar = (h) obj;
        Objects.requireNonNull(hVar);
        String str = this.j;
        if (str == null ? hVar.j != null : !str.equals(hVar.j)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? hVar.i == null : aVar.equals(hVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        g.a aVar = (g.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.j;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        a<i> aVar = this.i;
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
        return R.layout.club_description;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ClubDescription_{description=");
        P0.append(this.j);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        g.a aVar = (g.a) obj;
    }
}
