package i0.e.c.c.k0;

import android.view.View;
import android.view.ViewGroup;
import i0.b.a.o;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.d.a.a.a;
import java.util.Objects;

/* compiled from: ChatHeaderAvatarViewModel_ */
public class c extends t<a> implements z<a>, b {
    public String i = null;
    public String j = null;
    public Integer k = null;
    public View.OnClickListener l = null;

    public void A(int i2, Object obj) {
        a aVar = (a) obj;
    }

    public void B(Object obj) {
        ((a) obj).setClickListener((View.OnClickListener) null);
    }

    public b D(String str) {
        w();
        this.j = str;
        return this;
    }

    public b E(View.OnClickListener onClickListener) {
        w();
        this.l = onClickListener;
        return this;
    }

    public b F(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public b G(Integer num) {
        w();
        this.k = num;
        return this;
    }

    public b H(String str) {
        w();
        this.i = str;
        return this;
    }

    public void c(Object obj, int i2) {
        a aVar = (a) obj;
        C("The model was changed during the bind call.", i2);
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
        String str = this.i;
        if (str == null ? cVar.i != null : !str.equals(cVar.i)) {
            return false;
        }
        String str2 = this.j;
        if (str2 == null ? cVar.j != null : !str2.equals(cVar.j)) {
            return false;
        }
        Integer num = this.k;
        if (num == null ? cVar.k != null : !num.equals(cVar.k)) {
            return false;
        }
        return (this.l == null) == (cVar.l == null);
    }

    public void g(w wVar, Object obj, int i2) {
        a aVar = (a) obj;
        C("The model was changed between being added to the controller and being bound.", i2);
    }

    public int hashCode() {
        int i2 = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.i;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.j;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.k;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        if (this.l != null) {
            i2 = 1;
        }
        return hashCode4 + i2;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public void k(Object obj) {
        a aVar = (a) obj;
        aVar.setName(this.i);
        aVar.setClickListener(this.l);
        aVar.setAvatar(this.j);
        aVar.setLastActiveMinutes(this.k);
    }

    public void l(Object obj, t tVar) {
        a aVar = (a) obj;
        if (!(tVar instanceof c)) {
            aVar.setName(this.i);
            aVar.setClickListener(this.l);
            aVar.setAvatar(this.j);
            aVar.setLastActiveMinutes(this.k);
            return;
        }
        c cVar = (c) tVar;
        String str = this.i;
        if (str == null ? cVar.i != null : !str.equals(cVar.i)) {
            aVar.setName(this.i);
        }
        View.OnClickListener onClickListener = this.l;
        boolean z = true;
        boolean z2 = onClickListener == null;
        if (cVar.l != null) {
            z = false;
        }
        if (z2 != z) {
            aVar.setClickListener(onClickListener);
        }
        String str2 = this.j;
        if (str2 == null ? cVar.j != null : !str2.equals(cVar.j)) {
            aVar.setAvatar(this.j);
        }
        Integer num = this.k;
        Integer num2 = cVar.k;
        if (num != null) {
            if (num.equals(num2)) {
                return;
            }
        } else if (num2 == null) {
            return;
        }
        aVar.setLastActiveMinutes(this.k);
    }

    public View n(ViewGroup viewGroup) {
        a aVar = new a(viewGroup.getContext());
        aVar.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        return aVar;
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
        StringBuilder P0 = a.P0("ChatHeaderAvatarViewModel_{name_String=");
        P0.append(this.i);
        P0.append(", avatar_String=");
        P0.append(this.j);
        P0.append(", lastActiveMinutes_Integer=");
        P0.append(this.k);
        P0.append(", clickListener_OnClickListener=");
        P0.append(this.l);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i2, int i3, Object obj) {
        a aVar = (a) obj;
    }
}
