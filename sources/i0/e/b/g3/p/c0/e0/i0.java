package i0.e.b.g3.p.c0.e0;

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
import i0.e.b.g3.p.c0.e0.g0;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: HallwayEventView_ */
public class i0 extends g0 implements z<g0.a>, h0 {
    public void A(int i, Object obj) {
        super.G(i, (g0.a) obj);
    }

    public void B(Object obj) {
        super.H((g0.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new g0.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        g0.a aVar = (g0.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (g0.a) rVar);
    }

    public void H(r rVar) {
        super.H((g0.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (g0.a) dVar);
    }

    public void J(d dVar) {
        super.H((g0.a) dVar);
    }

    public h0 a(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public h0 b(EventInClub eventInClub) {
        w();
        this.j = eventInClub;
        return this;
    }

    public void c(Object obj, int i) {
        g0.a aVar = (g0.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public h0 d(View.OnClickListener onClickListener) {
        w();
        this.l = onClickListener;
        return this;
    }

    public h0 e(boolean z) {
        w();
        this.k = z;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i0) || !super.equals(obj)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        Objects.requireNonNull(i0Var);
        EventInClub eventInClub = this.j;
        if (eventInClub == null ? i0Var.j != null : !eventInClub.equals(i0Var.j)) {
            return false;
        }
        if (this.k != i0Var.k) {
            return false;
        }
        View.OnClickListener onClickListener = this.l;
        if (onClickListener == null ? i0Var.l != null : !onClickListener.equals(i0Var.l)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? i0Var.i == null : aVar.equals(i0Var.i);
    }

    public void g(w wVar, Object obj, int i) {
        g0.a aVar = (g0.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        EventInClub eventInClub = this.j;
        int hashCode2 = (((hashCode + (eventInClub != null ? eventInClub.hashCode() : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        View.OnClickListener onClickListener = this.l;
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
        return R.layout.hallway_event;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("HallwayEventView_{event=");
        P0.append(this.j);
        P0.append(", featured=");
        P0.append(this.k);
        P0.append(", eventClickListener=");
        P0.append(this.l);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        g0.a aVar = (g0.a) obj;
    }
}
