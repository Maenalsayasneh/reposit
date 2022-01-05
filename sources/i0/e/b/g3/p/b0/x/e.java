package i0.e.b.g3.p.b0.x;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.p.b0.x.c;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: BuddyListSectionHeader_ */
public class e extends c implements z<c.a>, d {
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

    public d L(View.OnClickListener onClickListener) {
        w();
        this.l = onClickListener;
        return this;
    }

    public d M(boolean z) {
        w();
        this.k = z;
        return this;
    }

    public d N(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public d O(String str) {
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
        if (!(obj instanceof e) || !super.equals(obj)) {
            return false;
        }
        e eVar = (e) obj;
        Objects.requireNonNull(eVar);
        String str = this.j;
        if (str == null ? eVar.j != null : !str.equals(eVar.j)) {
            return false;
        }
        if (this.k != eVar.k) {
            return false;
        }
        View.OnClickListener onClickListener = this.l;
        if (onClickListener == null ? eVar.l != null : !onClickListener.equals(eVar.l)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? eVar.i == null : aVar.equals(eVar.i);
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
        View.OnClickListener onClickListener = this.l;
        int hashCode3 = (hashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        a<i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode3 + i;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.buddy_list_section_header;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("BuddyListSectionHeader_{title=");
        P0.append(this.j);
        P0.append(", actionVisible=");
        P0.append(this.k);
        P0.append(", actionClickListener=");
        P0.append(this.l);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        c.a aVar = (c.a) obj;
    }
}
