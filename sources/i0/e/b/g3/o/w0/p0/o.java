package i0.e.b.g3.o.w0.p0;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.app.R;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.d.a.a.a;
import i0.e.b.g3.o.w0.p0.m;
import java.util.Objects;

/* compiled from: EventNoHostClub_ */
public class o extends m implements z<m.a>, n {
    public void A(int i, Object obj) {
        m.a aVar = (m.a) obj;
    }

    public void B(Object obj) {
        m.a aVar = (m.a) obj;
    }

    public r E(ViewParent viewParent) {
        return new m.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        m.a aVar = (m.a) rVar;
    }

    public void G(int i, r rVar) {
        m.a aVar = (m.a) rVar;
    }

    public void H(r rVar) {
        m.a aVar = (m.a) rVar;
    }

    public n J(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public n K(View.OnClickListener onClickListener) {
        w();
        this.j = onClickListener;
        return this;
    }

    public n L(boolean z) {
        w();
        this.i = z;
        return this;
    }

    public void c(Object obj, int i) {
        m.a aVar = (m.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o) || !super.equals(obj)) {
            return false;
        }
        o oVar = (o) obj;
        Objects.requireNonNull(oVar);
        if (this.i != oVar.i) {
            return false;
        }
        View.OnClickListener onClickListener = this.j;
        return onClickListener == null ? oVar.j == null : onClickListener.equals(oVar.j);
    }

    public void g(w wVar, Object obj, int i) {
        m.a aVar = (m.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + (this.i ? 1 : 0)) * 31;
        View.OnClickListener onClickListener = this.j;
        if (onClickListener != null) {
            i = onClickListener.hashCode();
        }
        return hashCode + i;
    }

    public void i(i0.b.a.o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.event_no_host_club;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = a.P0("EventNoHostClub_{selected=");
        P0.append(this.i);
        P0.append(", onClickListener=");
        P0.append(this.j);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        m.a aVar = (m.a) obj;
    }
}
