package i0.e.b.a3.f;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.clubhouse.android.core.R;
import java.util.ArrayList;
import java.util.Objects;
import m0.j.g;
import m0.n.b.i;

/* compiled from: ContextUtil.kt */
public final class e {
    public static final void a(Context context, String str) {
        ActivityInfo activityInfo;
        i.e(context, "<this>");
        if (str != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 0)) {
                String str2 = resolveInfo.activityInfo.packageName;
                if (!i.a(str2, context.getPackageName())) {
                    i.d(str2, "packageName");
                    arrayList2.add(str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setPackage(str2);
                    arrayList.add(intent2);
                }
            }
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
            String str3 = null;
            if (!(resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null)) {
                str3 = activityInfo.packageName;
            }
            if (g.f(arrayList2, str3)) {
                context.startActivity(intent);
            } else if (!arrayList.isEmpty()) {
                Intent createChooser = Intent.createChooser((Intent) arrayList.remove(0), context.getString(R.string.open_prompt));
                Object[] array = arrayList.toArray(new Intent[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) array);
                context.startActivity(createChooser);
            } else {
                i.e(context, "<this>");
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            }
        }
    }

    public static final void b(Fragment fragment, String str) {
        i.e(fragment, "<this>");
        Context requireContext = fragment.requireContext();
        i.d(requireContext, "requireContext()");
        a(requireContext, str);
    }
}
