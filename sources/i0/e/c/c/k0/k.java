package i0.e.c.c.k0;

import android.view.View;
import android.view.ViewGroup;
import i0.b.a.j0;
import i0.b.a.o;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.d.a.a.a;
import java.util.Objects;

/* compiled from: LoadingSegmentViewModel_ */
public class k extends t<i> implements z<i>, j {
    public j0<k, i> i;

    public void A(int i2, Object obj) {
        i iVar = (i) obj;
        j0<k, i> j0Var = this.i;
        if (j0Var != null) {
            j0Var.a(this, iVar, i2);
        }
    }

    public void B(Object obj) {
        i iVar = (i) obj;
    }

    public j D(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public j E(j0 j0Var) {
        w();
        this.i = j0Var;
        return this;
    }

    public void c(Object obj, int i2) {
        i iVar = (i) obj;
        C("The model was changed during the bind call.", i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k) || !super.equals(obj)) {
            return false;
        }
        k kVar = (k) obj;
        Objects.requireNonNull(kVar);
        return (this.i == null) == (kVar.i == null);
    }

    public void g(w wVar, Object obj, int i2) {
        i iVar = (i) obj;
        C("The model was changed between being added to the controller and being bound.", i2);
    }

    public int hashCode() {
        return (((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + (this.i != null ? 1 : 0)) * 31) + 0;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public void k(Object obj) {
        i iVar = (i) obj;
    }

    public void l(Object obj, t tVar) {
        i iVar = (i) obj;
        if (tVar instanceof k) {
            k kVar = (k) tVar;
        }
    }

    public View n(ViewGroup viewGroup) {
        i iVar = new i(viewGroup.getContext());
        iVar.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return iVar;
    }

    public int o() {
        throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
    }

    public int p(int i2, int i3, int i4) {
        return i2;
    }

    public int q() {
        return 0;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = a.P0("LoadingSegmentViewModel_{}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i2, int i3, Object obj) {
        i iVar = (i) obj;
    }
}
