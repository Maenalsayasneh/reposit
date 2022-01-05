package i0.e.b.g3.k.x0;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.k.x0.j;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: ChannelUser_ */
public class l extends j implements z<j.a>, k {
    public void A(int i, Object obj) {
        super.G(i, (j.a) obj);
    }

    public void B(Object obj) {
        super.H((j.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new j.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        j.a aVar = (j.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (j.a) rVar);
    }

    public void H(r rVar) {
        super.H((j.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (j.a) dVar);
    }

    public void J(d dVar) {
        super.H((j.a) dVar);
    }

    public k L(View.OnClickListener onClickListener) {
        w();
        this.l = onClickListener;
        return this;
    }

    public k M(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public k N(boolean z) {
        w();
        this.k = z;
        return this;
    }

    public k O(UserInChannel userInChannel) {
        w();
        this.j = userInChannel;
        return this;
    }

    public void c(Object obj, int i) {
        j.a aVar = (j.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l) || !super.equals(obj)) {
            return false;
        }
        l lVar = (l) obj;
        Objects.requireNonNull(lVar);
        UserInChannel userInChannel = this.j;
        if (userInChannel == null ? lVar.j != null : !userInChannel.equals(lVar.j)) {
            return false;
        }
        if (this.k != lVar.k) {
            return false;
        }
        View.OnClickListener onClickListener = this.l;
        if (onClickListener == null ? lVar.l != null : !onClickListener.equals(lVar.l)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? lVar.i == null : aVar.equals(lVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        j.a aVar = (j.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        UserInChannel userInChannel = this.j;
        int hashCode2 = (((hashCode + (userInChannel != null ? userInChannel.hashCode() : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        View.OnClickListener onClickListener = this.l;
        int hashCode3 = (hashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        a<i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode3 + i;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.user_in_grid;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ChannelUser_{user=");
        P0.append(this.j);
        P0.append(", raisedHand=");
        P0.append(this.k);
        P0.append(", clickListener=");
        P0.append(this.l);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        j.a aVar = (j.a) obj;
    }
}
