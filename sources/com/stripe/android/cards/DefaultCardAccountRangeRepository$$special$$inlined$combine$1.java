package com.stripe.android.cards;

import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.c;
import m0.n.a.q;
import m0.r.t.a.r.m.a1.a;
import n0.a.g2.d;
import n0.a.g2.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ln0/a/g2/d;", "Ln0/a/g2/e;", "collector", "Lm0/i;", "collect", "(Ln0/a/g2/e;Lm0/l/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
/* compiled from: SafeCollector.common.kt */
public final class DefaultCardAccountRangeRepository$$special$$inlined$combine$1 implements d<Boolean> {
    public final /* synthetic */ d[] $flowArray$inlined;

    @m0.l.f.a.c(c = "com.stripe.android.cards.DefaultCardAccountRangeRepository$$special$$inlined$combine$1$3", f = "DefaultCardAccountRangeRepository.kt", l = {335}, m = "invokeSuspend")
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "R", "Ln0/a/g2/e;", "", "it", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$$inlined$unsafeFlow$3$lambda$2", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    /* renamed from: com.stripe.android.cards.DefaultCardAccountRangeRepository$$special$$inlined$combine$1$3  reason: invalid class name */
    /* compiled from: Zip.kt */
    public static final class AnonymousClass3 extends SuspendLambda implements q<e<? super Boolean>, Boolean[], c<? super i>, Object> {
        private /* synthetic */ Object L$0;
        private /* synthetic */ Object L$1;
        public int label;

        public final c<i> create(e<? super Boolean> eVar, Boolean[] boolArr, c<? super i> cVar) {
            AnonymousClass3 r02 = new AnonymousClass3(cVar, this);
            r02.L$0 = eVar;
            r02.L$1 = boolArr;
            return r02;
        }

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ((AnonymousClass3) create((e) obj, (Object[]) obj2, (c) obj3)).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                h.d4(obj);
                e eVar = (e) this.L$0;
                Boolean[] boolArr = (Boolean[]) ((Object[]) this.L$1);
                int length = boolArr.length;
                boolean z = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (Boolean.valueOf(boolArr[i2].booleanValue()).booleanValue()) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                Boolean valueOf = Boolean.valueOf(z);
                this.label = 1;
                if (eVar.emit(valueOf, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                h.d4(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return i.a;
        }
    }

    public DefaultCardAccountRangeRepository$$special$$inlined$combine$1(d[] dVarArr) {
        this.$flowArray$inlined = dVarArr;
    }

    public Object collect(e eVar, c cVar) {
        Object F0 = a.F0(eVar, this.$flowArray$inlined, new m0.n.a.a<Boolean[]>(this) {
            public final /* synthetic */ DefaultCardAccountRangeRepository$$special$$inlined$combine$1 this$0;

            {
                this.this$0 = r1;
            }

            public final Boolean[] invoke() {
                return new Boolean[this.this$0.$flowArray$inlined.length];
            }
        }, new AnonymousClass3((c) null), cVar);
        if (F0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return F0;
        }
        return i.a;
    }
}
