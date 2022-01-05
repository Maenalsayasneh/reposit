package com.sinch.verification.flashcall.verification.interceptor;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.CallLog;
import android.telephony.TelephonyManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.sinch.verification.core.internal.VerificationMethodType;
import com.sinch.verification.core.internal.error.CodeInterceptionException;
import com.sinch.verification.core.verification.model.VerificationSourceType;
import i0.j.f.p.h;
import i0.n.c.b.d.b.d;
import i0.n.c.b.d.c.b;
import java.util.Date;
import java.util.Iterator;
import java.util.Objects;
import m0.c;
import m0.n.b.i;

/* compiled from: FlashCallInterceptor.kt */
public final class FlashCallInterceptor extends i0.n.c.a.f.c.a implements b, i0.n.c.b.d.b.a {
    public final c i;
    public final c j;
    public final c k;
    public final Runnable l;
    public CodeInterceptionState m;
    public final Context n;
    public final i0.n.c.a.e.c.b o;
    public final i0.n.c.b.d.b.b p;
    public Date q;
    public final long r;

    /* compiled from: FlashCallInterceptor.kt */
    public static final class a implements Runnable {
        public final /* synthetic */ FlashCallInterceptor c;

        public a(FlashCallInterceptor flashCallInterceptor) {
            this.c = flashCallInterceptor;
        }

        public final void run() {
            this.c.i();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlashCallInterceptor(Context context, i0.n.c.a.e.c.b bVar, i0.n.c.b.d.b.b bVar2, Date date, long j2, long j3, i0.n.c.a.f.c.b bVar3) {
        super(j3, bVar3, VerificationMethodType.FLASHCALL);
        i.e(context, "context");
        i.e(bVar, "flashCallPatternMatcher");
        i.e(bVar2, "callHistoryReader");
        i.e(date, "callHistoryStartDate");
        i.e(bVar3, "interceptionListener");
        this.n = context;
        this.o = bVar;
        this.p = bVar2;
        this.q = date;
        this.r = j2;
        if (j3 <= j2) {
            this.i = h.H2(new FlashCallInterceptor$telephonyManager$2(this));
            this.j = h.H2(new FlashCallInterceptor$flashCallStateListener$2(this));
            this.k = h.H2(new FlashCallInterceptor$callHistoryContentObserver$2(this));
            this.l = new a(this);
            this.m = CodeInterceptionState.NONE;
            return;
        }
        throw new CodeInterceptionException("Interception timeout cannot be greater then report timeout");
    }

    public void a() {
        j();
    }

    public void b(String str) {
        i.e(str, "number");
        h.Z1(this.c, i0.d.a.a.a.n0("onIncomingCallRinging called with number ", str), (Throwable) null, 2, (Object) null);
        i0.n.c.a.e.c.b bVar = this.o;
        Objects.requireNonNull(bVar);
        i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        if (bVar.a.matcher(str).matches()) {
            k(str, VerificationSourceType.INTERCEPTION);
        }
    }

    public boolean d() {
        return false;
    }

    public void g() {
        this.b.removeCallbacks(this.l);
        ((TelephonyManager) this.i.getValue()).listen((i0.n.c.b.d.c.a) this.j.getValue(), 0);
        d dVar = (d) this.k.getValue();
        ContentResolver contentResolver = this.n.getContentResolver();
        i.d(contentResolver, "context.contentResolver");
        Objects.requireNonNull(dVar);
        i.e(contentResolver, "contentResolver");
        contentResolver.unregisterContentObserver(dVar);
    }

    public void h() {
        long c = this.r - c();
        h.Z1(this.c, i0.d.a.a.a.l0("onInterceptorTimedOut, still reporting calls for ", c, " ms"), (Throwable) null, 2, (Object) null);
        this.b.postDelayed(this.l, c);
    }

    public final void j() {
        long time = this.q.getTime();
        i0.n.a.c cVar = this.c;
        StringBuilder P0 = i0.d.a.a.a.P0("Checking call history since ");
        P0.append(this.q);
        T t = null;
        h.Z1(cVar, P0.toString(), (Throwable) null, 2, (Object) null);
        this.q = new Date();
        Iterator<T> it = this.p.a(time).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            String str = (String) next;
            i0.n.c.a.e.c.b bVar = this.o;
            Objects.requireNonNull(bVar);
            i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
            if (bVar.a.matcher(str).matches()) {
                t = next;
                break;
            }
        }
        String str2 = (String) t;
        if (str2 != null) {
            k(str2, VerificationSourceType.LOG);
        }
    }

    public final void k(String str, VerificationSourceType verificationSourceType) {
        this.m = f() ? CodeInterceptionState.LATE : CodeInterceptionState.NORMAL;
        i0.n.a.c cVar = this.c;
        StringBuilder P0 = i0.d.a.a.a.P0("codeIntercepted isPastInterceptionTimeout?  ");
        P0.append(f());
        P0.append(" source is ");
        P0.append(verificationSourceType);
        h.Z1(cVar, P0.toString(), (Throwable) null, 2, (Object) null);
        if (!f()) {
            this.h.e(str, verificationSourceType);
        }
        i();
    }

    public void l() {
        ((TelephonyManager) this.i.getValue()).listen((i0.n.c.b.d.c.a) this.j.getValue(), 32);
        d dVar = (d) this.k.getValue();
        ContentResolver contentResolver = this.n.getContentResolver();
        i.d(contentResolver, "context.contentResolver");
        Objects.requireNonNull(dVar);
        i.e(contentResolver, "contentResolver");
        contentResolver.registerContentObserver(CallLog.Calls.CONTENT_URI, true, dVar);
        j();
    }
}
