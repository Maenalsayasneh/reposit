package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import h0.i.h.b;

public class ActivityOptionsCompat {
    public static final String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
    public static final String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";

    public static class a extends ActivityOptionsCompat {
        public final ActivityOptions a;

        public a(ActivityOptions activityOptions) {
            this.a = activityOptions;
        }

        public Rect getLaunchBounds() {
            return this.a.getLaunchBounds();
        }

        public void requestUsageTimeReport(PendingIntent pendingIntent) {
            this.a.requestUsageTimeReport(pendingIntent);
        }

        public ActivityOptionsCompat setLaunchBounds(Rect rect) {
            return new a(this.a.setLaunchBounds(rect));
        }

        public Bundle toBundle() {
            return this.a.toBundle();
        }

        public void update(ActivityOptionsCompat activityOptionsCompat) {
            if (activityOptionsCompat instanceof a) {
                this.a.update(((a) activityOptionsCompat).a);
            }
        }
    }

    public static ActivityOptionsCompat makeBasic() {
        return new a(ActivityOptions.makeBasic());
    }

    public static ActivityOptionsCompat makeClipRevealAnimation(View view, int i, int i2, int i3, int i4) {
        return new a(ActivityOptions.makeClipRevealAnimation(view, i, i2, i3, i4));
    }

    public static ActivityOptionsCompat makeCustomAnimation(Context context, int i, int i2) {
        return new a(ActivityOptions.makeCustomAnimation(context, i, i2));
    }

    public static ActivityOptionsCompat makeScaleUpAnimation(View view, int i, int i2, int i3, int i4) {
        return new a(ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4));
    }

    public static ActivityOptionsCompat makeSceneTransitionAnimation(Activity activity, View view, String str) {
        return new a(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
    }

    public static ActivityOptionsCompat makeTaskLaunchBehind() {
        return new a(ActivityOptions.makeTaskLaunchBehind());
    }

    public static ActivityOptionsCompat makeThumbnailScaleUpAnimation(View view, Bitmap bitmap, int i, int i2) {
        return new a(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2));
    }

    public Rect getLaunchBounds() {
        return null;
    }

    public void requestUsageTimeReport(PendingIntent pendingIntent) {
    }

    public ActivityOptionsCompat setLaunchBounds(Rect rect) {
        return this;
    }

    public Bundle toBundle() {
        return null;
    }

    public void update(ActivityOptionsCompat activityOptionsCompat) {
    }

    public static ActivityOptionsCompat makeSceneTransitionAnimation(Activity activity, b<View, String>... bVarArr) {
        Pair[] pairArr = null;
        if (bVarArr != null) {
            pairArr = new Pair[bVarArr.length];
            for (int i = 0; i < bVarArr.length; i++) {
                pairArr[i] = Pair.create((View) bVarArr[i].a, (String) bVarArr[i].b);
            }
        }
        return new a(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }
}
