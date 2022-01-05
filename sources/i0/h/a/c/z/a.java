package i0.h.a.c.z;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.R;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: ClearTextEndIconDelegate */
public class a extends m {
    public final TextWatcher d = new C0145a();
    public final View.OnFocusChangeListener e = new b();
    public final TextInputLayout.f f = new c();
    public final TextInputLayout.g g = new d();
    public AnimatorSet h;
    public ValueAnimator i;

    /* renamed from: i0.h.a.c.z.a$a  reason: collision with other inner class name */
    /* compiled from: ClearTextEndIconDelegate */
    public class C0145a implements TextWatcher {
        public C0145a() {
        }

        public void afterTextChanged(Editable editable) {
            if (a.this.a.getSuffixText() == null) {
                a.this.d(editable.length() > 0);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: ClearTextEndIconDelegate */
    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        public void onFocusChange(View view, boolean z) {
            boolean z2 = true;
            boolean z3 = !TextUtils.isEmpty(((EditText) view).getText());
            a aVar = a.this;
            if (!z3 || !z) {
                z2 = false;
            }
            aVar.d(z2);
        }
    }

    /* compiled from: ClearTextEndIconDelegate */
    public class c implements TextInputLayout.f {
        public c() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if ((r0.getText().length() > 0) != false) goto L_0x001d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(com.google.android.material.textfield.TextInputLayout r5) {
            /*
                r4 = this;
                android.widget.EditText r0 = r5.getEditText()
                boolean r1 = r0.hasFocus()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x001c
                android.text.Editable r1 = r0.getText()
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0018
                r1 = r2
                goto L_0x0019
            L_0x0018:
                r1 = r3
            L_0x0019:
                if (r1 == 0) goto L_0x001c
                goto L_0x001d
            L_0x001c:
                r2 = r3
            L_0x001d:
                r5.setEndIconVisible(r2)
                r5.setEndIconCheckable(r3)
                i0.h.a.c.z.a r5 = i0.h.a.c.z.a.this
                android.view.View$OnFocusChangeListener r5 = r5.e
                r0.setOnFocusChangeListener(r5)
                i0.h.a.c.z.a r5 = i0.h.a.c.z.a.this
                android.text.TextWatcher r5 = r5.d
                r0.removeTextChangedListener(r5)
                i0.h.a.c.z.a r5 = i0.h.a.c.z.a.this
                android.text.TextWatcher r5 = r5.d
                r0.addTextChangedListener(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.h.a.c.z.a.c.a(com.google.android.material.textfield.TextInputLayout):void");
        }
    }

    /* compiled from: ClearTextEndIconDelegate */
    public class d implements TextInputLayout.g {

        /* renamed from: i0.h.a.c.z.a$d$a  reason: collision with other inner class name */
        /* compiled from: ClearTextEndIconDelegate */
        public class C0146a implements Runnable {
            public final /* synthetic */ EditText c;

            public C0146a(EditText editText) {
                this.c = editText;
            }

            public void run() {
                this.c.removeTextChangedListener(a.this.d);
            }
        }

        public d() {
        }

        public void a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 2) {
                editText.post(new C0146a(editText));
                if (editText.getOnFocusChangeListener() == a.this.e) {
                    editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
        }
    }

    /* compiled from: ClearTextEndIconDelegate */
    public class e implements View.OnClickListener {
        public e() {
        }

        public void onClick(View view) {
            Editable text = a.this.a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.a.refreshEndIconDrawableState();
        }
    }

    public a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    public void a() {
        this.a.setEndIconDrawable(h0.b.b.a.a.a(this.b, R.drawable.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.a.setEndIconOnClickListener(new e());
        this.a.addOnEditTextAttachedListener(this.f);
        this.a.addOnEndIconChangedListener(this.g);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(i0.h.a.c.a.a.d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new e(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = i0.h.a.c.a.a.a;
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(100);
        ofFloat2.addUpdateListener(new d(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.h = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.h.addListener(new b(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(100);
        ofFloat3.addUpdateListener(new d(this));
        this.i = ofFloat3;
        ofFloat3.addListener(new c(this));
    }

    public void c(boolean z) {
        if (this.a.getSuffixText() != null) {
            d(z);
        }
    }

    public final void d(boolean z) {
        boolean z2 = this.a.isEndIconVisible() == z;
        if (z && !this.h.isRunning()) {
            this.i.cancel();
            this.h.start();
            if (z2) {
                this.h.end();
            }
        } else if (!z) {
            this.h.cancel();
            this.i.start();
            if (z2) {
                this.i.end();
            }
        }
    }
}
