package h0.m.b;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import h0.m.a.a;

/* compiled from: EmojiTransformationMethod */
public class h implements TransformationMethod {
    public final TransformationMethod c;

    public h(TransformationMethod transformationMethod) {
        this.c = transformationMethod;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.c;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || a.a().b() != 1) ? charSequence : a.a().f(charSequence);
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.c;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
