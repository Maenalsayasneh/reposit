package i0.e.b.g3.u.y5.h1;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.g3.u.y5.h1.a;
import java.util.Objects;

/* compiled from: ReportReason_ */
public class i extends a implements z<a.C0210a>, b {
    public void A(int i, Object obj) {
        a.C0210a aVar = (a.C0210a) obj;
    }

    public void B(Object obj) {
        a.C0210a aVar = (a.C0210a) obj;
    }

    public r E(ViewParent viewParent) {
        return new a.C0210a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        a.C0210a aVar = (a.C0210a) rVar;
    }

    public void G(int i, r rVar) {
        a.C0210a aVar = (a.C0210a) rVar;
    }

    public void H(r rVar) {
        a.C0210a aVar = (a.C0210a) rVar;
    }

    public b J(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public b K(String str) {
        w();
        this.i = str;
        return this;
    }

    public b L(View.OnClickListener onClickListener) {
        w();
        this.j = onClickListener;
        return this;
    }

    public void c(Object obj, int i) {
        a.C0210a aVar = (a.C0210a) obj;
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
        String str = this.i;
        if (str == null ? iVar.i != null : !str.equals(iVar.i)) {
            return false;
        }
        View.OnClickListener onClickListener = this.j;
        return onClickListener == null ? iVar.j == null : onClickListener.equals(iVar.j);
    }

    public void g(w wVar, Object obj, int i) {
        a.C0210a aVar = (a.C0210a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.i;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener = this.j;
        if (onClickListener != null) {
            i = onClickListener.hashCode();
        }
        return hashCode2 + i;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.report_reason;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ReportReason_{incident=");
        P0.append(this.i);
        P0.append(", onClickListener=");
        P0.append(this.j);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        a.C0210a aVar = (a.C0210a) obj;
    }
}
