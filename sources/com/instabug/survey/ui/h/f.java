package com.instabug.survey.ui.h;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.instabug.library.core.ui.InstabugBaseFragment;
import com.instabug.survey.R;
import com.instabug.survey.models.Survey;
import com.instabug.survey.models.b;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import i0.j.f.s.a;
import i0.j.f.s.f.g;
import i0.j.f.s.f.h;
import java.util.ArrayList;

@SuppressFBWarnings({"MF_CLASS_MASKS_FIELD"})
/* compiled from: PopupQuestionFragment */
public abstract class f extends InstabugBaseFragment<h> implements g {
    public h c;
    public a d;

    public void B(Survey survey) {
        this.d.B(survey);
    }

    public void d0(Survey survey) {
        b secondaryNegativeQuestion = survey.getSecondaryNegativeQuestion();
        if (getFragmentManager() != null && secondaryNegativeQuestion != null) {
            FragmentManager fragmentManager = getFragmentManager();
            Bundle bundle = new Bundle();
            bundle.putSerializable("survey", survey);
            bundle.putSerializable("question", secondaryNegativeQuestion);
            com.instabug.survey.ui.i.l.c.a aVar = new com.instabug.survey.ui.i.l.c.a();
            aVar.setArguments(bundle);
            i0.j.f.p.h.f(fragmentManager, aVar, 0, 0);
        }
    }

    public int getLayout() {
        return R.layout.instabug_dialog_popup_survey;
    }

    public void initViews(View view, Bundle bundle) {
        ArrayList<b> questions;
        ArrayList<String> arrayList;
        Survey survey = getArguments() != null ? (Survey) getArguments().getSerializable("KEY_SURVEY_ARGUMENT") : null;
        if (survey != null) {
            h hVar = new h(this, survey);
            this.c = hVar;
            Survey survey2 = hVar.c;
            if (survey2 != null && (questions = survey2.getQuestions()) != null && !questions.isEmpty()) {
                b bVar = hVar.c.getQuestions().get(0);
                g gVar = (g) hVar.view.get();
                if (gVar != null && bVar != null && (arrayList = bVar.x) != null && arrayList.size() >= 2) {
                    gVar.P((String) null, bVar.d, arrayList.get(0), arrayList.get(1));
                }
            }
        }
    }

    public void k0(Survey survey) {
        this.d.B(survey);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.d = (a) context;
        } catch (IllegalStateException unused) {
            throw new IllegalStateException("Survey Activity must implement SurveyActivityCallback");
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public void p0(Survey survey) {
        this.d.B(survey);
    }

    public void v0(Survey survey) {
        if (getContext() != null) {
            i0.j.f.p.f.a(getContext());
            this.d.B(survey);
        }
    }

    public void y(Survey survey) {
        this.d.y(survey);
    }
}
