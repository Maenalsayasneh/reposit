package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.theartofdev.edmodo.cropper.CropOverlayView;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.UUID;

public class CropImageView extends FrameLayout {
    public static final /* synthetic */ int c = 0;
    public RectF A2;
    public int B2;
    public boolean C2;
    public Uri D2;
    public WeakReference<i0.p.a.a.b> E2;
    public WeakReference<i0.p.a.a.a> F2;
    public final ProgressBar Y1;
    public final float[] Z1 = new float[8];
    public final float[] a2 = new float[8];
    public i0.p.a.a.d b2;
    public Bitmap c2;
    public final ImageView d;
    public int d2;
    public int e2;
    public boolean f2;
    public boolean g2;
    public int h2;
    public int i2;
    public int j2;
    public ScaleType k2;
    public boolean l2 = false;
    public boolean m2 = true;
    public boolean n2 = true;
    public boolean o2 = true;
    public int p2;
    public final CropOverlayView q;
    public e q2;
    public d r2;
    public f s2;
    public g t2;
    public c u2;
    public Uri v2;
    public int w2 = 1;
    public final Matrix x = new Matrix();
    public float x2 = 1.0f;
    public final Matrix y = new Matrix();
    public float y2;
    public float z2;

    public enum CropShape {
        RECTANGLE,
        OVAL
    }

    public enum Guidelines {
        OFF,
        ON_TOUCH,
        ON
    }

    public enum RequestSizeOptions {
        NONE,
        SAMPLING,
        RESIZE_INSIDE,
        RESIZE_FIT,
        RESIZE_EXACT
    }

    public enum ScaleType {
        FIT_CENTER,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE
    }

    public class a implements CropOverlayView.b {
        public a() {
        }
    }

    public static class b {
        public final Rect Y1;
        public final int Z1;
        public final int a2;
        public final Uri c;
        public final Uri d;
        public final Exception q;
        public final float[] x;
        public final Rect y;

        public b(Bitmap bitmap, Uri uri, Bitmap bitmap2, Uri uri2, Exception exc, float[] fArr, Rect rect, Rect rect2, int i, int i2) {
            this.c = uri;
            this.d = uri2;
            this.q = exc;
            this.x = fArr;
            this.y = rect;
            this.Y1 = rect2;
            this.Z1 = i;
            this.a2 = i2;
        }
    }

    public interface c {
    }

    public interface d {
        void a(Rect rect);
    }

    public interface e {
        void a(Rect rect);
    }

    public interface f {
        void a();
    }

