package i0.e.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.ui.payments.GetRecentPaymentsState;
import com.clubhouse.android.ui.payments.RecentPaymentsViewModel;
import i0.b.b.j;
import i0.e.b.a3.a.a;
import i0.e.b.l;
import java.util.Objects;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class l0 implements a {
    public final /* synthetic */ l.e a;

    public l0(l.e eVar) {
        this.a = eVar;
    }

    public MavericksViewModel c(j jVar) {
        l.e eVar = this.a.c;
        Objects.requireNonNull(eVar);
        return new RecentPaymentsViewModel((GetRecentPaymentsState) jVar, eVar.b.h(), l.o(eVar.b));
    }
}
