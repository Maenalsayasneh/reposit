package i0.j.e.l0.i.b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import com.instabug.library.R;

/* compiled from: StopFloatingActionButton */
public class d extends b {

    /* compiled from: StopFloatingActionButton */
    public class a extends Shape {
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ float q;
        public final /* synthetic */ float x;

        public a(float f, float f2, float f3, float f4) {
            this.c = f;
            this.d = f2;
            this.q = f3;
            this.x = f4;
        }

        public void draw(Canvas canvas, Paint paint) {
            if (d.this.isEnabled()) {
                paint.setColor(-65536);
            } else {
                paint.setColor(Color.parseColor("#D1D1D6"));
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.c);
            float f = this.d;
            canvas.drawCircle(f, f, this.q / 2.0f, paint);
            paint.setStyle(Paint.Style.FILL);
            float f2 = this.x;
            RectF rectF = new RectF(0.0f, 0.0f, f2, f2);
            float f3 = this.c / 2.0f;
            rectF.inset(f3, f3);
            canvas.drawRoundRect(rectF, 4.0f, 4.0f, paint);
        }
    }

    public d(Context context) {
        super(context, (AttributeSet) null);
    }

    public void c(Context context, AttributeSet attributeSet) {
        super.c(context, attributeSet);
        setSize(1);
        setId(R.id.instabug_video_stop_button);
    }

    public Drawable getIconDrawable() {
        float d = d(R.dimen.instabug_fab_icon_size_mini);
        float d2 = d(R.dimen.instabug_fab_size_mini);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new a(d(R.dimen.instabug_fab_circle_icon_stroke), d / 2.0f, d2, d));
        shapeDrawable.getPaint().setAntiAlias(true);
        return shapeDrawable;
    }
}
