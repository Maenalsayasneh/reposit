package h0.a.f.d;

import android.content.Context;
import android.content.Intent;
import h0.a.f.d.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ActivityResultContracts */
public final class c extends a<String[], Map<String, Boolean>> {
    public Intent createIntent(Context context, Object obj) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
    }

    public a.C0014a getSynchronousResult(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        if (strArr == null || strArr.length == 0) {
            return new a.C0014a(Collections.emptyMap());
        }
        h0.f.a aVar = new h0.f.a();
        boolean z = true;
        for (String str : strArr) {
            boolean z2 = h0.i.b.a.checkSelfPermission(context, str) == 0;
            aVar.put(str, Boolean.valueOf(z2));
            if (!z2) {
                z = false;
            }
        }
        if (z) {
            return new a.C0014a(aVar);
        }
        return null;
    }

    public Object parseResult(int i, Intent intent) {
        if (i != -1) {
            return Collections.emptyMap();
        }
        if (intent == null) {
            return Collections.emptyMap();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        int length = stringArrayExtra.length;
        for (int i2 = 0; i2 < length; i2++) {
            hashMap.put(stringArrayExtra[i2], Boolean.valueOf(intArrayExtra[i2] == 0));
        }
        return hashMap;
    }
}
