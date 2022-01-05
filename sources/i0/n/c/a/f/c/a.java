package i0.n.c.a.f.c;

import android.os.Handler;
import com.sinch.verification.core.internal.VerificationMethodType;
import com.sinch.verification.core.verification.interceptor.CodeInterceptionTimeoutException;
import com.sinch.verification.core.verification.interceptor.InterceptorState;
import i0.j.f.p.h;
import i0.n.a.c;
import m0.n.b.i;
import m0.o.d;
import m0.r.k;

/* compiled from: BasicCodeInterceptor.kt */
public abstract class a {
    public static final /* synthetic */ k[] a = {i0.d.a.a.a.o1(a.class, "interceptionTimeout", "getInterceptionTimeout()J", 0)};
    public final Handler b = new Handler();
    public final c c = h.M2(this);
    public InterceptorState d = InterceptorState.IDLE;
    public final boolean e = true;
    public final Runnable f = new b(this);
    public final d g;
    public final b h;

    /* renamed from: i0.n.c.a.f.c.a$a  reason: collision with other inner class name */
    /* compiled from: Delegates.kt */
    public static final class C0084a extends m0.o.b<Long> {
        public final /* synthetic */ Object a;
        public final /* synthetic */ a b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0084a(Object obj, Object obj2, a aVar) {
            super(obj2);
            this.a = obj;
            this.b = aVar;
        }

        public void afterChange(k<?> kVar, Long l, Long l2) {
            i.e(kVar, "property");
            l2.longValue();
            l.longValue();
            a aVar = this.b;
            if (aVar.d == InterceptorState.STARTED) {
                aVar.e();
            }
        }
    }

    /* compiled from: BasicCodeInterceptor.kt */
    public static final class b implements Runnable {
        public final /* synthetic */ a c;

        public b(a aVar) {
            this.c = aVar;
        }

        public final void run() {
            a aVar = this.c;
            aVar.d = InterceptorState.REPORTING;
            if (aVar.d()) {
                this.c.i();
            }
            this.c.h.c(new CodeInterceptionTimeoutException());
            this.c.h();
        }
    }

    public a(long j, b bVar, VerificationMethodType verificationMethodType) {
        i.e(bVar, "interceptionListener");
        i.e(verificationMethodType, "method");
        this.h = bVar;
        Long valueOf = Long.valueOf(j);
        this.g = new C0084a(valueOf, valueOf, this);
    }

    public long c() {
        return ((Number) this.g.getValue(this, a[0])).longValue();
    }

    public boolean d() {
        return this.e;
    }

    public final void e() {
        if (this.d != InterceptorState.DONE) {
            c cVar = this.c;
            StringBuilder P0 = i0.d.a.a.a.P0("Cancel handler initialized with timeout: ");
            P0.append(c());
            h.s0(cVar, P0.toString(), (Throwable) null, 2, (Object) null);
            this.b.removeCallbacks(this.f);
            this.b.postDelayed(this.f, c());
        }
    }

    public final boolean f() {
        InterceptorState interceptorState = this.d;
        return interceptorState == InterceptorState.REPORTING || interceptorState == InterceptorState.DONE;
    }

    public abstract void g();

    public abstract void h();

    public final void i() {
        InterceptorState interceptorState = this.d;
        InterceptorState interceptorState2 = InterceptorState.DONE;
        if (interceptorState != interceptorState2) {
            h.s0(this.c, "Code interceptor stopped", (Throwable) null, 2, (Object) null);
            this.d = interceptorState2;
            this.b.removeCallbacks(this.f);
            g();
            this.h.b();
            return;
        }
        h.s0(this.c, "Interceptor already stopped", (Throwable) null, 2, (Object) null);
    }
}
