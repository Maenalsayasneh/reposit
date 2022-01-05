package i0.e.b.g3.r.b3;

import android.view.ViewParent;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.r.b3.c;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: TopicItem_ */
public class h extends c implements z<c.a>, d {
    public void A(int i, Object obj) {
        super.G(i, (c.a) obj);
    }

    public void B(Object obj) {
        super.H((c.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new c.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        c.a aVar = (c.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (c.a) rVar);
    }

    public void H(r rVar) {
        super.H((c.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (c.a) dVar);
    }

    public void J(d dVar) {
        super.H((c.a) dVar);
    }

    public d L(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public d M(a aVar) {
        w();
        this.l = aVar;
        return this;
    }

    public d N(a aVar) {
        w();
        this.m = aVar;
        return this;
    }

    public d O(boolean z) {
        w();
        this.k = z;
        return this;
    }

    public d P(String str) {
        w();
        this.j = str;
        return this;
    }

    public void c(Object obj, int i) {
        c.a aVar = (c.a) obj;
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
        String str = this.j;
        if (str == null ? hVar.j != null : !str.equals(hVar.j)) {
            return false;
        }
        if (this.k != hVar.k) {
            return false;
        }
        a<Boolean> aVar = this.l;
        if (aVar == null ? hVar.l != null : !aVar.equals(hVar.l)) {
            return false;
        }
        a<i> aVar2 = this.m;
        if (aVar2 == null ? hVar.m != null : !aVar2.equals(hVar.m)) {
            return false;
        }
        a<i> aVar3 = this.i;
        return aVar3 == null ? hVar.i == null : aVar3.equals(hVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        c.a aVar = (c.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.j;
        int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        a<Boolean> aVar = this.l;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        a<i> aVar2 = this.m;
        int hashCode4 = (hashCode3 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        a<i> aVar3 = this.i;
        if (aVar3 != null) {
            i = aVar3.hashCode();
        }
        return hashCode4 + i;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.topic_item;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("TopicItem_{title=");
        P0.append(this.j);
        P0.append(", selected=");
        P0.append(this.k);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        c.a aVar = (c.a) obj;
    }
}
