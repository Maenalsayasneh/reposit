package i0.e.b.f3.l;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.shared.preferences.Key;
import com.clubhouse.android.shared.review.ReviewCoordinator;
import i0.h.a.d.a.j.a;
import i0.h.a.d.a.j.p;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class b implements a {
    public final /* synthetic */ ReviewCoordinator a;

    public /* synthetic */ b(ReviewCoordinator reviewCoordinator) {
        this.a = reviewCoordinator;
    }

    public final void a(p pVar) {
        ReviewCoordinator reviewCoordinator = this.a;
        i.e(reviewCoordinator, "this$0");
        i.e(pVar, "it");
        ((AmplitudeAnalytics) reviewCoordinator.d).a("AppReviewPrompt-Requested");
        i0.e.b.f3.k.b bVar = reviewCoordinator.b;
        Objects.requireNonNull(bVar);
        bVar.g(Key.HAVE_PROMPTED_FOR_REVIEW, true);
    }
}
