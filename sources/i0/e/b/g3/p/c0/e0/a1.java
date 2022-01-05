package i0.e.b.g3.p.c0.e0;

import android.view.ViewParent;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.user.model.User;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.b3.b.e.m;
import i0.e.b.g3.p.c0.e0.z0;
import java.util.List;
import java.util.Objects;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: UserSuggestions_ */
public class a1 extends z0 implements z<z0.a> {
    public void A(int i, Object obj) {
        super.G(i, (z0.a) obj);
    }

    public void B(Object obj) {
        super.H((z0.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new z0.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        z0.a aVar = (z0.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (z0.a) rVar);
    }

    public void H(r rVar) {
        super.H((z0.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (z0.a) dVar);
    }

    public void J(d dVar) {
        super.H((z0.a) dVar);
    }

    public void c(Object obj, int i) {
        z0.a aVar = (z0.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a1) || !super.equals(obj)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        Objects.requireNonNull(a1Var);
        String str = this.j;
        if (str == null ? a1Var.j != null : !str.equals(a1Var.j)) {
            return false;
        }
        List<m> list = this.k;
        if (list == null ? a1Var.k != null : !list.equals(a1Var.k)) {
            return false;
        }
        l<? super User, i> lVar = this.l;
        if (lVar == null ? a1Var.l != null : !lVar.equals(a1Var.l)) {
            return false;
        }
        l<? super UserInList, i> lVar2 = this.m;
        if (lVar2 == null ? a1Var.m != null : !lVar2.equals(a1Var.m)) {
            return false;
        }
        l<? super m, i> lVar3 = this.n;
        if (lVar3 == null ? a1Var.n != null : !lVar3.equals(a1Var.n)) {
            return false;
        }
        l<? super m, i> lVar4 = this.o;
        if (lVar4 == null ? a1Var.o != null : !lVar4.equals(a1Var.o)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? a1Var.i == null : aVar.equals(a1Var.i);
    }

    public void g(w wVar, Object obj, int i) {
        z0.a aVar = (z0.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.j;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<m> list = this.k;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        l<? super User, i> lVar = this.l;
        int hashCode4 = (hashCode3 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        l<? super UserInList, i> lVar2 = this.m;
        int hashCode5 = (hashCode4 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        l<? super m, i> lVar3 = this.n;
        int hashCode6 = (hashCode5 + (lVar3 != null ? lVar3.hashCode() : 0)) * 31;
        l<? super m, i> lVar4 = this.o;
        int hashCode7 = (hashCode6 + (lVar4 != null ? lVar4.hashCode() : 0)) * 31;
        a<i> aVar = this.i;
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
        return R.layout.feed_suggestions;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("UserSuggestions_{title=");
        P0.append(this.j);
        P0.append(", users=");
        P0.append(this.k);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        z0.a aVar = (z0.a) obj;
    }
}
