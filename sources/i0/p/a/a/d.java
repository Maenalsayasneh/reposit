package i0.p.a.a;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import com.theartofdev.edmodo.cropper.CropOverlayView;
import i0.d.a.a.a;

/* compiled from: CropImageAnimation */
public final class d extends Animation implements Animation.AnimationListener {
    public final RectF Y1 = new RectF();
    public final float[] Z1 = new float[9];
    public final float[] a2 = new float[9];
    public final RectF b2 = new RectF();
    public final ImageView c;
    public final float[] c2 = new float[8];
    public final CropOverlayView d;
    public final float[] d2 = new float[9];
    public final float[] q = new float[8];
    public final float[] x = new float[8];
    public final RectF y = new RectF();

    public d(ImageView imageView, CropOverlayView cropOverlayView) {
        this.c = imageView;
        this.d = cropOverlayView;
        setDuration(300);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    public void applyTransformation(float f, Transformation transformation) {
        float[] fArr;
        RectF rectF = this.b2;
        RectF rectF2 = this.y;
        float f2 = rectF2.left;
        RectF rectF3 = this.Y1;
        rectF.left = a.a(rectF3.left, f2, f, f2);
        float f3 = rectF2.top;
        rectF.top = a.a(rectF3.top, f3, f, f3);
        float f4 = rectF2.right;
        rectF.right = a.a(rectF3.right, f4, f, f4);
        float f5 = rectF2.bottom;
        rectF.bottom = a.a(rectF3.bottom, f5, f, f5);
        this.d.setCropWindowRect(rectF);
        int i = 0;
        int i2 = 0;
        while (true) {
            fArr = this.c2;
            if (i2 >= fArr.length) {
                break;
            }
            float[] fArr2 = this.q;
            fArr[i2] = a.a(this.x[i2], fArr2[i2], f, fArr2[i2]);
            i2++;
        }
        this.d.i(fArr, this.c.getWidth(), this.c.getHeight());
        while (true) {
            float[] fArr3 = this.d2;
            if (i < fArr3.length) {
                float[] fArr4 = this.Z1;
                fArr3[i] = a.a(this.a2[i], fArr4[i], f, fArr4[i]);
                i++;
            } else {
                Matrix imageMatrix = this.c.getImageMatrix();
                imageMatrix.setValues(this.d2);
                this.c.setImageMatrix(imageMatrix);
                this.c.invalidate();
                this.d.invalidate();
                return;
            }
        }
    }

    public void onAnimationEnd(Animation animation) {
        this.c.clearAnimation();
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
