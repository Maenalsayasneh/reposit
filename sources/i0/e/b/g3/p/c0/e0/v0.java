package i0.e.b.g3.p.c0.e0;

import android.view.ViewParent;
import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.p.c0.e0.u0;
import java.util.List;
import java.util.Objects;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: TopicSuggestions_ */
public class v0 extends u0 implements z<u0.a> {
    public void A(int i, Object obj) {
        super.G(i, (u0.a) obj);
    }

    public void B(Object obj) {
        super.H((u0.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new u0.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        u0.a aVar = (u0.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (u0.a) rVar);
    }

    public void H(r rVar) {
        super.H((u0.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (u0.a) dVar);
    }

    public void J(d dVar) {
        super.H((u0.a) dVar);
    }

    public void c(Object obj, int i) {
        u0.a aVar = (u0.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v0) || !super.equals(obj)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        Objects.requireNonNull(v0Var);
        String str = this.j;
        if (str == null ? v0Var.j != null : !str.equals(v0Var.j)) {
            return false;
        }
        List<Topic> list = this.k;
        if (list == null ? v0Var.k != null : !list.equals(v0Var.k)) {
            return false;
        }
        l<? super Topic, Boolean> lVar = this.l;
        if (lVar == null ? v0Var.l != null : !lVar.equals(v0Var.l)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? v0Var.i == null : aVar.equals(v0Var.i);
    }

    public void g(w wVar, Object obj, int i) {
        u0.a aVar = (u0.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.j;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<Topic> list = this.k;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        l<? super Topic, Boolean> lVar = this.l;
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
        return R.layout.feed_topic_suggestions;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("TopicSuggestions_{title=");
        P0.append(this.j);
        P0.append(", topics=");
        P0.append(this.k);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        u0.a aVar = (u0.a) obj;
    }
}
