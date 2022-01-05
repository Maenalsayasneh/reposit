package i0.j.e.b1.a;

import android.annotation.SuppressLint;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.R;
import com.instabug.library.core.ui.BasePresenter;
import com.instabug.library.invocation.InstabugInvocationEvent;
import com.instabug.library.invocation.InvocationManager;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Arrays;
import java.util.List;

@SuppressFBWarnings({"SF_SWITCH_NO_DEFAULT", "SF_SWITCH_NO_DEFAULT"})
/* compiled from: OnBoardingPresenter */
public class d extends BasePresenter<b> {
    public final b c = ((b) this.view.get());

    /* compiled from: OnBoardingPresenter */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0027 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0041 */
        static {
            /*
                com.instabug.library.invocation.InstabugInvocationEvent.values()
                r0 = 5
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                com.instabug.library.invocation.InstabugInvocationEvent r2 = com.instabug.library.invocation.InstabugInvocationEvent.FLOATING_BUTTON     // Catch:{ NoSuchFieldError -> 0x0011 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0011 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001c }
                com.instabug.library.invocation.InstabugInvocationEvent r3 = com.instabug.library.invocation.InstabugInvocationEvent.SCREENSHOT     // Catch:{ NoSuchFieldError -> 0x001c }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001c }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0027 }
                com.instabug.library.invocation.InstabugInvocationEvent r4 = com.instabug.library.invocation.InstabugInvocationEvent.TWO_FINGER_SWIPE_LEFT     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0027 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0032 }
                com.instabug.library.invocation.InstabugInvocationEvent r4 = com.instabug.library.invocation.InstabugInvocationEvent.SHAKE     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                com.instabug.library.ui.onboarding.WelcomeMessage.State.values()
                int[] r2 = new int[r2]
                a = r2
                com.instabug.library.ui.onboarding.WelcomeMessage$State r3 = com.instabug.library.ui.onboarding.WelcomeMessage.State.BETA     // Catch:{ NoSuchFieldError -> 0x0041 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0041 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0041 }
            L_0x0041:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.instabug.library.ui.onboarding.WelcomeMessage$State r2 = com.instabug.library.ui.onboarding.WelcomeMessage.State.LIVE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.j.e.b1.a.d.a.<clinit>():void");
        }
    }

    public d(b bVar) {
        super(bVar);
    }

    public final int k(InstabugInvocationEvent instabugInvocationEvent) {
        int i = a.b[instabugInvocationEvent.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight ? R.drawable.ibg_core_ic_onboarding_shake : R.drawable.ibg_core_ic_onboarding_shake_dark : Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight ? R.drawable.ibg_core_ic_onboarding_swipe : R.drawable.ibg_core_ic_onboarding_swipe_dark : Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight ? R.drawable.ibg_core_ic_onboarding_screenshot : R.drawable.ibg_core_ic_onboarding_screenshot_dark : Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight ? R.drawable.ibg_core_ic_onboarding_floating_btn : R.drawable.ibg_core_ic_onboarding_floating_btn_dark;
    }

    public InstabugInvocationEvent l(List<InstabugInvocationEvent> list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        InstabugInvocationEvent instabugInvocationEvent = InstabugInvocationEvent.SHAKE;
        if (list.contains(instabugInvocationEvent)) {
            return instabugInvocationEvent;
        }
        InstabugInvocationEvent instabugInvocationEvent2 = InstabugInvocationEvent.SCREENSHOT;
        if (list.contains(instabugInvocationEvent2)) {
            return instabugInvocationEvent2;
        }
        InstabugInvocationEvent instabugInvocationEvent3 = InstabugInvocationEvent.TWO_FINGER_SWIPE_LEFT;
        if (list.contains(instabugInvocationEvent3)) {
            return instabugInvocationEvent3;
        }
        return InstabugInvocationEvent.FLOATING_BUTTON;
    }

    @SuppressLint({"NULL_DEREFERENCE"})
    public List<InstabugInvocationEvent> m() {
        return Arrays.asList(InvocationManager.getInstance().getCurrentInstabugInvocationEvents());
    }
}
