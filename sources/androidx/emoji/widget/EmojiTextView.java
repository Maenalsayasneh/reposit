package androidx.emoji.widget;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;
import g0.a.b.b.a;
import h0.m.b.f;

public class EmojiTextView extends TextView {
    public f c;
    public boolean d;

    public EmojiTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.d) {
            this.d = true;
            getEmojiTextViewHelper().a.c();
        }
    }

    private f getEmojiTextViewHelper() {
        if (this.c == null) {
            this.c = new f(this);
        }
        return this.c;
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().a.b(z);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.G0(this, callback));
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a.a(inputFilterArr));
    }
}
