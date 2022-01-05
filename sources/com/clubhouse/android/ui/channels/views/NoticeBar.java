package com.clubhouse.android.ui.channels.views;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.clubhouse.android.databinding.ChannelNoticeBarBinding;
import com.clubhouse.app.R;
import h0.i.b.a;
import i0.e.b.d3.k;
import i0.e.b.g3.k.y0.g;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/clubhouse/android/ui/channels/views/NoticeBar;", "Landroid/widget/FrameLayout;", "Lcom/clubhouse/android/ui/channels/views/NoticeType;", "noticeType", "", "message", "Lm0/i;", "b", "(Lcom/clubhouse/android/ui/channels/views/NoticeType;Ljava/lang/String;)V", "Lcom/clubhouse/android/databinding/ChannelNoticeBarBinding;", "d", "Lcom/clubhouse/android/databinding/ChannelNoticeBarBinding;", "binding", "q", "Lcom/clubhouse/android/ui/channels/views/NoticeType;", "currentNotice", "", "x", "Z", "firstTimeNoticeShown", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: NoticeBar.kt */
public final class NoticeBar extends FrameLayout {
    public static final /* synthetic */ int c = 0;
    public final ChannelNoticeBarBinding d;
    public NoticeType q;
    public boolean x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoticeBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        i.e(context, "context");
        i.e(context, "context");
        FrameLayout.inflate(context, R.layout.channel_notice_bar, this);
        ChannelNoticeBarBinding bind = ChannelNoticeBarBinding.bind(this);
        i.d(bind, "bind(this)");
        this.d = bind;
    }

    /* access modifiers changed from: private */
    /* renamed from: setNoticeType$lambda-1  reason: not valid java name */
    public static final void m26setNoticeType$lambda1(NoticeBar noticeBar) {
        i.e(noticeBar, "this$0");
        if (NoticeType.FirstTimeAudience == noticeBar.q) {
            k.m(noticeBar);
        }
    }

    public final void b(NoticeType noticeType, String str) {
        i.e(noticeType, "noticeType");
        this.q = noticeType;
        this.d.a.setBackgroundColor(a.getColor(getContext(), noticeType.getBackground()));
        this.d.b.setTextColor(a.getColor(getContext(), noticeType.getTextColor()));
        Integer icon = noticeType.getIcon();
        if (icon != null) {
            int intValue = icon.intValue();
            TextView textView = this.d.b;
            i.d(textView, "binding.noticeText");
            k.e(textView, intValue, 0, 0, 0, 14);
        }
        if (str != null) {
            this.d.b.setText(str);
        } else if (noticeType.getDefaultMessage() != null) {
            this.d.b.setText(getResources().getString(noticeType.getDefaultMessage().intValue()));
        }
        if (noticeType != NoticeType.FirstTimeAudience) {
            k.l(this);
        } else if (!this.x) {
            k.l(this);
            this.x = true;
            Handler handler = getHandler();
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
            }
            Handler handler2 = getHandler();
            if (handler2 != null) {
                handler2.postDelayed(new g(this), TimeUnit.SECONDS.toMillis(10));
            }
        }
    }
}
