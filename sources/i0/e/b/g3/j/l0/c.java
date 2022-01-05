package i0.e.b.g3.j.l0;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.j.l0.a;
import j$.time.OffsetDateTime;
import java.util.Objects;
import m0.i;

/* compiled from: ActionableActivityItem_ */
public class c extends a implements z<a.C0199a>, b {
    public void A(int i, Object obj) {
        super.G(i, (a.C0199a) obj);
    }

    public void B(Object obj) {
        super.H((a.C0199a) obj);
    }

    public r E(ViewParent viewParent) {
        return new a.C0199a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        a.C0199a aVar = (a.C0199a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (a.C0199a) rVar);
    }

    public void H(r rVar) {
        super.H((a.C0199a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (a.C0199a) dVar);
    }

    public void J(d dVar) {
        super.H((a.C0199a) dVar);
    }

    public b L(View.OnClickListener onClickListener) {
        w();
        this.s = onClickListener;
        return this;
    }

    public b M(View.OnClickListener onClickListener) {
        w();
        this.t = onClickListener;
        return this;
    }

    public b N(String str) {
        w();
        this.l = str;
        return this;
    }

    public b O(long j) {
        super.r(j);
        return this;
    }

    public b P(CharSequence charSequence) {
        w();
        this.m = charSequence;
        return this;
    }

    public b Q(String str) {
        w();
        this.k = str;
        return this;
    }

    public b R(String str) {
        w();
        this.j = str;
        return this;
    }

    public b S(View.OnClickListener onClickListener) {
        w();
        this.q = onClickListener;
        return this;
    }

    public b T(String str) {
        w();
        this.o = str;
        return this;
    }

    public b U(View.OnClickListener onClickListener) {
        w();
        this.r = onClickListener;
        return this;
    }

    public b V(String str) {
        w();
        this.p = str;
        return this;
    }

    public b W(OffsetDateTime offsetDateTime) {
        w();
        this.n = offsetDateTime;
        return this;
    }

    public void c(Object obj, int i) {
        a.C0199a aVar = (a.C0199a) obj;
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
        String str = this.j;
        if (str == null ? cVar.j != null : !str.equals(cVar.j)) {
            return false;
        }
        String str2 = this.k;
        if (str2 == null ? cVar.k != null : !str2.equals(cVar.k)) {
            return false;
        }
        String str3 = this.l;
        if (str3 == null ? cVar.l != null : !str3.equals(cVar.l)) {
            return false;
        }
        CharSequence charSequence = this.m;
        if (charSequence == null ? cVar.m != null : !charSequence.equals(cVar.m)) {
            return false;
        }
        OffsetDateTime offsetDateTime = this.n;
        if (offsetDateTime == null ? cVar.n != null : !offsetDateTime.equals(cVar.n)) {
            return false;
        }
        String str4 = this.o;
        if (str4 == null ? cVar.o != null : !str4.equals(cVar.o)) {
            return false;
        }
        String str5 = this.p;
        if (str5 == null ? cVar.p != null : !str5.equals(cVar.p)) {
            return false;
        }
        View.OnClickListener onClickListener = this.q;
        if (onClickListener == null ? cVar.q != null : !onClickListener.equals(cVar.q)) {
            return false;
        }
        View.OnClickListener onClickListener2 = this.r;
        if (onClickListener2 == null ? cVar.r != null : !onClickListener2.equals(cVar.r)) {
            return false;
        }
        View.OnClickListener onClickListener3 = this.s;
        if (onClickListener3 == null ? cVar.s != null : !onClickListener3.equals(cVar.s)) {
            return false;
        }
        View.OnClickListener onClickListener4 = this.t;
        if (onClickListener4 == null ? cVar.t != null : !onClickListener4.equals(cVar.t)) {
            return false;
        }
        m0.n.a.a<i> aVar = this.i;
        return aVar == null ? cVar.i == null : aVar.equals(cVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        a.C0199a aVar = (a.C0199a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.j;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.k;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.l;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        CharSequence charSequence = this.m;
        int hashCode5 = (hashCode4 + (charSequence != null ? charSequence.hashCode() : 0)) * 31;
        OffsetDateTime offsetDateTime = this.n;
        int hashCode6 = (hashCode5 + (offsetDateTime != null ? offsetDateTime.hashCode() : 0)) * 31;
        String str4 = this.o;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.p;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener = this.q;
        int hashCode9 = (hashCode8 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener2 = this.r;
        int hashCode10 = (hashCode9 + (onClickListener2 != null ? onClickListener2.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener3 = this.s;
        int hashCode11 = (hashCode10 + (onClickListener3 != null ? onClickListener3.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener4 = this.t;
        int hashCode12 = (hashCode11 + (onClickListener4 != null ? onClickListener4.hashCode() : 0)) * 31;
        m0.n.a.a<i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode12 + i;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.actionable_activity_item;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ActionableActivityItem_{photoUrl=");
        P0.append(this.j);
        P0.append(", name=");
        P0.append(this.k);
        P0.append(", clubName=");
        P0.append(this.l);
        P0.append(", message=");
        P0.append(this.m);
        P0.append(", timeCreated=");
        P0.append(this.n);
        P0.append(", primaryActionTitle=");
        P0.append(this.o);
        P0.append(", secondaryActionTitle=");
        P0.append(this.p);
        P0.append(", primaryAction=");
        P0.append(this.q);
        P0.append(", secondaryAction=");
        P0.append(this.r);
        P0.append(", avatarClickListener=");
        P0.append(this.s);
        P0.append(", clickListener=");
        P0.append(this.t);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        a.C0199a aVar = (a.C0199a) obj;
    }
}
