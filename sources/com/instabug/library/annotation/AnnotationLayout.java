package com.instabug.library.annotation;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.instabug.library.Instabug;
import com.instabug.library.R;
import com.instabug.library.annotation.AnnotationView;
import com.instabug.library.annotation.ColorPickerPopUpView;
import com.instabug.library.annotation.ShapeSuggestionsLayout;
import com.instabug.library.annotation.f.h;
import com.instabug.library.util.AttrResolver;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.BitmapWorkerTask;
import com.instabug.library.util.DrawableUtils;
import com.instabug.library.view.IconView;
import com.instabug.library.view.ViewUtils;

public class AnnotationLayout extends LinearLayout implements View.OnClickListener {
    private static final String ANNOTATION_LAYOUT = "instabug_annotation_layout";
    private static final String DRAWING_MODE = "drawingMode";
    private LinearLayout annotationActionsContainer;
    /* access modifiers changed from: private */
    public AnnotationView annotationView;
    private View border;
    /* access modifiers changed from: private */
    public View brushIndicator;
    /* access modifiers changed from: private */
    public ColorPickerPopUpView colorPicker;
    private ImageView iconBlur;
    private ImageView iconBrush;
    private RelativeLayout iconBrushLayout;
    /* access modifiers changed from: private */
    public ImageView iconMagnify;
    private ImageView iconUndo;
    /* access modifiers changed from: private */
    public ShapeSuggestionsLayout shapeSuggestionsLayout;
    /* access modifiers changed from: private */
    public int tintingColor;

    public class a implements ShapeSuggestionsLayout.c {
        public a() {
        }
    }

    public class b implements AnnotationView.f {
        public b() {
        }
    }

    public class c implements AnnotationView.h {
        public c() {
        }
    }

    public class d implements AnnotationView.g {
        public d() {
        }

        public void a(boolean z) {
            AnnotationLayout.this.iconMagnify.setEnabled(z);
        }
    }

    public class e implements ColorPickerPopUpView.b {
        public e() {
        }
    }

    public class f implements View.OnTouchListener {
        public final /* synthetic */ ImageView c;

