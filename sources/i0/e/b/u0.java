package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.ui.onboarding.ValidateNumberWithCallViewModel;
import h0.b0.v;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.g3.r.o2;
import i0.e.b.l;
import i0.j.f.p.h;
import j0.b.c;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class u0 implements a {
    public final /* synthetic */ l.e a;

    public u0(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        Object obj;
        o2 o2Var = (o2) jVar;
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        l lVar = eVar.b;
        Object obj2 = lVar.R;
        if (obj2 instanceof c) {
            synchronized (obj2) {
                obj = lVar.R;
                if (obj instanceof c) {
                    obj = v.z1(lVar.c, h.m3(lVar.b), lVar.v());
                    j0.b.a.a(lVar.R, obj);
                    lVar.R = obj;
                }
            }
            obj2 = obj;
        }
        return new ValidateNumberWithCallViewModel(o2Var, (i0.n.c.a.c.b.a) obj2, l.q(eVar.b), eVar.b.u());
    }
}
