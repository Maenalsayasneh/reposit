package i0.e.b.g3.o.x0;

import android.view.ViewParent;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.o.x0.r;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: EventDivider_ */
public class t extends r implements z<r.a>, s {
    public void A(int i, Object obj) {
        super.G(i, (r.a) obj);
    }

    public void B(Object obj) {
        super.H((r.a) obj);
    }

    public i0.b.a.r E(ViewParent viewParent) {
        return new r.a();
    }

    public void F(float f, float f2, int i, int i2, i0.b.a.r rVar) {
        r.a aVar = (r.a) rVar;
    }

    public void G(int i, i0.b.a.r rVar) {
        super.G(i, (r.a) rVar);
    }

    public void H(i0.b.a.r rVar) {
        super.H((r.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (r.a) dVar);
    }

    public void J(d dVar) {
        super.H((r.a) dVar);
    }

    public s K(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public void c(Object obj, int i) {
        r.a aVar = (r.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t) || !super.equals(obj)) {
            return false;
        }
        t tVar = (t) obj;
        Objects.requireNonNull(tVar);
        a<i> aVar = this.i;
        return aVar == null ? tVar.i == null : aVar.equals(tVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        r.a aVar = (r.a) obj;
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

    public int o() {
        return R.layout.event_action_divider;
    }

    public i0.b.a.t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("EventDivider_{}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        r.a aVar = (r.a) obj;
    }
}
