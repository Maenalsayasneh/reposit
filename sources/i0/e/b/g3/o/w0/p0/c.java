package i0.e.b.g3.o.w0.p0;

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
import i0.e.b.g3.o.w0.p0.a;
import java.util.Objects;
import m0.i;

/* compiled from: EventCoHost_ */
public class c extends a implements z<a.C0205a>, b {
    public void A(int i, Object obj) {
        super.G(i, (a.C0205a) obj);
    }

    public void B(Object obj) {
        super.H((a.C0205a) obj);
    }

    public r E(ViewParent viewParent) {
        return new a.C0205a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        a.C0205a aVar = (a.C0205a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (a.C0205a) rVar);
    }

    public void H(r rVar) {
        super.H((a.C0205a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (a.C0205a) dVar);
    }

    public void J(d dVar) {
        super.H((a.C0205a) dVar);
    }

    public b L(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public b M(View.OnClickListener onClickListener) {
        w();
        this.l = onClickListener;
        return this;
    }

    public b N(boolean z) {
        w();
        this.k = z;
        return this;
    }

    public b O(UserInList userInList) {
        w();
        this.j = userInList;
        return this;
    }

    public void c(Object obj, int i) {
        a.C0205a aVar = (a.C0205a) obj;
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
        UserInList userInList = this.j;
        if (userInList == null ? cVar.j != null : !userInList.equals(cVar.j)) {
            return false;
        }
        if (this.k != cVar.k) {
            return false;
        }
        View.OnClickListener onClickListener = this.l;
        if (onClickListener == null ? cVar.l != null : !onClickListener.equals(cVar.l)) {
            return false;
        }
        m0.n.a.a<i> aVar = this.i;
        return aVar == null ? cVar.i == null : aVar.equals(cVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        a.C0205a aVar = (a.C0205a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        UserInList userInList = this.j;
        int hashCode2 = (((hashCode + (userInList != null ? userInList.hashCode() : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        View.OnClickListener onClickListener = this.l;
        int hashCode3 = (hashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        m0.n.a.a<i> aVar = this.i;
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
        return R.layout.event_co_host;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("EventCoHost_{user=");
        P0.append(this.j);
        P0.append(", self=");
        P0.append(this.k);
        P0.append(", removeClickListener=");
        P0.append(this.l);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        a.C0205a aVar = (a.C0205a) obj;
    }
}
