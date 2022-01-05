package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import h0.g0.d;

public abstract class ListenableWorker {
    public Context c;
    public WorkerParameters d;
    public volatile boolean q;
    public boolean x;

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.c = context;
            this.d = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public boolean a() {
        return false;
    }

    public void c() {
    }

    public abstract i0.h.b.a.a.a<a> d();

    public final void e() {
        this.q = true;
        c();
    }

    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a  reason: collision with other inner class name */
        public static final class C0006a extends a {
            public final d a = d.b;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0006a.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((C0006a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode() + (C0006a.class.getName().hashCode() * 31);
            }

            public String toString() {
                StringBuilder P0 = i0.d.a.a.a.P0("Failure {mOutputData=");
                P0.append(this.a);
                P0.append('}');
                return P0.toString();
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {
            public final d a;

            public c() {
                this.a = d.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((c) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public String toString() {
                StringBuilder P0 = i0.d.a.a.a.P0("Success {mOutputData=");
                P0.append(this.a);
                P0.append('}');
                return P0.toString();
            }

            public c(d dVar) {
                this.a = dVar;
            }
        }
    }
}
