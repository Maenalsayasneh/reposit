package i0.e.b.g3.p.c0.e0;

import android.view.ViewParent;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.p.c0.e0.r;
import java.util.List;
import java.util.Objects;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: ClubSuggestions_ */
public class s extends r implements z<r.a> {
    public void A(int i, Object obj) {
        super.G(i, (r.a) obj);
    }

    public void B(Object obj) {
        super.H((r.a) obj);
    }

    public i0.b.a.r E(ViewParent viewParent) {
        return new r.a();
    }

    public void F(float f, float f2, int i, int i2, i0.b.a.r rVar) {
        r.a aVar = (r.a) rVar;
    }

    public void G(int i, i0.b.a.r rVar) {
        super.G(i, (r.a) rVar);
    }

    public void H(i0.b.a.r rVar) {
        super.H((r.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (r.a) dVar);
    }

    public void J(d dVar) {
        super.H((r.a) dVar);
    }

    public void c(Object obj, int i) {
        r.a aVar = (r.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s) || !super.equals(obj)) {
            return false;
        }
        s sVar = (s) obj;
        Objects.requireNonNull(sVar);
        String str = this.j;
        if (str == null ? sVar.j != null : !str.equals(sVar.j)) {
            return false;
        }
        List<? extends Club> list = this.k;
        if (list == null ? sVar.k != null : !list.equals(sVar.k)) {
            return false;
        }
        l<? super Club, i> lVar = this.l;
        if (lVar == null ? sVar.l != null : !lVar.equals(sVar.l)) {
            return false;
        }
        l<? super Club, i> lVar2 = this.m;
        if (lVar2 == null ? sVar.m != null : !lVar2.equals(sVar.m)) {
            return false;
        }
        l<? super Club, i> lVar3 = this.n;
        if (lVar3 == null ? sVar.n != null : !lVar3.equals(sVar.n)) {
            return false;
        }
        l<? super Club, i> lVar4 = this.o;
        if (lVar4 == null ? sVar.o != null : !lVar4.equals(sVar.o)) {
            return false;
        }
        l<? super Club, i> lVar5 = this.p;
        if (lVar5 == null ? sVar.p != null : !lVar5.equals(sVar.p)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? sVar.i == null : aVar.equals(sVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        r.a aVar = (r.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.j;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<? extends Club> list = this.k;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        l<? super Club, i> lVar = this.l;
        int hashCode4 = (hashCode3 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        l<? super Club, i> lVar2 = this.m;
        int hashCode5 = (hashCode4 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        l<? super Club, i> lVar3 = this.n;
        int hashCode6 = (hashCode5 + (lVar3 != null ? lVar3.hashCode() : 0)) * 31;
        l<? super Club, i> lVar4 = this.o;
        int hashCode7 = (hashCode6 + (lVar4 != null ? lVar4.hashCode() : 0)) * 31;
        l<? super Club, i> lVar5 = this.p;
        int hashCode8 = (hashCode7 + (lVar5 != null ? lVar5.hashCode() : 0)) * 31;
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
        StringBuilder P0 = i0.d.a.a.a.P0("ClubSuggestions_{title=");
        P0.append(this.j);
        P0.append(", clubs=");
        P0.append(this.k);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        r.a aVar = (r.a) obj;
    }
}
