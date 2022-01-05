package i0.j.d.h.a;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputEditText;
import com.instabug.featuresrequest.ui.a.b;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.util.SimpleTextWatcher;
import java.util.Objects;

/* compiled from: AddCommentFragment */
public class e extends SimpleTextWatcher {
    public final /* synthetic */ b c;

    public e(b bVar) {
        this.c = bVar;
    }

    public void afterTextChanged(Editable editable) {
        g gVar = this.c.c;
        if (gVar != null) {
            if (gVar.m()) {
                String obj = editable.toString();
                Objects.requireNonNull(this.c.c);
                if (!obj.equals(InstabugCore.getEnteredEmail())) {
                    if (this.c.I0()) {
                        TextInputEditText textInputEditText = this.c.Y1;
                        if (!(textInputEditText == null || textInputEditText.getText() == null || this.c.Y1.getText().toString().trim().isEmpty())) {
                            this.c.A0(Boolean.TRUE);
                        }
                    } else {
                        this.c.A0(Boolean.FALSE);
                    }
                }
            }
            if (this.c.f2 != null) {
                if (!TextUtils.isEmpty(editable.toString())) {
                    this.c.f2.setVisibility(8);
                } else {
                    this.c.f2.setVisibility(0);
                }
            }
        }
    }
}
