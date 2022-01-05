package i0.e.c.i.r;

import android.view.View;
import android.view.ViewGroup;
import i0.b.a.o;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.d.a.a.a;
import java.util.Objects;

/* compiled from: AddChatMemberViewModel_ */
public class c extends t<a> implements z<a>, b {
    public View.OnClickListener i = null;

    public void A(int i2, Object obj) {
        a aVar = (a) obj;
    }

    public void B(Object obj) {
        ((a) obj).setClickListener((View.OnClickListener) null);
    }

    public b D(View.OnClickListener onClickListener) {
        w();
        this.i = onClickListener;
        return this;
    }

    public b E(CharSequence charSequence) {
        s(charSequence);
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
        return (this.i == null) == (cVar.i == null);
    }

    public void g(w wVar, Object obj, int i2) {
        a aVar = (a) obj;
        C("The model was changed between being added to the controller and being bound.", i2);
    }

    public int hashCode() {
        int i2 = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        if (this.i != null) {
            i2 = 1;
        }
        return hashCode + i2;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public void k(Object obj) {
        ((a) obj).setClickListener(this.i);
    }

    public void l(Object obj, t tVar) {
        a aVar = (a) obj;
        if (!(tVar instanceof c)) {
            aVar.setClickListener(this.i);
            return;
        }
        c cVar = (c) tVar;
        View.OnClickListener onClickListener = this.i;
        boolean z = true;
        boolean z2 = onClickListener == null;
        if (cVar.i != null) {
            z = false;
        }
        if (z2 != z) {
            aVar.setClickListener(onClickListener);
        }
    }

    public View n(ViewGroup viewGroup) {
        a aVar = new a(viewGroup.getContext());
        aVar.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
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

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = a.P0("AddChatMemberViewModel_{clickListener_OnClickListener=");
        P0.append(this.i);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i2, int i3, Object obj) {
        a aVar = (a) obj;
    }
}
