package i0.e.b.g3.o.x0;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.d.a.a.a;
import i0.e.b.g3.o.x0.f;
import java.util.Objects;

/* compiled from: EventClubAction_ */
public class h extends f implements z<f.a>, g {
    public void A(int i, Object obj) {
        f.a aVar = (f.a) obj;
    }

    public void B(Object obj) {
        f.a aVar = (f.a) obj;
    }

    public r E(ViewParent viewParent) {
        return new f.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        f.a aVar = (f.a) rVar;
    }

    public void G(int i, r rVar) {
        f.a aVar = (f.a) rVar;
    }

    public void H(r rVar) {
        f.a aVar = (f.a) rVar;
    }

    public g J(String str) {
        w();
        this.k = str;
        return this;
    }

    public g K(View.OnClickListener onClickListener) {
        w();
        this.l = onClickListener;
        return this;
    }

    public g L(Integer num) {
        w();
        this.i = num;
        return this;
    }

    public g M(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public g N(String str) {
        w();
        this.j = str;
        return this;
    }

    public void c(Object obj, int i) {
        f.a aVar = (f.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h) || !super.equals(obj)) {
            return false;
        }
        h hVar = (h) obj;
        Objects.requireNonNull(hVar);
        Integer num = this.i;
        if (num == null ? hVar.i != null : !num.equals(hVar.i)) {
            return false;
        }
        String str = this.j;
        if (str == null ? hVar.j != null : !str.equals(hVar.j)) {
            return false;
        }
        String str2 = this.k;
        if (str2 == null ? hVar.k != null : !str2.equals(hVar.k)) {
            return false;
        }
        View.OnClickListener onClickListener = this.l;
        return onClickListener == null ? hVar.l == null : onClickListener.equals(hVar.l);
    }

    public void g(w wVar, Object obj, int i) {
        f.a aVar = (f.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        Integer num = this.i;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.j;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.k;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener = this.l;
        if (onClickListener != null) {
            i = onClickListener.hashCode();
        }
        return hashCode4 + i;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.event_club_action;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = a.P0("EventClubAction_{iconRes=");
        P0.append(this.i);
        P0.append(", title=");
        P0.append(this.j);
        P0.append(", body=");
        P0.append(this.k);
        P0.append(", clickListener=");
        P0.append(this.l);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        f.a aVar = (f.a) obj;
    }
}
