package com.instabug.survey.ui.i.i.b;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.instabug.survey.models.Survey;
import com.instabug.survey.ui.SurveyActivity;

/* compiled from: PartialNpsQuestionFragment */
public class a extends com.instabug.survey.ui.i.i.a {
    private a() {
    }

    public static a N0(Survey survey) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("survey", survey);
        bundle.putSerializable("question", survey.getQuestions().get(0));
        a aVar = new a();
        aVar.setArguments(bundle);
        return aVar;
    }

    public void g0(int i) {
        Survey survey = this.Z1;
        if (survey != null && survey.getQuestions() != null && this.Z1.getQuestions().size() > 0) {
            this.Z1.getQuestions().get(0).b(String.valueOf(i));
            I0(this.Z1, false);
        }
    }

    public void initViews(View view, Bundle bundle) {
        super.initViews(view, bundle);
        if (getActivity() != null) {
            ((SurveyActivity) getActivity()).I0(true);
            View view2 = this.x;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            ImageView imageView = this.y;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.Z1 = (Survey) getArguments().getSerializable("survey");
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }
}
