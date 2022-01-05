package i0.e.b.g3.w.j0;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.android.channels.model.AudienceType;
import com.clubhouse.android.user.model.UserInRoom;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.w.j0.e;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: ChannelInExplore_ */
public class f extends e implements z<e.a> {
    public void A(int i, Object obj) {
        super.G(i, (e.a) obj);
    }

    public void B(Object obj) {
        super.H((e.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new e.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        e.a aVar = (e.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (e.a) rVar);
    }

    public void H(r rVar) {
        super.H((e.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (e.a) dVar);
    }

    public void J(d dVar) {
        super.H((e.a) dVar);
    }

    public void c(Object obj, int i) {
        e.a aVar = (e.a) obj;
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
        String str = this.j;
        if (str == null ? fVar.j != null : !str.equals(fVar.j)) {
            return false;
        }
        String str2 = this.k;
        if (str2 == null ? fVar.k != null : !str2.equals(fVar.k)) {
            return false;
        }
        String str3 = this.l;
        if (str3 == null ? fVar.l != null : !str3.equals(fVar.l)) {
            return false;
        }
        String str4 = this.m;
        if (str4 == null ? fVar.m != null : !str4.equals(fVar.m)) {
            return false;
        }
        UserInRoom userInRoom = this.n;
        if (userInRoom == null ? fVar.n != null : !userInRoom.equals(fVar.n)) {
            return false;
        }
        UserInRoom userInRoom2 = this.o;
        if (userInRoom2 == null ? fVar.o != null : !userInRoom2.equals(fVar.o)) {
            return false;
        }
        AudienceType audienceType = this.p;
        if (audienceType == null ? fVar.p != null : !audienceType.equals(fVar.p)) {
            return false;
        }
        View.OnClickListener onClickListener = this.q;
        if (onClickListener == null ? fVar.q != null : !onClickListener.equals(fVar.q)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? fVar.i == null : aVar.equals(fVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        e.a aVar = (e.a) obj;
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
        AudienceType audienceType = this.p;
        int hashCode8 = (((hashCode7 + (audienceType != null ? audienceType.hashCode() : 0)) * 31) + 0) * 31;
        View.OnClickListener onClickListener = this.q;
        int hashCode9 = (hashCode8 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        a<i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode9 + i;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.explore_channel;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ChannelInExplore_{clubName=");
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
        P0.append(", audienceType=");
        P0.append(this.p);
        P0.append(", contentDescription=");
        P0.append((String) null);
        P0.append(", clickListener=");
        P0.append(this.q);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        e.a aVar = (e.a) obj;
    }
}
