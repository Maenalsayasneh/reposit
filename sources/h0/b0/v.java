package h0.b0;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.Process;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.RecentlyNonNull;
import androidx.emoji.widget.EmojiTextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.WorkInfo$State;
import com.afollestad.assent.AssentResult;
import com.afollestad.assent.Permission;
import com.afollestad.assent.internal.Assent;
import com.afollestad.assent.internal.PermissionFragment;
import com.afollestad.assent.rationale.RationaleHandler;
import com.afollestad.assent.rationale.RationaleHandler$requestPermissions$2;
import com.airbnb.epoxy.Carousel;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.epoxy.paging3.PagingDataEpoxyController;
import com.airbnb.mvrx.DeliveryMode;
import com.airbnb.mvrx.MavericksViewModel;
import com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal1$$inlined$map$1;
import com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal1$2;
import com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal2$$inlined$map$1;
import com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal2$2;
import com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal4$$inlined$map$1;
import com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal4$2;
import com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internalSF$1;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.channels.ChannelComponentHandler;
import com.clubhouse.android.channels.model.AudienceType;
import com.clubhouse.android.core.ui.Banner;
import com.clubhouse.android.core.ui.BaseBottomSheetFragment;
import com.clubhouse.android.core.ui.BaseFragment;
import com.clubhouse.android.core.ui.ViewUtil$onGlobalLayout$$inlined$observeDestroy$1;
import com.clubhouse.android.data.models.local.OnboardingDestination;
import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.channel.ChannelInRoom;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.remote.response.CompletePhoneNumberAuthResponse;
import com.clubhouse.android.data.repos.ClubMembership;
import com.clubhouse.android.databinding.DialogEditTextBinding;
import com.clubhouse.android.di.FragmentKeyKt$addFragment$1$1;
import com.clubhouse.android.di.FragmentName;
import com.clubhouse.android.extensions.FragmentExtensionsKt$disableBackPress$1;
import com.clubhouse.android.extensions.FragmentExtensionsKt$getNavigationResult$1;
import com.clubhouse.android.extensions.FragmentExtensionsKt$saveScreenIntoCache$1;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.android.ui.actionsheet.ActionSheetBuilder;
import com.clubhouse.android.ui.actionsheet.ActionSheetFragmentKt$actionSheet$1;
import com.clubhouse.android.ui.backchannel.CreateChatArgs;
import com.clubhouse.android.ui.clubs.nominate.ClubDialogUtilKt$showJoinClubReasonDialog$1;
import com.clubhouse.android.ui.clubs.nominate.ClubDialogUtilKt$showNominationReasonDialog$1;
import com.clubhouse.android.ui.common.paging.PagingDataEpoxyControllerExtensionsKt$observeState$$inlined$map$1;
import com.clubhouse.android.ui.common.paging.PagingDataEpoxyControllerExtensionsKt$observeState$modelBuild$1;
import com.clubhouse.android.ui.common.topics.TopicFragmentUtilKt$addTopicsItems$1;
import com.clubhouse.android.ui.onboarding.CollectNameArgs;
import com.clubhouse.android.ui.onboarding.InvitedByFragment;
import com.clubhouse.android.user.model.User;
import com.clubhouse.android.user.model.UserSelf;
import com.clubhouse.android.util.KeyboardEventListener;
import com.clubhouse.backchannel.R;
import com.clubhouse.backchannel.chat.ChatArgs;
import com.clubhouse.backchannel.chat.style.MessageBubbleStyle;
import com.clubhouse.backchannel.container.BackchannelContainerExtensionsKt$createBackchannelNavController$2;
import com.clubhouse.backchannel.data.models.local.Position;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil$Checker;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.recaptcha.RecaptchaActionType;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.model.NetworkLog;
import com.pubnub.api.PNConfiguration;
import com.pubnub.api.PubNub;
import com.pubnub.api.enums.PNReconnectionPolicy;
import com.sinch.verification.core.config.general.SinchGlobalConfig$Builder$build$retrofit$1;
import com.squareup.picasso.Picasso;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b.a.d;
import h0.o.a.c0;
import h0.o.a.k;
import h0.q.f0;
import h0.q.o0;
import h0.q.q;
import h0.t.m;
import h0.t.s;
import i0.b.a.o;
import i0.b.a.w;
import i0.b.b.a0;
import i0.b.b.i0;
import i0.b.b.j;
import i0.e.b.c3.e;
import i0.e.b.g3.l.y2.a;
import i0.e.b.g3.r.f2;
import i0.e.b.g3.r.g2;
import i0.e.b.g3.r.h2;
import i0.e.b.g3.r.j2;
import i0.e.b.g3.r.k2;
import i0.e.b.g3.r.l2;
import i0.e.b.z2.e.d;
import i0.e.c.f.b.a.c;
import i0.f.a.c.t.f;
import i0.h.a.b.c.k.a;
import i0.h.a.b.c.m.b;
import i0.j.f.p.h;
import i0.k.b.a.a.a.d;
import i0.n.c.a.c.b.b;
import i0.o.a.u;
import i0.o.a.x;
import j$.time.Duration;
import j$.time.OffsetDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.EmptyList;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.SerializerAlreadyRegisteredException;
import m0.i;
import m0.j.g;
import m0.n.a.l;
import m0.n.a.r;
import m0.n.b.p;
import n0.a.f1;
import n0.a.m0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import q0.a0;
import q0.y;
import t0.h;
import t0.w;

/* compiled from: ViewGroupUtilsApi14 */
public class v {
    public static a a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;
    public static Boolean e;

