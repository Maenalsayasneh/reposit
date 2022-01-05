package i0.e.b.g3.o.w0.p0;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.d.a.a.a;
import i0.e.b.g3.o.w0.p0.g;
import java.util.Objects;

/* compiled from: EventHostClub_ */
public class l extends g implements z<g.a>, h {
    public void A(int i, Object obj) {
        g.a aVar = (g.a) obj;
    }

    public void B(Object obj) {
        g.a aVar = (g.a) obj;
    }

    public r E(ViewParent viewParent) {
        return new g.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        g.a aVar = (g.a) rVar;
    }

    public void G(int i, r rVar) {
        g.a aVar = (g.a) rVar;
    }

    public void H(r rVar) {
        g.a aVar = (g.a) rVar;
    }

    public h J(Club club) {
        w();
        this.i = club;
        return this;
    }

    public h K(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public h L(View.OnClickListener onClickListener) {
        w();
        this.k = onClickListener;
        return this;
    }

    public h M(boolean z) {
        w();
        this.j = z;
        return this;
    }

    public void c(Object obj, int i) {
        g.a aVar = (g.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l) || !super.equals(obj)) {
            return false;
        }
        l lVar = (l) obj;
        Objects.requireNonNull(lVar);
        Club club = this.i;
        if (club == null ? lVar.i != null : !club.equals(lVar.i)) {
            return false;
        }
        if (this.j != lVar.j) {
            return false;
        }
        View.OnClickListener onClickListener = this.k;
        return onClickListener == null ? lVar.k == null : onClickListener.equals(lVar.k);
    }

    public void g(w wVar, Object obj, int i) {
        g.a aVar = (g.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        Club club = this.i;
        int hashCode2 = (((hashCode + (club != null ? club.hashCode() : 0)) * 31) + (this.j ? 1 : 0)) * 31;
        View.OnClickListener onClickListener = this.k;
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
        return R.layout.event_host_club;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = a.P0("EventHostClub_{club=");
        P0.append(this.i);
        P0.append(", selected=");
        P0.append(this.j);
        P0.append(", onClickListener=");
        P0.append(this.k);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        g.a aVar = (g.a) obj;
    }
}
