package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textview.MaterialTextView;
import h0.b.a.n;
import h0.b.f.d;
import h0.b.f.f;
import h0.b.f.g;
import i0.h.a.c.s.a;
import i0.h.a.c.z.p;

public class MaterialComponentsViewInflater extends n {
    public d a(Context context, AttributeSet attributeSet) {
        return new p(context, attributeSet);
    }

    public f b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    public g c(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    public h0.b.f.p d(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
