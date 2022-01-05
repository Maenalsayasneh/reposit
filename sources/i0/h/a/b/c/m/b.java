package i0.h.a.b.c.m;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.internal.recaptcha.zzct;
import com.google.android.gms.internal.recaptcha.zzdd;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.internal.ca;
import com.google.firebase.components.DependencyCycleException;
import com.instabug.bug.BugReporting;
import com.instabug.bug.view.reporting.ReportingContainerActivity;
import com.instabug.library.Feature;
import com.instabug.library.R;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.LocaleUtils;
import com.pubnub.api.builder.PubNubErrorBuilder;
import h0.b.f.w0;
import h0.b0.v;
import h0.v.a.k;
import i0.h.a.b.g.g.d;
import i0.h.a.b.g.h.v1;
import i0.h.a.b.h.f.a;
import i0.h.a.b.m.b0;
import i0.h.a.b.m.d0;
import i0.h.a.b.m.g;
import i0.h.a.b.m.j;
import i0.h.a.c.k.c;
import i0.h.a.c.w.g;
import i0.h.a.d.a.a.t;
import i0.h.a.d.a.e.s;
import i0.h.a.d.a.e.z;
import i0.h.c.j.c;
import i0.h.c.j.d;
import i0.h.c.j.o;
import i0.h.c.j.p;
import i0.h.c.j.q;
import i0.h.c.j.r;
import i0.h.c.u.e;
import i0.h.c.u.f;
import i0.j.b.o.b.i;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public final class b {
    public static Boolean a;
    public static a b;
    public static d c;
    public static t d;

    public static Intent A(Context context) {
        Intent intent = new Intent(context, ReportingContainerActivity.class);
        intent.putExtra("com.instabug.library.process", PubNubErrorBuilder.PNERR_PAYLOAD_TOO_LARGE);
        intent.addFlags(65536);
        intent.addFlags(268435456);
        return intent;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String B(android.view.View r2) {
        /*
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            int r1 = r0.hashCode()
            switch(r1) {
                case -1495589242: goto L_0x00fc;
                case -1406842887: goto L_0x00f1;
                case -1346021293: goto L_0x00e6;
                case -1125439882: goto L_0x00db;
                case -957993568: goto L_0x00d0;
                case -938935918: goto L_0x00c5;
                case -937446323: goto L_0x00bb;
                case -830787764: goto L_0x00b1;
                case -443652810: goto L_0x00a7;
                case 382765867: goto L_0x009c;
                case 776382189: goto L_0x0090;
                case 799298502: goto L_0x0084;
                case 1125864064: goto L_0x0079;
                case 1127291599: goto L_0x006e;
                case 1283054733: goto L_0x0062;
                case 1310765783: goto L_0x0057;
                case 1410352259: goto L_0x004b;
                case 1413872058: goto L_0x003f;
                case 1666676343: goto L_0x0033;
                case 1713715320: goto L_0x0028;
                case 2001146706: goto L_0x001d;
                case 2059813682: goto L_0x0011;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0107
        L_0x0011:
            java.lang.String r1 = "ScrollView"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 12
            goto L_0x0108
        L_0x001d:
            java.lang.String r1 = "Button"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 5
            goto L_0x0108
        L_0x0028:
            java.lang.String r1 = "TableLayout"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 3
            goto L_0x0108
        L_0x0033:
            java.lang.String r1 = "EditText"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 8
            goto L_0x0108
        L_0x003f:
            java.lang.String r1 = "AutoCompleteTextView"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 10
            goto L_0x0108
        L_0x004b:
            java.lang.String r1 = "ListView"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 15
            goto L_0x0108
        L_0x0057:
            java.lang.String r1 = "FrameLayout"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 2
            goto L_0x0108
        L_0x0062:
            java.lang.String r1 = "SearchView"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 20
            goto L_0x0108
        L_0x006e:
            java.lang.String r1 = "LinearLayout"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 0
            goto L_0x0108
        L_0x0079:
            java.lang.String r1 = "ImageView"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 7
            goto L_0x0108
        L_0x0084:
            java.lang.String r1 = "ToggleButton"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 21
            goto L_0x0108
        L_0x0090:
            java.lang.String r1 = "RadioButton"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 17
            goto L_0x0108
        L_0x009c:
            java.lang.String r1 = "GridView"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 14
            goto L_0x0108
        L_0x00a7:
            java.lang.String r1 = "RelativeLayout"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 1
            goto L_0x0108
        L_0x00b1:
            java.lang.String r1 = "TableRow"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 4
            goto L_0x0108
        L_0x00bb:
            java.lang.String r1 = "ImageButton"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 6
            goto L_0x0108
        L_0x00c5:
            java.lang.String r1 = "TextView"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 9
            goto L_0x0108
        L_0x00d0:
            java.lang.String r1 = "VideoView"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 18
            goto L_0x0108
        L_0x00db:
            java.lang.String r1 = "HorizontalScrollView"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 13
            goto L_0x0108
        L_0x00e6:
            java.lang.String r1 = "MultiAutoCompleteTextView"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 11
            goto L_0x0108
        L_0x00f1:
            java.lang.String r1 = "WebView"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 19
            goto L_0x0108
        L_0x00fc:
            java.lang.String r1 = "ProgressBar"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 16
            goto L_0x0108
        L_0x0107:
            r0 = -1
        L_0x0108:
            switch(r0) {
                case 0: goto L_0x014d;
                case 1: goto L_0x014a;
                case 2: goto L_0x0147;
                case 3: goto L_0x0144;
                case 4: goto L_0x0141;
                case 5: goto L_0x013e;
                case 6: goto L_0x013b;
                case 7: goto L_0x0138;
                case 8: goto L_0x0135;
                case 9: goto L_0x0132;
                case 10: goto L_0x012f;
                case 11: goto L_0x012c;
                case 12: goto L_0x0129;
                case 13: goto L_0x0126;
                case 14: goto L_0x0123;
                case 15: goto L_0x0120;
                case 16: goto L_0x011d;
                case 17: goto L_0x011a;
                case 18: goto L_0x0117;
                case 19: goto L_0x0114;
                case 20: goto L_0x0111;
                case 21: goto L_0x010e;
                default: goto L_0x010b;
            }
        L_0x010b:
            java.lang.String r2 = "default"
            return r2
        L_0x010e:
            java.lang.String r2 = "ToggleButton"
            return r2
        L_0x0111:
            java.lang.String r2 = "SearchView"
            return r2
        L_0x0114:
            java.lang.String r2 = "WebView"
            return r2
        L_0x0117:
            java.lang.String r2 = "VideoView"
            return r2
        L_0x011a:
            java.lang.String r2 = "RadioButton"
            return r2
        L_0x011d:
            java.lang.String r2 = "ProgressBar"
            return r2
        L_0x0120:
            java.lang.String r2 = "ListView"
            return r2
        L_0x0123:
            java.lang.String r2 = "GridView"
            return r2
        L_0x0126:
            java.lang.String r2 = "HorizontalScrollView"
            return r2
        L_0x0129:
            java.lang.String r2 = "ScrollView"
            return r2
        L_0x012c:
            java.lang.String r2 = "MultiAutoCompleteTextView"
            return r2
        L_0x012f:
            java.lang.String r2 = "AutoCompleteTextView"
            return r2
        L_0x0132:
            java.lang.String r2 = "TextView"
            return r2
        L_0x0135:
            java.lang.String r2 = "EditText"
            return r2
        L_0x0138:
            java.lang.String r2 = "ImageView"
            return r2
        L_0x013b:
            java.lang.String r2 = "ImageButton"
            return r2
        L_0x013e:
            java.lang.String r2 = "Button"
            return r2
        L_0x0141:
            java.lang.String r2 = "TableRow"
            return r2
        L_0x0144:
            java.lang.String r2 = "TableLayout"
            return r2
        L_0x0147:
            java.lang.String r2 = "FrameLayout"
            return r2
        L_0x014a:
            java.lang.String r2 = "RelativeLayout"
            return r2
        L_0x014d:
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            int r2 = r2.getOrientation()
            if (r2 != 0) goto L_0x0158
            java.lang.String r2 = "HorizontalLinearLayout"
            return r2
        L_0x0158:
            java.lang.String r2 = "VerticalLinearLayout"
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.c.m.b.B(android.view.View):java.lang.String");
    }

    public static void C(List<i0.h.c.j.d<?>> list) {
        Set<p> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator<i0.h.c.j.d<?>> it = list.iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                i0.h.c.j.d next = it.next();
                p pVar = new p(next);
                Iterator<Class<? super T>> it2 = next.a.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Class next2 = it2.next();
                        boolean z = !next.b();
                        q qVar = new q(next2, z, (o) null);
                        if (!hashMap.containsKey(qVar)) {
                            hashMap.put(qVar, new HashSet());
                        }
                        Set set2 = (Set) hashMap.get(qVar);
                        if (set2.isEmpty() || z) {
                            set2.add(pVar);
                        } else {
                            throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{next2}));
                        }
                    }
                }
            } else {
                for (Set<p> it3 : hashMap.values()) {
                    for (p pVar2 : it3) {
                        for (r next3 : pVar2.a.b) {
                            if ((next3.c == 0) && (set = (Set) hashMap.get(new q(next3.a, next3.a(), (o) null))) != null) {
                                for (p pVar3 : set) {
                                    pVar2.b.add(pVar3);
                                    pVar3.c.add(pVar2);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (Set addAll : hashMap.values()) {
                    hashSet.addAll(addAll);
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    p pVar4 = (p) it4.next();
                    if (pVar4.a()) {
                        hashSet2.add(pVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    p pVar5 = (p) hashSet2.iterator().next();
                    hashSet2.remove(pVar5);
                    i++;
                    for (p next4 : pVar5.b) {
                        next4.c.remove(pVar5);
                        if (next4.a()) {
                            hashSet2.add(next4);
                        }
                    }
                }
                if (i != list.size()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it5 = hashSet.iterator();
                    while (it5.hasNext()) {
                        p pVar6 = (p) it5.next();
                        if (!pVar6.a() && !pVar6.b.isEmpty()) {
                            arrayList.add(pVar6.a);
                        }
                    }
                    throw new DependencyCycleException(arrayList);
                }
                return;
            }
        }
    }

    public static float D(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    public static float E(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    public static String F(String str, String str2) {
        return i0.d.a.a.a.z0(new StringBuilder(str.length() + 1 + String.valueOf(str2).length()), str, ":", str2);
    }

    public static String G(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(i0.d.a.a.a.X(str.length(), 2, String.valueOf(str2).length(), String.valueOf(str3).length()));
        i0.d.a.a.a.s(sb, str, ":", str2, ":");
        sb.append(str3);
        return sb.toString();
    }

    public static <TResult> g<TResult> H(TResult tresult) {
        b0 b0Var = new b0();
        b0Var.q(tresult);
        return b0Var;
    }

    public static i0.h.c.j.d<?> I(String str, i0.h.c.u.g<Context> gVar) {
        d.b<e> a2 = i0.h.c.j.d.a(e.class);
        a2.d = 1;
        a2.a(new r(Context.class, 1, 0));
        a2.d(new f(str, gVar));
        return a2.c();
    }

    public static void J(PackageManager packageManager, ComponentName componentName, int i) {
        ComponentInfo componentInfo;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting != 1) {
            if (componentEnabledSetting != 2) {
                String packageName = componentName.getPackageName();
                String className = componentName.getClassName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, i | 512);
                    ComponentInfo[][] componentInfoArr = {packageInfo.activities, packageInfo.services, packageInfo.providers};
                    int i2 = 0;
                    loop0:
                    while (true) {
                        if (i2 >= 3) {
                            componentInfo = null;
                            break;
                        }
                        ComponentInfo[] componentInfoArr2 = componentInfoArr[i2];
                        if (componentInfoArr2 != null) {
                            int length = componentInfoArr2.length;
                            for (int i3 = 0; i3 < length; i3++) {
                                componentInfo = componentInfoArr2[i3];
                                if (componentInfo.name.equals(className)) {
                                    break loop0;
                                }
                            }
                            continue;
                        }
                        i2++;
                    }
                    if (componentInfo != null) {
                        if (componentInfo.isEnabled()) {
                            return;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        }
    }

    public static int K(Context context, int i, int i2) {
        TypedValue i02 = i0(context, i);
        return i02 != null ? i02.data : i2;
    }

    public static int L(View view, int i) {
        return k0(view.getContext(), i, view.getClass().getCanonicalName());
    }

    public static ColorStateList M(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            ThreadLocal<TypedValue> threadLocal = h0.b.b.a.a.a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i);
    }

    public static ColorStateList N(Context context, w0 w0Var, int i) {
        int resourceId;
        if (w0Var.b.hasValue(i) && (resourceId = w0Var.b.getResourceId(i, 0)) != 0) {
            ThreadLocal<TypedValue> threadLocal = h0.b.b.a.a.a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return w0Var.c(i);
    }

    public static int O(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable P(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable a2;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (a2 = h0.b.b.a.a.a(context, resourceId)) == null) {
            return typedArray.getDrawable(i);
        }
        return a2;
    }

    public static float Q(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            AtomicInteger atomicInteger = h0.i.i.q.a;
            f += ((View) parent).getElevation();
        }
        return f;
    }

    public static void R(i iVar) {
        View view = iVar.n;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (!(viewGroup.getChildAt(i).getId() == R.id.instabug_extra_screenshot_button || viewGroup.getChildAt(i).getId() == R.id.instabug_floating_button)) {
                    i iVar2 = new i();
                    iVar2.i = false;
                    iVar2.a = iVar.a + "-" + i;
                    iVar2.n = viewGroup.getChildAt(i);
                    iVar2.f = iVar;
                    iVar2.o = iVar.o;
                    Z(iVar2);
                    iVar.g.add(iVar2);
                }
            }
        }
    }

    public static <T> void S(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static JSONObject T(i iVar) throws JSONException {
        if (iVar.m != null) {
            return new JSONObject().put("x", iVar.m.left / iVar.o).put("y", iVar.m.top / iVar.o).put("w", iVar.m.width() / iVar.o).put("h", iVar.m.height() / iVar.o);
        }
        return null;
    }

    public static boolean U() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean V(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean W(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    public static boolean X(View view) {
        AtomicInteger atomicInteger = h0.i.i.q.a;
        return view.getLayoutDirection() == 1;
    }

    public static Rect Y(i iVar) {
        int i;
        int i2;
        int i3;
        int i4;
        if (iVar.i) {
            return iVar.l;
        }
        if (iVar.l == null || iVar.f == null) {
            return new Rect(0, 0, 0, 0);
        }
        Rect rect = iVar.l;
        Rect rect2 = new Rect(rect.left, rect.top, rect.right, rect.bottom);
        i iVar2 = iVar.f;
        Rect rect3 = iVar2.m;
        int i5 = rect3 != null ? rect3.left : 0;
        View view = iVar2.n;
        int paddingLeft = view != null ? view.getPaddingLeft() : 0;
        Rect rect4 = iVar2.l;
        int i6 = rect4 != null ? rect4.left : 0;
        if (paddingLeft != 0 && i5 <= (i4 = i6 + paddingLeft)) {
            i5 = i4;
        }
        i iVar3 = iVar.f;
        Rect rect5 = iVar3.m;
        int i7 = rect5 != null ? rect5.top : 0;
        View view2 = iVar3.n;
        int paddingTop = view2 != null ? view2.getPaddingTop() : 0;
        Rect rect6 = iVar3.l;
        int i8 = rect6 != null ? rect6.top : 0;
        if (paddingTop != 0 && i7 <= (i3 = i8 + paddingTop)) {
            i7 = i3;
        }
        i iVar4 = iVar.f;
        Rect rect7 = iVar4.m;
        int i9 = rect7 != null ? rect7.right : 0;
        View view3 = iVar4.n;
        int paddingRight = view3 != null ? view3.getPaddingRight() : 0;
        Rect rect8 = iVar4.l;
        int i10 = rect8 != null ? rect8.right : 0;
        if (paddingRight != 0 && i9 >= (i2 = i10 - paddingRight)) {
            i9 = i2;
        }
        i iVar5 = iVar.f;
        Rect rect9 = iVar5.m;
        int i11 = rect9 != null ? rect9.bottom : 0;
        View view4 = iVar5.n;
        int paddingBottom = view4 != null ? view4.getPaddingBottom() : 0;
        Rect rect10 = iVar5.l;
        int i12 = rect10 != null ? rect10.bottom : 0;
        if (paddingBottom != 0 && i11 >= (i = i12 - paddingBottom)) {
            i11 = i;
        }
        if (rect2.intersect(new Rect(i5, i7, i9, i11))) {
            return rect2;
        }
        return new Rect(0, 0, 0, 0);
    }

    public static i Z(i iVar) {
        View view = iVar.n;
        if (view != null && view.getVisibility() == 0) {
            try {
                iVar.d = iVar.n.getClass().getSimpleName();
                iVar.b = B(iVar.n);
                iVar.e = p(iVar.n);
                View view2 = iVar.n;
                int[] iArr = new int[2];
                view2.getLocationOnScreen(iArr);
                iVar.l = new Rect(iArr[0], iArr[1], view2.getWidth() + iArr[0], view2.getHeight() + iArr[1]);
                iVar.m = Y(iVar);
                iVar.c = T(iVar);
                if (iVar.n instanceof ViewGroup) {
                    iVar.h = true;
                    R(iVar);
                } else {
                    iVar.h = false;
                }
            } catch (JSONException e) {
                StringBuilder P0 = i0.d.a.a.a.P0("inspect view hierarchy got error: ");
                P0.append(e.getMessage());
                P0.append(",View hierarchy id:");
                P0.append(iVar.a);
                P0.append(", time in MS: ");
                P0.append(System.currentTimeMillis());
                InstabugSDKLogger.e("ViewHierarchyInspector", P0.toString(), e);
            }
        }
        return iVar;
    }

    public static String a(Context context, int i) {
        if (i == -1) {
            return String.valueOf(i);
        }
        if (context != null) {
            try {
                if (!(context.getResources() == null || context.getResources().getResourceEntryName(i) == null)) {
                    return context.getResources().getResourceEntryName(i);
                }
            } catch (Resources.NotFoundException unused) {
                return String.valueOf(i);
            }
        }
        return String.valueOf(i);
    }

    public static void a0(i0.h.a.d.a.e.r rVar, InputStream inputStream, OutputStream outputStream, long j) throws IOException {
        byte[] bArr = new byte[16384];
        InputStream inputStream2 = inputStream;
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int readInt = dataInputStream.readInt();
        if (readInt != -771763713) {
            String valueOf = String.valueOf(String.format("%x", new Object[]{Integer.valueOf(readInt)}));
            throw new ca(valueOf.length() != 0 ? "Unexpected magic=".concat(valueOf) : new String("Unexpected magic="));
        }
        int read = dataInputStream.read();
        if (read == 4) {
            long j2 = 0;
            while (true) {
                long j3 = j - j2;
                try {
                    int read2 = dataInputStream.read();
                    if (read2 == -1) {
                        throw new IOException("Patch file overrun");
                    } else if (read2 != 0) {
                        switch (read2) {
                            case 247:
                                read2 = dataInputStream.readUnsignedShort();
                                d0(bArr, dataInputStream, outputStream, read2, j3);
                                break;
                            case 248:
                                read2 = dataInputStream.readInt();
                                d0(bArr, dataInputStream, outputStream, read2, j3);
                                break;
                            case 249:
                                long readUnsignedShort = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    e0(bArr, rVar, outputStream, readUnsignedShort, read2, j3);
                                    break;
                                } else {
                                    throw new IOException("Unexpected end of patch");
                                }
                            case k.d.DEFAULT_SWIPE_ANIMATION_DURATION:
                                long readUnsignedShort2 = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.readUnsignedShort();
                                e0(bArr, rVar, outputStream, readUnsignedShort2, read2, j3);
                                break;
                            case 251:
                                long readUnsignedShort3 = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.readInt();
                                e0(bArr, rVar, outputStream, readUnsignedShort3, read2, j3);
                                break;
                            case 252:
                                long readInt2 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    e0(bArr, rVar, outputStream, readInt2, read2, j3);
                                    break;
                                } else {
                                    throw new IOException("Unexpected end of patch");
                                }
                            case 253:
                                long readInt3 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.readUnsignedShort();
                                e0(bArr, rVar, outputStream, readInt3, read2, j3);
                                break;
                            case 254:
                                long readInt4 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.readInt();
                                e0(bArr, rVar, outputStream, readInt4, read2, j3);
                                break;
                            case 255:
                                long readLong = dataInputStream.readLong();
                                read2 = dataInputStream.readInt();
                                e0(bArr, rVar, outputStream, readLong, read2, j3);
                                break;
                            default:
                                d0(bArr, dataInputStream, outputStream, read2, j3);
                                break;
                        }
                        j2 += (long) read2;
                    } else {
                        return;
                    }
                } finally {
                    outputStream.flush();
                }
            }
        } else {
            throw new ca(i0.d.a.a.a.Q(30, "Unexpected version=", read));
        }
    }

    @SuppressLint({"ERADICATE_CONDITION_REDUNDANT_NONNULL"})
    public static String b(Class<?> cls) {
        if (cls != null) {
            return cls.getName().split(".\\w+[^.]+$\\Z")[0];
        }
        return null;
    }

    public static int b0(int i, int i2, float f) {
        return h0.i.c.a.a(h0.i.c.a.c(i2, Math.round(((float) Color.alpha(i2)) * f)), i);
    }

    public static String c(String str, String str2, String str3) {
        return str.replaceAll("\\[([^\\]]+)\\]\\(([^\\]]+)\\)", String.format("<font color=\"#%06X\"><a href=\"$2\">$1</a></font>", new Object[]{Integer.valueOf(InstabugCore.getPrimaryColor() & 16777215)})).replace(str2, str3);
    }

    public static float c0(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static List<i0.j.b.p.a> d(Context context, boolean z) {
        ArrayList arrayList = new ArrayList();
        int i = com.instabug.bug.R.string.instabug_str_steps_to_reproduce;
        String string = context.getString(i);
        Locale locale = Locale.ENGLISH;
        arrayList.add(new i0.j.b.p.a(string, LocaleUtils.getLocaleStringResource(locale, i, context), z, "repro_steps"));
        int i2 = com.instabug.bug.R.string.instabug_str_actual_results;
        arrayList.add(new i0.j.b.p.a(context.getString(i2), LocaleUtils.getLocaleStringResource(locale, i2, context), z, "actual_result"));
        int i3 = com.instabug.bug.R.string.instabug_str_expected_results;
        arrayList.add(new i0.j.b.p.a(context.getString(i3), LocaleUtils.getLocaleStringResource(locale, i3, context), z, "expected_result"));
        return arrayList;
    }

    public static void d0(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i, long j) throws IOException {
        if (i < 0) {
            throw new IOException("copyLength negative");
        } else if (((long) i) <= j) {
            while (i > 0) {
                try {
                    int min = Math.min(i, 16384);
                    dataInputStream.readFully(bArr, 0, min);
                    outputStream.write(bArr, 0, min);
                    i -= min;
                } catch (EOFException unused) {
                    throw new IOException("patch underrun");
                }
            }
        } else {
            throw new IOException("Output length overrun");
        }
    }

    public static JSONObject e(Activity activity, int i) throws JSONException {
        return new JSONObject().put("w", activity.getWindow().getDecorView().getWidth() / i).put("h", activity.getWindow().getDecorView().getHeight() / i);
    }

    public static void e0(byte[] bArr, i0.h.a.d.a.e.r rVar, OutputStream outputStream, long j, int i, long j2) throws IOException {
        InputStream b2;
        Throwable th;
        byte[] bArr2 = bArr;
        int i2 = i;
        if (i2 < 0) {
            throw new IOException("copyLength negative");
        } else if (j >= 0) {
            long j3 = (long) i2;
            if (j3 <= j2) {
                s sVar = new s(rVar, j, j3);
                synchronized (sVar) {
                    b2 = sVar.b(0, sVar.a());
                }
                while (i2 > 0) {
                    try {
                        int min = Math.min(i2, 16384);
                        int i3 = 0;
                        while (i3 < min) {
                            int read = b2.read(bArr, i3, min - i3);
                            if (read != -1) {
                                i3 += read;
                            } else {
                                throw new IOException("truncated input stream");
                            }
                        }
                        OutputStream outputStream2 = outputStream;
                        outputStream.write(bArr, 0, min);
                        i2 -= min;
                    } catch (EOFException e) {
                        throw new IOException("patch underrun", e);
                    } catch (Throwable th2) {
                        z.a.a(th, th2);
                    }
                }
                b2.close();
                return;
            }
            throw new IOException("Output length overrun");
        } else {
            throw new IOException("inputOffset negative");
        }
        throw th;
    }

    public static void f(@BugReporting.ReportType int i) {
        InstabugSDKLogger.i("BugReportingWrapper", "show " + i);
        if (InstabugCore.isForegroundBusy() || !InstabugCore.isFeatureEnabled(Feature.BUG_REPORTING)) {
            return;
        }
        if (i == 0) {
            InvocationManager.getInstance().invoke(1);
        } else if (i == 1) {
            InvocationManager.getInstance().invoke(2);
        } else if (i == 2) {
            InvocationManager.getInstance().invoke(3);
        }
    }

    public static PorterDuff.Mode f0(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void g(i0.j.a.h.d.a aVar) {
        i0.j.a.g.a.c().a.add(aVar);
    }

    public static void g0(AnimatorSet animatorSet, List<Animator> list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = list.get(i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
        ofInt.setDuration(j);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }

    public static void h(com.instabug.bug.view.g.a aVar, ArrayList<com.instabug.bug.view.g.a> arrayList) {
        String str = aVar.d;
        if (str != null && !str.isEmpty() && !aVar.d.equals("{}") && !aVar.d.equals("[]")) {
            aVar.c = aVar.c.toUpperCase().replace('_', ' ');
            arrayList.add(aVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object h0(i0.h.a.d.a.a.b r5, m0.l.c<? super i0.h.a.d.a.a.a> r6) {
        /*
            boolean r0 = r6 instanceof com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestAppUpdateInfo$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestAppUpdateInfo$1 r0 = (com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestAppUpdateInfo$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestAppUpdateInfo$1 r0 = new com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestAppUpdateInfo$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            java.lang.Object r5 = r0.q
            i0.h.a.d.a.a.b r5 = (i0.h.a.d.a.a.b) r5
            i0.j.f.p.h.d4(r6)
            goto L_0x00ad
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0034:
            i0.j.f.p.h.d4(r6)
            i0.h.a.d.a.j.p r6 = r5.a()
            java.lang.String r2 = "appUpdateInfo"
            m0.n.b.i.b(r6, r2)
            r0.q = r5
            r0.d = r3
            com.google.android.play.core.ktx.TaskUtilsKt$runTask$2 r5 = com.google.android.play.core.ktx.TaskUtilsKt$runTask$2.c
            n0.a.n r2 = new n0.a.n
            m0.l.c r4 = i0.j.f.p.h.b2(r0)
            r2.<init>(r4, r3)
            r2.q()
            com.google.android.play.core.ktx.TaskUtilsKt$runTask$$inlined$suspendCancellableCoroutine$lambda$1 r3 = new com.google.android.play.core.ktx.TaskUtilsKt$runTask$$inlined$suspendCancellableCoroutine$lambda$1
            r3.<init>(r5, r6)
            r2.p(r3)
            java.lang.Object r5 = r6.a
            monitor-enter(r5)
            boolean r3 = r6.c     // Catch:{ all -> 0x00b3 }
            monitor-exit(r5)     // Catch:{ all -> 0x00b3 }
            if (r3 == 0) goto L_0x0088
            boolean r5 = r6.i()
            if (r5 == 0) goto L_0x0070
            java.lang.Object r5 = r6.h()
            r2.resumeWith(r5)
            goto L_0x009f
        L_0x0070:
            java.lang.Exception r5 = r6.g()
            if (r5 == 0) goto L_0x0083
            java.lang.String r6 = "task.exception!!"
            m0.n.b.i.b(r5, r6)
            java.lang.Object r5 = i0.j.f.p.h.l0(r5)
            r2.resumeWith(r5)
            goto L_0x009f
        L_0x0083:
            m0.n.b.i.l()
            r5 = 0
            throw r5
        L_0x0088:
            i0.h.a.d.a.f.a r5 = new i0.h.a.d.a.f.a
            r5.<init>(r2)
            java.util.concurrent.Executor r3 = i0.h.a.d.a.j.d.a
            r6.d(r3, r5)
            i0.h.a.d.a.f.b r5 = new i0.h.a.d.a.f.b
            r5.<init>(r2)
            r6.c(r3, r5)
            java.lang.String r5 = "task.addOnFailureListene…ithException(exception) }"
            m0.n.b.i.b(r6, r5)
        L_0x009f:
            java.lang.Object r6 = r2.o()
            if (r6 != r1) goto L_0x00aa
            java.lang.String r5 = "frame"
            m0.n.b.i.e(r0, r5)
        L_0x00aa:
            if (r6 != r1) goto L_0x00ad
            return r1
        L_0x00ad:
            java.lang.String r5 = "runTask(appUpdateInfo)"
            m0.n.b.i.b(r6, r5)
            return r6
        L_0x00b3:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00b3 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.c.m.b.h0(i0.h.a.d.a.a.b, m0.l.c):java.lang.Object");
    }

    public static void i(int[] iArr) {
        for (int i : iArr) {
            InstabugSDKLogger.i("BugReportingWrapper", "setOptions: " + i);
            if (i == 2) {
                Objects.requireNonNull(i0.j.b.s.a.h());
                i0.j.b.s.b.a().i = false;
                Objects.requireNonNull(i0.j.b.s.a.h());
                i0.j.b.s.b.a().j = false;
            } else if (i == 4) {
                Objects.requireNonNull(i0.j.b.s.a.h());
                i0.j.b.s.b.a().i = true;
                Objects.requireNonNull(i0.j.b.s.a.h());
                i0.j.b.s.b.a().j = false;
            } else if (i == 8) {
                Objects.requireNonNull(i0.j.b.s.a.h());
                i0.j.b.s.b.a().c = true;
            } else if (i == 16) {
                Objects.requireNonNull(i0.j.b.s.a.h());
                i0.j.b.s.b.a().k = false;
            }
        }
    }

    public static TypedValue i0(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static <TResult> TResult j(g<TResult> gVar) throws ExecutionException, InterruptedException {
        v.z("Must not be called on the main application thread");
        v.A(gVar, "Task must not be null");
        if (gVar.m()) {
            return q0(gVar);
        }
        j jVar = new j((d0) null);
        Executor executor = i0.h.a.b.m.i.b;
        gVar.e(executor, jVar);
        gVar.d(executor, jVar);
        gVar.a(executor, jVar);
        jVar.a.await();
        return q0(gVar);
    }

    public static boolean j0(Context context, int i, boolean z) {
        TypedValue i02 = i0(context, i);
        if (i02 == null || i02.type != 18) {
            return z;
        }
        return i02.data != 0;
    }

    public static <TResult> TResult k(g<TResult> gVar, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        v.z("Must not be called on the main application thread");
        v.A(gVar, "Task must not be null");
        v.A(timeUnit, "TimeUnit must not be null");
        if (gVar.m()) {
            return q0(gVar);
        }
        j jVar = new j((d0) null);
        Executor executor = i0.h.a.b.m.i.b;
        gVar.e(executor, jVar);
        gVar.d(executor, jVar);
        gVar.a(executor, jVar);
        if (jVar.a.await(j, timeUnit)) {
            return q0(gVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static int k0(Context context, int i, String str) {
        TypedValue i02 = i0(context, i);
        if (i02 != null) {
            return i02.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }

    public static <ResultT> ResultT l(@NonNull i0.h.a.d.a.j.p<ResultT> pVar) throws ExecutionException, InterruptedException {
        boolean z;
        Objects.requireNonNull(pVar, "Task must not be null");
        synchronized (pVar.a) {
            z = pVar.c;
        }
        if (z) {
            return s(pVar);
        }
        i0.h.a.d.a.j.q qVar = new i0.h.a.d.a.j.q((byte[]) null);
        Executor executor = i0.h.a.d.a.j.d.b;
        pVar.d(executor, qVar);
        pVar.c(executor, qVar);
        qVar.a.await();
        return s(pVar);
    }

    public static void l0(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof i0.h.a.c.w.g) {
            i0.h.a.c.w.g gVar = (i0.h.a.c.w.g) background;
            g.b bVar = gVar.q;
            if (bVar.o != f) {
                bVar.o = f;
                gVar.B();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m(i0.j.b.o.b.i r14, android.app.Activity r15) {
        /*
            android.view.View r0 = r14.n
            r1 = 0
            if (r0 == 0) goto L_0x01f0
            android.graphics.Rect r2 = r14.m
            if (r2 == 0) goto L_0x01f0
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L_0x01f0
            android.view.View r0 = r14.n
            int r0 = r0.getWidth()
            if (r0 <= 0) goto L_0x01f0
            android.graphics.Rect r0 = r14.m
            int r0 = r0.height()
            if (r0 <= 0) goto L_0x01f0
            android.graphics.Rect r0 = r14.m
            int r0 = r0.width()
            if (r0 <= 0) goto L_0x01f0
            android.view.View r0 = r14.n
            boolean r2 = r0 instanceof android.widget.EditText
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0058
            r15 = r0
            android.widget.EditText r15 = (android.widget.EditText) r15
            android.text.method.TransformationMethod r2 = r15.getTransformationMethod()
            int r5 = r15.getInputType()
            r15.setInputType(r3)
            i0.j.b.r.a.a.a r3 = new i0.j.b.r.a.a.a
            r3.<init>()
            r15.setTransformationMethod(r3)
            r0.buildDrawingCache()
            android.graphics.Bitmap r0 = r15.getDrawingCache()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0)
            r15.setInputType(r5)
            r15.setTransformationMethod(r2)
            goto L_0x0126
        L_0x0058:
            int r2 = r0.getWidth()
            int r5 = r0.getHeight()
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r5, r6)
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r2)
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            r8 = 2
            if (r6 < r7) goto L_0x00cf
            int r6 = r0.getWidth()
            int r7 = r0.getHeight()
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r6, r7, r9)
            int[] r7 = new int[r8]
            r0.getLocationInWindow(r7)
            android.view.Window r15 = r15.getWindow()     // Catch:{ IllegalArgumentException -> 0x00b2 }
            android.graphics.Rect r9 = new android.graphics.Rect     // Catch:{ IllegalArgumentException -> 0x00b2 }
            r10 = r7[r4]     // Catch:{ IllegalArgumentException -> 0x00b2 }
            r11 = r7[r3]     // Catch:{ IllegalArgumentException -> 0x00b2 }
            r12 = r7[r4]     // Catch:{ IllegalArgumentException -> 0x00b2 }
            int r13 = r0.getWidth()     // Catch:{ IllegalArgumentException -> 0x00b2 }
            int r12 = r12 + r13
            r3 = r7[r3]     // Catch:{ IllegalArgumentException -> 0x00b2 }
            int r13 = r0.getHeight()     // Catch:{ IllegalArgumentException -> 0x00b2 }
            int r3 = r3 + r13
            r9.<init>(r10, r11, r12, r3)     // Catch:{ IllegalArgumentException -> 0x00b2 }
            i0.j.b.r.a.a.c r3 = new i0.j.b.r.a.a.c     // Catch:{ IllegalArgumentException -> 0x00b2 }
            r3.<init>(r5, r6, r7)     // Catch:{ IllegalArgumentException -> 0x00b2 }
            android.os.Handler r7 = new android.os.Handler     // Catch:{ IllegalArgumentException -> 0x00b2 }
            android.os.Looper r10 = android.os.Looper.getMainLooper()     // Catch:{ IllegalArgumentException -> 0x00b2 }
            r7.<init>(r10)     // Catch:{ IllegalArgumentException -> 0x00b2 }
            android.view.PixelCopy.request(r15, r9, r6, r3, r7)     // Catch:{ IllegalArgumentException -> 0x00b2 }
            goto L_0x00d2
        L_0x00b2:
            r15 = move-exception
            r0.draw(r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = r15.getMessage()
            r3.append(r6)
            java.lang.String r6 = ""
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.instabug.library.util.InstabugSDKLogger.e(r15, r3)
            goto L_0x00d2
        L_0x00cf:
            r0.draw(r5)
        L_0x00d2:
            int[] r15 = new int[r8]
            r15 = {0, 0} // fill-array
            boolean r3 = r0 instanceof android.view.TextureView
            if (r3 == 0) goto L_0x00e1
            r3 = r0
            android.view.TextureView r3 = (android.view.TextureView) r3
            com.instabug.library.instacapture.screenshot.ScreenshotTaker.drawTextureView(r3, r15, r5)
        L_0x00e1:
            boolean r3 = r0 instanceof android.opengl.GLSurfaceView
            if (r3 == 0) goto L_0x00eb
            r3 = r0
            android.opengl.GLSurfaceView r3 = (android.opengl.GLSurfaceView) r3
            com.instabug.library.instacapture.screenshot.ScreenshotTaker.drawGLSurfaceView(r3, r15, r5)
        L_0x00eb:
            boolean r15 = r0 instanceof android.webkit.WebView
            if (r15 == 0) goto L_0x00f5
            r15 = r0
            android.webkit.WebView r15 = (android.webkit.WebView) r15
            com.instabug.library.instacapture.screenshot.ScreenshotTaker.drawWebView(r15, r5)
        L_0x00f5:
            com.instabug.library.settings.SettingsManager r15 = com.instabug.library.settings.SettingsManager.getInstance()
            java.util.Collection r15 = r15.getPrivateViews()
            java.util.Iterator r15 = r15.iterator()
        L_0x0101:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L_0x0125
            java.lang.Object r3 = r15.next()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x0101
            boolean r6 = com.instabug.library.instacapture.screenshot.ScreenshotTaker.isVisible(r3)
            if (r6 == 0) goto L_0x0101
            int r3 = r3.getId()
            int r6 = r0.getId()
            if (r3 != r6) goto L_0x0101
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5.drawColor(r3)
            goto L_0x0101
        L_0x0125:
            r0 = r2
        L_0x0126:
            android.graphics.Rect r15 = r14.l
            if (r15 == 0) goto L_0x01f0
            android.graphics.Rect r2 = r14.m
            java.lang.String r3 = ", bitmap height: "
            java.lang.String r5 = "BitmapUtils"
            if (r0 == 0) goto L_0x01b1
            if (r2 == 0) goto L_0x01b1
            int r6 = r2.width()
            if (r6 <= 0) goto L_0x01b1
            int r6 = r2.height()
            if (r6 <= 0) goto L_0x01b1
            java.lang.String r6 = "visible rect: "
            java.lang.StringBuilder r6 = i0.d.a.a.a.P0(r6)
            java.lang.String r7 = r2.toString()
            r6.append(r7)
            java.lang.String r7 = ", original rect"
            r6.append(r7)
            java.lang.String r7 = r15.toString()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.instabug.library.util.InstabugSDKLogger.d(r5, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "bitmap width: "
            r6.append(r7)
            int r7 = r0.getWidth()
            r6.append(r7)
            r6.append(r3)
            int r7 = r0.getHeight()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.instabug.library.util.InstabugSDKLogger.d(r5, r6)
            int r6 = r2.left
            int r7 = r15.left
            int r6 = r6 - r7
            int r7 = r2.top
            int r15 = r15.top
            int r7 = r7 - r15
            if (r6 < 0) goto L_0x01b1
            if (r7 < 0) goto L_0x01b1
            int r15 = r2.width()
            int r8 = r0.getWidth()
            if (r15 > r8) goto L_0x01b1
            int r15 = r2.height()
            int r8 = r0.getHeight()
            if (r15 > r8) goto L_0x01b1
            int r15 = r2.width()     // Catch:{ OutOfMemoryError -> 0x01b1 }
            int r2 = r2.height()     // Catch:{ OutOfMemoryError -> 0x01b1 }
            android.graphics.Bitmap r15 = android.graphics.Bitmap.createBitmap(r0, r6, r7, r15, r2)     // Catch:{ OutOfMemoryError -> 0x01b1 }
            goto L_0x01b2
        L_0x01b1:
            r15 = r1
        L_0x01b2:
            if (r15 == 0) goto L_0x01f0
            int r14 = r14.o
            int r0 = r15.getWidth()
            if (r0 <= r14) goto L_0x01f0
            int r0 = r15.getHeight()
            if (r0 <= r14) goto L_0x01f0
            java.lang.String r0 = "scale: "
            java.lang.String r1 = ", bitmap width: "
            java.lang.StringBuilder r0 = i0.d.a.a.a.Q0(r0, r14, r1)
            int r1 = r15.getWidth()
            r0.append(r1)
            r0.append(r3)
            int r1 = r15.getHeight()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.instabug.library.util.InstabugSDKLogger.d(r5, r0)
            int r0 = r15.getWidth()
            int r0 = r0 / r14
            int r1 = r15.getHeight()
            int r1 = r1 / r14
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r15, r0, r1, r4)
        L_0x01f0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.c.m.b.m(i0.j.b.o.b.i, android.app.Activity):android.graphics.Bitmap");
    }

    public static void m0(View view, i0.h.a.c.w.g gVar) {
        i0.h.a.c.n.a aVar = gVar.q.b;
        if (aVar != null && aVar.a) {
            float Q = Q(view);
            g.b bVar = gVar.q;
            if (bVar.n != Q) {
                bVar.n = Q;
                gVar.B();
            }
        }
    }

    public static String n(File file) {
        if (file.getName().endsWith(".apk")) {
            String str = "";
            String replaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", str);
            if (replaceFirst.equals("base-master")) {
                return str;
            }
            String str2 = "base-";
            if (replaceFirst.startsWith(str2)) {
                str = "config.";
            } else {
                replaceFirst = replaceFirst.replace("-", ".config.");
                str2 = ".config.master";
            }
            return replaceFirst.replace(str2, str);
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }

    public static PorterDuffColorFilter n0(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    public static List<i> o(i iVar) {
        ArrayList arrayList = new ArrayList();
        if (iVar != null) {
            arrayList.add(iVar);
            if (iVar.h) {
                Iterator<i> it = iVar.g.iterator();
                while (it.hasNext()) {
                    arrayList.addAll(o(it.next()));
                }
            }
        }
        return arrayList;
    }

    public static byte o0(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue() ? (byte) 1 : 0;
        }
        return -1;
    }

    public static JSONObject p(View view) throws JSONException {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("resource_id", (Object) a(view.getContext(), view.getId())).put("height", view.getHeight()).put("width", view.getWidth()).put("padding_top", view.getPaddingTop()).put("padding_bottom", view.getPaddingBottom()).put("padding_right", view.getPaddingRight()).put("padding_left", view.getPaddingLeft()).put("visibility", view.getVisibility());
        jSONObject.put("padding_end", view.getPaddingEnd()).put("padding_start", view.getPaddingStart());
        jSONObject.put("x", (double) view.getX()).put("y", (double) view.getY());
        if (view.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            jSONObject.put("gravity", layoutParams.gravity).put("margin_top", layoutParams.topMargin).put("margin_bottom", layoutParams.bottomMargin).put("margin_left", layoutParams.leftMargin).put("margin_right", layoutParams.rightMargin);
        } else if (view.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
            jSONObject.put("gravity", layoutParams2.gravity).put("margin_top", layoutParams2.topMargin).put("margin_bottom", layoutParams2.bottomMargin).put("margin_left", layoutParams2.leftMargin).put("margin_right", layoutParams2.rightMargin);
        } else if (view.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            Context context = view.getContext();
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) view.getLayoutParams();
            jSONObject.put("margin_top", layoutParams3.topMargin).put("margin_bottom", layoutParams3.bottomMargin).put("margin_left", layoutParams3.leftMargin).put("margin_right", layoutParams3.rightMargin);
            int[] rules = layoutParams3.getRules();
            for (int i = 0; i < rules.length; i++) {
                if (rules[i] > 0) {
                    str = a(context, rules[i]);
                } else {
                    str = String.valueOf(rules[i]);
                }
                switch (i) {
                    case 0:
                        str2 = "leftOf";
                        break;
                    case 1:
                        str2 = "rightOf";
                        break;
                    case 2:
                        str2 = "above";
                        break;
                    case 3:
                        str2 = "below";
                        break;
                    case 4:
                        str2 = "alignBaseline";
                        break;
                    case 5:
                        str2 = "alignLeft";
                        break;
                    case 6:
                        str2 = "alignTop";
                        break;
                    case 7:
                        str2 = "alignRight";
                        break;
                    case 8:
                        str2 = "alignBottom";
                        break;
                    case 9:
                        str2 = "alignParentLeft";
                        break;
                    case 10:
                        str2 = "alignParentTop";
                        break;
                    case 11:
                        str2 = "alignParentRight";
                        break;
                    case 12:
                        str2 = "alignParentBottom";
                        break;
                    case 13:
                        str2 = "centerInParent";
                        break;
                    case 14:
                        str2 = "centerHorizontal";
                        break;
                    case 15:
                        str2 = "centerVertical";
                        break;
                    case 16:
                        str2 = "startOf";
                        break;
                    case 18:
                        str2 = "alignStart";
                        break;
                    case 19:
                        str2 = "alignEnd";
                        break;
                    case 20:
                        str2 = "alignParentStart";
                        break;
                    case 21:
                        str2 = "alignParentEnd";
                        break;
                    default:
                        str2 = "notIdentified";
                        break;
                }
                jSONObject.put(str2, (Object) str);
            }
        }
        return jSONObject;
    }

    public static Boolean p0(byte b2) {
        if (b2 == 0) {
            return Boolean.FALSE;
        }
        if (b2 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    public static void q(FragmentManager fragmentManager, String str, boolean z) {
        int i = com.instabug.bug.R.id.instabug_fragment_container;
        com.instabug.bug.view.reporting.h.a aVar = new com.instabug.bug.view.reporting.h.a();
        Bundle bundle = new Bundle();
        bundle.putString("bug_message", str);
        aVar.setArguments(bundle);
        String str2 = com.instabug.bug.view.reporting.h.a.s2;
        h0.o.a.a aVar2 = new h0.o.a.a(fragmentManager);
        aVar2.o(i, aVar, str2);
        if (z) {
            aVar2.g(str2);
        }
        aVar2.h();
    }

    public static <TResult> TResult q0(i0.h.a.b.m.g<TResult> gVar) throws ExecutionException {
        if (gVar.n()) {
            return gVar.j();
        }
        if (gVar.l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(gVar.i());
    }

    public static void r(@BugReporting.ReportType int... iArr) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i : iArr) {
            InstabugSDKLogger.i("BugReportingWrapper", "setReportTypes: " + i);
            if (i == 0) {
                z = true;
            } else if (i == 1) {
                z2 = true;
            } else if (i == 2) {
                z3 = true;
            }
        }
        i0.j.b.s.a.h().b("bug", z);
        i0.j.b.s.a.h().b("feedback", z2);
        i0.j.b.s.a.h().b("ask a question", z3);
        if (InstabugCore.isFeatureEnabled(Feature.BUG_REPORTING)) {
            InstabugCore.setChatsState(z3 ? Feature.State.ENABLED : Feature.State.DISABLED);
        }
        InvocationManager.getInstance().notifyInvocationOptionChanged();
    }

    public static String r0(zzct zzct) {
        v1 v1Var = new v1(zzct);
        StringBuilder sb = new StringBuilder(zzct.c());
        for (int i = 0; i < v1Var.a.c(); i++) {
            byte b2 = v1Var.a.b(i);
            if (b2 == 34) {
                sb.append("\\\"");
            } else if (b2 == 39) {
                sb.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b2 >= 32 && b2 <= 126) {
                            sb.append((char) b2);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((b2 >>> 6) & 3) + 48));
                            sb.append((char) (((b2 >>> 3) & 7) + 48));
                            sb.append((char) ((b2 & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static <ResultT> ResultT s(i0.h.a.d.a.j.p<ResultT> pVar) throws ExecutionException {
        if (pVar.i()) {
            return pVar.h();
        }
        throw new ExecutionException(pVar.g());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e5, code lost:
        if (((java.lang.Boolean) r4).booleanValue() == false) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01f3, code lost:
        if (((java.lang.Integer) r4).intValue() == 0) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0204, code lost:
        if (((java.lang.Float) r4).floatValue() == 0.0f) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0216, code lost:
        if (((java.lang.Double) r4).doubleValue() == 0.0d) goto L_0x024a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0250  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void s0(i0.h.a.b.g.h.y0 r13, java.lang.StringBuilder r14, int r15) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.TreeSet r2 = new java.util.TreeSet
            r2.<init>()
            java.lang.Class r3 = r13.getClass()
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()
            int r4 = r3.length
            r5 = 0
            r6 = r5
        L_0x001a:
            java.lang.String r7 = "get"
            if (r6 >= r4) goto L_0x0049
            r8 = r3[r6]
            java.lang.String r9 = r8.getName()
            r1.put(r9, r8)
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r9 = r9.length
            if (r9 != 0) goto L_0x0046
            java.lang.String r9 = r8.getName()
            r0.put(r9, r8)
            java.lang.String r9 = r8.getName()
            boolean r7 = r9.startsWith(r7)
            if (r7 == 0) goto L_0x0046
            java.lang.String r7 = r8.getName()
            r2.add(r7)
        L_0x0046:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x0049:
            java.util.Iterator r2 = r2.iterator()
        L_0x004d:
            boolean r3 = r2.hasNext()
            r4 = 3
            if (r3 == 0) goto L_0x0269
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r6 = r3.startsWith(r7)
            if (r6 == 0) goto L_0x0065
            java.lang.String r6 = r3.substring(r4)
            goto L_0x0066
        L_0x0065:
            r6 = r3
        L_0x0066:
            java.lang.String r8 = "List"
            boolean r9 = r6.endsWith(r8)
            r10 = 1
            if (r9 == 0) goto L_0x00ca
            java.lang.String r9 = "OrBuilderList"
            boolean r9 = r6.endsWith(r9)
            if (r9 != 0) goto L_0x00ca
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x00ca
            java.lang.String r8 = r6.substring(r5, r10)
            java.lang.String r8 = r8.toLowerCase()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r6.length()
            int r9 = r9 + -4
            java.lang.String r9 = r6.substring(r10, r9)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r11 = r9.length()
            if (r11 == 0) goto L_0x00a2
            java.lang.String r8 = r8.concat(r9)
            goto L_0x00a8
        L_0x00a2:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r8)
            r8 = r9
        L_0x00a8:
            java.lang.Object r9 = r0.get(r3)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r9 == 0) goto L_0x00ca
            java.lang.Class r11 = r9.getReturnType()
            java.lang.Class<java.util.List> r12 = java.util.List.class
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00ca
            java.lang.String r3 = u0(r8)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Object r4 = i0.h.a.b.g.h.z.g(r9, r13, r4)
            t0(r14, r15, r3, r4)
            goto L_0x004d
        L_0x00ca:
            java.lang.String r8 = "Map"
            boolean r9 = r6.endsWith(r8)
            if (r9 == 0) goto L_0x0136
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x0136
            java.lang.String r8 = r6.substring(r5, r10)
            java.lang.String r8 = r8.toLowerCase()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r6.length()
            int r9 = r9 - r4
            java.lang.String r4 = r6.substring(r10, r9)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r9 = r4.length()
            if (r9 == 0) goto L_0x00fc
            java.lang.String r4 = r8.concat(r4)
            goto L_0x0101
        L_0x00fc:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r8)
        L_0x0101:
            java.lang.Object r3 = r0.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L_0x0136
            java.lang.Class r8 = r3.getReturnType()
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0136
            java.lang.Class<java.lang.Deprecated> r8 = java.lang.Deprecated.class
            boolean r8 = r3.isAnnotationPresent(r8)
            if (r8 != 0) goto L_0x0136
            int r8 = r3.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isPublic(r8)
            if (r8 == 0) goto L_0x0136
            java.lang.String r4 = u0(r4)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Object r3 = i0.h.a.b.g.h.z.g(r3, r13, r6)
            t0(r14, r15, r4, r3)
            goto L_0x004d
        L_0x0136:
            java.lang.String r3 = "set"
            int r4 = r6.length()
            if (r4 == 0) goto L_0x0143
            java.lang.String r3 = r3.concat(r6)
            goto L_0x0149
        L_0x0143:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r3 = r4
        L_0x0149:
            java.lang.Object r3 = r1.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L_0x004d
            java.lang.String r3 = "Bytes"
            boolean r3 = r6.endsWith(r3)
            if (r3 == 0) goto L_0x017d
            int r3 = r6.length()
            int r3 = r3 + -5
            java.lang.String r3 = r6.substring(r5, r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x0172
            java.lang.String r3 = r7.concat(r3)
            goto L_0x0177
        L_0x0172:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r7)
        L_0x0177:
            boolean r3 = r0.containsKey(r3)
            if (r3 != 0) goto L_0x004d
        L_0x017d:
            java.lang.String r3 = r6.substring(r5, r10)
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = r6.substring(r10)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r8 = r4.length()
            if (r8 == 0) goto L_0x019c
            java.lang.String r3 = r3.concat(r4)
            goto L_0x01a2
        L_0x019c:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r3 = r4
        L_0x01a2:
            int r4 = r6.length()
            if (r4 == 0) goto L_0x01ad
            java.lang.String r4 = r7.concat(r6)
            goto L_0x01b2
        L_0x01ad:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r7)
        L_0x01b2:
            java.lang.Object r4 = r0.get(r4)
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r8 = "has"
            int r9 = r6.length()
            if (r9 == 0) goto L_0x01c5
            java.lang.String r6 = r8.concat(r6)
            goto L_0x01ca
        L_0x01c5:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
        L_0x01ca:
            java.lang.Object r6 = r0.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r4 == 0) goto L_0x004d
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r4 = i0.h.a.b.g.h.z.g(r4, r13, r8)
            if (r6 != 0) goto L_0x0252
            boolean r6 = r4 instanceof java.lang.Boolean
            if (r6 == 0) goto L_0x01e8
            r6 = r4
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x024c
            goto L_0x024a
        L_0x01e8:
            boolean r6 = r4 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x01f6
            r6 = r4
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 != 0) goto L_0x024c
            goto L_0x024a
        L_0x01f6:
            boolean r6 = r4 instanceof java.lang.Float
            if (r6 == 0) goto L_0x0207
            r6 = r4
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x024c
            goto L_0x024a
        L_0x0207:
            boolean r6 = r4 instanceof java.lang.Double
            if (r6 == 0) goto L_0x0219
            r6 = r4
            java.lang.Double r6 = (java.lang.Double) r6
            double r8 = r6.doubleValue()
            r11 = 0
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x024c
            goto L_0x024a
        L_0x0219:
            boolean r6 = r4 instanceof java.lang.String
            if (r6 == 0) goto L_0x0224
            java.lang.String r6 = ""
            boolean r6 = r4.equals(r6)
            goto L_0x024d
        L_0x0224:
            boolean r6 = r4 instanceof com.google.android.gms.internal.recaptcha.zzct
            if (r6 == 0) goto L_0x022f
            com.google.android.gms.internal.recaptcha.zzct r6 = com.google.android.gms.internal.recaptcha.zzct.c
            boolean r6 = r4.equals(r6)
            goto L_0x024d
        L_0x022f:
            boolean r6 = r4 instanceof i0.h.a.b.g.h.y0
            if (r6 == 0) goto L_0x023d
            r6 = r4
            i0.h.a.b.g.h.y0 r6 = (i0.h.a.b.g.h.y0) r6
            i0.h.a.b.g.h.y0 r6 = r6.b()
            if (r4 != r6) goto L_0x024c
            goto L_0x024a
        L_0x023d:
            boolean r6 = r4 instanceof java.lang.Enum
            if (r6 == 0) goto L_0x024c
            r6 = r4
            java.lang.Enum r6 = (java.lang.Enum) r6
            int r6 = r6.ordinal()
            if (r6 != 0) goto L_0x024c
        L_0x024a:
            r6 = r10
            goto L_0x024d
        L_0x024c:
            r6 = r5
        L_0x024d:
            if (r6 != 0) goto L_0x0250
            goto L_0x025e
        L_0x0250:
            r10 = r5
            goto L_0x025e
        L_0x0252:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r6 = i0.h.a.b.g.h.z.g(r6, r13, r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r10 = r6.booleanValue()
        L_0x025e:
            if (r10 == 0) goto L_0x004d
            java.lang.String r3 = u0(r3)
            t0(r14, r15, r3, r4)
            goto L_0x004d
        L_0x0269:
            boolean r0 = r13 instanceof i0.h.a.b.g.h.z.d
            if (r0 == 0) goto L_0x02ad
            r0 = r13
            i0.h.a.b.g.h.z$d r0 = (i0.h.a.b.g.h.z.d) r0
            i0.h.a.b.g.h.v<i0.h.a.b.g.h.z$c> r0 = r0.zzc
            boolean r1 = r0.d
            if (r1 == 0) goto L_0x0288
            i0.h.a.b.g.h.g0 r1 = new i0.h.a.b.g.h.g0
            i0.h.a.b.g.h.n1<T, java.lang.Object> r0 = r0.b
            java.util.Set r0 = r0.entrySet()
            i0.h.a.b.g.h.s1 r0 = (i0.h.a.b.g.h.s1) r0
            java.util.Iterator r0 = r0.iterator()
            r1.<init>(r0)
            goto L_0x0294
        L_0x0288:
            i0.h.a.b.g.h.n1<T, java.lang.Object> r0 = r0.b
            java.util.Set r0 = r0.entrySet()
            i0.h.a.b.g.h.s1 r0 = (i0.h.a.b.g.h.s1) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x0294:
            boolean r0 = r1.hasNext()
            if (r0 != 0) goto L_0x029b
            goto L_0x02ad
        L_0x029b:
            java.lang.Object r13 = r1.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r13 = r13.getKey()
            i0.h.a.b.g.h.z$c r13 = (i0.h.a.b.g.h.z.c) r13
            java.lang.NoSuchMethodError r13 = new java.lang.NoSuchMethodError
            r13.<init>()
            throw r13
        L_0x02ad:
            i0.h.a.b.g.h.z r13 = (i0.h.a.b.g.h.z) r13
            i0.h.a.b.g.h.w1 r13 = r13.zzb
            if (r13 == 0) goto L_0x02ca
        L_0x02b3:
            int r0 = r13.b
            if (r5 >= r0) goto L_0x02ca
            int[] r0 = r13.c
            r0 = r0[r5]
            int r0 = r0 >>> r4
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object[] r1 = r13.d
            r1 = r1[r5]
            t0(r14, r15, r0, r1)
            int r5 = r5 + 1
            goto L_0x02b3
        L_0x02ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.c.m.b.s0(i0.h.a.b.g.h.y0, java.lang.StringBuilder, int):void");
    }

    public static void t(FragmentManager fragmentManager, String str, boolean z) {
        int i = com.instabug.bug.R.id.instabug_fragment_container;
        com.instabug.bug.view.reporting.i.a aVar = new com.instabug.bug.view.reporting.i.a();
        Bundle bundle = new Bundle();
        bundle.putString("bug_message", str);
        aVar.setArguments(bundle);
        String str2 = com.instabug.bug.view.reporting.i.a.s2;
        h0.o.a.a aVar2 = new h0.o.a.a(fragmentManager);
        aVar2.o(i, aVar, str2);
        if (z) {
            aVar2.g(str2);
        }
        aVar2.h();
    }

    public static final void t0(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object t02 : (List) obj) {
                t0(sb, i, str, t02);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry t03 : ((Map) obj).entrySet()) {
                t0(sb, i, str, t03);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                zzct zzct = zzct.c;
                sb.append(r0(new zzdd(((String) obj).getBytes(i0.h.a.b.g.h.b0.a))));
                sb.append('\"');
            } else if (obj instanceof zzct) {
                sb.append(": \"");
                sb.append(r0((zzct) obj));
                sb.append('\"');
            } else if (obj instanceof i0.h.a.b.g.h.z) {
                sb.append(" {");
                s0((i0.h.a.b.g.h.z) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                t0(sb, i4, InstabugDbContract.UserAttributesEntry.COLUMN_KEY, entry.getKey());
                t0(sb, i4, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE, entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    @Deprecated
    public static <TResult> i0.h.a.b.m.g<TResult> u(Executor executor, Callable<TResult> callable) {
        v.A(executor, "Executor must not be null");
        v.A(callable, "Callback must not be null");
        b0 b0Var = new b0();
        executor.execute(new d0(b0Var, callable));
        return b0Var;
    }

    public static final String u0(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static int v(int i, int i2) {
        return h0.i.c.a.c(i, (Color.alpha(i) * i2) / 255);
    }

    @NonNull
    public static i0.h.a.d.a.h.a w(@NonNull Context context) {
        int i = PlayCoreDialogWrapperActivity.c;
        J(context.getPackageManager(), new ComponentName(context.getPackageName(), "com.google.android.play.core.common.PlayCoreDialogWrapperActivity"), 1);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new i0.h.a.d.a.h.a(new i0.h.a.d.a.h.e(context));
    }

    public static i0.h.c.j.d<?> x(String str, String str2) {
        i0.h.c.u.a aVar = new i0.h.c.u.a(str, str2);
        d.b<e> a2 = i0.h.c.j.d.a(e.class);
        a2.d = 1;
        a2.d(new c(aVar));
        return a2.c();
    }

    public static Animator y(i0.h.a.c.k.c cVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(cVar, c.C0140c.a, c.b.a, new c.e[]{new c.e(f, f2, f3)});
        c.e revealInfo = cVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f, (int) f2, revealInfo.c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    public static i0.h.a.c.w.d z(int i) {
        if (i == 0) {
            return new i0.h.a.c.w.j();
        }
        if (i != 1) {
            return new i0.h.a.c.w.j();
        }
        return new i0.h.a.c.w.e();
    }
}
