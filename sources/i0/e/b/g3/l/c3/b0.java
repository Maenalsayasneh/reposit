package i0.e.b.g3.l.c3;

import android.view.ViewParent;
import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.l.c3.z;
import java.util.List;
import java.util.Objects;
import m0.n.a.a;
import m0.n.b.i;

/* compiled from: ClubTopics_ */
public class b0 extends z implements z<z.a>, a0 {
    public void A(int i, Object obj) {
        super.G(i, (z.a) obj);
    }

    public void B(Object obj) {
        super.H((z.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new z.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        z.a aVar = (z.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (z.a) rVar);
    }

    public void H(r rVar) {
        super.H((z.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (z.a) dVar);
    }

    public void J(d dVar) {
        super.H((z.a) dVar);
    }

    public a0 L(List list) {
        w();
        i.e(list, "<set-?>");
        this.j = list;
        return this;
    }

    public void c(Object obj, int i) {
        z.a aVar = (z.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0) || !super.equals(obj)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        Objects.requireNonNull(b0Var);
        List<Topic> list = this.j;
        if (list == null ? b0Var.j != null : !list.equals(b0Var.j)) {
            return false;
        }
        a<m0.i> aVar = this.i;
        return aVar == null ? b0Var.i == null : aVar.equals(b0Var.i);
    }

    public void g(w wVar, Object obj, int i) {
        z.a aVar = (z.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        List<Topic> list = this.j;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        a<m0.i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode2 + i;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.club_topics;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ClubTopics_{topics=");
        P0.append(this.j);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        z.a aVar = (z.a) obj;
    }
}
