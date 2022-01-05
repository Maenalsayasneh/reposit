package com.clubhouse.android.channels.repos;

import com.clubhouse.android.channels.rtc.RtcWrapper;
import com.clubhouse.android.shared.auth.UserManager;
import i0.e.b.z2.i.a;
import i0.j.f.p.h;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.l.c;
import m0.n.a.p;
import m0.n.b.i;
import n0.a.f0;
import n0.a.g2.d;

/* compiled from: SpeakerStateDataSource.kt */
public final class SpeakerStateDataSource {
    public final RtcWrapper a;
    public final UserManager b;
    public final Map<Integer, a> c = new LinkedHashMap();

    @m0.l.f.a.c(c = "com.clubhouse.android.channels.repos.SpeakerStateDataSource$1", f = "SpeakerStateDataSource.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.channels.repos.SpeakerStateDataSource$1  reason: invalid class name */
    /* compiled from: SpeakerStateDataSource.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<a, c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ SpeakerStateDataSource d;

        {
            this.d = r1;
        }

        public final c<m0.i> create(Object obj, c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, (c) obj2);
            r02.c = (a) obj;
            m0.i iVar = m0.i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            a aVar = (a) this.c;
            this.d.c.put(new Integer(aVar.a), aVar);
            return m0.i.a;
        }
    }

    public SpeakerStateDataSource(RtcWrapper rtcWrapper, UserManager userManager, f0 f0Var) {
        i.e(rtcWrapper, "rtcWrapper");
        i.e(userManager, "userManager");
        i.e(f0Var, "coroutineScope");
        this.a = rtcWrapper;
        this.b = userManager;
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(rtcWrapper.p, new AnonymousClass1(this, (c<? super AnonymousClass1>) null)), f0Var);
    }

    public final boolean a(Integer num) {
        a aVar = this.c.get(num);
        if (aVar != null && aVar.b) {
            return true;
        }
        return false;
    }

    public final d<Boolean> b(Integer num) {
        return m0.r.t.a.r.m.a1.a.f1(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new SpeakerStateDataSource$muteSignalForUser$3(this, num, (c<? super SpeakerStateDataSource$muteSignalForUser$3>) null), new SpeakerStateDataSource$muteSignalForUser$$inlined$map$1(new SpeakerStateDataSource$muteSignalForUser$$inlined$filter$1(this.a.p, num))));
    }
}
