package i0.e.b;

import com.clubhouse.android.data.models.remote.request.OnboardingState;
import com.clubhouse.android.data.network.paging.SuggestedFollowPagingSource;
import i0.e.b.l;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class q implements SuggestedFollowPagingSource.a {
    public final /* synthetic */ l.e a;

    public q(l.e eVar) {
        this.a = eVar;
    }

    public SuggestedFollowPagingSource a(boolean z, OnboardingState onboardingState, int i) {
        l.e eVar = this.a.c;
        return new SuggestedFollowPagingSource(z, onboardingState, i, eVar.b.J(), eVar.b.u());
    }
}
