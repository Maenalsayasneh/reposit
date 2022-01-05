package i0.j.b.r.a.a;

import android.text.method.PasswordTransformationMethod;
import android.view.View;

/* compiled from: AsteriskPasswordTransformationMethod */
public class a extends PasswordTransformationMethod {

    /* renamed from: i0.j.b.r.a.a.a$a  reason: collision with other inner class name */
    /* compiled from: AsteriskPasswordTransformationMethod */
    public static class C0161a implements CharSequence {
        public CharSequence c;

        public C0161a(CharSequence charSequence) {
            this.c = charSequence;
        }

        public char charAt(int i) {
            return '*';
        }

        public int length() {
            return this.c.length();
        }

        public CharSequence subSequence(int i, int i2) {
            return this.c.subSequence(i, i2);
        }
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        return new C0161a(charSequence);
    }
}
