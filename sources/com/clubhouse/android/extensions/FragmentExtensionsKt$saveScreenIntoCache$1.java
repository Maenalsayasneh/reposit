package com.clubhouse.android.extensions;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.clubhouse.android.extensions.FragmentExtensionsKt$saveScreenIntoCache$1", f = "FragmentExtensions.kt", l = {}, m = "invokeSuspend")
/* compiled from: FragmentExtensions.kt */
public final class FragmentExtensionsKt$saveScreenIntoCache$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ Fragment c;
    public final /* synthetic */ String d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentExtensionsKt$saveScreenIntoCache$1(Fragment fragment, String str, m0.l.c<? super FragmentExtensionsKt$saveScreenIntoCache$1> cVar) {
        super(2, cVar);
        this.c = fragment;
        this.d = str;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new FragmentExtensionsKt$saveScreenIntoCache$1(this.c, this.d, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        FragmentExtensionsKt$saveScreenIntoCache$1 fragmentExtensionsKt$saveScreenIntoCache$1 = new FragmentExtensionsKt$saveScreenIntoCache$1(this.c, this.d, (m0.l.c) obj2);
        i iVar = i.a;
        fragmentExtensionsKt$saveScreenIntoCache$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        File externalCacheDir;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        Context requireContext = this.c.requireContext();
        m0.n.b.i.d(requireContext, "requireContext()");
        Fragment fragment = this.c;
        m0.n.b.i.e(fragment, "<this>");
        View view = fragment.getView();
        Bitmap bitmap = null;
        View rootView = view == null ? null : view.getRootView();
        if (rootView != null) {
            rootView.setDrawingCacheEnabled(true);
            bitmap = Bitmap.createBitmap(rootView.getDrawingCache());
            rootView.setDrawingCacheEnabled(false);
        }
        String str = this.d;
        m0.n.b.i.e(requireContext, "context");
        if (!(bitmap == null || (externalCacheDir = requireContext.getExternalCacheDir()) == null)) {
            String path = externalCacheDir.getPath();
            if (str == null) {
                StringBuilder P0 = a.P0("JPEG_");
                P0.append(System.currentTimeMillis());
                P0.append('_');
                str = P0.toString();
            }
            File file = new File(path, str);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(file));
            Uri.fromFile(file);
        }
        return i.a;
    }
}
