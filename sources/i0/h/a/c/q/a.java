package i0.h.a.c.q;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;
import h0.i.i.g0.b;

/* compiled from: CheckableImageButton */
public class a extends h0.i.i.a {
    public final /* synthetic */ CheckableImageButton a;

    public a(CheckableImageButton checkableImageButton) {
        this.a = checkableImageButton;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a.isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(View view, b bVar) {
        super.onInitializeAccessibilityNodeInfo(view, bVar);
        bVar.b.setCheckable(this.a.y);
        bVar.b.setChecked(this.a.isChecked());
    }
}
