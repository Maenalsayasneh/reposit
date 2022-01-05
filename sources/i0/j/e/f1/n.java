package i0.j.e.f1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventSubscriber;
import com.instabug.library.model.StepType;
import com.instabug.library.screenshot.ScreenshotProvider;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.DiskUtils;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.StringUtility;
import com.instabug.library.util.threading.PoolProvider;
import com.instabug.library.visualusersteps.VisualUserStep;
import com.instabug.library.visualusersteps.VisualUserStepsHelper;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import i0.j.e.f1.c;
import i0.j.e.z;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import k0.b.y.d;

/* compiled from: VisualUserStepsProvider */
public class n {
    public static n a;
    public WeakReference<View> b;
    public m c = new m();
    public VisualUserStep d;
    public int e = 0;
    public String f;
    public boolean g = false;
    public boolean h = true;
    public long i;

    /* compiled from: VisualUserStepsProvider */
    public class a implements Runnable {
        public final /* synthetic */ Context c;

        /* renamed from: i0.j.e.f1.n$a$a  reason: collision with other inner class name */
        /* compiled from: VisualUserStepsProvider */
        public class C0180a implements d<List<File>> {
            public void b(Object obj) throws Exception {
                List list = (List) obj;
                if (list != null && !list.isEmpty()) {
                    InstabugSDKLogger.w("VisualUserStepsProvider", "Can't clean visual user steps directory");
                }
            }
        }

        public a(Context context) {
            this.c = context;
        }

        @SuppressFBWarnings({"RV_RETURN_VALUE_IGNORED"})
        public void run() {
            DiskUtils.getCleanDirectoryObservable(VisualUserStepsHelper.getVisualUserStepsDirectory(this.c)).t(new C0180a(), k0.b.z.b.a.e, k0.b.z.b.a.c, k0.b.z.b.a.d);
        }
    }

    /* compiled from: VisualUserStepsProvider */
    public class b implements d<SDKCoreEvent> {
        public b() {
        }

        public void b(Object obj) throws Exception {
            SDKCoreEvent sDKCoreEvent = (SDKCoreEvent) obj;
            if (sDKCoreEvent.getType().equals("session")) {
                String value = sDKCoreEvent.getValue();
                value.hashCode();
                if (value.equals(SDKCoreEvent.Session.VALUE_FINISHED)) {
                    n nVar = n.this;
                    if (nVar.m()) {
                        n.k().f(StepType.APPLICATION_BACKGROUND, (String) null, (String) null, (String) null);
                        nVar.h = true;
                    }
                    n.this.o();
                } else if (value.equals(SDKCoreEvent.Session.VALUE_STARTED)) {
                    n nVar2 = n.this;
                    if (nVar2.m() && nVar2.h) {
                        VisualUserStep.b Builder = VisualUserStep.Builder(StepType.APPLICATION_FOREGROUND);
                        Builder.d = null;
                        Builder.c = null;
                        Builder.g = "";
                        Builder.b = false;
                        Builder.i = null;
                        nVar2.d = Builder.a();
                        nVar2.h = false;
                    }
                }
            }
        }
    }

    /* compiled from: VisualUserStepsProvider */
    public class c implements Runnable {
        public final /* synthetic */ Activity c;
        public final /* synthetic */ c d;

        /* compiled from: VisualUserStepsProvider */
        public class a implements ScreenshotProvider.ScreenshotCapturingListener {
            public a() {
            }

            public void onScreenshotCapturedSuccessfully(Bitmap bitmap) {
                c cVar = c.this;
                n nVar = n.this;
                nVar.g = false;
                Activity activity = cVar.c;
                c cVar2 = cVar.d;
                Objects.requireNonNull(nVar);
                PoolProvider.postIOTask(new o(bitmap, activity, cVar2));
            }

            public void onScreenshotCapturingFailed(Throwable th) {
                n.this.g = false;
                StringBuilder P0 = i0.d.a.a.a.P0("capturing VisualUserStep failed error: ");
                P0.append(th.getMessage());
                P0.append(", time in MS: ");
                P0.append(System.currentTimeMillis());
                InstabugSDKLogger.e("VisualUserStepsProvider", P0.toString(), th);
            }
        }

