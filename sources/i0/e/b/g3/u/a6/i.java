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
import i0.e.b.g3.u.a6.g;
import java.util.Objects;
import m0.n.a.a;

/* compiled from: FollowSuggestion_ */
public class i extends g implements z<g.a>, h {
    public void A(int i, Object obj) {
        super.G(i, (g.a) obj);
    }

    public void B(Object obj) {
        super.H((g.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new g.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        g.a aVar = (g.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (g.a) rVar);
    }

    public void H(r rVar) {
        super.H((g.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (g.a) dVar);
    }

    public void J(d dVar) {
        super.H((g.a) dVar);
    }

    public h L(String str) {
        w();
        this.l = str;
        return this;
    }

    public h M(View.OnClickListener onClickListener) {
        w();
        this.n = onClickListener;
        return this;
    }

    public h N(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public h O(String str) {
        w();
        this.j = str;
        return this;
    }

    public h P(String str) {
        w();
        this.k = str;
        return this;
    }

    public h Q(View.OnClickListener onClickListener) {
        w();
        this.m = onClickListener;
        return this;
    }

    public h R(View.OnClickListener onClickListener) {
        w();
        this.o = onClickListener;
        return this;
    }

    public void c(Object obj, int i) {
        g.a aVar = (g.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i) || !super.equals(obj)) {
            return false;
        }
        i iVar = (i) obj;
        Objects.requireNonNull(iVar);
        String str = this.j;
        if (str == null ? iVar.j != null : !str.equals(iVar.j)) {
            return false;
        }
        String str2 = this.k;
        if (str2 == null ? iVar.k != null : !str2.equals(iVar.k)) {
            return false;
        }
        String str3 = this.l;
        if (str3 == null ? iVar.l != null : !str3.equals(iVar.l)) {
            return false;
        }
        View.OnClickListener onClickListener = this.m;
        if (onClickListener == null ? iVar.m != null : !onClickListener.equals(iVar.m)) {
            return false;
        }
        View.OnClickListener onClickListener2 = this.n;
        if (onClickListener2 == null ? iVar.n != null : !onClickListener2.equals(iVar.n)) {
            return false;
        }
        View.OnClickListener onClickListener3 = this.o;
        if (onClickListener3 == null ? iVar.o != null : !onClickListener3.equals(iVar.o)) {
            return false;
        }
        a<m0.i> aVar = this.i;
        return aVar == null ? iVar.i == null : aVar.equals(iVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        g.a aVar = (g.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.j;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.k;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.l;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener = this.m;
        int hashCode5 = (hashCode4 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener2 = this.n;
        int hashCode6 = (hashCode5 + (onClickListener2 != null ? onClickListener2.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener3 = this.o;
        int hashCode7 = (hashCode6 + (onClickListener3 != null ? onClickListener3.hashCode() : 0)) * 31;
        a<m0.i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode7 + i;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.view_follow_suggestion_profile;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("FollowSuggestion_{name=");
        P0.append(this.j);
        P0.append(", photoUrl=");
        P0.append(this.k);
        P0.append(", bio=");
        P0.append(this.l);
        P0.append(", profileClickListener=");
        P0.append(this.m);
        P0.append(", followClickListener=");
        P0.append(this.n);
        P0.append(", removeClickListener=");
        P0.append(this.o);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        g.a aVar = (g.a) obj;
    }
}
