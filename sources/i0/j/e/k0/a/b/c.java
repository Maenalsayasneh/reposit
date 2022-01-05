package i0.j.e.k0.a.b;

import android.app.Activity;
import android.graphics.Bitmap;
import android.util.Pair;
import android.view.View;
import java.util.HashMap;
import k0.b.y.e;

/* compiled from: PixelCopyDelegate */
public final class c implements e<Bitmap, Pair<Bitmap, HashMap<View, Integer>>> {
    public final /* synthetic */ Activity c;
    public final /* synthetic */ int[] d;

    public c(Activity activity, int[] iArr) {
        this.c = activity;
        this.d = iArr;
    }

    public Object apply(Object obj) throws Exception {
        Bitmap bitmap = (Bitmap) obj;
        Activity activity = this.c;
        int[] iArr = this.d;
        HashMap hashMap = new HashMap();
        if (!(activity == null || iArr == null)) {
            for (int findViewById : iArr) {
                View findViewById2 = activity.findViewById(findViewById);
                if (findViewById2 != null) {
                    hashMap.put(findViewById2, Integer.valueOf(findViewById2.getVisibility()));
                    findViewById2.setVisibility(8);
                }
            }
        }
        return new Pair(bitmap, hashMap);
    }
}
