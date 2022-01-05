package com.clubhouse.android.core.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import com.clubhouse.android.core.R;
import h0.b.f.y;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR*\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n8B@BX\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00148\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006!"}, d2 = {"Lcom/clubhouse/android/core/ui/TriStateButton;", "Lh0/b/f/y;", "Lm0/i;", "toggle", "()V", "", "extraSpace", "", "onCreateDrawableState", "(I)[I", "", "x", "Ljava/lang/String;", "_blockedText", "value", "blockedText", "getBlockedText", "()Ljava/lang/String;", "setBlockedText", "(Ljava/lang/String;)V", "", "y", "Z", "isBlocked", "()Z", "setBlocked", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: TriStateButton.kt */
public final class TriStateButton extends y {
    public static final int[] q = {R.attr.state_blocked};
    public String x;
    public boolean y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TriStateButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.e(context, "context");
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.TriStateButton, 0, 0);
        try {
            String string = obtainStyledAttributes.getString(R.styleable.TriStateButton_textBlocked);
            this.x = string == null ? "" : string;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final String getBlockedText() {
        String str = this.x;
        if (str != null) {
            return str;
        }
        i.m("_blockedText");
        throw null;
    }

    private final void setBlockedText(String str) {
        this.x = str;
        if (this.y) {
            setText(str);
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.y) {
            ToggleButton.mergeDrawableStates(onCreateDrawableState, q);
        }
        i.d(onCreateDrawableState, "drawableState");
        return onCreateDrawableState;
    }

    public final void setBlocked(boolean z) {
        this.y = z;
        if (z) {
            setChecked(false);
            setText(getBlockedText());
        }
        refreshDrawableState();
    }

    public void toggle() {
        if (!this.y) {
            super.toggle();
        }
    }
}
