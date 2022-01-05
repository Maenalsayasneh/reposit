package i0.h.c.o;

import java.util.concurrent.ThreadFactory;

/* compiled from: DefaultHeartBeatInfo */
public final /* synthetic */ class c implements ThreadFactory {
    public static final c c = new c();

    public Thread newThread(Runnable runnable) {
        int i = d.a;
        return new Thread(runnable, "heartbeat-information-executor");
    }
}
