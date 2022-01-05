package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.g3.u.y5.x0;
import i0.e.b.g3.u.y5.y0;
import i0.e.b.l;
import i0.j.f.p.h;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class i1 implements a {
    public final /* synthetic */ l.e a;

    public i1(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new y0((x0) jVar, h.m3(eVar.b.b), eVar.b.h());
    }
}
