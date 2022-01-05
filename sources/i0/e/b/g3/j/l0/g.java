package i0.e.b.g3.j.l0;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.j.l0.e;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: ActivityItemStacked_ */
public class g extends e implements z<e.a>, f {
    public void A(int i, Object obj) {
        super.G(i, (e.a) obj);
    }

    public void B(Object obj) {
        super.H((e.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new e.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        e.a aVar = (e.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (e.a) rVar);
    }

    public void H(r rVar) {
        super.H((e.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (e.a) dVar);
    }

    public void J(d dVar) {
        super.H((e.a) dVar);
    }

    public f L(View.OnClickListener onClickListener) {
        w();
        this.k = onClickListener;
        return this;
    }

    public f M(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public f N(String str) {
        w();
        this.j = str;
        return this;
    }

    public void c(Object obj, int i) {
        e.a aVar = (e.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g) || !super.equals(obj)) {
            return false;
        }
        g gVar = (g) obj;
        Objects.requireNonNull(gVar);
        String str = this.j;
        if (str == null ? gVar.j != null : !str.equals(gVar.j)) {
            return false;
        }
        View.OnClickListener onClickListener = this.k;
        if (onClickListener == null ? gVar.k != null : !onClickListener.equals(gVar.k)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? gVar.i == null : aVar.equals(gVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        e.a aVar = (e.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.j;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
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
        return R.layout.activity_item_stacked;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ActivityItemStacked_{message=");
        P0.append(this.j);
        P0.append(", clickListener=");
        P0.append(this.k);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        e.a aVar = (e.a) obj;
    }
}
