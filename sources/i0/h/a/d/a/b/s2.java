package i0.h.a.d.a.b;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class s2 implements ThreadFactory {
    public static final ThreadFactory c = new s2();

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AssetPackBackgroundExecutor");
    }
}
