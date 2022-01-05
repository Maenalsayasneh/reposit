package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.ui.profile.settings.SettingsViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.g3.u.z5.d1;
import i0.e.b.l;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class e0 implements a {
    public final /* synthetic */ l.e a;

    public e0(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new SettingsViewModel((d1) jVar, eVar.b.K(), eVar.b.u(), l.o(eVar.b), eVar.b.L(), eVar.b.h());
    }
}
