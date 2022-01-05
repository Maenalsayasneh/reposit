package h0.i.a;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import androidx.core.app.RemoteInput;
import androidx.core.graphics.drawable.IconCompat;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: NotificationCompatJellybean */
public class d {
    public static final Object a = new Object();
    public static final Object b = new Object();

    public static RemoteInput[] a(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[bundleArr.length];
        for (int i = 0; i < bundleArr.length; i++) {
            Bundle bundle = bundleArr[i];
            ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
            HashSet hashSet = new HashSet();
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next());
                }
            }
            remoteInputArr[i] = new RemoteInput(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle(NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE), hashSet);
        }
        return remoteInputArr;
    }

    public static NotificationCompat.Action b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE);
        boolean z = false;
        if (bundle2 != null) {
            z = bundle2.getBoolean("android.support.allowGeneratedReplies", false);
        }
        return new NotificationCompat.Action(bundle.getInt("icon"), bundle.getCharSequence(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE), (PendingIntent) bundle.getParcelable("actionIntent"), bundle.getBundle(NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE), a(c(bundle, "remoteInputs")), a(c(bundle, "dataOnlyRemoteInputs")), z, bundle.getInt("semanticAction"), bundle.getBoolean("showsUserInterface"), false);
    }

    public static Bundle[] c(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    public static Bundle d(NotificationCompat.Action action) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat iconCompat = action.getIconCompat();
        bundle2.putInt("icon", iconCompat != null ? iconCompat.d() : 0);
        bundle2.putCharSequence(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, action.getTitle());
        bundle2.putParcelable("actionIntent", action.getActionIntent());
        if (action.getExtras() != null) {
            bundle = new Bundle(action.getExtras());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
        bundle2.putBundle(NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE, bundle);
        bundle2.putParcelableArray("remoteInputs", e(action.getRemoteInputs()));
        bundle2.putBoolean("showsUserInterface", action.getShowsUserInterface());
        bundle2.putInt("semanticAction", action.getSemanticAction());
        return bundle2;
    }

    public static Bundle[] e(RemoteInput[] remoteInputArr) {
        if (remoteInputArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[remoteInputArr.length];
        for (int i = 0; i < remoteInputArr.length; i++) {
            RemoteInput remoteInput = remoteInputArr[i];
            Bundle bundle = new Bundle();
            bundle.putString("resultKey", remoteInput.getResultKey());
            bundle.putCharSequence("label", remoteInput.getLabel());
            bundle.putCharSequenceArray("choices", remoteInput.getChoices());
            bundle.putBoolean("allowFreeFormInput", remoteInput.getAllowFreeFormInput());
            bundle.putBundle(NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE, remoteInput.getExtras());
            Set<String> allowedDataTypes = remoteInput.getAllowedDataTypes();
            if (allowedDataTypes != null && !allowedDataTypes.isEmpty()) {
                ArrayList arrayList = new ArrayList(allowedDataTypes.size());
                for (String add : allowedDataTypes) {
                    arrayList.add(add);
                }
                bundle.putStringArrayList("allowedDataTypes", arrayList);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }
}
