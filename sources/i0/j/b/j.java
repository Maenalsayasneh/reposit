package i0.j.b;

import android.content.Context;
import com.instabug.bug.StateCreatorEventBus;
import com.instabug.library.internal.orchestrator.Action;
import com.instabug.library.model.State;
import com.instabug.library.util.InstabugSDKLogger;

/* compiled from: StateAction */
public class j implements Action {
    public final Context a;

    public j(Context context) {
        this.a = context;
    }

    public void run() throws Exception {
        if (this.a != null) {
            InstabugSDKLogger.d(this, "Start Building state");
            if (f.g().b != null) {
                f.g().b.state = new State.Builder(this.a).build(false);
            }
            InstabugSDKLogger.d(this, "State Building finished, sending event");
            StateCreatorEventBus.getInstance().post(State.Action.FINISHED);
        }
    }
}
