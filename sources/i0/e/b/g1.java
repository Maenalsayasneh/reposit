package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.g3.u.y5.p0;
import i0.e.b.g3.u.y5.q0;
import i0.e.b.l;
import i0.j.f.p.h;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class g1 implements a {
    public final /* synthetic */ l.e a;

    public g1(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new q0((p0) jVar, h.m3(eVar.b.b), eVar.b.h());
    }
}
