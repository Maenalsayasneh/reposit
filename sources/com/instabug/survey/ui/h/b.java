package com.instabug.survey.ui.h;

import com.instabug.survey.R;
import com.instabug.survey.models.Survey;
import h0.o.a.k;
import i0.j.f.s.f.e;
import i0.j.f.s.f.f;
import i0.j.f.s.f.g;
import i0.j.f.s.f.h;

/* compiled from: PopupCustomizedQuestionFragment */
public class b extends f {
    public static final /* synthetic */ int q = 0;

    /* compiled from: PopupCustomizedQuestionFragment */
    public class a implements f {
        public a() {
        }

        public void a() {
            b.this.c.s();
        }

        public void b() {
            Survey survey;
            h hVar = b.this.c;
            g gVar = (g) hVar.view.get();
            if (gVar != null && (survey = hVar.c) != null) {
                gVar.y(survey);
            }
        }

        public void c() {
            b.this.c.d();
        }
    }

    /* renamed from: com.instabug.survey.ui.h.b$b  reason: collision with other inner class name */
    /* compiled from: PopupCustomizedQuestionFragment */
    public class C0112b implements f {
        public C0112b() {
        }

        public void a() {
            b.this.c.c();
        }

        public void b() {
            Survey survey;
            h hVar = b.this.c;
            g gVar = (g) hVar.view.get();
            if (gVar != null && (survey = hVar.c) != null) {
                gVar.B(survey);
            }
        }

        public void c() {
            b.this.c.g();
        }
    }

    public void P(String str, String str2, String str3, String str4) {
        k activity = getActivity();
        if (activity != null) {
            e eVar = new e(activity);
            eVar.c = R.layout.instabug_custom_app_rating_feedback;
            eVar.b = str2;
            eVar.e = str3;
            eVar.d = str4;
            eVar.f = new a();
            eVar.a();
        }
    }

    public void Y(String str, String str2, String str3, String str4) {
        k activity = getActivity();
        if (activity != null) {
            e eVar = new e(activity);
            eVar.c = R.layout.instabug_custom_store_rating;
            eVar.b = str2;
            eVar.e = str3;
            eVar.d = str4;
            eVar.f = new C0112b();
            eVar.a();
        }
    }
}
