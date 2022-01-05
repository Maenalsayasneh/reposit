package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.R;
import androidx.appcompat.app.AlertController;
import h0.b.a.d;
import h0.b.e.i.p;
import h0.b.f.c0;
import h0.b.f.c1;
import h0.b.f.e0;
import h0.b.f.h0;
import h0.b.f.s0;
import h0.i.i.q;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class AppCompatSpinner extends Spinner {
    private static final int[] ATTRS_ANDROID_SPINNERMODE = {16843505};
    private static final int MAX_ITEMS_MEASURED = 15;
    private static final int MODE_DIALOG = 0;
    private static final int MODE_DROPDOWN = 1;
    private static final int MODE_THEME = -1;
    private static final String TAG = "AppCompatSpinner";
    private final h0.b.f.e mBackgroundTintHelper;
    public int mDropDownWidth;
    private e0 mForwardingListener;
    private f mPopup;
    private final Context mPopupContext;
    private final boolean mPopupSet;
    private SpinnerAdapter mTempAdapter;
    public final Rect mTempRect;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean c;

        public class a implements Parcelable.Creator<SavedState> {
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.c ? (byte) 1 : 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.c = parcel.readByte() != 0;
        }
    }

    public class a extends e0 {
        public final /* synthetic */ e c2;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view, e eVar) {
            super(view);
            this.c2 = eVar;
        }

        public p b() {
            return this.c2;
        }

        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (AppCompatSpinner.this.getInternalPopup().b()) {
                return true;
            }
            AppCompatSpinner.this.showPopup();
            return true;
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().b()) {
                AppCompatSpinner.this.showPopup();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    public class c implements f, DialogInterface.OnClickListener {
        public h0.b.a.d c;
        public ListAdapter d;
        public CharSequence q;

        public c() {
        }

        public boolean b() {
            h0.b.a.d dVar = this.c;
            if (dVar != null) {
                return dVar.isShowing();
            }
            return false;
        }

        public void dismiss() {
            h0.b.a.d dVar = this.c;
            if (dVar != null) {
                dVar.dismiss();
                this.c = null;
            }
        }

        public void e(Drawable drawable) {
            Log.e(AppCompatSpinner.TAG, "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        public int f() {
            return 0;
        }

        public void g(int i) {
            Log.e(AppCompatSpinner.TAG, "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        public CharSequence h() {
            return this.q;
        }

        public Drawable i() {
            return null;
        }

        public void k(CharSequence charSequence) {
            this.q = charSequence;
        }

        public void l(int i) {
            Log.e(AppCompatSpinner.TAG, "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        public void m(int i) {
            Log.e(AppCompatSpinner.TAG, "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        public void n(int i, int i2) {
            if (this.d != null) {
                d.a aVar = new d.a(AppCompatSpinner.this.getPopupContext());
                CharSequence charSequence = this.q;
                if (charSequence != null) {
                    aVar.a.d = charSequence;
                }
                ListAdapter listAdapter = this.d;
                int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
                AlertController.b bVar = aVar.a;
                bVar.p = listAdapter;
                bVar.q = this;
                bVar.t = selectedItemPosition;
                bVar.s = true;
                h0.b.a.d a = aVar.a();
                this.c = a;
                ListView listView = a.q.g;
                listView.setTextDirection(i);
                listView.setTextAlignment(i2);
                this.c.show();
            }
        }

        public int o() {
            return 0;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick((View) null, i, this.d.getItemId(i));
            }
            h0.b.a.d dVar = this.c;
            if (dVar != null) {
                dVar.dismiss();
                this.c = null;
            }
        }

        public void p(ListAdapter listAdapter) {
            this.d = listAdapter;
        }
    }

    public static class d implements ListAdapter, SpinnerAdapter {
        public SpinnerAdapter c;
        public ListAdapter d;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.c = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.d = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof s0) {
                s0 s0Var = (s0) spinnerAdapter;
                if (s0Var.getDropDownViewTheme() == null) {
                    s0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.d;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.c;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.c;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.c;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.d;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.c;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.c;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public class e extends h0 implements f {
        public CharSequence v2;
        public ListAdapter w2;
        public final Rect x2 = new Rect();
        public int y2;

        public class a implements AdapterView.OnItemClickListener {
            public a(AppCompatSpinner appCompatSpinner) {
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    AppCompatSpinner.this.performItemClick(view, i, eVar.w2.getItemId(i));
                }
                e.this.dismiss();
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            public void onGlobalLayout() {
                e eVar = e.this;
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                Objects.requireNonNull(eVar);
                AtomicInteger atomicInteger = q.a;
                if (!(appCompatSpinner.isAttachedToWindow() && appCompatSpinner.getGlobalVisibleRect(eVar.x2))) {
                    e.this.dismiss();
                    return;
                }
                e.this.t();
                e.this.a();
            }
        }

        public class c implements PopupWindow.OnDismissListener {
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener c;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.c = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.c);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i, 0);
            this.k2 = AppCompatSpinner.this;
            s(true);
            this.i2 = 0;
            this.l2 = new a(AppCompatSpinner.this);
        }

        public CharSequence h() {
            return this.v2;
        }

        public void k(CharSequence charSequence) {
            this.v2 = charSequence;
        }

        public void m(int i) {
            this.y2 = i;
        }

        public void n(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean b2 = b();
            t();
            this.u2.setInputMethodMode(2);
            a();
            c0 c0Var = this.y;
            c0Var.setChoiceMode(1);
            c0Var.setTextDirection(i);
            c0Var.setTextAlignment(i2);
            int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
            c0 c0Var2 = this.y;
            if (b() && c0Var2 != null) {
                c0Var2.setListSelectionHidden(false);
                c0Var2.setSelection(selectedItemPosition);
                if (c0Var2.getChoiceMode() != 0) {
                    c0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!b2 && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                this.u2.setOnDismissListener(new c(bVar));
            }
        }

        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.w2 = listAdapter;
        }

        public void t() {
            int i;
            int i2;
            Drawable i3 = i();
            int i4 = 0;
            if (i3 != null) {
                i3.getPadding(AppCompatSpinner.this.mTempRect);
                if (c1.b(AppCompatSpinner.this)) {
                    i2 = AppCompatSpinner.this.mTempRect.right;
                } else {
                    i2 = -AppCompatSpinner.this.mTempRect.left;
                }
                i4 = i2;
            } else {
                Rect rect = AppCompatSpinner.this.mTempRect;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i5 = appCompatSpinner.mDropDownWidth;
            if (i5 == -2) {
                int compatMeasureContentWidth = appCompatSpinner.compatMeasureContentWidth((SpinnerAdapter) this.w2, i());
                int i6 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.mTempRect;
                int i7 = (i6 - rect2.left) - rect2.right;
                if (compatMeasureContentWidth > i7) {
                    compatMeasureContentWidth = i7;
                }
                r(Math.max(compatMeasureContentWidth, (width - paddingLeft) - paddingRight));
            } else if (i5 == -1) {
                r((width - paddingLeft) - paddingRight);
            } else {
                r(i5);
            }
            if (c1.b(AppCompatSpinner.this)) {
                i = (((width - paddingRight) - this.Z1) - this.y2) + i4;
            } else {
                i = paddingLeft + this.y2 + i4;
            }
            this.a2 = i;
        }
    }

    public interface f {
        boolean b();

        void dismiss();

        void e(Drawable drawable);

        int f();

        void g(int i);

        CharSequence h();

        Drawable i();

        void k(CharSequence charSequence);

        void l(int i);

        void m(int i);

        void n(int i, int i2);

        int o();

        void p(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    public int compatMeasureContentWidth(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.mTempRect);
        Rect rect = this.mTempRect;
        return i2 + rect.left + rect.right;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        h0.b.f.e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.a();
        }
    }

    public int getDropDownHorizontalOffset() {
        f fVar = this.mPopup;
        if (fVar != null) {
            return fVar.f();
        }
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        f fVar = this.mPopup;
        if (fVar != null) {
            return fVar.o();
        }
        return super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        if (this.mPopup != null) {
            return this.mDropDownWidth;
        }
        return super.getDropDownWidth();
    }

    public final f getInternalPopup() {
        return this.mPopup;
    }

    public Drawable getPopupBackground() {
        f fVar = this.mPopup;
        if (fVar != null) {
            return fVar.i();
        }
        return super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.mPopupContext;
    }

    public CharSequence getPrompt() {
        f fVar = this.mPopup;
        return fVar != null ? fVar.h() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        h0.b.f.e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h0.b.f.e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.mPopup;
        if (fVar != null && fVar.b()) {
            this.mPopup.dismiss();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mPopup != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), compatMeasureContentWidth(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.c && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new b());
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        f fVar = this.mPopup;
        savedState.c = fVar != null && fVar.b();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        e0 e0Var = this.mForwardingListener;
        if (e0Var == null || !e0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        f fVar = this.mPopup;
        if (fVar == null) {
            return super.performClick();
        }
        if (fVar.b()) {
            return true;
        }
        showPopup();
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h0.b.f.e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        h0.b.f.e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.f(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        f fVar = this.mPopup;
        if (fVar != null) {
            fVar.m(i);
            this.mPopup.g(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    public void setDropDownVerticalOffset(int i) {
        f fVar = this.mPopup;
        if (fVar != null) {
            fVar.l(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.mPopup != null) {
            this.mDropDownWidth = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        f fVar = this.mPopup;
        if (fVar != null) {
            fVar.e(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(h0.b.b.a.a.a(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        f fVar = this.mPopup;
        if (fVar != null) {
            fVar.k(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        h0.b.f.e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h0.b.f.e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void showPopup() {
        this.mPopup.n(getTextDirection(), getTextAlignment());
    }

    public AppCompatSpinner(Context context, int i) {
        this(context, (AttributeSet) null, R.attr.spinnerStyle, i);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.mPopupSet) {
            this.mTempAdapter = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.mPopup != null) {
            Context context = this.mPopupContext;
            if (context == null) {
                context = getContext();
            }
            this.mPopup.p(new d(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (r11 != null) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.mTempRect = r0
            android.content.Context r0 = r6.getContext()
            h0.b.f.r0.a(r6, r0)
            int[] r0 = androidx.appcompat.R.styleable.Spinner
            r1 = 0
            android.content.res.TypedArray r0 = r7.obtainStyledAttributes(r8, r0, r9, r1)
            h0.b.f.e r2 = new h0.b.f.e
            r2.<init>(r6)
            r6.mBackgroundTintHelper = r2
            if (r11 == 0) goto L_0x0029
            h0.b.e.c r2 = new h0.b.e.c
            r2.<init>((android.content.Context) r7, (android.content.res.Resources.Theme) r11)
            r6.mPopupContext = r2
            goto L_0x003b
        L_0x0029:
            int r11 = androidx.appcompat.R.styleable.Spinner_popupTheme
            int r11 = r0.getResourceId(r11, r1)
            if (r11 == 0) goto L_0x0039
            h0.b.e.c r2 = new h0.b.e.c
            r2.<init>((android.content.Context) r7, (int) r11)
            r6.mPopupContext = r2
            goto L_0x003b
        L_0x0039:
            r6.mPopupContext = r7
        L_0x003b:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x006b
            int[] r11 = ATTRS_ANDROID_SPINNERMODE     // Catch:{ Exception -> 0x0057, all -> 0x0055 }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x0057, all -> 0x0055 }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x0053 }
            if (r3 == 0) goto L_0x004f
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x0053 }
        L_0x004f:
            r11.recycle()
            goto L_0x006b
        L_0x0053:
            r3 = move-exception
            goto L_0x0059
        L_0x0055:
            r7 = move-exception
            goto L_0x0065
        L_0x0057:
            r3 = move-exception
            r11 = r2
        L_0x0059:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x0063 }
            if (r11 == 0) goto L_0x006b
            goto L_0x004f
        L_0x0063:
            r7 = move-exception
            r2 = r11
        L_0x0065:
            if (r2 == 0) goto L_0x006a
            r2.recycle()
        L_0x006a:
            throw r7
        L_0x006b:
            r11 = 1
            if (r10 == 0) goto L_0x00ab
            if (r10 == r11) goto L_0x0071
            goto L_0x00bb
        L_0x0071:
            androidx.appcompat.widget.AppCompatSpinner$e r10 = new androidx.appcompat.widget.AppCompatSpinner$e
            android.content.Context r3 = r6.mPopupContext
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.mPopupContext
            int[] r4 = androidx.appcompat.R.styleable.Spinner
            h0.b.f.w0 r1 = h0.b.f.w0.q(r3, r8, r4, r9, r1)
            int r3 = androidx.appcompat.R.styleable.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.k(r3, r4)
            r6.mDropDownWidth = r3
            int r3 = androidx.appcompat.R.styleable.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.g(r3)
            android.widget.PopupWindow r4 = r10.u2
            r4.setBackgroundDrawable(r3)
            int r3 = androidx.appcompat.R.styleable.Spinner_android_prompt
            java.lang.String r3 = r0.getString(r3)
            r10.v2 = r3
            android.content.res.TypedArray r1 = r1.b
            r1.recycle()
            r6.mPopup = r10
            androidx.appcompat.widget.AppCompatSpinner$a r1 = new androidx.appcompat.widget.AppCompatSpinner$a
            r1.<init>(r6, r10)
            r6.mForwardingListener = r1
            goto L_0x00bb
        L_0x00ab:
            androidx.appcompat.widget.AppCompatSpinner$c r10 = new androidx.appcompat.widget.AppCompatSpinner$c
            r10.<init>()
            r6.mPopup = r10
            int r1 = androidx.appcompat.R.styleable.Spinner_android_prompt
            java.lang.String r1 = r0.getString(r1)
            r10.k(r1)
        L_0x00bb:
            int r10 = androidx.appcompat.R.styleable.Spinner_android_entries
            java.lang.CharSequence[] r10 = r0.getTextArray(r10)
            if (r10 == 0) goto L_0x00d3
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = androidx.appcompat.R.layout.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r7)
            r6.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00d3:
            r0.recycle()
            r6.mPopupSet = r11
            android.widget.SpinnerAdapter r7 = r6.mTempAdapter
            if (r7 == 0) goto L_0x00e1
            r6.setAdapter((android.widget.SpinnerAdapter) r7)
            r6.mTempAdapter = r2
        L_0x00e1:
            h0.b.f.e r7 = r6.mBackgroundTintHelper
            r7.d(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
