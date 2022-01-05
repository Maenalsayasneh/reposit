package i0.e.b.g3.p.c0.e0;

import android.view.ViewParent;
import com.clubhouse.android.user.model.User;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.b3.b.e.m;
import i0.e.b.g3.p.c0.e0.w0;
import java.util.Objects;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;
import m0.n.a.p;

/* compiled from: UserSuggestion_ */
public class y0 extends w0 implements z<w0.a>, x0 {
    public void A(int i, Object obj) {
        super.G(i, (w0.a) obj);
    }

    public void B(Object obj) {
        super.H((w0.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new w0.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        w0.a aVar = (w0.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (w0.a) rVar);
    }

    public void H(r rVar) {
        super.H((w0.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (w0.a) dVar);
    }

    public void J(d dVar) {
        super.H((w0.a) dVar);
    }

    public x0 M(l lVar) {
        w();
        this.m = lVar;
        return this;
    }

    public x0 N(p pVar) {
        w();
        this.l = pVar;
        return this;
    }

    public x0 O(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public x0 P(a aVar) {
        w();
        this.i = aVar;
        return this;
    }

    public x0 Q(m mVar) {
        w();
        this.j = mVar;
        return this;
    }

    public x0 R(l lVar) {
        w();
        this.k = lVar;
        return this;
    }

    public void c(Object obj, int i) {
        w0.a aVar = (w0.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y0) || !super.equals(obj)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        Objects.requireNonNull(y0Var);
        m mVar = this.j;
        if (mVar == null ? y0Var.j != null : !mVar.equals(y0Var.j)) {
            return false;
        }
        l<? super User, i> lVar = this.k;
        if (lVar == null ? y0Var.k != null : !lVar.equals(y0Var.k)) {
            return false;
        }
        p<? super m, ? super Boolean, i> pVar = this.l;
        if (pVar == null ? y0Var.l != null : !pVar.equals(y0Var.l)) {
            return false;
        }
        l<? super m, i> lVar2 = this.m;
        if (lVar2 == null ? y0Var.m != null : !lVar2.equals(y0Var.m)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? y0Var.i == null : aVar.equals(y0Var.i);
    }

    public void g(w wVar, Object obj, int i) {
        w0.a aVar = (w0.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        m mVar = this.j;
        int hashCode2 = (hashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        l<? super User, i> lVar = this.k;
        int hashCode3 = (hashCode2 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        p<? super m, ? super Boolean, i> pVar = this.l;
        int hashCode4 = (hashCode3 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        l<? super m, i> lVar2 = this.m;
        int hashCode5 = (hashCode4 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        a<i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode5 + i;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.feed_user_suggestion;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("UserSuggestion_{user=");
        P0.append(this.j);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        w0.a aVar = (w0.a) obj;
    }
}
