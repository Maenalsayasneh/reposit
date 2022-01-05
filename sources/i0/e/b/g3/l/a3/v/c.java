package i0.e.b.g3.l.a3.v;

import android.view.View;
import android.view.ViewGroup;
import com.clubhouse.android.data.models.local.club.ClubNominationUser;
import com.clubhouse.android.ui.clubs.nominations.viewholder.ApprovalStatus;
import i0.b.a.o;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.d.a.a.a;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: ClubNominationItemViewModel_ */
public class c extends t<a> implements z<a>, b {
    public final BitSet i = new BitSet(5);
    public ClubNominationUser j;
    public ApprovalStatus k;
    public View.OnClickListener l = null;
    public View.OnClickListener m = null;
    public View.OnClickListener n = null;

    public void A(int i2, Object obj) {
        a aVar = (a) obj;
    }

    public void B(Object obj) {
        a aVar = (a) obj;
        aVar.setUserClickListener((View.OnClickListener) null);
        aVar.setApproveClickListener((View.OnClickListener) null);
        aVar.setRejectClickListener((View.OnClickListener) null);
    }

    public b D(ApprovalStatus approvalStatus) {
        if (approvalStatus != null) {
            this.i.set(1);
            w();
            this.k = approvalStatus;
            return this;
        }
        throw new IllegalArgumentException("approvalStatus cannot be null");
    }

    public b E(View.OnClickListener onClickListener) {
        w();
        this.m = onClickListener;
        return this;
    }

    /* renamed from: F */
    public void k(a aVar) {
        aVar.setApprovalStatus(this.k);
        aVar.setUserClickListener(this.l);
        aVar.setApproveClickListener(this.m);
        aVar.setRejectClickListener(this.n);
        aVar.setNominationUser(this.j);
    }

    public b G(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public b H(ClubNominationUser clubNominationUser) {
        this.i.set(0);
        w();
        this.j = clubNominationUser;
        return this;
    }

    public b I(View.OnClickListener onClickListener) {
        w();
        this.n = onClickListener;
        return this;
    }

    public b J(View.OnClickListener onClickListener) {
        w();
        this.l = onClickListener;
        return this;
    }

    public void c(Object obj, int i2) {
        a aVar = (a) obj;
        C("The model was changed during the bind call.", i2);
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
        ClubNominationUser clubNominationUser = this.j;
        if (clubNominationUser == null ? cVar.j != null : !clubNominationUser.equals(cVar.j)) {
            return false;
        }
        ApprovalStatus approvalStatus = this.k;
        if (approvalStatus == null ? cVar.k != null : !approvalStatus.equals(cVar.k)) {
            return false;
        }
        if ((this.l == null) != (cVar.l == null)) {
            return false;
        }
        if ((this.m == null) != (cVar.m == null)) {
            return false;
        }
        return (this.n == null) == (cVar.n == null);
    }

    public void g(w wVar, Object obj, int i2) {
        a aVar = (a) obj;
        C("The model was changed between being added to the controller and being bound.", i2);
    }

    public int hashCode() {
        int i2 = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        ClubNominationUser clubNominationUser = this.j;
        int hashCode2 = (hashCode + (clubNominationUser != null ? clubNominationUser.hashCode() : 0)) * 31;
        ApprovalStatus approvalStatus = this.k;
        int hashCode3 = (((((hashCode2 + (approvalStatus != null ? approvalStatus.hashCode() : 0)) * 31) + (this.l != null ? 1 : 0)) * 31) + (this.m != null ? 1 : 0)) * 31;
        if (this.n != null) {
            i2 = 1;
        }
        return hashCode3 + i2;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
        if (!this.i.get(1)) {
            throw new IllegalStateException("A value is required for setApprovalStatus");
        } else if (!this.i.get(0)) {
            throw new IllegalStateException("A value is required for setNominationUser");
        }
    }

    public void l(Object obj, t tVar) {
        a aVar = (a) obj;
        if (!(tVar instanceof c)) {
            k(aVar);
            return;
        }
        c cVar = (c) tVar;
        ApprovalStatus approvalStatus = this.k;
        if (approvalStatus == null ? cVar.k != null : !approvalStatus.equals(cVar.k)) {
            aVar.setApprovalStatus(this.k);
        }
        View.OnClickListener onClickListener = this.l;
        boolean z = true;
        if ((onClickListener == null) != (cVar.l == null)) {
            aVar.setUserClickListener(onClickListener);
        }
        View.OnClickListener onClickListener2 = this.m;
        if ((onClickListener2 == null) != (cVar.m == null)) {
            aVar.setApproveClickListener(onClickListener2);
        }
        View.OnClickListener onClickListener3 = this.n;
        boolean z2 = onClickListener3 == null;
        if (cVar.n != null) {
            z = false;
        }
        if (z2 != z) {
            aVar.setRejectClickListener(onClickListener3);
        }
        ClubNominationUser clubNominationUser = this.j;
        ClubNominationUser clubNominationUser2 = cVar.j;
        if (clubNominationUser != null) {
            if (clubNominationUser.equals(clubNominationUser2)) {
                return;
            }
        } else if (clubNominationUser2 == null) {
            return;
        }
        aVar.setNominationUser(this.j);
    }

    public View n(ViewGroup viewGroup) {
        a aVar = new a(viewGroup.getContext());
        aVar.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return aVar;
    }

    public int o() {
        throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
    }

    public int p(int i2, int i3, int i4) {
        return i2;
    }

    public int q() {
        return 0;
    }

    public t r(long j2) {
        super.r(j2);
        return this;
    }

    public String toString() {
        StringBuilder P0 = a.P0("ClubNominationItemViewModel_{nominationUser_ClubNominationUser=");
        P0.append(this.j);
        P0.append(", approvalStatus_ApprovalStatus=");
        P0.append(this.k);
        P0.append(", userClickListener_OnClickListener=");
        P0.append(this.l);
        P0.append(", approveClickListener_OnClickListener=");
        P0.append(this.m);
        P0.append(", rejectClickListener_OnClickListener=");
        P0.append(this.n);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i2, int i3, Object obj) {
        a aVar = (a) obj;
    }
}
