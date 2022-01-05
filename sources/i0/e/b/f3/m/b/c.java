package i0.e.b.f3.m.b;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.android.user.model.User;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.f3.m.b.b;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: FollowableListUser_ */
public class c extends b implements z<b.a> {
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

    public void I(int i, d dVar) {
        super.G(i, (b.a) dVar);
    }

    public void J(d dVar) {
        super.H((b.a) dVar);
    }

    public void c(Object obj, int i) {
        b.a aVar = (b.a) obj;
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
        if (this.m != cVar.m || this.n != cVar.n) {
            return false;
        }
        View.OnClickListener onClickListener = this.o;
        if (onClickListener == null ? cVar.o != null : !onClickListener.equals(cVar.o)) {
            return false;
        }
        if (this.p != cVar.p || this.q != cVar.q || this.r != cVar.r || this.s != cVar.s) {
            return false;
        }
        a<i> aVar = this.i;
        if (aVar == null ? cVar.i != null : !aVar.equals(cVar.i)) {
            return false;
        }
        User user = this.j;
        if (user == null ? cVar.j != null : !user.equals(cVar.j)) {
            return false;
        }
        String str = this.k;
        if (str == null ? cVar.k != null : !str.equals(cVar.k)) {
            return false;
        }
        View.OnClickListener onClickListener2 = this.l;
        return onClickListener2 == null ? cVar.l == null : onClickListener2.equals(cVar.l);
    }

    public void g(w wVar, Object obj, int i) {
        b.a aVar = (b.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int hashCode = ((((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + (this.m ? 1 : 0)) * 31) + (this.n ? 1 : 0)) * 31;
        View.OnClickListener onClickListener = this.o;
        int hashCode2 = (((((((((hashCode + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31) + (this.p ? 1 : 0)) * 31) + (this.q ? 1 : 0)) * 31) + (this.r ? 1 : 0)) * 31) + (this.s ? 1 : 0)) * 31;
        a<i> aVar = this.i;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        User user = this.j;
        int hashCode4 = (hashCode3 + (user != null ? user.hashCode() : 0)) * 31;
        String str = this.k;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener2 = this.l;
        return ((hashCode5 + (onClickListener2 != null ? onClickListener2.hashCode() : 0)) * 31) + 0;
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
        StringBuilder P0 = i0.d.a.a.a.P0("FollowableListUser_{showFollowButton=");
        P0.append(this.m);
        P0.append(", following=");
        P0.append(this.n);
        P0.append(", followClickListener=");
        P0.append(this.o);
        P0.append(", blocked=");
        P0.append(this.p);
        P0.append(", self=");
        P0.append(this.q);
        P0.append(", compactMode=");
        P0.append(this.r);
        P0.append(", hideBio=");
        P0.append(this.s);
        P0.append(", user=");
        P0.append(this.j);
        P0.append(", userBio=");
        P0.append(this.k);
        P0.append(", clickListener=");
        P0.append(this.l);
        P0.append(", longClickListener=");
        P0.append((Object) null);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        b.a aVar = (b.a) obj;
    }
}
