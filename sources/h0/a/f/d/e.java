package h0.a.f.d;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import h0.a.f.d.a;

/* compiled from: ActivityResultContracts */
public class e extends a<Uri, Boolean> {
    public Intent createIntent(Context context, Object obj) {
        return new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", (Uri) obj);
    }

    public /* bridge */ /* synthetic */ a.C0014a getSynchronousResult(Context context, Object obj) {
        Uri uri = (Uri) obj;
        return null;
    }

    public Object parseResult(int i, Intent intent) {
        return Boolean.valueOf(i == -1);
    }
}
