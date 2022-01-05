package i0.e.b.g3.l.x2;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.android.ui.clubs.invites.AddableListUser;
import com.clubhouse.android.user.model.User;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: AddableListUser_ */
public class j extends AddableListUser implements z<AddableListUser.a> {
    public void A(int i, Object obj) {
        super.G(i, (AddableListUser.a) obj);
    }

    public void B(Object obj) {
        super.H((AddableListUser.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new AddableListUser.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        AddableListUser.a aVar = (AddableListUser.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (AddableListUser.a) rVar);
    }

    public void H(r rVar) {
        super.H((AddableListUser.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (AddableListUser.a) dVar);
    }

    public void J(d dVar) {
        super.H((AddableListUser.a) dVar);
    }

    public void c(Object obj, int i) {
        AddableListUser.a aVar = (AddableListUser.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j) || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        Objects.requireNonNull(jVar);
        AddableListUser.AddMethod addMethod = this.m;
        if (addMethod == null ? jVar.m != null : !addMethod.equals(jVar.m)) {
            return false;
        }
        if (this.n != jVar.n || this.o != jVar.o) {
            return false;
        }
        View.OnClickListener onClickListener = this.p;
        if (onClickListener == null ? jVar.p != null : !onClickListener.equals(jVar.p)) {
            return false;
        }
        User user = this.j;
        if (user == null ? jVar.j != null : !user.equals(jVar.j)) {
            return false;
        }
        String str = this.k;
        if (str == null ? jVar.k != null : !str.equals(jVar.k)) {
            return false;
        }
        View.OnClickListener onClickListener2 = this.l;
        if (onClickListener2 == null ? jVar.l != null : !onClickListener2.equals(jVar.l)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? jVar.i == null : aVar.equals(jVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        AddableListUser.a aVar = (AddableListUser.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        AddableListUser.AddMethod addMethod = this.m;
        int hashCode2 = (((((hashCode + (addMethod != null ? addMethod.hashCode() : 0)) * 31) + (this.n ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 31;
        View.OnClickListener onClickListener = this.p;
        int hashCode3 = (hashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        User user = this.j;
        int hashCode4 = (hashCode3 + (user != null ? user.hashCode() : 0)) * 31;
        String str = this.k;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener2 = this.l;
        int hashCode6 = (((hashCode5 + (onClickListener2 != null ? onClickListener2.hashCode() : 0)) * 31) + 0) * 31;
        a<i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode6 + i;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.addable_list_user;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("AddableListUser_{addMethod=");
        P0.append(this.m);
        P0.append(", added=");
        P0.append(this.n);
        P0.append(", loading=");
        P0.append(this.o);
        P0.append(", addClickListener=");
        P0.append(this.p);
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
        AddableListUser.a aVar = (AddableListUser.a) obj;
    }
}
