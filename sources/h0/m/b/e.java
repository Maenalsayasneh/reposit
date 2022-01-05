package h0.m.b;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import h0.m.a.a;
import h0.m.a.c;

/* compiled from: EmojiKeyListener */
public final class e implements KeyListener {
    public final KeyListener c;

    public e(KeyListener keyListener) {
        this.c = keyListener;
    }

    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.c.clearMetaKeyState(view, editable, i);
    }

    public int getInputType() {
        return this.c.getInputType();
    }

    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        Object obj = a.a;
        if (i == 67) {
            z = c.a(editable, keyEvent, false);
        } else if (i != 112) {
            z = false;
        } else {
            z = c.a(editable, keyEvent, true);
        }
        if (z) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || this.c.onKeyDown(view, editable, i, keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.c.onKeyOther(view, editable, keyEvent);
    }

    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.c.onKeyUp(view, editable, i, keyEvent);
    }
}
