package com.stripe.android.stripe3ds2.views;

import android.graphics.Bitmap;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.stripe3ds2.views.ImageRepository$getImage$2", f = "ImageRepository.kt", l = {33}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Landroid/graphics/Bitmap;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ImageRepository.kt */
public final class ImageRepository$getImage$2 extends SuspendLambda implements p<f0, m0.l.c<? super Bitmap>, Object> {
    public final /* synthetic */ String $imageUrl;
    public int label;
    public final /* synthetic */ ImageRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageRepository$getImage$2(ImageRepository imageRepository, String str, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = imageRepository;
        this.$imageUrl = str;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new ImageRepository$getImage$2(this.this$0, this.$imageUrl, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ImageRepository$getImage$2) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            String str = this.$imageUrl;
            if (str == null) {
                return null;
            }
            Bitmap access$getLocalImage = this.this$0.getLocalImage(str);
            if (access$getLocalImage != null) {
                return access$getLocalImage;
            }
            ImageRepository imageRepository = this.this$0;
            String str2 = this.$imageUrl;
            this.label = 1;
            obj = imageRepository.getRemoteImage(str2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Bitmap bitmap = (Bitmap) obj;
        this.this$0.cacheImage(this.$imageUrl, bitmap);
        return bitmap;
    }
}
