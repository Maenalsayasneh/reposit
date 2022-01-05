package i0.e.b.g3.p.c0.e0;

import android.view.View;
import android.view.ViewGroup;
import i0.b.a.o;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.d.a.a.a;
import java.util.Objects;

/* compiled from: HallwayEventDividerModel_ */
public class f0 extends t<d0> implements z<d0>, e0 {
    public void A(int i, Object obj) {
        d0 d0Var = (d0) obj;
    }

    public void B(Object obj) {
        d0 d0Var = (d0) obj;
    }

    public e0 D(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public void c(Object obj, int i) {
        d0 d0Var = (d0) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0) || !super.equals(obj)) {
            return false;
        }
        Objects.requireNonNull((f0) obj);
        return true;
    }

    public void g(w wVar, Object obj, int i) {
        d0 d0Var = (d0) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        return (((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public void k(Object obj) {
        d0 d0Var = (d0) obj;
    }

    public void l(Object obj, t tVar) {
        d0 d0Var = (d0) obj;
        if (tVar instanceof f0) {
            f0 f0Var = (f0) tVar;
        }
    }

    public View n(ViewGroup viewGroup) {
        d0 d0Var = new d0(viewGroup.getContext());
        d0Var.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return d0Var;
    }

    public int o() {
        throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
    }

    public int p(int i, int i2, int i3) {
        return i;
    }

    public int q() {
        return 0;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = a.P0("HallwayEventDividerModel_{}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        d0 d0Var = (d0) obj;
    }
}
