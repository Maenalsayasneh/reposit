package com.instabug.survey.ui.i.i;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.instabug.survey.R;
import com.instabug.survey.models.Survey;
import com.instabug.survey.models.b;
import com.instabug.survey.ui.custom.NpsView;
import i0.j.f.s.g.e;

/* compiled from: NPSQuestionFragment */
public class a extends com.instabug.survey.ui.i.a implements NpsView.a {
    public NpsView b2;

    public String J0() {
        b bVar = this.c;
        if (bVar == null) {
            return null;
        }
        return bVar.y;
    }

    public void g0(int i) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.b(String.valueOf(i));
            e eVar = this.d;
            b bVar2 = this.c;
            com.instabug.survey.ui.i.b bVar3 = (com.instabug.survey.ui.i.b) eVar;
            Survey survey = bVar3.c;
            if (survey != null && survey.getQuestions() != null) {
                bVar3.c.getQuestions().get(bVar3.I0(bVar2.c)).b(bVar2.y);
                bVar3.K0(true);
            }
        }
    }

    public int getLayout() {
        return R.layout.instabug_dialog_nps_survey;
    }

    public void initViews(View view, Bundle bundle) {
        super.initViews(view, bundle);
        this.q = (TextView) view.findViewById(R.id.instabug_text_view_question);
        NpsView npsView = (NpsView) view.findViewById(R.id.instabug_survey_nps_layout);
        this.b2 = npsView;
        if (npsView != null) {
            npsView.setOnSelectionListener(this);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        if (getArguments() != null) {
            this.c = (b) getArguments().getSerializable("question");
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        b bVar = this.c;
        if (bVar != null) {
            TextView textView = this.q;
            if (textView != null) {
                textView.setText(bVar.d);
            }
            if (this.b2 != null && (str = bVar.y) != null && str.length() > 0) {
                this.b2.setScore(Integer.parseInt(bVar.y));
            }
        }
    }
}
