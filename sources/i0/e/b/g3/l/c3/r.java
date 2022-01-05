package i0.e.b.g3.l.c3;

import android.view.View;
import android.view.ViewParent;
import i0.b.a.o;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.l.c3.q;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: ClubMemberSearchBar_ */
public class r extends q implements z<q.a> {
    public void A(int i, Object obj) {
        super.G(i, (q.a) obj);
    }

    public void B(Object obj) {
        super.H((q.a) obj);
    }

    public i0.b.a.r E(ViewParent viewParent) {
        return new q.a();
    }

    public void F(float f, float f2, int i, int i2, i0.b.a.r rVar) {
        q.a aVar = (q.a) rVar;
    }

    public void G(int i, i0.b.a.r rVar) {
        super.G(i, (q.a) rVar);
    }

    public void H(i0.b.a.r rVar) {
        super.H((q.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (q.a) dVar);
    }

    public void J(d dVar) {
        super.H((q.a) dVar);
    }

    public void c(Object obj, int i) {
        q.a aVar = (q.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r) || !super.equals(obj)) {
            return false;
        }
        r rVar = (r) obj;
        Objects.requireNonNull(rVar);
        View.OnClickListener onClickListener = this.j;
        if (onClickListener == null ? rVar.j != null : !onClickListener.equals(rVar.j)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? rVar.i == null : aVar.equals(rVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        q.a aVar = (q.a) obj;
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

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ClubMemberSearchBar_{searchClickListener=");
        P0.append(this.j);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        q.a aVar = (q.a) obj;
    }
}
