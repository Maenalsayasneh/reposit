package io.sentry.android.timber;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import io.sentry.Breadcrumb;
import io.sentry.IHub;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.protocol.Message;
import kotlin.Metadata;
import m0.n.b.i;
import v0.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0017\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b¨\u0006\""}, d2 = {"Lio/sentry/android/timber/SentryTimberTree;", "Lv0/a/a$b;", "Lio/sentry/SentryLevel;", "level", "minLevel", "", "isLoggable", "(Lio/sentry/SentryLevel;Lio/sentry/SentryLevel;)Z", "sentryLevel", "", "tag", "msg", "", "throwable", "Lm0/i;", "captureEvent", "(Lio/sentry/SentryLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "addBreadcrumb", "(Lio/sentry/SentryLevel;Ljava/lang/String;)V", "", "priority", "getSentryLevel", "(I)Lio/sentry/SentryLevel;", "message", "log", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "minEventLevel", "Lio/sentry/SentryLevel;", "Lio/sentry/IHub;", "hub", "Lio/sentry/IHub;", "minBreadcrumbLevel", "<init>", "(Lio/sentry/IHub;Lio/sentry/SentryLevel;Lio/sentry/SentryLevel;)V", "sentry-android-timber_release"}, k = 1, mv = {1, 4, 0})
/* compiled from: SentryTimberTree.kt */
public final class SentryTimberTree extends a.b {
    private final IHub hub;
    private final SentryLevel minBreadcrumbLevel;
    private final SentryLevel minEventLevel;

    public SentryTimberTree(IHub iHub, SentryLevel sentryLevel, SentryLevel sentryLevel2) {
        i.e(iHub, "hub");
        i.e(sentryLevel, "minEventLevel");
        i.e(sentryLevel2, "minBreadcrumbLevel");
        this.hub = iHub;
        this.minEventLevel = sentryLevel;
        this.minBreadcrumbLevel = sentryLevel2;
    }

    private final void addBreadcrumb(SentryLevel sentryLevel, String str) {
        if (isLoggable(sentryLevel, this.minBreadcrumbLevel)) {
            Breadcrumb breadcrumb = new Breadcrumb();
            breadcrumb.setLevel(sentryLevel);
            breadcrumb.setCategory("Timber");
            breadcrumb.setMessage(str);
            this.hub.addBreadcrumb(breadcrumb);
        }
    }

    private final void captureEvent(SentryLevel sentryLevel, String str, String str2, Throwable th) {
        if (isLoggable(sentryLevel, this.minEventLevel)) {
            SentryEvent sentryEvent = new SentryEvent();
            sentryEvent.setLevel(sentryLevel);
            if (th != null) {
                sentryEvent.setThrowable(th);
            }
            Message message = new Message();
            message.setFormatted(str2);
            sentryEvent.setMessage(message);
            if (str != null) {
                sentryEvent.setTag("TimberTag", str);
            }
            sentryEvent.setLogger("Timber");
            this.hub.captureEvent(sentryEvent);
        }
    }

    private final SentryLevel getSentryLevel(int i) {
        switch (i) {
            case 2:
                return SentryLevel.DEBUG;
            case 3:
                return SentryLevel.DEBUG;
            case 4:
                return SentryLevel.INFO;
            case 5:
                return SentryLevel.WARNING;
            case 6:
                return SentryLevel.ERROR;
            case 7:
                return SentryLevel.FATAL;
            default:
                return SentryLevel.DEBUG;
        }
    }

    private final boolean isLoggable(SentryLevel sentryLevel, SentryLevel sentryLevel2) {
        return sentryLevel.ordinal() >= sentryLevel2.ordinal();
    }

    public void log(int i, String str, String str2, Throwable th) {
        i.e(str2, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        SentryLevel sentryLevel = getSentryLevel(i);
        captureEvent(sentryLevel, str, str2, th);
        addBreadcrumb(sentryLevel, str2);
    }
}
