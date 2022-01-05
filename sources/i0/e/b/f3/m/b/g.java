package i0.e.b.f3.m.b;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.android.data.models.local.club.Club;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.f3.m.b.f;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: ListClubWithMembership_ */
public class g extends f implements z<f.a> {
    public void A(int i, Object obj) {
        super.G(i, (f.a) obj);
    }

    public void B(Object obj) {
        super.H((f.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new f.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        f.a aVar = (f.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (f.a) rVar);
    }

    public void H(r rVar) {
        super.H((f.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (f.a) dVar);
    }

    public void J(d dVar) {
        super.H((f.a) dVar);
    }

    public void c(Object obj, int i) {
        f.a aVar = (f.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g) || !super.equals(obj)) {
            return false;
        }
        g gVar = (g) obj;
        Objects.requireNonNull(gVar);
        Club club = this.j;
        if (club == null ? gVar.j != null : !club.equals(gVar.j)) {
            return false;
        }
        if (this.k != gVar.k) {
            return false;
        }
        View.OnClickListener onClickListener = this.l;
        if (onClickListener == null ? gVar.l != null : !onClickListener.equals(gVar.l)) {
            return false;
        }
        View.OnClickListener onClickListener2 = this.m;
        if (onClickListener2 == null ? gVar.m != null : !onClickListener2.equals(gVar.m)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? gVar.i == null : aVar.equals(gVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        f.a aVar = (f.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        Club club = this.j;
        int hashCode2 = (((hashCode + (club != null ? club.hashCode() : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        View.OnClickListener onClickListener = this.l;
        int hashCode3 = (hashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener2 = this.m;
        int hashCode4 = (hashCode3 + (onClickListener2 != null ? onClickListener2.hashCode() : 0)) * 31;
        a<i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode4 + i;
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
        StringBuilder P0 = i0.d.a.a.a.P0("ListClubWithMembership_{club=");
        P0.append(this.j);
        P0.append(", member=");
        P0.append(this.k);
        P0.append(", clickListener=");
        P0.append(this.l);
        P0.append(", joinClickListener=");
        P0.append(this.m);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        f.a aVar = (f.a) obj;
    }
}
