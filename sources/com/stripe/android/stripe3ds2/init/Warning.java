package com.stripe.android.stripe3ds2.init;

import androidx.annotation.Keep;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u001f\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u001a\u0010\u0004¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/Warning;", "", "", "component1", "()Ljava/lang/String;", "component2", "Lcom/stripe/android/stripe3ds2/init/Warning$Severity;", "component3", "()Lcom/stripe/android/stripe3ds2/init/Warning$Severity;", "id", "message", "severity", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/Warning$Severity;)Lcom/stripe/android/stripe3ds2/init/Warning;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/stripe/android/stripe3ds2/init/Warning$Severity;", "getSeverity", "getMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/Warning$Severity;)V", "Severity", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
@Keep
/* compiled from: Warning.kt */
public final class Warning {
    private final String id;
    private final String message;
    private final Severity severity;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/Warning$Severity;", "", "<init>", "(Ljava/lang/String;I)V", "LOW", "MEDIUM", "HIGH", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Warning.kt */
    public enum Severity {
        LOW,
        MEDIUM,
        HIGH
    }

    public Warning(String str, String str2, Severity severity2) {
        i.e(str, "id");
        i.e(str2, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        i.e(severity2, "severity");
        this.id = str;
        this.message = str2;
        this.severity = severity2;
    }

    public static /* synthetic */ Warning copy$default(Warning warning, String str, String str2, Severity severity2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = warning.id;
        }
        if ((i & 2) != 0) {
            str2 = warning.message;
        }
        if ((i & 4) != 0) {
            severity2 = warning.severity;
        }
        return warning.copy(str, str2, severity2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.message;
    }

    public final Severity component3() {
        return this.severity;
    }

    public final Warning copy(String str, String str2, Severity severity2) {
        i.e(str, "id");
        i.e(str2, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        i.e(severity2, "severity");
        return new Warning(str, str2, severity2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Warning)) {
            return false;
        }
        Warning warning = (Warning) obj;
        return i.a(this.id, warning.id) && i.a(this.message, warning.message) && i.a(this.severity, warning.severity);
    }

    public final String getId() {
        return this.id;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Severity getSeverity() {
        return this.severity;
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Severity severity2 = this.severity;
        if (severity2 != null) {
            i = severity2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("Warning(id=");
        P0.append(this.id);
        P0.append(", message=");
        P0.append(this.message);
        P0.append(", severity=");
        P0.append(this.severity);
        P0.append(")");
        return P0.toString();
    }
}
