package com.instabug.survey.ui.i.h.c;

import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.GridView;
import android.widget.ImageView;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.survey.R;
import com.instabug.survey.models.Survey;
import com.instabug.survey.ui.SurveyActivity;

/* compiled from: PartialMCQQuestionFragment */
public class a extends com.instabug.survey.ui.i.h.a {
    public static final /* synthetic */ int d2 = 0;
    public View e2;

    /* renamed from: com.instabug.survey.ui.i.h.c.a$a  reason: collision with other inner class name */
    /* compiled from: PartialMCQQuestionFragment */
    public class C0116a implements AbsListView.OnScrollListener {
        public C0116a() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            a aVar = a.this;
            int i2 = a.d2;
            Survey survey = aVar.Z1;
            if (survey != null && i == 1) {
                aVar.I0(survey, false);
            }
        }
    }

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

    public void O(View view, String str) {
        Survey survey = this.Z1;
        if (survey != null && survey.getQuestions() != null && this.Z1.getQuestions().size() != 0) {
            this.Z1.getQuestions().get(0).b(str);
            I0(this.Z1, false);
        }
    }

    public void initViews(View view, Bundle bundle) {
        super.initViews(view, bundle);
        this.e2 = findViewById(R.id.survey_mcq_fade);
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
            GridView gridView = this.c2;
            if (gridView != null) {
                gridView.setEnabled(true);
                this.c2.setVerticalScrollBarEnabled(false);
            }
            if (this.e2 != null) {
                if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
                    this.e2.setBackgroundResource(R.drawable.ibg_survey_mcq_fade_light);
                } else {
                    this.e2.setBackgroundResource(R.drawable.ibg_survey_mcq_fade_dark);
                }
                this.e2.setVisibility(0);
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
        GridView gridView = this.c2;
        if (gridView != null) {
            gridView.setOnScrollListener(new C0116a());
        }
    }
}
