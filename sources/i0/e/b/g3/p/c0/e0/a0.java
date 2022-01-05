package i0.e.b.g3.p.c0.e0;

import android.view.ViewParent;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.p.c0.e0.y;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: EventUserSuggestion_ */
public class a0 extends y implements z<y.a>, z {
    public void A(int i, Object obj) {
        super.G(i, (y.a) obj);
    }

    public void B(Object obj) {
        super.H((y.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new y.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        y.a aVar = (y.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (y.a) rVar);
    }

    public void H(r rVar) {
        super.H((y.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (y.a) dVar);
    }

    public void J(d dVar) {
        super.H((y.a) dVar);
    }

    public z L(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public z M(UserInList userInList) {
        w();
        this.j = userInList;
        return this;
    }

    public void c(Object obj, int i) {
        y.a aVar = (y.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0) || !super.equals(obj)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        Objects.requireNonNull(a0Var);
        UserInList userInList = this.j;
        if (userInList == null ? a0Var.j != null : !userInList.equals(a0Var.j)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? a0Var.i == null : aVar.equals(a0Var.i);
    }

    public void g(w wVar, Object obj, int i) {
        y.a aVar = (y.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        UserInList userInList = this.j;
        int hashCode2 = (hashCode + (userInList != null ? userInList.hashCode() : 0)) * 31;
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
        return R.layout.event_user_medium;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("EventUserSuggestion_{user=");
        P0.append(this.j);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        y.a aVar = (y.a) obj;
    }
}
