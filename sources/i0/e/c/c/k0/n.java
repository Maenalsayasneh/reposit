package i0.e.c.c.k0;

import android.view.View;
import android.view.ViewGroup;
import i0.b.a.j0;
import i0.b.a.k0;
import i0.b.a.o;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.d.a.a.a;
import java.util.Objects;

/* compiled from: SystemMessageViewModel_ */
public class n extends t<l> implements z<l>, m {
    public j0<n, l> i;
    public k0 j = new k0((CharSequence) null);

    public void A(int i2, Object obj) {
        l lVar = (l) obj;
        j0<n, l> j0Var = this.i;
        if (j0Var != null) {
            j0Var.a(this, lVar, i2);
        }
    }

    public void B(Object obj) {
        l lVar = (l) obj;
    }

    public m D(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public m E(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public m F(CharSequence charSequence) {
        w();
        k0 k0Var = this.j;
        k0Var.c = charSequence;
        k0Var.d = 0;
        return this;
    }

    public m G(j0 j0Var) {
        w();
        this.i = j0Var;
        return this;
    }

    public void c(Object obj, int i2) {
        l lVar = (l) obj;
        C("The model was changed during the bind call.", i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n) || !super.equals(obj)) {
            return false;
        }
        n nVar = (n) obj;
        Objects.requireNonNull(nVar);
        if ((this.i == null) != (nVar.i == null)) {
            return false;
        }
        k0 k0Var = this.j;
        k0 k0Var2 = nVar.j;
        return k0Var == null ? k0Var2 == null : k0Var.equals(k0Var2);
    }

    public void g(w wVar, Object obj, int i2) {
        l lVar = (l) obj;
        C("The model was changed between being added to the controller and being bound.", i2);
    }

    public int hashCode() {
        int i2 = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + (this.i != null ? 1 : 0)) * 31) + 0) * 31;
        k0 k0Var = this.j;
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
        l lVar = (l) obj;
        lVar.setMessage(this.j.c(lVar.getContext()));
    }

    public void l(Object obj, t tVar) {
        l lVar = (l) obj;
        if (!(tVar instanceof n)) {
            lVar.setMessage(this.j.c(lVar.getContext()));
            return;
        }
        k0 k0Var = this.j;
        k0 k0Var2 = ((n) tVar).j;
        if (k0Var != null) {
            if (k0Var.equals(k0Var2)) {
                return;
            }
        } else if (k0Var2 == null) {
            return;
        }
        lVar.setMessage(this.j.c(lVar.getContext()));
    }

    public View n(ViewGroup viewGroup) {
        l lVar = new l(viewGroup.getContext());
        lVar.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return lVar;
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

    public t r(long j2) {
        super.r(j2);
        return this;
    }

    public String toString() {
        StringBuilder P0 = a.P0("SystemMessageViewModel_{message_StringAttributeData=");
        P0.append(this.j);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i2, int i3, Object obj) {
        l lVar = (l) obj;
    }
}
