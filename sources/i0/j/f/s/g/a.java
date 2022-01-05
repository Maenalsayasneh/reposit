package i0.j.f.s.g;

import com.instabug.library.ui.custom.InstabugViewPager;
import com.instabug.survey.ui.i.b;

/* compiled from: SurveyFragment */
public class a implements Runnable {
    public final /* synthetic */ b c;

    public a(b bVar) {
        this.c = bVar;
    }

    public void run() {
        InstabugViewPager instabugViewPager = this.c.q;
        if (instabugViewPager != null) {
            instabugViewPager.scrollForward(true);
        }
    }
}
