package i0.e.b.g3.p.c0.e0;

import android.view.ViewParent;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.ui.hallway.feed.viewholder.HallwayEventsView;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import java.util.List;
import java.util.Objects;
import m0.n.a.a;
import m0.n.b.i;

/* compiled from: HallwayEventsView_ */
public class k0 extends HallwayEventsView implements z<HallwayEventsView.a>, j0 {
    public void A(int i, Object obj) {
        super.G(i, (HallwayEventsView.a) obj);
    }

    public void B(Object obj) {
        super.H((HallwayEventsView.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new HallwayEventsView.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        HallwayEventsView.a aVar = (HallwayEventsView.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (HallwayEventsView.a) rVar);
    }

    public void H(r rVar) {
        super.H((HallwayEventsView.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (HallwayEventsView.a) dVar);
    }

    public void J(d dVar) {
        super.H((HallwayEventsView.a) dVar);
    }

    public j0 M(List list) {
        w();
        i.e(list, "<set-?>");
        this.j = list;
        return this;
    }

    public j0 N(List list) {
        w();
        i.e(list, "<set-?>");
        this.k = list;
        return this;
    }

    public void c(Object obj, int i) {
        HallwayEventsView.a aVar = (HallwayEventsView.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k0) || !super.equals(obj)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        Objects.requireNonNull(k0Var);
        List<EventInClub> list = this.j;
        if (list == null ? k0Var.j != null : !list.equals(k0Var.j)) {
            return false;
        }
        List<EventInClub> list2 = this.k;
        if (list2 == null ? k0Var.k != null : !list2.equals(k0Var.k)) {
            return false;
        }
        HallwayEventsView.b bVar = this.l;
        if (bVar == null ? k0Var.l != null : !bVar.equals(k0Var.l)) {
            return false;
        }
        a<m0.i> aVar = this.i;
        return aVar == null ? k0Var.i == null : aVar.equals(k0Var.i);
    }

    public void g(w wVar, Object obj, int i) {
        HallwayEventsView.a aVar = (HallwayEventsView.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        List<EventInClub> list = this.j;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<EventInClub> list2 = this.k;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        HallwayEventsView.b bVar = this.l;
        int hashCode4 = (hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31;
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
        return R.layout.hallway_events;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("HallwayEventsView_{events=");
        P0.append(this.j);
        P0.append(", featuredEvents=");
        P0.append(this.k);
        P0.append(", onItemClickListener=");
        P0.append(this.l);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        HallwayEventsView.a aVar = (HallwayEventsView.a) obj;
    }
}
