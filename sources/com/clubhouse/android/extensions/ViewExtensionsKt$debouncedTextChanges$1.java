package com.clubhouse.android.extensions;

import android.text.Editable;
import android.widget.EditText;
import i0.e.b.d3.k;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProduceKt;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f2.l;

@c(c = "com.clubhouse.android.extensions.ViewExtensionsKt$debouncedTextChanges$1", f = "ViewExtensions.kt", l = {174}, m = "invokeSuspend")
/* compiled from: ViewExtensions.kt */
public final class ViewExtensionsKt$debouncedTextChanges$1 extends SuspendLambda implements p<l<? super String>, m0.l.c<? super i>, Object> {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ EditText q;

    /* compiled from: ViewExtensions.kt */
    public static final class a extends i0.h.a.c.q.i {
        public final /* synthetic */ l<String> c;

        public a(l<? super String> lVar) {
            this.c = lVar;
        }

        public void afterTextChanged(Editable editable) {
            m0.n.b.i.e(editable, "s");
            this.c.offer(editable.toString());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewExtensionsKt$debouncedTextChanges$1(EditText editText, m0.l.c<? super ViewExtensionsKt$debouncedTextChanges$1> cVar) {
        super(2, cVar);
        this.q = editText;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ViewExtensionsKt$debouncedTextChanges$1 viewExtensionsKt$debouncedTextChanges$1 = new ViewExtensionsKt$debouncedTextChanges$1(this.q, cVar);
        viewExtensionsKt$debouncedTextChanges$1.d = obj;
        return viewExtensionsKt$debouncedTextChanges$1;
    }

    public Object invoke(Object obj, Object obj2) {
        ViewExtensionsKt$debouncedTextChanges$1 viewExtensionsKt$debouncedTextChanges$1 = new ViewExtensionsKt$debouncedTextChanges$1(this.q, (m0.l.c) obj2);
        viewExtensionsKt$debouncedTextChanges$1.d = (l) obj;
        return viewExtensionsKt$debouncedTextChanges$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            final l lVar = (l) this.d;
            final a aVar = new a(lVar);
            final EditText editText = this.q;
            k.B(editText, new m0.n.a.a<i>() {
                public Object invoke() {
                    lVar.offer(editText.getText().toString());
                    return i.a;
                }
            });
            this.q.addTextChangedListener(aVar);
            final EditText editText2 = this.q;
            AnonymousClass2 r3 = new m0.n.a.a<i>() {
                public Object invoke() {
                    editText2.removeTextChangedListener(aVar);
                    return i.a;
                }
            };
            this.c = 1;
            if (ProduceKt.a(lVar, r3, this) == coroutineSingletons) {
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
