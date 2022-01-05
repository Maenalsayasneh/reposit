package i0.e.b.g3.o.x0;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.o.x0.a0;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: EventUser_ */
public class b0 extends a0 implements z<a0.a> {
    public void A(int i, Object obj) {
        super.G(i, (a0.a) obj);
    }

    public void B(Object obj) {
        super.H((a0.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new a0.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        a0.a aVar = (a0.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (a0.a) rVar);
    }

    public void H(r rVar) {
        super.H((a0.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (a0.a) dVar);
    }

    public void J(d dVar) {
        super.H((a0.a) dVar);
    }

    public void c(Object obj, int i) {
        a0.a aVar = (a0.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0) || !super.equals(obj)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        Objects.requireNonNull(b0Var);
        UserInList userInList = this.j;
        if (userInList == null ? b0Var.j != null : !userInList.equals(b0Var.j)) {
            return false;
        }
        View.OnClickListener onClickListener = this.k;
        if (onClickListener == null ? b0Var.k != null : !onClickListener.equals(b0Var.k)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? b0Var.i == null : aVar.equals(b0Var.i);
    }

    public void g(w wVar, Object obj, int i) {
        a0.a aVar = (a0.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        UserInList userInList = this.j;
        int hashCode2 = (hashCode + (userInList != null ? userInList.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener = this.k;
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

    public int o() {
        return R.layout.event_user;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("EventUser_{user=");
        P0.append(this.j);
        P0.append(", clickListener=");
        P0.append(this.k);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        a0.a aVar = (a0.a) obj;
    }
}
