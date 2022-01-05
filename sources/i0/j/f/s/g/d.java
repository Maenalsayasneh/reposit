package i0.j.f.s.g;

import android.text.TextUtils;
import com.instabug.library.util.LocaleHelper;
import com.instabug.survey.ui.i.b;

/* compiled from: SurveyFragment */
public class d implements Runnable {
    public final /* synthetic */ b c;

    public d(b bVar) {
        this.c = bVar;
    }

    public void run() {
        b bVar = this.c;
        if (bVar.c != null && bVar.getContext() != null) {
            b bVar2 = this.c;
            if (bVar2.q != null) {
                if (LocaleHelper.isRTL(bVar2.getContext())) {
                    this.c.q.scrollBackward(true);
                } else if (this.c.c.getQuestions().get(this.c.Z1).y != null && !TextUtils.isEmpty(this.c.c.getQuestions().get(this.c.Z1).y)) {
                    this.c.q.scrollForward(true);
                }
            }
        }
    }
}
