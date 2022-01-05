package g0.c;

import android.widget.ImageView;
import com.airbnb.paris.R;
import i0.b.c.b;
import i0.b.c.g.e;
import i0.b.c.h.c;

/* compiled from: ImageViewStyleApplier */
public final class a extends b<i0.b.c.f.b, ImageView> {
    public a(ImageView imageView) {
        super(new i0.b.c.f.b(imageView));
    }

    public void b(e eVar) {
        g0.b.b bVar = new g0.b.b(this.c);
        bVar.a = this.a;
        bVar.a(eVar);
    }

    public int[] c() {
        return R.styleable.Paris_ImageView;
    }

    public void d(e eVar, c cVar) {
        ImageView.ScaleType scaleType;
        ((ImageView) this.c).getContext().getResources();
        int i = R.styleable.Paris_ImageView_android_scaleType;
        if (cVar.l(i)) {
            int h = cVar.h(i);
            ImageView imageView = (ImageView) ((i0.b.c.f.b) this.b).a;
            ImageView.ScaleType[] scaleTypeArr = i0.b.c.f.b.b;
            int length = scaleTypeArr.length;
            if (h >= 0 && length > h) {
                scaleType = scaleTypeArr[h];
            } else {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            imageView.setScaleType(scaleType);
        }
        int i2 = R.styleable.Paris_ImageView_android_tint;
        if (cVar.l(i2)) {
            ((ImageView) ((i0.b.c.f.b) this.b).a).setImageTintList(cVar.b(i2));
        }
        int i3 = R.styleable.Paris_ImageView_android_src;
        if (cVar.l(i3)) {
            ((ImageView) ((i0.b.c.f.b) this.b).a).setImageDrawable(cVar.d(i3));
        }
    }

    public void e(e eVar, c cVar) {
        ((ImageView) this.c).getContext().getResources();
    }
}
