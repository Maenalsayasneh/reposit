package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.backchannel.chat.BackchannelChatViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.l;
import i0.e.c.c.y;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class y1 implements a {
    public final /* synthetic */ l.e a;

    public y1(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new BackchannelChatViewModel((y) jVar, eVar.b.h());
    }
}
