package i0.j.f.s;

import com.instabug.library.core.ui.BasePresenter;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.survey.callbacks.OnFinishCallback;
import com.instabug.survey.models.Survey;
import com.instabug.survey.ui.f;
import h0.o.a.k;
import i0.j.e.c1.b;
import i0.j.f.o.a;
import i0.j.f.o.c;
import java.lang.ref.WeakReference;
import org.json.JSONException;

/* compiled from: SurveyPresenter */
public class d extends BasePresenter<b> {
    public f c;

    public d(b bVar) {
        super(bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(com.instabug.survey.models.Survey r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x00b7
            r7.setDismissed()
            boolean r0 = r7.isCancelled()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0040
            int r0 = r7.getSessionCounter()
            int r3 = i0.j.f.o.c.b
            i0.j.f.o.b r3 = i0.j.f.o.b.b()
            if (r3 != 0) goto L_0x001b
            r3 = -1
            goto L_0x0028
        L_0x001b:
            i0.j.f.o.b r3 = i0.j.f.o.b.b()
            android.content.SharedPreferences r3 = r3.b
            r4 = 4
            java.lang.String r5 = "survey_reshow_after_session_count"
            int r3 = r3.getInt(r5, r4)
        L_0x0028:
            if (r0 < r3) goto L_0x0040
            boolean r0 = r7.isOptInSurvey()
            if (r0 == 0) goto L_0x0037
            r7.setShouldShowAgain(r2)
            r7.resetSessionsCounter()
            goto L_0x0040
        L_0x0037:
            int r0 = r7.getSessionCounter()
            if (r0 == 0) goto L_0x0040
            r7.setShouldShowAgain(r1)
        L_0x0040:
            int r0 = r7.getType()
            java.lang.String r3 = "DISMISSED"
            if (r0 == 0) goto L_0x0078
            int r0 = r7.getType()
            if (r0 != r2) goto L_0x004f
            goto L_0x0078
        L_0x004f:
            java.util.ArrayList r0 = r7.getQuestions()
            r2 = r1
        L_0x0054:
            int r4 = r0.size()
            if (r2 >= r4) goto L_0x0076
            java.lang.Object r4 = r0.get(r2)
            com.instabug.survey.models.b r4 = (com.instabug.survey.models.b) r4
            java.lang.String r4 = r4.y
            if (r4 == 0) goto L_0x0070
            java.lang.String r5 = ""
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x006d
            goto L_0x0070
        L_0x006d:
            int r2 = r2 + 1
            goto L_0x0054
        L_0x0070:
            if (r2 != 0) goto L_0x0073
            goto L_0x0078
        L_0x0073:
            java.lang.String r3 = "ENDED"
            goto L_0x0078
        L_0x0076:
            java.lang.String r3 = "SUBMITTED"
        L_0x0078:
            r6.l(r7, r3)
            com.instabug.survey.cache.SurveysCacheManager.update(r7)
            i0.j.f.o.b r7 = i0.j.f.o.b.b()
            if (r7 == 0) goto L_0x008f
            i0.j.f.o.b r7 = i0.j.f.o.b.b()
            long r2 = com.instabug.library.util.TimeUtils.currentTimeMillis()
            r7.a(r2)
        L_0x008f:
            java.lang.ref.WeakReference<V> r7 = r6.view
            java.lang.Object r7 = r7.get()
            if (r7 == 0) goto L_0x00b7
            java.lang.ref.WeakReference<V> r7 = r6.view
            java.lang.Object r7 = r7.get()
            i0.j.f.s.b r7 = (i0.j.f.s.b) r7
            if (r7 == 0) goto L_0x00b7
            java.lang.Object r0 = r7.getViewContext()
            if (r0 == 0) goto L_0x00b7
            android.content.Intent r0 = r7.b()
            java.lang.Object r2 = r7.getViewContext()
            android.content.Context r2 = (android.content.Context) r2
            com.instabug.survey.network.service.InstabugSurveysSubmitterService.a(r2, r0)
            r7.L(r1)
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.f.s.d.k(com.instabug.survey.models.Survey):void");
    }

    public final void l(Survey survey, String str) {
        int i = c.b;
        OnFinishCallback onFinishCallback = a.a().f;
        if (onFinishCallback != null) {
            try {
                onFinishCallback.onFinish(Long.toString(survey.getId()), str, b.e(survey, str));
            } catch (JSONException e) {
                InstabugSDKLogger.e(this, "Something went wrong during parsing Survey object in onFinishCallback", e);
            }
        }
    }

    public void m(f fVar, boolean z) {
        b bVar;
        k kVar;
        this.c = fVar;
        WeakReference<V> weakReference = this.view;
        if (weakReference != null && (bVar = (b) weakReference.get()) != null && bVar.getViewContext() != null && (kVar = (k) bVar.getViewContext()) != null) {
            int a = b.a(kVar, fVar);
            if (z) {
                bVar.e(a);
            } else {
                bVar.k(a);
            }
        }
    }
}
