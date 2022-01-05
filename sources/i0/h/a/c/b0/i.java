package i0.h.a.c.b0;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.google.android.material.timepicker.TimeModel;
import com.google.android.material.timepicker.TimePickerView;
import h0.i.i.q;
import java.util.Locale;
import java.util.Objects;

/* compiled from: TimePickerTextInputPresenter */
public class i implements TimePickerView.d, g {
    public final ChipTextInputComboView Y1;
    public final h Z1;
    public final EditText a2;
    public final EditText b2;
    public final LinearLayout c;
    public MaterialButtonToggleGroup c2;
    public final TimeModel d;
    public final TextWatcher q;
    public final TextWatcher x;
    public final ChipTextInputComboView y;

    /* compiled from: TimePickerTextInputPresenter */
    public class a extends i0.h.a.c.q.i {
        public a() {
        }

        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    TimeModel timeModel = i.this.d;
                    Objects.requireNonNull(timeModel);
                    timeModel.y = 0;
                    return;
                }
                int parseInt = Integer.parseInt(editable.toString());
                TimeModel timeModel2 = i.this.d;
                Objects.requireNonNull(timeModel2);
                timeModel2.y = parseInt % 60;
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* compiled from: TimePickerTextInputPresenter */
    public class b extends i0.h.a.c.q.i {
        public b() {
        }

        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    i.this.d.d(0);
                    return;
                }
                i.this.d.d(Integer.parseInt(editable.toString()));
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* compiled from: TimePickerTextInputPresenter */
    public class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View view) {
            i.this.c(((Integer) view.getTag(R.id.selection_type)).intValue());
        }
    }

    public i(LinearLayout linearLayout, TimeModel timeModel) {
        a aVar = new a();
        this.q = aVar;
        b bVar = new b();
        this.x = bVar;
        this.c = linearLayout;
        this.d = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_minute_text_input);
        this.y = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_hour_text_input);
        this.Y1 = chipTextInputComboView2;
        int i = R.id.material_label;
        ((TextView) chipTextInputComboView.findViewById(i)).setText(resources.getString(R.string.material_timepicker_minute));
        ((TextView) chipTextInputComboView2.findViewById(i)).setText(resources.getString(R.string.material_timepicker_hour));
        int i2 = R.id.selection_type;
        chipTextInputComboView.setTag(i2, 12);
        chipTextInputComboView2.setTag(i2, 10);
        if (timeModel.q == 0) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) linearLayout.findViewById(R.id.material_clock_period_toggle);
            this.c2 = materialButtonToggleGroup;
            materialButtonToggleGroup.Y1.add(new j(this));
            this.c2.setVisibility(0);
            e();
        }
        c cVar = new c();
        chipTextInputComboView2.setOnClickListener(cVar);
        chipTextInputComboView.setOnClickListener(cVar);
        chipTextInputComboView2.a(timeModel.d);
        chipTextInputComboView.a(timeModel.c);
        EditText editText = chipTextInputComboView2.d.getEditText();
        this.a2 = editText;
        EditText editText2 = chipTextInputComboView.d.getEditText();
        this.b2 = editText2;
        h hVar = new h(chipTextInputComboView2, chipTextInputComboView, timeModel);
        this.Z1 = hVar;
        q.p(chipTextInputComboView2.c, new a(linearLayout.getContext(), R.string.material_hour_selection));
        q.p(chipTextInputComboView.c, new a(linearLayout.getContext(), R.string.material_minute_selection));
        editText.addTextChangedListener(bVar);
        editText2.addTextChangedListener(aVar);
        b(timeModel);
        TextInputLayout textInputLayout = chipTextInputComboView2.d;
        TextInputLayout textInputLayout2 = chipTextInputComboView.d;
        EditText editText3 = textInputLayout.getEditText();
        EditText editText4 = textInputLayout2.getEditText();
        editText3.setImeOptions(268435461);
        editText4.setImeOptions(268435462);
        editText3.setOnEditorActionListener(hVar);
        editText3.setOnKeyListener(hVar);
        editText4.setOnKeyListener(hVar);
    }

    public void J() {
        b(this.d);
    }

    public void a() {
        this.c.setVisibility(0);
    }

    public final void b(TimeModel timeModel) {
        this.a2.removeTextChangedListener(this.x);
        this.b2.removeTextChangedListener(this.q);
        Locale locale = this.c.getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", new Object[]{Integer.valueOf(timeModel.y)});
        String format2 = String.format(locale, "%02d", new Object[]{Integer.valueOf(timeModel.c())});
        this.y.b(format);
        this.Y1.b(format2);
        this.a2.addTextChangedListener(this.x);
        this.b2.addTextChangedListener(this.q);
        e();
    }

    public void c(int i) {
        this.d.Y1 = i;
        boolean z = true;
        this.y.setChecked(i == 12);
        ChipTextInputComboView chipTextInputComboView = this.Y1;
        if (i != 10) {
            z = false;
        }
        chipTextInputComboView.setChecked(z);
        e();
    }

    public void d() {
        View focusedChild = this.c.getFocusedChild();
        if (focusedChild == null) {
            this.c.setVisibility(8);
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) h0.i.b.a.getSystemService(this.c.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(focusedChild.getWindowToken(), 0);
        }
        this.c.setVisibility(8);
    }

    public final void e() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.c2;
        if (materialButtonToggleGroup != null) {
            materialButtonToggleGroup.b(this.d.Z1 == 0 ? R.id.material_clock_period_am_button : R.id.material_clock_period_pm_button);
        }
    }
}
