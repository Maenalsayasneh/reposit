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
import i0.e.b.g3.w.j0.k;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: RecentSearchesHeader_ */
public class l extends k implements z<k.a> {
    public void A(int i, Object obj) {
        super.G(i, (k.a) obj);
    }

    public void B(Object obj) {
        super.H((k.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new k.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        k.a aVar = (k.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (k.a) rVar);
    }

    public void H(r rVar) {
        super.H((k.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (k.a) dVar);
    }

    public void J(d dVar) {
        super.H((k.a) dVar);
    }

    public void c(Object obj, int i) {
        k.a aVar = (k.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l) || !super.equals(obj)) {
            return false;
        }
        l lVar = (l) obj;
        Objects.requireNonNull(lVar);
        View.OnClickListener onClickListener = this.j;
        if (onClickListener == null ? lVar.j != null : !onClickListener.equals(lVar.j)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? lVar.i == null : aVar.equals(lVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        k.a aVar = (k.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        View.OnClickListener onClickListener = this.j;
        int hashCode2 = (hashCode + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
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
        return R.layout.recent_searches_header;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("RecentSearchesHeader_{clearClickListener=");
        P0.append(this.j);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        k.a aVar = (k.a) obj;
    }
}
