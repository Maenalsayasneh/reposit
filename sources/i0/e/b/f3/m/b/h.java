package i0.e.b.f3.m.b;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.android.data.models.local.club.Club;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.f3.m.b.d;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: ListClub_ */
public class h extends d implements z<d.a>, e {
    public void A(int i, Object obj) {
        super.G(i, (d.a) obj);
    }

    public void B(Object obj) {
        super.H((d.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new d.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        d.a aVar = (d.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (d.a) rVar);
    }

    public void H(r rVar) {
        super.H((d.a) rVar);
    }

    public void I(int i, i0.e.b.a3.f.d dVar) {
        super.G(i, (d.a) dVar);
    }

    public void J(i0.e.b.a3.f.d dVar) {
        super.H((d.a) dVar);
    }

    public e L(View.OnClickListener onClickListener) {
        w();
        this.n = onClickListener;
        return this;
    }

    public e M(Club club) {
        w();
        this.j = club;
        return this;
    }

    public e N(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public e O(boolean z) {
        w();
        this.m = z;
        return this;
    }

    public e P(boolean z) {
        w();
        this.l = z;
        return this;
    }

    public void c(Object obj, int i) {
        d.a aVar = (d.a) obj;
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
        Club club = this.j;
        if (club == null ? hVar.j != null : !club.equals(hVar.j)) {
            return false;
        }
        if (this.k != hVar.k || this.l != hVar.l || this.m != hVar.m) {
            return false;
        }
        View.OnClickListener onClickListener = this.n;
        if (onClickListener == null ? hVar.n != null : !onClickListener.equals(hVar.n)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? hVar.i == null : aVar.equals(hVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        d.a aVar = (d.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        Club club = this.j;
        int hashCode2 = (((((((hashCode + (club != null ? club.hashCode() : 0)) * 31) + (this.k ? 1 : 0)) * 31) + (this.l ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31;
        View.OnClickListener onClickListener = this.n;
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

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ListClub_{club=");
        P0.append(this.j);
        P0.append(", showSocialProof=");
        P0.append(this.k);
        P0.append(", showSelectButton=");
        P0.append(this.l);
        P0.append(", selected=");
        P0.append(this.m);
        P0.append(", clickListener=");
        P0.append(this.n);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        d.a aVar = (d.a) obj;
    }
}
