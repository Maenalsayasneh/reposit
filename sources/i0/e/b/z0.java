package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.ui.channels.users.ping.PingUserViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.g3.k.w0.b.f;
import i0.e.b.l;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class z0 implements a {
    public final /* synthetic */ l.e a;

    public z0(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new PingUserViewModel((f) jVar, new y0(eVar), eVar.b.h(), l.o(eVar.b));
    }
}
