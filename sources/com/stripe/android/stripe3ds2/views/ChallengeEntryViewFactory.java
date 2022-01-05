package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import com.stripe.android.stripe3ds2.init.ui.UiCustomization;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeEntryViewFactory;", "", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "challengeResponseData", "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;", "createChallengeEntryTextView", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;)Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;", "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;", "createChallengeEntrySelectView", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;)Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;", "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;", "createChallengeEntryWebView", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;)Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ChallengeEntryViewFactory.kt */
public final class ChallengeEntryViewFactory {
    private final Context context;

    public ChallengeEntryViewFactory(Context context2) {
        i.e(context2, "context");
        this.context = context2;
    }

    public final ChallengeZoneSelectView createChallengeEntrySelectView(ChallengeResponseData challengeResponseData, UiCustomization uiCustomization) {
        i.e(challengeResponseData, "challengeResponseData");
        i.e(uiCustomization, "uiCustomization");
        ChallengeZoneSelectView challengeZoneSelectView = new ChallengeZoneSelectView(this.context, (AttributeSet) null, 0, challengeResponseData.getUiType() == ChallengeResponseData.UiType.SINGLE_SELECT, 6, (f) null);
        challengeZoneSelectView.setTextEntryLabel(challengeResponseData.getChallengeInfoLabel(), uiCustomization.getLabelCustomization());
        challengeZoneSelectView.setChallengeSelectOptions(challengeResponseData.getChallengeSelectOptions(), uiCustomization.getButtonCustomization(UiCustomization.ButtonType.SELECT));
        return challengeZoneSelectView;
    }

    public final ChallengeZoneTextView createChallengeEntryTextView(ChallengeResponseData challengeResponseData, UiCustomization uiCustomization) {
        i.e(challengeResponseData, "challengeResponseData");
        i.e(uiCustomization, "uiCustomization");
        ChallengeZoneTextView challengeZoneTextView = new ChallengeZoneTextView(this.context, (AttributeSet) null, 0, 6, (f) null);
        challengeZoneTextView.setTextEntryLabel(challengeResponseData.getChallengeInfoLabel());
        challengeZoneTextView.setTextBoxCustomization(uiCustomization.getTextBoxCustomization());
        return challengeZoneTextView;
    }

    public final ChallengeZoneWebView createChallengeEntryWebView(ChallengeResponseData challengeResponseData) {
        i.e(challengeResponseData, "challengeResponseData");
        ChallengeZoneWebView challengeZoneWebView = new ChallengeZoneWebView(this.context, (AttributeSet) null, 0, 6, (f) null);
        challengeZoneWebView.loadHtml(challengeResponseData.getAcsHtml());
        return challengeZoneWebView;
    }
}
