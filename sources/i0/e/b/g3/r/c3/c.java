package i0.e.b.g3.r.c3;

import android.view.View;
import android.view.ViewParent;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.r.c3.a;
import java.util.Objects;
import m0.i;

/* compiled from: SimpleListUser_ */
public class c extends a implements z<a.C0207a>, b {
    public void A(int i, Object obj) {
        super.G(i, (a.C0207a) obj);
    }

    public void B(Object obj) {
        super.H((a.C0207a) obj);
    }

    public r E(ViewParent viewParent) {
        return new a.C0207a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        a.C0207a aVar = (a.C0207a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (a.C0207a) rVar);
    }

    public void H(r rVar) {
        super.H((a.C0207a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (a.C0207a) dVar);
    }

    public void J(d dVar) {
        super.H((a.C0207a) dVar);
    }

    public b L(View.OnClickListener onClickListener) {
        w();
        this.o = onClickListener;
        return this;
    }

    public b M(boolean z) {
        w();
        this.n = z;
        return this;
    }

    public b N(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public b O(String str) {
        w();
        this.k = str;
        return this;
    }

    public b P(String str) {
        w();
        this.j = str;
        return this;
    }

    public b Q(boolean z) {
        w();
        this.l = z;
        return this;
    }

    public b R(boolean z) {
        w();
        this.m = z;
        return this;
    }

    public void c(Object obj, int i) {
        a.C0207a aVar = (a.C0207a) obj;
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
        if (this.l != cVar.l || this.m != cVar.m || this.n != cVar.n) {
            return false;
        }
        View.OnClickListener onClickListener = this.o;
        if (onClickListener == null ? cVar.o != null : !onClickListener.equals(cVar.o)) {
            return false;
        }
        m0.n.a.a<i> aVar = this.i;
        return aVar == null ? cVar.i == null : aVar.equals(cVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        a.C0207a aVar = (a.C0207a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.j;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.k;
        int hashCode3 = (((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.l ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31) + (this.n ? 1 : 0)) * 31;
        View.OnClickListener onClickListener = this.o;
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

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("SimpleListUser_{name=");
        P0.append(this.j);
        P0.append(", image=");
        P0.append(this.k);
        P0.append(", selected=");
        P0.append(this.l);
        P0.append(", showSelectButton=");
        P0.append(this.m);
        P0.append(", compact=");
        P0.append(this.n);
        P0.append(", clickListener=");
        P0.append(this.o);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        a.C0207a aVar = (a.C0207a) obj;
    }
}
