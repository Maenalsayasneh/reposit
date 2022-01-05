package i0.e.b.g3.p.b0.x;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.android.data.models.local.club.ClubInStatus;
import com.clubhouse.android.ui.hallway.buddyList.viewholder.BuddyListClub;
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

/* compiled from: BuddyListClub_ */
public class b extends BuddyListClub implements z<BuddyListClub.a>, a {
    public void A(int i, Object obj) {
        super.G(i, (BuddyListClub.a) obj);
    }

    public void B(Object obj) {
        super.L((BuddyListClub.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new BuddyListClub.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        BuddyListClub.a aVar = (BuddyListClub.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (BuddyListClub.a) rVar);
    }

    public void H(r rVar) {
        super.L((BuddyListClub.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (BuddyListClub.a) dVar);
    }

    public void J(d dVar) {
        super.L((BuddyListClub.a) dVar);
    }

    public a M(View.OnClickListener onClickListener) {
        w();
        this.k = onClickListener;
        return this;
    }

    public a N(ClubInStatus clubInStatus) {
        w();
        this.j = clubInStatus;
        return this;
    }

    public a O(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public a P(View.OnClickListener onClickListener) {
        w();
        this.l = onClickListener;
        return this;
    }

    public void c(Object obj, int i) {
        BuddyListClub.a aVar = (BuddyListClub.a) obj;
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
        ClubInStatus clubInStatus = this.j;
        if (clubInStatus == null ? bVar.j != null : !clubInStatus.equals(bVar.j)) {
            return false;
        }
        View.OnClickListener onClickListener = this.k;
        if (onClickListener == null ? bVar.k != null : !onClickListener.equals(bVar.k)) {
            return false;
        }
        View.OnClickListener onClickListener2 = this.l;
        if (onClickListener2 == null ? bVar.l != null : !onClickListener2.equals(bVar.l)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? bVar.i == null : aVar.equals(bVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        BuddyListClub.a aVar = (BuddyListClub.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        ClubInStatus clubInStatus = this.j;
        int hashCode2 = (hashCode + (clubInStatus != null ? clubInStatus.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener = this.k;
        int hashCode3 = (hashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener2 = this.l;
        int hashCode4 = (hashCode3 + (onClickListener2 != null ? onClickListener2.hashCode() : 0)) * 31;
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
        return R.layout.buddy_list_club;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("BuddyListClub_{club=");
        P0.append(this.j);
        P0.append(", clickListener=");
        P0.append(this.k);
        P0.append(", startRoomClickListener=");
        P0.append(this.l);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        BuddyListClub.a aVar = (BuddyListClub.a) obj;
    }
}
