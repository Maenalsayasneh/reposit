package i0.j.e.l0.m;

import com.instabug.library.InstabugState;
import com.instabug.library.core.eventbus.AutoScreenRecordingEventBus;
import com.instabug.library.internal.video.ScreenRecordingService;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import k0.b.y.d;

/* compiled from: ScreenRecordingService */
public class c implements d<InstabugState> {
    public void b(Object obj) throws Exception {
        ScreenRecordingService.Action action;
        InstabugState instabugState = (InstabugState) obj;
        if (instabugState == InstabugState.DISABLED) {
            action = ScreenRecordingService.Action.STOP_DELETE;
        } else {
            action = instabugState == InstabugState.INVOKED ? ScreenRecordingService.Action.STOP_TRIM_KEEP : null;
        }
        if (action != null) {
            StringBuilder P0 = a.P0("Sending auto event: ");
            P0.append(action.toString());
            InstabugSDKLogger.v("ScreenRecordingService", P0.toString());
            AutoScreenRecordingEventBus.getInstance().post(action);
        }
    }
}
