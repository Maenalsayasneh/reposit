package i0.e.b;

import com.clubhouse.android.data.models.remote.request.OnboardingState;
import com.clubhouse.android.data.network.paging.SuggestedFollowPagingSource;
import i0.e.b.l;

/* compiled from: DaggerClubhouseApplication_HiltComponents_SingletonC */
public class w2 implements SuggestedFollowPagingSource.a {
    public final /* synthetic */ l.i a;

    public w2(l.i iVar) {
        this.a = iVar;
    }

    public SuggestedFollowPagingSource a(boolean z, OnboardingState onboardingState, int i) {
        l.i iVar = this.a.f;
        return new SuggestedFollowPagingSource(z, onboardingState, i, iVar.e.J(), iVar.e.u());
    }
}
