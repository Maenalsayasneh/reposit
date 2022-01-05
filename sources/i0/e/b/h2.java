package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.g3.r.i0;
import i0.e.b.g3.r.j0;
import i0.e.b.l;
import i0.j.f.p.h;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class h2 implements a {
    public final /* synthetic */ l.e a;

    public h2(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new j0((i0) jVar, l.q(eVar.b), h.m3(eVar.b.b), eVar.b.u());
    }
}
