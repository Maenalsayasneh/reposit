package i0.e.b.g3.s.i1;

import android.view.View;
import android.view.ViewParent;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.s.i1.a;
import j$.time.OffsetDateTime;
import java.util.Objects;
import m0.i;

/* compiled from: RecentPaymentItem_ */
public class b extends a implements z<a.C0208a> {
    public void A(int i, Object obj) {
        super.G(i, (a.C0208a) obj);
    }

    public void B(Object obj) {
        super.H((a.C0208a) obj);
    }

    public r E(ViewParent viewParent) {
        return new a.C0208a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        a.C0208a aVar = (a.C0208a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (a.C0208a) rVar);
    }

    public void H(r rVar) {
        super.H((a.C0208a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (a.C0208a) dVar);
    }

    public void J(d dVar) {
        super.H((a.C0208a) dVar);
    }

    public void c(Object obj, int i) {
        a.C0208a aVar = (a.C0208a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b) || !super.equals(obj)) {
            return false;
        }
        b bVar = (b) obj;
        Objects.requireNonNull(bVar);
        String str = this.j;
        if (str == null ? bVar.j != null : !str.equals(bVar.j)) {
            return false;
        }
        String str2 = this.k;
        if (str2 == null ? bVar.k != null : !str2.equals(bVar.k)) {
            return false;
        }
        String str3 = this.l;
        if (str3 == null ? bVar.l != null : !str3.equals(bVar.l)) {
            return false;
        }
        Boolean bool = this.m;
        if (bool == null ? bVar.m != null : !bool.equals(bVar.m)) {
            return false;
        }
        OffsetDateTime offsetDateTime = this.n;
        if (offsetDateTime == null ? bVar.n != null : !offsetDateTime.equals(bVar.n)) {
            return false;
        }
        View.OnClickListener onClickListener = this.o;
        if (onClickListener == null ? bVar.o != null : !onClickListener.equals(bVar.o)) {
            return false;
        }
        View.OnClickListener onClickListener2 = this.p;
        if (onClickListener2 == null ? bVar.p != null : !onClickListener2.equals(bVar.p)) {
            return false;
        }
        View.OnClickListener onClickListener3 = this.q;
        if (onClickListener3 == null ? bVar.q != null : !onClickListener3.equals(bVar.q)) {
            return false;
        }
        m0.n.a.a<i> aVar = this.i;
        return aVar == null ? bVar.i == null : aVar.equals(bVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        a.C0208a aVar = (a.C0208a) obj;
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
        Boolean bool = this.m;
        int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
        OffsetDateTime offsetDateTime = this.n;
        int hashCode6 = (hashCode5 + (offsetDateTime != null ? offsetDateTime.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener = this.o;
        int hashCode7 = (hashCode6 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener2 = this.p;
        int hashCode8 = (hashCode7 + (onClickListener2 != null ? onClickListener2.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener3 = this.q;
        int hashCode9 = (hashCode8 + (onClickListener3 != null ? onClickListener3.hashCode() : 0)) * 31;
        m0.n.a.a<i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode9 + i;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("RecentPaymentItem_{photoUrl=");
        P0.append(this.j);
        P0.append(", name=");
        P0.append(this.k);
        P0.append(", amount=");
        P0.append(this.l);
        P0.append(", acknowledged=");
        P0.append(this.m);
        P0.append(", timeCreated=");
        P0.append(this.n);
        P0.append(", avatarClickListener=");
        P0.append(this.o);
        P0.append(", acknowledgedClickListener=");
        P0.append(this.p);
        P0.append(", unAcknowledgedClickListener=");
        P0.append(this.q);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        a.C0208a aVar = (a.C0208a) obj;
    }
}
