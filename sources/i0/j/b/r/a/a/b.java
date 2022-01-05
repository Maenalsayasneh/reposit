package i0.j.b.r.a.a;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import i0.j.b.o.b.i;
import java.util.concurrent.Callable;

/* compiled from: BitmapUtils */
public final class b implements Callable<i> {
    public final /* synthetic */ i c;
    public final /* synthetic */ Activity d;

    public b(i iVar, Activity activity) {
        this.c = iVar;
        this.d = activity;
    }

    public Object call() throws Exception {
        Bitmap bitmap;
        i iVar = this.c;
        Activity activity = this.d;
        StringBuilder P0 = a.P0("staring capture viewHierarchy: ");
        P0.append(iVar.a);
        InstabugSDKLogger.d(BitmapUtils.TAG, P0.toString());
        View view = iVar.n;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            boolean[] zArr = new boolean[childCount];
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (viewGroup.getChildAt(i).getVisibility() == 0) {
                    zArr[i] = true;
                    viewGroup.getChildAt(i).setVisibility(4);
                } else {
                    zArr[i] = false;
                }
            }
            bitmap = i0.h.a.b.c.m.b.m(iVar, activity);
            ViewGroup viewGroup2 = (ViewGroup) iVar.n;
            for (int i2 = 0; i2 < childCount; i2++) {
                if (zArr[i2]) {
                    viewGroup2.getChildAt(i2).setVisibility(0);
                }
            }
        } else {
            bitmap = i0.h.a.b.c.m.b.m(iVar, activity);
        }
        iVar.j = bitmap;
        StringBuilder P02 = a.P0("capture viewHierarchy done successfully: ");
        P02.append(iVar.a);
        InstabugSDKLogger.d(BitmapUtils.TAG, P02.toString());
        return iVar;
    }
}
