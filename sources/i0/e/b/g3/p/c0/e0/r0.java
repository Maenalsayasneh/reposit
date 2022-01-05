package i0.e.b.g3.p.c0.e0;

import android.view.View;
import android.view.ViewParent;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.p.c0.e0.p0;
import java.util.Objects;
import m0.n.a.a;
import m0.n.b.i;

/* compiled from: LanguagePicker_ */
public class r0 extends p0 implements z<p0.a>, q0 {
    public void A(int i, Object obj) {
        super.G(i, (p0.a) obj);
    }

    public void B(Object obj) {
        super.H((p0.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new p0.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        p0.a aVar = (p0.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (p0.a) rVar);
    }

    public void H(r rVar) {
        super.H((p0.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (p0.a) dVar);
    }

    public void J(d dVar) {
        super.H((p0.a) dVar);
    }

    public q0 L(String str) {
        w();
        i.e(str, "<set-?>");
        this.l = str;
        return this;
    }

    public q0 M(String str) {
        w();
        i.e(str, "<set-?>");
        this.k = str;
        return this;
    }

    public q0 N(String str) {
        w();
        i.e(str, "<set-?>");
        this.j = str;
        return this;
    }

    public void c(Object obj, int i) {
        p0.a aVar = (p0.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0) || !super.equals(obj)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        Objects.requireNonNull(r0Var);
        String str = this.j;
        if (str == null ? r0Var.j != null : !str.equals(r0Var.j)) {
            return false;
        }
        String str2 = this.k;
        if (str2 == null ? r0Var.k != null : !str2.equals(r0Var.k)) {
            return false;
        }
        String str3 = this.l;
        if (str3 == null ? r0Var.l != null : !str3.equals(r0Var.l)) {
            return false;
        }
        View.OnClickListener onClickListener = this.m;
        if (onClickListener == null ? r0Var.m != null : !onClickListener.equals(r0Var.m)) {
            return false;
        }
        View.OnClickListener onClickListener2 = this.n;
        if (onClickListener2 == null ? r0Var.n != null : !onClickListener2.equals(r0Var.n)) {
            return false;
        }
        a<m0.i> aVar = this.i;
        return aVar == null ? r0Var.i == null : aVar.equals(r0Var.i);
    }

    public void g(w wVar, Object obj, int i) {
        p0.a aVar = (p0.a) obj;
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
        a<m0.i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode6 + i;
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
        StringBuilder P0 = i0.d.a.a.a.P0("LanguagePicker_{title=");
        P0.append(this.j);
        P0.append(", dismissButtonTitle=");
        P0.append(this.k);
        P0.append(", acceptButtonTitle=");
        P0.append(this.l);
        P0.append(", dismissClickListener=");
        P0.append(this.m);
        P0.append(", acceptClickListener=");
        P0.append(this.n);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        p0.a aVar = (p0.a) obj;
    }
}
