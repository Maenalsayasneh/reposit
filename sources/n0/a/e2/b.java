package n0.a.e2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.Result;
import kotlinx.coroutines.android.HandlerContext;

/* compiled from: HandlerDispatcher.kt */
public final class b {
    public static final /* synthetic */ int a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        Object obj2 = null;
        try {
            obj = new HandlerContext(a(Looper.getMainLooper(), true), (String) null, false);
        } catch (Throwable th) {
            obj = h.l0(th);
        }
        if (!(obj instanceof Result.Failure)) {
            obj2 = obj;
        }
        a aVar = (a) obj2;
    }

    public static final Handler a(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
