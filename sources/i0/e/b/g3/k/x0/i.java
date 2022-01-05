package i0.e.b.g3.k.x0;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.ui.channels.viewholder.ChannelSpeaker;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import java.util.Objects;
import m0.n.a.a;

/* compiled from: ChannelSpeaker_ */
public class i extends ChannelSpeaker implements z<ChannelSpeaker.a>, h {
    public void A(int i, Object obj) {
        super.G(i, (ChannelSpeaker.a) obj);
    }

    public void B(Object obj) {
        super.H((ChannelSpeaker.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new ChannelSpeaker.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        ChannelSpeaker.a aVar = (ChannelSpeaker.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (ChannelSpeaker.a) rVar);
    }

    public void H(r rVar) {
        super.H((ChannelSpeaker.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (ChannelSpeaker.a) dVar);
    }

    public void J(d dVar) {
        super.H((ChannelSpeaker.a) dVar);
    }

    public h L(View.OnClickListener onClickListener) {
        w();
        this.n = onClickListener;
        return this;
    }

    public h M(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public h N(boolean z) {
        w();
        this.k = z;
        return this;
    }

    public h O(n0.a.g2.d dVar) {
        w();
        m0.n.b.i.e(dVar, "<set-?>");
        this.m = dVar;
        return this;
    }

    public h P(n0.a.g2.d dVar) {
        w();
        m0.n.b.i.e(dVar, "<set-?>");
        this.l = dVar;
        return this;
    }

    public h Q(UserInChannel userInChannel) {
        w();
        this.j = userInChannel;
        return this;
    }

    public void c(Object obj, int i) {
        ChannelSpeaker.a aVar = (ChannelSpeaker.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i) || !super.equals(obj)) {
            return false;
        }
        i iVar = (i) obj;
        Objects.requireNonNull(iVar);
        UserInChannel userInChannel = this.j;
        if (userInChannel == null ? iVar.j != null : !userInChannel.equals(iVar.j)) {
            return false;
        }
        if (this.k != iVar.k) {
            return false;
        }
        n0.a.g2.d<Boolean> dVar = this.l;
        if (dVar == null ? iVar.l != null : !dVar.equals(iVar.l)) {
            return false;
        }
        n0.a.g2.d<Boolean> dVar2 = this.m;
        if (dVar2 == null ? iVar.m != null : !dVar2.equals(iVar.m)) {
            return false;
        }
        View.OnClickListener onClickListener = this.n;
        if (onClickListener == null ? iVar.n != null : !onClickListener.equals(iVar.n)) {
            return false;
        }
        a<m0.i> aVar = this.i;
        return aVar == null ? iVar.i == null : aVar.equals(iVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        ChannelSpeaker.a aVar = (ChannelSpeaker.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        UserInChannel userInChannel = this.j;
        int hashCode2 = (((hashCode + (userInChannel != null ? userInChannel.hashCode() : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        n0.a.g2.d<Boolean> dVar = this.l;
        int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        n0.a.g2.d<Boolean> dVar2 = this.m;
        int hashCode4 = (hashCode3 + (dVar2 != null ? dVar2.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener = this.n;
        int hashCode5 = (hashCode4 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        a<m0.i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode5 + i;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.large_user_in_grid;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ChannelSpeaker_{user=");
        P0.append(this.j);
        P0.append(", isModerator=");
        P0.append(this.k);
        P0.append(", speakerSignal=");
        P0.append(this.l);
        P0.append(", muteSignal=");
        P0.append(this.m);
        P0.append(", clickListener=");
        P0.append(this.n);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        ChannelSpeaker.a aVar = (ChannelSpeaker.a) obj;
    }
}
