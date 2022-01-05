package i0.e.b.g3.l.c3;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.app.R;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.l.c3.n;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: ClubHeader_ */
public class o extends n implements z<n.a> {
    public void A(int i, Object obj) {
        super.G(i, (n.a) obj);
    }

    public void B(Object obj) {
        super.H((n.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new n.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        n.a aVar = (n.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (n.a) rVar);
    }

    public void H(r rVar) {
        super.H((n.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (n.a) dVar);
    }

    public void J(d dVar) {
        super.H((n.a) dVar);
    }

    public void c(Object obj, int i) {
        n.a aVar = (n.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o) || !super.equals(obj)) {
            return false;
        }
        o oVar = (o) obj;
        Objects.requireNonNull(oVar);
        String str = this.j;
        if (str == null ? oVar.j != null : !str.equals(oVar.j)) {
            return false;
        }
        String str2 = this.k;
        if (str2 == null ? oVar.k != null : !str2.equals(oVar.k)) {
            return false;
        }
        View.OnClickListener onClickListener = this.l;
        if (onClickListener == null ? oVar.l != null : !onClickListener.equals(oVar.l)) {
            return false;
        }
        String str3 = this.m;
        if (str3 == null ? oVar.m != null : !str3.equals(oVar.m)) {
            return false;
        }
        if (this.n != oVar.n) {
            return false;
        }
        View.OnClickListener onClickListener2 = this.o;
        if (onClickListener2 == null ? oVar.o != null : !onClickListener2.equals(oVar.o)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? oVar.i == null : aVar.equals(oVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        n.a aVar = (n.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.j;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.k;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener = this.l;
        int hashCode4 = (hashCode3 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        String str3 = this.m;
        int hashCode5 = (((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.n ? 1 : 0)) * 31;
        View.OnClickListener onClickListener2 = this.o;
        int hashCode6 = (hashCode5 + (onClickListener2 != null ? onClickListener2.hashCode() : 0)) * 31;
        a<i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode6 + i;
    }

    public void i(i0.b.a.o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.club_header;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ClubHeader_{name=");
        P0.append(this.j);
        P0.append(", photoUrl=");
        P0.append(this.k);
        P0.append(", photoClickListener=");
        P0.append(this.l);
        P0.append(", memberCount=");
        P0.append(this.m);
        P0.append(", showRules=");
        P0.append(this.n);
        P0.append(", rulesClickListener=");
        P0.append(this.o);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        n.a aVar = (n.a) obj;
    }
}
