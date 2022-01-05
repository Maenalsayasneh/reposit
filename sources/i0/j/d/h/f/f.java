package i0.j.d.h.f;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputEditText;
import com.instabug.featuresrequest.ui.e.c;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.util.SimpleTextWatcher;
import i0.j.d.e.a;
import java.util.Objects;

/* compiled from: AddNewFeatureFragment */
public class f extends SimpleTextWatcher {
    public final /* synthetic */ c c;

    public f(c cVar) {
        this.c = cVar;
    }

    public void afterTextChanged(Editable editable) {
        c cVar = this.c;
        int i = c.c;
        if (cVar.presenter != null) {
            if (a.d().c()) {
                String obj = editable.toString();
                Objects.requireNonNull((i) this.c.presenter);
                if (!obj.equals(InstabugCore.getEnteredEmail())) {
                    if (this.c.W() != null) {
                        TextInputEditText textInputEditText = this.c.Y1;
                        if (!(textInputEditText == null || textInputEditText.getText() == null || this.c.Y1.getText().toString().trim().isEmpty())) {
                            this.c.A0(Boolean.TRUE);
                        }
                    } else {
                        this.c.A0(Boolean.FALSE);
                    }
                }
            }
            if (!TextUtils.isEmpty(editable.toString())) {
                this.c.h2.setVisibility(8);
            } else {
                this.c.h2.setVisibility(0);
            }
        }
    }
}
