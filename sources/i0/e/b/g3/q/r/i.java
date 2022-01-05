package i0.e.b.g3.q.r;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.q.r.g;
import java.util.Objects;
import m0.n.a.a;

/* compiled from: InvitePhoneItem_ */
public class i extends g implements z<g.a>, h {
    public void A(int i, Object obj) {
        super.G(i, (g.a) obj);
    }

    public void B(Object obj) {
        super.H((g.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new g.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        g.a aVar = (g.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (g.a) rVar);
    }

    public void H(r rVar) {
        super.H((g.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (g.a) dVar);
    }

    public void J(d dVar) {
        super.H((g.a) dVar);
    }

    public h L(View.OnClickListener onClickListener) {
        w();
        this.k = onClickListener;
        return this;
    }

    public h M(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public h N(String str) {
        w();
        this.j = str;
        return this;
    }

    public void c(Object obj, int i) {
        g.a aVar = (g.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i) || !super.equals(obj)) {
            return false;
        }
        i iVar = (i) obj;
        Objects.requireNonNull(iVar);
        String str = this.j;
        if (str == null ? iVar.j != null : !str.equals(iVar.j)) {
            return false;
        }
        View.OnClickListener onClickListener = this.k;
        if (onClickListener == null ? iVar.k != null : !onClickListener.equals(iVar.k)) {
            return false;
        }
        a<m0.i> aVar = this.i;
        return aVar == null ? iVar.i == null : aVar.equals(iVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        g.a aVar = (g.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.j;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener = this.k;
        int hashCode3 = (hashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        a<m0.i> aVar = this.i;
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
        return R.layout.invite_phone_item;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("InvitePhoneItem_{phoneNumber=");
        P0.append(this.j);
        P0.append(", clickListener=");
        P0.append(this.k);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        g.a aVar = (g.a) obj;
    }
}
