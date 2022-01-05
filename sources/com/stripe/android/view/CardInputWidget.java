package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.app.NotificationCompat;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.cards.Cvc;
import com.stripe.android.databinding.CardInputWidgetBinding;
import com.stripe.android.model.Address;
import com.stripe.android.model.Card;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.ExpirationDate;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import com.stripe.android.view.CardValidCallback;
import com.stripe.android.view.PostalCodeEditText;
import h0.i.i.q;
import i0.d.a.a.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import m0.o.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000²\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013*\u0002­\u0001\u0018\u0000 \u00022\u00020\u00012\u00020\u0002:\u001c\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002B,\b\u0007\u0012\b\u0010ü\u0001\u001a\u00030û\u0001\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\t\b\u0002\u0010ý\u0001\u001a\u00020\u0003¢\u0006\u0006\bþ\u0001\u0010ÿ\u0001J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001bJ\u001d\u0010\"\u001a\u00020\r2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\rH\u0014¢\u0006\u0004\b$\u0010\u001bJ\u0019\u0010'\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\u0019\u0010.\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\r2\u0006\u00100\u001a\u00020\u0010H\u0016¢\u0006\u0004\b1\u0010/J#\u00104\u001a\u00020\r2\b\b\u0001\u00102\u001a\u00020\u00032\b\b\u0001\u00103\u001a\u00020\u0003H\u0016¢\u0006\u0004\b4\u00105J\u0019\u00107\u001a\u00020\r2\b\u00106\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b7\u0010/J\u0019\u0010:\u001a\u00020\r2\b\u00108\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b9\u0010/J\u000f\u0010;\u001a\u00020\rH\u0016¢\u0006\u0004\b;\u0010\u001bJ\u0017\u0010>\u001a\u00020\r2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u0019\u0010B\u001a\u00020\r2\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bB\u0010CJ\u0019\u0010E\u001a\u00020\r2\b\u0010D\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bE\u0010CJ\u0019\u0010G\u001a\u00020\r2\b\u0010F\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bG\u0010CJ\u0019\u0010I\u001a\u00020\r2\b\u0010H\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bI\u0010CJ\u000f\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b=\u0010JJ\u0017\u0010M\u001a\u00020<2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u00020OH\u0014¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020\r2\u0006\u0010R\u001a\u00020OH\u0014¢\u0006\u0004\bS\u0010TJ+\u0010Y\u001a\u00020\r2\u0006\u0010U\u001a\u00020<2\b\b\u0002\u0010V\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0001¢\u0006\u0004\bW\u0010XJ\u0017\u0010[\u001a\u00020\r2\b\u0010Z\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b[\u0010/J\u0017\u0010_\u001a\u00020\u00102\u0006\u0010\\\u001a\u00020\u0003H\u0001¢\u0006\u0004\b]\u0010^J7\u0010e\u001a\u00020\r2\u0006\u0010`\u001a\u00020<2\u0006\u0010a\u001a\u00020\u00032\u0006\u0010b\u001a\u00020\u00032\u0006\u0010c\u001a\u00020\u00032\u0006\u0010d\u001a\u00020\u0003H\u0014¢\u0006\u0004\be\u0010fR\"\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00120\u001f8@@\u0001X\u0004¢\u0006\f\u0012\u0004\bi\u0010\u001b\u001a\u0004\bg\u0010hR\u001e\u0010o\u001a\u0004\u0018\u00010k8V@\u0017X\u0004¢\u0006\f\u0012\u0004\bn\u0010\u001b\u001a\u0004\bl\u0010mR\u001c\u0010q\u001a\u00020p8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR(\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00030u8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u0018\u0010\u001a\u0004\u0018\u00010|8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R%\u0010U\u001a\u00020<8\u0000@\u0000X\u000e¢\u0006\u0015\n\u0005\bU\u0010\u0001\u001a\u0005\b\u0001\u0010J\"\u0005\b\u0001\u0010?R\u001b\u0010\u0001\u001a\u0004\u0018\u00010\u00108B@\u0002X\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u001c\u0010\u0001\u001a\u0005\u0018\u00010\u00018V@\u0016X\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u001b\u0010\u0001\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001c\u0010\u0001\u001a\u0005\u0018\u00010\u00018V@\u0016X\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u001a\u0010\u0001\u001a\u00030\u00018B@\u0002X\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R#\u0010\u0001\u001a\u0005\u0018\u00010\u00018V@\u0017X\u0004¢\u0006\u000f\u0012\u0005\b\u0001\u0010\u001b\u001a\u0006\b\u0001\u0010\u0001R\u001a\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R\"\u0010¤\u0001\u001a\u00030£\u00018\u0000@\u0000X\u0004¢\u0006\u0010\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R\"\u0010©\u0001\u001a\u00030¨\u00018\u0000@\u0000X\u0004¢\u0006\u0010\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R\u001a\u0010®\u0001\u001a\u00030­\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001c\u0010³\u0001\u001a\u0005\u0018\u00010°\u00018B@\u0002X\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001R\u001f\u0010´\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120\u001f8\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u0018\u0010\u0005\u001a\u00020\u00038B@\u0002X\u0004¢\u0006\b\u001a\u0006\b¶\u0001\u0010·\u0001R\u0019\u0010¸\u0001\u001a\u00020<8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010\u0001R\u001a\u0010º\u0001\u001a\u00030¹\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R!\u0010À\u0001\u001a\n\u0012\u0005\u0012\u00030½\u00010¼\u00018B@\u0002X\u0004¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0019\u0010Â\u0001\u001a\u00020\u00108B@\u0002X\u0004¢\u0006\b\u001a\u0006\bÁ\u0001\u0010\u0001R\u0019\u0010Ä\u0001\u001a\u00020\u00108B@\u0002X\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010\u0001R-\u0010Å\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120\u001f8\u0000@\u0001X\u0004¢\u0006\u0016\n\u0006\bÅ\u0001\u0010µ\u0001\u0012\u0005\bÇ\u0001\u0010\u001b\u001a\u0005\bÆ\u0001\u0010hR\u001a\u0010É\u0001\u001a\u00030È\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\"\u0010Ì\u0001\u001a\u00030Ë\u00018\u0000@\u0000X\u0004¢\u0006\u0010\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001R\u001a\u0010Ð\u0001\u001a\u00030\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\bÐ\u0001\u0010\u0001R'\u0010Ñ\u0001\u001a\u00020<8\u0006@\u0006X\u000e¢\u0006\u0016\n\u0006\bÑ\u0001\u0010\u0001\u001a\u0005\bÒ\u0001\u0010J\"\u0005\bÓ\u0001\u0010?R1\u0010Ù\u0001\u001a\u00020<2\u0007\u0010Ô\u0001\u001a\u00020<8F@FX\u0002¢\u0006\u0016\n\u0006\bÕ\u0001\u0010Ö\u0001\u001a\u0005\b×\u0001\u0010J\"\u0005\bØ\u0001\u0010?R1\u0010Ý\u0001\u001a\u00020<2\u0007\u0010Ô\u0001\u001a\u00020<8F@FX\u0002¢\u0006\u0016\n\u0006\bÚ\u0001\u0010Ö\u0001\u001a\u0005\bÛ\u0001\u0010J\"\u0005\bÜ\u0001\u0010?R\u0019\u0010Þ\u0001\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R\u001a\u0010à\u0001\u001a\u00030\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\bà\u0001\u0010\u0001R\u001b\u0010á\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bá\u0001\u0010ß\u0001R\"\u0010â\u0001\u001a\u00030\u00018\u0000@\u0000X\u0004¢\u0006\u0010\n\u0006\bâ\u0001\u0010\u0001\u001a\u0006\bã\u0001\u0010ä\u0001R\u001b\u0010å\u0001\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bå\u0001\u0010æ\u0001R\"\u0010è\u0001\u001a\u00030ç\u00018\u0000@\u0000X\u0004¢\u0006\u0010\n\u0006\bè\u0001\u0010é\u0001\u001a\u0006\bê\u0001\u0010ë\u0001R\"\u0010í\u0001\u001a\u00030ì\u00018\u0000@\u0000X\u0004¢\u0006\u0010\n\u0006\bí\u0001\u0010î\u0001\u001a\u0006\bï\u0001\u0010ð\u0001R\u001c\u0010ô\u0001\u001a\u0005\u0018\u00010ñ\u00018B@\u0002X\u0004¢\u0006\b\u001a\u0006\bò\u0001\u0010ó\u0001R7\u0010ö\u0001\u001a\u00020<2\u0007\u0010õ\u0001\u001a\u00020<8\u0000@BX\u000e¢\u0006\u001d\n\u0006\bö\u0001\u0010\u0001\u0012\u0005\bù\u0001\u0010\u001b\u001a\u0005\b÷\u0001\u0010J\"\u0005\bø\u0001\u0010?R\u0018\u0010V\u001a\u00020\u00038B@\u0002X\u0004¢\u0006\b\u001a\u0006\bú\u0001\u0010·\u0001¨\u0006\u0002"}, d2 = {"Lcom/stripe/android/view/CardInputWidget;", "Landroid/widget/LinearLayout;", "Lcom/stripe/android/view/CardWidget;", "", "touchX", "frameStart", "Lcom/stripe/android/view/CardInputWidget$Field;", "getFocusField", "(II)Lcom/stripe/android/view/CardInputWidget$Field;", "Landroid/view/View;", "view", "newWidth", "newMarginStart", "Lm0/i;", "updateFieldLayout", "(Landroid/view/View;II)V", "", "text", "Lcom/stripe/android/view/StripeEditText;", "editText", "getDesiredWidthInPixels", "(Ljava/lang/String;Lcom/stripe/android/view/StripeEditText;)I", "Landroid/util/AttributeSet;", "attrs", "initView", "(Landroid/util/AttributeSet;)V", "updateCvc", "()V", "applyCardElementAttributes", "scrollStart", "scrollEnd", "", "Landroid/view/animation/Animation;", "animations", "startSlideAnimation", "(Ljava/util/List;)V", "onFinishInflate", "Lcom/stripe/android/view/CardValidCallback;", "callback", "setCardValidCallback", "(Lcom/stripe/android/view/CardValidCallback;)V", "Lcom/stripe/android/view/CardInputListener;", "listener", "setCardInputListener", "(Lcom/stripe/android/view/CardInputListener;)V", "cardNumber", "setCardNumber", "(Ljava/lang/String;)V", "cardHint", "setCardHint", "month", "year", "setExpiryDate", "(II)V", "cvcCode", "setCvcCode", "postalCode", "setPostalCode$payments_core_release", "setPostalCode", "clear", "", "isEnabled", "setEnabled", "(Z)V", "Landroid/text/TextWatcher;", "cardNumberTextWatcher", "setCardNumberTextWatcher", "(Landroid/text/TextWatcher;)V", "expiryDateTextWatcher", "setExpiryDateTextWatcher", "cvcNumberTextWatcher", "setCvcNumberTextWatcher", "postalCodeTextWatcher", "setPostalCodeTextWatcher", "()Z", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "isShowingFullCard", "frameWidth", "updateSpaceSizes$payments_core_release", "(ZII)V", "updateSpaceSizes", "cvcLabel", "setCvcLabel", "panLength", "createHiddenCardText$payments_core_release", "(I)Ljava/lang/String;", "createHiddenCardText", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "getCurrentFields$payments_core_release", "()Ljava/util/List;", "getCurrentFields$payments_core_release$annotations", "currentFields", "Lcom/stripe/android/model/Card;", "getCard", "()Lcom/stripe/android/model/Card;", "getCard$annotations", "card", "Lcom/stripe/android/view/ExpiryDateEditText;", "expiryDateEditText", "Lcom/stripe/android/view/ExpiryDateEditText;", "getExpiryDateEditText$payments_core_release", "()Lcom/stripe/android/view/ExpiryDateEditText;", "Lkotlin/Function0;", "frameWidthSupplier", "Lm0/n/a/a;", "getFrameWidthSupplier$payments_core_release", "()Lm0/n/a/a;", "setFrameWidthSupplier$payments_core_release", "(Lm0/n/a/a;)V", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "getPaymentMethodCard", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "paymentMethodCard", "Z", "isShowingFullCard$payments_core_release", "setShowingFullCard$payments_core_release", "getPostalCodeValue", "()Ljava/lang/String;", "postalCodeValue", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodCreateParams", "cardInputListener", "Lcom/stripe/android/view/CardInputListener;", "Lcom/stripe/android/model/CardParams;", "getCardParams", "()Lcom/stripe/android/model/CardParams;", "cardParams", "Lcom/stripe/android/model/CardBrand;", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "brand", "Lcom/stripe/android/model/Card$Builder;", "getCardBuilder", "()Lcom/stripe/android/model/Card$Builder;", "getCardBuilder$annotations", "cardBuilder", "Lcom/google/android/material/textfield/TextInputLayout;", "cardNumberTextInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;", "layoutWidthCalculator", "Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;", "getLayoutWidthCalculator$payments_core_release", "()Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;", "setLayoutWidthCalculator$payments_core_release", "(Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;)V", "Lcom/stripe/android/view/PostalCodeEditText;", "postalCodeEditText", "Lcom/stripe/android/view/PostalCodeEditText;", "getPostalCodeEditText$payments_core_release", "()Lcom/stripe/android/view/PostalCodeEditText;", "Lcom/stripe/android/view/CardNumberEditText;", "cardNumberEditText", "Lcom/stripe/android/view/CardNumberEditText;", "getCardNumberEditText$payments_core_release", "()Lcom/stripe/android/view/CardNumberEditText;", "com/stripe/android/view/CardInputWidget$cardValidTextWatcher$1", "cardValidTextWatcher", "Lcom/stripe/android/view/CardInputWidget$cardValidTextWatcher$1;", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "getBillingDetails", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "billingDetails", "allFields", "Ljava/util/List;", "getFrameStart", "()I", "isViewInitialized", "Lcom/stripe/android/databinding/CardInputWidgetBinding;", "viewBinding", "Lcom/stripe/android/databinding/CardInputWidgetBinding;", "", "Lcom/stripe/android/view/CardValidCallback$Fields;", "getInvalidFields", "()Ljava/util/Set;", "invalidFields", "getPeekCardText", "peekCardText", "getCvcPlaceHolder", "cvcPlaceHolder", "requiredFields", "getRequiredFields$payments_core_release", "getRequiredFields$payments_core_release$annotations", "Landroid/widget/FrameLayout;", "containerLayout", "Landroid/widget/FrameLayout;", "Lcom/stripe/android/view/CardBrandView;", "cardBrandView", "Lcom/stripe/android/view/CardBrandView;", "getCardBrandView$payments_core_release", "()Lcom/stripe/android/view/CardBrandView;", "expiryDateTextInputLayout", "postalCodeRequired", "getPostalCodeRequired", "setPostalCodeRequired", "<set-?>", "usZipCodeRequired$delegate", "Lm0/o/d;", "getUsZipCodeRequired", "setUsZipCodeRequired", "usZipCodeRequired", "postalCodeEnabled$delegate", "getPostalCodeEnabled", "setPostalCodeEnabled", "postalCodeEnabled", "hiddenCardText", "Ljava/lang/String;", "cvcNumberTextInputLayout", "customCvcLabel", "postalCodeTextInputLayout", "getPostalCodeTextInputLayout$payments_core_release", "()Lcom/google/android/material/textfield/TextInputLayout;", "cardValidCallback", "Lcom/stripe/android/view/CardValidCallback;", "Lcom/stripe/android/view/CvcEditText;", "cvcEditText", "Lcom/stripe/android/view/CvcEditText;", "getCvcEditText$payments_core_release", "()Lcom/stripe/android/view/CvcEditText;", "Lcom/stripe/android/view/CardInputWidgetPlacement;", "placement", "Lcom/stripe/android/view/CardInputWidgetPlacement;", "getPlacement$payments_core_release", "()Lcom/stripe/android/view/CardInputWidgetPlacement;", "Lcom/stripe/android/cards/Cvc$Validated;", "getCvc", "()Lcom/stripe/android/cards/Cvc$Validated;", "cvc", "value", "shouldShowErrorIcon", "getShouldShowErrorIcon$payments_core_release", "setShouldShowErrorIcon", "getShouldShowErrorIcon$payments_core_release$annotations", "getFrameWidth", "Landroid/content/Context;", "context", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "AnimationEndListener", "CardFieldAnimation", "CardNumberSlideEndAnimation", "CardNumberSlideStartAnimation", "CvcSlideEndAnimation", "CvcSlideStartAnimation", "DefaultLayoutWidthCalculator", "ExpiryDateSlideEndAnimation", "ExpiryDateSlideStartAnimation", "Field", "LayoutWidthCalculator", "PostalCodeSlideEndAnimation", "PostalCodeSlideStartAnimation", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CardInputWidget.kt */
public final class CardInputWidget extends LinearLayout implements CardWidget {
    public static final /* synthetic */ k[] $$delegatedProperties = {a.o1(CardInputWidget.class, "postalCodeEnabled", "getPostalCodeEnabled()Z", 0), a.o1(CardInputWidget.class, "usZipCodeRequired", "getUsZipCodeRequired()Z", 0)};
    private static final String CVC_PLACEHOLDER_AMEX = "2345";
    private static final String CVC_PLACEHOLDER_COMMON = "CVC";
    public static final Companion Companion = new Companion((f) null);
    private static final int DEFAULT_READER_ID = R.id.stripe_default_reader_id;
    private static final String FULL_SIZING_CARD_TEXT = "4242 4242 4242 4242 424";
    private static final String FULL_SIZING_DATE_TEXT = "MM/MM";
    private static final String FULL_SIZING_POSTAL_CODE_TEXT = "1234567890";
    public static final String LOGGING_TOKEN = "CardInputView";
    private static final String STATE_CARD_VIEWED = "state_card_viewed";
    private static final String STATE_POSTAL_CODE_ENABLED = "state_postal_code_enabled";
    private static final String STATE_SUPER_STATE = "state_super_state";
    private final List<StripeEditText> allFields;
    private final /* synthetic */ CardBrandView cardBrandView;
    /* access modifiers changed from: private */
    public CardInputListener cardInputListener;
    private final /* synthetic */ CardNumberEditText cardNumberEditText;
    private final TextInputLayout cardNumberTextInputLayout;
    /* access modifiers changed from: private */
    public CardValidCallback cardValidCallback;
    private final CardInputWidget$cardValidTextWatcher$1 cardValidTextWatcher;
    /* access modifiers changed from: private */
    public final FrameLayout containerLayout;
    private String customCvcLabel;
    private final /* synthetic */ CvcEditText cvcEditText;
    private final TextInputLayout cvcNumberTextInputLayout;
    private final /* synthetic */ ExpiryDateEditText expiryDateEditText;
    private final TextInputLayout expiryDateTextInputLayout;
    private /* synthetic */ m0.n.a.a<Integer> frameWidthSupplier;
    /* access modifiers changed from: private */
    public String hiddenCardText;
    private /* synthetic */ boolean isShowingFullCard;
    private boolean isViewInitialized;
    private /* synthetic */ LayoutWidthCalculator layoutWidthCalculator;
    private final CardInputWidgetPlacement placement;
    private final /* synthetic */ PostalCodeEditText postalCodeEditText;
    private final d postalCodeEnabled$delegate;
    private boolean postalCodeRequired;
    private final TextInputLayout postalCodeTextInputLayout;
    private final /* synthetic */ List<StripeEditText> requiredFields;
    /* access modifiers changed from: private */
    public boolean shouldShowErrorIcon;
    private final d usZipCodeRequired$delegate;
    private final CardInputWidgetBinding viewBinding;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\"\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$AnimationEndListener;", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "Lm0/i;", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationRepeat", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardInputWidget.kt */
    public static abstract class AnimationEndListener implements Animation.AnimationListener {
        public void onAnimationRepeat(Animation animation) {
            i.e(animation, "animation");
        }

        public void onAnimationStart(Animation animation) {
            i.e(animation, "animation");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "Landroid/view/animation/Animation;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardInputWidget.kt */
    public static abstract class CardFieldAnimation extends Animation {
        @Deprecated
        private static final long ANIMATION_LENGTH = 150;
        private static final Companion Companion = new Companion((f) null);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation$Companion;", "", "", "ANIMATION_LENGTH", "J", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: CardInputWidget.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public CardFieldAnimation() {
            setDuration(ANIMATION_LENGTH);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$CardNumberSlideEndAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "", "interpolatedTime", "Landroid/view/animation/Transformation;", "t", "Lm0/i;", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "Landroid/view/View;", "focusOnEndView", "Landroid/view/View;", "", "hiddenCardWidth", "I", "view", "<init>", "(Landroid/view/View;ILandroid/view/View;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardInputWidget.kt */
    public static final class CardNumberSlideEndAnimation extends CardFieldAnimation {
        /* access modifiers changed from: private */
        public final View focusOnEndView;
        private final int hiddenCardWidth;
        private final View view;

        public CardNumberSlideEndAnimation(View view2, int i, View view3) {
            i.e(view2, "view");
            i.e(view3, "focusOnEndView");
            this.view = view2;
            this.hiddenCardWidth = i;
            this.focusOnEndView = view3;
            setAnimationListener(new AnimationEndListener(this) {
                public final /* synthetic */ CardNumberSlideEndAnimation this$0;

                {
                    this.this$0 = r1;
                }

                public void onAnimationEnd(Animation animation) {
                    i.e(animation, "animation");
                    this.this$0.focusOnEndView.requestFocus();
                }
            });
        }

        public void applyTransformation(float f, Transformation transformation) {
            i.e(transformation, "t");
            super.applyTransformation(f, transformation);
            View view2 = this.view;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart((int) (((float) this.hiddenCardWidth) * -1.0f * f));
            view2.setLayoutParams(layoutParams2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$CardNumberSlideStartAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "", "interpolatedTime", "Landroid/view/animation/Transformation;", "t", "Lm0/i;", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardInputWidget.kt */
    public static final class CardNumberSlideStartAnimation extends CardFieldAnimation {
        /* access modifiers changed from: private */
        public final View view;

        public CardNumberSlideStartAnimation(View view2) {
            i.e(view2, "view");
            this.view = view2;
            setAnimationListener(new AnimationEndListener(this) {
                public final /* synthetic */ CardNumberSlideStartAnimation this$0;

                {
                    this.this$0 = r1;
                }

                public void onAnimationEnd(Animation animation) {
                    i.e(animation, "animation");
                    this.this$0.view.requestFocus();
                }
            });
        }

        public void applyTransformation(float f, Transformation transformation) {
            i.e(transformation, "t");
            super.applyTransformation(f, transformation);
            View view2 = this.view;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart((int) ((((float) 1) - f) * ((float) layoutParams2.getMarginStart())));
            view2.setLayoutParams(layoutParams2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0003X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0016\u0010\u0014\u001a\u00020\u00068\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0017\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$Companion;", "", "Lcom/stripe/android/model/CardBrand;", "brand", "", "cvcHasFocus", "", "cvcText", "shouldIconShowBrand$payments_core_release", "(Lcom/stripe/android/model/CardBrand;ZLjava/lang/String;)Z", "shouldIconShowBrand", "CVC_PLACEHOLDER_AMEX", "Ljava/lang/String;", "CVC_PLACEHOLDER_COMMON", "", "DEFAULT_READER_ID", "I", "FULL_SIZING_CARD_TEXT", "FULL_SIZING_DATE_TEXT", "FULL_SIZING_POSTAL_CODE_TEXT", "LOGGING_TOKEN", "STATE_CARD_VIEWED", "STATE_POSTAL_CODE_ENABLED", "STATE_SUPER_STATE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardInputWidget.kt */
    public static final class Companion {
        private Companion() {
        }

        public final boolean shouldIconShowBrand$payments_core_release(CardBrand cardBrand, boolean z, String str) {
            i.e(cardBrand, AccountRangeJsonParser.FIELD_BRAND);
            return !z || cardBrand.isMaxCvc(str);
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$CvcSlideEndAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "", "interpolatedTime", "Landroid/view/animation/Transformation;", "t", "Lm0/i;", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "", "newWidth", "I", "Landroid/view/View;", "view", "Landroid/view/View;", "startMargin", "destination", "<init>", "(Landroid/view/View;III)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardInputWidget.kt */
    public static final class CvcSlideEndAnimation extends CardFieldAnimation {
        private final int destination;
        private final int newWidth;
        private final int startMargin;
        private final View view;

        public CvcSlideEndAnimation(View view2, int i, int i2, int i3) {
            i.e(view2, "view");
            this.view = view2;
            this.startMargin = i;
            this.destination = i2;
            this.newWidth = i3;
        }

        public void applyTransformation(float f, Transformation transformation) {
            i.e(transformation, "t");
            super.applyTransformation(f, transformation);
            View view2 = this.view;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart((int) (((((float) 1) - f) * ((float) this.startMargin)) + (((float) this.destination) * f)));
            layoutParams2.setMarginEnd(0);
            layoutParams2.width = this.newWidth;
            view2.setLayoutParams(layoutParams2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$CvcSlideStartAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "", "interpolatedTime", "Landroid/view/animation/Transformation;", "t", "Lm0/i;", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "", "newWidth", "I", "startPosition", "Landroid/view/View;", "view", "Landroid/view/View;", "destination", "<init>", "(Landroid/view/View;III)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardInputWidget.kt */
    public static final class CvcSlideStartAnimation extends CardFieldAnimation {
        private final int destination;
        private final int newWidth;
        private final int startPosition;
        private final View view;

        public CvcSlideStartAnimation(View view2, int i, int i2, int i3) {
            i.e(view2, "view");
            this.view = view2;
            this.startPosition = i;
            this.destination = i2;
            this.newWidth = i3;
        }

        public void applyTransformation(float f, Transformation transformation) {
            i.e(transformation, "t");
            super.applyTransformation(f, transformation);
            View view2 = this.view;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart((int) (((((float) 1) - f) * ((float) this.startPosition)) + (((float) this.destination) * f)));
            layoutParams2.setMarginEnd(0);
            layoutParams2.width = this.newWidth;
            view2.setLayoutParams(layoutParams2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$DefaultLayoutWidthCalculator;", "Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;", "", "text", "Landroid/text/TextPaint;", "paint", "", "calculate", "(Ljava/lang/String;Landroid/text/TextPaint;)I", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardInputWidget.kt */
    public static final class DefaultLayoutWidthCalculator implements LayoutWidthCalculator {
        public int calculate(String str, TextPaint textPaint) {
            i.e(str, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
            i.e(textPaint, "paint");
            return (int) Layout.getDesiredWidth(str, textPaint);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$ExpiryDateSlideEndAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "", "interpolatedTime", "Landroid/view/animation/Transformation;", "t", "Lm0/i;", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "", "startMargin", "I", "Landroid/view/View;", "view", "Landroid/view/View;", "destination", "<init>", "(Landroid/view/View;II)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardInputWidget.kt */
    public static final class ExpiryDateSlideEndAnimation extends CardFieldAnimation {
        private final int destination;
        private final int startMargin;
        private final View view;

        public ExpiryDateSlideEndAnimation(View view2, int i, int i2) {
            i.e(view2, "view");
            this.view = view2;
            this.startMargin = i;
            this.destination = i2;
        }

        public void applyTransformation(float f, Transformation transformation) {
            i.e(transformation, "t");
            super.applyTransformation(f, transformation);
            View view2 = this.view;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart((int) (((((float) 1) - f) * ((float) this.startMargin)) + (((float) this.destination) * f)));
            view2.setLayoutParams(layoutParams2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$ExpiryDateSlideStartAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "", "interpolatedTime", "Landroid/view/animation/Transformation;", "t", "Lm0/i;", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "", "startPosition", "I", "destination", "<init>", "(Landroid/view/View;II)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardInputWidget.kt */
    public static final class ExpiryDateSlideStartAnimation extends CardFieldAnimation {
        private final int destination;
        private final int startPosition;
        private final View view;

        public ExpiryDateSlideStartAnimation(View view2, int i, int i2) {
            i.e(view2, "view");
            this.view = view2;
            this.startPosition = i;
            this.destination = i2;
        }

        public void applyTransformation(float f, Transformation transformation) {
            i.e(transformation, "t");
            super.applyTransformation(f, transformation);
            View view2 = this.view;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart((int) (((((float) 1) - f) * ((float) this.startPosition)) + (((float) this.destination) * f)));
            view2.setLayoutParams(layoutParams2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$Field;", "", "<init>", "(Ljava/lang/String;I)V", "Number", "Expiry", "Cvc", "PostalCode", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardInputWidget.kt */
    public enum Field {
        Number,
        Expiry,
        Cvc,
        PostalCode
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bà\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;", "", "", "text", "Landroid/text/TextPaint;", "paint", "", "calculate", "(Ljava/lang/String;Landroid/text/TextPaint;)I", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardInputWidget.kt */
    public interface LayoutWidthCalculator {
        int calculate(String str, TextPaint textPaint);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$PostalCodeSlideEndAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "", "interpolatedTime", "Landroid/view/animation/Transformation;", "t", "Lm0/i;", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "", "destination", "I", "startMargin", "Landroid/view/View;", "view", "Landroid/view/View;", "newWidth", "<init>", "(Landroid/view/View;III)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardInputWidget.kt */
    public static final class PostalCodeSlideEndAnimation extends CardFieldAnimation {
        private final int destination;
        private final int newWidth;
        private final int startMargin;
        private final View view;

        public PostalCodeSlideEndAnimation(View view2, int i, int i2, int i3) {
            i.e(view2, "view");
            this.view = view2;
            this.startMargin = i;
            this.destination = i2;
            this.newWidth = i3;
        }

        public void applyTransformation(float f, Transformation transformation) {
            i.e(transformation, "t");
            super.applyTransformation(f, transformation);
            View view2 = this.view;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart((int) (((((float) 1) - f) * ((float) this.startMargin)) + (((float) this.destination) * f)));
            layoutParams2.setMarginEnd(0);
            layoutParams2.width = this.newWidth;
            view2.setLayoutParams(layoutParams2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$PostalCodeSlideStartAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "", "interpolatedTime", "Landroid/view/animation/Transformation;", "t", "Lm0/i;", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "", "newWidth", "I", "destination", "Landroid/view/View;", "view", "Landroid/view/View;", "startPosition", "<init>", "(Landroid/view/View;III)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardInputWidget.kt */
    public static final class PostalCodeSlideStartAnimation extends CardFieldAnimation {
        private final int destination;
        private final int newWidth;
        private final int startPosition;
        private final View view;

        public PostalCodeSlideStartAnimation(View view2, int i, int i2, int i3) {
            i.e(view2, "view");
            this.view = view2;
            this.startPosition = i;
            this.destination = i2;
            this.newWidth = i3;
        }

        public void applyTransformation(float f, Transformation transformation) {
            super.applyTransformation(f, transformation);
            View view2 = this.view;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart((int) (((((float) 1) - f) * ((float) this.startPosition)) + (((float) this.destination) * f)));
            layoutParams2.setMarginEnd(0);
            layoutParams2.width = this.newWidth;
            view2.setLayoutParams(layoutParams2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            Field.values();
            int[] iArr = new int[4];
            $EnumSwitchMapping$0 = iArr;
            iArr[Field.Number.ordinal()] = 1;
            iArr[Field.Expiry.ordinal()] = 2;
            iArr[Field.Cvc.ordinal()] = 3;
            iArr[Field.PostalCode.ordinal()] = 4;
        }
    }

    public CardInputWidget(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public CardInputWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardInputWidget(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void applyCardElementAttributes(AttributeSet attributeSet) {
        Context context = getContext();
        i.d(context, "context");
        int[] iArr = R.styleable.CardElement;
        i.d(iArr, "R.styleable.CardElement");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        setPostalCodeEnabled(obtainStyledAttributes.getBoolean(R.styleable.CardElement_shouldShowPostalCode, getPostalCodeEnabled()));
        this.postalCodeRequired = obtainStyledAttributes.getBoolean(R.styleable.CardElement_shouldRequirePostalCode, this.postalCodeRequired);
        setUsZipCodeRequired(obtainStyledAttributes.getBoolean(R.styleable.CardElement_shouldRequireUsZipCode, getUsZipCodeRequired()));
        obtainStyledAttributes.recycle();
    }

    private final PaymentMethod.BillingDetails getBillingDetails() {
        String postalCodeValue = getPostalCodeValue();
        if (postalCodeValue != null) {
            return new PaymentMethod.BillingDetails(new Address((String) null, (String) null, (String) null, (String) null, postalCodeValue, (String) null, 47, (f) null), (String) null, (String) null, (String) null, 14, (f) null);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final CardBrand getBrand() {
        return this.cardNumberEditText.getCardBrand();
    }

    public static /* synthetic */ void getCard$annotations() {
    }

    public static /* synthetic */ void getCardBuilder$annotations() {
    }

    public static /* synthetic */ void getCurrentFields$payments_core_release$annotations() {
    }

    private final Cvc.Validated getCvc() {
        return this.cvcEditText.getCvc$payments_core_release();
    }

    private final String getCvcPlaceHolder() {
        return CardBrand.AmericanExpress == getBrand() ? CVC_PLACEHOLDER_AMEX : CVC_PLACEHOLDER_COMMON;
    }

    private final int getDesiredWidthInPixels(String str, StripeEditText stripeEditText) {
        LayoutWidthCalculator layoutWidthCalculator2 = this.layoutWidthCalculator;
        TextPaint paint = stripeEditText.getPaint();
        i.d(paint, "editText.paint");
        return layoutWidthCalculator2.calculate(str, paint);
    }

    private final Field getFocusField(int i, int i2) {
        return this.placement.getFocusField$payments_core_release(i, i2, this.isShowingFullCard, getPostalCodeEnabled());
    }

    private final int getFrameStart() {
        Context context = getContext();
        i.d(context, "context");
        Resources resources = context.getResources();
        i.d(resources, "context.resources");
        Configuration configuration = resources.getConfiguration();
        i.d(configuration, "context.resources.configuration");
        if (configuration.getLayoutDirection() == 0) {
            return this.containerLayout.getLeft();
        }
        return this.containerLayout.getRight();
    }

    private final int getFrameWidth() {
        return this.frameWidthSupplier.invoke().intValue();
    }

    /* access modifiers changed from: private */
    public final Set<CardValidCallback.Fields> getInvalidFields() {
        CardValidCallback.Fields[] fieldsArr = new CardValidCallback.Fields[3];
        CardValidCallback.Fields fields = CardValidCallback.Fields.Number;
        boolean z = true;
        CardValidCallback.Fields fields2 = null;
        if (!(this.cardNumberEditText.getValidatedCardNumber$payments_core_release() == null)) {
            fields = null;
        }
        fieldsArr[0] = fields;
        CardValidCallback.Fields fields3 = CardValidCallback.Fields.Expiry;
        if (!(this.expiryDateEditText.getValidatedDate() == null)) {
            fields3 = null;
        }
        fieldsArr[1] = fields3;
        CardValidCallback.Fields fields4 = CardValidCallback.Fields.Cvc;
        if (getCvc() != null) {
            z = false;
        }
        if (z) {
            fields2 = fields4;
        }
        fieldsArr[2] = fields2;
        return g.D0(g.M(fieldsArr));
    }

    private final String getPeekCardText() {
        int panLength$payments_core_release = this.cardNumberEditText.getPanLength$payments_core_release();
        return StringsKt__IndentKt.z("0", panLength$payments_core_release != 14 ? panLength$payments_core_release != 15 ? panLength$payments_core_release != 19 ? 4 : 3 : 5 : 2);
    }

    private final String getPostalCodeValue() {
        if (getPostalCodeEnabled()) {
            return this.postalCodeEditText.getPostalCode$payments_core_release();
        }
        return null;
    }

    public static /* synthetic */ void getRequiredFields$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getShouldShowErrorIcon$payments_core_release$annotations() {
    }

    private final void initView(AttributeSet attributeSet) {
        applyCardElementAttributes(attributeSet);
        q.p(this.cardNumberEditText, new CardInputWidget$initView$1());
        this.isShowingFullCard = true;
        int defaultErrorColorInt = this.cardNumberEditText.getDefaultErrorColorInt();
        CardBrandView cardBrandView2 = this.cardBrandView;
        ColorStateList hintTextColors = this.cardNumberEditText.getHintTextColors();
        i.d(hintTextColors, "cardNumberEditText.hintTextColors");
        cardBrandView2.setTintColorInt$payments_core_release(hintTextColors.getDefaultColor());
        Context context = getContext();
        i.d(context, "context");
        int[] iArr = R.styleable.CardInputView;
        i.d(iArr, "R.styleable.CardInputView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        CardBrandView cardBrandView3 = this.cardBrandView;
        cardBrandView3.setTintColorInt$payments_core_release(obtainStyledAttributes.getColor(R.styleable.CardInputView_cardTint, cardBrandView3.getTintColorInt$payments_core_release()));
        int color = obtainStyledAttributes.getColor(R.styleable.CardInputView_cardTextErrorColor, defaultErrorColorInt);
        String string = obtainStyledAttributes.getString(R.styleable.CardInputView_cardHintText);
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.CardInputView_android_focusedByDefault, true);
        obtainStyledAttributes.recycle();
        if (string != null) {
            this.cardNumberEditText.setHint(string);
        }
        for (StripeEditText errorColor : getCurrentFields$payments_core_release()) {
            errorColor.setErrorColor(color);
        }
        this.cardNumberEditText.getInternalFocusChangeListeners$payments_core_release().add(new CardInputWidget$initView$5(this));
        this.expiryDateEditText.getInternalFocusChangeListeners$payments_core_release().add(new CardInputWidget$initView$6(this));
        this.postalCodeEditText.getInternalFocusChangeListeners$payments_core_release().add(new CardInputWidget$initView$7(this));
        this.expiryDateEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.cardNumberEditText));
        this.cvcEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.expiryDateEditText));
        this.postalCodeEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.cvcEditText));
        this.cvcEditText.getInternalFocusChangeListeners$payments_core_release().add(new CardInputWidget$initView$8(this));
        this.cvcEditText.setAfterTextChangedListener(new CardInputWidget$initView$9(this));
        this.cardNumberEditText.setCompletionCallback$payments_core_release(new CardInputWidget$initView$10(this));
        this.cardNumberEditText.setBrandChangeCallback$payments_core_release(new CardInputWidget$initView$11(this));
        this.expiryDateEditText.setCompletionCallback$payments_core_release(new CardInputWidget$initView$12(this));
        this.cvcEditText.setCompletionCallback$payments_core_release(new CardInputWidget$initView$13(this));
        for (StripeEditText addTextChangedListener : this.allFields) {
            addTextChangedListener.addTextChangedListener(new CardInputWidget$initView$$inlined$forEach$lambda$1(this));
        }
        if (z) {
            this.cardNumberEditText.requestFocus();
        }
        this.cardNumberEditText.setLoadingCallback$payments_core_release(new CardInputWidget$initView$15(this));
    }

    /* access modifiers changed from: private */
    public final void scrollEnd() {
        if (this.isShowingFullCard && this.isViewInitialized) {
            int dateStartMargin$payments_core_release = this.placement.getDateStartMargin$payments_core_release(true);
            updateSpaceSizes$payments_core_release$default(this, false, 0, 0, 6, (Object) null);
            CardNumberSlideEndAnimation cardNumberSlideEndAnimation = new CardNumberSlideEndAnimation(this.cardNumberTextInputLayout, this.placement.getHiddenCardWidth$payments_core_release(), this.expiryDateEditText);
            int dateStartMargin$payments_core_release2 = this.placement.getDateStartMargin$payments_core_release(false);
            ExpiryDateSlideEndAnimation expiryDateSlideEndAnimation = new ExpiryDateSlideEndAnimation(this.expiryDateTextInputLayout, dateStartMargin$payments_core_release, dateStartMargin$payments_core_release2);
            int cvcStartMargin$payments_core_release = this.placement.getCvcStartMargin$payments_core_release(false);
            int i = (dateStartMargin$payments_core_release - dateStartMargin$payments_core_release2) + cvcStartMargin$payments_core_release;
            CvcSlideEndAnimation cvcSlideEndAnimation = new CvcSlideEndAnimation(this.cvcNumberTextInputLayout, i, cvcStartMargin$payments_core_release, this.placement.getCvcWidth$payments_core_release());
            int postalCodeStartMargin$payments_core_release = this.placement.getPostalCodeStartMargin$payments_core_release(false);
            startSlideAnimation(g.M(cardNumberSlideEndAnimation, expiryDateSlideEndAnimation, cvcSlideEndAnimation, getPostalCodeEnabled() ? new PostalCodeSlideEndAnimation(this.postalCodeTextInputLayout, (i - cvcStartMargin$payments_core_release) + postalCodeStartMargin$payments_core_release, postalCodeStartMargin$payments_core_release, this.placement.getPostalCodeWidth$payments_core_release()) : null));
            this.isShowingFullCard = false;
        }
    }

    /* access modifiers changed from: private */
    public final void scrollStart() {
        if (!this.isShowingFullCard && this.isViewInitialized) {
            int dateStartMargin$payments_core_release = this.placement.getDateStartMargin$payments_core_release(false);
            int cvcStartMargin$payments_core_release = this.placement.getCvcStartMargin$payments_core_release(false);
            int postalCodeStartMargin$payments_core_release = this.placement.getPostalCodeStartMargin$payments_core_release(false);
            updateSpaceSizes$payments_core_release$default(this, true, 0, 0, 6, (Object) null);
            CardNumberSlideStartAnimation cardNumberSlideStartAnimation = new CardNumberSlideStartAnimation(this.cardNumberTextInputLayout);
            int dateStartMargin$payments_core_release2 = this.placement.getDateStartMargin$payments_core_release(true);
            ExpiryDateSlideStartAnimation expiryDateSlideStartAnimation = new ExpiryDateSlideStartAnimation(this.expiryDateTextInputLayout, dateStartMargin$payments_core_release, dateStartMargin$payments_core_release2);
            int i = (dateStartMargin$payments_core_release2 - dateStartMargin$payments_core_release) + cvcStartMargin$payments_core_release;
            startSlideAnimation(g.M(cardNumberSlideStartAnimation, expiryDateSlideStartAnimation, new CvcSlideStartAnimation(this.cvcNumberTextInputLayout, cvcStartMargin$payments_core_release, i, this.placement.getCvcWidth$payments_core_release()), getPostalCodeEnabled() ? new PostalCodeSlideStartAnimation(this.postalCodeTextInputLayout, postalCodeStartMargin$payments_core_release, (i - cvcStartMargin$payments_core_release) + postalCodeStartMargin$payments_core_release, this.placement.getPostalCodeWidth$payments_core_release()) : null));
            this.isShowingFullCard = true;
        }
    }

    /* access modifiers changed from: private */
    public final void setShouldShowErrorIcon(boolean z) {
        this.cardBrandView.setShouldShowErrorIcon(z);
        this.shouldShowErrorIcon = z;
    }

    private final void startSlideAnimation(List<? extends Animation> list) {
        AnimationSet animationSet = new AnimationSet(true);
        for (Animation addAnimation : list) {
            animationSet.addAnimation(addAnimation);
        }
        this.containerLayout.startAnimation(animationSet);
    }

    /* access modifiers changed from: private */
    public final void updateCvc() {
        CvcEditText.updateBrand$payments_core_release$default(this.cvcEditText, this.cardBrandView.getBrand(), this.customCvcLabel, (String) null, (TextInputLayout) null, 12, (Object) null);
    }

    private final void updateFieldLayout(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = i;
        layoutParams2.setMarginStart(i2);
        view.setLayoutParams(layoutParams2);
    }

    public static /* synthetic */ void updateSpaceSizes$payments_core_release$default(CardInputWidget cardInputWidget, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = cardInputWidget.getFrameWidth();
        }
        if ((i3 & 4) != 0) {
            i2 = cardInputWidget.getFrameStart();
        }
        cardInputWidget.updateSpaceSizes$payments_core_release(z, i, i2);
    }

    public void clear() {
        List<StripeEditText> currentFields$payments_core_release = getCurrentFields$payments_core_release();
        boolean z = false;
        if (!(currentFields$payments_core_release instanceof Collection) || !currentFields$payments_core_release.isEmpty()) {
            Iterator<T> it = currentFields$payments_core_release.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((StripeEditText) it.next()).hasFocus()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z || hasFocus()) {
            this.cardNumberEditText.requestFocus();
        }
        for (StripeEditText text : getCurrentFields$payments_core_release()) {
            text.setText("");
        }
    }

    public final String createHiddenCardText$payments_core_release(int i) {
        String formatted = new CardNumber.Unvalidated(StringsKt__IndentKt.z("0", i)).getFormatted(i);
        return m0.r.t.a.r.m.a1.a.S3(formatted, StringsKt__IndentKt.p(formatted, ' ', 0, false, 6) + 1);
    }

    public Card getCard() {
        Card.Builder cardBuilder = getCardBuilder();
        if (cardBuilder != null) {
            return cardBuilder.build();
        }
        return null;
    }

    public final CardBrandView getCardBrandView$payments_core_release() {
        return this.cardBrandView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.stripe.android.model.Card.Builder getCardBuilder() {
        /*
            r9 = this;
            com.stripe.android.view.CardNumberEditText r0 = r9.cardNumberEditText
            com.stripe.android.cards.CardNumber$Validated r0 = r0.getValidatedCardNumber$payments_core_release()
            com.stripe.android.view.ExpiryDateEditText r1 = r9.expiryDateEditText
            com.stripe.android.model.ExpirationDate$Validated r1 = r1.getValidatedDate()
            com.stripe.android.cards.Cvc$Validated r2 = r9.getCvc()
            com.stripe.android.view.CardNumberEditText r3 = r9.cardNumberEditText
            r4 = 1
            r5 = 0
            if (r0 != 0) goto L_0x0018
            r6 = r4
            goto L_0x0019
        L_0x0018:
            r6 = r5
        L_0x0019:
            r3.setShouldShowError(r6)
            com.stripe.android.view.ExpiryDateEditText r3 = r9.expiryDateEditText
            if (r1 != 0) goto L_0x0022
            r6 = r4
            goto L_0x0023
        L_0x0022:
            r6 = r5
        L_0x0023:
            r3.setShouldShowError(r6)
            com.stripe.android.view.CvcEditText r3 = r9.cvcEditText
            if (r2 != 0) goto L_0x002c
            r6 = r4
            goto L_0x002d
        L_0x002c:
            r6 = r5
        L_0x002d:
            r3.setShouldShowError(r6)
            com.stripe.android.view.PostalCodeEditText r3 = r9.postalCodeEditText
            boolean r6 = r9.postalCodeRequired
            if (r6 != 0) goto L_0x003c
            boolean r6 = r9.getUsZipCodeRequired()
            if (r6 == 0) goto L_0x0052
        L_0x003c:
            com.stripe.android.view.PostalCodeEditText r6 = r9.postalCodeEditText
            java.lang.String r6 = r6.getPostalCode$payments_core_release()
            if (r6 == 0) goto L_0x004d
            boolean r6 = kotlin.text.StringsKt__IndentKt.o(r6)
            if (r6 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r6 = r5
            goto L_0x004e
        L_0x004d:
            r6 = r4
        L_0x004e:
            if (r6 == 0) goto L_0x0052
            r6 = r4
            goto L_0x0053
        L_0x0052:
            r6 = r5
        L_0x0053:
            r3.setShouldShowError(r6)
            java.util.List r3 = r9.getCurrentFields$payments_core_release()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0063:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x007a
            java.lang.Object r7 = r3.next()
            r8 = r7
            com.stripe.android.view.StripeEditText r8 = (com.stripe.android.view.StripeEditText) r8
            boolean r8 = r8.getShouldShowError()
            if (r8 == 0) goto L_0x0063
            r6.add(r7)
            goto L_0x0063
        L_0x007a:
            java.util.Iterator r3 = r6.iterator()
        L_0x007e:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0094
            java.lang.Object r6 = r3.next()
            com.stripe.android.view.StripeEditText r6 = (com.stripe.android.view.StripeEditText) r6
            java.lang.String r7 = r6.getErrorMessage$payments_core_release()
            if (r7 == 0) goto L_0x007e
            r6.announceForAccessibility(r7)
            goto L_0x007e
        L_0x0094:
            if (r0 != 0) goto L_0x009c
            com.stripe.android.view.CardNumberEditText r0 = r9.cardNumberEditText
            r0.requestFocus()
            goto L_0x00b9
        L_0x009c:
            if (r1 != 0) goto L_0x00a4
            com.stripe.android.view.ExpiryDateEditText r0 = r9.expiryDateEditText
            r0.requestFocus()
            goto L_0x00b9
        L_0x00a4:
            if (r2 != 0) goto L_0x00ac
            com.stripe.android.view.CvcEditText r0 = r9.cvcEditText
            r0.requestFocus()
            goto L_0x00b9
        L_0x00ac:
            com.stripe.android.view.PostalCodeEditText r3 = r9.postalCodeEditText
            boolean r3 = r3.getShouldShowError()
            if (r3 == 0) goto L_0x00be
            com.stripe.android.view.PostalCodeEditText r0 = r9.postalCodeEditText
            r0.requestFocus()
        L_0x00b9:
            r9.setShouldShowErrorIcon(r4)
            r0 = 0
            return r0
        L_0x00be:
            r9.setShouldShowErrorIcon(r5)
            com.stripe.android.model.Card$Builder r3 = new com.stripe.android.model.Card$Builder
            java.lang.String r0 = r0.getValue$payments_core_release()
            int r4 = r1.getMonth()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r1 = r1.getYear()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = r2.getValue$payments_core_release()
            r3.<init>(r0, r4, r1, r2)
            java.lang.String r0 = r9.getPostalCodeValue()
            com.stripe.android.model.Card$Builder r0 = r3.addressZip(r0)
            java.lang.String r1 = "CardInputView"
            java.util.Set r1 = i0.j.f.p.h.N3(r1)
            com.stripe.android.model.Card$Builder r0 = r0.loggingTokens(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.CardInputWidget.getCardBuilder():com.stripe.android.model.Card$Builder");
    }

    public final CardNumberEditText getCardNumberEditText$payments_core_release() {
        return this.cardNumberEditText;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.stripe.android.model.CardParams getCardParams() {
        /*
            r19 = this;
            r0 = r19
            com.stripe.android.view.CardNumberEditText r1 = r0.cardNumberEditText
            com.stripe.android.cards.CardNumber$Validated r1 = r1.getValidatedCardNumber$payments_core_release()
            com.stripe.android.view.ExpiryDateEditText r2 = r0.expiryDateEditText
            com.stripe.android.model.ExpirationDate$Validated r2 = r2.getValidatedDate()
            com.stripe.android.cards.Cvc$Validated r3 = r19.getCvc()
            com.stripe.android.view.CardNumberEditText r4 = r0.cardNumberEditText
            r5 = 1
            r6 = 0
            if (r1 != 0) goto L_0x001a
            r7 = r5
            goto L_0x001b
        L_0x001a:
            r7 = r6
        L_0x001b:
            r4.setShouldShowError(r7)
            com.stripe.android.view.ExpiryDateEditText r4 = r0.expiryDateEditText
            if (r2 != 0) goto L_0x0024
            r7 = r5
            goto L_0x0025
        L_0x0024:
            r7 = r6
        L_0x0025:
            r4.setShouldShowError(r7)
            com.stripe.android.view.CvcEditText r4 = r0.cvcEditText
            if (r3 != 0) goto L_0x002e
            r7 = r5
            goto L_0x002f
        L_0x002e:
            r7 = r6
        L_0x002f:
            r4.setShouldShowError(r7)
            com.stripe.android.view.PostalCodeEditText r4 = r0.postalCodeEditText
            boolean r7 = r0.postalCodeRequired
            if (r7 != 0) goto L_0x003e
            boolean r7 = r19.getUsZipCodeRequired()
            if (r7 == 0) goto L_0x0054
        L_0x003e:
            com.stripe.android.view.PostalCodeEditText r7 = r0.postalCodeEditText
            java.lang.String r7 = r7.getPostalCode$payments_core_release()
            if (r7 == 0) goto L_0x004f
            boolean r7 = kotlin.text.StringsKt__IndentKt.o(r7)
            if (r7 == 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r7 = r6
            goto L_0x0050
        L_0x004f:
            r7 = r5
        L_0x0050:
            if (r7 == 0) goto L_0x0054
            r7 = r5
            goto L_0x0055
        L_0x0054:
            r7 = r6
        L_0x0055:
            r4.setShouldShowError(r7)
            java.util.List r4 = r19.getCurrentFields$payments_core_release()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0065:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x007c
            java.lang.Object r8 = r4.next()
            r9 = r8
            com.stripe.android.view.StripeEditText r9 = (com.stripe.android.view.StripeEditText) r9
            boolean r9 = r9.getShouldShowError()
            if (r9 == 0) goto L_0x0065
            r7.add(r8)
            goto L_0x0065
        L_0x007c:
            java.util.Iterator r4 = r7.iterator()
        L_0x0080:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0096
            java.lang.Object r7 = r4.next()
            com.stripe.android.view.StripeEditText r7 = (com.stripe.android.view.StripeEditText) r7
            java.lang.String r8 = r7.getErrorMessage$payments_core_release()
            if (r8 == 0) goto L_0x0080
            r7.announceForAccessibility(r8)
            goto L_0x0080
        L_0x0096:
            r4 = 0
            if (r1 != 0) goto L_0x009f
            com.stripe.android.view.CardNumberEditText r1 = r0.cardNumberEditText
            r1.requestFocus()
            goto L_0x00bc
        L_0x009f:
            if (r2 != 0) goto L_0x00a7
            com.stripe.android.view.ExpiryDateEditText r1 = r0.expiryDateEditText
            r1.requestFocus()
            goto L_0x00bc
        L_0x00a7:
            if (r3 != 0) goto L_0x00af
            com.stripe.android.view.CvcEditText r1 = r0.cvcEditText
            r1.requestFocus()
            goto L_0x00bc
        L_0x00af:
            com.stripe.android.view.PostalCodeEditText r7 = r0.postalCodeEditText
            boolean r7 = r7.getShouldShowError()
            if (r7 == 0) goto L_0x00c0
            com.stripe.android.view.PostalCodeEditText r1 = r0.postalCodeEditText
            r1.requestFocus()
        L_0x00bc:
            r0.setShouldShowErrorIcon(r5)
            return r4
        L_0x00c0:
            r0.setShouldShowErrorIcon(r6)
            com.stripe.android.model.CardBrand r7 = r19.getBrand()
            java.lang.String r8 = "CardInputView"
            java.util.Set r8 = i0.j.f.p.h.N3(r8)
            java.lang.String r9 = r1.getValue$payments_core_release()
            int r10 = r2.getMonth()
            int r11 = r2.getYear()
            java.lang.String r12 = r3.getValue$payments_core_release()
            r13 = 0
            com.stripe.android.model.Address$Builder r1 = new com.stripe.android.model.Address$Builder
            r1.<init>()
            java.lang.String r2 = r19.getPostalCodeValue()
            if (r2 == 0) goto L_0x00f1
            boolean r3 = kotlin.text.StringsKt__IndentKt.o(r2)
            if (r3 == 0) goto L_0x00f0
            goto L_0x00f1
        L_0x00f0:
            r5 = r6
        L_0x00f1:
            if (r5 != 0) goto L_0x00f4
            r4 = r2
        L_0x00f4:
            com.stripe.android.model.Address$Builder r1 = r1.setPostalCode(r4)
            com.stripe.android.model.Address r14 = r1.build()
            r15 = 0
            r16 = 0
            r17 = 832(0x340, float:1.166E-42)
            r18 = 0
            com.stripe.android.model.CardParams r1 = new com.stripe.android.model.CardParams
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.CardInputWidget.getCardParams():com.stripe.android.model.CardParams");
    }

    public final /* synthetic */ List<StripeEditText> getCurrentFields$payments_core_release() {
        List<StripeEditText> list = this.requiredFields;
        PostalCodeEditText postalCodeEditText2 = this.postalCodeEditText;
        if (!getPostalCodeEnabled()) {
            postalCodeEditText2 = null;
        }
        return g.s(g.a0(list, postalCodeEditText2));
    }

    public final CvcEditText getCvcEditText$payments_core_release() {
        return this.cvcEditText;
    }

    public final ExpiryDateEditText getExpiryDateEditText$payments_core_release() {
        return this.expiryDateEditText;
    }

    public final m0.n.a.a<Integer> getFrameWidthSupplier$payments_core_release() {
        return this.frameWidthSupplier;
    }

    public final LayoutWidthCalculator getLayoutWidthCalculator$payments_core_release() {
        return this.layoutWidthCalculator;
    }

    public PaymentMethodCreateParams.Card getPaymentMethodCard() {
        CardParams cardParams = getCardParams();
        if (cardParams == null) {
            return null;
        }
        return new PaymentMethodCreateParams.Card(cardParams.getNumber$payments_core_release(), Integer.valueOf(cardParams.getExpMonth$payments_core_release()), Integer.valueOf(cardParams.getExpYear$payments_core_release()), cardParams.getCvc$payments_core_release(), (String) null, cardParams.getAttribution$payments_core_release(), 16, (f) null);
    }

    public PaymentMethodCreateParams getPaymentMethodCreateParams() {
        PaymentMethodCreateParams.Card paymentMethodCard = getPaymentMethodCard();
        if (paymentMethodCard != null) {
            return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.Companion, paymentMethodCard, getBillingDetails(), (Map) null, 4, (Object) null);
        }
        return null;
    }

    public final CardInputWidgetPlacement getPlacement$payments_core_release() {
        return this.placement;
    }

    public final PostalCodeEditText getPostalCodeEditText$payments_core_release() {
        return this.postalCodeEditText;
    }

    public final boolean getPostalCodeEnabled() {
        return ((Boolean) this.postalCodeEnabled$delegate.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final boolean getPostalCodeRequired() {
        return this.postalCodeRequired;
    }

    public final TextInputLayout getPostalCodeTextInputLayout$payments_core_release() {
        return this.postalCodeTextInputLayout;
    }

    public final List<StripeEditText> getRequiredFields$payments_core_release() {
        return this.requiredFields;
    }

    public final boolean getShouldShowErrorIcon$payments_core_release() {
        return this.shouldShowErrorIcon;
    }

    public final boolean getUsZipCodeRequired() {
        return ((Boolean) this.usZipCodeRequired$delegate.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public boolean isEnabled() {
        List<StripeEditText> list = this.requiredFields;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (StripeEditText isEnabled : list) {
            if (!isEnabled.isEnabled()) {
                return false;
            }
        }
        return true;
    }

    public final boolean isShowingFullCard$payments_core_release() {
        return this.isShowingFullCard;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.postalCodeEditText.setConfig$payments_core_release(PostalCodeEditText.Config.Global);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        EditText editText;
        i.e(motionEvent, "ev");
        if (motionEvent.getAction() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        Field focusField = getFocusField((int) motionEvent.getX(), getFrameStart());
        if (focusField == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int ordinal = focusField.ordinal();
        if (ordinal == 0) {
            editText = this.cardNumberEditText;
        } else if (ordinal == 1) {
            editText = this.expiryDateEditText;
        } else if (ordinal == 2) {
            editText = this.cvcEditText;
        } else if (ordinal == 3) {
            editText = this.postalCodeEditText;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        editText.requestFocus();
        return true;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (!this.isViewInitialized && getWidth() != 0) {
            this.isViewInitialized = true;
            this.placement.setTotalLengthInPixels$payments_core_release(getFrameWidth());
            updateSpaceSizes$payments_core_release$default(this, this.isShowingFullCard, 0, 0, 6, (Object) null);
            TextInputLayout textInputLayout = this.cardNumberTextInputLayout;
            int cardWidth$payments_core_release = this.placement.getCardWidth$payments_core_release();
            if (this.isShowingFullCard) {
                i5 = 0;
            } else {
                i5 = this.placement.getHiddenCardWidth$payments_core_release() * -1;
            }
            updateFieldLayout(textInputLayout, cardWidth$payments_core_release, i5);
            updateFieldLayout(this.expiryDateTextInputLayout, this.placement.getDateWidth$payments_core_release(), this.placement.getDateStartMargin$payments_core_release(this.isShowingFullCard));
            updateFieldLayout(this.cvcNumberTextInputLayout, this.placement.getCvcWidth$payments_core_release(), this.placement.getCvcStartMargin$payments_core_release(this.isShowingFullCard));
            updateFieldLayout(this.postalCodeTextInputLayout, this.placement.getPostalCodeWidth$payments_core_release(), this.placement.getPostalCodeStartMargin$payments_core_release(this.isShowingFullCard));
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        int i2;
        int i3;
        int i4;
        i.e(parcelable, "state");
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            setPostalCodeEnabled(bundle.getBoolean(STATE_POSTAL_CODE_ENABLED, true));
            boolean z = bundle.getBoolean(STATE_CARD_VIEWED, true);
            this.isShowingFullCard = z;
            updateSpaceSizes$payments_core_release$default(this, z, 0, 0, 6, (Object) null);
            this.placement.setTotalLengthInPixels$payments_core_release(getFrameWidth());
            int i5 = 0;
            if (this.isShowingFullCard) {
                i3 = this.placement.getDateStartMargin$payments_core_release(true);
                i = this.placement.getCvcStartMargin$payments_core_release(true);
                i2 = this.placement.getPostalCodeStartMargin$payments_core_release(true);
            } else {
                int hiddenCardWidth$payments_core_release = this.placement.getHiddenCardWidth$payments_core_release() * -1;
                int dateStartMargin$payments_core_release = this.placement.getDateStartMargin$payments_core_release(false);
                i = this.placement.getCvcStartMargin$payments_core_release(false);
                if (getPostalCodeEnabled()) {
                    i4 = this.placement.getPostalCodeStartMargin$payments_core_release(false);
                } else {
                    i4 = this.placement.getTotalLengthInPixels$payments_core_release();
                }
                int i6 = i4;
                i5 = hiddenCardWidth$payments_core_release;
                i3 = dateStartMargin$payments_core_release;
                i2 = i6;
            }
            updateFieldLayout(this.cardNumberTextInputLayout, this.placement.getCardWidth$payments_core_release(), i5);
            updateFieldLayout(this.expiryDateTextInputLayout, this.placement.getDateWidth$payments_core_release(), i3);
            updateFieldLayout(this.cvcNumberTextInputLayout, this.placement.getCvcWidth$payments_core_release(), i);
            updateFieldLayout(this.postalCodeTextInputLayout, this.placement.getPostalCodeWidth$payments_core_release(), i2);
            super.onRestoreInstanceState(bundle.getParcelable(STATE_SUPER_STATE));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        return g0.a.b.b.a.g(new Pair(STATE_SUPER_STATE, super.onSaveInstanceState()), new Pair(STATE_CARD_VIEWED, Boolean.valueOf(this.isShowingFullCard)), new Pair(STATE_POSTAL_CODE_ENABLED, Boolean.valueOf(getPostalCodeEnabled())));
    }

    public void setCardHint(String str) {
        i.e(str, "cardHint");
        this.cardNumberEditText.setHint(str);
    }

    public void setCardInputListener(CardInputListener cardInputListener2) {
        this.cardInputListener = cardInputListener2;
    }

    public void setCardNumber(String str) {
        this.cardNumberEditText.setText(str);
        this.isShowingFullCard = !this.cardNumberEditText.isCardNumberValid();
    }

    public void setCardNumberTextWatcher(TextWatcher textWatcher) {
        this.cardNumberEditText.addTextChangedListener(textWatcher);
    }

    public void setCardValidCallback(CardValidCallback cardValidCallback2) {
        this.cardValidCallback = cardValidCallback2;
        for (StripeEditText removeTextChangedListener : this.requiredFields) {
            removeTextChangedListener.removeTextChangedListener(this.cardValidTextWatcher);
        }
        if (cardValidCallback2 != null) {
            for (StripeEditText addTextChangedListener : this.requiredFields) {
                addTextChangedListener.addTextChangedListener(this.cardValidTextWatcher);
            }
        }
        CardValidCallback cardValidCallback3 = this.cardValidCallback;
        if (cardValidCallback3 != null) {
            cardValidCallback3.onInputChanged(getInvalidFields().isEmpty(), getInvalidFields());
        }
    }

    public void setCvcCode(String str) {
        this.cvcEditText.setText(str);
    }

    public final void setCvcLabel(String str) {
        this.customCvcLabel = str;
        updateCvc();
    }

    public void setCvcNumberTextWatcher(TextWatcher textWatcher) {
        this.cvcEditText.addTextChangedListener(textWatcher);
    }

    public void setEnabled(boolean z) {
        for (StripeEditText enabled : getCurrentFields$payments_core_release()) {
            enabled.setEnabled(z);
        }
    }

    public void setExpiryDate(int i, int i2) {
        this.expiryDateEditText.setText(new ExpirationDate.Unvalidated(i, i2).getDisplayString());
    }

    public void setExpiryDateTextWatcher(TextWatcher textWatcher) {
        this.expiryDateEditText.addTextChangedListener(textWatcher);
    }

    public final void setFrameWidthSupplier$payments_core_release(m0.n.a.a<Integer> aVar) {
        i.e(aVar, "<set-?>");
        this.frameWidthSupplier = aVar;
    }

    public final void setLayoutWidthCalculator$payments_core_release(LayoutWidthCalculator layoutWidthCalculator2) {
        i.e(layoutWidthCalculator2, "<set-?>");
        this.layoutWidthCalculator = layoutWidthCalculator2;
    }

    public final /* synthetic */ void setPostalCode$payments_core_release(String str) {
        this.postalCodeEditText.setText(str);
    }

    public final void setPostalCodeEnabled(boolean z) {
        this.postalCodeEnabled$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void setPostalCodeRequired(boolean z) {
        this.postalCodeRequired = z;
    }

    public void setPostalCodeTextWatcher(TextWatcher textWatcher) {
        this.postalCodeEditText.addTextChangedListener(textWatcher);
    }

    public final void setShowingFullCard$payments_core_release(boolean z) {
        this.isShowingFullCard = z;
    }

    public final void setUsZipCodeRequired(boolean z) {
        this.usZipCodeRequired$delegate.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public final void updateSpaceSizes$payments_core_release(boolean z, int i, int i2) {
        if (i != 0) {
            this.placement.setCardWidth$payments_core_release(getDesiredWidthInPixels(FULL_SIZING_CARD_TEXT, this.cardNumberEditText));
            this.placement.setDateWidth$payments_core_release(getDesiredWidthInPixels(FULL_SIZING_DATE_TEXT, this.expiryDateEditText));
            this.placement.setHiddenCardWidth$payments_core_release(getDesiredWidthInPixels(this.hiddenCardText, this.cardNumberEditText));
            this.placement.setCvcWidth$payments_core_release(getDesiredWidthInPixels(getCvcPlaceHolder(), this.cvcEditText));
            this.placement.setPostalCodeWidth$payments_core_release(getDesiredWidthInPixels(FULL_SIZING_POSTAL_CODE_TEXT, this.postalCodeEditText));
            this.placement.setPeekCardWidth$payments_core_release(getDesiredWidthInPixels(getPeekCardText(), this.cardNumberEditText));
            this.placement.updateSpacing$payments_core_release(z, getPostalCodeEnabled(), i2, i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardInputWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i.e(context, "context");
        CardInputWidgetBinding inflate = CardInputWidgetBinding.inflate(LayoutInflater.from(context), this);
        i.d(inflate, "CardInputWidgetBinding.i…text),\n        this\n    )");
        this.viewBinding = inflate;
        FrameLayout frameLayout = inflate.container;
        i.d(frameLayout, "viewBinding.container");
        this.containerLayout = frameLayout;
        CardBrandView cardBrandView2 = inflate.cardBrandView;
        i.d(cardBrandView2, "viewBinding.cardBrandView");
        this.cardBrandView = cardBrandView2;
        TextInputLayout textInputLayout = inflate.cardNumberTextInputLayout;
        i.d(textInputLayout, "viewBinding.cardNumberTextInputLayout");
        this.cardNumberTextInputLayout = textInputLayout;
        TextInputLayout textInputLayout2 = inflate.expiryDateTextInputLayout;
        i.d(textInputLayout2, "viewBinding.expiryDateTextInputLayout");
        this.expiryDateTextInputLayout = textInputLayout2;
        TextInputLayout textInputLayout3 = inflate.cvcTextInputLayout;
        i.d(textInputLayout3, "viewBinding.cvcTextInputLayout");
        this.cvcNumberTextInputLayout = textInputLayout3;
        TextInputLayout textInputLayout4 = inflate.postalCodeTextInputLayout;
        i.d(textInputLayout4, "viewBinding.postalCodeTextInputLayout");
        this.postalCodeTextInputLayout = textInputLayout4;
        CardNumberEditText cardNumberEditText2 = inflate.cardNumberEditText;
        i.d(cardNumberEditText2, "viewBinding.cardNumberEditText");
        this.cardNumberEditText = cardNumberEditText2;
        ExpiryDateEditText expiryDateEditText2 = inflate.expiryDateEditText;
        i.d(expiryDateEditText2, "viewBinding.expiryDateEditText");
        this.expiryDateEditText = expiryDateEditText2;
        CvcEditText cvcEditText2 = inflate.cvcEditText;
        i.d(cvcEditText2, "viewBinding.cvcEditText");
        this.cvcEditText = cvcEditText2;
        PostalCodeEditText postalCodeEditText2 = inflate.postalCodeEditText;
        i.d(postalCodeEditText2, "viewBinding.postalCodeEditText");
        this.postalCodeEditText = postalCodeEditText2;
        this.cardValidTextWatcher = new CardInputWidget$cardValidTextWatcher$1(this);
        this.isShowingFullCard = true;
        this.layoutWidthCalculator = new DefaultLayoutWidthCalculator();
        this.placement = new CardInputWidgetPlacement(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 65535, (f) null);
        Boolean bool = Boolean.TRUE;
        this.postalCodeEnabled$delegate = new CardInputWidget$$special$$inlined$observable$1(bool, bool, this);
        Boolean bool2 = Boolean.FALSE;
        this.usZipCodeRequired$delegate = new CardInputWidget$$special$$inlined$observable$2(bool2, bool2, this);
        if (getId() == -1) {
            setId(DEFAULT_READER_ID);
        }
        setOrientation(0);
        setMinimumWidth(getResources().getDimensionPixelSize(R.dimen.stripe_card_widget_min_width));
        this.frameWidthSupplier = new m0.n.a.a<Integer>(this) {
            public final /* synthetic */ CardInputWidget this$0;

            {
                this.this$0 = r1;
            }

            public final int invoke() {
                return this.this$0.containerLayout.getWidth();
            }
        };
        List<StripeEditText> K = g.K(cardNumberEditText2, cvcEditText2, expiryDateEditText2);
        this.requiredFields = K;
        this.allFields = g.a0(K, postalCodeEditText2);
        initView(attributeSet);
        this.hiddenCardText = createHiddenCardText$payments_core_release(cardNumberEditText2.getPanLength$payments_core_release());
    }
}
