package h0.a.f.d;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;

/* compiled from: ActivityResultContracts */
public final class d extends a<Intent, ActivityResult> {
    public Intent createIntent(Context context, Object obj) {
        return (Intent) obj;
    }

    public Object parseResult(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
