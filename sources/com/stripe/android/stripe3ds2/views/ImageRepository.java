package com.stripe.android.stripe3ds2.views;

import android.graphics.Bitmap;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.utils.ImageCache;
import kotlin.Metadata;
import m0.l.c;
import m0.l.e;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001dB\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019B\u0019\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u001cJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\fR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ImageRepository;", "", "", "imageUrl", "Landroid/graphics/Bitmap;", "getLocalImage", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "image", "Lm0/i;", "cacheImage", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "getImage$3ds2sdk_release", "(Ljava/lang/String;Lm0/l/c;)Ljava/lang/Object;", "getImage", "getRemoteImage", "Lm0/l/e;", "workContext", "Lm0/l/e;", "Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "imageCache", "Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "Lcom/stripe/android/stripe3ds2/views/ImageRepository$ImageSupplier;", "imageSupplier", "Lcom/stripe/android/stripe3ds2/views/ImageRepository$ImageSupplier;", "<init>", "(Lm0/l/e;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Lcom/stripe/android/stripe3ds2/views/ImageRepository$ImageSupplier;)V", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lm0/l/e;)V", "ImageSupplier", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ImageRepository.kt */
public final class ImageRepository {
    private final ImageCache imageCache;
    private final ImageSupplier imageSupplier;
    private final e workContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ImageRepository$ImageSupplier;", "", "", "url", "Landroid/graphics/Bitmap;", "getBitmap", "(Ljava/lang/String;Lm0/l/c;)Ljava/lang/Object;", "Default", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ImageRepository.kt */
    public interface ImageSupplier {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ImageRepository$ImageSupplier$Default;", "Lcom/stripe/android/stripe3ds2/views/ImageRepository$ImageSupplier;", "", "url", "Landroid/graphics/Bitmap;", "getBitmap", "(Ljava/lang/String;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "<init>", "(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: ImageRepository.kt */
        public static final class Default implements ImageSupplier {
            private final ErrorReporter errorReporter;

            public Default(ErrorReporter errorReporter2) {
                i.e(errorReporter2, "errorReporter");
                this.errorReporter = errorReporter2;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:31:0x0067, code lost:
                r2 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
                i0.j.f.p.h.H(r14, r1);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x006b, code lost:
                throw r2;
             */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x005d A[SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
            /* JADX WARNING: Removed duplicated region for block: B:41:0x007a  */
            /* JADX WARNING: Removed duplicated region for block: B:44:0x009f  */
            /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object getBitmap(java.lang.String r13, m0.l.c<? super android.graphics.Bitmap> r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof com.stripe.android.stripe3ds2.views.ImageRepository$ImageSupplier$Default$getBitmap$1
                    if (r0 == 0) goto L_0x0013
                    r0 = r14
                    com.stripe.android.stripe3ds2.views.ImageRepository$ImageSupplier$Default$getBitmap$1 r0 = (com.stripe.android.stripe3ds2.views.ImageRepository$ImageSupplier$Default$getBitmap$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.stripe.android.stripe3ds2.views.ImageRepository$ImageSupplier$Default$getBitmap$1 r0 = new com.stripe.android.stripe3ds2.views.ImageRepository$ImageSupplier$Default$getBitmap$1
                    r0.<init>(r12, r14)
                L_0x0018:
                    java.lang.Object r14 = r0.result
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.label
                    r3 = 1
                    r4 = 0
                    if (r2 == 0) goto L_0x003a
                    if (r2 != r3) goto L_0x0032
                    java.lang.Object r13 = r0.L$1
                    java.lang.String r13 = (java.lang.String) r13
                    java.lang.Object r0 = r0.L$0
                    com.stripe.android.stripe3ds2.views.ImageRepository$ImageSupplier$Default r0 = (com.stripe.android.stripe3ds2.views.ImageRepository.ImageSupplier.Default) r0
                    i0.j.f.p.h.d4(r14)     // Catch:{ all -> 0x0030 }
                    goto L_0x0059
                L_0x0030:
                    r14 = move-exception
                    goto L_0x0070
                L_0x0032:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L_0x003a:
                    i0.j.f.p.h.d4(r14)
                    com.stripe.android.stripe3ds2.transaction.StripeHttpClient r14 = new com.stripe.android.stripe3ds2.transaction.StripeHttpClient     // Catch:{ all -> 0x006e }
                    r7 = 0
                    com.stripe.android.stripe3ds2.observability.ErrorReporter r8 = r12.errorReporter     // Catch:{ all -> 0x006e }
                    r9 = 0
                    r10 = 10
                    r11 = 0
                    r5 = r14
                    r6 = r13
                    r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x006e }
                    r0.L$0 = r12     // Catch:{ all -> 0x006e }
                    r0.L$1 = r13     // Catch:{ all -> 0x006e }
                    r0.label = r3     // Catch:{ all -> 0x006e }
                    java.lang.Object r14 = r14.doGetRequest(r0)     // Catch:{ all -> 0x006e }
                    if (r14 != r1) goto L_0x0058
                    return r1
                L_0x0058:
                    r0 = r12
                L_0x0059:
                    java.io.InputStream r14 = (java.io.InputStream) r14     // Catch:{ all -> 0x0030 }
                    if (r14 == 0) goto L_0x006c
                    android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r14)     // Catch:{ all -> 0x0065 }
                    i0.j.f.p.h.H(r14, r4)     // Catch:{ all -> 0x0030 }
                    goto L_0x0074
                L_0x0065:
                    r1 = move-exception
                    throw r1     // Catch:{ all -> 0x0067 }
                L_0x0067:
                    r2 = move-exception
                    i0.j.f.p.h.H(r14, r1)     // Catch:{ all -> 0x0030 }
                    throw r2     // Catch:{ all -> 0x0030 }
                L_0x006c:
                    r1 = r4
                    goto L_0x0074
                L_0x006e:
                    r14 = move-exception
                    r0 = r12
                L_0x0070:
                    java.lang.Object r1 = i0.j.f.p.h.l0(r14)
                L_0x0074:
                    java.lang.Throwable r14 = kotlin.Result.a(r1)
                    if (r14 == 0) goto L_0x009a
                    com.stripe.android.stripe3ds2.observability.ErrorReporter r0 = r0.errorReporter
                    java.lang.RuntimeException r2 = new java.lang.RuntimeException
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r5 = "Could not get bitmap from url: "
                    r3.append(r5)
                    r3.append(r13)
                    r13 = 46
                    r3.append(r13)
                    java.lang.String r13 = r3.toString()
                    r2.<init>(r13, r14)
                    r0.reportError(r2)
                L_0x009a:
                    boolean r13 = r1 instanceof kotlin.Result.Failure
                    if (r13 == 0) goto L_0x009f
                    goto L_0x00a0
                L_0x009f:
                    r4 = r1
                L_0x00a0:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.views.ImageRepository.ImageSupplier.Default.getBitmap(java.lang.String, m0.l.c):java.lang.Object");
            }
        }

        Object getBitmap(String str, c<? super Bitmap> cVar);
    }

    public ImageRepository(e eVar, ImageCache imageCache2, ImageSupplier imageSupplier2) {
        i.e(eVar, "workContext");
        i.e(imageCache2, "imageCache");
        i.e(imageSupplier2, "imageSupplier");
        this.workContext = eVar;
        this.imageCache = imageCache2;
        this.imageSupplier = imageSupplier2;
    }

    /* access modifiers changed from: private */
    public final void cacheImage(String str, Bitmap bitmap) {
        if (bitmap != null) {
            this.imageCache.set(str, bitmap);
        }
    }

    /* access modifiers changed from: private */
    public final Bitmap getLocalImage(String str) {
        return this.imageCache.get(str);
    }

    public final Object getImage$3ds2sdk_release(String str, c<? super Bitmap> cVar) {
        return a.k4(this.workContext, new ImageRepository$getImage$2(this, str, (c) null), cVar);
    }

    public final /* synthetic */ Object getRemoteImage(String str, c<? super Bitmap> cVar) {
        return this.imageSupplier.getBitmap(str, cVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ImageRepository(ErrorReporter errorReporter, e eVar) {
        this(eVar, ImageCache.Default.INSTANCE, new ImageSupplier.Default(errorReporter));
        i.e(errorReporter, "errorReporter");
        i.e(eVar, "workContext");
    }
}
