package androidx.emoji.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.inputmethodservice.ExtractEditText;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.emoji.R;
import h0.m.b.a;
import java.util.Objects;

public class EmojiExtractEditText extends ExtractEditText {
    public a c;
    public boolean d;

    public EmojiExtractEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.d) {
            this.d = true;
            int i = 0;
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.EmojiEditText, 16842862, 0);
                int integer = obtainStyledAttributes.getInteger(R.styleable.EmojiEditText_maxEmojiCount, Integer.MAX_VALUE);
                obtainStyledAttributes.recycle();
                i = integer;
            }
            setMaxEmojiCount(i);
            setKeyListener(super.getKeyListener());
        }
    }

    private a getEmojiEditTextHelper() {
        if (this.c == null) {
            this.c = new a(this);
        }
        return this.c;
    }

    public int getEmojiReplaceStrategy() {
        return getEmojiEditTextHelper().c;
    }

    public int getMaxEmojiCount() {
        return getEmojiEditTextHelper().b;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a emojiEditTextHelper = getEmojiEditTextHelper();
        Objects.requireNonNull(emojiEditTextHelper);
        if (onCreateInputConnection == null) {
            return null;
        }
        return emojiEditTextHelper.a.b(onCreateInputConnection, editorInfo);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g0.a.b.b.a.G0(this, callback));
    }

    public void setEmojiReplaceStrategy(int i) {
        a emojiEditTextHelper = getEmojiEditTextHelper();
        emojiEditTextHelper.c = i;
        emojiEditTextHelper.a.c(i);
    }

    public void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            a emojiEditTextHelper = getEmojiEditTextHelper();
            Objects.requireNonNull(emojiEditTextHelper);
            g0.a.b.b.a.m(keyListener, "keyListener cannot be null");
            keyListener = emojiEditTextHelper.a.a(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    public void setMaxEmojiCount(int i) {
        a emojiEditTextHelper = getEmojiEditTextHelper();
        Objects.requireNonNull(emojiEditTextHelper);
        g0.a.b.b.a.l(i, "maxEmojiCount should be greater than 0");
        emojiEditTextHelper.b = i;
        emojiEditTextHelper.a.d(i);
    }
}
