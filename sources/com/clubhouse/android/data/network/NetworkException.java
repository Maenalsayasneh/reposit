package com.clubhouse.android.data.network;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u00020\u00038\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0005¨\u0006\u0014"}, d2 = {"Lcom/clubhouse/android/data/network/NetworkException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "getMessage", "message", "<init>", "(Ljava/lang/String;)V", "data_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: AbstractDataSource.kt */
public final class NetworkException extends RuntimeException {
    public final String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NetworkException(String str) {
        super(str);
        i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        this.c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NetworkException) && i.a(this.c, ((NetworkException) obj).c);
    }

    public String getMessage() {
        return this.c;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("NetworkException(message="), this.c, ')');
    }
}
