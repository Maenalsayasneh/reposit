package com.instabug.survey.ui.i.h;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import com.instabug.survey.R;
import com.instabug.survey.models.Survey;
import i0.j.f.s.g.e;
import i0.j.f.s.g.i.b;
import java.util.Objects;

/* compiled from: MCQQuestionFragment */
public class a extends com.instabug.survey.ui.i.a implements b.a {
    public b b2;
    public GridView c2;

    public String J0() {
        String str;
        b bVar = this.b2;
        if (bVar != null) {
            int i = bVar.x;
            if (i == -1) {
                str = null;
            } else {
                str = bVar.getItem(i);
            }
            if (str != null) {
                b bVar2 = this.b2;
                int i2 = bVar2.x;
                if (i2 == -1) {
                    return null;
                }
                return bVar2.getItem(i2);
            }
        }
        if (getContext() != null) {
            Toast.makeText(getContext(), getString(R.string.instabug_str_error_survey_without_answer), 0).show();
        }
        return null;
    }

    public void O(View view, String str) {
        com.instabug.survey.models.b bVar = this.c;
        if (bVar != null) {
            bVar.b(str);
            e eVar = this.d;
            if (eVar != null) {
                com.instabug.survey.models.b bVar2 = this.c;
                com.instabug.survey.ui.i.b bVar3 = (com.instabug.survey.ui.i.b) eVar;
                Survey survey = bVar3.c;
                if (survey != null && survey.getQuestions() != null) {
                    bVar3.c.getQuestions().get(bVar3.I0(bVar2.c)).b(bVar2.y);
                    bVar3.K0(true);
                }
            }
        }
    }

    public int getLayout() {
        return R.layout.instabug_dialog_mcq_survey;
    }

    public void initViews(View view, Bundle bundle) {
        super.initViews(view, bundle);
        this.q = (TextView) view.findViewById(R.id.instabug_text_view_question);
        this.c2 = (GridView) view.findViewById(R.id.instabug_survey_mcq_grid_view);
        K0();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        if (getArguments() != null) {
            this.c = (com.instabug.survey.models.b) getArguments().getSerializable("question");
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        super.onViewCreated(view, bundle);
        view.setFocusableInTouchMode(true);
        com.instabug.survey.models.b bVar = this.c;
        if (bVar != null && getActivity() != null && (textView = this.q) != null) {
            textView.setText(bVar.d);
            b bVar2 = new b(getActivity(), bVar, this);
            this.b2 = bVar2;
            GridView gridView = this.c2;
            if (gridView != null) {
                gridView.setAdapter(bVar2);
            }
            b bVar3 = this.b2;
            String str = bVar.y;
            Objects.requireNonNull(bVar3);
            if (str != null && !str.isEmpty()) {
                for (int i = 0; i < bVar3.getCount(); i++) {
                    if (str.equalsIgnoreCase(bVar3.getItem(i))) {
                        bVar3.x = i;
                        return;
                    }
                }
            }
        }
    }
}
