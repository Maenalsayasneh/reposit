package i0.e.b.g3.w.j0;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.w.j0.m;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: SearchQueryView_ */
public class n extends m implements z<m.a> {
    public void A(int i, Object obj) {
        super.G(i, (m.a) obj);
    }

    public void B(Object obj) {
        super.H((m.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new m.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        m.a aVar = (m.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (m.a) rVar);
    }

    public void H(r rVar) {
        super.H((m.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (m.a) dVar);
    }

    public void J(d dVar) {
        super.H((m.a) dVar);
    }

    public void c(Object obj, int i) {
        m.a aVar = (m.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n) || !super.equals(obj)) {
            return false;
        }
        n nVar = (n) obj;
        Objects.requireNonNull(nVar);
        String str = this.j;
        if (str == null ? nVar.j != null : !str.equals(nVar.j)) {
            return false;
        }
        View.OnClickListener onClickListener = this.k;
        if (onClickListener == null ? nVar.k != null : !onClickListener.equals(nVar.k)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? nVar.i == null : aVar.equals(nVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        m.a aVar = (m.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.j;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener = this.k;
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

    public int o() {
        return R.layout.search_query;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("SearchQueryView_{query=");
        P0.append(this.j);
        P0.append(", clickListener=");
        P0.append(this.k);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        m.a aVar = (m.a) obj;
    }
}
