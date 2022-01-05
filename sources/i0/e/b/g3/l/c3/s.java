package i0.e.b.g3.l.c3;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.android.ui.clubs.ClubRole;
import com.clubhouse.android.user.model.User;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.l.c3.p;
import java.util.Objects;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: ClubMember_ */
public class s extends p implements z<p.a> {
    public void A(int i, Object obj) {
        super.G(i, (p.a) obj);
    }

    public void B(Object obj) {
        super.H((p.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new p.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        p.a aVar = (p.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (p.a) rVar);
    }

    public void H(r rVar) {
        super.H((p.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (p.a) dVar);
    }

    public void J(d dVar) {
        super.H((p.a) dVar);
    }

    public void c(Object obj, int i) {
        p.a aVar = (p.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s) || !super.equals(obj)) {
            return false;
        }
        s sVar = (s) obj;
        Objects.requireNonNull(sVar);
        if (this.m != sVar.m || this.n != sVar.n) {
            return false;
        }
        ClubRole clubRole = this.o;
        if (clubRole == null ? sVar.o != null : !clubRole.equals(sVar.o)) {
            return false;
        }
        if (this.p != sVar.p) {
            return false;
        }
        View.OnClickListener onClickListener = this.q;
        if (onClickListener == null ? sVar.q != null : !onClickListener.equals(sVar.q)) {
            return false;
        }
        l<? super ClubRole, i> lVar = this.r;
        if (lVar == null ? sVar.r != null : !lVar.equals(sVar.r)) {
            return false;
        }
        a<i> aVar = this.s;
        if (aVar == null ? sVar.s != null : !aVar.equals(sVar.s)) {
            return false;
        }
        User user = this.j;
        if (user == null ? sVar.j != null : !user.equals(sVar.j)) {
            return false;
        }
        String str = this.k;
        if (str == null ? sVar.k != null : !str.equals(sVar.k)) {
            return false;
        }
        View.OnClickListener onClickListener2 = this.l;
        if (onClickListener2 == null ? sVar.l != null : !onClickListener2.equals(sVar.l)) {
            return false;
        }
        a<i> aVar2 = this.i;
        return aVar2 == null ? sVar.i == null : aVar2.equals(sVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        p.a aVar = (p.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + (this.m ? 1 : 0)) * 31) + (this.n ? 1 : 0)) * 31;
        ClubRole clubRole = this.o;
        int hashCode2 = (((hashCode + (clubRole != null ? clubRole.hashCode() : 0)) * 31) + (this.p ? 1 : 0)) * 31;
        View.OnClickListener onClickListener = this.q;
        int hashCode3 = (hashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        l<? super ClubRole, i> lVar = this.r;
        int hashCode4 = (hashCode3 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        a<i> aVar = this.s;
        int hashCode5 = (hashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        User user = this.j;
        int hashCode6 = (hashCode5 + (user != null ? user.hashCode() : 0)) * 31;
        String str = this.k;
        int hashCode7 = (hashCode6 + (str != null ? str.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener2 = this.l;
        int hashCode8 = (((hashCode7 + (onClickListener2 != null ? onClickListener2.hashCode() : 0)) * 31) + 0) * 31;
        a<i> aVar2 = this.i;
        if (aVar2 != null) {
            i = aVar2.hashCode();
        }
        return hashCode8 + i;
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
        StringBuilder P0 = i0.d.a.a.a.P0("ClubMember_{showFollowButton=");
        P0.append(this.m);
        P0.append(", showDropdownButton=");
        P0.append(this.n);
        P0.append(", clubRole=");
        P0.append(this.o);
        P0.append(", following=");
        P0.append(this.p);
        P0.append(", followClickListener=");
        P0.append(this.q);
        P0.append(", user=");
        P0.append(this.j);
        P0.append(", userBio=");
        P0.append(this.k);
        P0.append(", clickListener=");
        P0.append(this.l);
        P0.append(", longClickListener=");
        P0.append((Object) null);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        p.a aVar = (p.a) obj;
    }
}
