package i0.e.b.g3.p.b0.x;

import android.text.SpannableString;
import android.view.View;
import android.view.ViewParent;
import com.clubhouse.android.data.models.local.user.UserInStatus;
import com.clubhouse.android.ui.hallway.buddyList.viewholder.BuddyListUser;
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

/* compiled from: BuddyListUser_ */
public class j extends BuddyListUser implements z<BuddyListUser.a>, f {
    public void A(int i, Object obj) {
        super.G(i, (BuddyListUser.a) obj);
    }

    public void B(Object obj) {
        super.H((BuddyListUser.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new BuddyListUser.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        BuddyListUser.a aVar = (BuddyListUser.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (BuddyListUser.a) rVar);
    }

    public void H(r rVar) {
        super.H((BuddyListUser.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (BuddyListUser.a) dVar);
    }

    public void J(d dVar) {
        super.H((BuddyListUser.a) dVar);
    }

    public f L(View.OnClickListener onClickListener) {
        w();
        this.n = onClickListener;
        return this;
    }

    public f M(BuddyListUser.Action action) {
        w();
        this.m = action;
        return this;
    }

    public f N(View.OnClickListener onClickListener) {
        w();
        this.l = onClickListener;
        return this;
    }

    public f O(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public f P(SpannableString spannableString) {
        w();
        this.k = spannableString;
        return this;
    }

    public f Q(UserInStatus userInStatus) {
        w();
        this.j = userInStatus;
        return this;
    }

    public void c(Object obj, int i) {
        BuddyListUser.a aVar = (BuddyListUser.a) obj;
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
        UserInStatus userInStatus = this.j;
        if (userInStatus == null ? jVar.j != null : !userInStatus.equals(jVar.j)) {
            return false;
        }
        SpannableString spannableString = this.k;
        if (spannableString == null ? jVar.k != null : !spannableString.equals(jVar.k)) {
            return false;
        }
        View.OnClickListener onClickListener = this.l;
        if (onClickListener == null ? jVar.l != null : !onClickListener.equals(jVar.l)) {
            return false;
        }
        BuddyListUser.Action action = this.m;
        if (action == null ? jVar.m != null : !action.equals(jVar.m)) {
            return false;
        }
        View.OnClickListener onClickListener2 = this.n;
        if (onClickListener2 == null ? jVar.n != null : !onClickListener2.equals(jVar.n)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? jVar.i == null : aVar.equals(jVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        BuddyListUser.a aVar = (BuddyListUser.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        UserInStatus userInStatus = this.j;
        int hashCode2 = (hashCode + (userInStatus != null ? userInStatus.hashCode() : 0)) * 31;
        SpannableString spannableString = this.k;
        int hashCode3 = (hashCode2 + (spannableString != null ? spannableString.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener = this.l;
        int hashCode4 = (hashCode3 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        BuddyListUser.Action action = this.m;
        int hashCode5 = (hashCode4 + (action != null ? action.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener2 = this.n;
        int hashCode6 = (hashCode5 + (onClickListener2 != null ? onClickListener2.hashCode() : 0)) * 31;
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
        return R.layout.buddy_list_user;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("BuddyListUser_{user=");
        P0.append(this.j);
        P0.append(", status=");
        P0.append(this.k);
        P0.append(", clickListener=");
        P0.append(this.l);
        P0.append(", buttonAction=");
        P0.append(this.m);
        P0.append(", actionButtonClickListener=");
        P0.append(this.n);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        BuddyListUser.a aVar = (BuddyListUser.a) obj;
    }
}
