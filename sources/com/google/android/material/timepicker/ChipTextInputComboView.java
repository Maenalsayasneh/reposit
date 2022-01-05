package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import i0.h.a.c.q.i;
import java.util.Arrays;

public class ChipTextInputComboView extends FrameLayout implements Checkable {
    public final Chip c;
    public final TextInputLayout d;
    public final EditText q;
    public TextWatcher x;

    public class b extends i {
        public b(a aVar) {
        }

        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
                chipTextInputComboView.c.setText(TimeModel.a(chipTextInputComboView.getResources(), "00", "%02d"));
                return;
            }
            ChipTextInputComboView chipTextInputComboView2 = ChipTextInputComboView.this;
            chipTextInputComboView2.c.setText(TimeModel.a(chipTextInputComboView2.getResources(), editable, "%02d"));
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, this, false);
        this.c = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, this, false);
        this.d = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.q = editText;
        editText.setVisibility(4);
        b bVar = new b((a) null);
        this.x = bVar;
        editText.addTextChangedListener(bVar);
        c();
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        editText.setSaveEnabled(false);
    }

    public void a(InputFilter inputFilter) {
        InputFilter[] filters = this.q.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.q.setFilters(inputFilterArr);
    }

    public void b(CharSequence charSequence) {
        this.c.setText(TimeModel.a(getResources(), charSequence, "%02d"));
        if (!TextUtils.isEmpty(this.q.getText())) {
            this.q.removeTextChangedListener(this.x);
            this.q.setText((CharSequence) null);
            this.q.addTextChangedListener(this.x);
        }
    }

    public final void c() {
        this.q.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public boolean isChecked() {
        return this.c.isChecked();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c();
    }

    public void setChecked(boolean z) {
        this.c.setChecked(z);
        int i = 0;
        this.q.setVisibility(z ? 0 : 4);
        Chip chip = this.c;
        if (z) {
            i = 8;
        }
        chip.setVisibility(i);
        if (isChecked()) {
            this.q.requestFocus();
            if (!TextUtils.isEmpty(this.q.getText())) {
                EditText editText = this.q;
                editText.setSelection(editText.getText().length());
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }

    public void setTag(int i, Object obj) {
        this.c.setTag(i, obj);
    }

    public void toggle() {
        this.c.toggle();
    }
}
