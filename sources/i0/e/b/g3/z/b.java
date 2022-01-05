package i0.e.b.g3.z;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.d.a.a.a;
import i0.o.a.z;
import m0.n.b.i;

/* compiled from: PicassoUtil.kt */
public final class b implements z {
    public final Float a;
    public final float b;

    public b(Float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public Bitmap a(Bitmap bitmap) {
        i.e(bitmap, Stripe3ds2AuthParams.FIELD_SOURCE);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f = this.b;
        float width = ((float) bitmap.getWidth()) - this.b;
        float height = ((float) bitmap.getHeight()) - this.b;
        Float f2 = this.a;
        float width2 = f2 == null ? ((float) bitmap.getWidth()) / ((float) 2) : f2.floatValue();
        Float f3 = this.a;
        canvas.drawRoundRect(f, f, width, height, width2, f3 == null ? ((float) bitmap.getHeight()) / ((float) 2) : f3.floatValue(), paint);
        if (!i.a(bitmap, createBitmap)) {
            bitmap.recycle();
        }
        i.d(createBitmap, "output");
        return createBitmap;
    }

    public String b() {
        StringBuilder P0 = a.P0("rounded(radius=");
        P0.append(this.a);
        P0.append(", margin=");
        P0.append(this.b);
        P0.append(')');
        return P0.toString();
    }
}
