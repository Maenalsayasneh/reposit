package i0.e.b.g3.o.x0;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.o.x0.c;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: EventAction_ */
public class e extends c implements z<c.a>, d {
    public void A(int i, Object obj) {
        super.G(i, (c.a) obj);
    }

    public void B(Object obj) {
        super.H((c.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new c.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        c.a aVar = (c.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (c.a) rVar);
    }

    public void H(r rVar) {
        super.H((c.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (c.a) dVar);
    }

    public void J(d dVar) {
        super.H((c.a) dVar);
    }

    public d L(View.OnClickListener onClickListener) {
        w();
        this.n = onClickListener;
        return this;
    }

    public d M(boolean z) {
        w();
        this.l = z;
        return this;
    }

    public d N(Integer num) {
        w();
        this.m = num;
        return this;
    }

    public d O(Integer num) {
        w();
        this.k = num;
        return this;
    }

    public d P(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public d Q(String str) {
        w();
        this.j = str;
        return this;
    }

    public void c(Object obj, int i) {
        c.a aVar = (c.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e) || !super.equals(obj)) {
            return false;
        }
        e eVar = (e) obj;
        Objects.requireNonNull(eVar);
        String str = this.j;
        if (str == null ? eVar.j != null : !str.equals(eVar.j)) {
            return false;
        }
        Integer num = this.k;
        if (num == null ? eVar.k != null : !num.equals(eVar.k)) {
            return false;
        }
        if (this.l != eVar.l) {
            return false;
        }
        Integer num2 = this.m;
        if (num2 == null ? eVar.m != null : !num2.equals(eVar.m)) {
            return false;
        }
        View.OnClickListener onClickListener = this.n;
        if (onClickListener == null ? eVar.n != null : !onClickListener.equals(eVar.n)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? eVar.i == null : aVar.equals(eVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        c.a aVar = (c.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.j;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.k;
        int hashCode3 = (((hashCode2 + (num != null ? num.hashCode() : 0)) * 31) + (this.l ? 1 : 0)) * 31;
        Integer num2 = this.m;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener = this.n;
        int hashCode5 = (hashCode4 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
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
        return R.layout.event_action;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("EventAction_{title=");
        P0.append(this.j);
        P0.append(", iconRes=");
        P0.append(this.k);
        P0.append(", disabled=");
        P0.append(this.l);
        P0.append(", hintColor=");
        P0.append(this.m);
        P0.append(", clickListener=");
        P0.append(this.n);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        c.a aVar = (c.a) obj;
    }
}
