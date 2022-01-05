package i0.e.b.g3.p.c0.e0;

import android.view.ViewParent;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.p.c0.e0.p;
import java.util.Objects;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: ClubSuggestion_ */
public class q extends p implements z<p.a> {
    public void A(int i, Object obj) {
        super.G(i, (p.a) obj);
    }

    public void B(Object obj) {
        super.H((p.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new p.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        p.a aVar = (p.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (p.a) rVar);
    }

    public void H(r rVar) {
        super.H((p.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (p.a) dVar);
    }

    public void J(d dVar) {
        super.H((p.a) dVar);
    }

    public void c(Object obj, int i) {
        p.a aVar = (p.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q) || !super.equals(obj)) {
            return false;
        }
        q qVar = (q) obj;
        Objects.requireNonNull(qVar);
        Club club = this.j;
        if (club == null ? qVar.j != null : !club.equals(qVar.j)) {
            return false;
        }
        l<? super Club, i> lVar = this.k;
        if (lVar == null ? qVar.k != null : !lVar.equals(qVar.k)) {
            return false;
        }
        l<? super Club, i> lVar2 = this.l;
        if (lVar2 == null ? qVar.l != null : !lVar2.equals(qVar.l)) {
            return false;
        }
        l<? super Club, i> lVar3 = this.m;
        if (lVar3 == null ? qVar.m != null : !lVar3.equals(qVar.m)) {
            return false;
        }
        l<? super Club, i> lVar4 = this.n;
        if (lVar4 == null ? qVar.n != null : !lVar4.equals(qVar.n)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? qVar.i == null : aVar.equals(qVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        p.a aVar = (p.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        Club club = this.j;
        int hashCode2 = (hashCode + (club != null ? club.hashCode() : 0)) * 31;
        l<? super Club, i> lVar = this.k;
        int hashCode3 = (hashCode2 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        l<? super Club, i> lVar2 = this.l;
        int hashCode4 = (hashCode3 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        l<? super Club, i> lVar3 = this.m;
        int hashCode5 = (hashCode4 + (lVar3 != null ? lVar3.hashCode() : 0)) * 31;
        l<? super Club, i> lVar4 = this.n;
        int hashCode6 = (hashCode5 + (lVar4 != null ? lVar4.hashCode() : 0)) * 31;
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
        return R.layout.feed_club_suggestion;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ClubSuggestion_{club=");
        P0.append(this.j);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        p.a aVar = (p.a) obj;
    }
}
