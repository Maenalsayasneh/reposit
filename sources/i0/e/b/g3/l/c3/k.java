package i0.e.b.g3.l.c3;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.l.c3.i;
import java.util.Objects;
import m0.n.a.a;

/* compiled from: ClubEvent_ */
public class k extends i implements z<i.a>, j {
    public void A(int i, Object obj) {
        super.G(i, (i.a) obj);
    }

    public void B(Object obj) {
        super.H((i.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new i.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        i.a aVar = (i.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (i.a) rVar);
    }

    public void H(r rVar) {
        super.H((i.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (i.a) dVar);
    }

    public void J(d dVar) {
        super.H((i.a) dVar);
    }

    public j a(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public j b(EventInClub eventInClub) {
        w();
        this.j = eventInClub;
        return this;
    }

    public void c(Object obj, int i) {
        i.a aVar = (i.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k) || !super.equals(obj)) {
            return false;
        }
        k kVar = (k) obj;
        Objects.requireNonNull(kVar);
        EventInClub eventInClub = this.j;
        if (eventInClub == null ? kVar.j != null : !eventInClub.equals(kVar.j)) {
            return false;
        }
        View.OnClickListener onClickListener = this.k;
        if (onClickListener == null ? kVar.k != null : !onClickListener.equals(kVar.k)) {
            return false;
        }
        View.OnClickListener onClickListener2 = this.l;
        if (onClickListener2 == null ? kVar.l != null : !onClickListener2.equals(kVar.l)) {
            return false;
        }
        a<m0.i> aVar = this.i;
        return aVar == null ? kVar.i == null : aVar.equals(kVar.i);
    }

    public j f(View.OnClickListener onClickListener) {
        w();
        this.k = onClickListener;
        return this;
    }

    public void g(w wVar, Object obj, int i) {
        i.a aVar = (i.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public j h(View.OnClickListener onClickListener) {
        w();
        this.l = onClickListener;
        return this;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        EventInClub eventInClub = this.j;
        int hashCode2 = (hashCode + (eventInClub != null ? eventInClub.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener = this.k;
        int hashCode3 = (hashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener2 = this.l;
        int hashCode4 = (hashCode3 + (onClickListener2 != null ? onClickListener2.hashCode() : 0)) * 31;
        a<m0.i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode4 + i;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.club_event;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ClubEvent_{event=");
        P0.append(this.j);
        P0.append(", menuClickListener=");
        P0.append(this.k);
        P0.append(", clickListener=");
        P0.append(this.l);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        i.a aVar = (i.a) obj;
    }
}
