package i0.e.b.g3.k.w0.b;

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
import i0.e.b.g3.k.w0.b.h;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: SelectableUser_ */
public class j extends h implements z<h.a>, i {
    public void A(int i, Object obj) {
        super.G(i, (h.a) obj);
    }

    public void B(Object obj) {
        super.H((h.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new h.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        h.a aVar = (h.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (h.a) rVar);
    }

    public void H(r rVar) {
        super.H((h.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (h.a) dVar);
    }

    public void J(d dVar) {
        super.H((h.a) dVar);
    }

    public i L(View.OnClickListener onClickListener) {
        w();
        this.m = onClickListener;
        return this;
    }

    public i M(boolean z) {
        w();
        this.l = z;
        return this;
    }

    public i N(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public i O(a aVar) {
        w();
        this.i = aVar;
        return this;
    }

    public i P(boolean z) {
        w();
        this.k = z;
        return this;
    }

    public i Q(UserInList userInList) {
        w();
        this.j = userInList;
        return this;
    }

    public void c(Object obj, int i) {
        h.a aVar = (h.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j) || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        Objects.requireNonNull(jVar);
        UserInList userInList = this.j;
        if (userInList == null ? jVar.j != null : !userInList.equals(jVar.j)) {
            return false;
        }
        if (this.k != jVar.k || this.l != jVar.l) {
            return false;
        }
        View.OnClickListener onClickListener = this.m;
        if (onClickListener == null ? jVar.m != null : !onClickListener.equals(jVar.m)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? jVar.i == null : aVar.equals(jVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        h.a aVar = (h.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        UserInList userInList = this.j;
        int hashCode2 = (((((hashCode + (userInList != null ? userInList.hashCode() : 0)) * 31) + (this.k ? 1 : 0)) * 31) + (this.l ? 1 : 0)) * 31;
        View.OnClickListener onClickListener = this.m;
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
        return R.layout.large_user_in_grid;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("SelectableUser_{user=");
        P0.append(this.j);
        P0.append(", selected=");
        P0.append(this.k);
        P0.append(", enableOnSelected=");
        P0.append(this.l);
        P0.append(", clickListener=");
        P0.append(this.m);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        h.a aVar = (h.a) obj;
    }
}
