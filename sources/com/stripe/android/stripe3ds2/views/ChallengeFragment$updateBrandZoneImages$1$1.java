package com.stripe.android.stripe3ds2.views;

import android.graphics.Bitmap;
import android.widget.ImageView;
import h0.q.z;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/graphics/Bitmap;", "bitmap", "Lm0/i;", "onChanged", "(Landroid/graphics/Bitmap;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ChallengeFragment.kt */
public final class ChallengeFragment$updateBrandZoneImages$1$1<T> implements z<Bitmap> {
    public final /* synthetic */ ImageView $imageView;

    public ChallengeFragment$updateBrandZoneImages$1$1(ImageView imageView) {
        this.$imageView = imageView;
    }

    public final void onChanged(Bitmap bitmap) {
        if (bitmap != null) {
            this.$imageView.setVisibility(0);
            this.$imageView.setImageBitmap(bitmap);
            return;
        }
        this.$imageView.setVisibility(8);
    }
}
