package i0.b.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.Lifecycle;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.q.r;
import java.util.HashSet;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: MavericksView.kt */
public final class s {
    public static final HashSet<Integer> a = new HashSet<>();
    public static final Handler b = new Handler(Looper.getMainLooper(), a.a);

    /* compiled from: MavericksView.kt */
    public static final class a implements Handler.Callback {
        public static final a a = new a();

        public final boolean handleMessage(Message message) {
            i.e(message, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
            Object obj = message.obj;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.airbnb.mvrx.MavericksView");
            q qVar = (q) obj;
            s.a.remove(Integer.valueOf(System.identityHashCode(qVar)));
            Lifecycle lifecycle = qVar.getLifecycle();
            i.d(lifecycle, "view.lifecycle");
            if (!((r) lifecycle).c.isAtLeast(Lifecycle.State.STARTED)) {
                return true;
            }
            qVar.J();
            return true;
        }
    }
}
