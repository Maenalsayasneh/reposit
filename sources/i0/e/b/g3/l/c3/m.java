package i0.e.b.g3.l.c3;

import android.view.ViewParent;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.l.c3.l;
import java.util.List;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: ClubEvents_ */
public class m extends l implements z<l.a> {
    public void A(int i, Object obj) {
        super.G(i, (l.a) obj);
    }

    public void B(Object obj) {
        super.H((l.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new l.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        l.a aVar = (l.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (l.a) rVar);
    }

    public void H(r rVar) {
        super.H((l.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (l.a) dVar);
    }

    public void J(d dVar) {
        super.H((l.a) dVar);
    }

    public void c(Object obj, int i) {
        l.a aVar = (l.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m) || !super.equals(obj)) {
            return false;
        }
        m mVar = (m) obj;
        Objects.requireNonNull(mVar);
        List<EventInClub> list = this.j;
        if (list == null ? mVar.j != null : !list.equals(mVar.j)) {
            return false;
        }
        if (this.k != mVar.k) {
            return false;
        }
        m0.n.a.l<? super EventInClub, i> lVar = this.l;
        if (lVar == null ? mVar.l != null : !lVar.equals(mVar.l)) {
            return false;
        }
        m0.n.a.l<? super EventInClub, i> lVar2 = this.m;
        if (lVar2 == null ? mVar.m != null : !lVar2.equals(mVar.m)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? mVar.i == null : aVar.equals(mVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        l.a aVar = (l.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        List<EventInClub> list = this.j;
        int hashCode2 = (((hashCode + (list != null ? list.hashCode() : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        m0.n.a.l<? super EventInClub, i> lVar = this.l;
        int hashCode3 = (hashCode2 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        m0.n.a.l<? super EventInClub, i> lVar2 = this.m;
        int hashCode4 = (hashCode3 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
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
        return R.layout.club_events;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ClubEvents_{events=");
        P0.append(this.j);
        P0.append(", allowEmptyState=");
        P0.append(this.k);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        l.a aVar = (l.a) obj;
    }
}
