package i0.e.b.g3.l.x2;

import android.view.View;
import android.view.ViewGroup;
import i0.b.a.k0;
import i0.b.a.o;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.d.a.a.a;
import java.util.Objects;

/* compiled from: ClubInviteCardModel_ */
public class m extends t<k> implements z<k>, l {
    public k0 i = new k0((CharSequence) null);
    public k0 j = new k0((CharSequence) null);
    public View.OnClickListener k = null;

    public void A(int i2, Object obj) {
        k kVar = (k) obj;
    }

    public void B(Object obj) {
        ((k) obj).setShareClickListener((View.OnClickListener) null);
    }

    /* renamed from: D */
    public void k(k kVar) {
        kVar.setShareClickListener(this.k);
        kVar.setTitle(this.i.c(kVar.getContext()));
        kVar.setShareLabel(this.j.c(kVar.getContext()));
    }

    public l E(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public l F(View.OnClickListener onClickListener) {
        w();
        this.k = onClickListener;
        return this;
    }

    public l G(CharSequence charSequence) {
        w();
        k0 k0Var = this.j;
        k0Var.c = charSequence;
        k0Var.d = 0;
        return this;
    }

    public l H(CharSequence charSequence) {
        w();
        k0 k0Var = this.i;
        k0Var.c = charSequence;
        k0Var.d = 0;
        return this;
    }

    public void c(Object obj, int i2) {
        k kVar = (k) obj;
        C("The model was changed during the bind call.", i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m) || !super.equals(obj)) {
            return false;
        }
        m mVar = (m) obj;
        Objects.requireNonNull(mVar);
        k0 k0Var = this.i;
        if (k0Var == null ? mVar.i != null : !k0Var.equals(mVar.i)) {
            return false;
        }
        k0 k0Var2 = this.j;
        if (k0Var2 == null ? mVar.j != null : !k0Var2.equals(mVar.j)) {
            return false;
        }
        return (this.k == null) == (mVar.k == null);
    }

    public void g(w wVar, Object obj, int i2) {
        k kVar = (k) obj;
        C("The model was changed between being added to the controller and being bound.", i2);
    }

    public int hashCode() {
        int i2 = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        k0 k0Var = this.i;
        int hashCode2 = (hashCode + (k0Var != null ? k0Var.hashCode() : 0)) * 31;
        k0 k0Var2 = this.j;
        int hashCode3 = (hashCode2 + (k0Var2 != null ? k0Var2.hashCode() : 0)) * 31;
        if (this.k != null) {
            i2 = 1;
        }
        return hashCode3 + i2;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public void l(Object obj, t tVar) {
        k kVar = (k) obj;
        if (!(tVar instanceof m)) {
            k(kVar);
            return;
        }
        m mVar = (m) tVar;
        View.OnClickListener onClickListener = this.k;
        boolean z = true;
        boolean z2 = onClickListener == null;
        if (mVar.k != null) {
            z = false;
        }
        if (z2 != z) {
            kVar.setShareClickListener(onClickListener);
        }
        k0 k0Var = this.i;
        if (k0Var == null ? mVar.i != null : !k0Var.equals(mVar.i)) {
            kVar.setTitle(this.i.c(kVar.getContext()));
        }
        k0 k0Var2 = this.j;
        k0 k0Var3 = mVar.j;
        if (k0Var2 != null) {
            if (k0Var2.equals(k0Var3)) {
                return;
            }
        } else if (k0Var3 == null) {
            return;
        }
        kVar.setShareLabel(this.j.c(kVar.getContext()));
    }

    public View n(ViewGroup viewGroup) {
        k kVar = new k(viewGroup.getContext());
        kVar.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return kVar;
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
        StringBuilder P0 = a.P0("ClubInviteCardModel_{title_StringAttributeData=");
        P0.append(this.i);
        P0.append(", shareLabel_StringAttributeData=");
        P0.append(this.j);
        P0.append(", shareClickListener_OnClickListener=");
        P0.append(this.k);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i2, int i3, Object obj) {
        k kVar = (k) obj;
    }
}
