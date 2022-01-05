package i0.j.f.s.g;

import com.instabug.library.ui.custom.InstabugViewPager;

/* compiled from: SurveyFragment */
public class b implements Runnable {
    public final /* synthetic */ com.instabug.survey.ui.i.b c;

    public b(com.instabug.survey.ui.i.b bVar) {
        this.c = bVar;
    }

    public void run() {
        InstabugViewPager instabugViewPager = this.c.q;
        if (instabugViewPager != null) {
            instabugViewPager.scrollForward(true);
        }
    }
}
