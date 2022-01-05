package com.sinch.verification.flashcall;

import android.content.ContentResolver;
import android.content.Context;
import com.sinch.verification.core.verification.interceptor.InterceptorState;
import com.sinch.verification.flashcall.initialization.FlashCallInitializationDetails;
import com.sinch.verification.flashcall.initialization.FlashCallInitializationResponseData;
import com.sinch.verification.flashcall.verification.interceptor.FlashCallInterceptor;
import i0.j.f.p.h;
import i0.n.c.b.a;
import i0.n.c.b.d.b.c;
import i0.n.c.b.d.d.b;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: FlashCallVerificationMethod.kt */
public final class FlashCallVerificationMethod$onInitiate$1 extends Lambda implements l<FlashCallInitializationResponseData, i> {
    public final /* synthetic */ a c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlashCallVerificationMethod$onInitiate$1(a aVar) {
        super(1);
        this.c = aVar;
    }

    public Object invoke(Object obj) {
        FlashCallInitializationResponseData flashCallInitializationResponseData = (FlashCallInitializationResponseData) obj;
        m0.n.b.i.e(flashCallInitializationResponseData, "it");
        a aVar = this.c;
        h.Z1(aVar.b, "Trying to initialize interceptor for flashcall", (Throwable) null, 2, (Object) null);
        try {
            Context context = aVar.i.g.getContext();
            long a = flashCallInitializationResponseData.b.a();
            FlashCallInitializationDetails flashCallInitializationDetails = flashCallInitializationResponseData.b;
            long a2 = flashCallInitializationDetails.a();
            Long l = flashCallInitializationDetails.c;
            long max = Math.max(a2, l != null ? l.longValue() * ((long) 1000) : 0);
            b bVar = new b(flashCallInitializationResponseData.b.a);
            ContentResolver contentResolver = aVar.i.g.getContext().getContentResolver();
            m0.n.b.i.d(contentResolver, "config.globalConfig.context.contentResolver");
            FlashCallInterceptor flashCallInterceptor = new FlashCallInterceptor(context, bVar, new c(contentResolver), aVar.h, max, a, aVar);
            aVar.g = flashCallInterceptor;
            if (flashCallInterceptor.d == InterceptorState.IDLE) {
                h.s0(flashCallInterceptor.c, "Code interceptor started", (Throwable) null, 2, (Object) null);
                flashCallInterceptor.d = InterceptorState.STARTED;
                flashCallInterceptor.e();
                flashCallInterceptor.l();
            } else {
                h.s0(flashCallInterceptor.c, "Interceptor already started", (Throwable) null, 2, (Object) null);
            }
        } catch (Exception e) {
            aVar.f.a(e);
        }
        return i.a;
    }
}
