package i0.e.b.g3.o.w0.p0;

import android.view.ViewParent;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.d.a.a.a;
import i0.e.b.g3.o.w0.p0.i;
import java.util.Objects;

/* compiled from: EventHostClubDivider_ */
public class k extends i implements z<i.a>, j {
    public void A(int i, Object obj) {
        i.a aVar = (i.a) obj;
    }

    public void B(Object obj) {
        i.a aVar = (i.a) obj;
    }

    public r E(ViewParent viewParent) {
        return new i.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        i.a aVar = (i.a) rVar;
    }

    public void G(int i, r rVar) {
        i.a aVar = (i.a) rVar;
    }

    public void H(r rVar) {
        i.a aVar = (i.a) rVar;
    }

    public j I(CharSequence charSequence) {
        s(charSequence);
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
        Objects.requireNonNull((k) obj);
        return true;
    }

    public void g(w wVar, Object obj, int i) {
        i.a aVar = (i.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        return (((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.event_host_club_divider;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = a.P0("EventHostClubDivider_{}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        i.a aVar = (i.a) obj;
    }
}
