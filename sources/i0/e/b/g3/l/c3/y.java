package i0.e.b.g3.l.c3;

import android.view.View;
import android.view.ViewGroup;
import i0.b.a.k0;
import i0.b.a.o;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.d.a.a.a;
import java.util.Objects;

/* compiled from: ClubSectionHeaderModel_ */
public class y extends t<w> implements z<w>, x {
    public k0 i = new k0((CharSequence) null);

    public void A(int i2, Object obj) {
        w wVar = (w) obj;
    }

    public void B(Object obj) {
        w wVar = (w) obj;
    }

    public x D(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public x E(CharSequence charSequence) {
        w();
        k0 k0Var = this.i;
        k0Var.c = charSequence;
        k0Var.d = 0;
        return this;
    }

    public void c(Object obj, int i2) {
        w wVar = (w) obj;
        C("The model was changed during the bind call.", i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y) || !super.equals(obj)) {
            return false;
        }
        y yVar = (y) obj;
        Objects.requireNonNull(yVar);
        k0 k0Var = this.i;
        k0 k0Var2 = yVar.i;
        return k0Var == null ? k0Var2 == null : k0Var.equals(k0Var2);
    }

    public void g(w wVar, Object obj, int i2) {
        w wVar2 = (w) obj;
        C("The model was changed between being added to the controller and being bound.", i2);
    }

    public int hashCode() {
        int i2 = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        k0 k0Var = this.i;
        if (k0Var != null) {
            i2 = k0Var.hashCode();
        }
        return hashCode + i2;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public void k(Object obj) {
        w wVar = (w) obj;
        wVar.setTitle(this.i.c(wVar.getContext()));
    }

    public void l(Object obj, t tVar) {
        w wVar = (w) obj;
        if (!(tVar instanceof y)) {
            wVar.setTitle(this.i.c(wVar.getContext()));
            return;
        }
        k0 k0Var = this.i;
        k0 k0Var2 = ((y) tVar).i;
        if (k0Var != null) {
            if (k0Var.equals(k0Var2)) {
                return;
            }
        } else if (k0Var2 == null) {
            return;
        }
        wVar.setTitle(this.i.c(wVar.getContext()));
    }

    public View n(ViewGroup viewGroup) {
        w wVar = new w(viewGroup.getContext());
        wVar.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return wVar;
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
        StringBuilder P0 = a.P0("ClubSectionHeaderModel_{title_StringAttributeData=");
        P0.append(this.i);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i2, int i3, Object obj) {
        w wVar = (w) obj;
    }
}
