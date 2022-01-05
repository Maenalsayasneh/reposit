package com.clubhouse.android.ui.hallway.feed;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import i0.b.b.b;
import i0.e.b.g3.p.c0.v;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: FeedViewModel.kt */
public final class FeedViewModel$dismissLanguages$2 extends Lambda implements p<v, b<? extends EmptySuccessResponse>, v> {
    public final /* synthetic */ FeedViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedViewModel$dismissLanguages$2(FeedViewModel feedViewModel) {
        super(2);
        this.c = feedViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        v vVar = (v) obj;
        i.e(vVar, "$this$execute");
        i.e((b) obj2, "it");
        FeedViewModel feedViewModel = this.c;
        Objects.requireNonNull(feedViewModel);
        feedViewModel.n(new FeedViewModel$hideLanguagesFeedItem$1(feedViewModel));
        return vVar;
    }
}
