package i0.n.c.a.c.c;

import com.sinch.verification.flashcall.report.FlashCallReportData;
import com.sinch.verification.flashcall.report.FlashCallReportDetails;
import com.sinch.verification.flashcall.verification.interceptor.CodeInterceptionState;
import com.sinch.verification.flashcall.verification.interceptor.FlashCallInterceptor;
import i0.j.f.p.h;
import i0.n.c.a.d.a.c;
import i0.n.c.a.e.a;
import i0.n.c.a.e.b;
import m0.n.b.i;
import t0.w;

/* compiled from: AutoInterceptedVerificationMethod.kt */
public abstract class a<Service, Interceptor> implements b, i0.n.c.a.f.c.b {
    public c a;
    public final i0.n.a.c b = h.M2(this);
    public final i0.n.c.a.c.b.a c;
    public final Service d;
    public i0.n.c.a.e.a e;
    public final i0.n.c.a.f.d.b f;

    public a(b<Service> bVar, i0.n.c.a.f.d.b bVar2) {
        i.e(bVar, "verificationServiceConfig");
        i.e(bVar2, "verificationListener");
        i.e(bVar, "verificationServiceConfig");
        i.e(bVar2, "verificationListener");
        this.f = bVar2;
        this.c = bVar.g;
        this.d = bVar.f;
        this.e = a.C0083a.a;
    }

    public final i0.n.c.a.e.a a() {
        return this.e;
    }

    public void b() {
        i0.n.c.b.a aVar;
        FlashCallInterceptor flashCallInterceptor;
        boolean z = true;
        if ((!i.a(this.e, a.c.a)) && (flashCallInterceptor = aVar.g) != null) {
            i0.n.c.b.b bVar = (i0.n.c.b.b) (aVar = (i0.n.c.b.a) this).d;
            String str = aVar.i.a;
            CodeInterceptionState codeInterceptionState = flashCallInterceptor.m;
            boolean z2 = codeInterceptionState == CodeInterceptionState.LATE;
            if (codeInterceptionState != CodeInterceptionState.NONE) {
                z = false;
            }
            FlashCallReportData flashCallReportData = new FlashCallReportData(new FlashCallReportDetails(z2, z));
            h.s0(aVar.b, "Reporting flashCall verification status. Data: " + flashCallReportData, (Throwable) null, 2, (Object) null);
            h.z0(bVar.a(str, flashCallReportData), aVar.f(), new i0.n.c.a.f.a());
        }
    }

    public void d(i0.n.c.a.e.a aVar) {
        c cVar;
        i.e(aVar, "newState");
        i0.n.a.c cVar2 = this.b;
        StringBuilder P0 = i0.d.a.a.a.P0("Verification state update ");
        P0.append(this.e);
        P0.append(" -> ");
        P0.append(aVar);
        h.s0(cVar2, P0.toString(), (Throwable) null, 2, (Object) null);
        this.e = aVar;
        if ((aVar instanceof a.b) && (cVar = ((a.b) aVar).b) != null) {
            this.a = cVar;
        }
    }

    public final w f() {
        return this.c.a();
    }
}
