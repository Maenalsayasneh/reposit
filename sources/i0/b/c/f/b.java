package i0.b.c.f;

import android.widget.ImageView;
import m0.n.b.i;

/* compiled from: ImageViewProxy.kt */
public final class b extends a<b, ImageView> {
    public static final ImageView.ScaleType[] b = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(ImageView imageView) {
        super(imageView);
        i.e(imageView, "view");
    }
}
