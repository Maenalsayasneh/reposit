package i0.e.b.g3.q.r;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.g3.q.r.d;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: InvitePending_ */
public class f extends d implements z<d.a>, e {
    public void A(int i, Object obj) {
        super.G(i, (d.a) obj);
    }

    public void B(Object obj) {
        super.H((d.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new d.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        d.a aVar = (d.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (d.a) rVar);
    }

    public void H(r rVar) {
        super.H((d.a) rVar);
    }

    public void I(int i, i0.e.b.a3.f.d dVar) {
        super.G(i, (d.a) dVar);
    }

    public void J(i0.e.b.a3.f.d dVar) {
        super.H((d.a) dVar);
    }

    public e L(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public e M(Integer num) {
        w();
        this.j = num;
        return this;
    }

    public e N(View.OnClickListener onClickListener) {
        w();
        this.k = onClickListener;
        return this;
    }

    public void c(Object obj, int i) {
        d.a aVar = (d.a) obj;
        C("The model was changed during the bind call.", i);
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
        Integer num = this.j;
        if (num == null ? fVar.j != null : !num.equals(fVar.j)) {
            return false;
        }
        View.OnClickListener onClickListener = this.k;
        if (onClickListener == null ? fVar.k != null : !onClickListener.equals(fVar.k)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? fVar.i == null : aVar.equals(fVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        d.a aVar = (d.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        Integer num = this.j;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener = this.k;
        int hashCode3 = (hashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        a<i> aVar = this.i;
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
        return R.layout.invite_pending;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("InvitePending_{pendingCount=");
        P0.append(this.j);
        P0.append(", pendingInviteClickListener=");
        P0.append(this.k);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        d.a aVar = (d.a) obj;
    }
}
