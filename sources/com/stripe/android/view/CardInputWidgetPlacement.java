package com.stripe.android.view;

import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.view.CardInputWidget;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\bd\b\b\u0018\u00002\u00020\u0001B§\u0001\u0012\b\b\u0002\u0010=\u001a\u00020\u0004\u0012\b\b\u0002\u0010>\u001a\u00020\u0004\u0012\b\b\u0002\u0010?\u001a\u00020\u0004\u0012\b\b\u0002\u0010@\u001a\u00020\u0004\u0012\b\b\u0002\u0010A\u001a\u00020\u0004\u0012\b\b\u0002\u0010B\u001a\u00020\u0004\u0012\b\b\u0002\u0010C\u001a\u00020\u0004\u0012\b\b\u0002\u0010D\u001a\u00020\u0004\u0012\b\b\u0002\u0010E\u001a\u00020\u0004\u0012\b\b\u0002\u0010F\u001a\u00020\u0004\u0012\b\b\u0002\u0010G\u001a\u00020\u0004\u0012\b\b\u0002\u0010H\u001a\u00020\u0004\u0012\b\b\u0002\u0010I\u001a\u00020\u0004\u0012\b\b\u0002\u0010J\u001a\u00020\u0004\u0012\b\b\u0002\u0010K\u001a\u00020\u0004\u0012\b\b\u0002\u0010L\u001a\u00020\u0004¢\u0006\u0004\b{\u0010|J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u0006J/\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010$\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010&\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b%\u0010\u001dJ\u0010\u0010(\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010*\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b)\u0010\u001dJ\u0010\u0010,\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b+\u0010\u001dJ\u0010\u0010.\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b-\u0010\u001dJ\u0010\u00100\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b/\u0010\u001dJ\u0010\u00102\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b1\u0010\u001dJ\u0010\u00104\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b3\u0010\u001dJ\u0010\u00106\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b5\u0010\u001dJ\u0010\u00108\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b7\u0010\u001dJ\u0010\u0010:\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b9\u0010\u001dJ\u0010\u0010<\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b;\u0010\u001dJ°\u0001\u0010M\u001a\u00020\u00002\b\b\u0002\u0010=\u001a\u00020\u00042\b\b\u0002\u0010>\u001a\u00020\u00042\b\b\u0002\u0010?\u001a\u00020\u00042\b\b\u0002\u0010@\u001a\u00020\u00042\b\b\u0002\u0010A\u001a\u00020\u00042\b\b\u0002\u0010B\u001a\u00020\u00042\b\b\u0002\u0010C\u001a\u00020\u00042\b\b\u0002\u0010D\u001a\u00020\u00042\b\b\u0002\u0010E\u001a\u00020\u00042\b\b\u0002\u0010F\u001a\u00020\u00042\b\b\u0002\u0010G\u001a\u00020\u00042\b\b\u0002\u0010H\u001a\u00020\u00042\b\b\u0002\u0010I\u001a\u00020\u00042\b\b\u0002\u0010J\u001a\u00020\u00042\b\b\u0002\u0010K\u001a\u00020\u00042\b\b\u0002\u0010L\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bO\u0010\u001dJ\u001a\u0010Q\u001a\u00020\u00022\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bQ\u0010RR\"\u0010A\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bA\u0010S\u001a\u0004\bT\u0010\u001d\"\u0004\bU\u0010VR\"\u0010?\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b?\u0010S\u001a\u0004\bW\u0010\u001d\"\u0004\bX\u0010VR\"\u0010F\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bF\u0010S\u001a\u0004\bY\u0010\u001d\"\u0004\bZ\u0010VR\"\u0010H\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bH\u0010S\u001a\u0004\b[\u0010\u001d\"\u0004\b\\\u0010VR\"\u0010G\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bG\u0010S\u001a\u0004\b]\u0010\u001d\"\u0004\b^\u0010VR\"\u0010J\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bJ\u0010S\u001a\u0004\b_\u0010\u001d\"\u0004\b`\u0010VR\"\u0010I\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bI\u0010S\u001a\u0004\ba\u0010\u001d\"\u0004\bb\u0010VR\"\u0010K\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bK\u0010S\u001a\u0004\bc\u0010\u001d\"\u0004\bd\u0010VR\u0016\u0010f\u001a\u00020\u00048B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\be\u0010\u001dR\"\u0010=\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b=\u0010S\u001a\u0004\bg\u0010\u001d\"\u0004\bh\u0010VR\"\u0010@\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b@\u0010S\u001a\u0004\bi\u0010\u001d\"\u0004\bj\u0010VR\"\u0010B\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bB\u0010S\u001a\u0004\bk\u0010\u001d\"\u0004\bl\u0010VR\"\u0010C\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bC\u0010S\u001a\u0004\bm\u0010\u001d\"\u0004\bn\u0010VR\"\u0010L\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bL\u0010S\u001a\u0004\bo\u0010\u001d\"\u0004\bp\u0010VR\"\u0010>\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b>\u0010S\u001a\u0004\bq\u0010\u001d\"\u0004\br\u0010VR\u0016\u0010t\u001a\u00020\u00048B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\bs\u0010\u001dR\u0016\u0010v\u001a\u00020\u00048B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\bu\u0010\u001dR\"\u0010E\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bE\u0010S\u001a\u0004\bw\u0010\u001d\"\u0004\bx\u0010VR\"\u0010D\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bD\u0010S\u001a\u0004\by\u0010\u001d\"\u0004\bz\u0010V¨\u0006}"}, d2 = {"Lcom/stripe/android/view/CardInputWidgetPlacement;", "", "", "isFullCard", "", "getDateStartMargin$payments_core_release", "(Z)I", "getDateStartMargin", "getCvcStartMargin$payments_core_release", "getCvcStartMargin", "getPostalCodeStartMargin$payments_core_release", "getPostalCodeStartMargin", "isShowingFullCard", "postalCodeEnabled", "frameStart", "frameWidth", "Lm0/i;", "updateSpacing$payments_core_release", "(ZZII)V", "updateSpacing", "touchX", "Lcom/stripe/android/view/CardInputWidget$Field;", "getFocusField$payments_core_release", "(IIZZ)Lcom/stripe/android/view/CardInputWidget$Field;", "getFocusField", "", "toString", "()Ljava/lang/String;", "component1$payments_core_release", "()I", "component1", "component2$payments_core_release", "component2", "component3$payments_core_release", "component3", "component4$payments_core_release", "component4", "component5$payments_core_release", "component5", "component6$payments_core_release", "component6", "component7$payments_core_release", "component7", "component8$payments_core_release", "component8", "component9$payments_core_release", "component9", "component10$payments_core_release", "component10", "component11$payments_core_release", "component11", "component12$payments_core_release", "component12", "component13$payments_core_release", "component13", "component14$payments_core_release", "component14", "component15$payments_core_release", "component15", "component16$payments_core_release", "component16", "totalLengthInPixels", "cardWidth", "hiddenCardWidth", "peekCardWidth", "cardDateSeparation", "dateWidth", "dateCvcSeparation", "cvcWidth", "cvcPostalCodeSeparation", "postalCodeWidth", "cardTouchBufferLimit", "dateStartPosition", "dateEndTouchBufferLimit", "cvcStartPosition", "cvcEndTouchBufferLimit", "postalCodeStartPosition", "copy", "(IIIIIIIIIIIIIIII)Lcom/stripe/android/view/CardInputWidgetPlacement;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getCardDateSeparation$payments_core_release", "setCardDateSeparation$payments_core_release", "(I)V", "getHiddenCardWidth$payments_core_release", "setHiddenCardWidth$payments_core_release", "getPostalCodeWidth$payments_core_release", "setPostalCodeWidth$payments_core_release", "getDateStartPosition$payments_core_release", "setDateStartPosition$payments_core_release", "getCardTouchBufferLimit$payments_core_release", "setCardTouchBufferLimit$payments_core_release", "getCvcStartPosition$payments_core_release", "setCvcStartPosition$payments_core_release", "getDateEndTouchBufferLimit$payments_core_release", "setDateEndTouchBufferLimit$payments_core_release", "getCvcEndTouchBufferLimit$payments_core_release", "setCvcEndTouchBufferLimit$payments_core_release", "getCardPeekDateStartMargin", "cardPeekDateStartMargin", "getTotalLengthInPixels$payments_core_release", "setTotalLengthInPixels$payments_core_release", "getPeekCardWidth$payments_core_release", "setPeekCardWidth$payments_core_release", "getDateWidth$payments_core_release", "setDateWidth$payments_core_release", "getDateCvcSeparation$payments_core_release", "setDateCvcSeparation$payments_core_release", "getPostalCodeStartPosition$payments_core_release", "setPostalCodeStartPosition$payments_core_release", "getCardWidth$payments_core_release", "setCardWidth$payments_core_release", "getCardPeekCvcStartMargin", "cardPeekCvcStartMargin", "getCardPeekPostalCodeStartMargin", "cardPeekPostalCodeStartMargin", "getCvcPostalCodeSeparation$payments_core_release", "setCvcPostalCodeSeparation$payments_core_release", "getCvcWidth$payments_core_release", "setCvcWidth$payments_core_release", "<init>", "(IIIIIIIIIIIIIIII)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CardInputWidgetPlacement.kt */
public final class CardInputWidgetPlacement {
    private int cardDateSeparation;
    private int cardTouchBufferLimit;
    private int cardWidth;
    private int cvcEndTouchBufferLimit;
    private int cvcPostalCodeSeparation;
    private int cvcStartPosition;
    private int cvcWidth;
    private int dateCvcSeparation;
    private int dateEndTouchBufferLimit;
    private int dateStartPosition;
    private int dateWidth;
    private int hiddenCardWidth;
    private int peekCardWidth;
    private int postalCodeStartPosition;
    private int postalCodeWidth;
    private int totalLengthInPixels;

    public CardInputWidgetPlacement() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 65535, (f) null);
    }

    public CardInputWidgetPlacement(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.totalLengthInPixels = i;
        this.cardWidth = i2;
        this.hiddenCardWidth = i3;
        this.peekCardWidth = i4;
        this.cardDateSeparation = i5;
        this.dateWidth = i6;
        this.dateCvcSeparation = i7;
        this.cvcWidth = i8;
        this.cvcPostalCodeSeparation = i9;
        this.postalCodeWidth = i10;
        this.cardTouchBufferLimit = i11;
        this.dateStartPosition = i12;
        this.dateEndTouchBufferLimit = i13;
        this.cvcStartPosition = i14;
        this.cvcEndTouchBufferLimit = i15;
        this.postalCodeStartPosition = i16;
    }

    public static /* synthetic */ CardInputWidgetPlacement copy$default(CardInputWidgetPlacement cardInputWidgetPlacement, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Object obj) {
        CardInputWidgetPlacement cardInputWidgetPlacement2 = cardInputWidgetPlacement;
        int i18 = i17;
        return cardInputWidgetPlacement.copy((i18 & 1) != 0 ? cardInputWidgetPlacement2.totalLengthInPixels : i, (i18 & 2) != 0 ? cardInputWidgetPlacement2.cardWidth : i2, (i18 & 4) != 0 ? cardInputWidgetPlacement2.hiddenCardWidth : i3, (i18 & 8) != 0 ? cardInputWidgetPlacement2.peekCardWidth : i4, (i18 & 16) != 0 ? cardInputWidgetPlacement2.cardDateSeparation : i5, (i18 & 32) != 0 ? cardInputWidgetPlacement2.dateWidth : i6, (i18 & 64) != 0 ? cardInputWidgetPlacement2.dateCvcSeparation : i7, (i18 & 128) != 0 ? cardInputWidgetPlacement2.cvcWidth : i8, (i18 & 256) != 0 ? cardInputWidgetPlacement2.cvcPostalCodeSeparation : i9, (i18 & 512) != 0 ? cardInputWidgetPlacement2.postalCodeWidth : i10, (i18 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? cardInputWidgetPlacement2.cardTouchBufferLimit : i11, (i18 & 2048) != 0 ? cardInputWidgetPlacement2.dateStartPosition : i12, (i18 & 4096) != 0 ? cardInputWidgetPlacement2.dateEndTouchBufferLimit : i13, (i18 & 8192) != 0 ? cardInputWidgetPlacement2.cvcStartPosition : i14, (i18 & 16384) != 0 ? cardInputWidgetPlacement2.cvcEndTouchBufferLimit : i15, (i18 & 32768) != 0 ? cardInputWidgetPlacement2.postalCodeStartPosition : i16);
    }

    private final /* synthetic */ int getCardPeekCvcStartMargin() {
        return getCardPeekDateStartMargin() + this.dateWidth + this.dateCvcSeparation;
    }

    private final /* synthetic */ int getCardPeekDateStartMargin() {
        return this.peekCardWidth + this.cardDateSeparation;
    }

    private final /* synthetic */ int getCardPeekPostalCodeStartMargin() {
        return getCardPeekCvcStartMargin() + this.postalCodeWidth + this.cvcPostalCodeSeparation;
    }

    public final int component1$payments_core_release() {
        return this.totalLengthInPixels;
    }

    public final int component10$payments_core_release() {
        return this.postalCodeWidth;
    }

    public final int component11$payments_core_release() {
        return this.cardTouchBufferLimit;
    }

    public final int component12$payments_core_release() {
        return this.dateStartPosition;
    }

    public final int component13$payments_core_release() {
        return this.dateEndTouchBufferLimit;
    }

    public final int component14$payments_core_release() {
        return this.cvcStartPosition;
    }

    public final int component15$payments_core_release() {
        return this.cvcEndTouchBufferLimit;
    }

    public final int component16$payments_core_release() {
        return this.postalCodeStartPosition;
    }

    public final int component2$payments_core_release() {
        return this.cardWidth;
    }

    public final int component3$payments_core_release() {
        return this.hiddenCardWidth;
    }

    public final int component4$payments_core_release() {
        return this.peekCardWidth;
    }

    public final int component5$payments_core_release() {
        return this.cardDateSeparation;
    }

    public final int component6$payments_core_release() {
        return this.dateWidth;
    }

    public final int component7$payments_core_release() {
        return this.dateCvcSeparation;
    }

    public final int component8$payments_core_release() {
        return this.cvcWidth;
    }

    public final int component9$payments_core_release() {
        return this.cvcPostalCodeSeparation;
    }

    public final CardInputWidgetPlacement copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return new CardInputWidgetPlacement(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardInputWidgetPlacement)) {
            return false;
        }
        CardInputWidgetPlacement cardInputWidgetPlacement = (CardInputWidgetPlacement) obj;
        return this.totalLengthInPixels == cardInputWidgetPlacement.totalLengthInPixels && this.cardWidth == cardInputWidgetPlacement.cardWidth && this.hiddenCardWidth == cardInputWidgetPlacement.hiddenCardWidth && this.peekCardWidth == cardInputWidgetPlacement.peekCardWidth && this.cardDateSeparation == cardInputWidgetPlacement.cardDateSeparation && this.dateWidth == cardInputWidgetPlacement.dateWidth && this.dateCvcSeparation == cardInputWidgetPlacement.dateCvcSeparation && this.cvcWidth == cardInputWidgetPlacement.cvcWidth && this.cvcPostalCodeSeparation == cardInputWidgetPlacement.cvcPostalCodeSeparation && this.postalCodeWidth == cardInputWidgetPlacement.postalCodeWidth && this.cardTouchBufferLimit == cardInputWidgetPlacement.cardTouchBufferLimit && this.dateStartPosition == cardInputWidgetPlacement.dateStartPosition && this.dateEndTouchBufferLimit == cardInputWidgetPlacement.dateEndTouchBufferLimit && this.cvcStartPosition == cardInputWidgetPlacement.cvcStartPosition && this.cvcEndTouchBufferLimit == cardInputWidgetPlacement.cvcEndTouchBufferLimit && this.postalCodeStartPosition == cardInputWidgetPlacement.postalCodeStartPosition;
    }

    public final int getCardDateSeparation$payments_core_release() {
        return this.cardDateSeparation;
    }

    public final int getCardTouchBufferLimit$payments_core_release() {
        return this.cardTouchBufferLimit;
    }

    public final int getCardWidth$payments_core_release() {
        return this.cardWidth;
    }

    public final int getCvcEndTouchBufferLimit$payments_core_release() {
        return this.cvcEndTouchBufferLimit;
    }

    public final int getCvcPostalCodeSeparation$payments_core_release() {
        return this.cvcPostalCodeSeparation;
    }

    public final /* synthetic */ int getCvcStartMargin$payments_core_release(boolean z) {
        if (z) {
            return this.totalLengthInPixels;
        }
        return getCardPeekCvcStartMargin();
    }

    public final int getCvcStartPosition$payments_core_release() {
        return this.cvcStartPosition;
    }

    public final int getCvcWidth$payments_core_release() {
        return this.cvcWidth;
    }

    public final int getDateCvcSeparation$payments_core_release() {
        return this.dateCvcSeparation;
    }

    public final int getDateEndTouchBufferLimit$payments_core_release() {
        return this.dateEndTouchBufferLimit;
    }

    public final /* synthetic */ int getDateStartMargin$payments_core_release(boolean z) {
        if (z) {
            return this.cardWidth + this.cardDateSeparation;
        }
        return getCardPeekDateStartMargin();
    }

    public final int getDateStartPosition$payments_core_release() {
        return this.dateStartPosition;
    }

    public final int getDateWidth$payments_core_release() {
        return this.dateWidth;
    }

    public final CardInputWidget.Field getFocusField$payments_core_release(int i, int i2, boolean z, boolean z2) {
        if (z) {
            if (i < i2 + this.cardWidth) {
                return null;
            }
            if (i < this.cardTouchBufferLimit) {
                return CardInputWidget.Field.Number;
            }
            if (i < this.dateStartPosition) {
                return CardInputWidget.Field.Expiry;
            }
            return null;
        } else if (z2) {
            if (i < i2 + this.peekCardWidth) {
                return null;
            }
            if (i < this.cardTouchBufferLimit) {
                return CardInputWidget.Field.Number;
            }
            int i3 = this.dateStartPosition;
            if (i < i3) {
                return CardInputWidget.Field.Expiry;
            }
            if (i < i3 + this.dateWidth) {
                return null;
            }
            if (i < this.dateEndTouchBufferLimit) {
                return CardInputWidget.Field.Expiry;
            }
            int i4 = this.cvcStartPosition;
            if (i < i4) {
                return CardInputWidget.Field.Cvc;
            }
            if (i < i4 + this.cvcWidth) {
                return null;
            }
            if (i < this.cvcEndTouchBufferLimit) {
                return CardInputWidget.Field.Cvc;
            }
            if (i < this.postalCodeStartPosition) {
                return CardInputWidget.Field.PostalCode;
            }
            return null;
        } else if (i < i2 + this.peekCardWidth) {
            return null;
        } else {
            if (i < this.cardTouchBufferLimit) {
                return CardInputWidget.Field.Number;
            }
            int i5 = this.dateStartPosition;
            if (i < i5) {
                return CardInputWidget.Field.Expiry;
            }
            if (i < i5 + this.dateWidth) {
                return null;
            }
            if (i < this.dateEndTouchBufferLimit) {
                return CardInputWidget.Field.Expiry;
            }
            if (i < this.cvcStartPosition) {
                return CardInputWidget.Field.Cvc;
            }
            return null;
        }
    }

    public final int getHiddenCardWidth$payments_core_release() {
        return this.hiddenCardWidth;
    }

    public final int getPeekCardWidth$payments_core_release() {
        return this.peekCardWidth;
    }

    public final /* synthetic */ int getPostalCodeStartMargin$payments_core_release(boolean z) {
        if (z) {
            return this.totalLengthInPixels;
        }
        return getCardPeekPostalCodeStartMargin();
    }

    public final int getPostalCodeStartPosition$payments_core_release() {
        return this.postalCodeStartPosition;
    }

    public final int getPostalCodeWidth$payments_core_release() {
        return this.postalCodeWidth;
    }

    public final int getTotalLengthInPixels$payments_core_release() {
        return this.totalLengthInPixels;
    }

    public int hashCode() {
        return Integer.hashCode(this.postalCodeStartPosition) + a.M(this.cvcEndTouchBufferLimit, a.M(this.cvcStartPosition, a.M(this.dateEndTouchBufferLimit, a.M(this.dateStartPosition, a.M(this.cardTouchBufferLimit, a.M(this.postalCodeWidth, a.M(this.cvcPostalCodeSeparation, a.M(this.cvcWidth, a.M(this.dateCvcSeparation, a.M(this.dateWidth, a.M(this.cardDateSeparation, a.M(this.peekCardWidth, a.M(this.hiddenCardWidth, a.M(this.cardWidth, Integer.hashCode(this.totalLengthInPixels) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final void setCardDateSeparation$payments_core_release(int i) {
        this.cardDateSeparation = i;
    }

    public final void setCardTouchBufferLimit$payments_core_release(int i) {
        this.cardTouchBufferLimit = i;
    }

    public final void setCardWidth$payments_core_release(int i) {
        this.cardWidth = i;
    }

    public final void setCvcEndTouchBufferLimit$payments_core_release(int i) {
        this.cvcEndTouchBufferLimit = i;
    }

    public final void setCvcPostalCodeSeparation$payments_core_release(int i) {
        this.cvcPostalCodeSeparation = i;
    }

    public final void setCvcStartPosition$payments_core_release(int i) {
        this.cvcStartPosition = i;
    }

    public final void setCvcWidth$payments_core_release(int i) {
        this.cvcWidth = i;
    }

    public final void setDateCvcSeparation$payments_core_release(int i) {
        this.dateCvcSeparation = i;
    }

    public final void setDateEndTouchBufferLimit$payments_core_release(int i) {
        this.dateEndTouchBufferLimit = i;
    }

    public final void setDateStartPosition$payments_core_release(int i) {
        this.dateStartPosition = i;
    }

    public final void setDateWidth$payments_core_release(int i) {
        this.dateWidth = i;
    }

    public final void setHiddenCardWidth$payments_core_release(int i) {
        this.hiddenCardWidth = i;
    }

    public final void setPeekCardWidth$payments_core_release(int i) {
        this.peekCardWidth = i;
    }

    public final void setPostalCodeStartPosition$payments_core_release(int i) {
        this.postalCodeStartPosition = i;
    }

    public final void setPostalCodeWidth$payments_core_release(int i) {
        this.postalCodeWidth = i;
    }

    public final void setTotalLengthInPixels$payments_core_release(int i) {
        this.totalLengthInPixels = i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("\n            Touch Buffer Data:\n            CardTouchBufferLimit = ");
        P0.append(this.cardTouchBufferLimit);
        P0.append("\n            DateStartPosition = ");
        P0.append(this.dateStartPosition);
        P0.append("\n            DateEndTouchBufferLimit = ");
        P0.append(this.dateEndTouchBufferLimit);
        P0.append("\n            CvcStartPosition = ");
        P0.append(this.cvcStartPosition);
        P0.append("\n            CvcEndTouchBufferLimit = ");
        P0.append(this.cvcEndTouchBufferLimit);
        P0.append("\n            PostalCodeStartPosition = ");
        String u02 = a.u0(P0, this.postalCodeStartPosition, "\n            ");
        StringBuilder P02 = a.P0("\n            TotalLengthInPixels = ");
        P02.append(this.totalLengthInPixels);
        P02.append("\n            CardWidth = ");
        P02.append(this.cardWidth);
        P02.append("\n            HiddenCardWidth = ");
        P02.append(this.hiddenCardWidth);
        P02.append("\n            PeekCardWidth = ");
        P02.append(this.peekCardWidth);
        P02.append("\n            CardDateSeparation = ");
        P02.append(this.cardDateSeparation);
        P02.append("\n            DateWidth = ");
        P02.append(this.dateWidth);
        P02.append("\n            DateCvcSeparation = ");
        P02.append(this.dateCvcSeparation);
        P02.append("\n            CvcWidth = ");
        P02.append(this.cvcWidth);
        P02.append("\n            CvcPostalCodeSeparation = ");
        P02.append(this.cvcPostalCodeSeparation);
        P02.append("\n            PostalCodeWidth: ");
        return a.n0(a.u0(P02, this.postalCodeWidth, "\n            "), u02);
    }

    public final /* synthetic */ void updateSpacing$payments_core_release(boolean z, boolean z2, int i, int i2) {
        if (z) {
            int i3 = this.cardWidth;
            int i4 = (i2 - i3) - this.dateWidth;
            this.cardDateSeparation = i4;
            this.cardTouchBufferLimit = (i4 / 2) + i + i3;
            this.dateStartPosition = i + i3 + i4;
        } else if (z2) {
            int i5 = i2 * 3;
            int i6 = this.peekCardWidth;
            int i7 = this.dateWidth;
            int i8 = ((i5 / 10) - i6) - (i7 / 4);
            this.cardDateSeparation = i8;
            int i9 = this.cvcWidth;
            int i10 = ((((i5 / 5) - i6) - i8) - i7) - i9;
            this.dateCvcSeparation = i10;
            int i11 = (((((((i2 * 4) / 5) - i6) - i8) - i7) - i9) - i10) - this.postalCodeWidth;
            this.cvcPostalCodeSeparation = i11;
            int i12 = i + i6 + i8;
            this.cardTouchBufferLimit = i12 / 3;
            this.dateStartPosition = i12;
            int i13 = i12 + i7 + i10;
            this.dateEndTouchBufferLimit = i13 / 3;
            this.cvcStartPosition = i13;
            int i14 = i13 + i9 + i11;
            this.cvcEndTouchBufferLimit = i14 / 3;
            this.postalCodeStartPosition = i14;
        } else {
            int i15 = this.peekCardWidth;
            int i16 = this.dateWidth;
            int i17 = ((i2 / 2) - i15) - (i16 / 2);
            this.cardDateSeparation = i17;
            int i18 = (((i2 - i15) - i17) - i16) - this.cvcWidth;
            this.dateCvcSeparation = i18;
            this.cardTouchBufferLimit = (i17 / 2) + i + i15;
            int i19 = i + i15 + i17;
            this.dateStartPosition = i19;
            this.dateEndTouchBufferLimit = (i18 / 2) + i19 + i16;
            this.cvcStartPosition = i19 + i16 + i18;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CardInputWidgetPlacement(int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, m0.n.b.f r35) {
        /*
            r17 = this;
            r0 = r34
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r18
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r19
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r20
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r21
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r22
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r23
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r24
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r25
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r26
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r27
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r28
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r29
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r30
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r31
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r32
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r16
            if (r0 == 0) goto L_0x0083
            r0 = 0
            goto L_0x0085
        L_0x0083:
            r0 = r33
        L_0x0085:
            r18 = r17
            r19 = r1
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r8
            r26 = r9
            r27 = r10
            r28 = r11
            r29 = r12
            r30 = r13
            r31 = r14
            r32 = r15
            r33 = r2
            r34 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.CardInputWidgetPlacement.<init>(int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, m0.n.b.f):void");
    }
}
