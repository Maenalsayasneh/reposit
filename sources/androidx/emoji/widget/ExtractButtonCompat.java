package androidx.emoji.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.Button;
import g0.a.b.b.a;

public class ExtractButtonCompat extends Button {
    public ExtractButtonCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean hasWindowFocus() {
        return isEnabled() && getVisibility() == 0;
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.G0(this, callback));
    }
}