    @EnsuresNonNull({"#1"})
    public static <T> T A(@RecentlyNonNull T t, @RecentlyNonNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static BackoffPolicy A0(int i) {
        if (i == 0) {
            return BackoffPolicy.EXPONENTIAL;
        }
        if (i == 1) {
            return BackoffPolicy.LINEAR;
        }
        throw new IllegalArgumentException(i0.d.a.a.a.g0("Could not convert ", i, " to BackoffPolicy"));
    }

    public static boolean A1(@RecentlyNonNull Parcel parcel, int i) {
        H2(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static void A2(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int G2 = G2(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            L2(parcel, G2);
        } else if (z) {
            J2(parcel, i, 0);
        }
    }

    public static void B(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static NetworkType B0(int i) {
        if (i == 0) {
            return NetworkType.NOT_REQUIRED;
        }
        if (i == 1) {
            return NetworkType.CONNECTED;
        }
        if (i == 2) {
            return NetworkType.UNMETERED;
        }
        if (i == 3) {
            return NetworkType.NOT_ROAMING;
        }
        if (i == 4) {
            return NetworkType.METERED;
        }
        throw new IllegalArgumentException(i0.d.a.a.a.g0("Could not convert ", i, " to NetworkType"));
    }

    public static byte B1(@RecentlyNonNull Parcel parcel, int i) {
        H2(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static void B2(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull String str, boolean z) {
        if (str != null) {
            int G2 = G2(parcel, i);
            parcel.writeString(str);
            L2(parcel, G2);
        } else if (z) {
            J2(parcel, i, 0);
        }
    }

    public static void C(boolean z, @RecentlyNonNull Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static WorkInfo$State C0(int i) {
        if (i == 0) {
            return WorkInfo$State.ENQUEUED;
        }
        if (i == 1) {
            return WorkInfo$State.RUNNING;
        }
        if (i == 2) {
            return WorkInfo$State.SUCCEEDED;
        }
        if (i == 3) {
            return WorkInfo$State.FAILED;
        }
        if (i == 4) {
            return WorkInfo$State.BLOCKED;
        }
        if (i == 5) {
            return WorkInfo$State.CANCELLED;
        }
        throw new IllegalArgumentException(i0.d.a.a.a.g0("Could not convert ", i, " to State"));
    }

    public static double C1(@RecentlyNonNull Parcel parcel, int i) {
        H2(parcel, i, 8);
        return parcel.readDouble();
    }

    public static void C2(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull String[] strArr, boolean z) {
        if (strArr != null) {
            int G2 = G2(parcel, i);
            parcel.writeStringArray(strArr);
            L2(parcel, G2);
        } else if (z) {
            J2(parcel, i, 0);
        }
    }

    public static String D(JavaType javaType) {
        String str;
        String str2;
        String name = javaType.c.getName();
        if (name.startsWith("java.time.")) {
            if (name.indexOf(46, 10) >= 0) {
                return null;
            }
            str2 = "Java 8 date/time";
            str = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310";
        } else if (!name.startsWith("org.joda.time.")) {
            return null;
        } else {
            str2 = "Joda date/time";
            str = "com.fasterxml.jackson.datatype:jackson-datatype-joda";
        }
        return String.format("%s type %s not supported by default: add Module \"%s\" to enable handling", new Object[]{str2, f.t(javaType), str});
    }

    public static final boolean D0(Context context) {
        Context baseContext;
        if (context == null) {
            return true;
        }
        if (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                context = null;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper == null || (baseContext = contextWrapper.getBaseContext()) == null) {
                return false;
            }
            return D0(baseContext);
        }
        Activity activity = (Activity) context;
        if (activity.isFinishing()) {
            return true;
        }
        return activity.isDestroyed();
    }

    public static float D1(@RecentlyNonNull Parcel parcel, int i) {
        H2(parcel, i, 4);
        return parcel.readFloat();
    }

    public static void D2(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull List<String> list, boolean z) {
        if (list != null) {
            int G2 = G2(parcel, i);
            parcel.writeStringList(list);
            L2(parcel, G2);
        } else if (z) {
            J2(parcel, i, 0);
        }
    }

    public static final void E(Activity activity, FragmentManager fragmentManager, l<? super c0, i> lVar) {
        m0.n.b.i.e(activity, "activity");
        m0.n.b.i.e(fragmentManager, "fragmentManager");
        m0.n.b.i.e(lVar, "f");
        Handler c2 = ((i0.e.b.c3.f.a) h.L0(activity, i0.e.b.c3.f.a.class)).c();
        c2.removeCallbacksAndMessages((Object) null);
        try {
            h0.o.a.a aVar = new h0.o.a.a(fragmentManager);
            m0.n.b.i.d(aVar, "beginTransaction()");
            lVar.invoke(aVar);
            aVar.j();
        } catch (Exception e2) {
            v0.a.a.d.w(e2);
            c2.postDelayed(new i0.e.b.d3.a(fragmentManager, lVar), 400);
        }
    }

    public static final boolean E0(Context context, Permission... permissionArr) {
        m0.n.b.i.f(context, "$this$isAllGranted");
        m0.n.b.i.f(permissionArr, "permissions");
        int length = permissionArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            if (h0.i.b.a.checkSelfPermission(context, permissionArr[i].getValue()) != 0) {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }

    @RecentlyNonNull
    public static Float E1(@RecentlyNonNull Parcel parcel, int i) {
        int I1 = I1(parcel, i);
        if (I1 == 0) {
            return null;
        }
        K2(parcel, I1, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static <T extends Parcelable> void E2(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int G2 = G2(parcel, i);
            parcel.writeInt(r7);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    I2(parcel, t, i2);
                }
            }
            L2(parcel, G2);
        } else if (z) {
            J2(parcel, i, 0);
        }
    }

    public static final void F(Fragment fragment, FragmentManager fragmentManager, l<? super c0, i> lVar) {
        m0.n.b.i.e(fragment, "<this>");
        m0.n.b.i.e(fragmentManager, "fragmentManager");
        m0.n.b.i.e(lVar, "f");
        k requireActivity = fragment.requireActivity();
        m0.n.b.i.d(requireActivity, "requireActivity()");
        E(requireActivity, fragmentManager, lVar);
    }

    public static final boolean F0(String str) {
        m0.n.b.i.e(str, "<this>");
        h0.m.a.a a2 = h0.m.a.a.a();
        if (a2.b() != 1) {
            return false;
        }
        CharSequence g = a2.g(str, 0, str.length(), Integer.MAX_VALUE, 1);
        Spannable spannable = g instanceof Spannable ? (Spannable) g : null;
        if (spannable == null) {
            return false;
        }
        Object[] spans = spannable.getSpans(0, str.length(), Object.class);
        m0.n.b.i.d(spans, "it.getSpans(0, length, Object::class.java)");
        int length = spans.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Object obj = spans[i];
            i++;
            i2 += spannable.getSpanEnd(obj) - spannable.getSpanStart(obj);
        }
        if (i2 == g.length()) {
            return true;
        }
        return false;
    }

    @RecentlyNonNull
    public static IBinder F1(@RecentlyNonNull Parcel parcel, int i) {
        int I1 = I1(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I1 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + I1);
        return readStrongBinder;
    }

    public static <T extends Parcelable> void F2(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull List<T> list, boolean z) {
        if (list != null) {
            int G2 = G2(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    I2(parcel, parcelable, 0);
                }
            }
            L2(parcel, G2);
        } else if (z) {
            J2(parcel, i, 0);
        }
    }

    public static final void G(Fragment fragment, l<? super c0, i> lVar) {
        m0.n.b.i.e(fragment, "<this>");
        m0.n.b.i.e(lVar, "f");
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        m0.n.b.i.d(childFragmentManager, "childFragmentManager");
        F(fragment, childFragmentManager, lVar);
    }

    public static final boolean G0(Channel channel) {
        m0.n.b.i.e(channel, "<this>");
        return o(channel) == AudienceType.Open || I0(channel);
    }

    public static int G1(@RecentlyNonNull Parcel parcel, int i) {
        H2(parcel, i, 4);
        return parcel.readInt();
    }

    public static int G2(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static final void H(BaseBottomSheetFragment baseBottomSheetFragment) {
        int i;
        OnBackPressedDispatcher onBackPressedDispatcher;
        m0.n.b.i.e(baseBottomSheetFragment, "<this>");
        k activity = baseBottomSheetFragment.getActivity();
        Object obj = null;
        if (activity != null) {
            activity.setIntent((Intent) null);
        }
        Fragment I = baseBottomSheetFragment.getChildFragmentManager().I(R.id.backchannel_host);
        Objects.requireNonNull(I, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        NavHostFragment navHostFragment = (NavHostFragment) I;
        Bundle arguments = baseBottomSheetFragment.getArguments();
        if (arguments != null) {
            obj = arguments.get("mavericks:arg");
        }
        if (obj instanceof CreateChatArgs) {
            i = R.id.createChatFragment;
        } else if (obj instanceof ChatArgs) {
            i = R.id.chatFragment;
        } else {
            i = R.id.inboxFragment;
        }
        NavController J0 = navHostFragment.J0();
        m c2 = J0.f().c(R.navigation.backchannel_graph);
        c2.u(i);
        J0.o(c2, baseBottomSheetFragment.getArguments());
        k activity2 = baseBottomSheetFragment.getActivity();
        if (activity2 != null && (onBackPressedDispatcher = activity2.getOnBackPressedDispatcher()) != null) {
            g0.a.b.b.a.a(onBackPressedDispatcher, baseBottomSheetFragment.getViewLifecycleOwner(), false, new BackchannelContainerExtensionsKt$createBackchannelNavController$2(navHostFragment, baseBottomSheetFragment), 2);
        }
    }

    public static final boolean H0(ChannelInRoom channelInRoom, SourceLocation sourceLocation, i0.e.b.b3.a.a.c.a aVar) {
        m0.n.b.i.e(sourceLocation, "sourceLocation");
        m0.n.b.i.e(aVar, "users");
        m0.n.b.i.e(sourceLocation, "sourceLocation");
        if ((sourceLocation == SourceLocation.WAVE) && aVar.f()) {
            if (channelInRoom != null && channelInRoom.T()) {
                return true;
            }
        }
        return false;
    }

    public static long H1(@RecentlyNonNull Parcel parcel, int i) {
        H2(parcel, i, 8);
        return parcel.readLong();
    }

    public static void H2(Parcel parcel, int i, int i2) {
        int I1 = I1(parcel, i);
        if (I1 != i2) {
            String hexString = Integer.toHexString(I1);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(I1);
            throw new SafeParcelReader$ParseException(i0.d.a.a.a.z0(sb, " (0x", hexString, ")"), parcel);
        }
    }

    @RecentlyNonNull
    public static Bundle I(@RecentlyNonNull Parcel parcel, int i) {
        int I1 = I1(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I1 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + I1);
        return readBundle;
    }

    public static final boolean I0(Channel channel) {
        m0.n.b.i.e(channel, "<this>");
        return o(channel) == AudienceType.Club && !channel.T();
    }

    public static int I1(@RecentlyNonNull Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    public static <T extends Parcelable> void I2(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    @RecentlyNonNull
    public static byte[] J(@RecentlyNonNull Parcel parcel, int i) {
        int I1 = I1(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I1 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + I1);
        return createByteArray;
    }

    public static final boolean J0() {
        return StringsKt__IndentKt.d("production", "staging", false, 2);
    }

    public static final String J1(OffsetDateTime offsetDateTime, Context context) {
        m0.n.b.i.e(offsetDateTime, "<this>");
        m0.n.b.i.e(context, "context");
        if (K0(offsetDateTime)) {
            String string = context.getResources().getString(com.clubhouse.android.core.R.string.today);
            m0.n.b.i.d(string, "{\n        context.resources.getString(R.string.today)\n    }");
            return string;
        } else if (L0(offsetDateTime)) {
            String string2 = context.getResources().getString(com.clubhouse.android.core.R.string.tomorrow);
            m0.n.b.i.d(string2, "{\n        context.resources.getString(R.string.tomorrow)\n    }");
            return string2;
        } else {
            String format = offsetDateTime.format(DateTimeFormatter.ofPattern("EEE, d MMM").withZone(ZoneId.systemDefault()));
            m0.n.b.i.d(format, "{\n        format(DateTimeFormatter.ofPattern(\"EEE, d MMM\").withZone(ZoneId.systemDefault()))\n    }");
            return format;
        }
    }

    public static void J2(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }

    @RecentlyNonNull
    public static int[] K(@RecentlyNonNull Parcel parcel, int i) {
        int I1 = I1(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I1 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + I1);
        return createIntArray;
    }

    public static final boolean K0(OffsetDateTime offsetDateTime) {
        m0.n.b.i.e(offsetDateTime, "<this>");
        return m(offsetDateTime).getDayOfYear() == OffsetDateTime.now().getDayOfYear();
    }

    public static final String K1(OffsetDateTime offsetDateTime, Context context) {
        m0.n.b.i.e(offsetDateTime, "<this>");
        m0.n.b.i.e(context, "context");
        return J1(offsetDateTime, context) + ' ' + L1(offsetDateTime);
    }

    public static void K2(Parcel parcel, int i, int i2) {
        if (i != i2) {
            String hexString = Integer.toHexString(i);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(i);
            throw new SafeParcelReader$ParseException(i0.d.a.a.a.z0(sb, " (0x", hexString, ")"), parcel);
        }
    }

    @RecentlyNonNull
    public static ArrayList<Integer> L(@RecentlyNonNull Parcel parcel, int i) {
        int I1 = I1(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I1 == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + I1);
        return arrayList;
    }

    public static final boolean L0(OffsetDateTime offsetDateTime) {
        m0.n.b.i.e(offsetDateTime, "<this>");
        return m(offsetDateTime).getDayOfYear() == OffsetDateTime.now().getDayOfYear() + 1;
    }

    public static final String L1(OffsetDateTime offsetDateTime) {
        m0.n.b.i.e(offsetDateTime, "<this>");
        String format = offsetDateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault()));
        m0.n.b.i.d(format, "format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault()))");
        return format;
    }

    public static void L2(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    @RecentlyNonNull
    public static <T extends Parcelable> T M(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int I1 = I1(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I1 == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + I1);
        return t;
    }

    @TargetApi(20)
    public static boolean M0(@RecentlyNonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (b == null) {
            b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return b.booleanValue();
    }

    public static final String M1(OffsetDateTime offsetDateTime) {
        m0.n.b.i.e(offsetDateTime, "<this>");
        return L1(offsetDateTime) + ", " + offsetDateTime.format(DateTimeFormatter.ofPattern("MMM d").withZone(ZoneId.systemDefault()));
    }

    @RecentlyNonNull
    public static String N(@RecentlyNonNull Parcel parcel, int i) {
        int I1 = I1(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I1 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + I1);
        return readString;
    }

    @TargetApi(26)
    public static boolean N0(@RecentlyNonNull Context context) {
        if (!M0(context)) {
            return false;
        }
        if (c == null) {
            c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return c.booleanValue() && !b.U();
    }

    public static final <T> List<T> N1(Iterable<? extends T> iterable, l<? super T, Boolean> lVar, l<? super T, ? extends T> lVar2) {
        m0.n.b.i.e(iterable, "<this>");
        m0.n.b.i.e(lVar, "predicate");
        m0.n.b.i.e(lVar2, "replace");
        ArrayList arrayList = new ArrayList(h.K(iterable, 10));
        for (Object next : iterable) {
            if (lVar.invoke(next).booleanValue()) {
                next = lVar2.invoke(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    @RecentlyNonNull
    public static String[] O(@RecentlyNonNull Parcel parcel, int i) {
        int I1 = I1(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I1 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + I1);
        return createStringArray;
    }

    public static String O0(User user) {
        m0.n.b.i.e(user, "this");
        String name = user.getName();
        List D = name == null ? null : StringsKt__IndentKt.D(name, new char[]{' '}, false, 0, 6);
        return (D == null || D.size() <= 1) ? "" : (String) g.G(D);
    }

    public static final <T extends j> T O1(Bundle bundle, T t, boolean z) {
        boolean z2;
        Bundle bundle2 = bundle;
        T t2 = t;
        m0.n.b.i.e(bundle2, "$this$restorePersistedState");
        m0.n.b.i.e(t2, "initialState");
        Class<?> cls = t.getClass();
        Constructor<?> r1 = r1(cls);
        if (r1 == null) {
            return t2;
        }
        bundle2.setClassLoader(cls.getClassLoader());
        Method[] declaredMethods = cls.getDeclaredMethods();
        m0.n.b.i.d(declaredMethods, "jvmClass.declaredMethods");
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method method = declaredMethods[i];
            if (i0.d.a.a.a.z(method, "it", "copy$default")) {
                int length2 = r1.getParameterTypes().length;
                int i2 = (length2 / 32) + 1;
                int[] iArr = new int[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    iArr[i3] = 0;
                }
                Object[] objArr = new Object[length2];
                objArr[0] = t2;
                int i4 = 0;
                while (true) {
                    long j = null;
                    if (i4 < length2) {
                        String valueOf = String.valueOf(i4);
                        if (bundle2.containsKey(valueOf)) {
                            objArr[i4] = bundle2.get(valueOf);
                        } else {
                            if (z) {
                                Annotation[] annotationArr = r1.getParameterAnnotations()[i4];
                                m0.n.b.i.d(annotationArr, "constructor.parameterAnnotations[i]");
                                int length3 = annotationArr.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= length3) {
                                        z2 = false;
                                        break;
                                    } else if (annotationArr[i5] instanceof a0) {
                                        z2 = true;
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                                if (z2) {
                                    throw new IllegalStateException(i0.d.a.a.a.g0("savedInstanceState bundle should have a key for state property at position ", i4, " but it was missing.").toString());
                                }
                            }
                            int i6 = i4 / 32;
                            iArr[i6] = iArr[i6] | (1 << (i4 % 32));
                            m0.n.b.i.d(method, "copyFunction");
                            Class cls2 = method.getParameterTypes()[i4 + 1];
                            m0.n.b.i.d(cls2, "copyFunction.parameterTypes[i + 1]");
                            if (m0.n.b.i.a(cls2, Integer.TYPE)) {
                                j = 0;
                            } else if (m0.n.b.i.a(cls2, Boolean.TYPE)) {
                                j = Boolean.FALSE;
                            } else if (m0.n.b.i.a(cls2, Float.TYPE)) {
                                j = Float.valueOf(0.0f);
                            } else if (m0.n.b.i.a(cls2, Character.TYPE)) {
                                j = 'A';
                            } else if (m0.n.b.i.a(cls2, Byte.TYPE)) {
                                j = Byte.MIN_VALUE;
                            } else if (m0.n.b.i.a(cls2, Short.TYPE)) {
                                j = Short.MIN_VALUE;
                            } else if (m0.n.b.i.a(cls2, Long.TYPE)) {
                                j = 0L;
                            } else if (m0.n.b.i.a(cls2, Double.TYPE)) {
                                j = Double.valueOf(0.0d);
                            }
                            objArr[i4] = j;
                        }
                        i4++;
                    } else {
                        p pVar = new p(4);
                        pVar.a.add(t2);
                        pVar.a(objArr);
                        m0.n.b.i.e(iArr, "$this$toTypedArray");
                        Integer[] numArr = new Integer[i2];
                        for (int i7 = 0; i7 < i2; i7++) {
                            numArr[i7] = Integer.valueOf(iArr[i7]);
                        }
                        pVar.a(numArr);
                        pVar.a.add((Object) null);
                        T invoke = method.invoke((Object) null, pVar.a.toArray(new Object[pVar.b()]));
                        Objects.requireNonNull(invoke, "null cannot be cast to non-null type T");
                        return (j) invoke;
                    }
                }
            } else {
                i++;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @RecentlyNonNull
    public static ArrayList<String> P(@RecentlyNonNull Parcel parcel, int i) {
        int I1 = I1(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I1 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + I1);
        return createStringArrayList;
    }

    public static final void P0(ImageView imageView, Uri uri) {
        m0.n.b.i.e(imageView, "<this>");
        Q0(imageView, String.valueOf(uri));
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <TInput, TResult, TException extends java.lang.Throwable> TResult P1(int r5, TInput r6, i0.h.a.a.h.b<TInput, TResult, TException> r7, i0.h.a.a.i.r.a<TInput, TResult> r8) throws java.lang.Throwable {
        /*
            r8 = 1
            if (r5 >= r8) goto L_0x0008
            java.lang.Object r5 = r7.a(r6)
            return r5
        L_0x0008:
            java.lang.Object r0 = r7.a(r6)
            i0.h.a.a.h.d$a r6 = (i0.h.a.a.h.d.a) r6
            r1 = r0
            i0.h.a.a.h.d$b r1 = (i0.h.a.a.h.d.b) r1
            java.net.URL r2 = r1.b
            if (r2 == 0) goto L_0x0029
            java.lang.String r3 = "CctTransportBackend"
            java.lang.String r4 = "Following redirect to: %s"
            S(r3, r4, r2)
            java.net.URL r1 = r1.b
            i0.h.a.a.h.d$a r2 = new i0.h.a.a.h.d$a
            i0.h.a.a.h.e.o r3 = r6.b
            java.lang.String r6 = r6.c
            r2.<init>(r1, r3, r6)
            r6 = r2
            goto L_0x002a
        L_0x0029:
            r6 = 0
        L_0x002a:
            if (r6 == 0) goto L_0x0030
            int r5 = r5 + -1
            if (r5 >= r8) goto L_0x0008
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b0.v.P1(int, java.lang.Object, i0.h.a.a.h.b, i0.h.a.a.i.r.a):java.lang.Object");
    }

    @RecentlyNonNull
    public static <T> T[] Q(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int I1 = I1(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I1 == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + I1);
        return createTypedArray;
    }

    public static final void Q0(ImageView imageView, String str) {
        m0.n.b.i.e(imageView, "<this>");
        Picasso d2 = ((e) h.K0(imageView.getContext().getApplicationContext(), e.class)).d();
        if (str == null || str.length() == 0) {
            d2.b(imageView);
            imageView.setImageDrawable((Drawable) null);
            return;
        }
        u e2 = d2.e(str);
        e2.d = true;
        e2.b(imageView, (i0.o.a.e) null);
    }

    public static final boolean Q1(c cVar, c cVar2) {
        m0.n.b.i.e(cVar, "<this>");
        return (cVar instanceof c.f) && (cVar2 instanceof c.f) && ((c.f) cVar).c() == ((c.f) cVar2).c();
    }

    @RecentlyNonNull
    public static <T> ArrayList<T> R(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int I1 = I1(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I1 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + I1);
        return createTypedArrayList;
    }

    public static final void R0(AvatarView avatarView, String str, String str2, float f) {
        m0.n.b.i.e(avatarView, "<this>");
        Q0(avatarView, str);
        avatarView.setSquareness(f);
        if (str2 == null) {
            str2 = "";
        }
        avatarView.setText(AvatarView.c.a(str2));
    }

    public static final Uri R1(Fragment fragment) {
        Uri uri;
        m0.n.b.i.e(fragment, "<this>");
        String str = "Screenshot_" + System.currentTimeMillis() + ".jpg";
        h0.q.p viewLifecycleOwner = fragment.getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.E2(new n0.a.h2.f(((LifecycleCoroutineScopeImpl) q.a(viewLifecycleOwner)).d.plus(m0.c)), (m0.l.e) null, (CoroutineStart) null, new FragmentExtensionsKt$saveScreenIntoCache$1(fragment, str, (m0.l.c<? super FragmentExtensionsKt$saveScreenIntoCache$1>) null), 3, (Object) null);
        Context requireContext = fragment.requireContext();
        m0.n.b.i.d(requireContext, "requireContext()");
        m0.n.b.i.e(requireContext, "context");
        m0.n.b.i.e(str, "fileName");
        File externalCacheDir = requireContext.getExternalCacheDir();
        if (externalCacheDir == null) {
            uri = null;
        } else {
            uri = Uri.fromFile(new File(externalCacheDir.getPath(), str));
        }
        if (uri == null) {
            return null;
        }
        return uri;
    }

    public static void S(String str, String str2, Object obj) {
        Log.d(s0(str), String.format(str2, new Object[]{obj}));
    }

    public static /* synthetic */ void S0(AvatarView avatarView, String str, String str2, float f, int i) {
        if ((i & 4) != 0) {
            f = 0.68f;
        }
        R0(avatarView, str, str2, f);
    }

    public static final void S1(o oVar, EpoxyRecyclerView epoxyRecyclerView) {
        m0.n.b.i.e(oVar, "<this>");
        m0.n.b.i.e(epoxyRecyclerView, "view");
        oVar.getAdapter().registerAdapterDataObserver(new i0.e.b.g3.m.f.b(epoxyRecyclerView));
    }

    public static void T(String str, String str2, Object... objArr) {
        Log.d(s0(str), String.format(str2, objArr));
    }

    public static final void T0(Object obj, String str, Object... objArr) {
        m0.n.b.i.f(obj, "$this$log");
        m0.n.b.i.f(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        m0.n.b.i.f(objArr, "args");
    }

    public static final void T1(o oVar, EpoxyRecyclerView epoxyRecyclerView) {
        m0.n.b.i.e(oVar, "<this>");
        m0.n.b.i.e(epoxyRecyclerView, "view");
        oVar.getAdapter().registerAdapterDataObserver(new i0.e.b.g3.m.f.c(epoxyRecyclerView));
    }

    public static final String U(OffsetDateTime offsetDateTime, Context context) {
        m0.n.b.i.e(offsetDateTime, "<this>");
        m0.n.b.i.e(context, "context");
        long m2 = m2(offsetDateTime);
        int abs = Math.abs((int) ((System.currentTimeMillis() - m2) / ((long) 1000)));
        if (abs < 60) {
            String string = context.getResources().getString(com.clubhouse.android.core.R.string.sec_ago, new Object[]{Integer.valueOf(abs)});
            m0.n.b.i.d(string, "context.resources.getString(R.string.sec_ago, diffInSec)");
            return string;
        }
        int i = abs / 3600;
        if (i < 1) {
            String string2 = context.getResources().getString(com.clubhouse.android.core.R.string.min_ago, new Object[]{Integer.valueOf(abs / 60)});
            m0.n.b.i.d(string2, "context.resources.getString(R.string.min_ago, (diffInSec / minute))");
            return string2;
        }
        int i2 = abs / 86400;
        if (i2 < 1) {
            String string3 = context.getResources().getString(com.clubhouse.android.core.R.string.hour_ago, new Object[]{Integer.valueOf(i)});
            m0.n.b.i.d(string3, "context.resources.getString(R.string.hour_ago, (diffInSec / hour))");
            return string3;
        }
        int i3 = abs / 604800;
        if (i3 < 1) {
            String string4 = context.getResources().getString(com.clubhouse.android.core.R.string.day_ago, new Object[]{Integer.valueOf(i2)});
            m0.n.b.i.d(string4, "context.resources.getString(R.string.day_ago, (diffInSec / day))");
            return string4;
        }
        int i4 = abs / 2592000;
        if (i4 < 1) {
            String string5 = context.getResources().getString(com.clubhouse.android.core.R.string.week_ago, new Object[]{Integer.valueOf(i3)});
            m0.n.b.i.d(string5, "context.resources.getString(R.string.week_ago, (diffInSec / week))");
            return string5;
        } else if (abs / 31104000 < 1) {
            String string6 = context.getResources().getString(com.clubhouse.android.core.R.string.month_ago, new Object[]{Integer.valueOf(i4)});
            m0.n.b.i.d(string6, "context.resources.getString(R.string.month_ago, (diffInSec / month))");
            return string6;
        } else {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(m2);
            String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", g0.a.b.b.a.L(context.getResources().getConfiguration()).b(0)).format(instance.getTime());
            m0.n.b.i.d(format, "formatBefore.format(calendar.time)");
            return format;
        }
    }

    public static final boolean U0(Fragment fragment, NavController navController) {
        Integer num;
        Object obj;
        m0.n.b.i.e(fragment, "<this>");
        m0.n.b.i.e(navController, "navController");
        h0.t.k d2 = navController.d();
        if (d2 == null) {
            num = null;
        } else {
            num = Integer.valueOf(d2.q);
        }
        View view = fragment.getView();
        if (view == null || (obj = view.getTag(com.clubhouse.android.core.R.id.tag_navigation_destination_id)) == null) {
            obj = num;
        }
        if (m0.n.b.i.a(num, obj)) {
            View view2 = fragment.getView();
            if (view2 == null) {
                return true;
            }
            view2.setTag(com.clubhouse.android.core.R.id.tag_navigation_destination_id, obj);
            return true;
        }
        v0.a.a.d.d("May not navigate: current destination is not the current fragment.", new Object[0]);
        return false;
    }

    public static final void U1(BottomSheetDialogFragment bottomSheetDialogFragment) {
        View view;
        m0.n.b.i.e(bottomSheetDialogFragment, "<this>");
        Dialog dialog = bottomSheetDialogFragment.e2;
        if (dialog == null) {
            view = null;
        } else {
            view = dialog.findViewById(com.clubhouse.android.core.R.id.design_bottom_sheet);
        }
        if (view != null) {
            h0.q.p viewLifecycleOwner = bottomSheetDialogFragment.getViewLifecycleOwner();
            m0.n.b.i.d(viewLifecycleOwner, "viewLifecycleOwner");
            i0.e.b.d3.j jVar = new i0.e.b.d3.j(view, view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(jVar);
            viewLifecycleOwner.getLifecycle().a(new ViewUtil$onGlobalLayout$$inlined$observeDestroy$1(view, jVar));
        }
    }

    public static final void V(Fragment fragment) {
        m0.n.b.i.e(fragment, "<this>");
        OnBackPressedDispatcher onBackPressedDispatcher = fragment.requireActivity().getOnBackPressedDispatcher();
        m0.n.b.i.d(onBackPressedDispatcher, "requireActivity().onBackPressedDispatcher");
        g0.a.b.b.a.a(onBackPressedDispatcher, fragment, false, FragmentExtensionsKt$disableBackPress$1.c, 2);
    }

    public static ParameterizedType V0(Type type) {
        if (type instanceof ParameterizedType) {
            return (ParameterizedType) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return V0(upperBounds[0]);
            }
        }
        return null;
    }

    public static final <T> void V1(Fragment fragment, String str, T t) {
        h0.t.f fVar;
        f0 a2;
        m0.n.b.i.e(fragment, "<this>");
        m0.n.b.i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        Iterator<h0.t.f> descendingIterator = NavHostFragment.I0(fragment).h.descendingIterator();
        if (descendingIterator.hasNext()) {
            descendingIterator.next();
        }
        while (true) {
            if (!descendingIterator.hasNext()) {
                fVar = null;
                break;
            }
            fVar = descendingIterator.next();
            if (!(fVar.d instanceof m)) {
                break;
            }
        }
        if (fVar != null && (a2 = fVar.a()) != null) {
            a2.b(str, t);
        }
    }

    public static final CharSequence W(c.b bVar, Resources resources) {
        m0.n.b.i.e(bVar, "<this>");
        m0.n.b.i.e(resources, "res");
        int i = R.string.member_added;
        Object[] objArr = {bVar.d.Y1, bVar.e.Y1};
        ArrayList i1 = i0.d.a.a.a.i1(resources, "<this>", objArr, "rawArgs", 2);
        for (int i2 = 0; i2 < 2; i2++) {
            Object obj = objArr[i2];
            if (obj instanceof String) {
                String str = (String) obj;
                obj = i0.d.a.a.a.p0(str, "<this>", str, 63);
            }
            i1.add(obj);
        }
        String string = resources.getString(i);
        m0.n.b.i.d(string, "getString(id)");
        Object[] array = i1.toArray(new Object[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        Object[] copyOf = Arrays.copyOf(array, array.length);
        return i0.d.a.a.a.L(copyOf, copyOf.length, string, "java.lang.String.format(format, *args)", 63, "fromHtml(\n            String.format(getString(id), *args.toTypedArray()),\n            HtmlCompat.FROM_HTML_MODE_COMPACT\n        )");
    }

    public static TypeVariable<?> W0(Type type) {
        if (type instanceof TypeVariable) {
            return (TypeVariable) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return W0(upperBounds[0]);
            }
        }
        return null;
    }

    public static final void W1(View view, int i) {
        m0.n.b.i.e(view, "$this$setPaddingBottom");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public static final CharSequence X(c.C0216c cVar, Resources resources) {
        m0.n.b.i.e(cVar, "<this>");
        m0.n.b.i.e(resources, "res");
        int i = R.string.member_removed;
        Object[] objArr = {cVar.d.Y1, cVar.e.Y1};
        ArrayList i1 = i0.d.a.a.a.i1(resources, "<this>", objArr, "rawArgs", 2);
        for (int i2 = 0; i2 < 2; i2++) {
            Object obj = objArr[i2];
            if (obj instanceof String) {
                String str = (String) obj;
                obj = i0.d.a.a.a.p0(str, "<this>", str, 63);
            }
            i1.add(obj);
        }
        String string = resources.getString(i);
        m0.n.b.i.d(string, "getString(id)");
        Object[] array = i1.toArray(new Object[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        Object[] copyOf = Arrays.copyOf(array, array.length);
        return i0.d.a.a.a.L(copyOf, copyOf.length, string, "java.lang.String.format(format, *args)", 63, "fromHtml(\n            String.format(getString(id), *args.toTypedArray()),\n            HtmlCompat.FROM_HTML_MODE_COMPACT\n        )");
    }

    public static final ClubMembership X0(ClubWithAdmin clubWithAdmin) {
        m0.n.b.i.e(clubWithAdmin, "<this>");
        if (clubWithAdmin.c || clubWithAdmin.d || clubWithAdmin.q) {
            return ClubMembership.Joined;
        }
        return ClubMembership.None;
    }

    public static <TResult> void X1(@RecentlyNonNull Status status, TResult tresult, @RecentlyNonNull i0.h.a.b.m.h<TResult> hVar) {
        if (status.I0()) {
            hVar.a.q(tresult);
            return;
        }
        hVar.a.p(new ApiException(status));
    }

    public static final Duration Y(c cVar, c cVar2) {
        m0.n.b.i.e(cVar, "<this>");
        OffsetDateTime f = cVar.f();
        OffsetDateTime f2 = cVar2 == null ? null : cVar2.f();
        if (f2 == null) {
            f2 = cVar.f();
        }
        return Duration.between(f, f2).abs();
    }

    public static String Y0(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static final long Y1(Resources resources) {
        m0.n.b.i.e(resources, "<this>");
        return (long) resources.getInteger(17694720);
    }

    public static void Z(String str, String str2, Throwable th) {
        Log.e(s0(str), str2, th);
    }

    public static final void Z0(Fragment fragment, h0.t.l lVar, h0.t.q qVar) {
        m0.n.b.i.e(fragment, "<this>");
        m0.n.b.i.e(lVar, "directions");
        m0.n.b.i.f(fragment, "$this$findNavController");
        NavController I0 = NavHostFragment.I0(fragment);
        m0.n.b.i.b(I0, "NavHostFragment.findNavController(this)");
        if (U0(fragment, I0)) {
            try {
                I0.h(lVar.b(), lVar.a(), qVar, (s.a) null);
            } catch (Throwable th) {
                h.l0(th);
            }
        }
    }

    public static boolean Z1(Object obj, Collection<String> collection, Collection<String> collection2) {
        if (collection == null && collection2 == null) {
            return false;
        }
        if (collection2 == null) {
            return collection.contains(obj);
        }
        if (collection == null) {
            return !collection2.contains(obj);
        }
        if (!collection2.contains(obj) || collection.contains(obj)) {
            return true;
        }
        return false;
    }

    public static final <T extends Fragment> Object a(T t) {
        m0.n.b.i.e(t, "$this$_fragmentArgsProvider");
        Bundle arguments = t.getArguments();
        if (arguments != null) {
            return arguments.get("mavericks:arg");
        }
        return null;
    }

    public static void a0(@RecentlyNonNull Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new SafeParcelReader$ParseException(i0.d.a.a.a.Q(37, "Overread allowed size end=", i), parcel);
        }
    }

    public static /* synthetic */ void a1(Fragment fragment, h0.t.l lVar, h0.t.q qVar, int i) {
        int i2 = i & 2;
        Z0(fragment, lVar, (h0.t.q) null);
    }

    public static final void a2(Fragment fragment, Parcelable parcelable) {
        m0.n.b.i.e(fragment, "<this>");
        f(fragment, FragmentName.BACKCHANNEL_INBOX, parcelable);
    }

    public static f1 b(MavericksViewModel mavericksViewModel, h0.q.p pVar, DeliveryMode deliveryMode, m0.n.a.p pVar2, int i) {
        i0.b.b.c0 c0Var = (i & 2) != 0 ? i0.b.b.c0.a : null;
        m0.n.b.i.e(mavericksViewModel, "$this$_internal");
        m0.n.b.i.e(c0Var, "deliveryMode");
        m0.n.b.i.e(pVar2, "action");
        return mavericksViewModel.l(mavericksViewModel.h(), pVar, c0Var, pVar2);
    }

    public static final d b0(i0.e.b.z2.e.a aVar) {
        m0.n.b.i.e(aVar, "<this>");
        Object L0 = h.L0(aVar, d.class);
        m0.n.b.i.d(L0, "get(this, ChannelEntryPoint::class.java)");
        return (d) L0;
    }

    public static final void b1(Fragment fragment, OnboardingDestination onboardingDestination) {
        m0.n.b.i.e(fragment, "<this>");
        m0.n.b.i.e(onboardingDestination, "destination");
        Uri parse = Uri.parse(onboardingDestination.getUri());
        m0.n.b.i.d(parse, "parse(destination.uri)");
        h0.t.q qVar = new h0.t.q(false, -1, false, com.clubhouse.android.data.R.anim.slide_left, com.clubhouse.android.data.R.anim.slide_out_left, com.clubhouse.android.data.R.anim.slide_in_right, com.clubhouse.android.data.R.anim.slide_right);
        m0.n.b.i.e(fragment, "<this>");
        m0.n.b.i.e(parse, "deepLink");
        m0.n.b.i.f(fragment, "$this$findNavController");
        NavController I0 = NavHostFragment.I0(fragment);
        m0.n.b.i.b(I0, "NavHostFragment.findNavController(this)");
        if (U0(fragment, I0)) {
            try {
                I0.i(new h0.t.j(parse, (String) null, (String) null), qVar, (s.a) null);
            } catch (Throwable th) {
                h.l0(th);
            }
        }
    }

    public static final void b2(BaseBottomSheetFragment baseBottomSheetFragment, l<? super i0.e.b.a3.f.j, i> lVar) {
        m0.n.b.i.e(baseBottomSheetFragment, "<this>");
        m0.n.b.i.e(lVar, "action");
        i0.e.b.a3.f.b bVar = baseBottomSheetFragment.k2;
        if (bVar != null) {
            i0.e.b.a3.f.j create = bVar.create();
            lVar.invoke(create);
            create.a();
            return;
        }
        m0.n.b.i.m("bannerHandler");
        throw null;
    }

    public static final <VM extends MavericksViewModel<S>, S extends j, A> f1 c(VM vm, h0.q.p pVar, m0.r.m<S, ? extends A> mVar, DeliveryMode deliveryMode, m0.n.a.p<? super A, ? super m0.l.c<? super i>, ? extends Object> pVar2) {
        m0.n.b.i.e(vm, "$this$_internal1");
        m0.n.b.i.e(mVar, "prop1");
        m0.n.b.i.e(deliveryMode, "deliveryMode");
        m0.n.b.i.e(pVar2, "action");
        return vm.l(m0.r.t.a.r.m.a1.a.f1(new MavericksViewModelExtensionsKt$_internal1$$inlined$map$1(vm.h(), mVar)), pVar, deliveryMode.a(mVar), new MavericksViewModelExtensionsKt$_internal1$2(pVar2, (m0.l.c) null));
    }

    public static boolean c0(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final void c1(Fragment fragment) {
        m0.n.b.i.e(fragment, "<this>");
        m0.n.b.i.f(fragment, "$this$findNavController");
        NavController I0 = NavHostFragment.I0(fragment);
        m0.n.b.i.b(I0, "NavHostFragment.findNavController(this)");
        I0.k();
    }

    public static final void c2(BaseFragment baseFragment, l<? super i0.e.b.a3.f.j, i> lVar) {
        m0.n.b.i.e(baseFragment, "<this>");
        m0.n.b.i.e(lVar, "action");
        i0.e.b.a3.f.j create = baseFragment.I0().create();
        lVar.invoke(create);
        create.a();
    }

    public static final <VM extends MavericksViewModel<S>, S extends j, A, B> f1 d(VM vm, h0.q.p pVar, m0.r.m<S, ? extends A> mVar, m0.r.m<S, ? extends B> mVar2, DeliveryMode deliveryMode, m0.n.a.q<? super A, ? super B, ? super m0.l.c<? super i>, ? extends Object> qVar) {
        m0.n.b.i.e(vm, "$this$_internal2");
        m0.n.b.i.e(mVar, "prop1");
        m0.n.b.i.e(mVar2, "prop2");
        m0.n.b.i.e(deliveryMode, "deliveryMode");
        m0.n.b.i.e(qVar, "action");
        return vm.l(m0.r.t.a.r.m.a1.a.f1(new MavericksViewModelExtensionsKt$_internal2$$inlined$map$1(vm.h(), mVar, mVar2)), pVar, deliveryMode.a(mVar, mVar2), new MavericksViewModelExtensionsKt$_internal2$2(qVar, (m0.l.c) null));
    }

    public static final boolean d0(Set<? extends Permission> set, Set<? extends Permission> set2) {
        m0.n.b.i.f(set, "$this$equalsPermissions");
        m0.n.b.i.f(set2, "permissions");
        if (set.size() != set2.size()) {
            return false;
        }
        int i = 0;
        for (Permission value : set) {
            if (!m0.n.b.i.a(value.getValue(), ((Permission) g.n(set2, i)).getValue())) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static final void d1(Fragment fragment, int i) {
        m0.n.b.i.e(fragment, "<this>");
        m0.n.b.i.f(fragment, "$this$findNavController");
        NavController I0 = NavHostFragment.I0(fragment);
        m0.n.b.i.b(I0, "NavHostFragment.findNavController(this)");
        I0.m(i, false);
    }

    public static final void d2(Fragment fragment, Context context, String str, l<? super String, i> lVar, m0.n.a.a<i> aVar) {
        m0.n.b.i.e(fragment, "fragment");
        m0.n.b.i.e(context, "context");
        m0.n.b.i.e(str, "clubName");
        m0.n.b.i.e(lVar, "positiveAction");
        m0.n.b.i.e(aVar, "negativeAction");
        Resources resources = context.getResources();
        DialogEditTextBinding inflate = DialogEditTextBinding.inflate(fragment.getLayoutInflater());
        m0.n.b.i.d(inflate, "inflate(fragment.layoutInflater)");
        ClubDialogUtilKt$showJoinClubReasonDialog$1 clubDialogUtilKt$showJoinClubReasonDialog$1 = new ClubDialogUtilKt$showJoinClubReasonDialog$1(resources, str, inflate, lVar, aVar);
        m0.n.b.i.e(fragment, "<this>");
        m0.n.b.i.e(clubDialogUtilKt$showJoinClubReasonDialog$1, "f");
        d.a aVar2 = new d.a(fragment.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
        clubDialogUtilKt$showJoinClubReasonDialog$1.invoke(aVar2);
        aVar2.g();
    }

    public static final void e(Fragment fragment, l<? super ActionSheetBuilder, i> lVar) {
        m0.n.b.i.e(fragment, "<this>");
        m0.n.b.i.e(lVar, "f");
        G(fragment, new ActionSheetFragmentKt$actionSheet$1(lVar));
    }

    public static final <VM extends MavericksViewModel<?>> Class<? extends i0.b.b.v<VM, ?>> e0(Class<VM> cls) {
        Class<? extends i0.b.b.v<VM, ?>> cls2;
        m0.n.b.i.e(cls, "$this$factoryCompanion");
        Class<? extends i0.b.b.v<VM, ?>>[] declaredClasses = cls.getDeclaredClasses();
        m0.n.b.i.d(declaredClasses, "declaredClasses");
        int length = declaredClasses.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i];
            if (i0.b.b.v.class.isAssignableFrom(cls2)) {
                break;
            }
            i++;
        }
        if (cls2 != null) {
            return cls2;
        }
        return null;
    }

    public static final i0.e.b.g3.l.y2.a e1(i0.e.b.g3.l.y2.a aVar, ClubWithAdmin clubWithAdmin) {
        m0.n.b.i.e(aVar, "<this>");
        m0.n.b.i.e(clubWithAdmin, "club");
        if (aVar instanceof a.b) {
            if (!clubWithAdmin.f2) {
                return new a.C0201a(false, 1);
            }
            return new a.c(false, !clubWithAdmin.e2, 1);
        } else if (!(aVar instanceof a.c)) {
            if (aVar instanceof a.d ? true : aVar instanceof a.C0201a) {
                return new a.C0201a(false, 1);
            }
            throw new NoWhenBranchMatchedException();
        } else if (clubWithAdmin.e2) {
            return new a.d(false, 1);
        } else {
            return new a.C0201a(false, 1);
        }
    }

    public static final void e2(BaseBottomSheetFragment baseBottomSheetFragment, l<? super i0.e.b.a3.f.j, i> lVar) {
        m0.n.b.i.e(baseBottomSheetFragment, "<this>");
        m0.n.b.i.e(lVar, "action");
        i0.e.b.a3.f.b bVar = baseBottomSheetFragment.k2;
        if (bVar != null) {
            i0.e.b.a3.f.j create = bVar.create();
            create.h(Banner.Style.Negative);
            lVar.invoke(create);
            create.a();
            return;
        }
        m0.n.b.i.m("bannerHandler");
        throw null;
    }

    public static final void f(Fragment fragment, FragmentName fragmentName, Parcelable parcelable) {
        m0.n.b.i.e(fragment, "<this>");
        m0.n.b.i.e(fragmentName, "fragmentName");
        Object K0 = h.K0(fragment.requireContext().getApplicationContext(), i0.e.b.c3.c.class);
        m0.n.b.i.d(K0, "fromApplication(\n        requireContext().applicationContext,\n        FragmentKeysEntryPoint::class.java\n    )");
        G(fragment, new FragmentKeyKt$addFragment$1$1(h0((i0.e.b.c3.c) K0, fragmentName), parcelable));
    }

    public static String f0(User user) {
        m0.n.b.i.e(user, "this");
        String name = user.getName();
        if (name == null) {
            return null;
        }
        return (String) StringsKt__IndentKt.D(name, new char[]{' '}, false, 0, 6).get(0);
    }

    public static final <T> n0.a.g2.d<i0.e.b.g3.m.f.d> f1(PagingDataEpoxyController<T> pagingDataEpoxyController) {
        m0.n.b.i.e(pagingDataEpoxyController, "<this>");
        return m0.r.t.a.r.m.a1.a.K2(new PagingDataEpoxyControllerExtensionsKt$observeState$$inlined$map$1(pagingDataEpoxyController.getLoadStateFlow(), pagingDataEpoxyController), m0.r.t.a.r.m.a1.a.k0(new PagingDataEpoxyControllerExtensionsKt$observeState$modelBuild$1(pagingDataEpoxyController, (m0.l.c<? super PagingDataEpoxyControllerExtensionsKt$observeState$modelBuild$1>) null)));
    }

    public static final void f2(BaseFragment baseFragment, l<? super i0.e.b.a3.f.j, i> lVar) {
        m0.n.b.i.e(baseFragment, "<this>");
        m0.n.b.i.e(lVar, "action");
        i0.e.b.a3.f.j create = baseFragment.I0().create();
        create.h(Banner.Style.Negative);
        lVar.invoke(create);
        create.a();
    }

    public static final void g(Fragment fragment, m0.n.a.p<? super Boolean, ? super Integer, i> pVar) {
        m0.n.b.i.e(fragment, "<this>");
        m0.n.b.i.e(pVar, "callback");
        Lifecycle lifecycle = fragment.getLifecycle();
        m0.n.b.i.d(lifecycle, "this.lifecycle");
        View findViewById = fragment.requireActivity().findViewById(16908290);
        Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        View childAt = ((ViewGroup) findViewById).getChildAt(0);
        m0.n.b.i.d(childAt, "this.requireActivity().findViewById(android.R.id.content) as ViewGroup).getChildAt(0)");
        new KeyboardEventListener(lifecycle, childAt, pVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r1 = r2.getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String g0(com.clubhouse.android.user.model.User r2) {
        /*
            java.lang.String r0 = "this"
            m0.n.b.i.e(r2, r0)
            java.lang.String r0 = r2.I()
            if (r0 != 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            java.lang.String r1 = r2.getName()
            if (r1 != 0) goto L_0x0014
        L_0x0012:
            r0 = 0
            goto L_0x0020
        L_0x0014:
            java.lang.String r0 = kotlin.text.StringsKt__IndentKt.y(r1, r0)
            java.lang.CharSequence r0 = kotlin.text.StringsKt__IndentKt.X(r0)
            java.lang.String r0 = r0.toString()
        L_0x0020:
            if (r0 != 0) goto L_0x0026
            java.lang.String r0 = r2.getName()
        L_0x0026:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b0.v.g0(com.clubhouse.android.user.model.User):java.lang.String");
    }

    public static <S extends j, T> f1 g1(i0.b.b.q qVar, MavericksViewModel<S> mavericksViewModel, m0.r.m<S, ? extends i0.b.b.b<? extends T>> mVar, DeliveryMode deliveryMode, m0.n.a.p<? super Throwable, ? super m0.l.c<? super i>, ? extends Object> pVar, m0.n.a.p<? super T, ? super m0.l.c<? super i>, ? extends Object> pVar2) {
        m0.n.b.i.e(mavericksViewModel, "$this$onAsync");
        m0.n.b.i.e(mVar, "asyncProp");
        m0.n.b.i.e(deliveryMode, "deliveryMode");
        h0.q.p h02 = qVar.h0();
        m0.n.b.i.e(mavericksViewModel, "$this$_internalSF");
        m0.n.b.i.e(mVar, "asyncProp");
        m0.n.b.i.e(deliveryMode, "deliveryMode");
        return c(mavericksViewModel, h02, mVar, deliveryMode.a(mVar), new MavericksViewModelExtensionsKt$_internalSF$1(pVar2, pVar, (m0.l.c) null));
    }

    public static final void g2(Fragment fragment, Context context, String str, String str2, l<? super String, i> lVar, m0.n.a.a<i> aVar) {
        m0.n.b.i.e(fragment, "fragment");
        m0.n.b.i.e(context, "context");
        m0.n.b.i.e(str, "userName");
        m0.n.b.i.e(str2, "clubName");
        m0.n.b.i.e(lVar, "positiveAction");
        m0.n.b.i.e(aVar, "negativeAction");
        Resources resources = context.getResources();
        DialogEditTextBinding inflate = DialogEditTextBinding.inflate(fragment.getLayoutInflater());
        m0.n.b.i.d(inflate, "inflate(fragment.layoutInflater)");
        ClubDialogUtilKt$showNominationReasonDialog$1 clubDialogUtilKt$showNominationReasonDialog$1 = new ClubDialogUtilKt$showNominationReasonDialog$1(resources, str, str2, inflate, lVar, aVar);
        m0.n.b.i.e(fragment, "<this>");
        m0.n.b.i.e(clubDialogUtilKt$showNominationReasonDialog$1, "f");
        d.a aVar2 = new d.a(fragment.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
        clubDialogUtilKt$showNominationReasonDialog$1.invoke(aVar2);
        aVar2.g();
    }

    public static final i0.b.a.f h(i0.b.a.f fVar, Context context) {
        m0.n.b.i.e(fVar, "<this>");
        m0.n.b.i.e(context, "context");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.clubhouse.app.R.dimen.events_user_avatars_horizontal_padding);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(com.clubhouse.app.R.dimen.events_user_avatars_top_padding);
        i0.b.a.g gVar = (i0.b.a.g) fVar;
        gVar.G(new Carousel.Padding(dimensionPixelSize, dimensionPixelSize2, context.getResources().getDimensionPixelSize(com.clubhouse.app.R.dimen.events_user_avatars_horizontal_padding), 0, context.getResources().getDimensionPixelSize(com.clubhouse.app.R.dimen.events_user_avatars_item_spacing)));
        m0.n.b.i.d(gVar, "padding(\n        Carousel.Padding(\n            context.resources.getDimensionPixelSize(R.dimen.events_user_avatars_horizontal_padding),\n            context.resources.getDimensionPixelSize(R.dimen.events_user_avatars_top_padding),\n            context.resources.getDimensionPixelSize(R.dimen.events_user_avatars_horizontal_padding),\n            0,\n            context.resources.getDimensionPixelSize(R.dimen.events_user_avatars_item_spacing)\n        )\n    )");
        return gVar;
    }

    public static final Class<? extends Fragment> h0(i0.e.b.c3.c cVar, FragmentName fragmentName) {
        Class<? extends Fragment> cls;
        m0.r.d<? extends Fragment> dVar;
        m0.n.b.i.e(cVar, "<this>");
        m0.n.b.i.e(fragmentName, "fragmentName");
        i0.e.b.c3.b bVar = cVar.f().get(fragmentName);
        if (bVar == null || (dVar = bVar.a) == null) {
            cls = null;
        } else {
            cls = h.l1(dVar);
        }
        if (cls != null) {
            return cls;
        }
        throw new Exception(m0.n.b.i.k("Fragment class not found for ", fragmentName));
    }

    public static /* synthetic */ f1 h1(i0.b.b.q qVar, MavericksViewModel mavericksViewModel, m0.r.m mVar, DeliveryMode deliveryMode, m0.n.a.p pVar, m0.n.a.p pVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            deliveryMode = i0.b.b.c0.a;
        }
        return qVar.l0(mavericksViewModel, mVar, deliveryMode, (i & 4) != 0 ? null : pVar, (i & 8) != 0 ? null : pVar2);
    }

    public static final void h2(Fragment fragment) {
        View findFocus;
        m0.n.b.i.e(fragment, "<this>");
        k activity = fragment.getActivity();
        InputMethodManager inputMethodManager = (InputMethodManager) (activity == null ? null : activity.getSystemService("input_method"));
        View view = fragment.getView();
        if (view != null && (findFocus = view.findFocus()) != null && inputMethodManager != null) {
            inputMethodManager.showSoftInput(findFocus, 1);
        }
    }

    public static final void i(Context context, List<Topic> list, Set<Integer> set, ViewGroup viewGroup, int i, l<? super Topic, Boolean> lVar, l<? super Topic, i> lVar2) {
        m0.n.b.i.e(context, "<this>");
        m0.n.b.i.e(list, "topics");
        m0.n.b.i.e(set, "selected");
        m0.n.b.i.e(viewGroup, "mainTopicsListView");
        m0.n.b.i.e(lVar, "onAddedTopic");
        m0.n.b.i.e(lVar2, "onRemovedTopic");
        View inflate = LayoutInflater.from(context).inflate(com.clubhouse.app.R.layout.topic_item_container, viewGroup, false);
        Objects.requireNonNull(inflate, "null cannot be cast to non-null type com.airbnb.epoxy.EpoxyRecyclerView");
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate;
        epoxyRecyclerView.setPadding(i, epoxyRecyclerView.getPaddingTop(), epoxyRecyclerView.getPaddingRight(), epoxyRecyclerView.getPaddingBottom());
        epoxyRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(list.size() > 10 ? 3 : 2, 0));
        epoxyRecyclerView.setNestedScrollingEnabled(true);
        i0.e.b.d3.k.E(epoxyRecyclerView, new TopicFragmentUtilKt$addTopicsItems$1(list, set, lVar, lVar2));
        epoxyRecyclerView.g();
        viewGroup.addView(epoxyRecyclerView);
    }

    public static ApiException i0(@RecentlyNonNull Status status) {
        if (status.c2 != null) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }

    public static <S extends j, A> f1 i1(i0.b.b.q qVar, MavericksViewModel<S> mavericksViewModel, m0.r.m<S, ? extends A> mVar, DeliveryMode deliveryMode, m0.n.a.p<? super A, ? super m0.l.c<? super i>, ? extends Object> pVar) {
        m0.n.b.i.e(mavericksViewModel, "$this$onEach");
        m0.n.b.i.e(mVar, "prop1");
        m0.n.b.i.e(deliveryMode, "deliveryMode");
        m0.n.b.i.e(pVar, "action");
        return c(mavericksViewModel, qVar.h0(), mVar, deliveryMode, pVar);
    }

    public static void i2(@RecentlyNonNull Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + I1(parcel, i));
    }

    public static void j(Fragment fragment, List list, Set set, ViewGroup viewGroup, int i, l lVar, l lVar2, int i2) {
        if ((i2 & 8) != 0) {
            i = fragment.getResources().getDimensionPixelSize(com.clubhouse.app.R.dimen.common_row_horizontal_padding);
        }
        m0.n.b.i.e(fragment, "<this>");
        m0.n.b.i.e(list, "topics");
        m0.n.b.i.e(set, "selected");
        m0.n.b.i.e(viewGroup, "mainTopicsListView");
        m0.n.b.i.e(lVar, "onAddedTopic");
        m0.n.b.i.e(lVar2, "onRemovedTopic");
        Context requireContext = fragment.requireContext();
        m0.n.b.i.d(requireContext, "requireContext()");
        i(requireContext, list, set, viewGroup, i, lVar, lVar2);
    }

    public static final MessageBubbleStyle j0(c.f fVar) {
        m0.n.b.i.e(fVar, "<this>");
        if (fVar.a()) {
            int ordinal = fVar.b().ordinal();
            if (ordinal == 0) {
                return MessageBubbleStyle.MIDDLE_ALIGN_RIGHT;
            }
            if (ordinal == 1) {
                return MessageBubbleStyle.TOP_ALIGN_RIGHT;
            }
            if (ordinal == 2) {
                return MessageBubbleStyle.BOTTOM_ALIGN_RIGHT;
            }
            if (ordinal == 3) {
                return MessageBubbleStyle.ONLY;
            }
            throw new NoWhenBranchMatchedException();
        }
        int ordinal2 = fVar.b().ordinal();
        if (ordinal2 == 0) {
            return MessageBubbleStyle.MIDDLE_ALIGN_LEFT;
        }
        if (ordinal2 == 1) {
            return MessageBubbleStyle.TOP_ALIGN_LEFT;
        }
        if (ordinal2 == 2) {
            return MessageBubbleStyle.BOTTOM_ALIGN_LEFT;
        }
        if (ordinal2 == 3) {
            return MessageBubbleStyle.ONLY;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static <S extends j, A, B> f1 j1(i0.b.b.q qVar, MavericksViewModel<S> mavericksViewModel, m0.r.m<S, ? extends A> mVar, m0.r.m<S, ? extends B> mVar2, DeliveryMode deliveryMode, m0.n.a.q<? super A, ? super B, ? super m0.l.c<? super i>, ? extends Object> qVar2) {
        m0.n.b.i.e(mavericksViewModel, "$this$onEach");
        m0.n.b.i.e(mVar, "prop1");
        m0.n.b.i.e(mVar2, "prop2");
        m0.n.b.i.e(deliveryMode, "deliveryMode");
        m0.n.b.i.e(qVar2, "action");
        return d(mavericksViewModel, qVar.h0(), mVar, mVar2, deliveryMode, qVar2);
    }

    public static String j2(ChannelInRoom channelInRoom) {
        m0.n.b.i.e(channelInRoom, "this");
        List<UserInChannel> y = channelInRoom.y();
        ArrayList arrayList = new ArrayList();
        for (T next : y) {
            if (((UserInChannel) next).Y1) {
                arrayList.add(next);
            }
        }
        List<UserInChannel> p02 = g.p0(arrayList, 5);
        ArrayList arrayList2 = new ArrayList(h.K(p02, 10));
        for (UserInChannel userInChannel : p02) {
            arrayList2.add(userInChannel.e2);
        }
        return g.E(arrayList2, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);
    }

    public static final void k(Fragment fragment, String str, ViewGroup viewGroup) {
        m0.n.b.i.e(fragment, "<this>");
        m0.n.b.i.e(str, InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE);
        m0.n.b.i.e(viewGroup, "mainTopicsListView");
        View inflate = fragment.getLayoutInflater().inflate(com.clubhouse.app.R.layout.topic_title, viewGroup, false);
        Objects.requireNonNull(inflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) inflate;
        textView.setText(str);
        viewGroup.addView(textView);
    }

    public static Object k0(JavaType javaType) {
        Class<?> cls = javaType.c;
        Class<?> F = f.F(cls);
        if (F != null) {
            if (F == Integer.TYPE) {
                return 0;
            }
            if (F == Long.TYPE) {
                return 0L;
            }
            if (F == Boolean.TYPE) {
                return Boolean.FALSE;
            }
            if (F == Double.TYPE) {
                return Double.valueOf(0.0d);
            }
            if (F == Float.TYPE) {
                return Float.valueOf(0.0f);
            }
            if (F == Byte.TYPE) {
                return (byte) 0;
            }
            if (F == Short.TYPE) {
                return (short) 0;
            }
            if (F == Character.TYPE) {
                return 0;
            }
            throw new IllegalArgumentException(i0.d.a.a.a.Y(F, i0.d.a.a.a.P0("Class "), " is not a primitive type"));
        } else if (javaType.G() || javaType.d()) {
            return JsonInclude.Include.NON_EMPTY;
        } else {
            if (cls == String.class) {
                return "";
            }
            if (javaType.T(Date.class)) {
                return new Date(0);
            }
            if (!javaType.T(Calendar.class)) {
                return null;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(0);
            return gregorianCalendar;
        }
    }

    public static <S extends j, A, B, C, D> f1 k1(i0.b.b.q qVar, MavericksViewModel<S> mavericksViewModel, m0.r.m<S, ? extends A> mVar, m0.r.m<S, ? extends B> mVar2, m0.r.m<S, ? extends C> mVar3, m0.r.m<S, ? extends D> mVar4, DeliveryMode deliveryMode, m0.n.a.s<? super A, ? super B, ? super C, ? super D, ? super m0.l.c<? super i>, ? extends Object> sVar) {
        MavericksViewModel<S> mavericksViewModel2 = mavericksViewModel;
        m0.r.m<S, ? extends A> mVar5 = mVar;
        m0.r.m<S, ? extends B> mVar6 = mVar2;
        m0.r.m<S, ? extends C> mVar7 = mVar3;
        m0.r.m<S, ? extends D> mVar8 = mVar4;
        DeliveryMode deliveryMode2 = deliveryMode;
        m0.n.a.s<? super A, ? super B, ? super C, ? super D, ? super m0.l.c<? super i>, ? extends Object> sVar2 = sVar;
        m0.n.b.i.e(mavericksViewModel2, "$this$onEach");
        m0.n.b.i.e(mVar5, "prop1");
        m0.n.b.i.e(mVar6, "prop2");
        m0.n.b.i.e(mVar7, "prop3");
        m0.n.b.i.e(mVar8, "prop4");
        m0.n.b.i.e(deliveryMode2, "deliveryMode");
        m0.n.b.i.e(sVar2, "action");
        h0.q.p h02 = qVar.h0();
        m0.n.b.i.e(mavericksViewModel2, "$this$_internal4");
        m0.n.b.i.e(mVar5, "prop1");
        m0.n.b.i.e(mVar6, "prop2");
        m0.n.b.i.e(mVar7, "prop3");
        m0.n.b.i.e(mVar8, "prop4");
        m0.n.b.i.e(deliveryMode2, "deliveryMode");
        m0.n.b.i.e(sVar2, "action");
        return mavericksViewModel2.l(m0.r.t.a.r.m.a1.a.f1(new MavericksViewModelExtensionsKt$_internal4$$inlined$map$1(mavericksViewModel.h(), mVar, mVar2, mVar3, mVar4)), h02, deliveryMode2.a(mVar5, mVar6, mVar7, mVar8), new MavericksViewModelExtensionsKt$_internal4$2(sVar2, (m0.l.c) null));
    }

    public static final <T> void k2(T t, l<? super T, PermissionFragment> lVar, Permission[] permissionArr, int i, i0.a.a.f.d dVar, RationaleHandler rationaleHandler, l<? super AssentResult, i> lVar2) {
        T t2 = t;
        Permission[] permissionArr2 = permissionArr;
        int i2 = i;
        i0.a.a.f.d dVar2 = dVar;
        RationaleHandler rationaleHandler2 = rationaleHandler;
        l<? super AssentResult, i> lVar3 = lVar2;
        m0.n.b.i.f(t2, "$this$startPermissionRequest");
        m0.n.b.i.f(lVar, "ensure");
        m0.n.b.i.f(permissionArr2, "permissions");
        m0.n.b.i.f(dVar2, "shouldShowRationale");
        m0.n.b.i.f(lVar3, "callback");
        Object[] objArr = {h.E2(permissionArr, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 63)};
        m0.n.b.i.f(t2, "$this$log");
        m0.n.b.i.f("startPermissionRequest(%s)", InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        m0.n.b.i.f(objArr, "args");
        for (Permission a2 : permissionArr2) {
            ((i0.a.a.f.c) dVar2).a(a2);
        }
        if (rationaleHandler2 != null) {
            m0.n.b.i.f(permissionArr2, "permissions");
            m0.n.b.i.f(lVar3, "finalCallback");
            m0.o.d dVar3 = rationaleHandler2.c;
            m0.r.k[] kVarArr = RationaleHandler.a;
            dVar3.setValue(rationaleHandler2, kVarArr[0], Integer.valueOf(i));
            rationaleHandler2.d.setValue(rationaleHandler2, kVarArr[1], lVar3);
            ArrayList arrayList = new ArrayList();
            for (Permission permission : permissionArr2) {
                if (rationaleHandler2.g.a(permission) || rationaleHandler2.g.b(permission)) {
                    arrayList.add(permission);
                }
            }
            rationaleHandler2.e.setValue(rationaleHandler2, RationaleHandler.a[2], g.C0(arrayList));
            ArrayList arrayList2 = new ArrayList();
            for (Permission permission2 : permissionArr2) {
                if (!rationaleHandler2.g.a(permission2)) {
                    arrayList2.add(permission2);
                }
            }
            Object[] objArr2 = {Integer.valueOf(rationaleHandler.b().size()), g.E(rationaleHandler.b(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 63)};
            m0.n.b.i.f(rationaleHandler2, "$this$log");
            m0.n.b.i.f("Found %d permissions that DO require a rationale: %s", InstabugDbContract.BugEntry.COLUMN_MESSAGE);
            m0.n.b.i.f(objArr2, "args");
            if (arrayList2.isEmpty()) {
                m0.n.b.i.f(rationaleHandler2, "$this$log");
                m0.n.b.i.f("No simple permissions to request", InstabugDbContract.BugEntry.COLUMN_MESSAGE);
                m0.n.b.i.f(new Object[0], "args");
                rationaleHandler.d();
                return;
            }
            r<Permission[], Integer, RationaleHandler, l<? super AssentResult, i>, i> rVar = rationaleHandler2.l;
            Object[] array = arrayList2.toArray(new Permission[0]);
            if (array != null) {
                rVar.h(array, Integer.valueOf(i), null, new RationaleHandler$requestPermissions$2(rationaleHandler2));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Assent assent = Assent.c;
        i0.a.a.e.a aVar = Assent.b().e;
        if (aVar != null) {
            Set<Permission> set = aVar.a;
            Permission[] permissionArr3 = (Permission[]) Arrays.copyOf(permissionArr2, permissionArr2.length);
            m0.n.b.i.f(set, "$this$equalsPermissions");
            m0.n.b.i.f(permissionArr3, "permissions");
            if (d0(set, h.n4(permissionArr3))) {
                Object[] objArr3 = {h.E2(permissionArr, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 63)};
                m0.n.b.i.f(t2, "$this$log");
                m0.n.b.i.f("Callback appended to existing matching request for %s", InstabugDbContract.BugEntry.COLUMN_MESSAGE);
                m0.n.b.i.f(objArr3, "args");
                aVar.c.add(lVar3);
                return;
            }
        }
        i0.a.a.e.a aVar2 = new i0.a.a.e.a(h.n4(permissionArr), i2, g.U(lVar3));
        if (aVar == null) {
            Assent.b().e = aVar2;
            m0.n.b.i.f(t2, "$this$log");
            m0.n.b.i.f("New request, performing now", InstabugDbContract.BugEntry.COLUMN_MESSAGE);
            m0.n.b.i.f(new Object[0], "args");
            lVar.invoke(t2).I0(aVar2);
            return;
        }
        if (aVar.b == i2) {
            aVar2.b = 1 + i2;
        }
        m0.n.b.i.f(t2, "$this$log");
        m0.n.b.i.f("New request queued for when the current is complete", InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        m0.n.b.i.f(new Object[0], "args");
        i0.a.a.e.b<i0.a.a.e.a> bVar = Assent.b().d;
        synchronized (bVar.b) {
            bVar.a.add(aVar2);
        }
    }

    public static final i0.e.a.a l(Fragment fragment) {
        m0.n.b.i.e(fragment, "<this>");
        return ((i0.e.b.c3.g.a) h.K0(fragment.requireContext().getApplicationContext(), i0.e.b.c3.g.a.class)).c();
    }

    public static final h0.t.l l0(i0.e.a.a aVar, CompletePhoneNumberAuthResponse completePhoneNumberAuthResponse, Boolean bool) {
        h0.t.l lVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        m0.n.b.i.e(aVar, "analytics");
        m0.n.b.i.e(completePhoneNumberAuthResponse, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        Boolean bool2 = completePhoneNumberAuthResponse.h;
        Boolean bool3 = Boolean.TRUE;
        if (m0.n.b.i.a(bool2, bool3)) {
            ((AmplitudeAnalytics) aVar).a("Onboarding-PhoneVerify-NewUser");
            if (w0(completePhoneNumberAuthResponse)) {
                boolean a2 = m0.n.b.i.a(bool, bool3);
                String str7 = null;
                if (a2) {
                    BasicUser basicUser = completePhoneNumberAuthResponse.j;
                    if (basicUser == null) {
                        str4 = null;
                    } else {
                        str4 = basicUser.d;
                    }
                    if (basicUser == null) {
                        str5 = null;
                    } else {
                        str5 = basicUser.x;
                    }
                    ClubWithAdmin clubWithAdmin = completePhoneNumberAuthResponse.k;
                    if (clubWithAdmin == null) {
                        str6 = null;
                    } else {
                        str6 = clubWithAdmin.y;
                    }
                    if (clubWithAdmin != null) {
                        str7 = clubWithAdmin.d2;
                    }
                    InvitedByFragment.BundleInfo bundleInfo = new InvitedByFragment.BundleInfo(str4, str5, str6, str7);
                    m0.n.b.i.e(bundleInfo, "mavericksArg");
                    return new k2(bundleInfo);
                }
                BasicUser basicUser2 = completePhoneNumberAuthResponse.j;
                if (basicUser2 == null) {
                    str = null;
                } else {
                    str = basicUser2.d;
                }
                if (basicUser2 == null) {
                    str2 = null;
                } else {
                    str2 = basicUser2.x;
                }
                ClubWithAdmin clubWithAdmin2 = completePhoneNumberAuthResponse.k;
                if (clubWithAdmin2 == null) {
                    str3 = null;
                } else {
                    str3 = clubWithAdmin2.y;
                }
                if (clubWithAdmin2 != null) {
                    str7 = clubWithAdmin2.d2;
                }
                InvitedByFragment.BundleInfo bundleInfo2 = new InvitedByFragment.BundleInfo(str, str2, str3, str7);
                m0.n.b.i.e(bundleInfo2, "mavericksArg");
                return new g2(bundleInfo2);
            } else if (m0.n.b.i.a(bool, bool3)) {
                CollectNameArgs collectNameArgs = new CollectNameArgs(completePhoneNumberAuthResponse.d);
                m0.n.b.i.e(collectNameArgs, "mavericksArg");
                return new j2(collectNameArgs);
            } else {
                CollectNameArgs collectNameArgs2 = new CollectNameArgs(completePhoneNumberAuthResponse.d);
                m0.n.b.i.e(collectNameArgs2, "mavericksArg");
                return new f2(collectNameArgs2);
            }
        } else {
            ((AmplitudeAnalytics) aVar).a("Onboarding-PhoneVerify-ExistingUser");
            if (m0.n.b.i.a(bool, bool3)) {
                lVar = new l2(true);
            } else {
                lVar = new h2(true);
            }
            return lVar;
        }
    }

    public static /* synthetic */ f1 l1(i0.b.b.q qVar, MavericksViewModel mavericksViewModel, m0.r.m mVar, DeliveryMode deliveryMode, m0.n.a.p pVar, int i, Object obj) {
        return qVar.x0(mavericksViewModel, mVar, (i & 2) != 0 ? i0.b.b.c0.a : null, pVar);
    }

    public static int l2(WorkInfo$State workInfo$State) {
        int ordinal = workInfo$State.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + workInfo$State + " to int");
                    }
                }
            }
        }
        return i;
    }

    public static final ZonedDateTime m(OffsetDateTime offsetDateTime) {
        m0.n.b.i.e(offsetDateTime, "<this>");
        ZonedDateTime atZoneSameInstant = offsetDateTime.atZoneSameInstant(ZoneId.systemDefault());
        m0.n.b.i.d(atZoneSameInstant, "atZoneSameInstant(ZoneId.systemDefault())");
        return atZoneSameInstant;
    }

    @RecentlyNonNull
    public static String m0(@RecentlyNonNull PowerManager.WakeLock wakeLock, @RecentlyNonNull String str) {
        String valueOf = String.valueOf(String.valueOf(((long) System.identityHashCode(wakeLock)) | (((long) Process.myPid()) << 32)));
        String str2 = null;
        if (TextUtils.isEmpty((CharSequence) null)) {
            str2 = "";
        }
        String valueOf2 = String.valueOf(str2);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public static final void m1(Context context, String str) {
        m0.n.b.i.e(context, "<this>");
        m0.n.b.i.e(str, "tweetText");
        String k = m0.n.b.i.k("https://twitter.com/intent/tweet?text=", URLEncoder.encode(str, "utf-8"));
        m0.n.b.i.e(context, "<this>");
        if (k != null) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(k)));
        }
    }

    public static final long m2(OffsetDateTime offsetDateTime) {
        m0.n.b.i.e(offsetDateTime, "<this>");
        return offsetDateTime.toInstant().toEpochMilli();
    }

    public static final void n(Object obj) {
        if (!(obj instanceof Serializable) && !(obj instanceof Parcelable)) {
            StringBuilder P0 = i0.d.a.a.a.P0("Cannot parcel ");
            P0.append(obj.getClass().getSimpleName());
            throw new IllegalStateException(P0.toString().toString());
        }
    }

    public static final String n0(View view) {
        Resources resources;
        m0.n.b.i.e(view, "$this$idName");
        try {
            if (view.getId() == -1 || (resources = view.getResources()) == null) {
                return null;
            }
            return resources.getResourceEntryName(view.getId());
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static final <T extends j> Bundle n1(T t, boolean z) {
        int i;
        Annotation[][] annotationArr;
        Method method;
        T t2 = t;
        m0.n.b.i.e(t2, "$this$persistState");
        Class<?> cls = t.getClass();
        Constructor<?> r1 = r1(cls);
        if (r1 == null) {
            return new Bundle();
        }
        Bundle bundle = new Bundle();
        Annotation[][] parameterAnnotations = r1.getParameterAnnotations();
        m0.n.b.i.d(parameterAnnotations, "constructor.parameterAnnotations");
        int length = parameterAnnotations.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            Annotation[] annotationArr2 = parameterAnnotations[i2];
            int i5 = i3 + 1;
            m0.n.b.i.d(annotationArr2, "p");
            int length2 = annotationArr2.length;
            int i6 = i4;
            while (true) {
                if (i6 >= length2) {
                    i = 1;
                    break;
                } else if (annotationArr2[i6] instanceof a0) {
                    i = i4;
                    break;
                } else {
                    i6++;
                }
            }
            if (i != 0) {
                annotationArr = parameterAnnotations;
            } else {
                String e0 = i0.d.a.a.a.e0("component", i5);
                try {
                    method = cls.getDeclaredMethod(e0, new Class[i4]);
                    annotationArr = parameterAnnotations;
                } catch (NoSuchMethodException unused) {
                    Method[] declaredMethods = cls.getDeclaredMethods();
                    m0.n.b.i.d(declaredMethods, "declaredMethods");
                    int length3 = declaredMethods.length;
                    int i7 = i4;
                    while (true) {
                        if (i4 >= length3) {
                            annotationArr = parameterAnnotations;
                            method = null;
                            i4 = i7;
                            break;
                        }
                        Method method2 = declaredMethods[i4];
                        m0.n.b.i.d(method2, "it");
                        String name = method2.getName();
                        m0.n.b.i.d(name, "it.name");
                        annotationArr = parameterAnnotations;
                        if (StringsKt__IndentKt.J(name, e0 + '$', false, 2)) {
                            i4 = 0;
                            method = method2;
                            break;
                        }
                        i4++;
                        i7 = 0;
                        parameterAnnotations = annotationArr;
                    }
                }
                if (method != null) {
                    method.setAccessible(true);
                    Object invoke = method.invoke(t2, new Object[i4]);
                    if (z) {
                        if (invoke instanceof Collection) {
                            Iterator it = ((ArrayList) g.s((Iterable) invoke)).iterator();
                            while (it.hasNext()) {
                                n(it.next());
                            }
                        } else if (invoke instanceof Map) {
                            ArrayList arrayList = new ArrayList();
                            for (Map.Entry value : ((Map) invoke).entrySet()) {
                                Object value2 = value.getValue();
                                if (value2 != null) {
                                    arrayList.add(value2);
                                }
                            }
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                n(it2.next());
                            }
                        }
                    }
                    String valueOf = String.valueOf(i3);
                    if (invoke instanceof Parcelable) {
                        bundle.putParcelable(valueOf, (Parcelable) invoke);
                    } else if (invoke instanceof Serializable) {
                        bundle.putSerializable(valueOf, (Serializable) invoke);
                    } else if (invoke == null) {
                        bundle.putString(valueOf, (String) null);
                    } else {
                        throw new IllegalStateException(i0.d.a.a.a.o0("Cannot persist ", valueOf, ". It must be null, Serializable, or Parcelable.").toString());
                    }
                } else {
                    StringBuilder T0 = i0.d.a.a.a.T0("Unable to find function ", e0, " in ");
                    T0.append(m0.n.b.m.a(cls.getClass()).e());
                    throw new IllegalStateException(T0.toString().toString());
                }
            }
            i2++;
            i3 = i5;
            parameterAnnotations = annotationArr;
        }
        return bundle;
    }

    public static final void n2(Fragment fragment, m0.n.a.p<? super c0, ? super Context, i> pVar) {
        m0.n.b.i.f(fragment, "$this$transact");
        m0.n.b.i.f(pVar, "action");
        h0.o.a.a aVar = new h0.o.a.a(fragment.getChildFragmentManager());
        k activity = fragment.getActivity();
        if (activity != null) {
            pVar.invoke(aVar, activity);
            aVar.h();
            fragment.getChildFragmentManager().F();
            return;
        }
        throw new IllegalStateException("Fragment's activity is null.".toString());
    }

    public static final AudienceType o(Channel channel) {
        m0.n.b.i.e(channel, "<this>");
        if (channel.i() != null) {
            return AudienceType.Club;
        }
        if (channel.U()) {
            return AudienceType.Social;
        }
        if (channel.T()) {
            return AudienceType.Closed;
        }
        return AudienceType.Open;
    }

    public static String o0(i0.b.b.q qVar) {
        return ((i0.b.b.r) new h0.q.m0((o0) qVar).a(i0.b.b.r.class)).a;
    }

    public static boolean o1(i0.f.a.c.n.q qVar, JavaType javaType, Type type) {
        if (!javaType.T(qVar.a(type).c)) {
            return false;
        }
        ParameterizedType V0 = V0(type);
        if (V0 == null || !Objects.equals(javaType.c, V0.getRawType())) {
            return true;
        }
        Type[] actualTypeArguments = V0.getActualTypeArguments();
        TypeBindings k = javaType.k();
        if (k.y.length != actualTypeArguments.length) {
            return false;
        }
        for (int i = 0; i < k.y.length; i++) {
            if (!o1(qVar, k.d(i), actualTypeArguments[i])) {
                return false;
            }
        }
        return true;
    }

    public static final boolean o2(k kVar, m0.n.a.p<? super c0, ? super Context, i> pVar) {
        m0.n.b.i.f(kVar, "$this$transact");
        m0.n.b.i.f(pVar, "action");
        FragmentManager supportFragmentManager = kVar.getSupportFragmentManager();
        h0.o.a.a aVar = new h0.o.a.a(supportFragmentManager);
        pVar.invoke(aVar, kVar);
        aVar.h();
        return supportFragmentManager.F();
    }

    public static final void p(EmojiTextView emojiTextView, UserInChannel userInChannel) {
        String str;
        m0.n.b.i.e(emojiTextView, "emojiBadge");
        String str2 = userInChannel == null ? null : userInChannel.q;
        boolean z = true;
        if (!(str2 == null || StringsKt__IndentKt.o(str2))) {
            if ((userInChannel == null || (str = userInChannel.q) == null || !F0(str)) ? false : true) {
                emojiTextView.setText(userInChannel.q);
                i0.e.b.d3.k.K(emojiTextView);
                return;
            }
        }
        if (userInChannel == null || !userInChannel.x) {
            z = false;
        }
        if (z) {
            i0.e.b.d3.k.K(emojiTextView);
            emojiTextView.setText("🎉");
            return;
        }
        i0.e.b.d3.k.p(emojiTextView);
    }

    public static final <T> void p0(Fragment fragment, String str, l<? super T, i> lVar) {
        m0.n.b.i.e(fragment, "<this>");
        m0.n.b.i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        m0.n.b.i.e(lVar, "onResult");
        h0.t.f c2 = NavHostFragment.I0(fragment).c();
        h0.q.p viewLifecycleOwner = fragment.getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.E2(q.a(viewLifecycleOwner), (m0.l.e) null, (CoroutineStart) null, new FragmentExtensionsKt$getNavigationResult$1(c2, str, lVar, (m0.l.c<? super FragmentExtensionsKt$getNavigationResult$1>) null), 3, (Object) null);
    }

    public static final AssentResult p1(AssentResult assentResult, AssentResult assentResult2) {
        m0.n.b.i.f(assentResult2, RecaptchaActionType.OTHER);
        if (assentResult == null) {
            return assentResult2;
        }
        return new AssentResult(g.b0(assentResult.a, assentResult2.a));
    }

    public static i0 p2(i0.b.b.q qVar, String str) {
        return new i0(g.E(g.M(qVar.V(), str), "_", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62));
    }

    public static IgnorePropertiesUtil$Checker q(Set<String> set, Set<String> set2) {
        if (set2 != null || (set != null && !set.isEmpty())) {
            return new IgnorePropertiesUtil$Checker(set, set2);
        }
        return null;
    }

    public static final boolean q0(c.f fVar) {
        m0.n.b.i.e(fVar, "<this>");
        return !fVar.a() && (fVar.b() == Position.TOP || fVar.b() == Position.ONLY);
    }

    public static void q1(i0.b.b.q qVar) {
        if (i0.b.b.s.a.add(Integer.valueOf(System.identityHashCode(qVar)))) {
            Handler handler = i0.b.b.s.b;
            handler.sendMessage(Message.obtain(handler, System.identityHashCode(qVar), qVar));
        }
    }

    public static i0 q2(i0.b.b.q qVar, String str, int i, Object obj) {
        int i2 = i & 1;
        return p2((BaseFragment) qVar, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d A[SYNTHETIC, Splitter:B:25:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0061 A[SYNTHETIC, Splitter:B:36:0x0061] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:29:0x0055=Splitter:B:29:0x0055, B:15:0x003a=Splitter:B:15:0x003a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static h0.g0.c r(byte[] r7) {
        /*
            h0.g0.c r0 = new h0.g0.c
            r0.<init>()
            if (r7 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0044, all -> 0x0040 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0044, all -> 0x0040 }
            int r7 = r2.readInt()     // Catch:{ IOException -> 0x003e }
        L_0x0017:
            if (r7 <= 0) goto L_0x0032
            java.lang.String r3 = r2.readUTF()     // Catch:{ IOException -> 0x003e }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ IOException -> 0x003e }
            boolean r4 = r2.readBoolean()     // Catch:{ IOException -> 0x003e }
            h0.g0.c$a r5 = new h0.g0.c$a     // Catch:{ IOException -> 0x003e }
            r5.<init>(r3, r4)     // Catch:{ IOException -> 0x003e }
            java.util.Set<h0.g0.c$a> r3 = r0.a     // Catch:{ IOException -> 0x003e }
            r3.add(r5)     // Catch:{ IOException -> 0x003e }
            int r7 = r7 + -1
            goto L_0x0017
        L_0x0032:
            r2.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x003a
        L_0x0036:
            r7 = move-exception
            r7.printStackTrace()
        L_0x003a:
            r1.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005d
        L_0x003e:
            r7 = move-exception
            goto L_0x0048
        L_0x0040:
            r0 = move-exception
            r2 = r7
            r7 = r0
            goto L_0x005f
        L_0x0044:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L_0x0048:
            r7.printStackTrace()     // Catch:{ all -> 0x005e }
            if (r2 == 0) goto L_0x0055
            r2.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0055
        L_0x0051:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0055:
            r1.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r7 = move-exception
            r7.printStackTrace()
        L_0x005d:
            return r0
        L_0x005e:
            r7 = move-exception
        L_0x005f:
            if (r2 == 0) goto L_0x0069
            r2.close()     // Catch:{ IOException -> 0x0065 }
            goto L_0x0069
        L_0x0065:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0069:
            r1.close()     // Catch:{ IOException -> 0x006d }
            goto L_0x0071
        L_0x006d:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0071:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b0.v.r(byte[]):h0.g0.c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = (r0 = r0.getViewLifecycleOwnerLiveData()).getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static h0.q.p r0(i0.b.b.q r1) {
        /*
            r0 = r1
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L_0x0014
            androidx.lifecycle.LiveData r0 = r0.getViewLifecycleOwnerLiveData()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r0.getValue()
            h0.q.p r0 = (h0.q.p) r0
            if (r0 == 0) goto L_0x0014
            r1 = r0
        L_0x0014:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b0.v.r0(i0.b.b.q):h0.q.p");
    }

    public static final <T extends j> Constructor<?> r1(Class<? extends T> cls) {
        boolean z;
        boolean z2;
        Constructor<?>[] constructors = cls.getConstructors();
        m0.n.b.i.d(constructors, "constructors");
        for (Constructor<?> constructor : constructors) {
            m0.n.b.i.d(constructor, "constructor");
            Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
            m0.n.b.i.d(parameterAnnotations, "constructor.parameterAnnotations");
            int length = parameterAnnotations.length;
            int i = 0;
            while (true) {
                z = true;
                if (i >= length) {
                    z = false;
                    break;
                }
                Annotation[] annotationArr = parameterAnnotations[i];
                m0.n.b.i.d(annotationArr, "paramAnnotations");
                int length2 = annotationArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        z2 = false;
                        break;
                    } else if (annotationArr[i2] instanceof a0) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    break;
                }
                i++;
            }
            if (z) {
                return constructor;
            }
        }
        return null;
    }

    public static int r2(@RecentlyNonNull Parcel parcel) {
        int readInt = parcel.readInt();
        int I1 = I1(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if ((65535 & readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new SafeParcelReader$ParseException(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = I1 + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new SafeParcelReader$ParseException(sb.toString(), parcel);
    }

    public static final ChannelComponentHandler s(i0.e.b.h3.a.b bVar) {
        m0.n.b.i.e(bVar, "<this>");
        return ((i0.e.b.z2.e.c) h.L0(bVar, i0.e.b.z2.e.c.class)).d();
    }

    public static String s0(String str) {
        return i0.d.a.a.a.n0("TransportRuntime.", str);
    }

    public static final i0.e.b.b3.a.a.c.a s1(ChannelInRoom channelInRoom, int i) {
        T t;
        boolean z;
        m0.n.b.i.e(channelInRoom, "<this>");
        List<UserInChannel> y = channelInRoom.y();
        m0.n.b.i.e(y, "<this>");
        Iterator<T> it = y.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((UserInChannel) t).getId().intValue() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        UserInChannel userInChannel = (UserInChannel) t;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        for (UserInChannel userInChannel2 : channelInRoom.y()) {
            if (userInChannel2.Z1) {
                linkedHashSet2.add(userInChannel2.getId());
            }
            if (userInChannel2.c2) {
                linkedHashSet.add(userInChannel2.getId());
            }
            if (userInChannel2.Z1 || userInChannel2.Y1) {
                linkedHashSet3.add(userInChannel2.getId());
            } else if (userInChannel2.b2) {
                linkedHashSet4.add(userInChannel2.getId());
            } else {
                linkedHashSet5.add(userInChannel2.getId());
            }
        }
        int v = channelInRoom.v();
        List<UserInChannel> y2 = channelInRoom.y();
        int R2 = h.R2(h.K(y2, 10));
        if (R2 < 16) {
            R2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(R2);
        for (T next : y2) {
            linkedHashMap.put(Integer.valueOf(((UserInChannel) next).getId().intValue()), next);
        }
        return new i0.e.b.b3.a.a.c.a(userInChannel, linkedHashMap, linkedHashSet, linkedHashSet2, (Set) null, false, Integer.valueOf(v), linkedHashSet3, linkedHashSet4, linkedHashSet5, 48);
    }

    public static final List<String> s2(List<? extends User> list) {
        String str;
        m0.n.b.i.e(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            String name = ((User) next).getName();
            if (true ^ (name == null || StringsKt__IndentKt.o(name))) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            User user = (User) it.next();
            if (arrayList.size() == 1) {
                str = user.getName();
            } else {
                str = user.F();
            }
            if (str != null) {
                arrayList2.add(str);
            }
        }
        return arrayList2;
    }

    public static void t(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static final int t0(Fragment fragment) {
        Dialog dialog;
        m0.n.b.i.e(fragment, "<this>");
        Fragment parentFragment = fragment.getParentFragment();
        Context context = null;
        Fragment parentFragment2 = parentFragment == null ? null : parentFragment.getParentFragment();
        DialogFragment dialogFragment = parentFragment2 instanceof DialogFragment ? (DialogFragment) parentFragment2 : null;
        if (!(dialogFragment == null || (dialog = dialogFragment.e2) == null)) {
            context = dialog.getContext();
        }
        if (context == null) {
            context = fragment.requireContext();
        }
        m0.n.b.i.d(context, "(parentFragment?.parentFragment as? DialogFragment)?.dialog?.context ?: requireContext()");
        int i = R.attr.toolbarBackground;
        m0.n.b.i.e(context, "<this>");
        m0.n.b.i.e(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        int i2 = typedValue.resourceId;
        if (i2 == 0) {
            i2 = typedValue.data;
        }
        return h0.i.b.a.getColor(context, i2);
    }

    public static i0.k.a.a t1(i0.e.b.c3.g.c cVar, Context context) {
        Objects.requireNonNull(cVar);
        m0.n.b.i.e(context, "context");
        File cacheDir = context.getCacheDir();
        Pattern pattern = i0.k.a.a.c;
        File file = new File(cacheDir, "journal.bkp");
        if (file.exists()) {
            File file2 = new File(cacheDir, "journal");
            if (file2.exists()) {
                file.delete();
            } else {
                i0.k.a.a.w(file, file2, false);
            }
        }
        i0.k.a.a aVar = new i0.k.a.a(cacheDir, 4734, 1, 5000000);
        if (aVar.x.exists()) {
            try {
                aVar.l();
                aVar.k();
                aVar.d2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(aVar.x, true), i0.k.a.c.a));
                return aVar;
            } catch (IOException e2) {
                PrintStream printStream = System.out;
                printStream.println("DiskLruCache " + cacheDir + " is corrupt: " + e2.getMessage() + ", removing");
                aVar.close();
                i0.k.a.c.b(aVar.q);
            }
        }
        cacheDir.mkdirs();
        i0.k.a.a aVar2 = new i0.k.a.a(cacheDir, 4734, 1, 5000000);
        aVar2.q();
        return aVar2;
    }

    public static final Map<String, Object> t2(Map<String, ? extends Object> map, SourceLocation sourceLocation) {
        Map<String, Object> map2;
        if (sourceLocation == null) {
            map2 = null;
        } else {
            map2 = g.c0(map == null ? g.o() : map, new Pair(Stripe3ds2AuthParams.FIELD_SOURCE, Integer.valueOf(sourceLocation.getCode())));
        }
        if (map2 == null) {
            return map == null ? g.o() : map;
        }
        return map2;
    }

    public static void u(boolean z, @RecentlyNonNull Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static float u0(float f, float f2, float f3) {
        return Math.min(Math.max(f, f3), f2);
    }

    public static Picasso u1(i0.e.b.c3.d dVar, Context context, i0.o.a.q qVar) {
        Objects.requireNonNull(dVar);
        m0.n.b.i.e(context, "context");
        m0.n.b.i.e(qVar, "okHttpDownloader");
        Context applicationContext = context.getApplicationContext();
        i0.o.a.o oVar = new i0.o.a.o(applicationContext);
        i0.o.a.s sVar = new i0.o.a.s();
        Picasso.d dVar2 = Picasso.d.a;
        x xVar = new x(oVar);
        Context context2 = applicationContext;
        Picasso picasso = new Picasso(context2, new i0.o.a.i(context2, sVar, Picasso.a, qVar, oVar, xVar), oVar, (Picasso.c) null, dVar2, (List<i0.o.a.v>) null, xVar, (Bitmap.Config) null, false, false);
        m0.n.b.i.d(picasso, "Builder(context)\n            .downloader(okHttpDownloader)\n            .build()");
        return picasso;
    }

    public static final <A extends MavericksViewModel<B>, B extends j, C extends MavericksViewModel<D>, D extends j, E> E u2(A a2, C c2, m0.n.a.p<? super B, ? super D, ? extends E> pVar) {
        m0.n.b.i.e(a2, "viewModel1");
        m0.n.b.i.e(c2, "viewModel2");
        m0.n.b.i.e(pVar, "block");
        return pVar.invoke(a2.g(), c2.g());
    }

    public static void v(boolean z, @RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static final w v0(View view) {
        m0.n.b.i.e(view, "$this$viewHolder");
        return (w) view.getTag(com.airbnb.epoxy.viewbinder.R.id.epoxy_view_binder);
    }

    public static PubNub v1(i0.e.b.f3.e eVar, UserSelf userSelf) {
        m0.n.b.i.e(eVar, "environment");
        m0.n.b.i.e(userSelf, "self");
        PNConfiguration pNConfiguration = new PNConfiguration();
        pNConfiguration.setSubscribeKey("sub-c-a4abea84-9ca3-11ea-8e71-f2b83ac9263d");
        pNConfiguration.setPublishKey("pub-c-6878d382-5ae6-4494-9099-f930f938868b");
        pNConfiguration.setSecure(true);
        pNConfiguration.setUuid(String.valueOf(userSelf.a));
        pNConfiguration.setManagePresenceListManually(true);
        pNConfiguration.setReconnectionPolicy(PNReconnectionPolicy.EXPONENTIAL);
        return new PubNub(pNConfiguration);
    }

    public static final <A extends MavericksViewModel<B>, B extends j, C> C v2(A a2, l<? super B, ? extends C> lVar) {
        m0.n.b.i.e(a2, "viewModel1");
        m0.n.b.i.e(lVar, "block");
        return lVar.invoke(a2.g());
    }

    public static void w(@RecentlyNonNull Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 36);
            sb.append("Must be called on ");
            sb.append(name2);
            sb.append(" thread, but got ");
            sb.append(name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static final boolean w0(CompletePhoneNumberAuthResponse completePhoneNumberAuthResponse) {
        m0.n.b.i.e(completePhoneNumberAuthResponse, "<this>");
        return (completePhoneNumberAuthResponse.k == null && completePhoneNumberAuthResponse.j == null) ? false : true;
    }

    public static PubNub w1(i0.e.d.a.a aVar, i0.e.b.f3.e eVar, UserSelf userSelf) {
        Objects.requireNonNull(aVar);
        m0.n.b.i.e(eVar, "environment");
        m0.n.b.i.e(userSelf, "self");
        PNConfiguration pNConfiguration = new PNConfiguration();
        pNConfiguration.setSubscribeKey("sub-c-a4abea84-9ca3-11ea-8e71-f2b83ac9263d");
        pNConfiguration.setPublishKey("pub-c-6878d382-5ae6-4494-9099-f930f938868b");
        pNConfiguration.setSecure(true);
        pNConfiguration.setUuid(String.valueOf(userSelf.a));
        pNConfiguration.setReconnectionPolicy(PNReconnectionPolicy.EXPONENTIAL);
        return new PubNub(pNConfiguration);
    }

    public static void w2(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Bundle bundle, boolean z) {
        if (bundle != null) {
            int G2 = G2(parcel, i);
            parcel.writeBundle(bundle);
            L2(parcel, G2);
        } else if (z) {
            J2(parcel, i, 0);
        }
    }

    @RecentlyNonNull
    @EnsuresNonNull({"#1"})
    public static String x(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static final void x0(Fragment fragment) {
        m0.n.b.i.e(fragment, "<this>");
        k activity = fragment.getActivity();
        IBinder iBinder = null;
        InputMethodManager inputMethodManager = (InputMethodManager) (activity == null ? null : activity.getSystemService("input_method"));
        if (inputMethodManager != null) {
            View view = fragment.getView();
            if (view != null) {
                iBinder = view.getWindowToken();
            }
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
        }
    }

    public static w.b x1(i0.e.b.c3.a aVar, i0.e.b.f3.e eVar, q0.a0 a0Var, h.a aVar2) {
        Objects.requireNonNull(aVar);
        m0.n.b.i.e(eVar, "environment");
        m0.n.b.i.e(a0Var, "okHttpClient");
        m0.n.b.i.e(aVar2, "serializationFactory");
        w.b bVar = new w.b();
        bVar.b("https://www.clubhouseapi.com/api/");
        bVar.d(a0Var);
        bVar.d.add(aVar2);
        m0.n.b.i.d(bVar, "Builder()\n            .baseUrl(environment.baseUrl)\n            .client(okHttpClient)\n            .addConverterFactory(serializationFactory)");
        return bVar;
    }

    public static void x2(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull byte[] bArr, boolean z) {
        if (bArr != null) {
            int G2 = G2(parcel, i);
            parcel.writeByteArray(bArr);
            L2(parcel, G2);
        } else if (z) {
            J2(parcel, i, 0);
        }
    }

    @RecentlyNonNull
    @EnsuresNonNull({"#1"})
    public static String y(String str, @RecentlyNonNull Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void y0(String str, String str2) {
        Log.i(s0(str), str2);
    }

    public static n0.c.m.b y1(i0.e.b.c3.a aVar) {
        Objects.requireNonNull(aVar);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        i0.e.b.b3.a.b.c.c cVar = i0.e.b.b3.a.b.c.c.a;
        m0.r.d a2 = m0.n.b.m.a(OffsetDateTime.class);
        m0.n.b.i.e(a2, "kClass");
        m0.n.b.i.e(cVar, "serializer");
        m0.n.b.i.e(a2, "forClass");
        m0.n.b.i.e(cVar, "serializer");
        KSerializer kSerializer = (KSerializer) hashMap.get(a2);
        if (kSerializer == null || !(!m0.n.b.i.a(kSerializer, cVar))) {
            hashMap.put(a2, cVar);
            return new n0.c.m.a(hashMap, hashMap2, hashMap3, hashMap4);
        }
        String a3 = cVar.getDescriptor().a();
        String a4 = kSerializer.getDescriptor().a();
        throw new SerializerAlreadyRegisteredException("Serializer for " + a2 + " already registered in this module: " + kSerializer + " (" + a4 + "), " + "attempted to register " + cVar + " (" + a3 + ')');
    }

    public static void y2(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Float f, boolean z) {
        if (f != null) {
            J2(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            J2(parcel, i, 0);
        }
    }

    public static void z(@RecentlyNonNull String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static final Object z0(Class<?> cls) {
        m0.n.b.i.e(cls, "$this$instance");
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        m0.n.b.i.d(declaredConstructors, "declaredConstructors");
        for (Constructor constructor : declaredConstructors) {
            m0.n.b.i.d(constructor, "it");
            if (constructor.getParameterTypes().length == 1) {
                Object newInstance = constructor.newInstance(new Object[]{null});
                m0.n.b.i.d(newInstance, "declaredConstructors.fir… == 1 }.newInstance(null)");
                return newInstance;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static i0.n.c.a.c.b.a z1(i0.e.b.c3.g.c cVar, Context context, i0.e.b.f3.c cVar2) {
        Objects.requireNonNull(cVar);
        m0.n.b.i.e(context, "context");
        m0.n.b.i.e(cVar2, "environment");
        Objects.requireNonNull(b.a.Companion);
        EmptyList emptyList = EmptyList.c;
        m0.n.b.i.e(context, "applicationContext");
        i0.n.c.a.b.a aVar = new i0.n.c.a.b.a("a4358988-97f8-44b8-b3cf-81ddb2327cfb");
        m0.n.b.i.e(aVar, "authorizationMethod");
        q0.a0 a0Var = new q0.a0();
        m0.n.b.i.e(a0Var, "okHttpClient");
        a0.a aVar2 = new a0.a();
        aVar2.a = a0Var.x;
        aVar2.b = a0Var.y;
        g.b(aVar2.c, a0Var.Y1);
        g.b(aVar2.d, a0Var.Z1);
        aVar2.e = a0Var.a2;
        aVar2.f = a0Var.b2;
        aVar2.g = a0Var.c2;
        aVar2.h = a0Var.d2;
        aVar2.i = a0Var.e2;
        aVar2.j = a0Var.f2;
        aVar2.k = a0Var.g2;
        aVar2.l = a0Var.h2;
        aVar2.m = a0Var.i2;
        aVar2.n = a0Var.j2;
        aVar2.o = a0Var.k2;
        aVar2.p = a0Var.l2;
        aVar2.q = a0Var.m2;
        aVar2.r = a0Var.n2;
        aVar2.s = a0Var.o2;
        aVar2.t = a0Var.p2;
        aVar2.u = a0Var.q2;
        aVar2.v = a0Var.r2;
        aVar2.w = a0Var.s2;
        aVar2.x = a0Var.t2;
        aVar2.y = a0Var.u2;
        aVar2.z = a0Var.v2;
        aVar2.A = a0Var.w2;
        aVar2.B = a0Var.x2;
        aVar2.C = a0Var.y2;
        aVar2.D = a0Var.z2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        m0.n.b.i.e(timeUnit, "unit");
        aVar2.z = q0.h0.c.b("timeout", 30, timeUnit);
        m0.n.b.i.e(timeUnit, "unit");
        aVar2.y = q0.h0.c.b("timeout", 30, timeUnit);
        aVar2.a(new i0.n.c.a.b.b(aVar));
        Objects.requireNonNull(emptyList);
        q0.a0 a0Var2 = new q0.a0(aVar2);
        w.b bVar = new w.b();
        bVar.b("https://verificationapi-v1.sinch.com/" + "verification/v1/");
        n0.c.l.a o = m0.r.t.a.r.m.a1.a.o((n0.c.l.a) null, SinchGlobalConfig$Builder$build$retrofit$1.c, 1);
        y.a aVar3 = y.c;
        y a2 = y.a.a(NetworkLog.JSON);
        m0.n.b.i.e(o, "$this$asConverterFactory");
        m0.n.b.i.e(a2, "contentType");
        bVar.d.add(new i0.k.b.a.a.a.b(a2, new d.a(o)));
        bVar.d(a0Var2);
        t0.w c2 = bVar.c();
        m0.n.b.i.d(c2, "retrofit");
        return new i0.n.c.a.c.b.b(context, c2, (m0.n.b.f) null);
    }

    public static void z2(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull List<Integer> list, boolean z) {
        if (list != null) {
            int G2 = G2(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(list.get(i2).intValue());
            }
            L2(parcel, G2);
        } else if (z) {
            J2(parcel, i, 0);
        }
    }
}
