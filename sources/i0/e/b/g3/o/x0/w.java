package i0.e.b.g3.o.x0;

import android.view.ViewParent;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.o.x0.u;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: EventHeader_ */
public class w extends u implements z<u.a>, v {
    public void A(int i, Object obj) {
        super.G(i, (u.a) obj);
    }

    public void B(Object obj) {
        super.H((u.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new u.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        u.a aVar = (u.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (u.a) rVar);
    }

    public void H(r rVar) {
        super.H((u.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (u.a) dVar);
    }

    public void J(d dVar) {
        super.H((u.a) dVar);
    }

    public v L(String str) {
        w();
        this.j = str;
        return this;
    }

    public v M(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public void c(Object obj, int i) {
        u.a aVar = (u.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w) || !super.equals(obj)) {
            return false;
        }
        w wVar = (w) obj;
        Objects.requireNonNull(wVar);
        String str = this.j;
        if (str == null ? wVar.j != null : !str.equals(wVar.j)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? wVar.i == null : aVar.equals(wVar.i);
    }

    public void g(i0.b.a.w wVar, Object obj, int i) {
        u.a aVar = (u.a) obj;
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
        return R.layout.event_header;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("EventHeader_{header=");
        P0.append(this.j);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        u.a aVar = (u.a) obj;
    }
}
