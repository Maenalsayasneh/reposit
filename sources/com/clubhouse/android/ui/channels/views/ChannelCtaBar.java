package com.clubhouse.android.ui.channels.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.databinding.ChannelCtaBarBinding;
import com.clubhouse.app.R;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.e.b.d3.k;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/clubhouse/android/ui/channels/views/ChannelCtaBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "description", "button", "Landroid/view/View$OnClickListener;", "onClickListener", "Lm0/i;", "t", "(Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V", "Lcom/clubhouse/android/databinding/ChannelCtaBarBinding;", "n2", "Lcom/clubhouse/android/databinding/ChannelCtaBarBinding;", "binding", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: ChannelCtaBar.kt */
public final class ChannelCtaBar extends ConstraintLayout {
    public final ChannelCtaBarBinding n2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelCtaBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        i.e(context, "context");
        i.e(context, "context");
        ViewGroup.inflate(context, R.layout.channel_cta_bar, this);
        ChannelCtaBarBinding bind = ChannelCtaBarBinding.bind(this);
        i.d(bind, "bind(this)");
        this.n2 = bind;
        FrameLayout frameLayout = bind.e.a;
        i.d(frameLayout, "binding.topLine.dividerLineRoot");
        frameLayout.setPadding(frameLayout.getPaddingLeft(), 0, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        FrameLayout frameLayout2 = bind.d.b;
        i.d(frameLayout2, "binding.grabHandle.grabHandleRoot");
        frameLayout2.setPadding(frameLayout2.getPaddingLeft(), context.getResources().getDimensionPixelSize(R.dimen.channel_grab_handle_top_padding), frameLayout2.getPaddingRight(), frameLayout2.getPaddingBottom());
    }

    public final void t(String str, String str2, View.OnClickListener onClickListener) {
        i.e(str, InstabugDbContract.FeatureRequestEntry.COLUMN_DESCRIPTION);
        i.e(str2, "button");
        k.l(this);
        this.n2.c.setText(str);
        this.n2.b.setText(str2);
        this.n2.b.setOnClickListener(onClickListener);
    }
}
