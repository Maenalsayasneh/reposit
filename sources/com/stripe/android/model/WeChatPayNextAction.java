package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0004R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\u0007¨\u0006$"}, d2 = {"Lcom/stripe/android/model/WeChatPayNextAction;", "Lcom/stripe/android/model/StripeModel;", "Lcom/stripe/android/model/PaymentIntent;", "component1", "()Lcom/stripe/android/model/PaymentIntent;", "Lcom/stripe/android/model/WeChat;", "component2", "()Lcom/stripe/android/model/WeChat;", "paymentIntent", "weChat", "copy", "(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/model/WeChat;)Lcom/stripe/android/model/WeChatPayNextAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/PaymentIntent;", "getPaymentIntent", "Lcom/stripe/android/model/WeChat;", "getWeChat", "<init>", "(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/model/WeChat;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: WeChatPayNextAction.kt */
public final class WeChatPayNextAction implements StripeModel {
    public static final Parcelable.Creator<WeChatPayNextAction> CREATOR = new Creator();
    private final PaymentIntent paymentIntent;
    private final WeChat weChat;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<WeChatPayNextAction> {
        public final WeChatPayNextAction createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new WeChatPayNextAction(PaymentIntent.CREATOR.createFromParcel(parcel), WeChat.CREATOR.createFromParcel(parcel));
        }

        public final WeChatPayNextAction[] newArray(int i) {
            return new WeChatPayNextAction[i];
        }
    }

    public WeChatPayNextAction(PaymentIntent paymentIntent2, WeChat weChat2) {
        i.e(paymentIntent2, "paymentIntent");
        i.e(weChat2, "weChat");
        this.paymentIntent = paymentIntent2;
        this.weChat = weChat2;
    }

    public static /* synthetic */ WeChatPayNextAction copy$default(WeChatPayNextAction weChatPayNextAction, PaymentIntent paymentIntent2, WeChat weChat2, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentIntent2 = weChatPayNextAction.paymentIntent;
        }
        if ((i & 2) != 0) {
            weChat2 = weChatPayNextAction.weChat;
        }
        return weChatPayNextAction.copy(paymentIntent2, weChat2);
    }

    public final PaymentIntent component1() {
        return this.paymentIntent;
    }

    public final WeChat component2() {
        return this.weChat;
    }

    public final WeChatPayNextAction copy(PaymentIntent paymentIntent2, WeChat weChat2) {
        i.e(paymentIntent2, "paymentIntent");
        i.e(weChat2, "weChat");
        return new WeChatPayNextAction(paymentIntent2, weChat2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeChatPayNextAction)) {
            return false;
        }
        WeChatPayNextAction weChatPayNextAction = (WeChatPayNextAction) obj;
        return i.a(this.paymentIntent, weChatPayNextAction.paymentIntent) && i.a(this.weChat, weChatPayNextAction.weChat);
    }

    public final PaymentIntent getPaymentIntent() {
        return this.paymentIntent;
    }

    public final WeChat getWeChat() {
        return this.weChat;
    }

    public int hashCode() {
        PaymentIntent paymentIntent2 = this.paymentIntent;
        int i = 0;
        int hashCode = (paymentIntent2 != null ? paymentIntent2.hashCode() : 0) * 31;
        WeChat weChat2 = this.weChat;
        if (weChat2 != null) {
            i = weChat2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("WeChatPayNextAction(paymentIntent=");
        P0.append(this.paymentIntent);
        P0.append(", weChat=");
        P0.append(this.weChat);
        P0.append(")");
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        this.paymentIntent.writeToParcel(parcel, 0);
        this.weChat.writeToParcel(parcel, 0);
    }
}
