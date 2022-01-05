package com.instabug.survey.ui.i.l;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.instabug.survey.R;
import com.instabug.survey.models.Survey;
import com.instabug.survey.models.b;
import h0.o.a.k;
import i0.j.f.s.g.e;

/* compiled from: TextQuestionFragment */
public class a extends com.instabug.survey.ui.i.a implements TextWatcher {
    public EditText b2;
    public Runnable c2;

    public String J0() {
        EditText editText = this.b2;
        if (editText == null || editText.getText().toString().trim().equals("")) {
            return null;
        }
        return this.b2.getText().toString();
    }

    public void afterTextChanged(Editable editable) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.b(editable.toString());
            e eVar = this.d;
            if (eVar != null) {
                b bVar2 = this.c;
                com.instabug.survey.ui.i.b bVar3 = (com.instabug.survey.ui.i.b) eVar;
                Survey survey = bVar3.c;
                if (survey != null && survey.getQuestions() != null) {
                    bVar3.c.getQuestions().get(bVar3.I0(bVar2.c)).b(bVar2.y);
                    String str = bVar2.y;
                    boolean z = false;
                    if (str != null) {
                        if (str.trim().length() > 0) {
                            z = true;
                        }
                        bVar3.K0(z);
                    } else if (!bVar3.c.isNPSSurvey()) {
                        bVar3.K0(false);
                    }
                }
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public int getLayout() {
        return R.layout.instabug_dialog_text_survey;
    }

    public void initViews(View view, Bundle bundle) {
        super.initViews(view, bundle);
        this.q = (TextView) view.findViewById(R.id.instabug_text_view_question);
        EditText editText = (EditText) view.findViewById(R.id.instabug_edit_text_answer);
        this.b2 = editText;
        editText.getLayoutParams().height = getResources().getDimensionPixelSize(R.dimen.question_answer_text_height);
        ((RelativeLayout.LayoutParams) this.b2.getLayoutParams()).bottomMargin = 10;
        K0();
    }

    public void o() {
        EditText editText;
        if (getActivity() != null && (editText = this.b2) != null) {
            editText.requestFocus();
            k activity = getActivity();
            ((InputMethodManager) activity.getSystemService("input_method")).showSoftInput(this.b2, 1);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        if (getArguments() != null) {
            this.c = (b) getArguments().getSerializable("question");
        }
    }

    public void onDestroy() {
        this.d = null;
        super.onDestroy();
    }

    public void onDestroyView() {
        super.onDestroyView();
        EditText editText = this.b2;
        if (editText != null) {
            editText.removeTextChangedListener(this);
            Runnable runnable = this.c2;
            if (runnable != null) {
                this.b2.removeCallbacks(runnable);
                this.c2 = null;
                this.b2 = null;
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        EditText editText;
        super.onViewCreated(view, bundle);
        view.setFocusableInTouchMode(true);
        b bVar = this.c;
        if (bVar != null && (textView = this.q) != null && this.b2 != null) {
            textView.setText(bVar.d);
            this.b2.setHint(getString(R.string.instabug_str_hint_enter_your_answer));
            i0.j.f.s.g.k.a aVar = new i0.j.f.s.g.k.a(this);
            this.c2 = aVar;
            this.b2.postDelayed(aVar, 300);
            String str = bVar.y;
            if (str != null && !str.isEmpty() && (editText = this.b2) != null) {
                editText.setText(bVar.y);
            }
        }
    }
}
