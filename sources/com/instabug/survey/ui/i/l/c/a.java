package com.instabug.survey.ui.i.l.c;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.instabug.survey.R;
import com.instabug.survey.models.Survey;
import com.instabug.survey.ui.SurveyActivity;

/* compiled from: PartialTextQuestionFragment */
public class a extends com.instabug.survey.ui.i.l.a implements View.OnClickListener {
    public static final /* synthetic */ int d2 = 0;

    public void initViews(View view, Bundle bundle) {
        EditText editText;
        super.initViews(view, bundle);
        if (getActivity() != null && (getActivity() instanceof SurveyActivity)) {
            ((SurveyActivity) getActivity()).I0(true);
        }
        if (this.y != null && (editText = this.b2) != null) {
            editText.setFocusable(false);
            this.y.setOnClickListener(this);
            this.b2.setOnClickListener(this);
            View view2 = this.x;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            this.y.setVisibility(0);
            Survey survey = this.Z1;
            if (survey != null && survey.isStoreRatingSurvey()) {
                I0(this.Z1, true);
            }
        }
    }

    public void onClick(View view) {
        if (this.Z1 != null) {
            if (view.getId() == R.id.instabug_edit_text_answer) {
                I0(this.Z1, true);
            } else {
                super.onClick(view);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.Z1 = (Survey) getArguments().getSerializable("survey");
        }
    }
}
