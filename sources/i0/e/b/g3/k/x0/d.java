package i0.e.b.g3.k.x0;

import android.view.ViewParent;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.g3.k.x0.b;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: ChannelDivider_ */
public class d extends b implements z<b.a>, c {
    public void A(int i, Object obj) {
        super.G(i, (b.a) obj);
    }

    public void B(Object obj) {
        super.H((b.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new b.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        b.a aVar = (b.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (b.a) rVar);
    }

    public void H(r rVar) {
        super.H((b.a) rVar);
    }

    public void I(int i, i0.e.b.a3.f.d dVar) {
        super.G(i, (b.a) dVar);
    }

    public void J(i0.e.b.a3.f.d dVar) {
        super.H((b.a) dVar);
    }

    public c L(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public c M(String str) {
        w();
        this.j = str;
        return this;
    }

    public void c(Object obj, int i) {
        b.a aVar = (b.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d) || !super.equals(obj)) {
            return false;
        }
        d dVar = (d) obj;
        Objects.requireNonNull(dVar);
        String str = this.j;
        if (str == null ? dVar.j != null : !str.equals(dVar.j)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? dVar.i == null : aVar.equals(dVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        b.a aVar = (b.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.j;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        a<i> aVar = this.i;
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
        return R.layout.channel_user_list_divider;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ChannelDivider_{title=");
        P0.append(this.j);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        b.a aVar = (b.a) obj;
    }
}
