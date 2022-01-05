package i0.e.b.g3.l.x2;

import android.view.View;
import android.view.ViewGroup;
import com.clubhouse.android.user.model.User;
import i0.b.a.o;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.d.a.a.a;
import java.util.List;
import java.util.Objects;

/* compiled from: ClubNominationsPreviewItemModel_ */
public class p extends t<n> implements z<n>, o {
    public List<? extends User> i = null;
    public View.OnClickListener j = null;

    public void A(int i2, Object obj) {
        n nVar = (n) obj;
    }

    public void B(Object obj) {
        ((n) obj).setClickListener((View.OnClickListener) null);
    }

    public o D(View.OnClickListener onClickListener) {
        w();
        this.j = onClickListener;
        return this;
    }

    public o E(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public o F(List list) {
        w();
        this.i = list;
        return this;
    }

    public void c(Object obj, int i2) {
        n nVar = (n) obj;
        C("The model was changed during the bind call.", i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p) || !super.equals(obj)) {
            return false;
        }
        p pVar = (p) obj;
        Objects.requireNonNull(pVar);
        List<? extends User> list = this.i;
        if (list == null ? pVar.i != null : !list.equals(pVar.i)) {
            return false;
        }
        return (this.j == null) == (pVar.j == null);
    }

    public void g(w wVar, Object obj, int i2) {
        n nVar = (n) obj;
        C("The model was changed between being added to the controller and being bound.", i2);
    }

    public int hashCode() {
        int i2 = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        List<? extends User> list = this.i;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        if (this.j != null) {
            i2 = 1;
        }
        return hashCode2 + i2;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public void k(Object obj) {
        n nVar = (n) obj;
        nVar.setClickListener(this.j);
        nVar.setUsers(this.i);
    }

    public void l(Object obj, t tVar) {
        n nVar = (n) obj;
        if (!(tVar instanceof p)) {
            nVar.setClickListener(this.j);
            nVar.setUsers(this.i);
            return;
        }
        p pVar = (p) tVar;
        View.OnClickListener onClickListener = this.j;
        boolean z = true;
        boolean z2 = onClickListener == null;
        if (pVar.j != null) {
            z = false;
        }
        if (z2 != z) {
            nVar.setClickListener(onClickListener);
        }
        List<? extends User> list = this.i;
        List<? extends User> list2 = pVar.i;
        if (list != null) {
            if (list.equals(list2)) {
                return;
            }
        } else if (list2 == null) {
            return;
        }
        nVar.setUsers(this.i);
    }

    public View n(ViewGroup viewGroup) {
        n nVar = new n(viewGroup.getContext());
        nVar.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return nVar;
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
        StringBuilder P0 = a.P0("ClubNominationsPreviewItemModel_{users_List=");
        P0.append(this.i);
        P0.append(", clickListener_OnClickListener=");
        P0.append(this.j);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i2, int i3, Object obj) {
        n nVar = (n) obj;
    }
}
