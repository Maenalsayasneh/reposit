package h0.m.b;

import android.annotation.SuppressLint;
import android.text.Editable;

/* compiled from: EmojiEditableFactory */
public final class b extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile Editable.Factory b;
    public static Class<?> c;

    @SuppressLint({"PrivateApi"})
    public b() {
        try {
            c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, getClass().getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = c;
        if (cls != null) {
            return new i(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
