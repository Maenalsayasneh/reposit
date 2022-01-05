package i0.e.b.g3.p.c0.e0;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.p.c0.e0.s0;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: ToggleBlockedPillView_ */
public class t0 extends s0 implements z<s0.a> {
    public void A(int i, Object obj) {
        super.G(i, (s0.a) obj);
    }

    public void B(Object obj) {
        super.H((s0.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new s0.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        s0.a aVar = (s0.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (s0.a) rVar);
    }

    public void H(r rVar) {
        super.H((s0.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (s0.a) dVar);
    }

    public void J(d dVar) {
        super.H((s0.a) dVar);
    }

    public void c(Object obj, int i) {
        s0.a aVar = (s0.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t0) || !super.equals(obj)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        Objects.requireNonNull(t0Var);
        String str = this.j;
        if (str == null ? t0Var.j != null : !str.equals(t0Var.j)) {
            return false;
        }
        View.OnClickListener onClickListener = this.k;
        if (onClickListener == null ? t0Var.k != null : !onClickListener.equals(t0Var.k)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? t0Var.i == null : aVar.equals(t0Var.i);
    }

    public void g(w wVar, Object obj, int i) {
        s0.a aVar = (s0.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.j;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
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
        return R.layout.view_toggle_blocked_pill;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ToggleBlockedPillView_{blockedText=");
        P0.append(this.j);
        P0.append(", clickListener=");
        P0.append(this.k);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        s0.a aVar = (s0.a) obj;
    }
}
