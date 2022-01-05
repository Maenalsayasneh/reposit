package i0.e.b.g3.u.a6;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.u.a6.a;
import java.util.Objects;
import m0.i;

/* compiled from: ClubInProfile_ */
public class c extends a implements z<a.C0209a>, b {
    public void A(int i, Object obj) {
        super.G(i, (a.C0209a) obj);
    }

    public void B(Object obj) {
        super.H((a.C0209a) obj);
    }

    public r E(ViewParent viewParent) {
        return new a.C0209a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        a.C0209a aVar = (a.C0209a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (a.C0209a) rVar);
    }

    public void H(r rVar) {
        super.H((a.C0209a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (a.C0209a) dVar);
    }

    public void J(d dVar) {
        super.H((a.C0209a) dVar);
    }

    public b L(View.OnClickListener onClickListener) {
        w();
        this.n = onClickListener;
        return this;
    }

    public b M(boolean z) {
        w();
        this.l = z;
        return this;
    }

    public b N(boolean z) {
        w();
        this.m = z;
        return this;
    }

    public b O(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public b P(String str) {
        w();
        this.j = str;
        return this;
    }

    public b Q(String str) {
        w();
        this.k = str;
        return this;
    }

    public void c(Object obj, int i) {
        a.C0209a aVar = (a.C0209a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c) || !super.equals(obj)) {
            return false;
        }
        c cVar = (c) obj;
        Objects.requireNonNull(cVar);
        String str = this.j;
        if (str == null ? cVar.j != null : !str.equals(cVar.j)) {
            return false;
        }
        String str2 = this.k;
        if (str2 == null ? cVar.k != null : !str2.equals(cVar.k)) {
            return false;
        }
        if (this.l != cVar.l || this.m != cVar.m) {
            return false;
        }
        View.OnClickListener onClickListener = this.n;
        if (onClickListener == null ? cVar.n != null : !onClickListener.equals(cVar.n)) {
            return false;
        }
        m0.n.a.a<i> aVar = this.i;
        return aVar == null ? cVar.i == null : aVar.equals(cVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        a.C0209a aVar = (a.C0209a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.j;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.k;
        int hashCode3 = (((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.l ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31;
        View.OnClickListener onClickListener = this.n;
        int hashCode4 = (hashCode3 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        m0.n.a.a<i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode4 + i;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.view_club_in_profile;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ClubInProfile_{name=");
        P0.append(this.j);
        P0.append(", photoUrl=");
        P0.append(this.k);
        P0.append(", clubAdmin=");
        P0.append(this.l);
        P0.append(", clubLeader=");
        P0.append(this.m);
        P0.append(", clickListener=");
        P0.append(this.n);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        a.C0209a aVar = (a.C0209a) obj;
    }
}
