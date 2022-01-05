package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.ui.channels.users.follow.FollowSpeakersViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.g3.k.w0.a.e;
import i0.e.b.l;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class x0 implements a {
    public final /* synthetic */ l.e a;

    public x0(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new FollowSpeakersViewModel((e) jVar, eVar.b.K(), eVar.d(), eVar.b());
    }
}
