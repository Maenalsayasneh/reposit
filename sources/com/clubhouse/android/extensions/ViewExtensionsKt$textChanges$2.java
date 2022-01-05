package com.clubhouse.android.extensions;

import android.widget.EditText;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.g2.e;

@c(c = "com.clubhouse.android.extensions.ViewExtensionsKt$textChanges$2", f = "ViewExtensions.kt", l = {235}, m = "invokeSuspend")
/* compiled from: ViewExtensions.kt */
public final class ViewExtensionsKt$textChanges$2 extends SuspendLambda implements p<e<? super String>, m0.l.c<? super i>, Object> {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ EditText q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewExtensionsKt$textChanges$2(EditText editText, m0.l.c<? super ViewExtensionsKt$textChanges$2> cVar) {
        super(2, cVar);
        this.q = editText;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ViewExtensionsKt$textChanges$2 viewExtensionsKt$textChanges$2 = new ViewExtensionsKt$textChanges$2(this.q, cVar);
        viewExtensionsKt$textChanges$2.d = obj;
        return viewExtensionsKt$textChanges$2;
    }

    public Object invoke(Object obj, Object obj2) {
        ViewExtensionsKt$textChanges$2 viewExtensionsKt$textChanges$2 = new ViewExtensionsKt$textChanges$2(this.q, (m0.l.c) obj2);
        viewExtensionsKt$textChanges$2.d = (e) obj;
        return viewExtensionsKt$textChanges$2.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            String obj2 = this.q.getText().toString();
            this.c = 1;
            if (((e) this.d).emit(obj2, this) == coroutineSingletons) {
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
