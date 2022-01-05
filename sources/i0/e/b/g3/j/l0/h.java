package i0.e.b.g3.j.l0;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.g3.j.l0.d;
import j$.time.OffsetDateTime;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: ActivityItem_ */
public class h extends d implements z<d.a> {
    public void A(int i, Object obj) {
        super.G(i, (d.a) obj);
    }

    public void B(Object obj) {
        super.H((d.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new d.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        d.a aVar = (d.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (d.a) rVar);
    }

    public void H(r rVar) {
        super.H((d.a) rVar);
    }

    public void I(int i, i0.e.b.a3.f.d dVar) {
        super.G(i, (d.a) dVar);
    }

    public void J(i0.e.b.a3.f.d dVar) {
        super.H((d.a) dVar);
    }

    public void c(Object obj, int i) {
        d.a aVar = (d.a) obj;
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
        String str2 = this.k;
        if (str2 == null ? hVar.k != null : !str2.equals(hVar.k)) {
            return false;
        }
        String str3 = this.l;
        if (str3 == null ? hVar.l != null : !str3.equals(hVar.l)) {
            return false;
        }
        OffsetDateTime offsetDateTime = this.m;
        if (offsetDateTime == null ? hVar.m != null : !offsetDateTime.equals(hVar.m)) {
            return false;
        }
        Boolean bool = this.n;
        if (bool == null ? hVar.n != null : !bool.equals(hVar.n)) {
            return false;
        }
        View.OnClickListener onClickListener = this.o;
        if (onClickListener == null ? hVar.o != null : !onClickListener.equals(hVar.o)) {
            return false;
        }
        View.OnClickListener onClickListener2 = this.p;
        if (onClickListener2 == null ? hVar.p != null : !onClickListener2.equals(hVar.p)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? hVar.i == null : aVar.equals(hVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        d.a aVar = (d.a) obj;
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
        OffsetDateTime offsetDateTime = this.m;
        int hashCode5 = (hashCode4 + (offsetDateTime != null ? offsetDateTime.hashCode() : 0)) * 31;
        Boolean bool = this.n;
        int hashCode6 = (hashCode5 + (bool != null ? bool.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener = this.o;
        int hashCode7 = (hashCode6 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener2 = this.p;
        int hashCode8 = (hashCode7 + (onClickListener2 != null ? onClickListener2.hashCode() : 0)) * 31;
        a<i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode8 + i;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.activity_item;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ActivityItem_{photoUrl=");
        P0.append(this.j);
        P0.append(", name=");
        P0.append(this.k);
        P0.append(", message=");
        P0.append(this.l);
        P0.append(", timeCreated=");
        P0.append(this.m);
        P0.append(", unread=");
        P0.append(this.n);
        P0.append(", avatarClickListener=");
        P0.append(this.o);
        P0.append(", clickListener=");
        P0.append(this.p);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        d.a aVar = (d.a) obj;
    }
}
