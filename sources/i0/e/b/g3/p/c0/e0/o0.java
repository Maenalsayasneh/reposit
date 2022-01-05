package i0.e.b.g3.p.c0.e0;

import android.view.View;
import android.view.ViewParent;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.p.c0.e0.n0;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: InvitePrompt_ */
public class o0 extends n0 implements z<n0.a> {
    public void A(int i, Object obj) {
        super.G(i, (n0.a) obj);
    }

    public void B(Object obj) {
        super.H((n0.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new n0.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        n0.a aVar = (n0.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (n0.a) rVar);
    }

    public void H(r rVar) {
        super.H((n0.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (n0.a) dVar);
    }

    public void J(d dVar) {
        super.H((n0.a) dVar);
    }

    public void c(Object obj, int i) {
        n0.a aVar = (n0.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0) || !super.equals(obj)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        Objects.requireNonNull(o0Var);
        View.OnClickListener onClickListener = this.j;
        if (onClickListener == null ? o0Var.j != null : !onClickListener.equals(o0Var.j)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? o0Var.i == null : aVar.equals(o0Var.i);
    }

    public void g(w wVar, Object obj, int i) {
        n0.a aVar = (n0.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        View.OnClickListener onClickListener = this.j;
        int hashCode2 = (hashCode + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
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

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("InvitePrompt_{clickListener=");
        P0.append(this.j);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        n0.a aVar = (n0.a) obj;
    }
}
