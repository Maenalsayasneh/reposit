package com.stripe.android.view;

import androidx.core.app.NotificationCompat;
import com.stripe.android.view.StripeEditText;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lm0/i;", "onTextChanged", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: CardInputWidget.kt */
public final class CardInputWidget$initView$9 implements StripeEditText.AfterTextChangedListener {
    public final /* synthetic */ CardInputWidget this$0;

    public CardInputWidget$initView$9(CardInputWidget cardInputWidget) {
        this.this$0 = cardInputWidget;
    }

    public final void onTextChanged(String str) {
        CardInputListener access$getCardInputListener$p;
        i.e(str, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
        if (this.this$0.getBrand().isMaxCvc(str) && (access$getCardInputListener$p = this.this$0.cardInputListener) != null) {
            access$getCardInputListener$p.onCvcComplete();
        }
    }
}
