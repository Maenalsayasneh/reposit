package h0.m.b;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* compiled from: EmojiTextViewHelper */
public final class f {
    public final b a;

    /* compiled from: EmojiTextViewHelper */
    public static class a extends b {
        public final TextView a;
        public final d b;

        public a(TextView textView) {
            this.a = textView;
            this.b = new d(textView);
        }

        public InputFilter[] a(InputFilter[] inputFilterArr) {
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter instanceof d) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, r0);
            inputFilterArr2[r0] = this.b;
            return inputFilterArr2;
        }

        public void b(boolean z) {
            if (z) {
                c();
            }
        }

        public void c() {
            TransformationMethod transformationMethod = this.a.getTransformationMethod();
            if (transformationMethod != null && !(transformationMethod instanceof PasswordTransformationMethod)) {
                TextView textView = this.a;
                if (!(transformationMethod instanceof h)) {
                    transformationMethod = new h(transformationMethod);
                }
                textView.setTransformationMethod(transformationMethod);
            }
        }
    }

    /* compiled from: EmojiTextViewHelper */
    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public void b(boolean z) {
            throw null;
        }

        public void c() {
            throw null;
        }
    }

    public f(TextView textView) {
        g0.a.b.b.a.m(textView, "textView cannot be null");
        this.a = new a(textView);
    }
}
