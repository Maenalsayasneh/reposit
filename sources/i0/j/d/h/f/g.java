package i0.j.d.h.f;

import android.text.Editable;
import android.util.Patterns;
import com.instabug.featuresrequest.R;
import com.instabug.featuresrequest.ui.e.c;
import com.instabug.library.util.SimpleTextWatcher;
import i0.j.d.e.a;

/* compiled from: AddNewFeatureFragment */
public class g extends SimpleTextWatcher {
    public final /* synthetic */ c c;

    public g(c cVar) {
        this.c = cVar;
    }

    public void afterTextChanged(Editable editable) {
        super.afterTextChanged(editable);
        if (this.c.Y1.getText() == null || !this.c.Y1.getText().toString().trim().isEmpty()) {
            c cVar = this.c;
            cVar.I0(false, cVar.d, cVar.c2, cVar.getString(R.string.feature_requests_new_err_msg_required));
            if (!a.d().c()) {
                this.c.A0(Boolean.TRUE);
            } else if (this.c.b2.getText() == null || this.c.b2.getText().toString().trim().isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(this.c.b2.getText().toString()).matches()) {
                this.c.A0(Boolean.FALSE);
            } else {
                this.c.A0(Boolean.TRUE);
            }
        } else {
            c cVar2 = this.c;
            cVar2.I0(true, cVar2.d, cVar2.c2, cVar2.getString(R.string.feature_requests_new_err_msg_required));
            this.c.A0(Boolean.FALSE);
        }
    }
}
