package i0.j.f.s.f;

import androidx.fragment.app.Fragment;
import com.google.android.play.core.review.ReviewInfo;
import com.instabug.library.core.ui.BaseContract;
import com.instabug.library.core.ui.BasePresenter;
import com.instabug.survey.models.Survey;
import h0.o.a.k;
import i0.h.a.b.c.m.b;
import i0.h.a.d.a.j.d;
import i0.h.a.d.a.j.p;
import i0.j.f.o.c;
import i0.j.f.p.e;
import java.util.ArrayList;

/* compiled from: PopupQuestionPresenter */
public class h extends BasePresenter<g> implements BaseContract.Presenter {
    public Survey c;
    public ReviewInfo d = null;

    /* compiled from: PopupQuestionPresenter */
    public class a implements i0.j.f.a {
        public a() {
        }
    }

    public h(g gVar, Survey survey) {
        super(gVar);
        this.c = survey;
        if (survey.isGooglePlayAppRating() && gVar.getViewContext() != null && ((Fragment) gVar.getViewContext()).getActivity() != null) {
            k activity = ((Fragment) gVar.getViewContext()).getActivity();
            a aVar = new a();
            p<ReviewInfo> b = b.w(activity).b();
            b.b(new e(aVar));
            b.c(d.a, new i0.j.f.p.d(aVar));
        }
    }

    public void c() {
        ArrayList<String> arrayList;
        ArrayList<com.instabug.survey.models.b> questions = this.c.getQuestions();
        if (questions != null && questions.size() >= 2 && (arrayList = this.c.getQuestions().get(0).x) != null && arrayList.size() >= 2 && this.c.getQuestions().get(1).x != null && this.c.getQuestions().get(1).x.size() != 0) {
            this.c.getQuestions().get(1).b(this.c.getQuestions().get(1).x.get(1));
            g gVar = (g) this.view.get();
            if (gVar != null) {
                gVar.k0(this.c);
            }
        }
    }

    public void d() {
        ArrayList<String> arrayList;
        Survey survey;
        ArrayList<String> arrayList2;
        ArrayList<String> arrayList3 = this.c.getQuestions().get(0).x;
        if (arrayList3 != null) {
            this.c.getQuestions().get(0).b(arrayList3.get(0));
        }
        if (!c.e()) {
            ArrayList<com.instabug.survey.models.b> questions = this.c.getQuestions();
            if (questions != null && !questions.isEmpty() && (arrayList = questions.get(0).x) != null && !arrayList.isEmpty()) {
                questions.get(0).b(arrayList.get(0));
                g gVar = (g) this.view.get();
                if (gVar != null) {
                    gVar.p0(this.c);
                }
            }
        } else if (!this.c.isGooglePlayAppRating()) {
            ArrayList<com.instabug.survey.models.b> questions2 = this.c.getQuestions();
            if (questions2 != null && questions2.size() >= 2) {
                com.instabug.survey.models.b bVar = questions2.get(1);
                g gVar2 = (g) this.view.get();
                if (gVar2 != null && bVar != null && (arrayList2 = bVar.x) != null && arrayList2.size() >= 2) {
                    gVar2.Y((String) null, bVar.d, bVar.x.get(0), bVar.x.get(1));
                }
            }
        } else {
            g gVar3 = (g) this.view.get();
            if (!(gVar3 == null || (survey = this.c) == null)) {
                gVar3.B(survey);
            }
            g gVar4 = (g) this.view.get();
            if (gVar4 != null && this.d != null && gVar4.getViewContext() != null && ((Fragment) gVar4.getViewContext()).getActivity() != null) {
                k activity = ((Fragment) gVar4.getViewContext()).getActivity();
                ReviewInfo reviewInfo = this.d;
                i iVar = new i();
                p<Void> a2 = b.w(activity).a(activity, reviewInfo);
                a2.b(new i0.j.f.p.c(iVar));
                a2.c(d.a, new i0.j.f.p.b(iVar));
            }
        }
    }

    public void g() {
        ArrayList<String> arrayList;
        ArrayList<com.instabug.survey.models.b> questions = this.c.getQuestions();
        if (questions != null && questions.size() >= 2 && (arrayList = this.c.getQuestions().get(0).x) != null && !arrayList.isEmpty()) {
            if (this.c.getQuestions().get(1).x != null && this.c.getQuestions().get(1).x.size() != 0) {
                this.c.getQuestions().get(1).b(this.c.getQuestions().get(1).x.get(0));
            } else {
                return;
            }
        }
        this.c.addRateEvent();
        g gVar = (g) this.view.get();
        if (gVar != null) {
            gVar.v0(this.c);
        }
    }

    public void s() {
        com.instabug.survey.models.b bVar;
        ArrayList<String> arrayList;
        ArrayList<com.instabug.survey.models.b> questions = this.c.getQuestions();
        if (questions != null && !questions.isEmpty() && (bVar = this.c.getQuestions().get(0)) != null && (arrayList = bVar.x) != null && arrayList.size() >= 2) {
            bVar.b(bVar.x.get(1));
            g gVar = (g) this.view.get();
            if (gVar != null) {
                gVar.d0(this.c);
            }
        }
    }
}
