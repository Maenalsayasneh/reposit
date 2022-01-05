package i0.j.d.h.a;

import android.text.Editable;
import android.util.Patterns;
import com.google.android.material.textfield.TextInputEditText;
import com.instabug.featuresrequest.R;
import com.instabug.featuresrequest.ui.a.b;
import com.instabug.library.util.SimpleTextWatcher;

/* compiled from: AddCommentFragment */
public class f extends SimpleTextWatcher {
    public final /* synthetic */ b c;

    public f(b bVar) {
        this.c = bVar;
    }

    public void afterTextChanged(Editable editable) {
        super.afterTextChanged(editable);
        b bVar = this.c;
        TextInputEditText textInputEditText = bVar.Y1;
        if (textInputEditText != null && bVar.a2 != null && bVar.b2 != null) {
            if (textInputEditText.getText() == null || !this.c.Y1.getText().toString().trim().isEmpty()) {
                b bVar2 = this.c;
                bVar2.J0(false, bVar2.q, bVar2.b2, bVar2.getString(R.string.feature_request_str_add_comment_comment_empty));
                if (!this.c.c.m()) {
                    this.c.A0(Boolean.TRUE);
                } else if (this.c.a2.getText() == null || this.c.a2.getText().toString().trim().isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(this.c.a2.getText().toString()).matches()) {
                    this.c.A0(Boolean.FALSE);
                } else {
                    this.c.A0(Boolean.TRUE);
                }
            } else {
                b bVar3 = this.c;
                bVar3.J0(true, bVar3.q, bVar3.b2, bVar3.getString(R.string.feature_request_str_add_comment_comment_empty));
                this.c.A0(Boolean.FALSE);
            }
        }
    }
}
