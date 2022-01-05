package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.backchannel.create.BackchannelCreateChatViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.l;
import i0.e.c.e.h;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class a2 implements a {
    public final /* synthetic */ l.e a;

    public a2(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new BackchannelCreateChatViewModel((h) jVar, eVar.b.h(), new z1(eVar));
    }
}
