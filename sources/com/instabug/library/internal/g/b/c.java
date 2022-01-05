package com.instabug.library.internal.g.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import com.instabug.library.R;
import h0.i.b.d.h;

/* compiled from: RecordingFloatingActionButton */
public class c extends i0.j.e.l0.i.b.b {
    public b f2;
    public Paint g2;
    public String h2;
    public float i2;

    /* compiled from: RecordingFloatingActionButton */
    public class a extends Shape {
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ float q;

        public a(float f, float f2, float f3) {
            this.c = f;
            this.d = f2;
            this.q = f3;
        }

        public void draw(Canvas canvas, Paint paint) {
            paint.setColor(-65536);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            paint.setStrokeWidth(this.c);
            float f = this.d;
            canvas.drawCircle(f, f, this.q / 2.0f, paint);
            c cVar = c.this;
            if (cVar.f2 == b.RECORDING) {
                cVar.g((String) null, false);
            } else {
                cVar.g("", false);
            }
        }
    }

    /* compiled from: RecordingFloatingActionButton */
    public enum b {
        RECORDING,
        STOPPED
    }

    public c(Context context) {
        super(context, (AttributeSet) null);
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void c(Context context, AttributeSet attributeSet) {
        super.c(context, attributeSet);
        Paint paint = new Paint(1);
        this.g2 = paint;
        paint.setColor(-1);
        this.g2.setTextAlign(Paint.Align.CENTER);
        this.g2.setTextSize(context.getResources().getDimension(R.dimen.instabug_fab_text_size));
        this.i2 = d(R.dimen.instabug_fab_circle_icon_stroke);
        setTypeface(h.a(context, R.font.ibg_video_icon));
        super.setText("");
        setTextColor(-1);
        setGravity(17);
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void g(String str, boolean z) {
        if (z) {
            this.h2 = str;
            invalidate();
            return;
        }
        super.setText(str);
    }

    public Drawable getIconDrawable() {
        float f;
        float f3;
        if (getSize() == 0) {
            f3 = d(R.dimen.instabug_fab_size_normal);
            f = d(R.dimen.instabug_fab_icon_size_normal);
        } else {
            f3 = d(R.dimen.instabug_fab_size_mini);
            f = d(R.dimen.instabug_fab_icon_size_mini);
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new a(d(R.dimen.instabug_fab_circle_icon_stroke), f / 2.0f, f3));
        shapeDrawable.getPaint().setAntiAlias(true);
        return shapeDrawable;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h2 != null && this.g2 != null) {
            canvas.drawText(this.h2, (float) (canvas.getWidth() / 2), (float) ((int) (((((float) canvas.getHeight()) / 2.0f) - ((this.g2.ascent() + this.g2.descent()) / 2.0f)) - this.i2)), this.g2);
        }
    }

    public void setRecordingState(b bVar) {
        this.f2 = bVar;
        b();
    }
}
