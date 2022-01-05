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
import i0.e.b.g3.o.x0.l;
import java.util.Objects;

/* compiled from: EventClubHeader_ */
public class n extends l implements z<l.a>, m {
    public void A(int i, Object obj) {
        l.a aVar = (l.a) obj;
    }

    public void B(Object obj) {
        l.a aVar = (l.a) obj;
    }

    public r E(ViewParent viewParent) {
        return new l.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        l.a aVar = (l.a) rVar;
    }

    public void G(int i, r rVar) {
        l.a aVar = (l.a) rVar;
    }

    public void H(r rVar) {
        l.a aVar = (l.a) rVar;
    }

    public m J(View.OnClickListener onClickListener) {
        w();
        this.j = onClickListener;
        return this;
    }

    public m K(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public m L(String str) {
        w();
        this.i = str;
        return this;
    }

    public void c(Object obj, int i) {
        l.a aVar = (l.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n) || !super.equals(obj)) {
            return false;
        }
        n nVar = (n) obj;
        Objects.requireNonNull(nVar);
        String str = this.i;
        if (str == null ? nVar.i != null : !str.equals(nVar.i)) {
            return false;
        }
        View.OnClickListener onClickListener = this.j;
        return onClickListener == null ? nVar.j == null : onClickListener.equals(nVar.j);
    }

    public void g(w wVar, Object obj, int i) {
        l.a aVar = (l.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.i;
        int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + 0) * 31;
        View.OnClickListener onClickListener = this.j;
        if (onClickListener != null) {
            i = onClickListener.hashCode();
        }
        return hashCode2 + i;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.event_club_header;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = a.P0("EventClubHeader_{url=");
        P0.append(this.i);
        P0.append(", numInvites=");
        P0.append(0);
        P0.append(", clickListener=");
        P0.append(this.j);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        l.a aVar = (l.a) obj;
    }
}
