package i0.j.b.t.j.a;

import android.graphics.Bitmap;
import com.instabug.library.visualusersteps.VisualUserStepsHelper;
import java.util.concurrent.Callable;

/* compiled from: VisualUserStepPreviewPresenter */
public class d implements Callable<Bitmap> {
    public final /* synthetic */ String c;

    public d(String str) {
        this.c = str;
    }

    public Object call() throws Exception {
        return VisualUserStepsHelper.decryptBitmap(this.c);
    }
}
