package i0.e.b.g3.l.c3;

import android.view.ViewParent;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.l.c3.t;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: ClubRule_ */
public class v extends t implements z<t.a>, u {
    public void A(int i, Object obj) {
        super.G(i, (t.a) obj);
    }

    public void B(Object obj) {
        super.H((t.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new t.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        t.a aVar = (t.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (t.a) rVar);
    }

    public void H(r rVar) {
        super.H((t.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (t.a) dVar);
    }

    public void J(d dVar) {
        super.H((t.a) dVar);
    }

    public u L(String str) {
        w();
        this.k = str;
        return this;
    }

    public u M(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public u N(String str) {
        w();
        this.j = str;
        return this;
    }

    public void c(Object obj, int i) {
        t.a aVar = (t.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v) || !super.equals(obj)) {
            return false;
        }
        v vVar = (v) obj;
        Objects.requireNonNull(vVar);
        String str = this.j;
        if (str == null ? vVar.j != null : !str.equals(vVar.j)) {
            return false;
        }
        String str2 = this.k;
        if (str2 == null ? vVar.k != null : !str2.equals(vVar.k)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? vVar.i == null : aVar.equals(vVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        t.a aVar = (t.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.j;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.k;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
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

    public int o() {
        return R.layout.club_rule;
    }

    public i0.b.a.t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ClubRule_{title=");
        P0.append(this.j);
        P0.append(", description=");
        P0.append(this.k);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        t.a aVar = (t.a) obj;
    }
}
