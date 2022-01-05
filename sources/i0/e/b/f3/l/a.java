package i0.e.b.f3.l;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.shared.review.ReviewCoordinator;
import com.google.android.play.core.review.ReviewInfo;
import i0.h.a.d.a.j.p;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class a implements i0.h.a.d.a.j.a {
    public final /* synthetic */ ReviewCoordinator a;

    public /* synthetic */ a(ReviewCoordinator reviewCoordinator) {
        this.a = reviewCoordinator;
    }

    public final void a(p pVar) {
        ReviewCoordinator reviewCoordinator = this.a;
        i.e(reviewCoordinator, "this$0");
        i.e(pVar, "task");
        if (pVar.i()) {
            Object h = pVar.h();
            i.d(h, "task.result");
            p<Void> a2 = reviewCoordinator.e.a(reviewCoordinator.a, (ReviewInfo) h);
            i.d(a2, "manager.launchReviewFlow(activity, reviewInfo)");
            a2.b(new b(reviewCoordinator));
            return;
        }
        ((AmplitudeAnalytics) reviewCoordinator.d).a("AppReviewPrompt-Error");
        v0.a.a.d.w(pVar.g(), "Error in Prompting For Review", new Object[0]);
    }
}
