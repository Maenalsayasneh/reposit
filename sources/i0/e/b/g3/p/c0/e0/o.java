package i0.e.b.g3.p.c0.e0;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.android.channels.model.AudienceType;
import com.clubhouse.android.user.model.UserInRoom;
import com.clubhouse.app.R;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.p.c0.e0.m;
import java.util.List;
import java.util.Objects;
import m0.n.a.a;
import m0.n.b.i;

/* compiled from: ChannelView_ */
public class o extends m implements z<m.a>, n {
    public void A(int i, Object obj) {
        super.G(i, (m.a) obj);
    }

    public void B(Object obj) {
        super.H((m.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new m.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        m.a aVar = (m.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (m.a) rVar);
    }

    public void H(r rVar) {
        super.H((m.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (m.a) dVar);
    }

    public void J(d dVar) {
        super.H((m.a) dVar);
    }

    public n M(View.OnClickListener onClickListener) {
        w();
        this.t = onClickListener;
        return this;
    }

    public n N(String str) {
        w();
        this.r = str;
        return this;
    }

    public n O(Number[] numberArr) {
        t(numberArr);
        return this;
    }

    public n P(List list) {
        w();
        i.e(list, "<set-?>");
        this.p = list;
        return this;
    }

    public n Q(UserInRoom userInRoom) {
        w();
        this.n = userInRoom;
        return this;
    }

    public n R(UserInRoom userInRoom) {
        w();
        this.o = userInRoom;
        return this;
    }

    public n S(String str) {
        w();
        this.m = str;
        return this;
    }

    public n T(String str) {
        w();
        this.l = str;
        return this;
    }

    public n U(String str) {
        w();
        this.k = str;
        return this;
    }

    public void c(Object obj, int i) {
        m.a aVar = (m.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o) || !super.equals(obj)) {
            return false;
        }
        o oVar = (o) obj;
        Objects.requireNonNull(oVar);
        String str = this.j;
        if (str == null ? oVar.j != null : !str.equals(oVar.j)) {
            return false;
        }
        String str2 = this.k;
        if (str2 == null ? oVar.k != null : !str2.equals(oVar.k)) {
            return false;
        }
        String str3 = this.l;
        if (str3 == null ? oVar.l != null : !str3.equals(oVar.l)) {
            return false;
        }
        String str4 = this.m;
        if (str4 == null ? oVar.m != null : !str4.equals(oVar.m)) {
            return false;
        }
        UserInRoom userInRoom = this.n;
        if (userInRoom == null ? oVar.n != null : !userInRoom.equals(oVar.n)) {
            return false;
        }
        UserInRoom userInRoom2 = this.o;
        if (userInRoom2 == null ? oVar.o != null : !userInRoom2.equals(oVar.o)) {
            return false;
        }
        List<? extends UserInRoom> list = this.p;
        if (list == null ? oVar.p != null : !list.equals(oVar.p)) {
            return false;
        }
        AudienceType audienceType = this.q;
        if (audienceType == null ? oVar.q != null : !audienceType.equals(oVar.q)) {
            return false;
        }
        String str5 = this.r;
        if (str5 == null ? oVar.r != null : !str5.equals(oVar.r)) {
            return false;
        }
        if (this.s != oVar.s) {
            return false;
        }
        View.OnClickListener onClickListener = this.t;
        if (onClickListener == null ? oVar.t != null : !onClickListener.equals(oVar.t)) {
            return false;
        }
        View.OnClickListener onClickListener2 = this.u;
        if (onClickListener2 == null ? oVar.u != null : !onClickListener2.equals(oVar.u)) {
            return false;
        }
        View.OnLongClickListener onLongClickListener = this.v;
        if (onLongClickListener == null ? oVar.v != null : !onLongClickListener.equals(oVar.v)) {
            return false;
        }
        a<m0.i> aVar = this.i;
        return aVar == null ? oVar.i == null : aVar.equals(oVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        m.a aVar = (m.a) obj;
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
        String str4 = this.m;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        UserInRoom userInRoom = this.n;
        int hashCode6 = (hashCode5 + (userInRoom != null ? userInRoom.hashCode() : 0)) * 31;
        UserInRoom userInRoom2 = this.o;
        int hashCode7 = (hashCode6 + (userInRoom2 != null ? userInRoom2.hashCode() : 0)) * 31;
        List<? extends UserInRoom> list = this.p;
        int hashCode8 = (hashCode7 + (list != null ? list.hashCode() : 0)) * 31;
        AudienceType audienceType = this.q;
        int hashCode9 = (hashCode8 + (audienceType != null ? audienceType.hashCode() : 0)) * 31;
        String str5 = this.r;
        int hashCode10 = (((hashCode9 + (str5 != null ? str5.hashCode() : 0)) * 31) + (this.s ? 1 : 0)) * 31;
        View.OnClickListener onClickListener = this.t;
        int hashCode11 = (hashCode10 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener2 = this.u;
        int hashCode12 = (hashCode11 + (onClickListener2 != null ? onClickListener2.hashCode() : 0)) * 31;
        View.OnLongClickListener onLongClickListener = this.v;
        int hashCode13 = (hashCode12 + (onLongClickListener != null ? onLongClickListener.hashCode() : 0)) * 31;
        a<m0.i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode13 + i;
    }

    public void i(i0.b.a.o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.view_channel;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ChannelView_{clubName=");
        P0.append(this.j);
        P0.append(", topic=");
        P0.append(this.k);
        P0.append(", statsSpeakers=");
        P0.append(this.l);
        P0.append(", statsAll=");
        P0.append(this.m);
        P0.append(", moderator1=");
        P0.append(this.n);
        P0.append(", moderator2=");
        P0.append(this.o);
        P0.append(", memberNames=");
        P0.append(this.p);
        P0.append(", audienceType=");
        P0.append(this.q);
        P0.append(", contentDescription=");
        P0.append(this.r);
        P0.append(", showOverflowMenu=");
        P0.append(this.s);
        P0.append(", clickListener=");
        P0.append(this.t);
        P0.append(", overflowMenuClickListener=");
        P0.append(this.u);
        P0.append(", longClickListener=");
        P0.append(this.v);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        m.a aVar = (m.a) obj;
    }
}
