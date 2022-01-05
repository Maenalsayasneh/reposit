package i0.h.a.c.z;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.R;
import com.google.android.material.textfield.TextInputLayout;
import i0.h.a.c.q.i;

/* compiled from: PasswordToggleEndIconDelegate */
public class r extends m {
    public final TextWatcher d = new a();
    public final TextInputLayout.f e = new b();
    public final TextInputLayout.g f = new c();

    /* compiled from: PasswordToggleEndIconDelegate */
    public class a extends i {
        public a() {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            r rVar = r.this;
            rVar.c.setChecked(!r.d(rVar));
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate */
    public class b implements TextInputLayout.f {
        public b() {
        }

        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            r rVar = r.this;
            rVar.c.setChecked(!r.d(rVar));
            editText.removeTextChangedListener(r.this.d);
            editText.addTextChangedListener(r.this.d);
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate */
    public class c implements TextInputLayout.g {

        /* compiled from: PasswordToggleEndIconDelegate */
        public class a implements Runnable {
            public final /* synthetic */ EditText c;

            public a(EditText editText) {
                this.c = editText;
            }

            public void run() {
                this.c.removeTextChangedListener(r.this.d);
            }
        }

        public c() {
        }

        public void a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.post(new a(editText));
            }
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate */
    public class d implements View.OnClickListener {
        public d() {
        }

        public void onClick(View view) {
            EditText editText = r.this.a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                if (r.d(r.this)) {
                    editText.setTransformationMethod((TransformationMethod) null);
                } else {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
                r.this.a.refreshEndIconDrawableState();
            }
        }
    }

    public r(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    public static boolean d(r rVar) {
        EditText editText = rVar.a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    public void a() {
        this.a.setEndIconDrawable(h0.b.b.a.a.a(this.b, R.drawable.design_password_eye));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.password_toggle_content_description));
        this.a.setEndIconOnClickListener(new d());
        this.a.addOnEditTextAttachedListener(this.e);
        this.a.addOnEndIconChangedListener(this.f);
        EditText editText = this.a.getEditText();
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
