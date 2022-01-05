package com.clubhouse.android.ui.common;

import androidx.appcompat.app.AlertController;
import com.clubhouse.app.R;
import h0.b.a.d;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: PhotoCreationFragment.kt */
public final class PhotoCreationFragment$promptToAddImage$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ PhotoCreationFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhotoCreationFragment$promptToAddImage$1(PhotoCreationFragment photoCreationFragment) {
        super(1);
        this.c = photoCreationFragment;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        aVar.e(R.string.add_photo);
        String[] strArr = {this.c.getString(R.string.take_photo), this.c.getString(R.string.choose_from_gallery)};
        i0.e.b.g3.m.d dVar = new i0.e.b.g3.m.d(this.c);
        AlertController.b bVar = aVar.a;
        bVar.o = strArr;
        bVar.q = dVar;
        return i.a;
    }
}
