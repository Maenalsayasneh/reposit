package i0.e.b.g3.r.b3;

import android.view.ViewParent;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.r.b3.e;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: TopicItemInGrid_ */
public class g extends e implements z<e.a>, f {
    public void A(int i, Object obj) {
        super.G(i, (e.a) obj);
    }

    public void B(Object obj) {
        super.H((e.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new e.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        e.a aVar = (e.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (e.a) rVar);
    }

    public void H(r rVar) {
        super.H((e.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (e.a) dVar);
    }

    public void J(d dVar) {
        super.H((e.a) dVar);
    }

    public f L(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public f M(a aVar) {
        w();
        this.l = aVar;
        return this;
    }

    public f N(a aVar) {
        w();
        this.m = aVar;
        return this;
    }

    public f O(boolean z) {
        w();
        this.k = z;
        return this;
    }

    public f P(String str) {
        w();
        this.j = str;
        return this;
    }

    public void c(Object obj, int i) {
        e.a aVar = (e.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g) || !super.equals(obj)) {
            return false;
        }
        g gVar = (g) obj;
        Objects.requireNonNull(gVar);
        String str = this.j;
        if (str == null ? gVar.j != null : !str.equals(gVar.j)) {
            return false;
        }
        if (this.k != gVar.k) {
            return false;
        }
        a<Boolean> aVar = this.l;
        if (aVar == null ? gVar.l != null : !aVar.equals(gVar.l)) {
            return false;
        }
        a<i> aVar2 = this.m;
        if (aVar2 == null ? gVar.m != null : !aVar2.equals(gVar.m)) {
            return false;
        }
        a<i> aVar3 = this.i;
        return aVar3 == null ? gVar.i == null : aVar3.equals(gVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        e.a aVar = (e.a) obj;
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
        return R.layout.topic_in_grid;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("TopicItemInGrid_{title=");
        P0.append(this.j);
        P0.append(", selected=");
        P0.append(this.k);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        e.a aVar = (e.a) obj;
    }
}
