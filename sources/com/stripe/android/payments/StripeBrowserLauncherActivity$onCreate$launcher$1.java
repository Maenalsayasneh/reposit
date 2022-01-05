package com.stripe.android.payments;

import androidx.activity.result.ActivityResult;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import m0.i;
import m0.n.a.l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/activity/result/ActivityResult;", "p1", "Lm0/i;", "invoke", "(Landroidx/activity/result/ActivityResult;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeBrowserLauncherActivity.kt */
public final /* synthetic */ class StripeBrowserLauncherActivity$onCreate$launcher$1 extends FunctionReferenceImpl implements l<ActivityResult, i> {
    public StripeBrowserLauncherActivity$onCreate$launcher$1(StripeBrowserLauncherActivity stripeBrowserLauncherActivity) {
        super(1, stripeBrowserLauncherActivity, StripeBrowserLauncherActivity.class, "onResult", "onResult(Landroidx/activity/result/ActivityResult;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ActivityResult) obj);
        return i.a;
    }

    public final void invoke(ActivityResult activityResult) {
        m0.n.b.i.e(activityResult, "p1");
        ((StripeBrowserLauncherActivity) this.receiver).onResult(activityResult);
    }
}
