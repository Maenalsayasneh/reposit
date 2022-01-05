package com.instabug.survey.ui.i;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.instabug.library.core.ui.InstabugBaseFragment;
import com.instabug.library.util.LocaleHelper;
import com.instabug.library.util.OrientationUtils;
import com.instabug.survey.R;
import com.instabug.survey.models.Survey;
import com.instabug.survey.ui.SurveyActivity;
import com.instabug.survey.ui.f;
import h0.q.r;
import i0.j.f.s.d;
import i0.j.f.s.e.a;
import i0.j.f.s.e.b;
import i0.j.f.s.g.e;
import java.util.Iterator;

/* compiled from: QuestionFragment */
public abstract class a extends InstabugBaseFragment implements View.OnClickListener, View.OnTouchListener, b.C0192b {
    public RelativeLayout Y1;
    public Survey Z1;
    public GestureDetector a2;
    public com.instabug.survey.models.b c;
    public e d;
    public TextView q;
    public View x;
    public ImageView y;

    /* renamed from: com.instabug.survey.ui.i.a$a  reason: collision with other inner class name */
    /* compiled from: QuestionFragment */
    public class C0114a implements a.C0191a {
        public C0114a() {
        }

        public void a() {
        }

        public void b() {
            a.this.a();
        }

        public void c() {
            a.this.g();
        }

        public void d() {
        }

        public void f() {
        }
    }

    public void I0(Survey survey, boolean z) {
        if (getActivity() != null && (getActivity() instanceof SurveyActivity)) {
            if (survey != null && survey.getQuestions() != null && survey.getQuestions().size() > 0) {
                if (survey.getType() == 2 || survey.getQuestions().get(0).q == 3) {
                    ((SurveyActivity) getActivity()).t0(f.PRIMARY, true);
                } else if (survey.getQuestions().get(0).q == 2) {
                    ((SurveyActivity) getActivity()).t0(f.PRIMARY, true);
                    Iterator<com.instabug.survey.models.b> it = survey.getQuestions().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().q != 2) {
                                ((SurveyActivity) getActivity()).t0(f.SECONDARY, true);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    ((SurveyActivity) getActivity()).t0(f.SECONDARY, true);
                }
            }
            if (getActivity() != null && ((r) getActivity().getLifecycle()).c == Lifecycle.State.RESUMED) {
                h0.o.a.a aVar = new h0.o.a.a(getActivity().getSupportFragmentManager());
                aVar.q(0, 0);
                int i = R.id.instabug_fragment_container;
                Bundle bundle = new Bundle();
                bundle.putSerializable("survey", survey);
                bundle.putBoolean("should_show_keyboard", z);
                b bVar = new b();
                bVar.setArguments(bundle);
                aVar.o(i, bVar, (String) null);
                aVar.h();
            }
        }
    }

    public abstract String J0();

    public void K0() {
        if (getActivity() != null && this.q != null && OrientationUtils.isInLandscape(getActivity())) {
            this.q.setMaxLines(3);
        }
    }

    public void L0(Survey survey) {
        if (getActivity() == null) {
            return;
        }
        if (!survey.isNPSSurvey() || !(this instanceof com.instabug.survey.ui.i.j.a)) {
            P p = ((SurveyActivity) getActivity()).presenter;
            if (p != null) {
                ((d) p).k(survey);
                return;
            }
            return;
        }
        ((SurveyActivity) getActivity()).B(survey);
    }

    public boolean M0() {
        return (this instanceof com.instabug.survey.ui.i.l.c.a) || (this instanceof com.instabug.survey.ui.i.h.c.a) || (this instanceof com.instabug.survey.ui.i.k.b.a) || (this instanceof com.instabug.survey.ui.i.i.b.a);
    }

    public void a() {
        Survey survey = this.Z1;
        if (survey != null) {
            I0(survey, false);
        }
    }

    public void g() {
        Survey survey = this.Z1;
        if (survey != null) {
            if (!survey.isNPSSurvey() || !(this instanceof com.instabug.survey.ui.i.j.a)) {
                if (getActivity() instanceof i0.j.f.s.a) {
                    ((i0.j.f.s.a) getActivity()).y(this.Z1);
                }
            } else if (getActivity() instanceof i0.j.f.s.a) {
                ((i0.j.f.s.a) getActivity()).B(this.Z1);
            }
        }
    }

    public void initViews(View view, Bundle bundle) {
        if (getActivity() != null) {
            if (getActivity() instanceof SurveyActivity) {
                ((SurveyActivity) getActivity()).I0(false);
            }
            if (getContext() != null) {
                this.x = findViewById(R.id.survey_shadow);
                this.y = (ImageView) findViewById(R.id.survey_partial_close_btn);
                this.q = (TextView) view.findViewById(R.id.instabug_text_view_question);
                RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.instabug_survey_dialog_container);
                this.Y1 = relativeLayout;
                if (relativeLayout != null) {
                    relativeLayout.setOnTouchListener(this);
                    this.Y1.setOnClickListener(this);
                }
                ImageView imageView = this.y;
                if (imageView != null) {
                    imageView.setOnClickListener(this);
                }
                if (getContext() != null && !M0() && LocaleHelper.isRTL(getContext())) {
                    view.setRotation(180.0f);
                }
            }
        }
    }

    public void onClick(View view) {
        f fVar;
        if (this.Z1 != null) {
            int id = view.getId();
            if (id == R.id.survey_partial_close_btn) {
                L0(this.Z1);
            } else if ((id == R.id.instabug_survey_dialog_container || id == R.id.instabug_text_view_question) && getActivity() != null) {
                P p = ((SurveyActivity) getActivity()).presenter;
                if (p != null) {
                    fVar = ((d) p).c;
                } else {
                    fVar = f.PRIMARY;
                }
                if (fVar != f.SECONDARY) {
                    I0(this.Z1, false);
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (getActivity() != null) {
            if (getActivity() instanceof SurveyActivity) {
                this.Z1 = ((SurveyActivity) getActivity()).x;
            }
            super.onCreate(bundle);
        }
    }

    public void onDestroy() {
        b.f = null;
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        if (this.Z1 != null && getActivity() != null && (getActivity() instanceof SurveyActivity)) {
            if (this instanceof com.instabug.survey.ui.i.l.c.a) {
                if (this.Z1.isStoreRatingSurvey()) {
                    ((SurveyActivity) getActivity()).t0(f.PRIMARY, true);
                } else {
                    ((SurveyActivity) getActivity()).t0(f.PARTIAL, false);
                }
            }
            b.c = -1;
            b.b = -1.0f;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (getActivity() == null) {
            return false;
        }
        i0.j.e.c1.b.g(getActivity());
        b.c(view, motionEvent, M0(), false, this);
        if (this.a2 == null && getContext() != null) {
            this.a2 = new GestureDetector(getContext(), new i0.j.f.s.e.a(new C0114a()));
        }
        GestureDetector gestureDetector = this.a2;
        if (gestureDetector == null) {
            return true;
        }
        gestureDetector.onTouchEvent(motionEvent);
        return true;
    }
}
