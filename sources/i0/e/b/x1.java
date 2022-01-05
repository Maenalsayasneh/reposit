package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.backchannel.inbox.BackchannelInboxViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.l;
import i0.e.c.h.k;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class x1 implements a {
    public final /* synthetic */ l.e a;

    public x1(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new BackchannelInboxViewModel((k) jVar, eVar.b.h());
    }
}
