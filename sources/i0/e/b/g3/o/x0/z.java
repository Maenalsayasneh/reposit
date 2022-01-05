package i0.e.b.g3.o.x0;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.e.b.a3.f.d;
import i0.e.b.g3.o.x0.x;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: EventInfo_ */
public class z extends x implements i0.b.a.z<x.a>, y {
    public void A(int i, Object obj) {
        super.G(i, (x.a) obj);
    }

    public void B(Object obj) {
        super.H((x.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new x.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        x.a aVar = (x.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (x.a) rVar);
    }

    public void H(r rVar) {
        super.H((x.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (x.a) dVar);
    }

    public void J(d dVar) {
        super.H((x.a) dVar);
    }

    public y L(boolean z) {
        w();
        this.k = z;
        return this;
    }

    public y M(View.OnClickListener onClickListener) {
        w();
        this.p = onClickListener;
        return this;
    }

    public y N(View.OnClickListener onClickListener) {
        w();
        this.t = onClickListener;
        return this;
    }

    public y O(View.OnClickListener onClickListener) {
        w();
        this.s = onClickListener;
        return this;
    }

    public y P(View.OnClickListener onClickListener) {
        w();
        this.r = onClickListener;
        return this;
    }

    public y Q(boolean z) {
        w();
        this.n = z;
        return this;
    }

    public y R(EventInClub eventInClub) {
        w();
        this.j = eventInClub;
        return this;
    }

    public y S(boolean z) {
        w();
        this.l = z;
        return this;
    }

    public y T(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public y U(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public y V(View.OnClickListener onClickListener) {
        w();
        this.q = onClickListener;
        return this;
    }

    public y W(boolean z) {
        w();
        this.o = z;
        return this;
    }

    public y X(String str) {
        w();
        this.m = str;
        return this;
    }

    public void c(Object obj, int i) {
        x.a aVar = (x.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z) || !super.equals(obj)) {
            return false;
        }
        z zVar = (z) obj;
        Objects.requireNonNull(zVar);
        EventInClub eventInClub = this.j;
        if (eventInClub == null ? zVar.j != null : !eventInClub.equals(zVar.j)) {
            return false;
        }
        if (this.k != zVar.k || this.l != zVar.l) {
            return false;
        }
        String str = this.m;
        if (str == null ? zVar.m != null : !str.equals(zVar.m)) {
            return false;
        }
        if (this.n != zVar.n || this.o != zVar.o) {
            return false;
        }
        View.OnClickListener onClickListener = this.p;
        if (onClickListener == null ? zVar.p != null : !onClickListener.equals(zVar.p)) {
            return false;
        }
        View.OnClickListener onClickListener2 = this.q;
        if (onClickListener2 == null ? zVar.q != null : !onClickListener2.equals(zVar.q)) {
            return false;
        }
        View.OnClickListener onClickListener3 = this.r;
        if (onClickListener3 == null ? zVar.r != null : !onClickListener3.equals(zVar.r)) {
            return false;
        }
        View.OnClickListener onClickListener4 = this.s;
        if (onClickListener4 == null ? zVar.s != null : !onClickListener4.equals(zVar.s)) {
            return false;
        }
        View.OnClickListener onClickListener5 = this.t;
        if (onClickListener5 == null ? zVar.t != null : !onClickListener5.equals(zVar.t)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? zVar.i == null : aVar.equals(zVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        x.a aVar = (x.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        EventInClub eventInClub = this.j;
        int hashCode2 = (((((hashCode + (eventInClub != null ? eventInClub.hashCode() : 0)) * 31) + (this.k ? 1 : 0)) * 31) + (this.l ? 1 : 0)) * 31;
        String str = this.m;
        int hashCode3 = (((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + (this.n ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 31;
        View.OnClickListener onClickListener = this.p;
        int hashCode4 = (hashCode3 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener2 = this.q;
        int hashCode5 = (hashCode4 + (onClickListener2 != null ? onClickListener2.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener3 = this.r;
        int hashCode6 = (hashCode5 + (onClickListener3 != null ? onClickListener3.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener4 = this.s;
        int hashCode7 = (hashCode6 + (onClickListener4 != null ? onClickListener4.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener5 = this.t;
        int hashCode8 = (hashCode7 + (onClickListener5 != null ? onClickListener5.hashCode() : 0)) * 31;
        a<i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode8 + i;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.event_info;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("EventInfo_{event=");
        P0.append(this.j);
        P0.append(", attended=");
        P0.append(this.k);
        P0.append(", extendedTimeFormat=");
        P0.append(this.l);
        P0.append(", subtitle=");
        P0.append(this.m);
        P0.append(", editable=");
        P0.append(this.n);
        P0.append(", showBell=");
        P0.append(this.o);
        P0.append(", bellClickListener=");
        P0.append(this.p);
        P0.append(", menuClickListener=");
        P0.append(this.q);
        P0.append(", editClickListener=");
        P0.append(this.r);
        P0.append(", clubClickListener=");
        P0.append(this.s);
        P0.append(", clickListener=");
        P0.append(this.t);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        x.a aVar = (x.a) obj;
    }
}
