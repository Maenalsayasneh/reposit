package h0.a.f.d;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import h0.a.f.d.a;

/* compiled from: ActivityResultContracts */
public class b extends a<String, Uri> {
    public Intent createIntent(Context context, Object obj) {
        return new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType((String) obj);
    }

    public /* bridge */ /* synthetic */ a.C0014a getSynchronousResult(Context context, Object obj) {
        String str = (String) obj;
        return null;
    }

    public Object parseResult(int i, Intent intent) {
        if (intent == null || i != -1) {
            return null;
        }
        return intent.getData();
    }
}
