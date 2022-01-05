package io.sentry.android.timber;

import io.sentry.IHub;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.protocol.SdkVersion;
import java.io.Closeable;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import v0.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0011\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0015\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lio/sentry/android/timber/SentryTimberIntegration;", "Lio/sentry/Integration;", "Ljava/io/Closeable;", "Lio/sentry/protocol/SdkVersion;", "sdkVersion", "Lm0/i;", "addPackage", "(Lio/sentry/protocol/SdkVersion;)V", "Lio/sentry/IHub;", "hub", "Lio/sentry/SentryOptions;", "options", "register", "(Lio/sentry/IHub;Lio/sentry/SentryOptions;)V", "close", "()V", "Lio/sentry/SentryLevel;", "minBreadcrumbLevel", "Lio/sentry/SentryLevel;", "getMinBreadcrumbLevel", "()Lio/sentry/SentryLevel;", "minEventLevel", "getMinEventLevel", "Lio/sentry/ILogger;", "logger", "Lio/sentry/ILogger;", "Lio/sentry/android/timber/SentryTimberTree;", "tree", "Lio/sentry/android/timber/SentryTimberTree;", "<init>", "(Lio/sentry/SentryLevel;Lio/sentry/SentryLevel;)V", "sentry-android-timber_release"}, k = 1, mv = {1, 4, 0})
/* compiled from: SentryTimberIntegration.kt */
public final class SentryTimberIntegration implements Integration, Closeable {
    /* access modifiers changed from: private */
    public ILogger logger;
    private final SentryLevel minBreadcrumbLevel;
    private final SentryLevel minEventLevel;
    /* access modifiers changed from: private */
    public SentryTimberTree tree;

    public SentryTimberIntegration() {
        this((SentryLevel) null, (SentryLevel) null, 3, (f) null);
    }

    public SentryTimberIntegration(SentryLevel sentryLevel, SentryLevel sentryLevel2) {
        i.e(sentryLevel, "minEventLevel");
        i.e(sentryLevel2, "minBreadcrumbLevel");
        this.minEventLevel = sentryLevel;
        this.minBreadcrumbLevel = sentryLevel2;
    }

    public static final /* synthetic */ ILogger access$getLogger$p(SentryTimberIntegration sentryTimberIntegration) {
        ILogger iLogger = sentryTimberIntegration.logger;
        if (iLogger != null) {
            return iLogger;
        }
        i.m("logger");
        throw null;
    }

    public static final /* synthetic */ SentryTimberTree access$getTree$p(SentryTimberIntegration sentryTimberIntegration) {
        SentryTimberTree sentryTimberTree = sentryTimberIntegration.tree;
        if (sentryTimberTree != null) {
            return sentryTimberTree;
        }
        i.m("tree");
        throw null;
    }

    private final void addPackage(SdkVersion sdkVersion) {
        if (sdkVersion != null) {
            sdkVersion.addPackage("maven:io.sentry:sentry-android-timber", "4.3.0");
        }
    }

    public void close() {
        SentryTimberTree sentryTimberTree = this.tree;
        if (sentryTimberTree == null) {
            return;
        }
        if (sentryTimberTree != null) {
            List<a.b> list = a.b;
            synchronized (list) {
                if (list.remove(sentryTimberTree)) {
                    a.c = (a.b[]) list.toArray(new a.b[list.size()]);
                } else {
                    throw new IllegalArgumentException("Cannot uproot tree which is not planted: " + sentryTimberTree);
                }
            }
            ILogger iLogger = this.logger;
            if (iLogger == null) {
                return;
            }
            if (iLogger != null) {
                iLogger.log(SentryLevel.DEBUG, "SentryTimberIntegration removed.", new Object[0]);
            } else {
                i.m("logger");
                throw null;
            }
        } else {
            i.m("tree");
            throw null;
        }
    }

    public final SentryLevel getMinBreadcrumbLevel() {
        return this.minBreadcrumbLevel;
    }

    public final SentryLevel getMinEventLevel() {
        return this.minEventLevel;
    }

    public void register(IHub iHub, SentryOptions sentryOptions) {
        i.e(iHub, "hub");
        i.e(sentryOptions, "options");
        addPackage(sentryOptions.getSdkVersion());
        ILogger logger2 = sentryOptions.getLogger();
        i.d(logger2, "options.logger");
        this.logger = logger2;
        SentryTimberTree sentryTimberTree = new SentryTimberTree(iHub, this.minEventLevel, this.minBreadcrumbLevel);
        this.tree = sentryTimberTree;
        if (sentryTimberTree != null) {
            a.b[] bVarArr = a.a;
            Objects.requireNonNull(sentryTimberTree, "tree == null");
            if (sentryTimberTree != a.d) {
                List<a.b> list = a.b;
                synchronized (list) {
                    list.add(sentryTimberTree);
                    a.c = (a.b[]) list.toArray(new a.b[list.size()]);
                }
                ILogger iLogger = this.logger;
                if (iLogger != null) {
                    iLogger.log(SentryLevel.DEBUG, "SentryTimberIntegration installed.", new Object[0]);
                } else {
                    i.m("logger");
                    throw null;
                }
            } else {
                throw new IllegalArgumentException("Cannot plant Timber into itself.");
            }
        } else {
            i.m("tree");
            throw null;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SentryTimberIntegration(SentryLevel sentryLevel, SentryLevel sentryLevel2, int i, f fVar) {
        this((i & 1) != 0 ? SentryLevel.ERROR : sentryLevel, (i & 2) != 0 ? SentryLevel.INFO : sentryLevel2);
    }
}