        public f(ImageView imageView) {
            this.c = imageView;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                DrawableUtils.setDrawableTintColor(this.c, Instabug.getPrimaryColor());
                return false;
            } else if (motionEvent.getAction() != 1) {
                return false;
            } else {
                DrawableUtils.setDrawableTintColor(this.c, AnnotationLayout.this.tintingColor);
                return false;
            }
        }
    }

    public class g implements BitmapWorkerTask.OnImageLoadedListener {
        public final /* synthetic */ Runnable a;

        public g(Runnable runnable) {
            this.a = runnable;
        }

        public void onImageLoaded() {
            AnnotationLayout.this.enableButtons();
            AnnotationLayout.this.setBorder();
            Runnable runnable = this.a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public AnnotationLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public void enableButtons() {
        this.iconBrush.setEnabled(true);
        this.iconMagnify.setEnabled(true);
        this.iconBlur.setEnabled(true);
        this.iconUndo.setEnabled(true);
    }

    private void hideColorPicker() {
        if (this.colorPicker.getVisibility() == 0) {
            this.colorPicker.setVisibility(8);
        }
    }

    private void initViews() {
        LinearLayout.inflate(getContext(), R.layout.instabug_annotation_view, this);
        this.annotationActionsContainer = (LinearLayout) findViewById(R.id.instabug_annotation_actions_container);
        ShapeSuggestionsLayout shapeSuggestionsLayout2 = (ShapeSuggestionsLayout) findViewById(R.id.shapeSuggestionsLayout);
        this.shapeSuggestionsLayout = shapeSuggestionsLayout2;
        shapeSuggestionsLayout2.setOnShapeSelectedListener(new a());
        this.iconBrushLayout = (RelativeLayout) findViewById(R.id.icon_brush_layout);
        this.iconBrush = (ImageView) findViewById(R.id.icon_brush);
        this.iconMagnify = (ImageView) findViewById(R.id.icon_magnify);
        this.iconBlur = (ImageView) findViewById(R.id.icon_blur);
        this.iconUndo = (ImageView) findViewById(R.id.icon_undo);
        this.iconBrush.setEnabled(false);
        this.iconMagnify.setEnabled(false);
        this.iconBlur.setEnabled(false);
        this.iconUndo.setEnabled(false);
        this.border = findViewById(R.id.instabug_annotation_image_border);
        this.annotationView = (AnnotationView) findViewById(R.id.instabug_annotation_image);
        this.colorPicker = (ColorPickerPopUpView) findViewById(R.id.instabug_color_picker);
        this.brushIndicator = findViewById(R.id.brush_indicator);
        this.annotationView.setDrawingMode(AnnotationView.c.DRAW_PATH);
        DrawableUtils.setDrawableTintColor(this.iconBrush, Instabug.getPrimaryColor());
        this.annotationView.setDrawingColor(this.colorPicker.getSelectedColor());
        this.annotationView.setOnActionDownListener(new b());
        this.annotationView.setOnPathRecognizedListener(new c());
        this.annotationView.m17setOnNewMagnifierAddingAbilityChangedListener(new d());
        this.colorPicker.setOnColorSelectionListener(new e());
        this.colorPicker.setPopUpBackgroundColor(AttrResolver.resolveAttributeColor(getContext(), R.attr.ib_annotation_color_picker_bg_color));
        this.iconBrushLayout.setOnClickListener(this);
        this.iconMagnify.setOnClickListener(this);
        this.iconBlur.setOnClickListener(this);
        this.iconUndo.setOnClickListener(this);
        setViewSelector(this.iconMagnify);
        setViewSelector(this.iconUndo);
        this.tintingColor = h0.i.b.a.getColor(getContext(), R.color.ib_core_annotation_tinting_color);
    }

    private void resetColorSelection() {
        int childCount = this.annotationActionsContainer.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (this.annotationActionsContainer.getChildAt(i) instanceof IconView) {
                ((TextView) this.annotationActionsContainer.getChildAt(i)).setTextColor(this.tintingColor);
            }
        }
        DrawableUtils.setDrawableTintColor(this.iconBrush, this.tintingColor);
        DrawableUtils.setDrawableTintColor(this.iconBlur, this.tintingColor);
    }

    /* access modifiers changed from: private */
    public void setBorder() {
        int convertDpToPx = ViewUtils.convertDpToPx(getContext(), 4.0f);
        int convertDpToPx2 = ViewUtils.convertDpToPx(getContext(), 2.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RectShape());
        shapeDrawable.getPaint().setColor(Instabug.getPrimaryColor());
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setStrokeWidth((float) convertDpToPx);
        this.border.setPadding(convertDpToPx2, convertDpToPx2, convertDpToPx2, convertDpToPx2);
        this.border.setBackground(shapeDrawable);
    }

    private void setViewSelector(ImageView imageView) {
        imageView.setOnTouchListener(new f(imageView));
    }

    /* access modifiers changed from: private */
    public void showShapeSuggestions(Path... pathArr) {
        this.shapeSuggestionsLayout.removeAllViews();
        for (Path dVar : pathArr) {
            ShapeSuggestionsLayout shapeSuggestionsLayout2 = this.shapeSuggestionsLayout;
            ShapeSuggestionsLayout.d dVar2 = new ShapeSuggestionsLayout.d(shapeSuggestionsLayout2.getContext(), dVar, AttrResolver.getTintingColor(shapeSuggestionsLayout2.getContext()));
            dVar2.setOnClickListener(new i0.j.e.b.a(shapeSuggestionsLayout2));
            shapeSuggestionsLayout2.addView(dVar2);
            shapeSuggestionsLayout2.b(0);
        }
        this.shapeSuggestionsLayout.c();
    }

    private void switchColorPickerVisibility() {
        ColorPickerPopUpView colorPickerPopUpView = this.colorPicker;
        colorPickerPopUpView.setVisibility(colorPickerPopUpView.getVisibility() == 0 ? 8 : 0);
    }

    public Bitmap getAnnotatedBitmap() {
        return this.annotationView.h();
    }

    public void onClick(View view) {
        c cVar;
        boolean z;
        this.shapeSuggestionsLayout.a();
        int id = view.getId();
        if (id == R.id.icon_brush_layout) {
            switchColorPickerVisibility();
            this.annotationView.setDrawingMode(AnnotationView.c.DRAW_PATH);
            resetColorSelection();
            DrawableUtils.setDrawableTintColor(this.iconBrush, Instabug.getPrimaryColor());
        } else if (id == R.id.icon_magnify) {
            this.annotationView.c();
            hideColorPicker();
        } else if (id == R.id.icon_blur) {
            this.annotationView.setDrawingMode(AnnotationView.c.DRAW_BLUR);
            resetColorSelection();
            DrawableUtils.setDrawableTintColor(this.iconBlur, Instabug.getPrimaryColor());
            hideColorPicker();
        } else if (id == R.id.icon_undo) {
            AnnotationView annotationView2 = this.annotationView;
            d dVar = annotationView2.q2;
            if (dVar != null) {
                if (dVar.x.size() > 0) {
                    cVar = dVar.x.pop();
                    if (cVar.y.size() > 0) {
                        cVar.x = cVar.y.pop();
                        if (cVar.y.size() == 0) {
                            cVar.c = cVar.d;
                        }
                        cVar.c.f(cVar.x, cVar.q, true);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        if (!dVar.d.remove(cVar)) {
                            dVar.q.remove(cVar);
                        }
                        dVar.c.remove(cVar);
                        while (true) {
                            int indexOf = dVar.x.indexOf(cVar);
                            if (indexOf == -1) {
                                break;
                            }
                            dVar.x.remove(indexOf);
                        }
                        if (cVar != null && (cVar.c instanceof h)) {
                            annotationView2.z2--;
                            annotationView2.j();
                        }
                        AnnotationView.c = null;
                        annotationView2.l();
                        annotationView2.invalidate();
                    }
                }
                cVar = null;
                annotationView2.z2--;
                annotationView2.j();
                AnnotationView.c = null;
                annotationView2.l();
                annotationView2.invalidate();
            }
            hideColorPicker();
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        this.annotationView.setDrawingColor(this.colorPicker.getSelectedColor());
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            AnnotationView.c cVar = (AnnotationView.c) bundle.getSerializable(DRAWING_MODE);
            resetColorSelection();
            if (cVar == AnnotationView.c.DRAW_BLUR) {
                DrawableUtils.setDrawableTintColor(this.iconBlur, Instabug.getPrimaryColor());
            } else {
                DrawableUtils.setDrawableTintColor(this.iconBrush, Instabug.getPrimaryColor());
            }
            parcelable = bundle.getParcelable(ANNOTATION_LAYOUT);
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(ANNOTATION_LAYOUT, super.onSaveInstanceState());
        bundle.putSerializable(DRAWING_MODE, this.annotationView.getDrawingMode());
        return bundle;
    }

    public void setBaseImage(Uri uri, Runnable runnable) {
        if (uri.getPath() != null) {
            BitmapUtils.loadBitmap(uri.getPath(), this.annotationView, new g(runnable));
        }
    }

    public void setBitmap(Bitmap bitmap) {
        this.annotationView.setImageBitmap(bitmap);
        enableButtons();
        setBorder();
    }

    public AnnotationLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public AnnotationLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initViews();
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    @TargetApi(21)
    public AnnotationLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initViews();
    }
}
