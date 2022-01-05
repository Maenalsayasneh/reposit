package i0.e.c.i.r;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import i0.b.a.o;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.d.a.a.a;
import i0.e.b.d3.k;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: ChatMemberViewModel_ */
public class f extends t<d> implements z<d>, e {
    public String i = null;
    public String j = null;
    public boolean k = false;
    public boolean l = false;
    public Integer m = null;
    public View.OnClickListener n = null;
    public View.OnClickListener o = null;

    public void A(int i2, Object obj) {
        d dVar = (d) obj;
    }

    public void B(Object obj) {
        d dVar = (d) obj;
        dVar.setRemoveClickListener((View.OnClickListener) null);
        dVar.setUserClickListener((View.OnClickListener) null);
    }

    public e D(boolean z) {
        w();
        this.k = z;
        return this;
    }

    public e E(String str) {
        w();
        this.j = str;
        return this;
    }

    /* renamed from: F */
    public void k(d dVar) {
        dVar.setName(this.i);
        boolean z = this.l;
        ImageView imageView = dVar.n2.g;
        i.d(imageView, "binding.remove");
        k.L(imageView, Boolean.valueOf(z));
        dVar.setAvatar(this.j);
        dVar.setLastActiveMinutes(this.m);
        dVar.setUserClickListener(this.o);
        dVar.setAdmin(this.k);
        dVar.setRemoveClickListener(this.n);
    }

    public e G(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public e H(Integer num) {
        w();
        this.m = num;
        return this;
    }

    public e I(String str) {
        w();
        this.i = str;
        return this;
    }

    public e J(View.OnClickListener onClickListener) {
        w();
        this.n = onClickListener;
        return this;
    }

    public e K(boolean z) {
        w();
        this.l = z;
        return this;
    }

    public e L(View.OnClickListener onClickListener) {
        w();
        this.o = onClickListener;
        return this;
    }

    public void c(Object obj, int i2) {
        d dVar = (d) obj;
        C("The model was changed during the bind call.", i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f) || !super.equals(obj)) {
            return false;
        }
        f fVar = (f) obj;
        Objects.requireNonNull(fVar);
        String str = this.i;
        if (str == null ? fVar.i != null : !str.equals(fVar.i)) {
            return false;
        }
        String str2 = this.j;
        if (str2 == null ? fVar.j != null : !str2.equals(fVar.j)) {
            return false;
        }
        if (this.k != fVar.k || this.l != fVar.l) {
            return false;
        }
        Integer num = this.m;
        if (num == null ? fVar.m != null : !num.equals(fVar.m)) {
            return false;
        }
        if ((this.n == null) != (fVar.n == null)) {
            return false;
        }
        return (this.o == null) == (fVar.o == null);
    }

    public void g(w wVar, Object obj, int i2) {
        d dVar = (d) obj;
        C("The model was changed between being added to the controller and being bound.", i2);
    }

    public int hashCode() {
        int i2 = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.i;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.j;
        int hashCode3 = (((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.k ? 1 : 0)) * 31) + (this.l ? 1 : 0)) * 31;
        Integer num = this.m;
        int hashCode4 = (((hashCode3 + (num != null ? num.hashCode() : 0)) * 31) + (this.n != null ? 1 : 0)) * 31;
        if (this.o != null) {
            i2 = 1;
        }
        return hashCode4 + i2;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public void l(Object obj, t tVar) {
        d dVar = (d) obj;
        if (!(tVar instanceof f)) {
            k(dVar);
            return;
        }
        f fVar = (f) tVar;
        String str = this.i;
        if (str == null ? fVar.i != null : !str.equals(fVar.i)) {
            dVar.setName(this.i);
        }
        boolean z = this.l;
        if (z != fVar.l) {
            ImageView imageView = dVar.n2.g;
            i.d(imageView, "binding.remove");
            k.L(imageView, Boolean.valueOf(z));
        }
        String str2 = this.j;
        if (str2 == null ? fVar.j != null : !str2.equals(fVar.j)) {
            dVar.setAvatar(this.j);
        }
        Integer num = this.m;
        if (num == null ? fVar.m != null : !num.equals(fVar.m)) {
            dVar.setLastActiveMinutes(this.m);
        }
        View.OnClickListener onClickListener = this.o;
        boolean z2 = true;
        if ((onClickListener == null) != (fVar.o == null)) {
            dVar.setUserClickListener(onClickListener);
        }
        boolean z3 = this.k;
        if (z3 != fVar.k) {
            dVar.setAdmin(z3);
        }
        View.OnClickListener onClickListener2 = this.n;
        boolean z4 = onClickListener2 == null;
        if (fVar.n != null) {
            z2 = false;
        }
        if (z4 != z2) {
            dVar.setRemoveClickListener(onClickListener2);
        }
    }

    public View n(ViewGroup viewGroup) {
        d dVar = new d(viewGroup.getContext());
        dVar.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return dVar;
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
        StringBuilder P0 = a.P0("ChatMemberViewModel_{name_String=");
        P0.append(this.i);
        P0.append(", avatar_String=");
        P0.append(this.j);
        P0.append(", admin_Boolean=");
        P0.append(this.k);
        P0.append(", showRemove_Boolean=");
        P0.append(this.l);
        P0.append(", lastActiveMinutes_Integer=");
        P0.append(this.m);
        P0.append(", removeClickListener_OnClickListener=");
        P0.append(this.n);
        P0.append(", userClickListener_OnClickListener=");
        P0.append(this.o);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i2, int i3, Object obj) {
        d dVar = (d) obj;
    }
}
