package i0.e.b.g3.p.c0.e0;

import android.view.ViewParent;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.p.c0.e0.w;
import java.util.List;
import java.util.Objects;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: EventSuggestions_ */
public class x extends w implements z<w.a> {
    public void A(int i, Object obj) {
        super.G(i, (w.a) obj);
    }

    public void B(Object obj) {
        super.H((w.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new w.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        w.a aVar = (w.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (w.a) rVar);
    }

    public void H(r rVar) {
        super.H((w.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (w.a) dVar);
    }

    public void J(d dVar) {
        super.H((w.a) dVar);
    }

    public void c(Object obj, int i) {
        w.a aVar = (w.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x) || !super.equals(obj)) {
            return false;
        }
        x xVar = (x) obj;
        Objects.requireNonNull(xVar);
        String str = this.j;
        if (str == null ? xVar.j != null : !str.equals(xVar.j)) {
            return false;
        }
        List<EventInClub> list = this.k;
        if (list == null ? xVar.k != null : !list.equals(xVar.k)) {
            return false;
        }
        Integer num = this.l;
        if (num == null ? xVar.l != null : !num.equals(xVar.l)) {
            return false;
        }
        l<? super EventInClub, i> lVar = this.m;
        if (lVar == null ? xVar.m != null : !lVar.equals(xVar.m)) {
            return false;
        }
        l<? super EventInClub, i> lVar2 = this.n;
        if (lVar2 == null ? xVar.n != null : !lVar2.equals(xVar.n)) {
            return false;
        }
        l<? super EventInClub, i> lVar3 = this.o;
        if (lVar3 == null ? xVar.o != null : !lVar3.equals(xVar.o)) {
            return false;
        }
        l<? super EventInClub, i> lVar4 = this.p;
        if (lVar4 == null ? xVar.p != null : !lVar4.equals(xVar.p)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? xVar.i == null : aVar.equals(xVar.i);
    }

    public void g(i0.b.a.w wVar, Object obj, int i) {
        w.a aVar = (w.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.j;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<EventInClub> list = this.k;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Integer num = this.l;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        l<? super EventInClub, i> lVar = this.m;
        int hashCode5 = (hashCode4 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        l<? super EventInClub, i> lVar2 = this.n;
        int hashCode6 = (hashCode5 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        l<? super EventInClub, i> lVar3 = this.o;
        int hashCode7 = (hashCode6 + (lVar3 != null ? lVar3.hashCode() : 0)) * 31;
        l<? super EventInClub, i> lVar4 = this.p;
        int hashCode8 = (hashCode7 + (lVar4 != null ? lVar4.hashCode() : 0)) * 31;
        a<i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode8 + i;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.feed_suggestions;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("EventSuggestions_{title=");
        P0.append(this.j);
        P0.append(", events=");
        P0.append(this.k);
        P0.append(", currentUserId=");
        P0.append(this.l);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        w.a aVar = (w.a) obj;
    }
}
