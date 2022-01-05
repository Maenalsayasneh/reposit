package i0.e.b.g3.u.y5.h1;

import android.view.ViewParent;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.d.a.a.a;
import i0.e.b.g3.u.y5.h1.f;
import java.util.Objects;

/* compiled from: ReportReasonLoading_ */
public class h extends f implements z<f.a>, g {
    public void A(int i, Object obj) {
        f.a aVar = (f.a) obj;
    }

    public void B(Object obj) {
        f.a aVar = (f.a) obj;
    }

    public r E(ViewParent viewParent) {
        return new f.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        f.a aVar = (f.a) rVar;
    }

    public void G(int i, r rVar) {
        f.a aVar = (f.a) rVar;
    }

    public void H(r rVar) {
        f.a aVar = (f.a) rVar;
    }

    public g I(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public void c(Object obj, int i) {
        f.a aVar = (f.a) obj;
        C("The model was changed during the bind call.", i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h) || !super.equals(obj)) {
            return false;
        }
        Objects.requireNonNull((h) obj);
        return true;
    }

    public void g(w wVar, Object obj, int i) {
        f.a aVar = (f.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        return (((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.report_reason_loading;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = a.P0("ReportReasonLoading_{}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        f.a aVar = (f.a) obj;
    }
}