        public c(Activity activity, c cVar) {
            this.c = activity;
            this.d = cVar;
        }

        public void run() {
            n.this.g = true;
            ScreenshotProvider.a(this.c, new a());
        }
    }

    @SuppressLint({"CheckResult"})
    public n() {
        Context applicationContext = Instabug.getApplicationContext();
        if (applicationContext != null) {
            PoolProvider.postIOTask(new a(applicationContext));
        }
        SDKCoreEventSubscriber.subscribe(new b());
    }

    public static n k() {
        if (a == null) {
            a = new n();
        }
        return a;
    }

    public String a(WeakReference<View> weakReference) {
        EditText editText;
        if (!(weakReference == null || weakReference.get() == null || weakReference.get() == null || !(weakReference.get() instanceof EditText) || (editText = (EditText) weakReference.get()) == null)) {
            if (editText.getHint() != null) {
                if (!TextUtils.isEmpty(editText.getHint().toString())) {
                    return editText.getHint().toString();
                }
            } else if (editText.getContentDescription() != null && !TextUtils.isEmpty(editText.getContentDescription().toString())) {
                return editText.getContentDescription().toString();
            }
        }
        return "a text field";
    }

    public final void b(c cVar) {
        if (!this.g && SettingsManager.getInstance().isReproStepsScreenshotEnabled()) {
            new Handler().postDelayed(new c(InstabugInternalTrackingDelegate.getInstance().getTargetActivity(), cVar), 500);
        }
    }