    public interface g {
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CropImageView(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            r7.<init>(r8, r9)
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r7.x = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r7.y = r0
            r0 = 8
            float[] r1 = new float[r0]
            r7.Z1 = r1
            float[] r0 = new float[r0]
            r7.a2 = r0
            r0 = 0
            r7.l2 = r0
            r1 = 1
            r7.m2 = r1
            r7.n2 = r1
            r7.o2 = r1
            r7.w2 = r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r7.x2 = r2
            boolean r2 = r8 instanceof android.app.Activity
            r3 = 0
            if (r2 == 0) goto L_0x0038
            r2 = r8
            android.app.Activity r2 = (android.app.Activity) r2
            android.content.Intent r2 = r2.getIntent()
            goto L_0x0039
        L_0x0038:
            r2 = r3
        L_0x0039:
            if (r2 == 0) goto L_0x004c
            java.lang.String r4 = "CROP_IMAGE_EXTRA_BUNDLE"
            android.os.Bundle r2 = r2.getBundleExtra(r4)
            if (r2 == 0) goto L_0x004c
            java.lang.String r3 = "CROP_IMAGE_EXTRA_OPTIONS"
            android.os.Parcelable r2 = r2.getParcelable(r3)
            r3 = r2
            com.theartofdev.edmodo.cropper.CropImageOptions r3 = (com.theartofdev.edmodo.cropper.CropImageOptions) r3
        L_0x004c:
            if (r3 != 0) goto L_0x01e8
            com.theartofdev.edmodo.cropper.CropImageOptions r3 = new com.theartofdev.edmodo.cropper.CropImageOptions
            r3.<init>()
            if (r9 == 0) goto L_0x01e8
            int[] r2 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView
            android.content.res.TypedArray r9 = r8.obtainStyledAttributes(r9, r2, r0, r0)
            int r0 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropFixAspectRatio     // Catch:{ all -> 0x01e3 }
            boolean r2 = r3.e2     // Catch:{ all -> 0x01e3 }
            boolean r2 = r9.getBoolean(r0, r2)     // Catch:{ all -> 0x01e3 }
            r3.e2 = r2     // Catch:{ all -> 0x01e3 }
            int r2 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropAspectRatioX     // Catch:{ all -> 0x01e3 }
            int r4 = r3.f2     // Catch:{ all -> 0x01e3 }
            int r4 = r9.getInteger(r2, r4)     // Catch:{ all -> 0x01e3 }
            r3.f2 = r4     // Catch:{ all -> 0x01e3 }
            int r4 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropAspectRatioY     // Catch:{ all -> 0x01e3 }
            int r5 = r3.g2     // Catch:{ all -> 0x01e3 }
            int r4 = r9.getInteger(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.g2 = r4     // Catch:{ all -> 0x01e3 }
            com.theartofdev.edmodo.cropper.CropImageView$ScaleType[] r4 = com.theartofdev.edmodo.cropper.CropImageView.ScaleType.values()     // Catch:{ all -> 0x01e3 }
            int r5 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropScaleType     // Catch:{ all -> 0x01e3 }
            com.theartofdev.edmodo.cropper.CropImageView$ScaleType r6 = r3.y     // Catch:{ all -> 0x01e3 }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x01e3 }
            int r5 = r9.getInt(r5, r6)     // Catch:{ all -> 0x01e3 }
            r4 = r4[r5]     // Catch:{ all -> 0x01e3 }
            r3.y = r4     // Catch:{ all -> 0x01e3 }
            int r4 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropAutoZoomEnabled     // Catch:{ all -> 0x01e3 }
            boolean r5 = r3.a2     // Catch:{ all -> 0x01e3 }
            boolean r4 = r9.getBoolean(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.a2 = r4     // Catch:{ all -> 0x01e3 }
            int r4 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropMultiTouchEnabled     // Catch:{ all -> 0x01e3 }
            boolean r5 = r3.b2     // Catch:{ all -> 0x01e3 }
            boolean r4 = r9.getBoolean(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.b2 = r4     // Catch:{ all -> 0x01e3 }
            int r4 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropMaxZoom     // Catch:{ all -> 0x01e3 }
            int r5 = r3.c2     // Catch:{ all -> 0x01e3 }
            int r4 = r9.getInteger(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.c2 = r4     // Catch:{ all -> 0x01e3 }
            com.theartofdev.edmodo.cropper.CropImageView$CropShape[] r4 = com.theartofdev.edmodo.cropper.CropImageView.CropShape.values()     // Catch:{ all -> 0x01e3 }
            int r5 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropShape     // Catch:{ all -> 0x01e3 }
            com.theartofdev.edmodo.cropper.CropImageView$CropShape r6 = r3.c     // Catch:{ all -> 0x01e3 }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x01e3 }
            int r5 = r9.getInt(r5, r6)     // Catch:{ all -> 0x01e3 }
            r4 = r4[r5]     // Catch:{ all -> 0x01e3 }
            r3.c = r4     // Catch:{ all -> 0x01e3 }
            com.theartofdev.edmodo.cropper.CropImageView$Guidelines[] r4 = com.theartofdev.edmodo.cropper.CropImageView.Guidelines.values()     // Catch:{ all -> 0x01e3 }
            int r5 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropGuidelines     // Catch:{ all -> 0x01e3 }
            com.theartofdev.edmodo.cropper.CropImageView$Guidelines r6 = r3.x     // Catch:{ all -> 0x01e3 }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x01e3 }
            int r5 = r9.getInt(r5, r6)     // Catch:{ all -> 0x01e3 }
            r4 = r4[r5]     // Catch:{ all -> 0x01e3 }
            r3.x = r4     // Catch:{ all -> 0x01e3 }
            int r4 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropSnapRadius     // Catch:{ all -> 0x01e3 }
            float r5 = r3.d     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getDimension(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.d = r4     // Catch:{ all -> 0x01e3 }
            int r4 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropTouchRadius     // Catch:{ all -> 0x01e3 }
            float r5 = r3.q     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getDimension(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.q = r4     // Catch:{ all -> 0x01e3 }
            int r4 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropInitialCropWindowPaddingRatio     // Catch:{ all -> 0x01e3 }
            float r5 = r3.d2     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getFloat(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.d2 = r4     // Catch:{ all -> 0x01e3 }
            int r4 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropBorderLineThickness     // Catch:{ all -> 0x01e3 }
            float r5 = r3.h2     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getDimension(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.h2 = r4     // Catch:{ all -> 0x01e3 }
            int r4 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropBorderLineColor     // Catch:{ all -> 0x01e3 }
            int r5 = r3.i2     // Catch:{ all -> 0x01e3 }
            int r4 = r9.getInteger(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.i2 = r4     // Catch:{ all -> 0x01e3 }
            int r4 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropBorderCornerThickness     // Catch:{ all -> 0x01e3 }
            float r5 = r3.j2     // Catch:{ all -> 0x01e3 }
            float r5 = r9.getDimension(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.j2 = r5     // Catch:{ all -> 0x01e3 }
            int r5 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropBorderCornerOffset     // Catch:{ all -> 0x01e3 }
            float r6 = r3.k2     // Catch:{ all -> 0x01e3 }
            float r5 = r9.getDimension(r5, r6)     // Catch:{ all -> 0x01e3 }
            r3.k2 = r5     // Catch:{ all -> 0x01e3 }
            int r5 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropBorderCornerLength     // Catch:{ all -> 0x01e3 }
            float r6 = r3.l2     // Catch:{ all -> 0x01e3 }
            float r5 = r9.getDimension(r5, r6)     // Catch:{ all -> 0x01e3 }
            r3.l2 = r5     // Catch:{ all -> 0x01e3 }
            int r5 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropBorderCornerColor     // Catch:{ all -> 0x01e3 }
            int r6 = r3.m2     // Catch:{ all -> 0x01e3 }
            int r5 = r9.getInteger(r5, r6)     // Catch:{ all -> 0x01e3 }
            r3.m2 = r5     // Catch:{ all -> 0x01e3 }
            int r5 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropGuidelinesThickness     // Catch:{ all -> 0x01e3 }
            float r6 = r3.n2     // Catch:{ all -> 0x01e3 }
            float r5 = r9.getDimension(r5, r6)     // Catch:{ all -> 0x01e3 }
            r3.n2 = r5     // Catch:{ all -> 0x01e3 }
            int r5 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropGuidelinesColor     // Catch:{ all -> 0x01e3 }
            int r6 = r3.o2     // Catch:{ all -> 0x01e3 }
            int r5 = r9.getInteger(r5, r6)     // Catch:{ all -> 0x01e3 }
            r3.o2 = r5     // Catch:{ all -> 0x01e3 }
            int r5 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropBackgroundColor     // Catch:{ all -> 0x01e3 }
            int r6 = r3.p2     // Catch:{ all -> 0x01e3 }
            int r5 = r9.getInteger(r5, r6)     // Catch:{ all -> 0x01e3 }
            r3.p2 = r5     // Catch:{ all -> 0x01e3 }
            int r5 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropShowCropOverlay     // Catch:{ all -> 0x01e3 }
            boolean r6 = r7.m2     // Catch:{ all -> 0x01e3 }
            boolean r5 = r9.getBoolean(r5, r6)     // Catch:{ all -> 0x01e3 }
            r3.Y1 = r5     // Catch:{ all -> 0x01e3 }
            int r5 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropShowProgressBar     // Catch:{ all -> 0x01e3 }
            boolean r6 = r7.n2     // Catch:{ all -> 0x01e3 }
            boolean r5 = r9.getBoolean(r5, r6)     // Catch:{ all -> 0x01e3 }
            r3.Z1 = r5     // Catch:{ all -> 0x01e3 }
            float r5 = r3.j2     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getDimension(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.j2 = r4     // Catch:{ all -> 0x01e3 }
            int r4 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropMinCropWindowWidth     // Catch:{ all -> 0x01e3 }
            int r5 = r3.q2     // Catch:{ all -> 0x01e3 }
            float r5 = (float) r5     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getDimension(r4, r5)     // Catch:{ all -> 0x01e3 }
            int r4 = (int) r4     // Catch:{ all -> 0x01e3 }
            r3.q2 = r4     // Catch:{ all -> 0x01e3 }
            int r4 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropMinCropWindowHeight     // Catch:{ all -> 0x01e3 }
            int r5 = r3.r2     // Catch:{ all -> 0x01e3 }
            float r5 = (float) r5     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getDimension(r4, r5)     // Catch:{ all -> 0x01e3 }
            int r4 = (int) r4     // Catch:{ all -> 0x01e3 }
            r3.r2 = r4     // Catch:{ all -> 0x01e3 }
            int r4 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropMinCropResultWidthPX     // Catch:{ all -> 0x01e3 }
            int r5 = r3.s2     // Catch:{ all -> 0x01e3 }
            float r5 = (float) r5     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getFloat(r4, r5)     // Catch:{ all -> 0x01e3 }
            int r4 = (int) r4     // Catch:{ all -> 0x01e3 }
            r3.s2 = r4     // Catch:{ all -> 0x01e3 }
            int r4 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropMinCropResultHeightPX     // Catch:{ all -> 0x01e3 }
            int r5 = r3.t2     // Catch:{ all -> 0x01e3 }
            float r5 = (float) r5     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getFloat(r4, r5)     // Catch:{ all -> 0x01e3 }
            int r4 = (int) r4     // Catch:{ all -> 0x01e3 }
            r3.t2 = r4     // Catch:{ all -> 0x01e3 }
            int r4 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropMaxCropResultWidthPX     // Catch:{ all -> 0x01e3 }
            int r5 = r3.u2     // Catch:{ all -> 0x01e3 }
            float r5 = (float) r5     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getFloat(r4, r5)     // Catch:{ all -> 0x01e3 }
            int r4 = (int) r4     // Catch:{ all -> 0x01e3 }
            r3.u2 = r4     // Catch:{ all -> 0x01e3 }
            int r4 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropMaxCropResultHeightPX     // Catch:{ all -> 0x01e3 }
            int r5 = r3.v2     // Catch:{ all -> 0x01e3 }
            float r5 = (float) r5     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getFloat(r4, r5)     // Catch:{ all -> 0x01e3 }
            int r4 = (int) r4     // Catch:{ all -> 0x01e3 }
            r3.v2 = r4     // Catch:{ all -> 0x01e3 }
            int r4 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropFlipHorizontally     // Catch:{ all -> 0x01e3 }
            boolean r5 = r3.L2     // Catch:{ all -> 0x01e3 }
            boolean r5 = r9.getBoolean(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.L2 = r5     // Catch:{ all -> 0x01e3 }
            boolean r5 = r3.M2     // Catch:{ all -> 0x01e3 }
            boolean r4 = r9.getBoolean(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.M2 = r4     // Catch:{ all -> 0x01e3 }
            int r4 = com.theartofdev.edmodo.cropper.R.styleable.CropImageView_cropSaveBitmapToInstanceState     // Catch:{ all -> 0x01e3 }
            boolean r5 = r7.l2     // Catch:{ all -> 0x01e3 }
            boolean r4 = r9.getBoolean(r4, r5)     // Catch:{ all -> 0x01e3 }
            r7.l2 = r4     // Catch:{ all -> 0x01e3 }
            boolean r4 = r9.hasValue(r2)     // Catch:{ all -> 0x01e3 }
            if (r4 == 0) goto L_0x01df
            boolean r2 = r9.hasValue(r2)     // Catch:{ all -> 0x01e3 }
            if (r2 == 0) goto L_0x01df
            boolean r0 = r9.hasValue(r0)     // Catch:{ all -> 0x01e3 }
            if (r0 != 0) goto L_0x01df
            r3.e2 = r1     // Catch:{ all -> 0x01e3 }
        L_0x01df:
            r9.recycle()
            goto L_0x01e8
        L_0x01e3:
            r8 = move-exception
            r9.recycle()
            throw r8
        L_0x01e8:
            r3.a()
            com.theartofdev.edmodo.cropper.CropImageView$ScaleType r9 = r3.y
            r7.k2 = r9
            boolean r9 = r3.a2
            r7.o2 = r9
            int r9 = r3.c2
            r7.p2 = r9
            boolean r9 = r3.Y1
            r7.m2 = r9
            boolean r9 = r3.Z1
            r7.n2 = r9
            boolean r9 = r3.L2
            r7.f2 = r9
            boolean r9 = r3.M2
            r7.g2 = r9
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)
            int r9 = com.theartofdev.edmodo.cropper.R.layout.crop_image_view
            android.view.View r8 = r8.inflate(r9, r7, r1)
            int r9 = com.theartofdev.edmodo.cropper.R.id.ImageView_image
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r7.d = r9
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            r9.setScaleType(r0)
            int r9 = com.theartofdev.edmodo.cropper.R.id.CropOverlayView
            android.view.View r9 = r8.findViewById(r9)
            com.theartofdev.edmodo.cropper.CropOverlayView r9 = (com.theartofdev.edmodo.cropper.CropOverlayView) r9
            r7.q = r9
            com.theartofdev.edmodo.cropper.CropImageView$a r0 = new com.theartofdev.edmodo.cropper.CropImageView$a
            r0.<init>()
            r9.setCropWindowChangeListener(r0)
            r9.setInitialAttributeValues(r3)
            int r9 = com.theartofdev.edmodo.cropper.R.id.CropProgressBar
            android.view.View r8 = r8.findViewById(r9)
            android.widget.ProgressBar r8 = (android.widget.ProgressBar) r8
            r7.Y1 = r8
            r7.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropImageView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void a(float f3, float f4, boolean z, boolean z3) {
        float f5;
        if (this.c2 != null) {
            float f6 = 0.0f;
            if (f3 > 0.0f && f4 > 0.0f) {
                this.x.invert(this.y);
                RectF cropWindowRect = this.q.getCropWindowRect();
                this.y.mapRect(cropWindowRect);
                this.x.reset();
                this.x.postTranslate((f3 - ((float) this.c2.getWidth())) / 2.0f, (f4 - ((float) this.c2.getHeight())) / 2.0f);
                d();
                int i = this.e2;
                if (i > 0) {
                    this.x.postRotate((float) i, i0.p.a.a.c.m(this.Z1), i0.p.a.a.c.n(this.Z1));
                    d();
                }
                float min = Math.min(f3 / i0.p.a.a.c.t(this.Z1), f4 / i0.p.a.a.c.p(this.Z1));
                ScaleType scaleType = this.k2;
                if (scaleType == ScaleType.FIT_CENTER || ((scaleType == ScaleType.CENTER_INSIDE && min < 1.0f) || (min > 1.0f && this.o2))) {
                    this.x.postScale(min, min, i0.p.a.a.c.m(this.Z1), i0.p.a.a.c.n(this.Z1));
                    d();
                }
                float f7 = this.f2 ? -this.x2 : this.x2;
                float f8 = this.g2 ? -this.x2 : this.x2;
                this.x.postScale(f7, f8, i0.p.a.a.c.m(this.Z1), i0.p.a.a.c.n(this.Z1));
                d();
                this.x.mapRect(cropWindowRect);
                if (z) {
                    if (f3 > i0.p.a.a.c.t(this.Z1)) {
                        f5 = 0.0f;
                    } else {
                        f5 = Math.max(Math.min((f3 / 2.0f) - cropWindowRect.centerX(), -i0.p.a.a.c.q(this.Z1)), ((float) getWidth()) - i0.p.a.a.c.r(this.Z1)) / f7;
                    }
                    this.y2 = f5;
                    if (f4 <= i0.p.a.a.c.p(this.Z1)) {
                        f6 = Math.max(Math.min((f4 / 2.0f) - cropWindowRect.centerY(), -i0.p.a.a.c.s(this.Z1)), ((float) getHeight()) - i0.p.a.a.c.l(this.Z1)) / f8;
                    }
                    this.z2 = f6;
                } else {
                    this.y2 = Math.min(Math.max(this.y2 * f7, -cropWindowRect.left), (-cropWindowRect.right) + f3) / f7;
                    this.z2 = Math.min(Math.max(this.z2 * f8, -cropWindowRect.top), (-cropWindowRect.bottom) + f4) / f8;
                }
                this.x.postTranslate(this.y2 * f7, this.z2 * f8);
                cropWindowRect.offset(this.y2 * f7, this.z2 * f8);
                this.q.setCropWindowRect(cropWindowRect);
                d();
                this.q.invalidate();
                if (z3) {
                    i0.p.a.a.d dVar = this.b2;
                    float[] fArr = this.Z1;
                    Matrix matrix = this.x;
                    System.arraycopy(fArr, 0, dVar.x, 0, 8);
                    dVar.Y1.set(dVar.d.getCropWindowRect());
                    matrix.getValues(dVar.a2);
                    this.d.startAnimation(this.b2);
                } else {
                    this.d.setImageMatrix(this.x);
                }
                j(false);
            }
        }
    }

    public final void b() {
        Bitmap bitmap = this.c2;
        if (bitmap != null && (this.j2 > 0 || this.v2 != null)) {
            bitmap.recycle();
        }
        this.c2 = null;
        this.j2 = 0;
        this.v2 = null;
        this.w2 = 1;
        this.e2 = 0;
        this.x2 = 1.0f;
        this.y2 = 0.0f;
        this.z2 = 0.0f;
        this.x.reset();
        this.D2 = null;
        this.d.setImageBitmap((Bitmap) null);
        g();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(boolean r13, boolean r14) {
        /*
            r12 = this;
            int r0 = r12.getWidth()
            int r1 = r12.getHeight()
            android.graphics.Bitmap r2 = r12.c2
            if (r2 == 0) goto L_0x0117
            if (r0 <= 0) goto L_0x0117
            if (r1 <= 0) goto L_0x0117
            com.theartofdev.edmodo.cropper.CropOverlayView r2 = r12.q
            android.graphics.RectF r2 = r2.getCropWindowRect()
            r3 = 0
            r4 = 0
            if (r13 == 0) goto L_0x003b
            float r14 = r2.left
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 < 0) goto L_0x0034
            float r14 = r2.top
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 < 0) goto L_0x0034
            float r14 = r2.right
            float r4 = (float) r0
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 > 0) goto L_0x0034
            float r14 = r2.bottom
            float r2 = (float) r1
            int r14 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r14 <= 0) goto L_0x010e
        L_0x0034:
            float r14 = (float) r0
            float r0 = (float) r1
            r12.a(r14, r0, r3, r3)
            goto L_0x010e
        L_0x003b:
            boolean r5 = r12.o2
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r5 != 0) goto L_0x0047
            float r5 = r12.x2
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x010e
        L_0x0047:
            float r5 = r12.x2
            int r7 = r12.p2
            float r7 = (float) r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x0088
            float r5 = r2.width()
            float r7 = (float) r0
            r8 = 1056964608(0x3f000000, float:0.5)
            float r9 = r7 * r8
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 >= 0) goto L_0x0088
            float r5 = r2.height()
            float r9 = (float) r1
            float r8 = r8 * r9
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x0088
            int r5 = r12.p2
            float r5 = (float) r5
            float r8 = r2.width()
            float r10 = r12.x2
            float r8 = r8 / r10
            r10 = 1059313418(0x3f23d70a, float:0.64)
            float r8 = r8 / r10
            float r7 = r7 / r8
            float r8 = r2.height()
            float r11 = r12.x2
            float r8 = r8 / r11
            float r8 = r8 / r10
            float r9 = r9 / r8
            float r7 = java.lang.Math.min(r7, r9)
            float r5 = java.lang.Math.min(r5, r7)
            goto L_0x0089
        L_0x0088:
            r5 = r4
        L_0x0089:
            float r7 = r12.x2
            int r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x00c5
            float r7 = r2.width()
            float r8 = (float) r0
            r9 = 1059481190(0x3f266666, float:0.65)
            float r10 = r8 * r9
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 > 0) goto L_0x00a7
            float r7 = r2.height()
            float r10 = (float) r1
            float r10 = r10 * r9
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x00c5
        L_0x00a7:
            float r5 = r2.width()
            float r7 = r12.x2
            float r5 = r5 / r7
            r7 = 1057132380(0x3f028f5c, float:0.51)
            float r5 = r5 / r7
            float r8 = r8 / r5
            float r5 = (float) r1
            float r2 = r2.height()
            float r9 = r12.x2
            float r2 = r2 / r9
            float r2 = r2 / r7
            float r5 = r5 / r2
            float r2 = java.lang.Math.min(r8, r5)
            float r5 = java.lang.Math.max(r6, r2)
        L_0x00c5:
            boolean r2 = r12.o2
            if (r2 != 0) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r6 = r5
        L_0x00cb:
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x010e
            float r2 = r12.x2
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x010e
            if (r14 == 0) goto L_0x0106
            i0.p.a.a.d r2 = r12.b2
            if (r2 != 0) goto L_0x00e6
            i0.p.a.a.d r2 = new i0.p.a.a.d
            android.widget.ImageView r4 = r12.d
            com.theartofdev.edmodo.cropper.CropOverlayView r5 = r12.q
            r2.<init>(r4, r5)
            r12.b2 = r2
        L_0x00e6:
            i0.p.a.a.d r2 = r12.b2
            float[] r4 = r12.Z1
            android.graphics.Matrix r5 = r12.x
            r2.reset()
            float[] r7 = r2.q
            r8 = 8
            java.lang.System.arraycopy(r4, r3, r7, r3, r8)
            android.graphics.RectF r3 = r2.y
            com.theartofdev.edmodo.cropper.CropOverlayView r4 = r2.d
            android.graphics.RectF r4 = r4.getCropWindowRect()
            r3.set(r4)
            float[] r2 = r2.Z1
            r5.getValues(r2)
        L_0x0106:
            r12.x2 = r6
            float r0 = (float) r0
            float r1 = (float) r1
            r2 = 1
            r12.a(r0, r1, r2, r14)
        L_0x010e:
            com.theartofdev.edmodo.cropper.CropImageView$f r14 = r12.s2
            if (r14 == 0) goto L_0x0117
            if (r13 != 0) goto L_0x0117
            r14.a()
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropImageView.c(boolean, boolean):void");
    }

    public final void d() {
        float[] fArr = this.Z1;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = (float) this.c2.getWidth();
        float[] fArr2 = this.Z1;
        fArr2[3] = 0.0f;
        fArr2[4] = (float) this.c2.getWidth();
        this.Z1[5] = (float) this.c2.getHeight();
        float[] fArr3 = this.Z1;
        fArr3[6] = 0.0f;
        fArr3[7] = (float) this.c2.getHeight();
        this.x.mapPoints(this.Z1);
        float[] fArr4 = this.a2;
        fArr4[0] = 0.0f;
        fArr4[1] = 0.0f;
        fArr4[2] = 100.0f;
        fArr4[3] = 0.0f;
        fArr4[4] = 100.0f;
        fArr4[5] = 100.0f;
        fArr4[6] = 0.0f;
        fArr4[7] = 100.0f;
        this.x.mapPoints(fArr4);
    }

    public void e(int i) {
        int i3;
        int i4 = i;
        if (this.c2 != null) {
            if (i4 < 0) {
                i3 = (i4 % 360) + 360;
            } else {
                i3 = i4 % 360;
            }
            CropOverlayView cropOverlayView = this.q;
            boolean z = !cropOverlayView.n2 && ((i3 > 45 && i3 < 135) || (i3 > 215 && i3 < 305));
            RectF rectF = i0.p.a.a.c.c;
            rectF.set(cropOverlayView.getCropWindowRect());
            float height = (z ? rectF.height() : rectF.width()) / 2.0f;
            float width = (z ? rectF.width() : rectF.height()) / 2.0f;
            if (z) {
                boolean z3 = this.f2;
                this.f2 = this.g2;
                this.g2 = z3;
            }
            this.x.invert(this.y);
            float[] fArr = i0.p.a.a.c.d;
            fArr[0] = rectF.centerX();
            fArr[1] = rectF.centerY();
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 1.0f;
            fArr[5] = 0.0f;
            this.y.mapPoints(fArr);
            this.e2 = (this.e2 + i3) % 360;
            a((float) getWidth(), (float) getHeight(), true, false);
            Matrix matrix = this.x;
            float[] fArr2 = i0.p.a.a.c.e;
            matrix.mapPoints(fArr2, fArr);
            float sqrt = (float) (((double) this.x2) / Math.sqrt(Math.pow((double) (fArr2[5] - fArr2[3]), 2.0d) + Math.pow((double) (fArr2[4] - fArr2[2]), 2.0d)));
            this.x2 = sqrt;
            this.x2 = Math.max(sqrt, 1.0f);
            a((float) getWidth(), (float) getHeight(), true, false);
            this.x.mapPoints(fArr2, fArr);
            double sqrt2 = Math.sqrt(Math.pow((double) (fArr2[5] - fArr2[3]), 2.0d) + Math.pow((double) (fArr2[4] - fArr2[2]), 2.0d));
            float f3 = (float) (((double) height) * sqrt2);
            float f4 = (float) (((double) width) * sqrt2);
            rectF.set(fArr2[0] - f3, fArr2[1] - f4, fArr2[0] + f3, fArr2[1] + f4);
            this.q.h();
            this.q.setCropWindowRect(rectF);
            a((float) getWidth(), (float) getHeight(), true, false);
            c(false, false);
            CropOverlayView cropOverlayView2 = this.q;
            RectF cropWindowRect = cropOverlayView2.getCropWindowRect();
            cropOverlayView2.d(cropWindowRect);
            cropOverlayView2.q.a.set(cropWindowRect);
        }
    }

    public final void f(Bitmap bitmap, int i, Uri uri, int i3, int i4) {
        Bitmap bitmap2 = this.c2;
        if (bitmap2 == null || !bitmap2.equals(bitmap)) {
            this.d.clearAnimation();
            b();
            this.c2 = bitmap;
            this.d.setImageBitmap(bitmap);
            this.v2 = uri;
            this.j2 = i;
            this.w2 = i3;
            this.e2 = i4;
            a((float) getWidth(), (float) getHeight(), true, false);
            CropOverlayView cropOverlayView = this.q;
            if (cropOverlayView != null) {
                cropOverlayView.h();
                g();
            }
        }
    }

    public final void g() {
        CropOverlayView cropOverlayView = this.q;
        if (cropOverlayView != null) {
            cropOverlayView.setVisibility((!this.m2 || this.c2 == null) ? 4 : 0);
        }
    }

    public Pair<Integer, Integer> getAspectRatio() {
        return new Pair<>(Integer.valueOf(this.q.getAspectRatioX()), Integer.valueOf(this.q.getAspectRatioY()));
    }

    public float[] getCropPoints() {
        RectF cropWindowRect = this.q.getCropWindowRect();
        float f3 = cropWindowRect.left;
        float f4 = cropWindowRect.top;
        float f5 = cropWindowRect.right;
        float f6 = cropWindowRect.bottom;
        float[] fArr = {f3, f4, f5, f4, f5, f6, f3, f6};
        this.x.invert(this.y);
        this.y.mapPoints(fArr);
        for (int i = 0; i < 8; i++) {
            fArr[i] = fArr[i] * ((float) this.w2);
        }
        return fArr;
    }

    public Rect getCropRect() {
        int i = this.w2;
        Bitmap bitmap = this.c2;
        if (bitmap == null) {
            return null;
        }
        float[] cropPoints = getCropPoints();
        int width = bitmap.getWidth() * i;
        int height = i * bitmap.getHeight();
        CropOverlayView cropOverlayView = this.q;
        return i0.p.a.a.c.o(cropPoints, width, height, cropOverlayView.n2, cropOverlayView.getAspectRatioX(), this.q.getAspectRatioY());
    }

    public CropShape getCropShape() {
        return this.q.getCropShape();
    }

    public RectF getCropWindowRect() {
        CropOverlayView cropOverlayView = this.q;
        if (cropOverlayView == null) {
            return null;
        }
        return cropOverlayView.getCropWindowRect();
    }

    public Bitmap getCroppedImage() {
        Bitmap bitmap;
        int i;
        RequestSizeOptions requestSizeOptions = RequestSizeOptions.NONE;
        if (this.c2 == null) {
            return null;
        }
        this.d.clearAnimation();
        if (this.v2 == null || (this.w2 <= 1 && requestSizeOptions != RequestSizeOptions.SAMPLING)) {
            i = 0;
            Bitmap bitmap2 = this.c2;
            float[] cropPoints = getCropPoints();
            int i3 = this.e2;
            CropOverlayView cropOverlayView = this.q;
            bitmap = i0.p.a.a.c.e(bitmap2, cropPoints, i3, cropOverlayView.n2, cropOverlayView.getAspectRatioX(), this.q.getAspectRatioY(), this.f2, this.g2).a;
        } else {
            int width = this.c2.getWidth() * this.w2;
            int height = this.c2.getHeight() * this.w2;
            Context context = getContext();
            Uri uri = this.v2;
            float[] cropPoints2 = getCropPoints();
            int i4 = this.e2;
            CropOverlayView cropOverlayView2 = this.q;
            i = 0;
            bitmap = i0.p.a.a.c.c(context, uri, cropPoints2, i4, width, height, cropOverlayView2.n2, cropOverlayView2.getAspectRatioX(), this.q.getAspectRatioY(), 0, 0, this.f2, this.g2).a;
        }
        return i0.p.a.a.c.u(bitmap, 0, i, requestSizeOptions);
    }

    public void getCroppedImageAsync() {
        RequestSizeOptions requestSizeOptions = RequestSizeOptions.NONE;
        if (this.u2 != null) {
            i(0, 0, requestSizeOptions, (Uri) null, (Bitmap.CompressFormat) null, 0);
            return;
        }
        throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
    }

    public Guidelines getGuidelines() {
        return this.q.getGuidelines();
    }

    public int getImageResource() {
        return this.j2;
    }

    public Uri getImageUri() {
        return this.v2;
    }

    public int getMaxZoom() {
        return this.p2;
    }

    public int getRotatedDegrees() {
        return this.e2;
    }

    public ScaleType getScaleType() {
        return this.k2;
    }

    public Rect getWholeImageRect() {
        int i = this.w2;
        Bitmap bitmap = this.c2;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i, bitmap.getHeight() * i);
    }

    public final void h() {
        int i = 0;
        boolean z = this.n2 && ((this.c2 == null && this.E2 != null) || this.F2 != null);
        ProgressBar progressBar = this.Y1;
        if (!z) {
            i = 4;
        }
        progressBar.setVisibility(i);
    }

    public void i(int i, int i3, RequestSizeOptions requestSizeOptions, Uri uri, Bitmap.CompressFormat compressFormat, int i4) {
        CropImageView cropImageView;
        RequestSizeOptions requestSizeOptions2 = requestSizeOptions;
        Bitmap bitmap = this.c2;
        if (bitmap != null) {
            this.d.clearAnimation();
            WeakReference<i0.p.a.a.a> weakReference = this.F2;
            i0.p.a.a.a aVar = weakReference != null ? (i0.p.a.a.a) weakReference.get() : null;
            if (aVar != null) {
                aVar.cancel(true);
            }
            RequestSizeOptions requestSizeOptions3 = RequestSizeOptions.NONE;
            int i5 = requestSizeOptions2 != requestSizeOptions3 ? i : 0;
            int i6 = requestSizeOptions2 != requestSizeOptions3 ? i3 : 0;
            int width = bitmap.getWidth() * this.w2;
            int height = bitmap.getHeight();
            int i7 = this.w2;
            int i8 = height * i7;
            if (this.v2 == null || (i7 <= 1 && requestSizeOptions2 != RequestSizeOptions.SAMPLING)) {
                float[] cropPoints = getCropPoints();
                int i9 = this.e2;
                CropOverlayView cropOverlayView = this.q;
                i0.p.a.a.a aVar2 = r0;
                i0.p.a.a.a aVar3 = new i0.p.a.a.a(this, bitmap, cropPoints, i9, cropOverlayView.n2, cropOverlayView.getAspectRatioX(), this.q.getAspectRatioY(), i5, i6, this.f2, this.g2, requestSizeOptions, uri, compressFormat, i4);
                cropImageView = this;
                cropImageView.F2 = new WeakReference<>(aVar2);
            } else {
                Uri uri2 = this.v2;
                float[] cropPoints2 = getCropPoints();
                int i10 = this.e2;
                CropOverlayView cropOverlayView2 = this.q;
                i0.p.a.a.a aVar4 = r0;
                i0.p.a.a.a aVar5 = new i0.p.a.a.a(this, uri2, cropPoints2, i10, width, i8, cropOverlayView2.n2, cropOverlayView2.getAspectRatioX(), this.q.getAspectRatioY(), i5, i6, this.f2, this.g2, requestSizeOptions, uri, compressFormat, i4);
                this.F2 = new WeakReference<>(aVar4);
                cropImageView = this;
            }
            ((i0.p.a.a.a) cropImageView.F2.get()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            h();
            return;
        }
    }

    public final void j(boolean z) {
        if (this.c2 != null && !z) {
            float t = (((float) this.w2) * 100.0f) / i0.p.a.a.c.t(this.a2);
            float p = (((float) this.w2) * 100.0f) / i0.p.a.a.c.p(this.a2);
            i0.p.a.a.e eVar = this.q.q;
            eVar.e = (float) getWidth();
            eVar.f = (float) getHeight();
            eVar.k = t;
            eVar.l = p;
        }
        this.q.i(z ? null : this.Z1, getWidth(), getHeight());
    }

    public void onLayout(boolean z, int i, int i3, int i4, int i5) {
        super.onLayout(z, i, i3, i4, i5);
        if (this.h2 <= 0 || this.i2 <= 0) {
            j(true);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = this.h2;
        layoutParams.height = this.i2;
        setLayoutParams(layoutParams);
        if (this.c2 != null) {
            float f3 = (float) (i4 - i);
            float f4 = (float) (i5 - i3);
            a(f3, f4, true, false);
            if (this.A2 != null) {
                int i6 = this.B2;
                if (i6 != this.d2) {
                    this.e2 = i6;
                    a(f3, f4, true, false);
                }
                this.x.mapRect(this.A2);
                this.q.setCropWindowRect(this.A2);
                c(false, false);
                CropOverlayView cropOverlayView = this.q;
                RectF cropWindowRect = cropOverlayView.getCropWindowRect();
                cropOverlayView.d(cropWindowRect);
                cropOverlayView.q.a.set(cropWindowRect);
                this.A2 = null;
            } else if (this.C2) {
                this.C2 = false;
                c(false, false);
            }
        } else {
            j(true);
        }
    }

    public void onMeasure(int i, int i3) {
        int i4;
        int i5;
        super.onMeasure(i, i3);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        Bitmap bitmap = this.c2;
        if (bitmap != null) {
            if (size2 == 0) {
                size2 = bitmap.getHeight();
            }
            double width = size < this.c2.getWidth() ? ((double) size) / ((double) this.c2.getWidth()) : Double.POSITIVE_INFINITY;
            double height = size2 < this.c2.getHeight() ? ((double) size2) / ((double) this.c2.getHeight()) : Double.POSITIVE_INFINITY;
            if (width == Double.POSITIVE_INFINITY && height == Double.POSITIVE_INFINITY) {
                i5 = this.c2.getWidth();
                i4 = this.c2.getHeight();
            } else if (width <= height) {
                i4 = (int) (((double) this.c2.getHeight()) * width);
                i5 = size;
            } else {
                i5 = (int) (((double) this.c2.getWidth()) * height);
                i4 = size2;
            }
            if (mode != 1073741824) {
                size = mode == Integer.MIN_VALUE ? Math.min(i5, size) : i5;
            }
            if (mode2 != 1073741824) {
                size2 = mode2 == Integer.MIN_VALUE ? Math.min(i4, size2) : i4;
            }
            this.h2 = size;
            this.i2 = size2;
            setMeasuredDimension(size, size2);
            return;
        }
        setMeasuredDimension(size, size2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (this.E2 == null && this.v2 == null && this.c2 == null && this.j2 == 0) {
                Uri uri = (Uri) bundle.getParcelable("LOADED_IMAGE_URI");
                if (uri != null) {
                    String string = bundle.getString("LOADED_IMAGE_STATE_BITMAP_KEY");
                    if (string != null) {
                        Pair<String, WeakReference<Bitmap>> pair = i0.p.a.a.c.g;
                        Bitmap bitmap = (pair == null || !((String) pair.first).equals(string)) ? null : (Bitmap) ((WeakReference) i0.p.a.a.c.g.second).get();
                        i0.p.a.a.c.g = null;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            f(bitmap, 0, uri, bundle.getInt("LOADED_SAMPLE_SIZE"), 0);
                        }
                    }
                    if (this.v2 == null) {
                        setImageUriAsync(uri);
                    }
                } else {
                    int i = bundle.getInt("LOADED_IMAGE_RESOURCE");
                    if (i > 0) {
                        setImageResource(i);
                    } else {
                        Uri uri2 = (Uri) bundle.getParcelable("LOADING_IMAGE_URI");
                        if (uri2 != null) {
                            setImageUriAsync(uri2);
                        }
                    }
                }
                int i3 = bundle.getInt("DEGREES_ROTATED");
                this.B2 = i3;
                this.e2 = i3;
                Rect rect = (Rect) bundle.getParcelable("INITIAL_CROP_RECT");
                if (rect != null && (rect.width() > 0 || rect.height() > 0)) {
                    this.q.setInitialCropWindowRect(rect);
                }
                RectF rectF = (RectF) bundle.getParcelable("CROP_WINDOW_RECT");
                if (rectF != null && (rectF.width() > 0.0f || rectF.height() > 0.0f)) {
                    this.A2 = rectF;
                }
                this.q.setCropShape(CropShape.valueOf(bundle.getString("CROP_SHAPE")));
                this.o2 = bundle.getBoolean("CROP_AUTO_ZOOM_ENABLED");
                this.p2 = bundle.getInt("CROP_MAX_ZOOM");
                this.f2 = bundle.getBoolean("CROP_FLIP_HORIZONTALLY");
                this.g2 = bundle.getBoolean("CROP_FLIP_VERTICALLY");
            }
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        i0.p.a.a.b bVar;
        boolean z = true;
        if (this.v2 == null && this.c2 == null && this.j2 < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        Uri uri = this.v2;
        if (this.l2 && uri == null && this.j2 < 1) {
            Context context = getContext();
            Bitmap bitmap = this.c2;
            Uri uri2 = this.D2;
            Rect rect = i0.p.a.a.c.a;
            if (uri2 == null) {
                try {
                    uri2 = Uri.fromFile(File.createTempFile("aic_state_store_temp", ".jpg", context.getCacheDir()));
                } catch (Exception e3) {
                    Log.w("AIC", "Failed to write bitmap to temp file for image-cropper save instance state", e3);
                    uri = null;
                }
            } else if (new File(uri2.getPath()).exists()) {
                z = false;
            }
            if (z) {
                i0.p.a.a.c.v(context, bitmap, uri2, Bitmap.CompressFormat.JPEG, 95);
            }
            uri = uri2;
            this.D2 = uri;
        }
        if (!(uri == null || this.c2 == null)) {
            String uuid = UUID.randomUUID().toString();
            i0.p.a.a.c.g = new Pair<>(uuid, new WeakReference(this.c2));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", uuid);
        }
        WeakReference<i0.p.a.a.b> weakReference = this.E2;
        if (!(weakReference == null || (bVar = (i0.p.a.a.b) weakReference.get()) == null)) {
            bundle.putParcelable("LOADING_IMAGE_URI", bVar.b);
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uri);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.j2);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.w2);
        bundle.putInt("DEGREES_ROTATED", this.e2);
        bundle.putParcelable("INITIAL_CROP_RECT", this.q.getInitialCropWindowRect());
        RectF rectF = i0.p.a.a.c.c;
        rectF.set(this.q.getCropWindowRect());
        this.x.invert(this.y);
        this.y.mapRect(rectF);
        bundle.putParcelable("CROP_WINDOW_RECT", rectF);
        bundle.putString("CROP_SHAPE", this.q.getCropShape().name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.o2);
        bundle.putInt("CROP_MAX_ZOOM", this.p2);
        bundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.f2);
        bundle.putBoolean("CROP_FLIP_VERTICALLY", this.g2);
        return bundle;
    }

    public void onSizeChanged(int i, int i3, int i4, int i5) {
        super.onSizeChanged(i, i3, i4, i5);
        this.C2 = i4 > 0 && i5 > 0;
    }

    public void setAutoZoomEnabled(boolean z) {
        if (this.o2 != z) {
            this.o2 = z;
            c(false, false);
            this.q.invalidate();
        }
    }

    public void setCropRect(Rect rect) {
        this.q.setInitialCropWindowRect(rect);
    }

    public void setCropShape(CropShape cropShape) {
        this.q.setCropShape(cropShape);
    }

    public void setFixedAspectRatio(boolean z) {
        this.q.setFixedAspectRatio(z);
    }

    public void setFlippedHorizontally(boolean z) {
        if (this.f2 != z) {
            this.f2 = z;
            a((float) getWidth(), (float) getHeight(), true, false);
        }
    }

    public void setFlippedVertically(boolean z) {
        if (this.g2 != z) {
            this.g2 = z;
            a((float) getWidth(), (float) getHeight(), true, false);
        }
    }

    public void setGuidelines(Guidelines guidelines) {
        this.q.setGuidelines(guidelines);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.q.setInitialCropWindowRect((Rect) null);
        f(bitmap, 0, (Uri) null, 1, 0);
    }

    public void setImageResource(int i) {
        if (i != 0) {
            this.q.setInitialCropWindowRect((Rect) null);
            f(BitmapFactory.decodeResource(getResources(), i), i, (Uri) null, 1, 0);
        }
    }

    public void setImageUriAsync(Uri uri) {
        if (uri != null) {
            WeakReference<i0.p.a.a.b> weakReference = this.E2;
            i0.p.a.a.b bVar = weakReference != null ? (i0.p.a.a.b) weakReference.get() : null;
            if (bVar != null) {
                bVar.cancel(true);
            }
            b();
            this.A2 = null;
            this.B2 = 0;
            this.q.setInitialCropWindowRect((Rect) null);
            WeakReference<i0.p.a.a.b> weakReference2 = new WeakReference<>(new i0.p.a.a.b(this, uri));
            this.E2 = weakReference2;
            ((i0.p.a.a.b) weakReference2.get()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            h();
        }
    }

    public void setMaxZoom(int i) {
        if (this.p2 != i && i > 0) {
            this.p2 = i;
            c(false, false);
            this.q.invalidate();
        }
    }

    public void setMultiTouchEnabled(boolean z) {
        if (this.q.j(z)) {
            c(false, false);
            this.q.invalidate();
        }
    }

    public void setOnCropImageCompleteListener(c cVar) {
        this.u2 = cVar;
    }

    public void setOnCropWindowChangedListener(f fVar) {
        this.s2 = fVar;
    }

    public void setOnSetCropOverlayMovedListener(d dVar) {
        this.r2 = dVar;
    }

    public void setOnSetCropOverlayReleasedListener(e eVar) {
        this.q2 = eVar;
    }

    public void setOnSetImageUriCompleteListener(g gVar) {
        this.t2 = gVar;
    }

    public void setRotatedDegrees(int i) {
        int i3 = this.e2;
        if (i3 != i) {
            e(i - i3);
        }
    }

    public void setSaveBitmapToInstanceState(boolean z) {
        this.l2 = z;
    }

    public void setScaleType(ScaleType scaleType) {
        if (scaleType != this.k2) {
            this.k2 = scaleType;
            this.x2 = 1.0f;
            this.z2 = 0.0f;
            this.y2 = 0.0f;
            this.q.h();
            requestLayout();
        }
    }

    public void setShowCropOverlay(boolean z) {
        if (this.m2 != z) {
            this.m2 = z;
            g();
        }
    }

    public void setShowProgressBar(boolean z) {
        if (this.n2 != z) {
            this.n2 = z;
            h();
        }
    }

    public void setSnapRadius(float f3) {
        if (f3 >= 0.0f) {
            this.q.setSnapRadius(f3);
        }
    }
}
