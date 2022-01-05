package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.LocusId;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import android.view.View;
import androidx.core.app.SharedElementCallback;
import h0.i.b.b;
import h0.i.i.e;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ActivityCompat extends h0.i.b.a {
    private static PermissionCompatDelegate sDelegate;

    public interface OnRequestPermissionsResultCallback {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    public interface PermissionCompatDelegate {
        boolean onActivityResult(Activity activity, int i, int i2, Intent intent);

        boolean requestPermissions(Activity activity, String[] strArr, int i);
    }

    public interface RequestPermissionsRequestCodeValidator {
        void validateRequestPermissionsRequestCode(int i);
    }

    public static class a extends SharedElementCallback {
        public final SharedElementCallback a;

        /* renamed from: androidx.core.app.ActivityCompat$a$a  reason: collision with other inner class name */
        public class C0002a implements SharedElementCallback.OnSharedElementsReadyListener {
            public final /* synthetic */ SharedElementCallback.OnSharedElementsReadyListener a;

            public C0002a(a aVar, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
                this.a = onSharedElementsReadyListener;
            }

            public void onSharedElementsReady() {
                this.a.onSharedElementsReady();
            }
        }

        public a(SharedElementCallback sharedElementCallback) {
            this.a = sharedElementCallback;
        }

        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.a.onCaptureSharedElementSnapshot(view, matrix, rectF);
        }

        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.a.onCreateSnapshotView(context, parcelable);
        }

        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.a.onMapSharedElements(list, map);
        }

        public void onRejectSharedElements(List<View> list) {
            this.a.onRejectSharedElements(list);
        }

        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.a.onSharedElementEnd(list, list2, list3);
        }

        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.a.onSharedElementStart(list, list2, list3);
        }

        public void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.a.onSharedElementsArrived(list, list2, new C0002a(this, onSharedElementsReadyListener));
        }
    }

    public static void finishAffinity(Activity activity) {
        activity.finishAffinity();
    }

    public static void finishAfterTransition(Activity activity) {
        activity.finishAfterTransition();
    }

    public static PermissionCompatDelegate getPermissionCompatDelegate() {
        return sDelegate;
    }

    public static Uri getReferrer(Activity activity) {
        return activity.getReferrer();
    }

    @Deprecated
    public static boolean invalidateOptionsMenu(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static void postponeEnterTransition(Activity activity) {
        activity.postponeEnterTransition();
    }

    public static void recreate(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else if (!h0.i.a.a.b(activity)) {
            activity.recreate();
        }
    }

    public static e requestDragAndDropPermissions(Activity activity, DragEvent dragEvent) {
        DragAndDropPermissions requestDragAndDropPermissions = activity.requestDragAndDropPermissions(dragEvent);
        if (requestDragAndDropPermissions != null) {
            return new e(requestDragAndDropPermissions);
        }
        return null;
    }

    public static void requestPermissions(Activity activity, String[] strArr, int i) {
        PermissionCompatDelegate permissionCompatDelegate = sDelegate;
        if (permissionCompatDelegate == null || !permissionCompatDelegate.requestPermissions(activity, strArr, i)) {
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (!TextUtils.isEmpty(strArr[i2])) {
                    i2++;
                } else {
                    throw new IllegalArgumentException(i0.d.a.a.a.y0(i0.d.a.a.a.P0("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
                }
            }
            if (activity instanceof RequestPermissionsRequestCodeValidator) {
                ((RequestPermissionsRequestCodeValidator) activity).validateRequestPermissionsRequestCode(i);
            }
            activity.requestPermissions(strArr, i);
        }
    }

    public static <T extends View> T requireViewById(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return activity.requireViewById(i);
        }
        T findViewById = activity.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void setEnterSharedElementCallback(Activity activity, SharedElementCallback sharedElementCallback) {
        activity.setEnterSharedElementCallback(sharedElementCallback != null ? new a(sharedElementCallback) : null);
    }

    public static void setExitSharedElementCallback(Activity activity, SharedElementCallback sharedElementCallback) {
        activity.setExitSharedElementCallback(sharedElementCallback != null ? new a(sharedElementCallback) : null);
    }

    public static void setLocusContext(Activity activity, b bVar, Bundle bundle) {
        LocusId locusId;
        if (Build.VERSION.SDK_INT >= 30) {
            if (bVar == null) {
                locusId = null;
            } else {
                locusId = bVar.b;
            }
            activity.setLocusContext(locusId, bundle);
        }
    }

    public static void setPermissionCompatDelegate(PermissionCompatDelegate permissionCompatDelegate) {
        sDelegate = permissionCompatDelegate;
    }

    public static boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    public static void startActivityForResult(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    public static void startIntentSenderForResult(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public static void startPostponedEnterTransition(Activity activity) {
        activity.startPostponedEnterTransition();
    }
}
