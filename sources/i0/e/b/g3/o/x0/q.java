package i0.e.b.g3.o.x0;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.app.R;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.o.x0.o;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: EventDescription_ */
public class q extends o implements z<o.a>, p {
    public void A(int i, Object obj) {
        super.G(i, (o.a) obj);
    }

    public void B(Object obj) {
        super.H((o.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new o.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        o.a aVar = (o.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (o.a) rVar);
    }

    public void H(r rVar) {
        super.H((o.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (o.a) dVar);
    }

    public void J(d dVar) {
        super.H((o.a) dVar);
    }

    public p L(boolean z) {
        w();
        this.k = z;
        return this;
    }

    public p M(View.OnClickListener onClickListener) {
        w();
        this.m = onClickListener;
        return this;
    }

    public p N(boolean z) {
        w();
        this.l = z;
        return this;
    }

    public p O(EventInClub eventInClub) {
        w();
        this.j = eventInClub;
        return this;
    }

    public p P(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public void c(Object obj, int i) {
        o.a aVar = (o.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q) || !super.equals(obj)) {
            return false;
        }
        q qVar = (q) obj;
        Objects.requireNonNull(qVar);
        EventInClub eventInClub = this.j;
        if (eventInClub == null ? qVar.j != null : !eventInClub.equals(qVar.j)) {
            return false;
        }
        if (this.k != qVar.k || this.l != qVar.l) {
            return false;
        }
        View.OnClickListener onClickListener = this.m;
        if (onClickListener == null ? qVar.m != null : !onClickListener.equals(qVar.m)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? qVar.i == null : aVar.equals(qVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        o.a aVar = (o.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        EventInClub eventInClub = this.j;
        int hashCode2 = (((((hashCode + (eventInClub != null ? eventInClub.hashCode() : 0)) * 31) + (this.k ? 1 : 0)) * 31) + (this.l ? 1 : 0)) * 31;
        View.OnClickListener onClickListener = this.m;
        int hashCode3 = (hashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        a<i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode3 + i;
    }

    public void i(i0.b.a.o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.event_description;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("EventDescription_{event=");
        P0.append(this.j);
        P0.append(", clearItemSpacing=");
        P0.append(this.k);
        P0.append(", compact=");
        P0.append(this.l);
        P0.append(", clickListener=");
        P0.append(this.m);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        o.a aVar = (o.a) obj;
    }
}