    @SuppressLint({"ERADICATE_FIELD_NOT_NULLABLE"})
    @SuppressFBWarnings({"SF_SWITCH_FALLTHROUGH"})
    public void c(c cVar, String str, String str2, String str3, String str4) {
        if (SettingsManager.getInstance().isReproStepsScreenshotEnabled() && !InstabugCore.isForegroundBusy() && !n()) {
            char c2 = 65535;
            boolean z = false;
            switch (str.hashCode()) {
                case -1933282175:
                    if (str.equals(StepType.FRAGMENT_DETACHED)) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -1705165623:
                    if (str.equals(StepType.ACTIVITY_DESTROYED)) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -1647502663:
                    if (str.equals(StepType.APPLICATION_CREATED)) {
                        c2 = 10;
                        break;
                    }
                    break;
                case -1643440744:
                    if (str.equals(StepType.ACTIVITY_CREATED)) {
                        c2 = 11;
                        break;
                    }
                    break;
                case -1574447993:
                    if (str.equals(StepType.ACTIVITY_RESUMED)) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1431942979:
                    if (str.equals(StepType.FRAGMENT_VIEW_CREATED)) {
                        c2 = 15;
                        break;
                    }
                    break;
                case -1382777347:
                    if (str.equals(StepType.FRAGMENT_PAUSED)) {
                        c2 = 18;
                        break;
                    }
                    break;
                case -1023412878:
                    if (str.equals(StepType.FRAGMENT_STARTED)) {
                        c2 = 16;
                        break;
                    }
                    break;
                case -1010547010:
                    if (str.equals(StepType.FRAGMENT_STOPPED)) {
                        c2 = 7;
                        break;
                    }
                    break;
                case -930544378:
                    if (str.equals(StepType.TAB_SELECT)) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -730405706:
                    if (str.equals(StepType.FRAGMENT_VISIBILITY_CHANGED)) {
                        c2 = 8;
                        break;
                    }
                    break;
                case -274213071:
                    if (str.equals(StepType.ACTIVITY_STARTED)) {
                        c2 = 12;
                        break;
                    }
                    break;
                case -261347203:
                    if (str.equals(StepType.ACTIVITY_STOPPED)) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 3213533:
                    if (str.equals(StepType.OPEN_DIALOG)) {
                        c2 = 13;
                        break;
                    }
                    break;
                case 26863710:
                    if (str.equals(StepType.ACTIVITY_PAUSED)) {
                        c2 = 17;
                        break;
                    }
                    break;
                case 433141802:
                    if (str.equals(StepType.UNKNOWN)) {
                        c2 = 9;
                        break;
                    }
                    break;
                case 1757682911:
                    if (str.equals(StepType.DIALOG_FRAGMENT_RESUMED)) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 1855874739:
                    if (str.equals(StepType.FRAGMENT_ATTACHED)) {
                        c2 = 14;
                        break;
                    }
                    break;
                case 1971319496:
                    if (str.equals(StepType.FRAGMENT_RESUMED)) {
                        c2 = 1;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                case 1:
                case 2:
                    if (cVar == null || !str.equals(StepType.DIALOG_FRAGMENT_RESUMED)) {
                        if (cVar != null) {
                            if (cVar.e.isEmpty() || (cVar.e.size() == 1 && cVar.e.getFirst().getStepType() != null && cVar.e.getFirst().getStepType().equals(StepType.APPLICATION_FOREGROUND))) {
                                z = true;
                            }
                            if (z) {
                                cVar.c = str2;
                                return;
                            }
                        }
                    } else if (SystemClock.elapsedRealtime() - this.i < 500 || this.g) {
                        cVar.c = str2;
                        return;
                    } else {
                        this.i = SystemClock.elapsedRealtime();
                    }
                    if ((cVar == null || cVar.f) && SettingsManager.getInstance().getCurrentPlatform() != 4) {
                        e(str2, str);
                        cVar = j();
                    }
                    if (cVar != null) {
                        cVar.f = true;
                    }
                    if (cVar != null && cVar.d == null) {
                        b(cVar);
                        break;
                    }
                    break;
                case 3:
                    if (str2 != null && !str2.equals(this.f)) {
                        e(str2, str);
                        c j = j();
                        if (j != null) {
                            b(j);
                            break;
                        }
                    }
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    if (!(cVar == null || cVar.b() == null || !cVar.b().getStepType().equals(StepType.START_EDITING))) {
                        d(cVar, false);
                        break;
                    }
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    h(cVar, str, str2, str3, str4);
                    break;
            }
            this.f = str2;
        }
    }

    @SuppressLint({"NULL_DEREFERENCE"})
    public void d(c cVar, boolean z) {
        if (!(!z || cVar == null || cVar.b() == null || cVar.b().getStepType() == null || !cVar.b().getStepType().equals(StepType.START_EDITING))) {
            WeakReference<View> weakReference = this.b;
            if (weakReference != null) {
                String a2 = a(weakReference);
                String view = cVar.b().getView();
                if (view != null && !view.equals(a2)) {
                    i(StepType.END_EDITING, cVar.b().getScreenName(), cVar.b().getView(), (String) null);
                }
            } else {
                return;
            }
        }
        h(cVar, z ? StepType.START_EDITING : StepType.END_EDITING, this.f, a(this.b), (String) null);
    }

    public void e(String str, String str2) {
        m mVar = this.c;
        int i2 = this.e + 1;
        this.e = i2;
        mVar.a.add(new c(String.valueOf(i2), str, str2));
        if (this.d != null && this.c.b() != null) {
            c b2 = this.c.b();
            VisualUserStep.b Builder = VisualUserStep.Builder(this.d.getStepType());
            Builder.d = str;
            Builder.c = this.c.b().b;
            Builder.g = "";
            Builder.b = false;
            Builder.i = null;
            b2.a(Builder.a());
            this.d = null;
        }
    }

    public void f(String str, String str2, String str3, String str4) {
        c(this.c.b(), str, str2, str3, (String) null);
    }

    public ArrayList<VisualUserStep> g() {
        o();
        ArrayList<VisualUserStep> arrayList = new ArrayList<>();
        for (c next : this.c.a) {
            VisualUserStep.b Builder = VisualUserStep.Builder((String) null);
            Builder.d = next.c;
            Builder.c = null;
            Builder.f = next.b;
            c.a aVar = next.d;
            if (aVar != null) {
                Builder.e = aVar.a;
                Builder.h = aVar.b;
            }
            arrayList.add(Builder.a());
            arrayList.addAll(next.e);
        }
        return arrayList;
    }

    public final void h(c cVar, String str, String str2, String str3, String str4) {
        String str5;
        c l;
        if (!InstabugCore.isForegroundBusy()) {
            if (cVar == null) {
                if (!n()) {
                    e(str2, str);
                    cVar = j();
                } else {
                    return;
                }
            }
            if (str != null && (str.equals(StepType.SCROLL) || str.equals(StepType.PINCH) || str.equals(StepType.SWIPE))) {
                str3 = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            if (!(cVar == null || str == null || ((!str.equals(StepType.SWIPE) && !str.equals(StepType.SCROLL)) || (str5 = cVar.a) == null || !str5.equals(StepType.TAB_SELECT) || !cVar.e.isEmpty() || (l = l()) == null))) {
                cVar = l;
                str = StepType.SWIPE;
            }
            if (cVar != null) {
                m mVar = this.c;
                VisualUserStep.b Builder = VisualUserStep.Builder(str);
                Builder.d = str2;
                Builder.c = cVar.b;
                Builder.g = str3;
                Builder.b = !TextUtils.isEmpty(str4);
                Builder.i = str4;
                VisualUserStep a2 = Builder.a();
                Objects.requireNonNull(mVar);
                if (a2.getStepType() == null || !a2.getStepType().equals(StepType.END_EDITING)) {
                    boolean z = false;
                    VisualUserStep b2 = cVar.b();
                    if (!(b2 == null || b2.getView() == null || a2.getView() == null || !b2.getView().replace("\"", "").equals(a2.getView()) || b2.getStepType() == null || !b2.getStepType().equals(StepType.START_EDITING) || b2.getScreenName() == null || a2.getScreenName() == null || !b2.getScreenName().equals(a2.getScreenName()))) {
                        z = true;
                    }
                    if (!z) {
                        if (a2.getStepType() != null && a2.getStepType().equals(StepType.START_EDITING) && a2.getView() != null && !a2.getView().equals("a text field")) {
                            a2.setView(StringUtility.applyDoubleQuotations(a2.getView()));
                        }
                        cVar.a(a2);
                        mVar.b++;
                    }
                }
            }
        }
    }

    public final void i(String str, String str2, String str3, String str4) {
        h(this.c.b(), str, str2, str3, (String) null);
    }

    public c j() {
        return this.c.b();
    }

    public final c l() {
        Deque<c> deque = this.c.a;
        if (deque == null) {
            return null;
        }
        return deque.peekLast();
    }

    public final boolean m() {
        return z.j().h(Feature.REPRO_STEPS) == Feature.State.ENABLED;
    }

    public final boolean n() {
        return SettingsManager.getInstance().getCurrentPlatform() == 7 || SettingsManager.getInstance().getCurrentPlatform() == 4 || SettingsManager.getInstance().getCurrentPlatform() == 8;
    }

    public final void o() {
        m mVar;
        if (SettingsManager.getInstance().isReproStepsScreenshotEnabled() && this.c.a.size() > 20) {
            int size = this.c.a.size() - 20;
            m mVar2 = this.c;
            Objects.requireNonNull(mVar2);
            for (int i2 = 0; i2 < size; i2++) {
                mVar2.d();
            }
        }
        while (true) {
            mVar = this.c;
            if (mVar.b <= 100) {
                break;
            }
            c c2 = mVar.c();
            if (c2 == null || c2.e.size() <= 1) {
                mVar.d();
            } else {
                mVar.b--;
                if (mVar.c() != null) {
                    c c3 = mVar.c();
                    if (!c3.e.isEmpty()) {
                        c3.e.pollFirst();
                    }
                }
            }
        }
        for (c next : mVar.a) {
            ArrayList arrayList = new ArrayList();
            for (VisualUserStep next2 : next.e) {
                if (next2.getStepType() != null && (next2.getStepType().equals(StepType.ACTIVITY_PAUSED) || next2.getStepType().equals(StepType.FRAGMENT_PAUSED) || next2.getStepType().equals(StepType.DIALOG_FRAGMENT_RESUMED))) {
                    arrayList.add(next2);
                }
            }
            next.e.removeAll(arrayList);
        }
    }
}
