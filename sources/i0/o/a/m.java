package i0.o.a;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/* compiled from: ImageViewAction */
public class m extends a<ImageView> {
    public e m;

    public m(Picasso picasso, ImageView imageView, t tVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, e eVar, boolean z) {
        super(picasso, imageView, tVar, i, i2, i3, (Drawable) null, str, (Object) null, z);
        this.m = eVar;
    }

    public void a() {
        this.l = true;
        if (this.m != null) {
            this.m = null;
        }
    }

    public void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        ImageView imageView = (ImageView) this.c.get();
        if (imageView != null) {
            Picasso picasso = this.a;
            Bitmap bitmap2 = bitmap;
            Picasso.LoadedFrom loadedFrom2 = loadedFrom;
            r.b(imageView, picasso.g, bitmap2, loadedFrom2, this.d, picasso.o);
            e eVar = this.m;
            if (eVar != null) {
                eVar.a();
            }
        }
    }

    public void c(Exception exc) {
        ImageView imageView = (ImageView) this.c.get();
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).stop();
            }
            int i = this.g;
            if (i != 0) {
                imageView.setImageResource(i);
            } else {
                Drawable drawable2 = this.h;
                if (drawable2 != null) {
                    imageView.setImageDrawable(drawable2);
                }
            }
            e eVar = this.m;
            if (eVar != null) {
                eVar.onError(exc);
            }
        }
    }
}
