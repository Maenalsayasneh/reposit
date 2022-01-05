package i0.e.b.g3.n.x;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.n.x.a;
import java.util.Objects;
import m0.i;

/* compiled from: ChannelAudience_ */
public class c extends a implements z<a.C0204a>, b {
    public void A(int i, Object obj) {
        super.G(i, (a.C0204a) obj);
    }

    public void B(Object obj) {
        super.H((a.C0204a) obj);
    }

    public r E(ViewParent viewParent) {
        return new a.C0204a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        a.C0204a aVar = (a.C0204a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (a.C0204a) rVar);
    }

    public void H(r rVar) {
        super.H((a.C0204a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (a.C0204a) dVar);
    }

    public void J(d dVar) {
        super.H((a.C0204a) dVar);
    }

    public b L(View.OnClickListener onClickListener) {
        w();
        this.o = onClickListener;
        return this;
    }

    public b M(String str) {
        w();
        this.l = str;
        return this;
    }

    public b N(int i) {
        w();
        this.m = i;
        return this;
    }

    public b O(String str) {
        w();
        this.n = str;
        return this;
    }

    public b P(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public b Q(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public b R(boolean z) {
        w();
        this.j = z;
        return this;
    }

    public b S(String str) {
        w();
        this.k = str;
        return this;
    }

    public void c(Object obj, int i) {
        a.C0204a aVar = (a.C0204a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c) || !super.equals(obj)) {
            return false;
        }
        c cVar = (c) obj;
        Objects.requireNonNull(cVar);
        if (this.j != cVar.j) {
            return false;
        }
        String str = this.k;
        if (str == null ? cVar.k != null : !str.equals(cVar.k)) {
            return false;
        }
        String str2 = this.l;
        if (str2 == null ? cVar.l != null : !str2.equals(cVar.l)) {
            return false;
        }
        if (this.m != cVar.m) {
            return false;
        }
        String str3 = this.n;
        if (str3 == null ? cVar.n != null : !str3.equals(cVar.n)) {
            return false;
        }
        View.OnClickListener onClickListener = this.o;
        if (onClickListener == null ? cVar.o != null : !onClickListener.equals(cVar.o)) {
            return false;
        }
        m0.n.a.a<i> aVar = this.i;
        return aVar == null ? cVar.i == null : aVar.equals(cVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        a.C0204a aVar = (a.C0204a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + (this.j ? 1 : 0)) * 31;
        String str = this.k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.l;
        int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.m) * 31;
        String str3 = this.n;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener = this.o;
        int hashCode5 = (hashCode4 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        m0.n.a.a<i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode5 + i;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.channel_creation_audience;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ChannelAudience_{selected=");
        P0.append(this.j);
        P0.append(", title=");
        P0.append(this.k);
        P0.append(", contentDescription=");
        P0.append(this.l);
        P0.append(", iconRes=");
        P0.append(this.m);
        P0.append(", iconUrl=");
        P0.append(this.n);
        P0.append(", clickListener=");
        P0.append(this.o);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        a.C0204a aVar = (a.C0204a) obj;
    }
}
