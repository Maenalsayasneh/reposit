package i0.h.a.c.b0;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.google.android.material.timepicker.TimeModel;

/* compiled from: TimePickerTextInputKeyController */
public class h implements TextView.OnEditorActionListener, View.OnKeyListener {
    public final ChipTextInputComboView c;
    public final ChipTextInputComboView d;
    public final TimeModel q;
    public boolean x = false;

    public h(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.c = chipTextInputComboView;
        this.d = chipTextInputComboView2;
        this.q = timeModel;
    }

    public final void a(int i) {
        boolean z = true;
        this.d.setChecked(i == 12);
        ChipTextInputComboView chipTextInputComboView = this.c;
        if (i != 10) {
            z = false;
        }
        chipTextInputComboView.setChecked(z);
        this.q.Y1 = i;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z = i == 5;
        if (z) {
            a(12);
        }
        return z;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.x) {
            return false;
        }
        boolean z = true;
        this.x = true;
        EditText editText = (EditText) view;
        if (this.q.Y1 == 12) {
            if (i == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
                a(10);
                this.x = false;
                return z;
            }
        } else {
            Editable text = editText.getText();
            if (text != null) {
                if (i >= 7 && i <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
                    a(12);
                    this.x = false;
                    return z;
                }
            }
        }
        z = false;
        this.x = false;
        return z;
    }
}
