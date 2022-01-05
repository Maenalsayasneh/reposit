package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.customview.view.AbsSavedState;
import h0.b.f.c1;
import h0.b.f.f0;
import h0.b.f.q0;
import h0.b.f.w0;
import h0.i.i.q;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class SearchView extends f0 implements h0.b.e.b {
    public static final n i2 = (Build.VERSION.SDK_INT < 29 ? new n() : null);
    public final int A2;
    public final Intent B2;
    public final Intent C2;
    public final CharSequence D2;
    public l E2;
    public k F2;
    public View.OnFocusChangeListener G2;
    public m H2;
    public View.OnClickListener I2;
    public boolean J2;
    public boolean K2;
    public h0.j.a.a L2;
    public boolean M2;
    public CharSequence N2;
    public boolean O2;
    public boolean P2;
    public int Q2;
    public boolean R2;
    public CharSequence S2;
    public CharSequence T2;
    public boolean U2;
    public int V2;
    public SearchableInfo W2;
    public Bundle X2;
    public final Runnable Y2;
    public Runnable Z2;
    public final WeakHashMap<String, Drawable.ConstantState> a3;
    public final View.OnClickListener b3;
    public View.OnKeyListener c3;
    public final TextView.OnEditorActionListener d3;
    public final AdapterView.OnItemClickListener e3;
    public final AdapterView.OnItemSelectedListener f3;
    public TextWatcher g3;
    public final SearchAutoComplete j2;
    public final View k2;
    public final View l2;
    public final View m2;
    public final ImageView n2;
    public final ImageView o2;
    public final ImageView p2;
    public final ImageView q2;
    public final View r2;
    public o s2;
    public Rect t2;
    public Rect u2;
    public int[] v2;
    public int[] w2;
    public final ImageView x2;
    public final Drawable y2;
    public final int z2;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean q;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("SearchView.SavedState{");
            P0.append(Integer.toHexString(System.identityHashCode(this)));
            P0.append(" isIconified=");
            return i0.d.a.a.a.D0(P0, this.q, "}");
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.d, i);
            parcel.writeValue(Boolean.valueOf(this.q));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.q = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }
    }

    public static class SearchAutoComplete extends h0.b.f.d {
        public boolean Y1;
        public final Runnable Z1 = new a();
        public int x = getThreshold();
        public SearchView y;

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.Y1) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.Y1 = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        public void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            n nVar = SearchView.i2;
            Objects.requireNonNull(nVar);
            n.a();
            Method method = nVar.c;
            if (method != null) {
                try {
                    method.invoke(this, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }

        public boolean enoughToFilter() {
            return this.x <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.Y1) {
                removeCallbacks(this.Z1);
                post(this.Z1);
            }
            return onCreateInputConnection;
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.y;
            searchView.G(searchView.K2);
            searchView.post(searchView.Y2);
            if (searchView.j2.hasFocus()) {
                searchView.s();
            }
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.y.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.y.hasFocus() && getVisibility() == 0) {
                boolean z2 = true;
                this.Y1 = true;
                Context context = getContext();
                n nVar = SearchView.i2;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z2 = false;
                }
                if (z2) {
                    a();
                }
            }
        }

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.Y1 = false;
                removeCallbacks(this.Z1);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.Y1 = false;
                removeCallbacks(this.Z1);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.Y1 = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.y = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.x = i;
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.j2.getText();
            searchView.T2 = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.F(z);
            searchView.H(!z);
            searchView.B();
            searchView.E();
            if (searchView.E2 != null && !TextUtils.equals(charSequence, searchView.S2)) {
                searchView.E2.a(charSequence.toString());
            }
            searchView.S2 = charSequence.toString();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            SearchView.this.C();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            h0.j.a.a aVar = SearchView.this.L2;
            if (aVar instanceof q0) {
                aVar.b((Cursor) null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.G2;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9;
            int i10;
            SearchView searchView = SearchView.this;
            if (searchView.r2.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.l2.getPaddingLeft();
                Rect rect = new Rect();
                boolean b = c1.b(searchView);
                if (searchView.J2) {
                    i9 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                } else {
                    i9 = 0;
                }
                searchView.j2.getDropDownBackground().getPadding(rect);
                if (b) {
                    i10 = -rect.left;
                } else {
                    i10 = paddingLeft - (rect.left + i9);
                }
                searchView.j2.setDropDownHorizontalOffset(i10);
                searchView.j2.setDropDownWidth((((searchView.r2.getWidth() + rect.left) + rect.right) + i9) - paddingLeft);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        public void onClick(View view) {
            String str;
            SearchView searchView = SearchView.this;
            if (view == searchView.n2) {
                searchView.y();
            } else if (view == searchView.p2) {
                searchView.u();
            } else if (view == searchView.o2) {
                searchView.z();
            } else if (view == searchView.q2) {
                SearchableInfo searchableInfo = searchView.W2;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.B2);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            if (searchActivity == null) {
                                str = null;
                            } else {
                                str = searchActivity.flattenToShortString();
                            }
                            intent.putExtra("calling_package", str);
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.r(searchView.C2, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                        Log.w("SearchView", "Could not find voice search activity");
                    }
                }
            } else if (view == searchView.j2) {
                searchView.s();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.W2 == null) {
                return false;
            }
            if (searchView.j2.isPopupShowing() && SearchView.this.j2.getListSelection() != -1) {
                return SearchView.this.A(i, keyEvent);
            }
            if ((TextUtils.getTrimmedLength(SearchView.this.j2.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.t(0, (String) null, searchView2.j2.getText().toString());
            return true;
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.z();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.v(i);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.w(i);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public interface k {
        boolean a();
    }

    public interface l {
        boolean a(String str);

        boolean b(String str);
    }

    public interface m {
        boolean a(int i);

        boolean b(int i);
    }

    public static class n {
        public Method a = null;
        public Method b = null;
        public Method c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public n() {
            a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public static class o extends TouchDelegate {
        public final View a;
        public final Rect b = new Rect();
        public final Rect c = new Rect();
        public final Rect d = new Rect();
        public final int e;
        public boolean f;

        public o(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.b.set(rect);
            this.d.set(rect);
            Rect rect3 = this.d;
            int i = this.e;
            rect3.inset(-i, -i);
            this.c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r9) {
            /*
                r8 = this;
                float r0 = r9.getX()
                int r0 = (int) r0
                float r1 = r9.getY()
                int r1 = (int) r1
                int r2 = r9.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0033
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003f
            L_0x001b:
                boolean r2 = r8.f
                r8.f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r8.f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r8.d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = r5
                goto L_0x0041
            L_0x002f:
                r7 = r4
                r4 = r2
                r2 = r7
                goto L_0x0041
            L_0x0033:
                android.graphics.Rect r2 = r8.b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003f
                r8.f = r4
                r2 = r4
                goto L_0x0041
            L_0x003f:
                r2 = r4
                r4 = r5
            L_0x0041:
                if (r4 == 0) goto L_0x0074
                if (r2 == 0) goto L_0x0061
                android.graphics.Rect r2 = r8.c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x0061
                android.view.View r0 = r8.a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r8.a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r9.setLocation(r0, r1)
                goto L_0x006e
            L_0x0061:
                android.graphics.Rect r2 = r8.c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r9.setLocation(r0, r1)
            L_0x006e:
                android.view.View r0 = r8.a
                boolean r5 = r0.dispatchTouchEvent(r9)
            L_0x0074:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.o.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.j2.setText(charSequence);
        this.j2.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public boolean A(int i3, KeyEvent keyEvent) {
        int i4;
        if (this.W2 != null && this.L2 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i3 == 66 || i3 == 84 || i3 == 61) {
                return v(this.j2.getListSelection());
            }
            if (i3 == 21 || i3 == 22) {
                if (i3 == 21) {
                    i4 = 0;
                } else {
                    i4 = this.j2.length();
                }
                this.j2.setSelection(i4);
                this.j2.setListSelection(0);
                this.j2.clearListSelection();
                this.j2.a();
                return true;
            } else if (i3 != 19 || this.j2.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    public final void B() {
        boolean z = true;
        boolean z3 = !TextUtils.isEmpty(this.j2.getText());
        int i3 = 0;
        if (!z3 && (!this.J2 || this.U2)) {
            z = false;
        }
        ImageView imageView = this.p2;
        if (!z) {
            i3 = 8;
        }
        imageView.setVisibility(i3);
        Drawable drawable = this.p2.getDrawable();
        if (drawable != null) {
            drawable.setState(z3 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void C() {
        int[] iArr = this.j2.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.l2.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.m2.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void D() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.j2;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.J2 && this.y2 != null) {
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            this.y2.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.y2), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void E() {
        int i3 = 0;
        if (!((this.M2 || this.R2) && !this.K2) || !(this.o2.getVisibility() == 0 || this.q2.getVisibility() == 0)) {
            i3 = 8;
        }
        this.m2.setVisibility(i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r2.R2 == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.M2
            r1 = 0
            if (r0 == 0) goto L_0x0021
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2.R2
            if (r0 == 0) goto L_0x0011
        L_0x000b:
            boolean r0 = r2.K2
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.R2
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            android.widget.ImageView r3 = r2.o2
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.F(boolean):void");
    }

    public final void G(boolean z) {
        this.K2 = z;
        int i3 = 0;
        int i4 = z ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.j2.getText());
        this.n2.setVisibility(i4);
        F(z3);
        this.k2.setVisibility(z ? 8 : 0);
        if (this.x2.getDrawable() == null || this.J2) {
            i3 = 8;
        }
        this.x2.setVisibility(i3);
        B();
        H(!z3);
        E();
    }

    public final void H(boolean z) {
        int i3 = 8;
        if (this.R2 && !this.K2 && z) {
            this.o2.setVisibility(8);
            i3 = 0;
        }
        this.q2.setVisibility(i3);
    }

    public void c() {
        if (!this.U2) {
            this.U2 = true;
            int imeOptions = this.j2.getImeOptions();
            this.V2 = imeOptions;
            this.j2.setImeOptions(imeOptions | 33554432);
            this.j2.setText("");
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.P2 = true;
        super.clearFocus();
        this.j2.clearFocus();
        this.j2.setImeVisibility(false);
        this.P2 = false;
    }

    public void e() {
        this.j2.setText("");
        SearchAutoComplete searchAutoComplete = this.j2;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.T2 = "";
        clearFocus();
        G(true);
        this.j2.setImeOptions(this.V2);
        this.U2 = false;
    }

    public int getImeOptions() {
        return this.j2.getImeOptions();
    }

    public int getInputType() {
        return this.j2.getInputType();
    }

    public int getMaxWidth() {
        return this.Q2;
    }

    public CharSequence getQuery() {
        return this.j2.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.N2;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.W2;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.D2;
        }
        return getContext().getText(this.W2.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.A2;
    }

    public int getSuggestionRowLayout() {
        return this.z2;
    }

    public h0.j.a.a getSuggestionsAdapter() {
        return this.L2;
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.Y2);
        post(this.Z2);
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z, int i3, int i4, int i5, int i6) {
        super.onLayout(z, i3, i4, i5, i6);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.j2;
            Rect rect = this.t2;
            searchAutoComplete.getLocationInWindow(this.v2);
            getLocationInWindow(this.w2);
            int[] iArr = this.v2;
            int i7 = iArr[1];
            int[] iArr2 = this.w2;
            int i8 = i7 - iArr2[1];
            int i9 = iArr[0] - iArr2[0];
            rect.set(i9, i8, searchAutoComplete.getWidth() + i9, searchAutoComplete.getHeight() + i8);
            Rect rect2 = this.u2;
            Rect rect3 = this.t2;
            rect2.set(rect3.left, 0, rect3.right, i6 - i4);
            o oVar = this.s2;
            if (oVar == null) {
                o oVar2 = new o(this.u2, this.t2, this.j2);
                this.s2 = oVar2;
                setTouchDelegate(oVar2);
                return;
            }
            oVar.a(this.u2, this.t2);
        }
    }

    public void onMeasure(int i3, int i4) {
        int i5;
        if (this.K2) {
            super.onMeasure(i3, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            int i6 = this.Q2;
            size = i6 > 0 ? Math.min(i6, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.Q2;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i5 = this.Q2) > 0) {
            size = Math.min(i5, size);
        }
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        G(savedState.q);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.q = this.K2;
        return savedState;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.Y2);
    }

    public final Intent q(String str, Uri uri, String str2, String str3, int i3, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.T2);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.X2;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i3 != 0) {
            intent.putExtra("action_key", i3);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.W2.getSearchActivity());
        return intent;
    }

    public final Intent r(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.X2;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i3 = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i3 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i3);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public boolean requestFocus(int i3, Rect rect) {
        if (this.P2 || !isFocusable()) {
            return false;
        }
        if (this.K2) {
            return super.requestFocus(i3, rect);
        }
        boolean requestFocus = this.j2.requestFocus(i3, rect);
        if (requestFocus) {
            G(false);
        }
        return requestFocus;
    }

    public void s() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.j2.refreshAutoCompleteResults();
            return;
        }
        n nVar = i2;
        SearchAutoComplete searchAutoComplete = this.j2;
        Objects.requireNonNull(nVar);
        n.a();
        Method method = nVar.a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        n nVar2 = i2;
        SearchAutoComplete searchAutoComplete2 = this.j2;
        Objects.requireNonNull(nVar2);
        n.a();
        Method method2 = nVar2.b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.X2 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            u();
        } else {
            y();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.J2 != z) {
            this.J2 = z;
            G(z);
            D();
        }
    }

    public void setImeOptions(int i3) {
        this.j2.setImeOptions(i3);
    }

    public void setInputType(int i3) {
        this.j2.setInputType(i3);
    }

    public void setMaxWidth(int i3) {
        this.Q2 = i3;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.F2 = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.G2 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.E2 = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.I2 = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.H2 = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.N2 = charSequence;
        D();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.O2 = z;
        h0.j.a.a aVar = this.L2;
        if (aVar instanceof q0) {
            ((q0) aVar).k2 = z ? 2 : 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.W2 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r7 == 0) goto L_0x006e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.j2
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.j2
            android.app.SearchableInfo r3 = r6.W2
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.W2
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L_0x0036
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.W2
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L_0x0036
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L_0x0036:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.j2
            r3.setInputType(r7)
            h0.j.a.a r7 = r6.L2
            if (r7 == 0) goto L_0x0042
            r7.b(r2)
        L_0x0042:
            android.app.SearchableInfo r7 = r6.W2
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L_0x006b
            h0.b.f.q0 r7 = new h0.b.f.q0
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.W2
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.a3
            r7.<init>(r3, r6, r4, r5)
            r6.L2 = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.j2
            r3.setAdapter(r7)
            h0.j.a.a r7 = r6.L2
            h0.b.f.q0 r7 = (h0.b.f.q0) r7
            boolean r3 = r6.O2
            if (r3 == 0) goto L_0x0068
            r3 = 2
            goto L_0x0069
        L_0x0068:
            r3 = r0
        L_0x0069:
            r7.k2 = r3
        L_0x006b:
            r6.D()
        L_0x006e:
            android.app.SearchableInfo r7 = r6.W2
            r3 = 0
            if (r7 == 0) goto L_0x009f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L_0x009f
            android.app.SearchableInfo r7 = r6.W2
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L_0x0084
            android.content.Intent r2 = r6.B2
            goto L_0x008e
        L_0x0084:
            android.app.SearchableInfo r7 = r6.W2
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L_0x008e
            android.content.Intent r2 = r6.C2
        L_0x008e:
            if (r2 == 0) goto L_0x009f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r0 = r3
        L_0x00a0:
            r6.R2 = r0
            if (r0 == 0) goto L_0x00ab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.j2
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        L_0x00ab:
            boolean r7 = r6.K2
            r6.G(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.M2 = z;
        G(this.K2);
    }

    public void setSuggestionsAdapter(h0.j.a.a aVar) {
        this.L2 = aVar;
        this.j2.setAdapter(aVar);
    }

    public void t(int i3, String str, String str2) {
        getContext().startActivity(q("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i3, (String) null));
    }

    public void u() {
        if (!TextUtils.isEmpty(this.j2.getText())) {
            this.j2.setText("");
            this.j2.requestFocus();
            this.j2.setImeVisibility(true);
        } else if (this.J2) {
            k kVar = this.F2;
            if (kVar == null || !kVar.a()) {
                clearFocus();
                G(true);
            }
        }
    }

    public boolean v(int i3) {
        int i4;
        Uri uri;
        String h2;
        m mVar = this.H2;
        if (mVar != null && mVar.b(i3)) {
            return false;
        }
        Cursor cursor = this.L2.q;
        if (cursor != null && cursor.moveToPosition(i3)) {
            Intent intent = null;
            try {
                int i5 = q0.e2;
                String h3 = q0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h3 == null) {
                    h3 = this.W2.getSuggestIntentAction();
                }
                if (h3 == null) {
                    h3 = "android.intent.action.SEARCH";
                }
                String str = h3;
                String h4 = q0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h4 == null) {
                    h4 = this.W2.getSuggestIntentData();
                }
                if (!(h4 == null || (h2 = q0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) == null)) {
                    h4 = h4 + "/" + Uri.encode(h2);
                }
                if (h4 == null) {
                    uri = null;
                } else {
                    uri = Uri.parse(h4);
                }
                intent = q(str, uri, q0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), q0.h(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, (String) null);
            } catch (RuntimeException e2) {
                try {
                    i4 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i4 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i4 + " returned exception.", e2);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e4) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e4);
                }
            }
        }
        this.j2.setImeVisibility(false);
        this.j2.dismissDropDown();
        return true;
    }

    public boolean w(int i3) {
        m mVar = this.H2;
        if (mVar != null && mVar.a(i3)) {
            return false;
        }
        Editable text = this.j2.getText();
        Cursor cursor = this.L2.q;
        if (cursor == null) {
            return true;
        }
        if (cursor.moveToPosition(i3)) {
            CharSequence c2 = this.L2.c(cursor);
            if (c2 != null) {
                setQuery(c2);
                return true;
            }
            setQuery(text);
            return true;
        }
        setQuery(text);
        return true;
    }

    public void x(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void y() {
        G(false);
        this.j2.requestFocus();
        this.j2.setImeVisibility(true);
        View.OnClickListener onClickListener = this.I2;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void z() {
        Editable text = this.j2.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            l lVar = this.E2;
            if (lVar == null || !lVar.b(text.toString())) {
                if (this.W2 != null) {
                    t(0, (String) null, text.toString());
                }
                this.j2.setImeVisibility(false);
                this.j2.dismissDropDown();
            }
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        Context context2 = context;
        this.t2 = new Rect();
        this.u2 = new Rect();
        this.v2 = new int[2];
        this.w2 = new int[2];
        this.Y2 = new b();
        this.Z2 = new c();
        this.a3 = new WeakHashMap<>();
        f fVar = new f();
        this.b3 = fVar;
        this.c3 = new g();
        h hVar = new h();
        this.d3 = hVar;
        i iVar = new i();
        this.e3 = iVar;
        j jVar = new j();
        this.f3 = jVar;
        this.g3 = new a();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.SearchView, i3, 0);
        w0 w0Var = new w0(context2, obtainStyledAttributes);
        LayoutInflater.from(context).inflate(w0Var.l(R.styleable.SearchView_layout, R.layout.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.j2 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.k2 = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.l2 = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.m2 = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.n2 = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.o2 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.p2 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.q2 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.x2 = imageView5;
        Drawable g2 = w0Var.g(R.styleable.SearchView_queryBackground);
        AtomicInteger atomicInteger = q.a;
        findViewById.setBackground(g2);
        findViewById2.setBackground(w0Var.g(R.styleable.SearchView_submitBackground));
        int i4 = R.styleable.SearchView_searchIcon;
        imageView.setImageDrawable(w0Var.g(i4));
        imageView2.setImageDrawable(w0Var.g(R.styleable.SearchView_goIcon));
        imageView3.setImageDrawable(w0Var.g(R.styleable.SearchView_closeIcon));
        imageView4.setImageDrawable(w0Var.g(R.styleable.SearchView_voiceIcon));
        imageView5.setImageDrawable(w0Var.g(i4));
        this.y2 = w0Var.g(R.styleable.SearchView_searchHintIcon);
        g0.a.b.b.a.y0(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.z2 = w0Var.l(R.styleable.SearchView_suggestionRowLayout, R.layout.abc_search_dropdown_item_icons_2line);
        this.A2 = w0Var.l(R.styleable.SearchView_commitIcon, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.g3);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.c3);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(w0Var.a(R.styleable.SearchView_iconifiedByDefault, true));
        int f2 = w0Var.f(R.styleable.SearchView_android_maxWidth, -1);
        if (f2 != -1) {
            setMaxWidth(f2);
        }
        this.D2 = w0Var.n(R.styleable.SearchView_defaultQueryHint);
        this.N2 = w0Var.n(R.styleable.SearchView_queryHint);
        int j3 = w0Var.j(R.styleable.SearchView_android_imeOptions, -1);
        if (j3 != -1) {
            setImeOptions(j3);
        }
        int j4 = w0Var.j(R.styleable.SearchView_android_inputType, -1);
        if (j4 != -1) {
            setInputType(j4);
        }
        setFocusable(w0Var.a(R.styleable.SearchView_android_focusable, true));
        obtainStyledAttributes.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.B2 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.C2 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.r2 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        G(this.J2);
        D();
    }
}
