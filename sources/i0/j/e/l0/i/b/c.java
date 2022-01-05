package i0.j.e.l0.i.b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import com.instabug.library.R;
import i0.j.e.c1.b;

/* compiled from: MuteFloatingActionButton */
public class c extends b {
    public boolean f2;

    /* compiled from: MuteFloatingActionButton */
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
            if (c.this.f2) {
                paint.setColor(-65536);
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                paint.setStrokeWidth(this.c);
                float f = this.d;
                canvas.drawCircle(f, f, this.q / 2.0f, paint);
                return;
            }
            paint.setColor(-16777216);
            paint.setStrokeWidth(this.c);
            paint.setStyle(Paint.Style.STROKE);
            float f2 = this.d;
            canvas.drawCircle(f2, f2, this.q / 2.0f, paint);
            paint.setColor(-16777216);
            paint.setStrokeWidth(this.c);
            float f3 = this.c;
            float f4 = this.x;
            canvas.drawLine(0.0f, f3, f4, f4 + f3, paint);
        }
    }

    public c(Context context) {
        super(context, (AttributeSet) null);
    }

    public void c(Context context, AttributeSet attributeSet) {
        super.c(context, attributeSet);
        setSize(1);
        setId(R.id.instabug_video_mute_button);
        setText(b.b(1));
        setGravity(17);
        g();
    }

    public void g() {
        this.f2 = false;
        b();
        setTextColor(-16777216);
    }

    public Drawable getIconDrawable() {
        float d = d(R.dimen.instabug_fab_icon_size_mini);
        float d2 = d(R.dimen.instabug_fab_size_mini);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new a(d(R.dimen.instabug_fab_circle_icon_stroke), d / 2.0f, d2, d));
        shapeDrawable.getPaint().setAntiAlias(true);
        return shapeDrawable;
    }
}
