package h0.m.b;

import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* compiled from: EmojiEditTextHelper */
public final class a {
    public final b a;
    public int b = Integer.MAX_VALUE;
    public int c = 0;

    /* renamed from: h0.m.b.a$a  reason: collision with other inner class name */
    /* compiled from: EmojiEditTextHelper */
    public static class C0058a extends b {
        public final EditText a;
        public final g b;

        public C0058a(EditText editText) {
            this.a = editText;
            g gVar = new g(editText);
            this.b = gVar;
            editText.addTextChangedListener(gVar);
            if (b.b == null) {
                synchronized (b.a) {
                    if (b.b == null) {
                        b.b = new b();
                    }
                }
            }
            editText.setEditableFactory(b.b);
        }

        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            return new e(keyListener);
        }

        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            if (inputConnection instanceof c) {
                return inputConnection;
            }
            return new c(this.a, inputConnection, editorInfo);
        }

        public void c(int i) {
            this.b.x = i;
        }

        public void d(int i) {
            this.b.q = i;
        }
    }

    /* compiled from: EmojiEditTextHelper */
    public static class b {
        public KeyListener a(KeyListener keyListener) {
            throw null;
        }

        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        public void c(int i) {
            throw null;
        }

        public void d(int i) {
            throw null;
        }
    }

    public a(EditText editText) {
        g0.a.b.b.a.m(editText, "editText cannot be null");
        this.a = new C0058a(editText);
    }
}
