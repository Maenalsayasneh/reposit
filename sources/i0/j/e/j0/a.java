package i0.j.e.j0;

import android.content.Context;
import com.instabug.library.Instabug;
import com.instabug.library.internal.video.InternalAutoScreenRecorderHelper;
import i0.j.e.i0;
import i0.j.e.r0.e;
import i0.j.e.z;
import io.reactivex.internal.observers.EmptyCompletableObserver;
import io.reactivex.internal.operators.completable.CompletableCreate;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.Objects;

/* compiled from: InstabugUncaughtExceptionHandler */
public class a implements Thread.UncaughtExceptionHandler {
    public Thread.UncaughtExceptionHandler c = Thread.getDefaultUncaughtExceptionHandler();

    public void uncaughtException(Thread thread, Throwable th) {
        if (InternalAutoScreenRecorderHelper.getInstance().isEnabled()) {
            InternalAutoScreenRecorderHelper.getInstance().setCrashOccurred(true);
        }
        Context applicationContext = Instabug.getApplicationContext();
        if (applicationContext != null) {
            z.j().k(applicationContext);
            k0.b.a onAssembly = RxJavaPlugins.onAssembly((k0.b.a) new CompletableCreate(new e.a()));
            Objects.requireNonNull(onAssembly);
            onAssembly.a(new EmptyCompletableObserver());
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter, true));
        if (!stringWriter.getBuffer().toString().contains("com.facebook.react.modules")) {
            i0.d().a();
        }
        this.c.uncaughtException(thread, th);
    }
}
