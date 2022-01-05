package i0.h.a.d.a.h;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.b;
import i0.h.a.d.a.j.m;
import i0.h.a.d.a.j.p;

public final class a {
    public final e a;
    public final Handler b = new Handler(Looper.getMainLooper());

    public a(e eVar) {
        this.a = eVar;
    }

    @NonNull
    public final p<Void> a(@NonNull Activity activity, @NonNull ReviewInfo reviewInfo) {
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        m mVar = new m();
        intent.putExtra("result_receiver", new b(this.b, mVar));
        activity.startActivity(intent);
        return mVar.a;
    }

    @NonNull
    public final p<ReviewInfo> b() {
        e eVar = this.a;
        e.a.b(4, "requestInAppReview (%s)", new Object[]{eVar.c});
        m mVar = new m();
        eVar.b.a(new c(eVar, mVar, mVar));
        return mVar.a;
    }
}
