package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.views.ImageRepository;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.stripe.android.stripe3ds2.views.ImageRepository$ImageSupplier$Default", f = "ImageRepository.kt", l = {55}, m = "getBitmap")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "url", "Lm0/l/c;", "Landroid/graphics/Bitmap;", "continuation", "", "getBitmap", "(Ljava/lang/String;Lm0/l/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
/* compiled from: ImageRepository.kt */
public final class ImageRepository$ImageSupplier$Default$getBitmap$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ImageRepository.ImageSupplier.Default this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageRepository$ImageSupplier$Default$getBitmap$1(ImageRepository.ImageSupplier.Default defaultR, m0.l.c cVar) {
        super(cVar);
        this.this$0 = defaultR;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getBitmap((String) null, this);
    }
}
