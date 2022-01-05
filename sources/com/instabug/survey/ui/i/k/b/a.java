package com.instabug.survey.ui.i.k.b;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.instabug.library.util.OrientationUtils;
import com.instabug.survey.models.Survey;
import com.instabug.survey.ui.SurveyActivity;
import com.instabug.survey.ui.custom.RatingView;

/* compiled from: PartialStarRatingQuestionFragment */
public class a extends com.instabug.survey.ui.i.k.a {
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

    public void initViews(View view, Bundle bundle) {
        View view2;
        RatingView ratingView;
        super.initViews(view, bundle);
        if (getActivity() != null) {
            ((SurveyActivity) getActivity()).I0(true);
            if (this.y != null && (view2 = this.x) != null) {
                view2.setVisibility(0);
                this.y.setVisibility(0);
                if (OrientationUtils.isInLandscape(getActivity()) && (ratingView = this.b2) != null) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ratingView.getLayoutParams();
                    layoutParams.setMargins(0, 8, 0, 8);
                    this.b2.setLayoutParams(layoutParams);
                    this.b2.requestLayout();
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.Z1 = (Survey) getArguments().getSerializable("survey");
        }
    }

    public void u0(RatingView ratingView, float f, boolean z) {
        Survey survey;
        if (this.b2 != null && (survey = this.Z1) != null && survey.getQuestions() != null && this.Z1.getQuestions().size() != 0) {
            this.b2.d(f, false);
            this.Z1.getQuestions().get(0).b(String.valueOf((int) f));
            I0(this.Z1, false);
        }
    }
}
