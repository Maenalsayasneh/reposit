package i0.j.e.f1.p;

import android.view.View;
import k0.b.y.f;

/* compiled from: Functions */
public final class c implements f<View> {
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public c(float f, float f2) {
        this.c = f;
        this.d = f2;
    }

    public boolean test(Object obj) throws Exception {
        View view = (View) obj;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int width = view.getWidth() + iArr[0];
        int height = view.getHeight() + iArr[1];
        float f = this.c;
        if (f < ((float) i) || f >= ((float) width)) {
            return false;
        }
        float f2 = this.d;
        if (f2 < ((float) i2) || f2 >= ((float) height)) {
            return false;
        }
        return true;
    }
}
