package i0.e.b.g3.w.j0;

import android.view.ViewParent;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.w.j0.g;
import java.util.Objects;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;
import m0.n.a.p;

/* compiled from: EventInExplore_ */
public class h extends g implements z<g.a> {
    public void A(int i, Object obj) {
        super.G(i, (g.a) obj);
    }

    public void B(Object obj) {
        super.H((g.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new g.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        g.a aVar = (g.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (g.a) rVar);
    }

    public void H(r rVar) {
        super.H((g.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (g.a) dVar);
    }

    public void J(d dVar) {
        super.H((g.a) dVar);
    }

    public void c(Object obj, int i) {
        g.a aVar = (g.a) obj;
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
        EventInClub eventInClub = this.j;
        if (eventInClub == null ? hVar.j != null : !eventInClub.equals(hVar.j)) {
            return false;
        }
        p<? super EventInClub, ? super Boolean, i> pVar = this.k;
        if (pVar == null ? hVar.k != null : !pVar.equals(hVar.k)) {
            return false;
        }
        l<? super EventInClub, i> lVar = this.l;
        if (lVar == null ? hVar.l != null : !lVar.equals(hVar.l)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? hVar.i == null : aVar.equals(hVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        g.a aVar = (g.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        EventInClub eventInClub = this.j;
        int hashCode2 = (((hashCode + (eventInClub != null ? eventInClub.hashCode() : 0)) * 31) + 0) * 31;
        p<? super EventInClub, ? super Boolean, i> pVar = this.k;
        int hashCode3 = (hashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        l<? super EventInClub, i> lVar = this.l;
        int hashCode4 = (hashCode3 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        a<i> aVar = this.i;
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
        return R.layout.explore_event;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("EventInExplore_{event=");
        P0.append(this.j);
        P0.append(", currentUserId=");
        P0.append((Object) null);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        g.a aVar = (g.a) obj;
    }
}
