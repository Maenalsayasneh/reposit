package com.stripe.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1;
import com.stripe.android.exception.APIConnectionException;
import com.stripe.android.exception.APIException;
import com.stripe.android.exception.AuthenticationException;
import com.stripe.android.exception.CardException;
import com.stripe.android.exception.InvalidRequestException;
import com.stripe.android.model.AccountParams;
import com.stripe.android.model.BankAccountTokenParams;
import com.stripe.android.model.Card;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.CvcTokenParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PersonTokenParams;
import com.stripe.android.model.PiiTokenParams;
import com.stripe.android.model.RadarSession;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.Source;
import com.stripe.android.model.SourceParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.StripeFile;
import com.stripe.android.model.StripeFileParams;
import com.stripe.android.model.StripeModel;
import com.stripe.android.model.Token;
import com.stripe.android.model.TokenParams;
import com.stripe.android.model.WeChatPayNextAction;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import h0.q.p;
import h0.q.q;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;
import m0.l.c;
import m0.l.e;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.d0;
import n0.a.f0;
import n0.a.h2.o;
import n0.a.m0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000´\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ¼\u00012\u00020\u0001:\u0002¼\u0001B@\b\u0000\u0012\b\u0010 \u0001\u001a\u00030\u0001\u0012\b\u0010©\u0001\u001a\u00030¨\u0001\u0012\u0007\u0010¤\u0001\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010¯\u0001\u001a\u00030®\u0001¢\u0006\u0006\b±\u0001\u0010²\u0001BH\b\u0017\u0012\b\u0010´\u0001\u001a\u00030³\u0001\u0012\u0007\u0010¤\u0001\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\t\b\u0002\u0010µ\u0001\u001a\u000206\u0012\u0011\b\u0002\u0010¸\u0001\u001a\n\u0012\u0005\u0012\u00030·\u00010¶\u0001¢\u0006\u0006\b±\u0001\u0010¹\u0001B;\b\u0012\u0012\b\u0010´\u0001\u001a\u00030³\u0001\u0012\b\u0010 \u0001\u001a\u00030\u0001\u0012\u0007\u0010¤\u0001\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0007\u0010µ\u0001\u001a\u000206¢\u0006\u0006\b±\u0001\u0010º\u0001B2\b\u0010\u0012\b\u0010 \u0001\u001a\u00030\u0001\u0012\b\u0010©\u0001\u001a\u00030¨\u0001\u0012\u0007\u0010¤\u0001\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0006\b±\u0001\u0010»\u0001J;\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJJ\u0010\u0012\u001a\u00020\n\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u001e\u0010\u0011\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001eJ9\u0010\"\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020!0\u0007H\u0007¢\u0006\u0004\b\"\u0010#J1\u0010%\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020$0\u0007H\u0007¢\u0006\u0004\b%\u0010&J+\u0010\u001c\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001c\u0010)J\u001f\u0010+\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u0004H\u0007¢\u0006\u0004\b+\u0010,J+\u0010-\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b-\u0010.J+\u0010-\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b-\u0010/J\u001f\u0010+\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020\u0004H\u0007¢\u0006\u0004\b+\u00100J+\u0010-\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b-\u00101J\u001f\u00107\u001a\u0002062\u0006\u00103\u001a\u0002022\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b7\u00108J/\u00109\u001a\u0002062\u0006\u00103\u001a\u0002022\b\u00105\u001a\u0004\u0018\u0001042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020!0\u0007H\u0007¢\u0006\u0004\b9\u0010:J1\u0010<\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020;0\u0007H\u0007¢\u0006\u0004\b<\u0010=J%\u0010>\u001a\u0004\u0018\u00010;2\u0006\u0010*\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b>\u0010?J%\u0010@\u001a\u0004\u0018\u00010;2\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b@\u0010AJ+\u0010D\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00192\u0006\u0010C\u001a\u00020B2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bD\u0010EJ+\u0010D\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010C\u001a\u00020B2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bD\u0010FJ+\u0010D\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010C\u001a\u00020B2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bD\u0010GJ\u001f\u0010H\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u0004H\u0007¢\u0006\u0004\bH\u0010,J+\u0010I\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bI\u0010.J+\u0010I\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bI\u0010/J\u001f\u0010H\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020\u0004H\u0007¢\u0006\u0004\bH\u00100J+\u0010I\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bI\u00101J\u001f\u0010J\u001a\u0002062\u0006\u00103\u001a\u0002022\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\bJ\u00108J/\u0010L\u001a\u0002062\u0006\u00103\u001a\u0002022\b\u00105\u001a\u0004\u0018\u0001042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020K0\u0007H\u0007¢\u0006\u0004\bL\u0010:J1\u0010N\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020M0\u0007H\u0007¢\u0006\u0004\bN\u0010=J%\u0010O\u001a\u0004\u0018\u00010M2\u0006\u0010*\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bO\u0010PJ%\u0010Q\u001a\u0004\u0018\u00010M2\u0006\u0010C\u001a\u00020B2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bQ\u0010RJ=\u0010V\u001a\u00020\n2\u0006\u0010T\u001a\u00020S2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020U0\u0007H\u0007¢\u0006\u0004\bV\u0010WJ1\u0010X\u001a\u0004\u0018\u00010U2\u0006\u0010T\u001a\u00020S2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bX\u0010YJ+\u0010\\\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00192\u0006\u0010[\u001a\u00020Z2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\\\u0010]J+\u0010\\\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010[\u001a\u00020Z2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\\\u0010^J+\u0010\\\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010[\u001a\u00020Z2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\\\u0010_J\u001f\u0010`\u001a\u0002062\u0006\u00103\u001a\u0002022\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b`\u00108J#\u0010a\u001a\u00020\n2\u0006\u00105\u001a\u0002042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020Z0\u0007¢\u0006\u0004\ba\u0010bJ=\u0010e\u001a\u00020\n2\u0006\u0010d\u001a\u00020c2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020Z0\u0007H\u0007¢\u0006\u0004\be\u0010fJ1\u0010h\u001a\u0004\u0018\u00010Z2\u0006\u0010g\u001a\u00020c2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bh\u0010iJ=\u0010k\u001a\u00020\n2\b\b\u0001\u0010j\u001a\u00020\u00042\b\b\u0001\u0010*\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020Z0\u0007H\u0007¢\u0006\u0004\bk\u0010lJ1\u0010m\u001a\u0004\u0018\u00010Z2\b\b\u0001\u0010j\u001a\u00020\u00042\b\b\u0001\u0010*\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bm\u0010nJ=\u0010q\u001a\u00020\n2\u0006\u0010p\u001a\u00020o2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\bq\u0010rJ1\u0010s\u001a\u0004\u0018\u00010\b2\u0006\u0010p\u001a\u00020o2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bs\u0010tJ=\u0010w\u001a\u00020\n2\u0006\u0010v\u001a\u00020u2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\bw\u0010xJ1\u0010y\u001a\u0004\u0018\u00010\b2\u0006\u0010v\u001a\u00020u2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\by\u0010zJ=\u0010|\u001a\u00020\n2\u0006\u0010{\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b|\u0010lJ1\u0010}\u001a\u0004\u0018\u00010\b2\u0006\u0010{\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b}\u0010~JA\u0010\u0001\u001a\u00020\n2\u0007\u0010\u0001\u001a\u000202\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0006\b\u0001\u0010\u0001JB\u0010\u0001\u001a\u00020\n2\b\u0010\u0001\u001a\u00030\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0006\b\u0001\u0010\u0001J5\u0010\u0001\u001a\u0004\u0018\u00010\b2\u0007\u0010\u0001\u001a\u000202\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0006\b\u0001\u0010\u0001J6\u0010\u0001\u001a\u0004\u0018\u00010\b2\b\u0010\u0001\u001a\u00030\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0006\b\u0001\u0010\u0001JB\u0010\u0001\u001a\u00020\n2\t\b\u0001\u0010\u0001\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0005\b\u0001\u0010lJ4\u0010\u0001\u001a\u0004\u0018\u00010\b2\u0007\u0010\u0001\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0005\b\u0001\u0010~JA\u0010\u0001\u001a\u00020\n2\u0007\u0010g\u001a\u00030\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0006\b\u0001\u0010\u0001J5\u0010\u0001\u001a\u0004\u0018\u00010\b2\u0007\u0010g\u001a\u00030\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0006\b\u0001\u0010\u0001JC\u0010\u0001\u001a\u00020\n2\b\u0010\u0001\u001a\u00030\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\r\u0010\t\u001a\t\u0012\u0005\u0012\u00030\u00010\u0007H\u0007¢\u0006\u0006\b\u0001\u0010\u0001J5\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0006\b\u0001\u0010\u0001J-\u0010\u0001\u001a\u00020\n2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\r\u0010\t\u001a\t\u0012\u0005\u0012\u00030\u00010\u0007H\u0007¢\u0006\u0006\b\u0001\u0010\u0001JA\u0010\u0001\u001a\u00020\n\"\b\b\u0000\u0010\u000e*\u00020\r2\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001R\"\u0010 \u0001\u001a\u00030\u00018\u0000@\u0000X\u0004¢\u0006\u0010\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R!\u0010¤\u0001\u001a\u00020\u00048\u0000@\u0000X\u0004¢\u0006\u0010\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R\"\u0010©\u0001\u001a\u00030¨\u00018\u0000@\u0000X\u0004¢\u0006\u0010\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R!\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0004¢\u0006\u000f\n\u0005\b\u0005\u0010¥\u0001\u001a\u0006\b­\u0001\u0010§\u0001R\u001a\u0010¯\u0001\u001a\u00030®\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001\u0002\u0004\n\u0002\b\u0019¨\u0006½\u0001"}, d2 = {"Lcom/stripe/android/Stripe;", "", "Lcom/stripe/android/model/TokenParams;", "tokenParams", "", "stripeAccountId", "idempotencyKey", "Lcom/stripe/android/ApiResultCallback;", "Lcom/stripe/android/model/Token;", "callback", "Lm0/i;", "createToken", "(Lcom/stripe/android/model/TokenParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V", "Lcom/stripe/android/model/StripeModel;", "T", "Lkotlin/Function1;", "Lm0/l/c;", "apiMethod", "executeAsync", "(Lcom/stripe/android/ApiResultCallback;Lm0/n/a/l;)V", "Landroid/app/Activity;", "activity", "Ln0/a/f0;", "getLifecycleScope", "(Landroid/app/Activity;)Ln0/a/f0;", "Landroidx/activity/ComponentActivity;", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "confirmPaymentIntentParams", "confirmPayment", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;)V", "(Landroid/app/Activity;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;)V", "Lcom/stripe/android/AlipayAuthenticator;", "authenticator", "Lcom/stripe/android/PaymentIntentResult;", "confirmAlipayPayment", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/AlipayAuthenticator;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V", "Lcom/stripe/android/model/WeChatPayNextAction;", "confirmWeChatPayPayment", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;)V", "clientSecret", "authenticatePayment", "(Landroid/app/Activity;Ljava/lang/String;)V", "handleNextActionForPayment", "(Landroidx/activity/ComponentActivity;Ljava/lang/String;Ljava/lang/String;)V", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/String;)V", "", "requestCode", "Landroid/content/Intent;", "data", "", "isPaymentResult", "(ILandroid/content/Intent;)Z", "onPaymentResult", "(ILandroid/content/Intent;Lcom/stripe/android/ApiResultCallback;)Z", "Lcom/stripe/android/model/PaymentIntent;", "retrievePaymentIntent", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V", "retrievePaymentIntentSynchronous", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/PaymentIntent;", "confirmPaymentIntentSynchronous", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;)Lcom/stripe/android/model/PaymentIntent;", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "confirmSetupIntentParams", "confirmSetupIntent", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/model/ConfirmSetupIntentParams;Ljava/lang/String;)V", "(Landroid/app/Activity;Lcom/stripe/android/model/ConfirmSetupIntentParams;Ljava/lang/String;)V", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/model/ConfirmSetupIntentParams;Ljava/lang/String;)V", "authenticateSetup", "handleNextActionForSetupIntent", "isSetupResult", "Lcom/stripe/android/SetupIntentResult;", "onSetupResult", "Lcom/stripe/android/model/SetupIntent;", "retrieveSetupIntent", "retrieveSetupIntentSynchronous", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/SetupIntent;", "confirmSetupIntentSynchronous", "(Lcom/stripe/android/model/ConfirmSetupIntentParams;Ljava/lang/String;)Lcom/stripe/android/model/SetupIntent;", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethod;", "createPaymentMethod", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V", "createPaymentMethodSynchronous", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod;", "Lcom/stripe/android/model/Source;", "source", "authenticateSource", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/model/Source;Ljava/lang/String;)V", "(Landroid/app/Activity;Lcom/stripe/android/model/Source;Ljava/lang/String;)V", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/model/Source;Ljava/lang/String;)V", "isAuthenticateSourceResult", "onAuthenticateSourceResult", "(Landroid/content/Intent;Lcom/stripe/android/ApiResultCallback;)V", "Lcom/stripe/android/model/SourceParams;", "sourceParams", "createSource", "(Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V", "params", "createSourceSynchronous", "(Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Source;", "sourceId", "retrieveSource", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V", "retrieveSourceSynchronous", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Source;", "Lcom/stripe/android/model/AccountParams;", "accountParams", "createAccountToken", "(Lcom/stripe/android/model/AccountParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V", "createAccountTokenSynchronous", "(Lcom/stripe/android/model/AccountParams;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Token;", "Lcom/stripe/android/model/BankAccountTokenParams;", "bankAccountTokenParams", "createBankAccountToken", "(Lcom/stripe/android/model/BankAccountTokenParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V", "createBankAccountTokenSynchronous", "(Lcom/stripe/android/model/BankAccountTokenParams;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Token;", "personalId", "createPiiToken", "createPiiTokenSynchronous", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Token;", "Lcom/stripe/android/model/Card;", "card", "createCardToken", "(Lcom/stripe/android/model/Card;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V", "Lcom/stripe/android/model/CardParams;", "cardParams", "(Lcom/stripe/android/model/CardParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V", "createCardTokenSynchronous", "(Lcom/stripe/android/model/Card;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Token;", "(Lcom/stripe/android/model/CardParams;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Token;", "cvc", "createCvcUpdateToken", "createCvcUpdateTokenSynchronous", "Lcom/stripe/android/model/PersonTokenParams;", "createPersonToken", "(Lcom/stripe/android/model/PersonTokenParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V", "createPersonTokenSynchronous", "(Lcom/stripe/android/model/PersonTokenParams;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Token;", "Lcom/stripe/android/model/StripeFileParams;", "fileParams", "Lcom/stripe/android/model/StripeFile;", "createFile", "(Lcom/stripe/android/model/StripeFileParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V", "createFileSynchronous", "(Lcom/stripe/android/model/StripeFileParams;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/StripeFile;", "Lcom/stripe/android/model/RadarSession;", "createRadarSession", "(Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V", "Lkotlin/Result;", "result", "dispatchResult", "(Ljava/lang/Object;Lcom/stripe/android/ApiResultCallback;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "getStripeRepository$payments_core_release", "()Lcom/stripe/android/networking/StripeRepository;", "publishableKey", "Ljava/lang/String;", "getPublishableKey$payments_core_release", "()Ljava/lang/String;", "Lcom/stripe/android/PaymentController;", "paymentController", "Lcom/stripe/android/PaymentController;", "getPaymentController$payments_core_release", "()Lcom/stripe/android/PaymentController;", "getStripeAccountId$payments_core_release", "Lm0/l/e;", "workContext", "Lm0/l/e;", "<init>", "(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Ljava/lang/String;Ljava/lang/String;Lm0/l/e;)V", "Landroid/content/Context;", "context", "enableLogging", "", "Lcom/stripe/android/StripeApiBeta;", "betas", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;)V", "(Landroid/content/Context;Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Ljava/lang/String;Z)V", "(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: Stripe.kt */
public final class Stripe {
    public static final String API_VERSION = ApiVersion.Companion.get$payments_core_release().getCode();
    public static final Companion Companion = new Companion((f) null);
    public static final String VERSION = "AndroidBindings/16.10.0";
    public static final String VERSION_NAME = "16.10.0";
    /* access modifiers changed from: private */
    public static boolean advancedFraudSignalsEnabled = true;
    /* access modifiers changed from: private */
    public static AppInfo appInfo;
    private final PaymentController paymentController;
    private final String publishableKey;
    private final String stripeAccountId;
    private final StripeRepository stripeRepository;
    private final e workContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\nR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\f\u0010\r\u0012\u0004\b\u0012\u0010\n\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00138\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00138\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00138\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/Stripe$Companion;", "", "Lcom/stripe/android/AppInfo;", "appInfo", "Lcom/stripe/android/AppInfo;", "getAppInfo", "()Lcom/stripe/android/AppInfo;", "setAppInfo", "(Lcom/stripe/android/AppInfo;)V", "getAppInfo$annotations", "()V", "", "advancedFraudSignalsEnabled", "Z", "getAdvancedFraudSignalsEnabled", "()Z", "setAdvancedFraudSignalsEnabled", "(Z)V", "getAdvancedFraudSignalsEnabled$annotations", "", "API_VERSION", "Ljava/lang/String;", "VERSION", "VERSION_NAME", "<init>", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Stripe.kt */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void getAdvancedFraudSignalsEnabled$annotations() {
        }

        public static /* synthetic */ void getAppInfo$annotations() {
        }

        public final boolean getAdvancedFraudSignalsEnabled() {
            return Stripe.advancedFraudSignalsEnabled;
        }

        public final AppInfo getAppInfo() {
            return Stripe.appInfo;
        }

        public final void setAdvancedFraudSignalsEnabled(boolean z) {
            Stripe.advancedFraudSignalsEnabled = z;
        }

        public final void setAppInfo(AppInfo appInfo) {
            Stripe.appInfo = appInfo;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public Stripe(Context context, String str) {
        this(context, str, (String) null, false, (Set) null, 28, (f) null);
    }

    public Stripe(Context context, String str, String str2) {
        this(context, str, str2, false, (Set) null, 24, (f) null);
    }

    public Stripe(Context context, String str, String str2, boolean z) {
        this(context, str, str2, z, (Set) null, 16, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Stripe(Context context, String str, String str2, boolean z, Set set, int i, f fVar) {
        this(context, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z, (Set<? extends StripeApiBeta>) (i & 16) != 0 ? EmptySet.c : set);
    }

    public static /* synthetic */ void authenticateSource$default(Stripe stripe, ComponentActivity componentActivity, Source source, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.authenticateSource(componentActivity, source, str);
    }

    public static /* synthetic */ void confirmAlipayPayment$default(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, AlipayAuthenticator alipayAuthenticator, String str, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.confirmAlipayPayment(confirmPaymentIntentParams, alipayAuthenticator, str, apiResultCallback);
    }

    public static /* synthetic */ void confirmPayment$default(Stripe stripe, ComponentActivity componentActivity, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.confirmPayment(componentActivity, confirmPaymentIntentParams, str);
    }

    public static /* synthetic */ PaymentIntent confirmPaymentIntentSynchronous$default(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        return stripe.confirmPaymentIntentSynchronous(confirmPaymentIntentParams, str);
    }

    public static /* synthetic */ void confirmSetupIntent$default(Stripe stripe, ComponentActivity componentActivity, ConfirmSetupIntentParams confirmSetupIntentParams, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.confirmSetupIntent(componentActivity, confirmSetupIntentParams, str);
    }

    public static /* synthetic */ SetupIntent confirmSetupIntentSynchronous$default(Stripe stripe, ConfirmSetupIntentParams confirmSetupIntentParams, String str, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        return stripe.confirmSetupIntentSynchronous(confirmSetupIntentParams, str);
    }

    public static /* synthetic */ void confirmWeChatPayPayment$default(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.confirmWeChatPayPayment(confirmPaymentIntentParams, str, apiResultCallback);
    }

    public static /* synthetic */ void createAccountToken$default(Stripe stripe, AccountParams accountParams, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createAccountToken(accountParams, str, str2, apiResultCallback);
    }

    public static /* synthetic */ Token createAccountTokenSynchronous$default(Stripe stripe, AccountParams accountParams, String str, String str2, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createAccountTokenSynchronous(accountParams, str, str2);
    }

    public static /* synthetic */ void createBankAccountToken$default(Stripe stripe, BankAccountTokenParams bankAccountTokenParams, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createBankAccountToken(bankAccountTokenParams, str, str2, apiResultCallback);
    }

    public static /* synthetic */ Token createBankAccountTokenSynchronous$default(Stripe stripe, BankAccountTokenParams bankAccountTokenParams, String str, String str2, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createBankAccountTokenSynchronous(bankAccountTokenParams, str, str2);
    }

    public static /* synthetic */ void createCardToken$default(Stripe stripe, Card card, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createCardToken(card, str, str2, (ApiResultCallback<? super Token>) apiResultCallback);
    }

    public static /* synthetic */ Token createCardTokenSynchronous$default(Stripe stripe, Card card, String str, String str2, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createCardTokenSynchronous(card, str, str2);
    }

    public static /* synthetic */ void createCvcUpdateToken$default(Stripe stripe, String str, String str2, String str3, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = stripe.stripeAccountId;
        }
        stripe.createCvcUpdateToken(str, str2, str3, apiResultCallback);
    }

    public static /* synthetic */ Token createCvcUpdateTokenSynchronous$default(Stripe stripe, String str, String str2, String str3, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = stripe.stripeAccountId;
        }
        return stripe.createCvcUpdateTokenSynchronous(str, str2, str3);
    }

    public static /* synthetic */ void createFile$default(Stripe stripe, StripeFileParams stripeFileParams, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createFile(stripeFileParams, str, str2, apiResultCallback);
    }

    public static /* synthetic */ StripeFile createFileSynchronous$default(Stripe stripe, StripeFileParams stripeFileParams, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createFileSynchronous(stripeFileParams, str, str2);
    }

    public static /* synthetic */ void createPaymentMethod$default(Stripe stripe, PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createPaymentMethod(paymentMethodCreateParams, str, str2, apiResultCallback);
    }

    public static /* synthetic */ PaymentMethod createPaymentMethodSynchronous$default(Stripe stripe, PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, int i, Object obj) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createPaymentMethodSynchronous(paymentMethodCreateParams, str, str2);
    }

    public static /* synthetic */ void createPersonToken$default(Stripe stripe, PersonTokenParams personTokenParams, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createPersonToken(personTokenParams, str, str2, apiResultCallback);
    }

    public static /* synthetic */ Token createPersonTokenSynchronous$default(Stripe stripe, PersonTokenParams personTokenParams, String str, String str2, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createPersonTokenSynchronous(personTokenParams, str, str2);
    }

    public static /* synthetic */ void createPiiToken$default(Stripe stripe, String str, String str2, String str3, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = stripe.stripeAccountId;
        }
        stripe.createPiiToken(str, str2, str3, apiResultCallback);
    }

    public static /* synthetic */ Token createPiiTokenSynchronous$default(Stripe stripe, String str, String str2, String str3, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = stripe.stripeAccountId;
        }
        return stripe.createPiiTokenSynchronous(str, str2, str3);
    }

    public static /* synthetic */ void createRadarSession$default(Stripe stripe, String str, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.createRadarSession(str, apiResultCallback);
    }

    public static /* synthetic */ void createSource$default(Stripe stripe, SourceParams sourceParams, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createSource(sourceParams, str, str2, apiResultCallback);
    }

    public static /* synthetic */ Source createSourceSynchronous$default(Stripe stripe, SourceParams sourceParams, String str, String str2, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createSourceSynchronous(sourceParams, str, str2);
    }

    private final void createToken(TokenParams tokenParams, String str, String str2, ApiResultCallback<? super Token> apiResultCallback) {
        executeAsync(apiResultCallback, new Stripe$createToken$1(this, tokenParams, str, str2, (c) null));
    }

    public static /* synthetic */ void createToken$default(Stripe stripe, TokenParams tokenParams, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        stripe.createToken(tokenParams, str, str2, apiResultCallback);
    }

    private final <T extends StripeModel> void executeAsync(ApiResultCallback<? super T> apiResultCallback, l<? super c<? super T>, ? extends Object> lVar) {
        a.E2(a.h(this.workContext), (e) null, (CoroutineStart) null, new Stripe$executeAsync$1(this, lVar, apiResultCallback, (c) null), 3, (Object) null);
    }

    public static final boolean getAdvancedFraudSignalsEnabled() {
        return advancedFraudSignalsEnabled;
    }

    public static final AppInfo getAppInfo() {
        return appInfo;
    }

    private final f0 getLifecycleScope(Activity activity) {
        if (activity instanceof ComponentActivity) {
            return q.a((p) activity);
        }
        return a.h(this.workContext);
    }

    public static /* synthetic */ void handleNextActionForPayment$default(Stripe stripe, ComponentActivity componentActivity, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.handleNextActionForPayment(componentActivity, str, str2);
    }

    public static /* synthetic */ void handleNextActionForSetupIntent$default(Stripe stripe, ComponentActivity componentActivity, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.handleNextActionForSetupIntent(componentActivity, str, str2);
    }

    public static /* synthetic */ void retrievePaymentIntent$default(Stripe stripe, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.retrievePaymentIntent(str, str2, apiResultCallback);
    }

    public static /* synthetic */ PaymentIntent retrievePaymentIntentSynchronous$default(Stripe stripe, String str, String str2, int i, Object obj) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        if ((i & 2) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.retrievePaymentIntentSynchronous(str, str2);
    }

    public static /* synthetic */ void retrieveSetupIntent$default(Stripe stripe, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        if ((i & 2) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.retrieveSetupIntent(str, str2, apiResultCallback);
    }

    public static /* synthetic */ SetupIntent retrieveSetupIntentSynchronous$default(Stripe stripe, String str, String str2, int i, Object obj) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        if ((i & 2) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.retrieveSetupIntentSynchronous(str, str2);
    }

    public static /* synthetic */ void retrieveSource$default(Stripe stripe, String str, String str2, String str3, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = stripe.stripeAccountId;
        }
        stripe.retrieveSource(str, str2, str3, apiResultCallback);
    }

    public static /* synthetic */ Source retrieveSourceSynchronous$default(Stripe stripe, String str, String str2, String str3, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 4) != 0) {
            str3 = stripe.stripeAccountId;
        }
        return stripe.retrieveSourceSynchronous(str, str2, str3);
    }

    public static final void setAdvancedFraudSignalsEnabled(boolean z) {
        advancedFraudSignalsEnabled = z;
    }

    public static final void setAppInfo(AppInfo appInfo2) {
        appInfo = appInfo2;
    }

    public final void authenticatePayment(Activity activity, String str) {
        i.e(activity, "activity");
        i.e(str, "clientSecret");
        a.E2(getLifecycleScope(activity), (e) null, (CoroutineStart) null, new Stripe$authenticatePayment$1(this, activity, str, (c) null), 3, (Object) null);
    }

    public final void authenticateSetup(Activity activity, String str) {
        i.e(activity, "activity");
        i.e(str, "clientSecret");
        a.E2(getLifecycleScope(activity), (e) null, (CoroutineStart) null, new Stripe$authenticateSetup$1(this, activity, str, (c) null), 3, (Object) null);
    }

    public final void authenticateSource(Activity activity, Source source) {
        authenticateSource$default(this, activity, source, (String) null, 4, (Object) null);
    }

    public final void authenticateSource(ComponentActivity componentActivity, Source source) {
        authenticateSource$default(this, componentActivity, source, (String) null, 4, (Object) null);
    }

    public final void authenticateSource(ComponentActivity componentActivity, Source source, String str) {
        i.e(componentActivity, "activity");
        i.e(source, Stripe3ds2AuthParams.FIELD_SOURCE);
        a.E2(q.a(componentActivity), (e) null, (CoroutineStart) null, new Stripe$authenticateSource$1(this, componentActivity, source, str, (c) null), 3, (Object) null);
    }

    public final void authenticateSource(Fragment fragment, Source source) {
        authenticateSource$default(this, fragment, source, (String) null, 4, (Object) null);
    }

    public final void confirmAlipayPayment(ConfirmPaymentIntentParams confirmPaymentIntentParams, AlipayAuthenticator alipayAuthenticator, ApiResultCallback<? super PaymentIntentResult> apiResultCallback) {
        confirmAlipayPayment$default(this, confirmPaymentIntentParams, alipayAuthenticator, (String) null, apiResultCallback, 4, (Object) null);
    }

    public final void confirmAlipayPayment(ConfirmPaymentIntentParams confirmPaymentIntentParams, AlipayAuthenticator alipayAuthenticator, String str, ApiResultCallback<? super PaymentIntentResult> apiResultCallback) {
        i.e(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        i.e(alipayAuthenticator, "authenticator");
        i.e(apiResultCallback, "callback");
        executeAsync(apiResultCallback, new Stripe$confirmAlipayPayment$1(this, confirmPaymentIntentParams, alipayAuthenticator, str, (c) null));
    }

    public final void confirmPayment(Activity activity, ConfirmPaymentIntentParams confirmPaymentIntentParams) {
        confirmPayment$default(this, activity, confirmPaymentIntentParams, (String) null, 4, (Object) null);
    }

    public final void confirmPayment(ComponentActivity componentActivity, ConfirmPaymentIntentParams confirmPaymentIntentParams) {
        confirmPayment$default(this, componentActivity, confirmPaymentIntentParams, (String) null, 4, (Object) null);
    }

    public final void confirmPayment(ComponentActivity componentActivity, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str) {
        i.e(componentActivity, "activity");
        i.e(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        a.E2(q.a(componentActivity), (e) null, (CoroutineStart) null, new Stripe$confirmPayment$1(this, componentActivity, confirmPaymentIntentParams, str, (c) null), 3, (Object) null);
    }

    public final void confirmPayment(Fragment fragment, ConfirmPaymentIntentParams confirmPaymentIntentParams) {
        confirmPayment$default(this, fragment, confirmPaymentIntentParams, (String) null, 4, (Object) null);
    }

    public final PaymentIntent confirmPaymentIntentSynchronous(ConfirmPaymentIntentParams confirmPaymentIntentParams) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        return confirmPaymentIntentSynchronous$default(this, confirmPaymentIntentParams, (String) null, 2, (Object) null);
    }

    public final PaymentIntent confirmPaymentIntentSynchronous(ConfirmPaymentIntentParams confirmPaymentIntentParams, String str) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        i.e(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        return (PaymentIntent) a.l3((e) null, new Stripe$confirmPaymentIntentSynchronous$1(this, confirmPaymentIntentParams, str, (c) null), 1, (Object) null);
    }

    public final void confirmSetupIntent(Activity activity, ConfirmSetupIntentParams confirmSetupIntentParams) {
        confirmSetupIntent$default(this, activity, confirmSetupIntentParams, (String) null, 4, (Object) null);
    }

    public final void confirmSetupIntent(ComponentActivity componentActivity, ConfirmSetupIntentParams confirmSetupIntentParams) {
        confirmSetupIntent$default(this, componentActivity, confirmSetupIntentParams, (String) null, 4, (Object) null);
    }

    public final void confirmSetupIntent(ComponentActivity componentActivity, ConfirmSetupIntentParams confirmSetupIntentParams, String str) {
        i.e(componentActivity, "activity");
        i.e(confirmSetupIntentParams, "confirmSetupIntentParams");
        a.E2(q.a(componentActivity), (e) null, (CoroutineStart) null, new Stripe$confirmSetupIntent$1(this, componentActivity, confirmSetupIntentParams, str, (c) null), 3, (Object) null);
    }

    public final void confirmSetupIntent(Fragment fragment, ConfirmSetupIntentParams confirmSetupIntentParams) {
        confirmSetupIntent$default(this, fragment, confirmSetupIntentParams, (String) null, 4, (Object) null);
    }

    public final SetupIntent confirmSetupIntentSynchronous(ConfirmSetupIntentParams confirmSetupIntentParams) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        return confirmSetupIntentSynchronous$default(this, confirmSetupIntentParams, (String) null, 2, (Object) null);
    }

    public final SetupIntent confirmSetupIntentSynchronous(ConfirmSetupIntentParams confirmSetupIntentParams, String str) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        i.e(confirmSetupIntentParams, "confirmSetupIntentParams");
        return (SetupIntent) a.l3((e) null, new Stripe$confirmSetupIntentSynchronous$1(this, confirmSetupIntentParams, str, (c) null), 1, (Object) null);
    }

    public final void confirmWeChatPayPayment(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiResultCallback<? super WeChatPayNextAction> apiResultCallback) {
        confirmWeChatPayPayment$default(this, confirmPaymentIntentParams, (String) null, apiResultCallback, 2, (Object) null);
    }

    public final void confirmWeChatPayPayment(ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, ApiResultCallback<? super WeChatPayNextAction> apiResultCallback) {
        i.e(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        i.e(apiResultCallback, "callback");
        executeAsync(apiResultCallback, new Stripe$confirmWeChatPayPayment$1(this, confirmPaymentIntentParams, str, (c) null));
    }

    public final void createAccountToken(AccountParams accountParams, ApiResultCallback<? super Token> apiResultCallback) {
        createAccountToken$default(this, accountParams, (String) null, (String) null, apiResultCallback, 6, (Object) null);
    }

    public final void createAccountToken(AccountParams accountParams, String str, ApiResultCallback<? super Token> apiResultCallback) {
        createAccountToken$default(this, accountParams, str, (String) null, apiResultCallback, 4, (Object) null);
    }

    public final void createAccountToken(AccountParams accountParams, String str, String str2, ApiResultCallback<? super Token> apiResultCallback) {
        i.e(accountParams, "accountParams");
        i.e(apiResultCallback, "callback");
        createToken(accountParams, str2, str, apiResultCallback);
    }

    public final Token createAccountTokenSynchronous(AccountParams accountParams) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        return createAccountTokenSynchronous$default(this, accountParams, (String) null, (String) null, 6, (Object) null);
    }

    public final Token createAccountTokenSynchronous(AccountParams accountParams, String str) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        return createAccountTokenSynchronous$default(this, accountParams, str, (String) null, 4, (Object) null);
    }

    public final Token createAccountTokenSynchronous(AccountParams accountParams, String str, String str2) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        i.e(accountParams, "accountParams");
        try {
            return (Token) a.l3((e) null, new Stripe$createAccountTokenSynchronous$1(this, accountParams, str2, str, (c) null), 1, (Object) null);
        } catch (CardException unused) {
            return null;
        }
    }

    public final void createBankAccountToken(BankAccountTokenParams bankAccountTokenParams, ApiResultCallback<? super Token> apiResultCallback) {
        createBankAccountToken$default(this, bankAccountTokenParams, (String) null, (String) null, apiResultCallback, 6, (Object) null);
    }

    public final void createBankAccountToken(BankAccountTokenParams bankAccountTokenParams, String str, ApiResultCallback<? super Token> apiResultCallback) {
        createBankAccountToken$default(this, bankAccountTokenParams, str, (String) null, apiResultCallback, 4, (Object) null);
    }

    public final void createBankAccountToken(BankAccountTokenParams bankAccountTokenParams, String str, String str2, ApiResultCallback<? super Token> apiResultCallback) {
        i.e(bankAccountTokenParams, "bankAccountTokenParams");
        i.e(apiResultCallback, "callback");
        createToken(bankAccountTokenParams, str2, str, apiResultCallback);
    }

    public final Token createBankAccountTokenSynchronous(BankAccountTokenParams bankAccountTokenParams) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        return createBankAccountTokenSynchronous$default(this, bankAccountTokenParams, (String) null, (String) null, 6, (Object) null);
    }

    public final Token createBankAccountTokenSynchronous(BankAccountTokenParams bankAccountTokenParams, String str) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        return createBankAccountTokenSynchronous$default(this, bankAccountTokenParams, str, (String) null, 4, (Object) null);
    }

    public final Token createBankAccountTokenSynchronous(BankAccountTokenParams bankAccountTokenParams, String str, String str2) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        i.e(bankAccountTokenParams, "bankAccountTokenParams");
        return (Token) a.l3((e) null, new Stripe$createBankAccountTokenSynchronous$1(this, bankAccountTokenParams, str2, str, (c) null), 1, (Object) null);
    }

    public final void createCardToken(Card card, ApiResultCallback<? super Token> apiResultCallback) {
        createCardToken$default(this, card, (String) null, (String) null, (ApiResultCallback) apiResultCallback, 6, (Object) null);
    }

    public final void createCardToken(Card card, String str, ApiResultCallback<? super Token> apiResultCallback) {
        createCardToken$default(this, card, str, (String) null, (ApiResultCallback) apiResultCallback, 4, (Object) null);
    }

    public final void createCardToken(Card card, String str, String str2, ApiResultCallback<? super Token> apiResultCallback) {
        i.e(card, "card");
        i.e(apiResultCallback, "callback");
        createToken(card, str2, str, apiResultCallback);
    }

    public final void createCardToken(CardParams cardParams, ApiResultCallback<? super Token> apiResultCallback) {
        createCardToken$default(this, cardParams, (String) null, (String) null, (ApiResultCallback) apiResultCallback, 6, (Object) null);
    }

    public final void createCardToken(CardParams cardParams, String str, ApiResultCallback<? super Token> apiResultCallback) {
        createCardToken$default(this, cardParams, str, (String) null, (ApiResultCallback) apiResultCallback, 4, (Object) null);
    }

    public final Token createCardTokenSynchronous(Card card) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        return createCardTokenSynchronous$default(this, card, (String) null, (String) null, 6, (Object) null);
    }

    public final Token createCardTokenSynchronous(Card card, String str) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        return createCardTokenSynchronous$default(this, card, str, (String) null, 4, (Object) null);
    }

    public final Token createCardTokenSynchronous(Card card, String str, String str2) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        i.e(card, "card");
        return (Token) a.l3((e) null, new Stripe$createCardTokenSynchronous$1(this, card, str2, str, (c) null), 1, (Object) null);
    }

    public final Token createCardTokenSynchronous(CardParams cardParams) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        return createCardTokenSynchronous$default(this, cardParams, (String) null, (String) null, 6, (Object) null);
    }

    public final Token createCardTokenSynchronous(CardParams cardParams, String str) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        return createCardTokenSynchronous$default(this, cardParams, str, (String) null, 4, (Object) null);
    }

    public final void createCvcUpdateToken(String str, ApiResultCallback<? super Token> apiResultCallback) {
        createCvcUpdateToken$default(this, str, (String) null, (String) null, apiResultCallback, 6, (Object) null);
    }

    public final void createCvcUpdateToken(String str, String str2, ApiResultCallback<? super Token> apiResultCallback) {
        createCvcUpdateToken$default(this, str, str2, (String) null, apiResultCallback, 4, (Object) null);
    }

    public final void createCvcUpdateToken(String str, String str2, String str3, ApiResultCallback<? super Token> apiResultCallback) {
        i.e(str, "cvc");
        i.e(apiResultCallback, "callback");
        createToken(new CvcTokenParams(str), str3, str2, apiResultCallback);
    }

    public final Token createCvcUpdateTokenSynchronous(String str) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        return createCvcUpdateTokenSynchronous$default(this, str, (String) null, (String) null, 6, (Object) null);
    }

    public final Token createCvcUpdateTokenSynchronous(String str, String str2) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        return createCvcUpdateTokenSynchronous$default(this, str, str2, (String) null, 4, (Object) null);
    }

    public final Token createCvcUpdateTokenSynchronous(String str, String str2, String str3) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        i.e(str, "cvc");
        return (Token) a.l3((e) null, new Stripe$createCvcUpdateTokenSynchronous$1(this, str, str3, str2, (c) null), 1, (Object) null);
    }

    public final void createFile(StripeFileParams stripeFileParams, ApiResultCallback<? super StripeFile> apiResultCallback) {
        createFile$default(this, stripeFileParams, (String) null, (String) null, apiResultCallback, 6, (Object) null);
    }

    public final void createFile(StripeFileParams stripeFileParams, String str, ApiResultCallback<? super StripeFile> apiResultCallback) {
        createFile$default(this, stripeFileParams, str, (String) null, apiResultCallback, 4, (Object) null);
    }

    public final void createFile(StripeFileParams stripeFileParams, String str, String str2, ApiResultCallback<? super StripeFile> apiResultCallback) {
        i.e(stripeFileParams, "fileParams");
        i.e(apiResultCallback, "callback");
        executeAsync(apiResultCallback, new Stripe$createFile$1(this, stripeFileParams, str2, str, (c) null));
    }

    public final StripeFile createFileSynchronous(StripeFileParams stripeFileParams) {
        return createFileSynchronous$default(this, stripeFileParams, (String) null, (String) null, 6, (Object) null);
    }

    public final StripeFile createFileSynchronous(StripeFileParams stripeFileParams, String str) {
        return createFileSynchronous$default(this, stripeFileParams, str, (String) null, 4, (Object) null);
    }

    public final StripeFile createFileSynchronous(StripeFileParams stripeFileParams, String str, String str2) {
        i.e(stripeFileParams, "fileParams");
        return (StripeFile) a.l3((e) null, new Stripe$createFileSynchronous$1(this, stripeFileParams, str2, str, (c) null), 1, (Object) null);
    }

    public final void createPaymentMethod(PaymentMethodCreateParams paymentMethodCreateParams, ApiResultCallback<? super PaymentMethod> apiResultCallback) {
        createPaymentMethod$default(this, paymentMethodCreateParams, (String) null, (String) null, apiResultCallback, 6, (Object) null);
    }

    public final void createPaymentMethod(PaymentMethodCreateParams paymentMethodCreateParams, String str, ApiResultCallback<? super PaymentMethod> apiResultCallback) {
        createPaymentMethod$default(this, paymentMethodCreateParams, str, (String) null, apiResultCallback, 4, (Object) null);
    }

    public final void createPaymentMethod(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, ApiResultCallback<? super PaymentMethod> apiResultCallback) {
        i.e(paymentMethodCreateParams, "paymentMethodCreateParams");
        i.e(apiResultCallback, "callback");
        executeAsync(apiResultCallback, new Stripe$createPaymentMethod$1(this, paymentMethodCreateParams, str2, str, (c) null));
    }

    public final PaymentMethod createPaymentMethodSynchronous(PaymentMethodCreateParams paymentMethodCreateParams) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        return createPaymentMethodSynchronous$default(this, paymentMethodCreateParams, (String) null, (String) null, 6, (Object) null);
    }

    public final PaymentMethod createPaymentMethodSynchronous(PaymentMethodCreateParams paymentMethodCreateParams, String str) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        return createPaymentMethodSynchronous$default(this, paymentMethodCreateParams, str, (String) null, 4, (Object) null);
    }

    public final PaymentMethod createPaymentMethodSynchronous(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        i.e(paymentMethodCreateParams, "paymentMethodCreateParams");
        return (PaymentMethod) a.l3((e) null, new Stripe$createPaymentMethodSynchronous$1(this, paymentMethodCreateParams, str2, str, (c) null), 1, (Object) null);
    }

    public final void createPersonToken(PersonTokenParams personTokenParams, ApiResultCallback<? super Token> apiResultCallback) {
        createPersonToken$default(this, personTokenParams, (String) null, (String) null, apiResultCallback, 6, (Object) null);
    }

    public final void createPersonToken(PersonTokenParams personTokenParams, String str, ApiResultCallback<? super Token> apiResultCallback) {
        createPersonToken$default(this, personTokenParams, str, (String) null, apiResultCallback, 4, (Object) null);
    }

    public final void createPersonToken(PersonTokenParams personTokenParams, String str, String str2, ApiResultCallback<? super Token> apiResultCallback) {
        i.e(personTokenParams, "params");
        i.e(apiResultCallback, "callback");
        createToken(personTokenParams, str2, str, apiResultCallback);
    }

    public final Token createPersonTokenSynchronous(PersonTokenParams personTokenParams) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        return createPersonTokenSynchronous$default(this, personTokenParams, (String) null, (String) null, 6, (Object) null);
    }

    public final Token createPersonTokenSynchronous(PersonTokenParams personTokenParams, String str) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        return createPersonTokenSynchronous$default(this, personTokenParams, str, (String) null, 4, (Object) null);
    }

    public final Token createPersonTokenSynchronous(PersonTokenParams personTokenParams, String str, String str2) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        i.e(personTokenParams, "params");
        return (Token) a.l3((e) null, new Stripe$createPersonTokenSynchronous$1(this, personTokenParams, str2, str, (c) null), 1, (Object) null);
    }

    public final void createPiiToken(String str, ApiResultCallback<? super Token> apiResultCallback) {
        createPiiToken$default(this, str, (String) null, (String) null, apiResultCallback, 6, (Object) null);
    }

    public final void createPiiToken(String str, String str2, ApiResultCallback<? super Token> apiResultCallback) {
        createPiiToken$default(this, str, str2, (String) null, apiResultCallback, 4, (Object) null);
    }

    public final void createPiiToken(String str, String str2, String str3, ApiResultCallback<? super Token> apiResultCallback) {
        i.e(str, "personalId");
        i.e(apiResultCallback, "callback");
        createToken(new PiiTokenParams(str), str3, str2, apiResultCallback);
    }

    public final Token createPiiTokenSynchronous(String str) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        return createPiiTokenSynchronous$default(this, str, (String) null, (String) null, 6, (Object) null);
    }

    public final Token createPiiTokenSynchronous(String str, String str2) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        return createPiiTokenSynchronous$default(this, str, str2, (String) null, 4, (Object) null);
    }

    public final Token createPiiTokenSynchronous(String str, String str2, String str3) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        i.e(str, "personalId");
        return (Token) a.l3((e) null, new Stripe$createPiiTokenSynchronous$1(this, str, str3, str2, (c) null), 1, (Object) null);
    }

    public final void createRadarSession(ApiResultCallback<? super RadarSession> apiResultCallback) {
        createRadarSession$default(this, (String) null, apiResultCallback, 1, (Object) null);
    }

    public final void createRadarSession(String str, ApiResultCallback<? super RadarSession> apiResultCallback) {
        i.e(apiResultCallback, "callback");
        executeAsync(apiResultCallback, new Stripe$createRadarSession$1(this, str, (c) null));
    }

    public final void createSource(SourceParams sourceParams, ApiResultCallback<? super Source> apiResultCallback) {
        createSource$default(this, sourceParams, (String) null, (String) null, apiResultCallback, 6, (Object) null);
    }

    public final void createSource(SourceParams sourceParams, String str, ApiResultCallback<? super Source> apiResultCallback) {
        createSource$default(this, sourceParams, str, (String) null, apiResultCallback, 4, (Object) null);
    }

    public final void createSource(SourceParams sourceParams, String str, String str2, ApiResultCallback<? super Source> apiResultCallback) {
        i.e(sourceParams, "sourceParams");
        i.e(apiResultCallback, "callback");
        executeAsync(apiResultCallback, new Stripe$createSource$1(this, sourceParams, str2, str, (c) null));
    }

    public final Source createSourceSynchronous(SourceParams sourceParams) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        return createSourceSynchronous$default(this, sourceParams, (String) null, (String) null, 6, (Object) null);
    }

    public final Source createSourceSynchronous(SourceParams sourceParams, String str) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        return createSourceSynchronous$default(this, sourceParams, str, (String) null, 4, (Object) null);
    }

    public final Source createSourceSynchronous(SourceParams sourceParams, String str, String str2) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        i.e(sourceParams, "params");
        return (Source) a.l3((e) null, new Stripe$createSourceSynchronous$1(this, sourceParams, str2, str, (c) null), 1, (Object) null);
    }

    public final <T extends StripeModel> Object dispatchResult(Object obj, ApiResultCallback<? super T> apiResultCallback, c<? super m0.i> cVar) {
        d0 d0Var = m0.a;
        Object k4 = a.k4(o.c, new Stripe$dispatchResult$2(obj, apiResultCallback, (c) null), cVar);
        if (k4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return k4;
        }
        return m0.i.a;
    }

    public final PaymentController getPaymentController$payments_core_release() {
        return this.paymentController;
    }

    public final String getPublishableKey$payments_core_release() {
        return this.publishableKey;
    }

    public final String getStripeAccountId$payments_core_release() {
        return this.stripeAccountId;
    }

    public final StripeRepository getStripeRepository$payments_core_release() {
        return this.stripeRepository;
    }

    public final void handleNextActionForPayment(Activity activity, String str) {
        handleNextActionForPayment$default(this, activity, str, (String) null, 4, (Object) null);
    }

    public final void handleNextActionForPayment(ComponentActivity componentActivity, String str) {
        handleNextActionForPayment$default(this, componentActivity, str, (String) null, 4, (Object) null);
    }

    public final void handleNextActionForPayment(ComponentActivity componentActivity, String str, String str2) {
        i.e(componentActivity, "activity");
        i.e(str, "clientSecret");
        a.E2(q.a(componentActivity), (e) null, (CoroutineStart) null, new Stripe$handleNextActionForPayment$1(this, componentActivity, str, str2, (c) null), 3, (Object) null);
    }

    public final void handleNextActionForPayment(Fragment fragment, String str) {
        handleNextActionForPayment$default(this, fragment, str, (String) null, 4, (Object) null);
    }

    public final void handleNextActionForSetupIntent(Activity activity, String str) {
        handleNextActionForSetupIntent$default(this, activity, str, (String) null, 4, (Object) null);
    }

    public final void handleNextActionForSetupIntent(ComponentActivity componentActivity, String str) {
        handleNextActionForSetupIntent$default(this, componentActivity, str, (String) null, 4, (Object) null);
    }

    public final void handleNextActionForSetupIntent(ComponentActivity componentActivity, String str, String str2) {
        i.e(componentActivity, "activity");
        i.e(str, "clientSecret");
        a.E2(q.a(componentActivity), (e) null, (CoroutineStart) null, new Stripe$handleNextActionForSetupIntent$1(this, componentActivity, str, str2, (c) null), 3, (Object) null);
    }

    public final void handleNextActionForSetupIntent(Fragment fragment, String str) {
        handleNextActionForSetupIntent$default(this, fragment, str, (String) null, 4, (Object) null);
    }

    public final boolean isAuthenticateSourceResult(int i, Intent intent) {
        return intent != null && this.paymentController.shouldHandleSourceResult(i, intent);
    }

    public final boolean isPaymentResult(int i, Intent intent) {
        return intent != null && this.paymentController.shouldHandlePaymentResult(i, intent);
    }

    public final boolean isSetupResult(int i, Intent intent) {
        return intent != null && this.paymentController.shouldHandleSetupResult(i, intent);
    }

    public final void onAuthenticateSourceResult(Intent intent, ApiResultCallback<? super Source> apiResultCallback) {
        i.e(intent, MessageExtension.FIELD_DATA);
        i.e(apiResultCallback, "callback");
        executeAsync(apiResultCallback, new Stripe$onAuthenticateSourceResult$1(this, intent, (c) null));
    }

    public final boolean onPaymentResult(int i, Intent intent, ApiResultCallback<? super PaymentIntentResult> apiResultCallback) {
        i.e(apiResultCallback, "callback");
        if (intent == null || !isPaymentResult(i, intent)) {
            return false;
        }
        executeAsync(apiResultCallback, new Stripe$onPaymentResult$1(this, intent, (c) null));
        return true;
    }

    public final boolean onSetupResult(int i, Intent intent, ApiResultCallback<? super SetupIntentResult> apiResultCallback) {
        i.e(apiResultCallback, "callback");
        if (intent == null || !isSetupResult(i, intent)) {
            return false;
        }
        executeAsync(apiResultCallback, new Stripe$onSetupResult$1(this, intent, (c) null));
        return true;
    }

    public final void retrievePaymentIntent(String str, ApiResultCallback<? super PaymentIntent> apiResultCallback) {
        retrievePaymentIntent$default(this, str, (String) null, apiResultCallback, 2, (Object) null);
    }

    public final void retrievePaymentIntent(String str, String str2, ApiResultCallback<? super PaymentIntent> apiResultCallback) {
        i.e(str, "clientSecret");
        i.e(apiResultCallback, "callback");
        executeAsync(apiResultCallback, new Stripe$retrievePaymentIntent$1(this, str, str2, (c) null));
    }

    public final PaymentIntent retrievePaymentIntentSynchronous(String str) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        return retrievePaymentIntentSynchronous$default(this, str, (String) null, 2, (Object) null);
    }

    public final PaymentIntent retrievePaymentIntentSynchronous(String str, String str2) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        i.e(str, "clientSecret");
        return (PaymentIntent) a.l3((e) null, new Stripe$retrievePaymentIntentSynchronous$1(this, str, str2, (c) null), 1, (Object) null);
    }

    public final void retrieveSetupIntent(String str, ApiResultCallback<? super SetupIntent> apiResultCallback) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        retrieveSetupIntent$default(this, str, (String) null, apiResultCallback, 2, (Object) null);
    }

    public final void retrieveSetupIntent(String str, String str2, ApiResultCallback<? super SetupIntent> apiResultCallback) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        i.e(str, "clientSecret");
        i.e(apiResultCallback, "callback");
        executeAsync(apiResultCallback, new Stripe$retrieveSetupIntent$1(this, str, str2, (c) null));
    }

    public final SetupIntent retrieveSetupIntentSynchronous(String str) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        return retrieveSetupIntentSynchronous$default(this, str, (String) null, 2, (Object) null);
    }

    public final SetupIntent retrieveSetupIntentSynchronous(String str, String str2) throws APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        i.e(str, "clientSecret");
        return (SetupIntent) a.l3((e) null, new Stripe$retrieveSetupIntentSynchronous$1(this, str, str2, (c) null), 1, (Object) null);
    }

    public final void retrieveSource(String str, String str2, ApiResultCallback<? super Source> apiResultCallback) {
        retrieveSource$default(this, str, str2, (String) null, apiResultCallback, 4, (Object) null);
    }

    public final void retrieveSource(String str, String str2, String str3, ApiResultCallback<? super Source> apiResultCallback) {
        i.e(str, "sourceId");
        i.e(str2, "clientSecret");
        i.e(apiResultCallback, "callback");
        executeAsync(apiResultCallback, new Stripe$retrieveSource$1(this, str, str2, str3, (c) null));
    }

    public final Source retrieveSourceSynchronous(String str, String str2) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        return retrieveSourceSynchronous$default(this, str, str2, (String) null, 4, (Object) null);
    }

    public final Source retrieveSourceSynchronous(String str, String str2, String str3) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        i.e(str, "sourceId");
        i.e(str2, "clientSecret");
        return (Source) a.l3((e) null, new Stripe$retrieveSourceSynchronous$1(this, str, str2, str3, (c) null), 1, (Object) null);
    }

    public static /* synthetic */ void authenticateSource$default(Stripe stripe, Activity activity, Source source, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.authenticateSource(activity, source, str);
    }

    public static /* synthetic */ void confirmPayment$default(Stripe stripe, Activity activity, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.confirmPayment(activity, confirmPaymentIntentParams, str);
    }

    public static /* synthetic */ void confirmSetupIntent$default(Stripe stripe, Activity activity, ConfirmSetupIntentParams confirmSetupIntentParams, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.confirmSetupIntent(activity, confirmSetupIntentParams, str);
    }

    public static /* synthetic */ void createCardToken$default(Stripe stripe, CardParams cardParams, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createCardToken(cardParams, str, str2, (ApiResultCallback<? super Token>) apiResultCallback);
    }

    public static /* synthetic */ Token createCardTokenSynchronous$default(Stripe stripe, CardParams cardParams, String str, String str2, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createCardTokenSynchronous(cardParams, str, str2);
    }

    public static /* synthetic */ void handleNextActionForPayment$default(Stripe stripe, Activity activity, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.handleNextActionForPayment(activity, str, str2);
    }

    public static /* synthetic */ void handleNextActionForSetupIntent$default(Stripe stripe, Activity activity, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.handleNextActionForSetupIntent(activity, str, str2);
    }

    public final void authenticatePayment(Fragment fragment, String str) {
        i.e(fragment, "fragment");
        i.e(str, "clientSecret");
        a.E2(q.a(fragment), (e) null, (CoroutineStart) null, new Stripe$authenticatePayment$2(this, fragment, str, (c) null), 3, (Object) null);
    }

    public final void authenticateSetup(Fragment fragment, String str) {
        i.e(fragment, "fragment");
        i.e(str, "clientSecret");
        a.E2(q.a(fragment), (e) null, (CoroutineStart) null, new Stripe$authenticateSetup$2(this, fragment, str, (c) null), 3, (Object) null);
    }

    public final void authenticateSource(Activity activity, Source source, String str) {
        i.e(activity, "activity");
        i.e(source, Stripe3ds2AuthParams.FIELD_SOURCE);
        a.E2(getLifecycleScope(activity), (e) null, (CoroutineStart) null, new Stripe$authenticateSource$2(this, activity, source, str, (c) null), 3, (Object) null);
    }

    public final void confirmPayment(Activity activity, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str) {
        i.e(activity, "activity");
        i.e(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        a.E2(getLifecycleScope(activity), (e) null, (CoroutineStart) null, new Stripe$confirmPayment$2(this, activity, confirmPaymentIntentParams, str, (c) null), 3, (Object) null);
    }

    public final void confirmSetupIntent(Activity activity, ConfirmSetupIntentParams confirmSetupIntentParams, String str) {
        i.e(activity, "activity");
        i.e(confirmSetupIntentParams, "confirmSetupIntentParams");
        a.E2(getLifecycleScope(activity), (e) null, (CoroutineStart) null, new Stripe$confirmSetupIntent$2(this, activity, confirmSetupIntentParams, str, (c) null), 3, (Object) null);
    }

    public final void createCardToken(CardParams cardParams, String str, String str2, ApiResultCallback<? super Token> apiResultCallback) {
        i.e(cardParams, "cardParams");
        i.e(apiResultCallback, "callback");
        createToken(cardParams, str2, str, apiResultCallback);
    }

    public final Token createCardTokenSynchronous(CardParams cardParams, String str, String str2) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        i.e(cardParams, "cardParams");
        return (Token) a.l3((e) null, new Stripe$createCardTokenSynchronous$2(this, cardParams, str2, str, (c) null), 1, (Object) null);
    }

    public final void handleNextActionForPayment(Activity activity, String str, String str2) {
        i.e(activity, "activity");
        i.e(str, "clientSecret");
        a.E2(getLifecycleScope(activity), (e) null, (CoroutineStart) null, new Stripe$handleNextActionForPayment$2(this, activity, str, str2, (c) null), 3, (Object) null);
    }

    public final void handleNextActionForSetupIntent(Activity activity, String str, String str2) {
        i.e(activity, "activity");
        i.e(str, "clientSecret");
        a.E2(getLifecycleScope(activity), (e) null, (CoroutineStart) null, new Stripe$handleNextActionForSetupIntent$2(this, activity, str, str2, (c) null), 3, (Object) null);
    }

    public Stripe(StripeRepository stripeRepository2, PaymentController paymentController2, String str, String str2, e eVar) {
        i.e(stripeRepository2, "stripeRepository");
        i.e(paymentController2, "paymentController");
        i.e(str, "publishableKey");
        i.e(eVar, "workContext");
        this.stripeRepository = stripeRepository2;
        this.paymentController = paymentController2;
        this.stripeAccountId = str2;
        this.workContext = eVar;
        this.publishableKey = new ApiKeyValidator().requireValid(str);
    }

    public static /* synthetic */ void authenticateSource$default(Stripe stripe, Fragment fragment, Source source, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.authenticateSource(fragment, source, str);
    }

    public static /* synthetic */ void confirmPayment$default(Stripe stripe, Fragment fragment, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.confirmPayment(fragment, confirmPaymentIntentParams, str);
    }

    public static /* synthetic */ void confirmSetupIntent$default(Stripe stripe, Fragment fragment, ConfirmSetupIntentParams confirmSetupIntentParams, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.confirmSetupIntent(fragment, confirmSetupIntentParams, str);
    }

    public static /* synthetic */ void handleNextActionForPayment$default(Stripe stripe, Fragment fragment, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.handleNextActionForPayment(fragment, str, str2);
    }

    public static /* synthetic */ void handleNextActionForSetupIntent$default(Stripe stripe, Fragment fragment, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.handleNextActionForSetupIntent(fragment, str, str2);
    }

    public final void authenticateSource(Fragment fragment, Source source, String str) {
        i.e(fragment, "fragment");
        i.e(source, Stripe3ds2AuthParams.FIELD_SOURCE);
        LifecycleCoroutineScope a = q.a(fragment);
        Stripe$authenticateSource$3 stripe$authenticateSource$3 = new Stripe$authenticateSource$3(this, fragment, source, str, (c) null);
        i.e(stripe$authenticateSource$3, "block");
        a.E2(a, (e) null, (CoroutineStart) null, new LifecycleCoroutineScope$launchWhenCreated$1(a, stripe$authenticateSource$3, (c) null), 3, (Object) null);
    }

    public final void confirmPayment(Fragment fragment, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str) {
        i.e(fragment, "fragment");
        i.e(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        a.E2(q.a(fragment), (e) null, (CoroutineStart) null, new Stripe$confirmPayment$3(this, fragment, confirmPaymentIntentParams, str, (c) null), 3, (Object) null);
    }

    public final void confirmSetupIntent(Fragment fragment, ConfirmSetupIntentParams confirmSetupIntentParams, String str) {
        i.e(fragment, "fragment");
        i.e(confirmSetupIntentParams, "confirmSetupIntentParams");
        a.E2(q.a(fragment), (e) null, (CoroutineStart) null, new Stripe$confirmSetupIntent$3(this, fragment, confirmSetupIntentParams, str, (c) null), 3, (Object) null);
    }

    public final void handleNextActionForPayment(Fragment fragment, String str, String str2) {
        i.e(fragment, "fragment");
        i.e(str, "clientSecret");
        a.E2(q.a(fragment), (e) null, (CoroutineStart) null, new Stripe$handleNextActionForPayment$3(this, fragment, str, str2, (c) null), 3, (Object) null);
    }

    public final void handleNextActionForSetupIntent(Fragment fragment, String str, String str2) {
        i.e(fragment, "fragment");
        i.e(str, "clientSecret");
        a.E2(q.a(fragment), (e) null, (CoroutineStart) null, new Stripe$handleNextActionForSetupIntent$3(this, fragment, str, str2, (c) null), 3, (Object) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Stripe(android.content.Context r21, java.lang.String r22, java.lang.String r23, boolean r24, java.util.Set<? extends com.stripe.android.StripeApiBeta> r25) {
        /*
            r20 = this;
            r15 = r22
            java.lang.String r0 = "context"
            r1 = r21
            m0.n.b.i.e(r1, r0)
            java.lang.String r0 = "publishableKey"
            m0.n.b.i.e(r15, r0)
            java.lang.String r0 = "betas"
            r11 = r25
            m0.n.b.i.e(r11, r0)
            android.content.Context r14 = r21.getApplicationContext()
            java.lang.String r0 = "context.applicationContext"
            m0.n.b.i.d(r14, r0)
            com.stripe.android.networking.StripeApiRepository r16 = new com.stripe.android.networking.StripeApiRepository
            android.content.Context r1 = r21.getApplicationContext()
            m0.n.b.i.d(r1, r0)
            com.stripe.android.AppInfo r3 = appInfo
            com.stripe.android.Logger$Companion r0 = com.stripe.android.Logger.Companion
            r13 = r24
            com.stripe.android.Logger r4 = r0.getInstance$payments_core_release(r13)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r17 = 0
            r18 = 7152(0x1bf0, float:1.0022E-41)
            r19 = 0
            r0 = r16
            r2 = r22
            r13 = r17
            r17 = r14
            r14 = r18
            r15 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            com.stripe.android.ApiKeyValidator$Companion r0 = com.stripe.android.ApiKeyValidator.Companion
            com.stripe.android.ApiKeyValidator r0 = r0.get$payments_core_release()
            r1 = r22
            java.lang.String r4 = r0.requireValid(r1)
            r1 = r20
            r2 = r17
            r3 = r16
            r5 = r23
            r6 = r24
            r1.<init>((android.content.Context) r2, (com.stripe.android.networking.StripeRepository) r3, (java.lang.String) r4, (java.lang.String) r5, (boolean) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.Stripe.<init>(android.content.Context, java.lang.String, java.lang.String, boolean, java.util.Set):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private Stripe(android.content.Context r21, com.stripe.android.networking.StripeRepository r22, java.lang.String r23, java.lang.String r24, boolean r25) {
        /*
            r20 = this;
            r3 = r22
            r2 = r23
            r4 = r25
            com.stripe.android.StripePaymentController r15 = new com.stripe.android.StripePaymentController
            r0 = r15
            android.content.Context r5 = r21.getApplicationContext()
            r1 = r5
            java.lang.String r6 = "context.applicationContext"
            m0.n.b.i.d(r5, r6)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r19 = r15
            r15 = r16
            r17 = 65520(0xfff0, float:9.1813E-41)
            r18 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = r20
            r1 = r22
            r3 = r24
            r4 = r19
            r0.<init>((com.stripe.android.networking.StripeRepository) r1, (com.stripe.android.PaymentController) r4, (java.lang.String) r2, (java.lang.String) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.Stripe.<init>(android.content.Context, com.stripe.android.networking.StripeRepository, java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Stripe(StripeRepository stripeRepository2, PaymentController paymentController2, String str, String str2) {
        this(stripeRepository2, paymentController2, str, str2, (e) m0.c);
        i.e(stripeRepository2, "stripeRepository");
        i.e(paymentController2, "paymentController");
        i.e(str, "publishableKey");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Stripe(StripeRepository stripeRepository2, PaymentController paymentController2, String str, String str2, e eVar, int i, f fVar) {
        this(stripeRepository2, paymentController2, str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? m0.c : eVar);
    }
}
