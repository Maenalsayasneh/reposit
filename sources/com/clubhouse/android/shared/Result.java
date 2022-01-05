package com.clubhouse.android.shared;

import com.clubhouse.android.data.network.ErrorResponseException;
import kotlin.NoWhenBranchMatchedException;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: Result.kt */
public abstract class Result<T> {

    /* compiled from: Result.kt */
    public static final class a<T> extends Result<T> {
        public final Exception a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super((f) null);
            i.e(exc, "error");
            this.a = exc;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && i.a(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Error(error=");
            P0.append(this.a);
            P0.append(')');
            return P0.toString();
        }
    }

    /* compiled from: Result.kt */
    public static final class b<T> extends Result<T> {
        public final ErrorResponseException a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ErrorResponseException errorResponseException) {
            super((f) null);
            i.e(errorResponseException, "error");
            this.a = errorResponseException;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && i.a(this.a, ((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("ErrorWithData(error=");
            P0.append(this.a);
            P0.append(')');
            return P0.toString();
        }
    }

    /* compiled from: Result.kt */
    public static final class c<T> extends Result<T> {
        public final T a;

        public c(T t) {
            super((f) null);
            this.a = t;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && i.a(this.a, ((c) obj).a);
        }

        public int hashCode() {
            T t = this.a;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Success(data=");
            P0.append(this.a);
            P0.append(')');
            return P0.toString();
        }
    }

    public Result() {
    }

    public static /* synthetic */ Result c(Result result, l lVar, l lVar2, int i, Object obj) {
        result.b((i & 1) != 0 ? Result$handleAnalytics$1.c : null, lVar2);
        return result;
    }

    public final T a() {
        if (this instanceof c) {
            return ((c) this).a;
        }
        if (this instanceof a) {
            throw ((a) this).a;
        } else if (this instanceof b) {
            throw ((b) this).a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final Result<T> b(l<? super T, m0.i> lVar, l<? super Exception, m0.i> lVar2) {
        i.e(lVar, "onSuccess");
        i.e(lVar2, "onError");
        if (this instanceof c) {
            lVar.invoke(((c) this).a);
        } else if (this instanceof a) {
            lVar2.invoke(((a) this).a);
        }
        return this;
    }

    public Result(f fVar) {
    }
}
