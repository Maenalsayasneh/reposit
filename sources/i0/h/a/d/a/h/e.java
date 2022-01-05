package i0.h.a.d.a.h;

import android.content.Context;
import android.content.Intent;
import i0.h.a.d.a.e.c;
import i0.h.a.d.a.e.f;
import i0.h.a.d.a.e.p;

public final class e {
    public static final f a = new f("ReviewService");
    public final p<c> b;
    public final String c;

    public e(Context context) {
        this.c = context.getPackageName();
        Context context2 = context;
        this.b = new p(context2, a, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), b.a);
    }
}
