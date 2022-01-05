package com.clubhouse.android.data.network;

import com.clubhouse.android.data.models.remote.response.error.ErrorResponse;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/clubhouse/android/data/network/ErrorResponseException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/clubhouse/android/data/models/remote/response/error/ErrorResponse;", "c", "Lcom/clubhouse/android/data/models/remote/response/error/ErrorResponse;", "getData", "()Lcom/clubhouse/android/data/models/remote/response/error/ErrorResponse;", "data", "<init>", "(Lcom/clubhouse/android/data/models/remote/response/error/ErrorResponse;)V", "data_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: AbstractDataSource.kt */
public final class ErrorResponseException extends RuntimeException {
    public final ErrorResponse c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ErrorResponseException(ErrorResponse errorResponse) {
        super(errorResponse.a());
        i.e(errorResponse, MessageExtension.FIELD_DATA);
        this.c = errorResponse;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ErrorResponseException) && i.a(this.c, ((ErrorResponseException) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ErrorResponseException(data=");
        P0.append(this.c);
        P0.append(')');
        return P0.toString();
    }
}
