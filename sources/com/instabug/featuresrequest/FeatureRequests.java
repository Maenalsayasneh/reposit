package com.instabug.featuresrequest;

import android.app.Activity;
import android.content.Intent;
import com.instabug.featuresrequest.ui.FeaturesRequestActivity;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.analytics.AnalyticsWrapper;
import com.instabug.library.analytics.model.Api;
import com.instabug.library.apichecker.APIChecker;
import com.instabug.library.apichecker.VoidRunnable;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import java.util.Arrays;
import java.util.Objects;

public class FeatureRequests {
    private static final String TAG = "FeatureRequests";

    public static class a implements VoidRunnable {
        public void run() {
            Activity currentActivity;
            Feature feature = Feature.FEATURE_REQUESTS;
            if (InstabugCore.isFeatureAvailable(feature)) {
                if ((InstabugCore.getFeatureState(feature) == Feature.State.ENABLED) && Instabug.isAppOnForeground() && !InstabugCore.isForegroundBusy() && (currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity()) != null) {
                    currentActivity.startActivity(new Intent(currentActivity, FeaturesRequestActivity.class));
                }
            }
            AnalyticsWrapper.getInstance().catchApiUsageAsync("FeatureRequests.show", new Api.Parameter[0]);
        }
    }

    public static class b implements VoidRunnable {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ int[] b;

        public b(boolean z, int[] iArr) {
            this.a = z;
            this.b = iArr;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("FeatureRequests.setEmailFieldRequired", i0.d.a.a.a.N("isEmailFieldRequired").setType(Boolean.TYPE).setValue(Boolean.valueOf(this.a)), new Api.Parameter().setName("actions").setValue(String.class).setValue(Arrays.toString(this.b)));
            boolean z = this.a;
            int[] iArr = this.b;
            if (iArr == null || iArr.length == 0) {
                Objects.requireNonNull(i0.j.d.e.a.d());
                i0.j.d.e.b.a().b = z;
                Objects.requireNonNull(i0.j.d.e.a.d());
                i0.j.d.e.b.a().c = z;
                return;
            }
            for (int i : iArr) {
                if (i == 2) {
                    Objects.requireNonNull(i0.j.d.e.a.d());
                    i0.j.d.e.b.a().b = z;
                } else if (i == 4) {
                    Objects.requireNonNull(i0.j.d.e.a.d());
                    i0.j.d.e.b.a().c = z;
                }
            }
        }
    }

    public static class c implements VoidRunnable {
        public final /* synthetic */ Feature.State a;

        public c(Feature.State state) {
            this.a = state;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("FeatureRequests.setState", i0.d.a.a.a.O("state", Feature.State.class));
            InstabugCore.setFeatureState(Feature.FEATURE_REQUESTS, this.a);
            InvocationManager.getInstance().notifyInvocationOptionChanged();
        }
    }

    public static void setEmailFieldRequired(boolean z, int... iArr) {
        APIChecker.checkAndRun("FeatureRequests.setEmailFieldRequired", new b(z, iArr));
    }

    public static void setState(Feature.State state) {
        APIChecker.checkAndRun("FeatureRequests.setState", new c(state));
    }

    public static void show() {
        APIChecker.checkAndRun("FeatureRequests.show", new a());
    }
}
