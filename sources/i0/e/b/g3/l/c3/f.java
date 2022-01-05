package i0.e.b.g3.l.c3;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.ui.clubs.viewholder.ClubActionButtons;
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

/* compiled from: ClubActionButtons_ */
public class f extends ClubActionButtons implements z<ClubActionButtons.a> {
    public void A(int i, Object obj) {
        super.G(i, (ClubActionButtons.a) obj);
    }

    public void B(Object obj) {
        super.H((ClubActionButtons.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new ClubActionButtons.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        ClubActionButtons.a aVar = (ClubActionButtons.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (ClubActionButtons.a) rVar);
    }

    public void H(r rVar) {
        super.H((ClubActionButtons.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (ClubActionButtons.a) dVar);
    }

    public void J(d dVar) {
        super.H((ClubActionButtons.a) dVar);
    }

    public void c(Object obj, int i) {
        ClubActionButtons.a aVar = (ClubActionButtons.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f) || !super.equals(obj)) {
            return false;
        }
        f fVar = (f) obj;
        Objects.requireNonNull(fVar);
        ClubActionButtons.ClubStatus clubStatus = this.j;
        if (clubStatus == null ? fVar.j != null : !clubStatus.equals(fVar.j)) {
            return false;
        }
        BasicUser basicUser = this.k;
        if (basicUser == null ? fVar.k != null : !basicUser.equals(fVar.k)) {
            return false;
        }
        if (this.l != fVar.l || this.m != fVar.m || this.n != fVar.n) {
            return false;
        }
        Integer num = this.o;
        if (num == null ? fVar.o != null : !num.equals(fVar.o)) {
            return false;
        }
        if (this.p != fVar.p) {
            return false;
        }
        View.OnClickListener onClickListener = this.q;
        if (onClickListener == null ? fVar.q != null : !onClickListener.equals(fVar.q)) {
            return false;
        }
        View.OnClickListener onClickListener2 = this.r;
        if (onClickListener2 == null ? fVar.r != null : !onClickListener2.equals(fVar.r)) {
            return false;
        }
        View.OnClickListener onClickListener3 = this.s;
        if (onClickListener3 == null ? fVar.s != null : !onClickListener3.equals(fVar.s)) {
            return false;
        }
        View.OnClickListener onClickListener4 = this.t;
        if (onClickListener4 == null ? fVar.t != null : !onClickListener4.equals(fVar.t)) {
            return false;
        }
        View.OnClickListener onClickListener5 = this.u;
        if (onClickListener5 == null ? fVar.u != null : !onClickListener5.equals(fVar.u)) {
            return false;
        }
        View.OnClickListener onClickListener6 = this.v;
        if (onClickListener6 == null ? fVar.v != null : !onClickListener6.equals(fVar.v)) {
            return false;
        }
        View.OnClickListener onClickListener7 = this.w;
        if (onClickListener7 == null ? fVar.w != null : !onClickListener7.equals(fVar.w)) {
            return false;
        }
        View.OnClickListener onClickListener8 = this.x;
        if (onClickListener8 == null ? fVar.x != null : !onClickListener8.equals(fVar.x)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? fVar.i == null : aVar.equals(fVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        ClubActionButtons.a aVar = (ClubActionButtons.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        ClubActionButtons.ClubStatus clubStatus = this.j;
        int hashCode2 = (hashCode + (clubStatus != null ? clubStatus.hashCode() : 0)) * 31;
        BasicUser basicUser = this.k;
        int hashCode3 = (((((((hashCode2 + (basicUser != null ? basicUser.hashCode() : 0)) * 31) + (this.l ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31) + (this.n ? 1 : 0)) * 31;
        Integer num = this.o;
        int hashCode4 = (((hashCode3 + (num != null ? num.hashCode() : 0)) * 31) + (this.p ? 1 : 0)) * 31;
        View.OnClickListener onClickListener = this.q;
        int hashCode5 = (hashCode4 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener2 = this.r;
        int hashCode6 = (hashCode5 + (onClickListener2 != null ? onClickListener2.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener3 = this.s;
        int hashCode7 = (hashCode6 + (onClickListener3 != null ? onClickListener3.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener4 = this.t;
        int hashCode8 = (hashCode7 + (onClickListener4 != null ? onClickListener4.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener5 = this.u;
        int hashCode9 = (hashCode8 + (onClickListener5 != null ? onClickListener5.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener6 = this.v;
        int hashCode10 = (hashCode9 + (onClickListener6 != null ? onClickListener6.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener7 = this.w;
        int hashCode11 = (hashCode10 + (onClickListener7 != null ? onClickListener7.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener8 = this.x;
        int hashCode12 = (hashCode11 + (onClickListener8 != null ? onClickListener8.hashCode() : 0)) * 31;
        a<i> aVar = this.i;
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
        return R.layout.club_action_buttons;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ClubActionButtons_{clubStatus=");
        P0.append(this.j);
        P0.append(", inviter=");
        P0.append(this.k);
        P0.append(", invited=");
        P0.append(this.l);
        P0.append(", askToJoinEnabled=");
        P0.append(this.m);
        P0.append(", membershipOpen=");
        P0.append(this.n);
        P0.append(", numPendingNominations=");
        P0.append(this.o);
        P0.append(", pendingApproval=");
        P0.append(this.p);
        P0.append(", scheduleRoomClickListener=");
        P0.append(this.q);
        P0.append(", applyToJoinClickListener=");
        P0.append(this.r);
        P0.append(", joinClickListener=");
        P0.append(this.s);
        P0.append(", acceptInviteClickListener=");
        P0.append(this.t);
        P0.append(", memberClickListener=");
        P0.append(this.u);
        P0.append(", addMembersClickListener=");
        P0.append(this.v);
        P0.append(", nominateMembersClickListener=");
        P0.append(this.w);
        P0.append(", inviteMembersClickListener=");
        P0.append(this.x);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        ClubActionButtons.a aVar = (ClubActionButtons.a) obj;
    }
}
