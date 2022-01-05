package i0.e.b.g3.q.r;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.android.data.models.local.SuggestedInvite;
import com.clubhouse.android.ui.invites.viewholder.Type;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.q.r.a;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: InviteItem_ */
public class c extends a implements z<a.C0206a>, b {
    public void A(int i, Object obj) {
        super.G(i, (a.C0206a) obj);
    }

    public void B(Object obj) {
        super.H((a.C0206a) obj);
    }

    public r E(ViewParent viewParent) {
        return new a.C0206a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        a.C0206a aVar = (a.C0206a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (a.C0206a) rVar);
    }

    public void H(r rVar) {
        super.H((a.C0206a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (a.C0206a) dVar);
    }

    public void J(d dVar) {
        super.H((a.C0206a) dVar);
    }

    public b L(View.OnClickListener onClickListener) {
        w();
        this.l = onClickListener;
        return this;
    }

    public b M(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public b N(SuggestedInvite suggestedInvite) {
        w();
        this.k = suggestedInvite;
        return this;
    }

    public b O(Type type) {
        w();
        i.e(type, "<set-?>");
        this.j = type;
        return this;
    }

    public void c(Object obj, int i) {
        a.C0206a aVar = (a.C0206a) obj;
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
        Type type = this.j;
        if (type == null ? cVar.j != null : !type.equals(cVar.j)) {
            return false;
        }
        SuggestedInvite suggestedInvite = this.k;
        if (suggestedInvite == null ? cVar.k != null : !suggestedInvite.equals(cVar.k)) {
            return false;
        }
        View.OnClickListener onClickListener = this.l;
        if (onClickListener == null ? cVar.l != null : !onClickListener.equals(cVar.l)) {
            return false;
        }
        m0.n.a.a<m0.i> aVar = this.i;
        return aVar == null ? cVar.i == null : aVar.equals(cVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        a.C0206a aVar = (a.C0206a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        Type type = this.j;
        int hashCode2 = (hashCode + (type != null ? type.hashCode() : 0)) * 31;
        SuggestedInvite suggestedInvite = this.k;
        int hashCode3 = (hashCode2 + (suggestedInvite != null ? suggestedInvite.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener = this.l;
        int hashCode4 = (hashCode3 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        m0.n.a.a<m0.i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode4 + i;
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
        StringBuilder P0 = i0.d.a.a.a.P0("InviteItem_{type=");
        P0.append(this.j);
        P0.append(", invite=");
        P0.append(this.k);
        P0.append(", clickListener=");
        P0.append(this.l);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        a.C0206a aVar = (a.C0206a) obj;
    }
}
