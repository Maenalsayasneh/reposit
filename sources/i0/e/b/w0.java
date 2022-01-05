package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.ui.channels.users.search.SearchInRoomViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.g3.k.w0.d.d;
import i0.e.b.l;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class w0 implements a {
    public final /* synthetic */ l.e a;

    public w0(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new SearchInRoomViewModel((d) jVar, eVar.b());
    }
}
