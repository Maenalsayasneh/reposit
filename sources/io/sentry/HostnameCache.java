package io.sentry;

import i0.d.a.a.a;
import io.sentry.util.Objects;
import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import k0.c.b;
import k0.c.c;

public final class HostnameCache {
    private static final long GET_HOSTNAME_TIMEOUT = TimeUnit.SECONDS.toMillis(1);
    private static final long HOSTNAME_CACHE_DURATION = TimeUnit.HOURS.toMillis(5);
    public static final /* synthetic */ int a = 0;
    private final long cacheDuration;
    private final ExecutorService executorService;
    private volatile long expirationTimestamp;
    private final Callable<InetAddress> getLocalhost;
    private volatile String hostname;
    private final AtomicBoolean updateRunning;

    public static final class HostnameCacheThreadFactory implements ThreadFactory {
        private int cnt;

        private HostnameCacheThreadFactory() {
        }

        public Thread newThread(Runnable runnable) {
            StringBuilder P0 = a.P0("SentryHostnameCache-");
            int i = this.cnt;
            this.cnt = i + 1;
            P0.append(i);
            Thread thread = new Thread(runnable, P0.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public HostnameCache() {
        this(HOSTNAME_CACHE_DURATION);
    }

    private void handleCacheUpdateFailure() {
        this.expirationTimestamp = TimeUnit.SECONDS.toMillis(1) + System.currentTimeMillis();
    }

    private void updateCache() {
        try {
            this.executorService.submit(new b(this)).get(GET_HOSTNAME_TIMEOUT, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            handleCacheUpdateFailure();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            handleCacheUpdateFailure();
        }
    }

    /* JADX INFO: finally extract failed */
    public /* synthetic */ Void a() {
        try {
            this.hostname = this.getLocalhost.call().getCanonicalHostName();
            this.expirationTimestamp = System.currentTimeMillis() + this.cacheDuration;
            this.updateRunning.set(false);
            return null;
        } catch (Throwable th) {
            this.updateRunning.set(false);
            throw th;
        }
    }

    public String getHostname() {
        if (this.expirationTimestamp < System.currentTimeMillis() && this.updateRunning.compareAndSet(false, true)) {
            updateCache();
        }
        return this.hostname;
    }

    public HostnameCache(long j) {
        this(j, c.c);
    }

    public HostnameCache(long j, Callable<InetAddress> callable) {
        this.updateRunning = new AtomicBoolean(false);
        this.executorService = Executors.newSingleThreadExecutor(new HostnameCacheThreadFactory());
        this.cacheDuration = j;
        this.getLocalhost = (Callable) Objects.requireNonNull(callable, "getLocalhost is required");
        updateCache();
    }
}
