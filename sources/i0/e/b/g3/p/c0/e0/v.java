package i0.e.b.g3.p.c0.e0;

import android.view.ViewParent;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.p.c0.e0.t;
import java.util.Objects;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;
import m0.n.a.p;

/* compiled from: EventSuggestion_ */
public class v extends t implements z<t.a>, u {
    public void A(int i, Object obj) {
        super.G(i, (t.a) obj);
    }

    public void B(Object obj) {
        super.H((t.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new t.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        t.a aVar = (t.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (t.a) rVar);
    }

    public void H(r rVar) {
        super.H((t.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (t.a) dVar);
    }

    public void J(d dVar) {
        super.H((t.a) dVar);
    }

    public u L(p pVar) {
        w();
        this.l = pVar;
        return this;
    }

    public u M(Integer num) {
        w();
        this.k = num;
        return this;
    }

    public u N(l lVar) {
        w();
        this.m = lVar;
        return this;
    }

    public u O(EventInClub eventInClub) {
        w();
        this.j = eventInClub;
        return this;
    }

    public u P(l lVar) {
        w();
        this.n = lVar;
        return this;
    }

    public u Q(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public u R(a aVar) {
        w();
        this.i = aVar;
        return this;
    }

    public void c(Object obj, int i) {
        t.a aVar = (t.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v) || !super.equals(obj)) {
            return false;
        }
        v vVar = (v) obj;
        Objects.requireNonNull(vVar);
        EventInClub eventInClub = this.j;
        if (eventInClub == null ? vVar.j != null : !eventInClub.equals(vVar.j)) {
            return false;
        }
        Integer num = this.k;
        if (num == null ? vVar.k != null : !num.equals(vVar.k)) {
            return false;
        }
        p<? super EventInClub, ? super Boolean, i> pVar = this.l;
        if (pVar == null ? vVar.l != null : !pVar.equals(vVar.l)) {
            return false;
        }
        l<? super EventInClub, i> lVar = this.m;
        if (lVar == null ? vVar.m != null : !lVar.equals(vVar.m)) {
            return false;
        }
        l<? super EventInClub, i> lVar2 = this.n;
        if (lVar2 == null ? vVar.n != null : !lVar2.equals(vVar.n)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? vVar.i == null : aVar.equals(vVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        t.a aVar = (t.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        EventInClub eventInClub = this.j;
        int hashCode2 = (hashCode + (eventInClub != null ? eventInClub.hashCode() : 0)) * 31;
        Integer num = this.k;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        p<? super EventInClub, ? super Boolean, i> pVar = this.l;
        int hashCode4 = (hashCode3 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        l<? super EventInClub, i> lVar = this.m;
        int hashCode5 = (hashCode4 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        l<? super EventInClub, i> lVar2 = this.n;
        int hashCode6 = (hashCode5 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        a<i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode6 + i;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.feed_event_suggestion;
    }

    public i0.b.a.t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("EventSuggestion_{event=");
        P0.append(this.j);
        P0.append(", currentUserId=");
        P0.append(this.k);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        t.a aVar = (t.a) obj;
    }
}
