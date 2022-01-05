package g0.a.b.b;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.Trace;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Property;
import android.util.Size;
import android.util.SizeF;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.activity.OnBackPressedDispatcher;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.app.AppOpsManagerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1;
import androidx.lifecycle.CoroutineLiveData;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2;
import androidx.navigation.NavController;
import androidx.navigation.R;
import androidx.navigation.fragment.NavHostFragment;
import androidx.paging.ActiveFlowTracker;
import androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1;
import androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$2;
import androidx.paging.CachedPagingDataKt$cachedIn$1;
import androidx.paging.CachedPagingDataKt$cachedIn$multicastedFlow$2;
import androidx.paging.CachedPagingDataKt$cachedIn$multicastedFlow$4;
import androidx.paging.CachedPagingDataKt$cachedIn$multicastedFlow$5;
import androidx.paging.DiffingChangePayload;
import androidx.paging.FlowExtKt$simpleRunningReduce$1;
import androidx.paging.PageEvent;
import androidx.paging.PagingDataTransforms$filter$$inlined$transform$1;
import androidx.paging.PagingDataTransforms$insertHeaderItem$1;
import androidx.paging.PagingDataTransforms$map$$inlined$transform$1;
import androidx.paging.SeparatorState;
import androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1;
import androidx.paging.SeparatorsKt$insertEventSeparators$separatorState$1;
import androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1;
import androidx.paging.TerminalSeparatorType;
import androidx.recyclerview.widget.RecyclerView;
import com.instabug.library.model.StepType;
import com.instabug.library.network.RequestResponse;
import h0.b.f.d1;
import h0.b.f.z0;
import h0.g.a.h.e;
import h0.g.a.h.g;
import h0.g.a.h.k.m;
import h0.i.b.d.b;
import h0.i.b.d.f;
import h0.i.g.b;
import h0.i.i.j;
import h0.i.i.k;
import h0.i.j.d;
import h0.q.j0;
import h0.q.k0;
import h0.q.l0;
import h0.q.m0;
import h0.q.n0;
import h0.q.w;
import h0.u.c0;
import h0.u.n;
import h0.u.o;
import h0.u.q;
import h0.v.a.g;
import h0.v.a.r;
import h0.v.a.v;
import i0.j.f.p.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import m0.l.c;
import m0.l.e;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;
import n0.a.d0;
import n0.a.f0;
import n0.a.f1;
import n0.a.g2.s;
import n0.a.m0;
import n0.a.x;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: MediaDescriptionCompatApi21 */
public class a {
    public static Field a;
    public static boolean b;
    public static Class<?> c;
    public static boolean d;
    public static Field e;
    public static boolean f;
    public static Field g;
    public static boolean h;
    public static long i;
    public static Method j;

    public static <X> LiveData<X> A(LiveData<X> liveData) {
        w wVar = new w();
        wVar.a(liveData, new j0(wVar));
        return wVar;
    }

    public static void A0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static final <T> h0.u.w<T> B(h0.u.w<T> wVar, p<? super T, ? super c<? super Boolean>, ? extends Object> pVar) {
        i.e(wVar, "$this$filter");
        i.e(pVar, "predicate");
        return new h0.u.w<>(new PagingDataTransforms$filter$$inlined$transform$1(wVar.d, pVar), wVar.e);
    }

    public static List<byte[]> B0(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    public static m C(ConstraintWidget constraintWidget, int i2, ArrayList<m> arrayList, m mVar) {
        int i3;
        int i4;
        if (i2 == 0) {
            i3 = constraintWidget.K0;
        } else {
            i3 = constraintWidget.L0;
        }
        int i5 = 0;
        if (i3 != -1 && (mVar == null || i3 != mVar.c)) {
            int i6 = 0;
            while (true) {
                if (i6 >= arrayList.size()) {
                    break;
                }
                m mVar2 = arrayList.get(i6);
                if (mVar2.c == i3) {
                    if (mVar != null) {
                        mVar.d(i2, mVar2);
                        arrayList.remove(mVar);
                    }
                    mVar = mVar2;
                } else {
                    i6++;
                }
            }
        } else if (i3 != -1) {
            return mVar;
        }
        if (mVar == null) {
            if (constraintWidget instanceof g) {
                g gVar = (g) constraintWidget;
                int i7 = 0;
                while (true) {
                    if (i7 >= gVar.N0) {
                        i4 = -1;
                        break;
                    }
                    ConstraintWidget constraintWidget2 = gVar.M0[i7];
                    if ((i2 == 0 && (i4 = constraintWidget2.K0) != -1) || (i2 == 1 && (i4 = constraintWidget2.L0) != -1)) {
                        break;
                    }
                    i7++;
                }
                if (i4 != -1) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= arrayList.size()) {
                            break;
                        }
                        m mVar3 = arrayList.get(i8);
                        if (mVar3.c == i4) {
                            mVar = mVar3;
                            break;
                        }
                        i8++;
                    }
                }
            }
            if (mVar == null) {
                mVar = new m(i2);
            }
            arrayList.add(mVar);
        }
        if (mVar.a(constraintWidget)) {
            if (constraintWidget instanceof e) {
                e eVar = (e) constraintWidget;
                ConstraintAnchor constraintAnchor = eVar.P0;
                if (eVar.Q0 == 0) {
                    i5 = 1;
                }
                constraintAnchor.c(i5, arrayList, mVar);
            }
            if (i2 == 0) {
                constraintWidget.K0 = mVar.c;
                constraintWidget.K.c(i2, arrayList, mVar);
                constraintWidget.M.c(i2, arrayList, mVar);
            } else {
                constraintWidget.L0 = mVar.c;
                constraintWidget.L.c(i2, arrayList, mVar);
                constraintWidget.O.c(i2, arrayList, mVar);
                constraintWidget.N.c(i2, arrayList, mVar);
            }
            constraintWidget.R.c(i2, arrayList, mVar);
        }
        return mVar;
    }

    public static final int C0(o<?> oVar, n nVar, o<?> oVar2, int i2) {
        int a2;
        i.e(oVar, "$this$transformAnchorIndex");
        i.e(nVar, "diffResult");
        i.e(oVar2, "newList");
        if (!nVar.b) {
            return m0.q.i.c(i2, m0.q.i.f(0, oVar2.e()));
        }
        int b2 = i2 - oVar.b();
        int a3 = oVar.a();
        if (b2 >= 0 && a3 > b2) {
            for (int i3 = 0; i3 <= 29; i3++) {
                int i4 = i3 / 2;
                int i5 = 1;
                if (i3 % 2 == 1) {
                    i5 = -1;
                }
                int i6 = (i4 * i5) + b2;
                if (i6 >= 0 && i6 < oVar.a() && (a2 = nVar.a.a(i6)) != -1) {
                    return oVar2.b() + a2;
                }
            }
        }
        return m0.q.i.c(i2, m0.q.i.f(0, oVar2.e()));
    }

    public static m D(ArrayList<m> arrayList, int i2) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            m mVar = arrayList.get(i3);
            if (i2 == mVar.c) {
                return mVar;
            }
        }
        return null;
    }

    public static <T extends Drawable> T D0(Drawable drawable) {
        return drawable instanceof h0.i.c.m.a ? ((h0.i.c.m.a) drawable).b() : drawable;
    }

    public static final NavController E(Activity activity, int i2) {
        i.f(activity, "$this$findNavController");
        NavController H = H(ActivityCompat.requireViewById(activity, i2));
        if (H != null) {
            i.b(H, "Navigation.findNavController(this, viewId)");
            return H;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean E0(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r5, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r6, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r7, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r8) {
        /*
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r1 = 0
            r2 = 1
            if (r7 == r0) goto L_0x0013
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r7 == r3) goto L_0x0013
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r7 != r4) goto L_0x0011
            if (r5 == r3) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r5 = r1
            goto L_0x0014
        L_0x0013:
            r5 = r2
        L_0x0014:
            if (r8 == r0) goto L_0x0023
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r8 == r7) goto L_0x0023
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r8 != r0) goto L_0x0021
            if (r6 == r7) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r6 = r1
            goto L_0x0024
        L_0x0023:
            r6 = r2
        L_0x0024:
            if (r5 != 0) goto L_0x002a
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r1
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.a.b.b.a.E0(androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour):boolean");
    }

    public static NavController F(View view) {
        NavController H = H(view);
        if (H != null) {
            return H;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    public static final <T> Object F0(Lifecycle lifecycle, Lifecycle.State state, p<? super f0, ? super c<? super T>, ? extends Object> pVar, c<? super T> cVar) {
        d0 d0Var = m0.a;
        return m0.r.t.a.r.m.a1.a.k4(n0.a.h2.o.c.T(), new PausingDispatcherKt$whenStateAtLeast$2(lifecycle, state, pVar, (c) null), cVar);
    }

    public static final NavController G(Fragment fragment) {
        i.f(fragment, "$this$findNavController");
        NavController I0 = NavHostFragment.I0(fragment);
        i.b(I0, "NavHostFragment.findNavController(this)");
        return I0;
    }

    public static ActionMode.Callback G0(TextView textView, ActionMode.Callback callback) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof d) || callback == null) ? callback : new d(callback, textView);
    }

    public static NavController H(View view) {
        NavController navController;
        while (view != null) {
            Object tag = view.getTag(R.id.nav_controller_view_tag);
            if (tag instanceof WeakReference) {
                navController = (NavController) ((WeakReference) tag).get();
            } else {
                navController = tag instanceof NavController ? (NavController) tag : null;
            }
            if (navController != null) {
                return navController;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static void I(Object obj) {
        if (!d) {
            try {
                c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            d = true;
        }
        Class<?> cls = c;
        if (cls != null) {
            if (!f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
                }
                f = true;
            }
            Field field = e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e4) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }

    public static int J(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    public static String K() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder P0 = i0.d.a.a.a.P0(".(");
        P0.append(stackTraceElement.getFileName());
        P0.append(":");
        P0.append(stackTraceElement.getLineNumber());
        P0.append(") ");
        P0.append(stackTraceElement.getMethodName());
        P0.append("()");
        return P0.toString();
    }

    public static h0.i.e.c L(Configuration configuration) {
        return h0.i.e.c.c(configuration.getLocales());
    }

    public static String M() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder P0 = i0.d.a.a.a.P0(".(");
        P0.append(stackTraceElement.getFileName());
        P0.append(":");
        P0.append(stackTraceElement.getLineNumber());
        P0.append(")");
        return P0.toString();
    }

    public static String N(Context context, int i2) {
        if (i2 == -1) {
            return StepType.UNKNOWN;
        }
        try {
            return context.getResources().getResourceEntryName(i2);
        } catch (Exception unused) {
            return i0.d.a.a.a.e0("?", i2);
        }
    }

    public static String O(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return StepType.UNKNOWN;
        }
    }

    public static b P(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2, int i3) {
        b bVar;
        if (U(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i4 = typedValue.type;
            if (i4 >= 28 && i4 <= 31) {
                return new b((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                bVar = b.a(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            } catch (Exception e2) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                bVar = null;
            }
            if (bVar != null) {
                return bVar;
            }
        }
        return new b((Shader) null, (ColorStateList) null, i3);
    }

    public static String Q(MotionLayout motionLayout, int i2) {
        if (i2 == -1) {
            return "UNDEFINED";
        }
        return motionLayout.getContext().getResources().getResourceEntryName(i2);
    }

    public static File R(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        StringBuilder P0 = i0.d.a.a.a.P0(".font");
        P0.append(Process.myPid());
        P0.append("-");
        P0.append(Process.myTid());
        P0.append("-");
        String sb = P0.toString();
        int i2 = 0;
        while (i2 < 100) {
            File file = new File(cacheDir, i0.d.a.a.a.e0(sb, i2));
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i2++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static b.a S(TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new b.a(textView.getTextMetricsParams());
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = textView.getBreakStrategy();
        int hyphenationFrequency = textView.getHyphenationFrequency();
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z = false;
            if (i2 < 28 || (textView.getInputType() & 15) != 3) {
                if (textView.getLayoutDirection() == 1) {
                    z = true;
                }
                switch (textView.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (!z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            break;
                        } else {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                }
            } else {
                byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
                if (directionality == 1 || directionality == 2) {
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                } else {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                }
            }
        }
        return new b.a(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static final f0 T(k0 k0Var) {
        i.e(k0Var, "$this$viewModelScope");
        f0 f0Var = (f0) k0Var.getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (f0Var != null) {
            return f0Var;
        }
        x z = m0.r.t.a.r.m.a1.a.z((f1) null, 1);
        d0 d0Var = m0.a;
        Object tagIfAbsent = k0Var.setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new h0.q.e(e.a.C0242a.d((JobSupport) z, n0.a.h2.o.c.T())));
        i.d(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (f0) tagIfAbsent;
    }

    public static boolean U(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int V(int i2) {
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 32) {
            return 5;
        }
        if (i2 == 64) {
            return 6;
        }
        if (i2 == 128) {
            return 7;
        }
        if (i2 == 256) {
            return 8;
        }
        throw new IllegalArgumentException(i0.d.a.a.a.e0("type needs to be >= FIRST and <= LAST, type=", i2));
    }

    public static h0.u.w W(h0.u.w wVar, TerminalSeparatorType terminalSeparatorType, Object obj, int i2) {
        TerminalSeparatorType terminalSeparatorType2 = (i2 & 1) != 0 ? TerminalSeparatorType.FULLY_COMPLETE : null;
        i.e(wVar, "$this$insertHeaderItem");
        i.e(terminalSeparatorType2, "terminalSeparatorType");
        i.e(obj, "item");
        PagingDataTransforms$insertHeaderItem$1 pagingDataTransforms$insertHeaderItem$1 = new PagingDataTransforms$insertHeaderItem$1(obj, (c) null);
        i.e(wVar, "$this$insertSeparators");
        i.e(terminalSeparatorType2, "terminalSeparatorType");
        i.e(pagingDataTransforms$insertHeaderItem$1, "generator");
        n0.a.g2.d<PageEvent<T>> dVar = wVar.d;
        i.e(dVar, "$this$insertEventSeparators");
        i.e(terminalSeparatorType2, "terminalSeparatorType");
        i.e(pagingDataTransforms$insertHeaderItem$1, "generator");
        return new h0.u.w(new SeparatorsKt$insertEventSeparators$$inlined$map$1(dVar, new SeparatorState(terminalSeparatorType2, new SeparatorsKt$insertEventSeparators$separatorState$1(pagingDataTransforms$insertHeaderItem$1, (c) null))), wVar.e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0077, code lost:
        r13 = (java.lang.Integer) m0.j.g.u(r13);
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R, T extends R> java.lang.Object X(h0.u.f0<T> r11, m0.n.a.q<? super T, ? super T, ? super m0.l.c<? super R>, ? extends java.lang.Object> r12, m0.l.c<? super h0.u.f0<R>> r13) {
        /*
            boolean r0 = r13 instanceof androidx.paging.SeparatorsKt$insertInternalSeparators$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            androidx.paging.SeparatorsKt$insertInternalSeparators$1 r0 = (androidx.paging.SeparatorsKt$insertInternalSeparators$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.SeparatorsKt$insertInternalSeparators$1 r0 = new androidx.paging.SeparatorsKt$insertInternalSeparators$1
            r0.<init>(r13)
        L_0x0018:
            java.lang.Object r13 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 != r3) goto L_0x0044
            int r11 = r0.b2
            int r12 = r0.a2
            java.lang.Object r2 = r0.Z1
            java.lang.Object r4 = r0.Y1
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r5 = r0.y
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r6 = r0.x
            m0.n.a.q r6 = (m0.n.a.q) r6
            java.lang.Object r7 = r0.q
            h0.u.f0 r7 = (h0.u.f0) r7
            i0.j.f.p.h.d4(r13)
            r9 = r1
            r1 = r0
            r0 = r6
            r6 = r5
            r5 = r4
            r4 = r9
            goto L_0x00ca
        L_0x0044:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x004c:
            i0.j.f.p.h.d4(r13)
            java.util.List<T> r13 = r11.d
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L_0x0058
            return r11
        L_0x0058:
            java.util.List<T> r13 = r11.d
            int r13 = r13.size()
            int r13 = r13 + 4
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r13)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r13)
            java.util.List<T> r13 = r11.d
            java.lang.Object r13 = m0.j.g.u(r13)
            r2.add(r13)
            java.util.List<java.lang.Integer> r13 = r11.f
            if (r13 == 0) goto L_0x0084
            java.lang.Object r13 = m0.j.g.u(r13)
            java.lang.Integer r13 = (java.lang.Integer) r13
            if (r13 == 0) goto L_0x0084
            int r13 = r13.intValue()
            goto L_0x0085
        L_0x0084:
            r13 = 0
        L_0x0085:
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r13)
            r4.add(r5)
            java.util.List<T> r13 = r11.d
            int r13 = r13.size()
            r5 = r2
            r2 = r1
            r1 = r0
            r0 = r12
            r12 = r11
            r11 = r13
            r13 = r3
        L_0x009a:
            if (r13 >= r11) goto L_0x00e9
            java.util.List<T> r6 = r12.d
            java.lang.Object r6 = r6.get(r13)
            java.util.List<T> r7 = r12.d
            int r8 = r13 + -1
            java.lang.Object r7 = r7.get(r8)
            r1.q = r12
            r1.x = r0
            r1.y = r5
            r1.Y1 = r4
            r1.Z1 = r6
            r1.a2 = r13
            r1.b2 = r11
            r1.d = r3
            java.lang.Object r7 = r0.invoke(r7, r6, r1)
            if (r7 != r2) goto L_0x00c1
            return r2
        L_0x00c1:
            r9 = r7
            r7 = r12
            r12 = r13
            r13 = r9
            r10 = r4
            r4 = r2
            r2 = r6
            r6 = r5
            r5 = r10
        L_0x00ca:
            if (r13 == 0) goto L_0x00d7
            r6.add(r13)
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r12)
            r5.add(r13)
        L_0x00d7:
            r6.add(r2)
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r12)
            r5.add(r13)
            int r13 = r12 + 1
            r2 = r4
            r4 = r5
            r5 = r6
            r12 = r7
            goto L_0x009a
        L_0x00e9:
            int r11 = r5.size()
            java.util.List<T> r13 = r12.d
            int r13 = r13.size()
            if (r11 != r13) goto L_0x00f6
            goto L_0x0100
        L_0x00f6:
            h0.u.f0 r11 = new h0.u.f0
            int[] r13 = r12.c
            int r12 = r12.e
            r11.<init>(r13, r5, r12, r4)
            r12 = r11
        L_0x0100:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.a.b.b.a.X(h0.u.f0, m0.n.a.q, m0.l.c):java.lang.Object");
    }

    public static boolean Y(Rect rect, Rect rect2, int i2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            if ((i3 > i4 || rect.left >= i4) && rect.left > rect2.left) {
                return true;
            }
            return false;
        } else if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if ((i5 > i6 || rect.top >= i6) && rect.top > rect2.top) {
                return true;
            }
            return false;
        } else if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
                return true;
            }
            return false;
        } else if (i2 == 130) {
            int i9 = rect.top;
            int i10 = rect2.top;
            return (i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    @SuppressLint({"NewApi"})
    public static boolean Z() {
        try {
            if (j == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (j == null) {
                i = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                j = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) j.invoke((Object) null, new Object[]{Long.valueOf(i)})).booleanValue();
        } catch (Exception e2) {
            if (e2 instanceof InvocationTargetException) {
                Throwable cause = e2.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
            return false;
        }
    }

    public static h0.a.b a(OnBackPressedDispatcher onBackPressedDispatcher, h0.q.p pVar, boolean z, l lVar, int i2) {
        if ((i2 & 1) != 0) {
            pVar = null;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        i.e(onBackPressedDispatcher, "$this$addCallback");
        i.e(lVar, "onBackPressed");
        h0.a.c cVar = new h0.a.c(lVar, z, z);
        if (pVar != null) {
            onBackPressedDispatcher.a(pVar, cVar);
        } else {
            onBackPressedDispatcher.b.add(cVar);
            cVar.b.add(new OnBackPressedDispatcher.a(cVar));
        }
        return cVar;
    }

    public static LiveData a0(m0.l.e eVar, long j2, p pVar, int i2) {
        EmptyCoroutineContext emptyCoroutineContext = (i2 & 1) != 0 ? EmptyCoroutineContext.c : null;
        if ((i2 & 2) != 0) {
            j2 = 5000;
        }
        i.e(emptyCoroutineContext, "context");
        i.e(pVar, "block");
        return new CoroutineLiveData(emptyCoroutineContext, j2, pVar);
    }

    public static final <R, T extends R> void b(List<h0.u.f0<R>> list, R r, h0.u.f0<T> f0Var, h0.u.f0<T> f0Var2, int i2, int i3) {
        i.e(list, "$this$addSeparatorPage");
        int[] iArr = null;
        int[] iArr2 = f0Var != null ? f0Var.c : null;
        if (f0Var2 != null) {
            iArr = f0Var2.c;
        }
        if (iArr2 != null && iArr != null) {
            i.e(iArr2, "$this$plus");
            i.e(iArr, "elements");
            int length = iArr2.length;
            int length2 = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr2, length + length2);
            System.arraycopy(iArr, 0, copyOf, length, length2);
            i.d(copyOf, "result");
            i.e(copyOf, "$this$distinct");
            i.e(copyOf, "$this$toMutableSet");
            LinkedHashSet linkedHashSet = new LinkedHashSet(h.R2(copyOf.length));
            i.e(copyOf, "$this$toCollection");
            i.e(linkedHashSet, "destination");
            for (int valueOf : copyOf) {
                linkedHashSet.add(Integer.valueOf(valueOf));
            }
            iArr2 = m0.j.g.u0(m0.j.g.m0(m0.j.g.v0(linkedHashSet)));
        } else if (iArr2 == null && iArr != null) {
            iArr2 = iArr;
        } else if (iArr2 == null || iArr != null) {
            throw new IllegalArgumentException("Separator page expected adjacentPageBefore or adjacentPageAfter, but both were null.");
        }
        i.e(list, "$this$addSeparatorPage");
        i.e(iArr2, "originalPageOffsets");
        if (r != null) {
            list.add(q0(r, iArr2, i2, i3));
        }
    }

    public static h0.o.a.o b0(Context context, Fragment fragment, boolean z, boolean z2) {
        int i2;
        int i3;
        int nextTransition = fragment.getNextTransition();
        if (z2) {
            if (z) {
                i2 = fragment.getPopEnterAnim();
            } else {
                i2 = fragment.getPopExitAnim();
            }
        } else if (z) {
            i2 = fragment.getEnterAnim();
        } else {
            i2 = fragment.getExitAnim();
        }
        boolean z3 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i4 = androidx.fragment.R.id.visible_removing_fragment_view_tag;
            if (viewGroup.getTag(i4) != null) {
                fragment.mContainer.setTag(i4, (Object) null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, i2);
        if (onCreateAnimation != null) {
            return new h0.o.a.o(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, i2);
        if (onCreateAnimator != null) {
            return new h0.o.a.o(onCreateAnimator);
        }
        if (i2 == 0 && nextTransition != 0) {
            if (nextTransition != 4097) {
                i3 = nextTransition != 4099 ? nextTransition != 8194 ? -1 : z ? androidx.fragment.R.animator.fragment_close_enter : androidx.fragment.R.animator.fragment_close_exit : z ? androidx.fragment.R.animator.fragment_fade_enter : androidx.fragment.R.animator.fragment_fade_exit;
            } else {
                i3 = z ? androidx.fragment.R.animator.fragment_open_enter : androidx.fragment.R.animator.fragment_open_exit;
            }
            i2 = i3;
        }
        if (i2 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(i2));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, i2);
                    if (loadAnimation != null) {
                        return new h0.o.a.o(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, i2);
                    if (loadAnimator != null) {
                        return new h0.o.a.o(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i2);
                        if (loadAnimation2 != null) {
                            return new h0.o.a.o(loadAnimation2);
                        }
                    } else {
                        throw e3;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01eb, code lost:
        if (r5 == r6) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01fe, code lost:
        if (r5 == 2) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0206, code lost:
        r22 = r21;
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x02df, code lost:
        if (r3[r16].f.d == r6) goto L_0x02e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x014c, code lost:
        if (r4[r2].f.d == r5) goto L_0x0150;
     */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0364  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0498 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0502 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0592  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x05f1  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x05f3  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x0609  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x060c  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x0612  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x06ce  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x0716  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0718  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x0723  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0726  */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x072c  */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x072f  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x0733  */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x0742  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0745  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0155  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(h0.g.a.h.c r35, h0.g.a.d r36, java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r37, int r38) {
        /*
            r0 = r35
            r10 = r36
            r11 = r37
            r12 = 2
            if (r38 != 0) goto L_0x0012
            int r1 = r0.V0
            h0.g.a.h.b[] r2 = r0.Y0
            r14 = r1
            r15 = r2
            r16 = 0
            goto L_0x001a
        L_0x0012:
            int r1 = r0.W0
            h0.g.a.h.b[] r2 = r0.X0
            r14 = r1
            r15 = r2
            r16 = r12
        L_0x001a:
            r9 = 0
        L_0x001b:
            if (r9 >= r14) goto L_0x0775
            r1 = r15[r9]
            boolean r2 = r1.t
            r17 = 0
            r8 = 8
            r4 = 1
            if (r2 != 0) goto L_0x01a7
            int r2 = r1.o
            int r2 = r2 * r12
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r1.a
            r6 = r5
            r7 = 0
        L_0x002f:
            if (r7 != 0) goto L_0x0161
            int r13 = r1.i
            int r13 = r13 + r4
            r1.i = r13
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r13 = r5.H0
            int r3 = r1.o
            r13[r3] = r17
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r13 = r5.G0
            r13[r3] = r17
            int r13 = r5.f8o0
            if (r13 == r8) goto L_0x0126
            int r13 = r1.l
            int r13 = r13 + r4
            r1.l = r13
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r5.p(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 == r13) goto L_0x0067
            int r3 = r1.m
            int r8 = r1.o
            if (r8 != 0) goto L_0x005c
            int r8 = r5.w()
            goto L_0x0064
        L_0x005c:
            if (r8 != r4) goto L_0x0063
            int r8 = r5.q()
            goto L_0x0064
        L_0x0063:
            r8 = 0
        L_0x0064:
            int r3 = r3 + r8
            r1.m = r3
        L_0x0067:
            int r3 = r1.m
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r8 = r5.S
            r8 = r8[r2]
            int r8 = r8.e()
            int r8 = r8 + r3
            r1.m = r8
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r5.S
            int r20 = r2 + 1
            r3 = r3[r20]
            int r3 = r3.e()
            int r3 = r3 + r8
            r1.m = r3
            int r3 = r1.n
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r8 = r5.S
            r8 = r8[r2]
            int r8 = r8.e()
            int r8 = r8 + r3
            r1.n = r8
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r5.S
            r3 = r3[r20]
            int r3 = r3.e()
            int r3 = r3 + r8
            r1.n = r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r1.b
            if (r3 != 0) goto L_0x009f
            r1.b = r5
        L_0x009f:
            r1.d = r5
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r5.V
            int r8 = r1.o
            r4 = r3[r8]
            if (r4 != r13) goto L_0x0126
            int[] r4 = r5.s
            r21 = r4[r8]
            r12 = 3
            if (r21 == 0) goto L_0x00bf
            r21 = r7
            r7 = r4[r8]
            if (r7 == r12) goto L_0x00c1
            r7 = r4[r8]
            r12 = 2
            if (r7 != r12) goto L_0x00bc
            goto L_0x00c1
        L_0x00bc:
            r23 = r9
            goto L_0x0123
        L_0x00bf:
            r21 = r7
        L_0x00c1:
            int r7 = r1.j
            r12 = 1
            int r7 = r7 + r12
            r1.j = r7
            float[] r7 = r5.F0
            r12 = r7[r8]
            r18 = 0
            int r23 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r23 <= 0) goto L_0x00db
            r23 = r9
            float r9 = r1.k
            r7 = r7[r8]
            float r9 = r9 + r7
            r1.k = r9
            goto L_0x00dd
        L_0x00db:
            r23 = r9
        L_0x00dd:
            int r7 = r5.f8o0
            r9 = 8
            if (r7 == r9) goto L_0x00f2
            r3 = r3[r8]
            if (r3 != r13) goto L_0x00f2
            r3 = r4[r8]
            if (r3 == 0) goto L_0x00f0
            r3 = r4[r8]
            r4 = 3
            if (r3 != r4) goto L_0x00f2
        L_0x00f0:
            r3 = 1
            goto L_0x00f3
        L_0x00f2:
            r3 = 0
        L_0x00f3:
            if (r3 == 0) goto L_0x0111
            r3 = 0
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x00fe
            r3 = 1
            r1.q = r3
            goto L_0x0101
        L_0x00fe:
            r3 = 1
            r1.r = r3
        L_0x0101:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r3 = r1.h
            if (r3 != 0) goto L_0x010c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.h = r3
        L_0x010c:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r3 = r1.h
            r3.add(r5)
        L_0x0111:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r1.f
            if (r3 != 0) goto L_0x0117
            r1.f = r5
        L_0x0117:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r1.g
            if (r3 == 0) goto L_0x0121
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r3 = r3.G0
            int r4 = r1.o
            r3[r4] = r5
        L_0x0121:
            r1.g = r5
        L_0x0123:
            int r3 = r1.o
            goto L_0x012a
        L_0x0126:
            r21 = r7
            r23 = r9
        L_0x012a:
            if (r6 == r5) goto L_0x0132
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r3 = r6.H0
            int r4 = r1.o
            r3[r4] = r5
        L_0x0132:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r5.S
            int r4 = r2 + 1
            r3 = r3[r4]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f
            if (r3 == 0) goto L_0x014e
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.d
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r3.S
            r6 = r4[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.f
            if (r6 == 0) goto L_0x014e
            r4 = r4[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.f
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r4.d
            if (r4 == r5) goto L_0x0150
        L_0x014e:
            r3 = r17
        L_0x0150:
            if (r3 == 0) goto L_0x0155
            r7 = r21
            goto L_0x0157
        L_0x0155:
            r3 = r5
            r7 = 1
        L_0x0157:
            r6 = r5
            r9 = r23
            r4 = 1
            r8 = 8
            r12 = 2
            r5 = r3
            goto L_0x002f
        L_0x0161:
            r23 = r9
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r1.b
            if (r3 == 0) goto L_0x0174
            int r4 = r1.m
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r3.S
            r3 = r3[r2]
            int r3 = r3.e()
            int r4 = r4 - r3
            r1.m = r4
        L_0x0174:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r1.d
            if (r3 == 0) goto L_0x0187
            int r4 = r1.m
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r3.S
            int r2 = r2 + 1
            r2 = r3[r2]
            int r2 = r2.e()
            int r4 = r4 - r2
            r1.m = r4
        L_0x0187:
            r1.c = r5
            int r2 = r1.o
            if (r2 != 0) goto L_0x0194
            boolean r2 = r1.p
            if (r2 == 0) goto L_0x0194
            r1.e = r5
            goto L_0x0198
        L_0x0194:
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r1.a
            r1.e = r2
        L_0x0198:
            boolean r2 = r1.r
            if (r2 == 0) goto L_0x01a2
            boolean r2 = r1.q
            if (r2 == 0) goto L_0x01a2
            r2 = 1
            goto L_0x01a3
        L_0x01a2:
            r2 = 0
        L_0x01a3:
            r1.s = r2
            r2 = 1
            goto L_0x01aa
        L_0x01a7:
            r23 = r9
            r2 = r4
        L_0x01aa:
            r1.t = r2
            if (r11 == 0) goto L_0x01bf
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r1.a
            boolean r2 = r11.contains(r2)
            if (r2 == 0) goto L_0x01b7
            goto L_0x01bf
        L_0x01b7:
            r29 = r14
            r27 = r15
            r25 = r23
            goto L_0x0768
        L_0x01bf:
            androidx.constraintlayout.core.widgets.ConstraintWidget r12 = r1.a
            androidx.constraintlayout.core.widgets.ConstraintWidget r13 = r1.c
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r1.b
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r1.d
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r1.e
            float r3 = r1.k
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r0.V
            r4 = r4[r38]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 != r5) goto L_0x01d5
            r4 = 1
            goto L_0x01d6
        L_0x01d5:
            r4 = 0
        L_0x01d6:
            if (r38 != 0) goto L_0x01ee
            int r5 = r2.B0
            r6 = 1
            if (r5 != 0) goto L_0x01e0
            r20 = 1
            goto L_0x01e2
        L_0x01e0:
            r20 = 0
        L_0x01e2:
            if (r5 != r6) goto L_0x01e7
            r7 = r6
            r6 = 2
            goto L_0x01e9
        L_0x01e7:
            r6 = 2
            r7 = 0
        L_0x01e9:
            r21 = r20
            if (r5 != r6) goto L_0x0206
            goto L_0x0200
        L_0x01ee:
            r6 = 2
            int r5 = r2.C0
            r7 = 1
            if (r5 != 0) goto L_0x01f7
            r21 = 1
            goto L_0x01f9
        L_0x01f7:
            r21 = 0
        L_0x01f9:
            if (r5 != r7) goto L_0x01fd
            r7 = 1
            goto L_0x01fe
        L_0x01fd:
            r7 = 0
        L_0x01fe:
            if (r5 != r6) goto L_0x0206
        L_0x0200:
            r22 = r21
            r5 = 1
        L_0x0203:
            r21 = r7
            goto L_0x020a
        L_0x0206:
            r22 = r21
            r5 = 0
            goto L_0x0203
        L_0x020a:
            r24 = r3
            r6 = r12
            r7 = 0
        L_0x020e:
            if (r7 != 0) goto L_0x02f6
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r6.S
            r3 = r3[r16]
            if (r5 == 0) goto L_0x0219
            r26 = 1
            goto L_0x021b
        L_0x0219:
            r26 = 4
        L_0x021b:
            int r27 = r3.e()
            r28 = r7
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r7 = r6.V
            r7 = r7[r38]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 != r11) goto L_0x0233
            int[] r7 = r6.s
            r7 = r7[r38]
            if (r7 != 0) goto L_0x0233
            r29 = r14
            r7 = 1
            goto L_0x0236
        L_0x0233:
            r29 = r14
            r7 = 0
        L_0x0236:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r3.f
            if (r14 == 0) goto L_0x0242
            if (r6 == r12) goto L_0x0242
            int r14 = r14.e()
            int r27 = r14 + r27
        L_0x0242:
            r14 = r27
            if (r5 == 0) goto L_0x024f
            if (r6 == r12) goto L_0x024f
            if (r6 == r9) goto L_0x024f
            r27 = r15
            r26 = 8
            goto L_0x0251
        L_0x024f:
            r27 = r15
        L_0x0251:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r3.f
            if (r15 == 0) goto L_0x028f
            if (r6 != r9) goto L_0x0264
            r30 = r2
            androidx.constraintlayout.core.SolverVariable r2 = r3.i
            androidx.constraintlayout.core.SolverVariable r15 = r15.i
            r31 = r12
            r12 = 6
            r10.f(r2, r15, r14, r12)
            goto L_0x0271
        L_0x0264:
            r30 = r2
            r31 = r12
            androidx.constraintlayout.core.SolverVariable r2 = r3.i
            androidx.constraintlayout.core.SolverVariable r12 = r15.i
            r15 = 8
            r10.f(r2, r12, r14, r15)
        L_0x0271:
            if (r7 == 0) goto L_0x0277
            if (r5 != 0) goto L_0x0277
            r26 = 5
        L_0x0277:
            if (r6 != r9) goto L_0x0283
            if (r5 == 0) goto L_0x0283
            boolean[] r2 = r6.U
            boolean r2 = r2[r38]
            if (r2 == 0) goto L_0x0283
            r2 = 5
            goto L_0x0285
        L_0x0283:
            r2 = r26
        L_0x0285:
            androidx.constraintlayout.core.SolverVariable r7 = r3.i
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f
            androidx.constraintlayout.core.SolverVariable r3 = r3.i
            r10.d(r7, r3, r14, r2)
            goto L_0x0293
        L_0x028f:
            r30 = r2
            r31 = r12
        L_0x0293:
            if (r4 == 0) goto L_0x02c5
            int r2 = r6.f8o0
            r3 = 8
            if (r2 == r3) goto L_0x02b3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r6.V
            r2 = r2[r38]
            if (r2 != r11) goto L_0x02b3
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r6.S
            int r3 = r16 + 1
            r3 = r2[r3]
            androidx.constraintlayout.core.SolverVariable r3 = r3.i
            r2 = r2[r16]
            androidx.constraintlayout.core.SolverVariable r2 = r2.i
            r7 = 5
            r11 = 0
            r10.f(r3, r2, r11, r7)
            goto L_0x02b4
        L_0x02b3:
            r11 = 0
        L_0x02b4:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r6.S
            r2 = r2[r16]
            androidx.constraintlayout.core.SolverVariable r2 = r2.i
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r0.S
            r3 = r3[r16]
            androidx.constraintlayout.core.SolverVariable r3 = r3.i
            r7 = 8
            r10.f(r2, r3, r11, r7)
        L_0x02c5:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r6.S
            int r3 = r16 + 1
            r2 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f
            if (r2 == 0) goto L_0x02e1
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.d
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r2.S
            r7 = r3[r16]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.f
            if (r7 == 0) goto L_0x02e1
            r3 = r3[r16]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.d
            if (r3 == r6) goto L_0x02e3
        L_0x02e1:
            r2 = r17
        L_0x02e3:
            if (r2 == 0) goto L_0x02e9
            r6 = r2
            r7 = r28
            goto L_0x02ea
        L_0x02e9:
            r7 = 1
        L_0x02ea:
            r11 = r37
            r15 = r27
            r14 = r29
            r2 = r30
            r12 = r31
            goto L_0x020e
        L_0x02f6:
            r30 = r2
            r31 = r12
            r29 = r14
            r27 = r15
            if (r8 == 0) goto L_0x0361
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r13.S
            int r3 = r16 + 1
            r2 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f
            if (r2 == 0) goto L_0x0361
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r8.S
            r2 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r6 = r8.V
            r6 = r6[r38]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 != r7) goto L_0x031e
            int[] r6 = r8.s
            r6 = r6[r38]
            if (r6 != 0) goto L_0x031e
            r6 = 1
            goto L_0x031f
        L_0x031e:
            r6 = 0
        L_0x031f:
            if (r6 == 0) goto L_0x0337
            if (r5 != 0) goto L_0x0337
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r2.f
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r6.d
            if (r7 != r0) goto L_0x0337
            androidx.constraintlayout.core.SolverVariable r7 = r2.i
            androidx.constraintlayout.core.SolverVariable r6 = r6.i
            int r11 = r2.e()
            int r11 = -r11
            r12 = 5
            r10.d(r7, r6, r11, r12)
            goto L_0x034d
        L_0x0337:
            r12 = 5
            if (r5 == 0) goto L_0x034d
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r2.f
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r6.d
            if (r7 != r0) goto L_0x034d
            androidx.constraintlayout.core.SolverVariable r7 = r2.i
            androidx.constraintlayout.core.SolverVariable r6 = r6.i
            int r11 = r2.e()
            int r11 = -r11
            r14 = 4
            r10.d(r7, r6, r11, r14)
        L_0x034d:
            androidx.constraintlayout.core.SolverVariable r6 = r2.i
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = r13.S
            r3 = r7[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f
            androidx.constraintlayout.core.SolverVariable r3 = r3.i
            int r2 = r2.e()
            int r2 = -r2
            r7 = 6
            r10.g(r6, r3, r2, r7)
            goto L_0x0362
        L_0x0361:
            r12 = 5
        L_0x0362:
            if (r4 == 0) goto L_0x037d
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r0.S
            int r3 = r16 + 1
            r2 = r2[r3]
            androidx.constraintlayout.core.SolverVariable r2 = r2.i
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r13.S
            r6 = r4[r3]
            androidx.constraintlayout.core.SolverVariable r6 = r6.i
            r3 = r4[r3]
            int r3 = r3.e()
            r4 = 8
            r10.f(r2, r6, r3, r4)
        L_0x037d:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r2 = r1.h
            if (r2 == 0) goto L_0x0496
            int r3 = r2.size()
            r4 = 1
            if (r3 <= r4) goto L_0x0496
            boolean r6 = r1.q
            if (r6 == 0) goto L_0x0394
            boolean r6 = r1.s
            if (r6 != 0) goto L_0x0394
            int r6 = r1.j
            float r6 = (float) r6
            goto L_0x0396
        L_0x0394:
            r6 = r24
        L_0x0396:
            r14 = r17
            r7 = 0
            r11 = 0
        L_0x039a:
            if (r11 >= r3) goto L_0x0496
            java.lang.Object r15 = r2.get(r11)
            androidx.constraintlayout.core.widgets.ConstraintWidget r15 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r15
            float[] r4 = r15.F0
            r4 = r4[r38]
            r18 = 0
            int r24 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r24 >= 0) goto L_0x03c6
            boolean r4 = r1.s
            if (r4 == 0) goto L_0x03c2
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r15.S
            int r12 = r16 + 1
            r12 = r4[r12]
            androidx.constraintlayout.core.SolverVariable r12 = r12.i
            r4 = r4[r16]
            androidx.constraintlayout.core.SolverVariable r4 = r4.i
            r0 = 0
            r15 = 4
            r10.d(r12, r4, r0, r15)
            goto L_0x03df
        L_0x03c2:
            r0 = 4
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x03c7
        L_0x03c6:
            r0 = 4
        L_0x03c7:
            r18 = 0
            int r24 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r24 != 0) goto L_0x03e7
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r15.S
            int r12 = r16 + 1
            r12 = r4[r12]
            androidx.constraintlayout.core.SolverVariable r12 = r12.i
            r4 = r4[r16]
            androidx.constraintlayout.core.SolverVariable r4 = r4.i
            r0 = 0
            r15 = 8
            r10.d(r12, r4, r0, r15)
        L_0x03df:
            r32 = r2
            r25 = r3
            r18 = 0
            goto L_0x048a
        L_0x03e7:
            r0 = 0
            if (r14 == 0) goto L_0x047c
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r14 = r14.S
            r0 = r14[r16]
            androidx.constraintlayout.core.SolverVariable r0 = r0.i
            int r25 = r16 + 1
            r14 = r14[r25]
            androidx.constraintlayout.core.SolverVariable r14 = r14.i
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r12 = r15.S
            r32 = r2
            r2 = r12[r16]
            androidx.constraintlayout.core.SolverVariable r2 = r2.i
            r12 = r12[r25]
            androidx.constraintlayout.core.SolverVariable r12 = r12.i
            r25 = r3
            h0.g.a.b r3 = r36.m()
            r33 = r15
            r15 = 0
            r3.b = r15
            int r18 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r18 == 0) goto L_0x045d
            int r18 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r18 != 0) goto L_0x0418
            goto L_0x045d
        L_0x0418:
            r18 = 0
            int r34 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r34 != 0) goto L_0x042b
            h0.g.a.b$a r2 = r3.d
            r7 = 1065353216(0x3f800000, float:1.0)
            r2.d(r0, r7)
            h0.g.a.b$a r0 = r3.d
            r0.d(r14, r15)
            goto L_0x043b
        L_0x042b:
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r24 != 0) goto L_0x043e
            h0.g.a.b$a r0 = r3.d
            r0.d(r2, r15)
            h0.g.a.b$a r0 = r3.d
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.d(r12, r2)
        L_0x043b:
            r24 = r4
            goto L_0x0478
        L_0x043e:
            float r7 = r7 / r6
            float r24 = r4 / r6
            float r7 = r7 / r24
            r24 = r4
            h0.g.a.b$a r4 = r3.d
            r4.d(r0, r15)
            h0.g.a.b$a r0 = r3.d
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.d(r14, r4)
            h0.g.a.b$a r0 = r3.d
            r0.d(r12, r7)
            h0.g.a.b$a r0 = r3.d
            float r4 = -r7
            r0.d(r2, r4)
            goto L_0x0478
        L_0x045d:
            r24 = r4
            r4 = r15
            r15 = 1065353216(0x3f800000, float:1.0)
            r18 = 0
            h0.g.a.b$a r7 = r3.d
            r7.d(r0, r15)
            h0.g.a.b$a r0 = r3.d
            r0.d(r14, r4)
            h0.g.a.b$a r0 = r3.d
            r0.d(r12, r15)
            h0.g.a.b$a r0 = r3.d
            r0.d(r2, r4)
        L_0x0478:
            r10.c(r3)
            goto L_0x0486
        L_0x047c:
            r32 = r2
            r25 = r3
            r24 = r4
            r33 = r15
            r18 = 0
        L_0x0486:
            r7 = r24
            r14 = r33
        L_0x048a:
            int r11 = r11 + 1
            r3 = r25
            r2 = r32
            r4 = 1
            r12 = 5
            r0 = r35
            goto L_0x039a
        L_0x0496:
            if (r9 == 0) goto L_0x04f9
            if (r9 == r8) goto L_0x049c
            if (r5 == 0) goto L_0x04f9
        L_0x049c:
            r0 = r31
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.S
            r0 = r0[r16]
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r13.S
            int r2 = r16 + 1
            r1 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f
            if (r0 == 0) goto L_0x04b0
            androidx.constraintlayout.core.SolverVariable r0 = r0.i
            r3 = r0
            goto L_0x04b2
        L_0x04b0:
            r3 = r17
        L_0x04b2:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.f
            if (r0 == 0) goto L_0x04ba
            androidx.constraintlayout.core.SolverVariable r0 = r0.i
            r6 = r0
            goto L_0x04bc
        L_0x04ba:
            r6 = r17
        L_0x04bc:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r9.S
            r0 = r0[r16]
            if (r8 == 0) goto L_0x04c6
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r8.S
            r1 = r1[r2]
        L_0x04c6:
            if (r3 == 0) goto L_0x04f0
            if (r6 == 0) goto L_0x04f0
            if (r38 != 0) goto L_0x04d1
            r2 = r30
            float r2 = r2.f4k0
            goto L_0x04d5
        L_0x04d1:
            r2 = r30
            float r2 = r2.f5l0
        L_0x04d5:
            r5 = r2
            int r4 = r0.e()
            int r11 = r1.e()
            androidx.constraintlayout.core.SolverVariable r2 = r0.i
            androidx.constraintlayout.core.SolverVariable r7 = r1.i
            r0 = 7
            r1 = r36
            r12 = 2
            r14 = r8
            r8 = r11
            r11 = r9
            r15 = r23
            r9 = r0
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x04f5
        L_0x04f0:
            r14 = r8
            r11 = r9
            r15 = r23
            r12 = 2
        L_0x04f5:
            r25 = r15
            goto L_0x0708
        L_0x04f9:
            r14 = r8
            r11 = r9
            r15 = r23
            r0 = r31
            r12 = 2
            if (r22 == 0) goto L_0x05fb
            if (r11 == 0) goto L_0x05fb
            int r2 = r1.j
            if (r2 <= 0) goto L_0x050f
            int r1 = r1.i
            if (r1 != r2) goto L_0x050f
            r20 = 1
            goto L_0x0511
        L_0x050f:
            r20 = 0
        L_0x0511:
            r8 = r11
            r9 = r8
        L_0x0513:
            if (r9 == 0) goto L_0x04f5
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = r9.H0
            r1 = r1[r38]
            r7 = r1
        L_0x051a:
            if (r7 == 0) goto L_0x0527
            int r1 = r7.f8o0
            r6 = 8
            if (r1 != r6) goto L_0x0529
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = r7.H0
            r7 = r1[r38]
            goto L_0x051a
        L_0x0527:
            r6 = 8
        L_0x0529:
            if (r7 != 0) goto L_0x0535
            if (r9 != r14) goto L_0x052e
            goto L_0x0535
        L_0x052e:
            r12 = r7
            r18 = r8
            r25 = r15
            goto L_0x05ea
        L_0x0535:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r9.S
            r1 = r1[r16]
            androidx.constraintlayout.core.SolverVariable r2 = r1.i
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r1.f
            if (r3 == 0) goto L_0x0542
            androidx.constraintlayout.core.SolverVariable r3 = r3.i
            goto L_0x0544
        L_0x0542:
            r3 = r17
        L_0x0544:
            if (r8 == r9) goto L_0x054f
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r8.S
            int r4 = r16 + 1
            r3 = r3[r4]
            androidx.constraintlayout.core.SolverVariable r3 = r3.i
            goto L_0x0562
        L_0x054f:
            if (r9 != r11) goto L_0x0562
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r0.S
            r4 = r3[r16]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.f
            if (r4 == 0) goto L_0x0560
            r3 = r3[r16]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f
            androidx.constraintlayout.core.SolverVariable r3 = r3.i
            goto L_0x0562
        L_0x0560:
            r3 = r17
        L_0x0562:
            int r1 = r1.e()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r9.S
            int r5 = r16 + 1
            r4 = r4[r5]
            int r4 = r4.e()
            if (r7 == 0) goto L_0x0579
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r6 = r7.S
            r6 = r6[r16]
            androidx.constraintlayout.core.SolverVariable r12 = r6.i
            goto L_0x0583
        L_0x0579:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r6 = r13.S
            r6 = r6[r5]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.f
            if (r6 == 0) goto L_0x0586
            androidx.constraintlayout.core.SolverVariable r12 = r6.i
        L_0x0583:
            r18 = r7
            goto L_0x058a
        L_0x0586:
            r18 = r7
            r12 = r17
        L_0x058a:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = r9.S
            r7 = r7[r5]
            androidx.constraintlayout.core.SolverVariable r7 = r7.i
            if (r6 == 0) goto L_0x0597
            int r6 = r6.e()
            int r4 = r4 + r6
        L_0x0597:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r6 = r8.S
            r6 = r6[r5]
            int r6 = r6.e()
            int r6 = r6 + r1
            if (r2 == 0) goto L_0x05e4
            if (r3 == 0) goto L_0x05e4
            if (r12 == 0) goto L_0x05e4
            if (r7 == 0) goto L_0x05e4
            if (r9 != r11) goto L_0x05b3
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r11.S
            r1 = r1[r16]
            int r1 = r1.e()
            r6 = r1
        L_0x05b3:
            if (r9 != r14) goto L_0x05c0
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r14.S
            r1 = r1[r5]
            int r1 = r1.e()
            r23 = r1
            goto L_0x05c2
        L_0x05c0:
            r23 = r4
        L_0x05c2:
            if (r20 == 0) goto L_0x05c7
            r24 = 8
            goto L_0x05c9
        L_0x05c7:
            r24 = 5
        L_0x05c9:
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r36
            r4 = 5
            r25 = r15
            r15 = r4
            r4 = r6
            r19 = 8
            r6 = r12
            r12 = r18
            r18 = r8
            r15 = r19
            r8 = r23
            r15 = r9
            r9 = r24
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x05eb
        L_0x05e4:
            r25 = r15
            r12 = r18
            r18 = r8
        L_0x05ea:
            r15 = r9
        L_0x05eb:
            int r1 = r15.f8o0
            r2 = 8
            if (r1 == r2) goto L_0x05f3
            r8 = r15
            goto L_0x05f5
        L_0x05f3:
            r8 = r18
        L_0x05f5:
            r9 = r12
            r15 = r25
            r12 = 2
            goto L_0x0513
        L_0x05fb:
            r25 = r15
            if (r21 == 0) goto L_0x0708
            if (r11 == 0) goto L_0x0708
            int r2 = r1.j
            if (r2 <= 0) goto L_0x060c
            int r1 = r1.i
            if (r1 != r2) goto L_0x060c
            r20 = 1
            goto L_0x060e
        L_0x060c:
            r20 = 0
        L_0x060e:
            r12 = r11
            r15 = r12
        L_0x0610:
            if (r12 == 0) goto L_0x06b6
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = r12.H0
            r1 = r1[r38]
        L_0x0616:
            if (r1 == 0) goto L_0x0623
            int r2 = r1.f8o0
            r3 = 8
            if (r2 != r3) goto L_0x0623
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = r1.H0
            r1 = r1[r38]
            goto L_0x0616
        L_0x0623:
            if (r12 == r11) goto L_0x06a9
            if (r12 == r14) goto L_0x06a9
            if (r1 == 0) goto L_0x06a9
            if (r1 != r14) goto L_0x062e
            r9 = r17
            goto L_0x062f
        L_0x062e:
            r9 = r1
        L_0x062f:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r12.S
            r1 = r1[r16]
            androidx.constraintlayout.core.SolverVariable r2 = r1.i
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r15.S
            int r4 = r16 + 1
            r3 = r3[r4]
            androidx.constraintlayout.core.SolverVariable r3 = r3.i
            int r1 = r1.e()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r12.S
            r5 = r5[r4]
            int r5 = r5.e()
            if (r9 == 0) goto L_0x065b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r6 = r9.S
            r6 = r6[r16]
            androidx.constraintlayout.core.SolverVariable r7 = r6.i
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r6.f
            if (r8 == 0) goto L_0x0658
            androidx.constraintlayout.core.SolverVariable r8 = r8.i
            goto L_0x066c
        L_0x0658:
            r8 = r17
            goto L_0x066c
        L_0x065b:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r6 = r14.S
            r6 = r6[r16]
            if (r6 == 0) goto L_0x0664
            androidx.constraintlayout.core.SolverVariable r7 = r6.i
            goto L_0x0666
        L_0x0664:
            r7 = r17
        L_0x0666:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r8 = r12.S
            r8 = r8[r4]
            androidx.constraintlayout.core.SolverVariable r8 = r8.i
        L_0x066c:
            if (r6 == 0) goto L_0x0676
            int r6 = r6.e()
            int r6 = r6 + r5
            r18 = r6
            goto L_0x0678
        L_0x0676:
            r18 = r5
        L_0x0678:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r15.S
            r4 = r5[r4]
            int r4 = r4.e()
            int r4 = r4 + r1
            if (r20 == 0) goto L_0x0686
            r23 = 8
            goto L_0x0688
        L_0x0686:
            r23 = 4
        L_0x0688:
            if (r2 == 0) goto L_0x06a2
            if (r3 == 0) goto L_0x06a2
            if (r7 == 0) goto L_0x06a2
            if (r8 == 0) goto L_0x06a2
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r36
            r24 = 4
            r6 = r7
            r7 = r8
            r8 = r18
            r18 = r9
            r9 = r23
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x06a6
        L_0x06a2:
            r18 = r9
            r24 = 4
        L_0x06a6:
            r9 = r18
            goto L_0x06ac
        L_0x06a9:
            r24 = 4
            r9 = r1
        L_0x06ac:
            int r1 = r12.f8o0
            r2 = 8
            if (r1 == r2) goto L_0x06b3
            r15 = r12
        L_0x06b3:
            r12 = r9
            goto L_0x0610
        L_0x06b6:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r11.S
            r1 = r1[r16]
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.S
            r0 = r0[r16]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r14.S
            int r3 = r16 + 1
            r12 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r13.S
            r2 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r2.f
            if (r0 == 0) goto L_0x06f7
            if (r11 == r14) goto L_0x06dd
            androidx.constraintlayout.core.SolverVariable r2 = r1.i
            androidx.constraintlayout.core.SolverVariable r0 = r0.i
            int r1 = r1.e()
            r3 = 5
            r10.d(r2, r0, r1, r3)
            goto L_0x06f7
        L_0x06dd:
            if (r15 == 0) goto L_0x06f7
            androidx.constraintlayout.core.SolverVariable r2 = r1.i
            androidx.constraintlayout.core.SolverVariable r3 = r0.i
            int r4 = r1.e()
            r5 = 1056964608(0x3f000000, float:0.5)
            androidx.constraintlayout.core.SolverVariable r6 = r12.i
            androidx.constraintlayout.core.SolverVariable r7 = r15.i
            int r8 = r12.e()
            r9 = 5
            r1 = r36
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x06f7:
            if (r15 == 0) goto L_0x0708
            if (r11 == r14) goto L_0x0708
            androidx.constraintlayout.core.SolverVariable r0 = r12.i
            androidx.constraintlayout.core.SolverVariable r1 = r15.i
            int r2 = r12.e()
            int r2 = -r2
            r3 = 5
            r10.d(r0, r1, r2, r3)
        L_0x0708:
            if (r22 != 0) goto L_0x070c
            if (r21 == 0) goto L_0x0768
        L_0x070c:
            if (r11 == 0) goto L_0x0768
            if (r11 == r14) goto L_0x0768
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r11.S
            r1 = r0[r16]
            if (r14 != 0) goto L_0x0718
            r9 = r11
            goto L_0x0719
        L_0x0718:
            r9 = r14
        L_0x0719:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r9.S
            int r3 = r16 + 1
            r2 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r1.f
            if (r4 == 0) goto L_0x0726
            androidx.constraintlayout.core.SolverVariable r4 = r4.i
            goto L_0x0728
        L_0x0726:
            r4 = r17
        L_0x0728:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.f
            if (r5 == 0) goto L_0x072f
            androidx.constraintlayout.core.SolverVariable r5 = r5.i
            goto L_0x0731
        L_0x072f:
            r5 = r17
        L_0x0731:
            if (r13 == r9) goto L_0x0742
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r13.S
            r5 = r5[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.f
            if (r5 == 0) goto L_0x073f
            androidx.constraintlayout.core.SolverVariable r5 = r5.i
            r17 = r5
        L_0x073f:
            r6 = r17
            goto L_0x0743
        L_0x0742:
            r6 = r5
        L_0x0743:
            if (r11 != r9) goto L_0x0749
            r1 = r0[r16]
            r2 = r0[r3]
        L_0x0749:
            if (r4 == 0) goto L_0x0768
            if (r6 == 0) goto L_0x0768
            r5 = 1056964608(0x3f000000, float:0.5)
            int r0 = r1.e()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = r9.S
            r3 = r7[r3]
            int r8 = r3.e()
            androidx.constraintlayout.core.SolverVariable r3 = r1.i
            androidx.constraintlayout.core.SolverVariable r7 = r2.i
            r9 = 5
            r1 = r36
            r2 = r3
            r3 = r4
            r4 = r0
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0768:
            int r9 = r25 + 1
            r12 = 2
            r0 = r35
            r11 = r37
            r15 = r27
            r14 = r29
            goto L_0x001b
        L_0x0775:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.a.b.b.a.c(h0.g.a.h.c, h0.g.a.d, java.util.ArrayList, int):void");
    }

    public static int c0(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i4 = rect.left;
            i3 = rect2.right;
        } else if (i2 == 33) {
            i4 = rect.top;
            i3 = rect2.bottom;
        } else if (i2 == 66) {
            i4 = rect2.left;
            i3 = rect.right;
        } else if (i2 == 130) {
            i4 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i4 - i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r10.right <= r12.left) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r10.top >= r12.bottom) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r10.left >= r12.right) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean d(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = e(r9, r10, r11)
            boolean r1 = e(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L_0x007d
            if (r0 != 0) goto L_0x000f
            goto L_0x007d
        L_0x000f:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L_0x003d
            if (r9 == r3) goto L_0x0036
            if (r9 == r4) goto L_0x002f
            if (r9 != r1) goto L_0x0029
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L_0x0045
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x002f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L_0x0045
            goto L_0x0043
        L_0x0036:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L_0x0045
            goto L_0x0043
        L_0x003d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L_0x0045
        L_0x0043:
            r7 = r6
            goto L_0x0046
        L_0x0045:
            r7 = r2
        L_0x0046:
            if (r7 != 0) goto L_0x0049
            return r6
        L_0x0049:
            if (r9 == r5) goto L_0x007c
            if (r9 != r4) goto L_0x004e
            goto L_0x007c
        L_0x004e:
            int r11 = c0(r9, r10, r11)
            if (r9 == r5) goto L_0x006f
            if (r9 == r3) goto L_0x006a
            if (r9 == r4) goto L_0x0065
            if (r9 != r1) goto L_0x005f
            int r9 = r12.bottom
            int r10 = r10.bottom
            goto L_0x0073
        L_0x005f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x0065:
            int r9 = r12.right
            int r10 = r10.right
            goto L_0x0073
        L_0x006a:
            int r9 = r10.top
            int r10 = r12.top
            goto L_0x0073
        L_0x006f:
            int r9 = r10.left
            int r10 = r12.left
        L_0x0073:
            int r9 = r9 - r10
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L_0x007b
            r2 = r6
        L_0x007b:
            return r2
        L_0x007c:
            return r6
        L_0x007d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.a.b.b.a.d(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static final <T, R> h0.u.w<R> d0(h0.u.w<T> wVar, p<? super T, ? super c<? super R>, ? extends Object> pVar) {
        i.e(wVar, "$this$map");
        i.e(pVar, "transform");
        return new h0.u.w<>(new PagingDataTransforms$map$$inlined$transform$1(wVar.d, pVar), wVar.e);
    }

    public static boolean e(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    public static void e0(Intent intent, ArrayList<Uri> arrayList) {
        ClipData clipData = new ClipData((CharSequence) null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra("android.intent.extra.HTML_TEXT"), (Intent) null, arrayList.get(0)));
        int size = arrayList.size();
        for (int i2 = 1; i2 < size; i2++) {
            clipData.addItem(new ClipData.Item(arrayList.get(i2)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = r2.getClass().getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void f(java.lang.Object r2, java.lang.StringBuilder r3) {
        /*
            if (r2 != 0) goto L_0x0008
            java.lang.String r2 = "null"
            r3.append(r2)
            goto L_0x003f
        L_0x0008:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            int r1 = r0.length()
            if (r1 > 0) goto L_0x002c
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            if (r1 <= 0) goto L_0x002c
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L_0x002c:
            r3.append(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r3.append(r0)
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r3.append(r2)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.a.b.b.a.f(java.lang.Object, java.lang.StringBuilder):void");
    }

    public static int f0(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final Bundle g(Pair<String, ? extends Object>... pairArr) {
        i.e(pairArr, "pairs");
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair<String, ? extends Object> pair : pairArr) {
            String str = (String) pair.c;
            B b2 = pair.d;
            if (b2 == null) {
                bundle.putString(str, (String) null);
            } else if (b2 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) b2).booleanValue());
            } else if (b2 instanceof Byte) {
                bundle.putByte(str, ((Number) b2).byteValue());
            } else if (b2 instanceof Character) {
                bundle.putChar(str, ((Character) b2).charValue());
            } else if (b2 instanceof Double) {
                bundle.putDouble(str, ((Number) b2).doubleValue());
            } else if (b2 instanceof Float) {
                bundle.putFloat(str, ((Number) b2).floatValue());
            } else if (b2 instanceof Integer) {
                bundle.putInt(str, ((Number) b2).intValue());
            } else if (b2 instanceof Long) {
                bundle.putLong(str, ((Number) b2).longValue());
            } else if (b2 instanceof Short) {
                bundle.putShort(str, ((Number) b2).shortValue());
            } else if (b2 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) b2);
            } else if (b2 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) b2);
            } else if (b2 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) b2);
            } else if (b2 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) b2);
            } else if (b2 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) b2);
            } else if (b2 instanceof char[]) {
                bundle.putCharArray(str, (char[]) b2);
            } else if (b2 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) b2);
            } else if (b2 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) b2);
            } else if (b2 instanceof int[]) {
                bundle.putIntArray(str, (int[]) b2);
            } else if (b2 instanceof long[]) {
                bundle.putLongArray(str, (long[]) b2);
            } else if (b2 instanceof short[]) {
                bundle.putShortArray(str, (short[]) b2);
            } else if (b2 instanceof Object[]) {
                Class<?> componentType = b2.getClass().getComponentType();
                i.c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) b2);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) b2);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) b2);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) b2);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                }
            } else if (b2 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) b2);
            } else if (b2 instanceof IBinder) {
                bundle.putBinder(str, (IBinder) b2);
            } else if (b2 instanceof Size) {
                bundle.putSize(str, (Size) b2);
            } else if (b2 instanceof SizeF) {
                bundle.putSizeF(str, (SizeF) b2);
            } else {
                throw new IllegalArgumentException("Illegal value type " + b2.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return bundle;
    }

    public static ByteBuffer g0(Context context, CancellationSignal cancellationSignal, Uri uri) {
        FileInputStream fileInputStream;
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } catch (Throwable th) {
                openFileDescriptor.close();
                throw th;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public static final <T> n0.a.g2.d<h0.u.w<T>> h(n0.a.g2.d<h0.u.w<T>> dVar, f0 f0Var) {
        i.e(dVar, "$this$cachedIn");
        i.e(f0Var, "scope");
        i.e(dVar, "$this$cachedIn");
        i.e(f0Var, "scope");
        CachedPagingDataKt$cachedIn$$inlined$map$1 cachedPagingDataKt$cachedIn$$inlined$map$1 = new CachedPagingDataKt$cachedIn$$inlined$map$1(dVar, f0Var);
        CachedPagingDataKt$cachedIn$multicastedFlow$2 cachedPagingDataKt$cachedIn$multicastedFlow$2 = new CachedPagingDataKt$cachedIn$multicastedFlow$2((c) null);
        Object obj = h0.u.g.a;
        i.e(cachedPagingDataKt$cachedIn$$inlined$map$1, "$this$simpleRunningReduce");
        i.e(cachedPagingDataKt$cachedIn$multicastedFlow$2, "operation");
        return new h0.u.i0.c(f0Var, 1, new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new CachedPagingDataKt$cachedIn$multicastedFlow$4((ActiveFlowTracker) null, (c) null), new CachedPagingDataKt$cachedIn$$inlined$map$2(new s(new FlowExtKt$simpleRunningReduce$1(cachedPagingDataKt$cachedIn$$inlined$map$1, cachedPagingDataKt$cachedIn$multicastedFlow$2, (c) null)))), new CachedPagingDataKt$cachedIn$multicastedFlow$5((ActiveFlowTracker) null, (c) null)), false, new CachedPagingDataKt$cachedIn$1((c) null), true, 8).b;
    }

    public static TypedArray h0(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static boolean i(h0.i.c.d[] dVarArr, h0.i.c.d[] dVarArr2) {
        if (dVarArr == null || dVarArr2 == null || dVarArr.length != dVarArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < dVarArr.length; i2++) {
            if (dVarArr[i2].a != dVarArr2[i2].a || dVarArr[i2].b.length != dVarArr2[i2].b.length) {
                return false;
            }
        }
        return true;
    }

    public static <T> ObjectAnimator i0(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
    }

    public static void j(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static InputConnection j0(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof d1) {
                    editorInfo.hintText = ((d1) parent).a();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return inputConnection;
    }

    public static int k(int i2) {
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalArgumentException();
    }

    public static boolean k0(ViewParent viewParent, View view, float f2, float f3, boolean z) {
        try {
            return viewParent.onNestedFling(view, f2, f3, z);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    public static int l(int i2, String str) {
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalArgumentException(str);
    }

    public static boolean l0(ViewParent viewParent, View view, float f2, float f3) {
        try {
            return viewParent.onNestedPreFling(view, f2, f3);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    public static <T> T m(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void m0(ViewParent viewParent, View view, int i2, int i3, int[] iArr, int i4) {
        if (viewParent instanceof j) {
            ((j) viewParent).o(view, i2, i3, iArr, i4);
        } else if (i4 == 0) {
            try {
                viewParent.onNestedPreScroll(view, i2, i3, iArr);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e2);
            }
        }
    }

    public static int n(Context context, String str) {
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String permissionToOp = AppOpsManagerCompat.permissionToOp(str);
        if (permissionToOp != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            if (AppOpsManagerCompat.noteProxyOpNoThrow(context, permissionToOp, packageName) != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static void n0(ViewParent viewParent, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof k) {
            ((k) viewParent2).e(view, i2, i3, i4, i5, i6, iArr);
            return;
        }
        iArr[0] = iArr[0] + i4;
        iArr[1] = iArr[1] + i5;
        if (viewParent2 instanceof j) {
            ((j) viewParent2).k(view, i2, i3, i4, i5, i6);
        } else if (i6 == 0) {
            try {
                viewParent.onNestedScroll(view, i2, i3, i4, i5);
            } catch (AbstractMethodError e2) {
                AbstractMethodError abstractMethodError = e2;
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", abstractMethodError);
            }
        }
    }

    public static int o(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    public static h0.i.b.d.c o0(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        Resources resources2 = resources;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlPullParser.require(2, (String) null, "font-family");
            if (xmlPullParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlPullParser), androidx.core.R.styleable.FontFamily);
                String string = obtainAttributes.getString(androidx.core.R.styleable.FontFamily_fontProviderAuthority);
                String string2 = obtainAttributes.getString(androidx.core.R.styleable.FontFamily_fontProviderPackage);
                String string3 = obtainAttributes.getString(androidx.core.R.styleable.FontFamily_fontProviderQuery);
                int resourceId = obtainAttributes.getResourceId(androidx.core.R.styleable.FontFamily_fontProviderCerts, 0);
                int integer = obtainAttributes.getInteger(androidx.core.R.styleable.FontFamily_fontProviderFetchStrategy, 1);
                int integer2 = obtainAttributes.getInteger(androidx.core.R.styleable.FontFamily_fontProviderFetchTimeout, 500);
                String string4 = obtainAttributes.getString(androidx.core.R.styleable.FontFamily_fontProviderSystemFontFamily);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            if (xmlPullParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xmlPullParser), androidx.core.R.styleable.FontFamilyFont);
                                int i2 = androidx.core.R.styleable.FontFamilyFont_fontWeight;
                                if (!obtainAttributes2.hasValue(i2)) {
                                    i2 = androidx.core.R.styleable.FontFamilyFont_android_fontWeight;
                                }
                                int i3 = obtainAttributes2.getInt(i2, RequestResponse.HttpStatusCode._4xx.BAD_REQUEST);
                                int i4 = androidx.core.R.styleable.FontFamilyFont_fontStyle;
                                if (!obtainAttributes2.hasValue(i4)) {
                                    i4 = androidx.core.R.styleable.FontFamilyFont_android_fontStyle;
                                }
                                boolean z = 1 == obtainAttributes2.getInt(i4, 0);
                                int i5 = androidx.core.R.styleable.FontFamilyFont_ttcIndex;
                                if (!obtainAttributes2.hasValue(i5)) {
                                    i5 = androidx.core.R.styleable.FontFamilyFont_android_ttcIndex;
                                }
                                int i6 = androidx.core.R.styleable.FontFamilyFont_fontVariationSettings;
                                if (!obtainAttributes2.hasValue(i6)) {
                                    i6 = androidx.core.R.styleable.FontFamilyFont_android_fontVariationSettings;
                                }
                                String string5 = obtainAttributes2.getString(i6);
                                int i7 = obtainAttributes2.getInt(i5, 0);
                                int i8 = androidx.core.R.styleable.FontFamilyFont_font;
                                if (!obtainAttributes2.hasValue(i8)) {
                                    i8 = androidx.core.R.styleable.FontFamilyFont_android_font;
                                }
                                int resourceId2 = obtainAttributes2.getResourceId(i8, 0);
                                String string6 = obtainAttributes2.getString(i8);
                                obtainAttributes2.recycle();
                                while (xmlPullParser.next() != 3) {
                                    A0(xmlPullParser);
                                }
                                arrayList.add(new h0.i.b.d.e(string6, i3, z, string5, i7, resourceId2));
                            } else {
                                A0(xmlPullParser);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    return new h0.i.b.d.d((h0.i.b.d.e[]) arrayList.toArray(new h0.i.b.d.e[arrayList.size()]));
                }
                while (xmlPullParser.next() != 3) {
                    A0(xmlPullParser);
                }
                return new f(new h0.i.f.e(string, string2, string3, p0(resources2, resourceId)), integer, integer2, string4);
            }
            A0(xmlPullParser);
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static final <T> n p(o<T> oVar, o<T> oVar2, g.e<T> eVar) {
        boolean z;
        i.e(oVar, "$this$computeDiff");
        i.e(oVar2, "newList");
        i.e(eVar, "diffCallback");
        boolean z2 = true;
        g.d a2 = h0.v.a.g.a(new h0.u.p(oVar, oVar2, eVar, oVar.a(), oVar2.a()), true);
        i.d(a2, "DiffUtil.calculateDiff(\n…    },\n        true\n    )");
        m0.q.e f2 = m0.q.i.f(0, oVar.a());
        if (!(f2 instanceof Collection) || !((Collection) f2).isEmpty()) {
            Iterator it = f2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (a2.a(((m0.j.o) it).a()) != -1) {
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
            return new n(a2, z2);
        }
        z2 = false;
        return new n(a2, z2);
    }

    public static List<List<byte[]>> p0(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(B0(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(B0(resources.getStringArray(i2)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static int q(RecyclerView.y yVar, v vVar, View view, View view2, RecyclerView.n nVar, boolean z) {
        if (nVar.getChildCount() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(nVar.getPosition(view) - nVar.getPosition(view2)) + 1;
        }
        return Math.min(vVar.l(), vVar.b(view2) - vVar.e(view));
    }

    public static final <T> h0.u.f0<T> q0(T t, int[] iArr, int i2, int i3) {
        i.e(t, "separator");
        i.e(iArr, "originalPageOffsets");
        return new h0.u.f0<>(iArr, h.L2(t), i2, h.L2(Integer.valueOf(i3)));
    }

    public static int r(RecyclerView.y yVar, v vVar, View view, View view2, RecyclerView.n nVar, boolean z, boolean z2) {
        int i2;
        if (nVar.getChildCount() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(nVar.getPosition(view), nVar.getPosition(view2));
        int max = Math.max(nVar.getPosition(view), nVar.getPosition(view2));
        if (z2) {
            i2 = Math.max(0, (yVar.b() - max) - 1);
        } else {
            i2 = Math.max(0, min);
        }
        if (!z) {
            return i2;
        }
        return Math.round((((float) i2) * (((float) Math.abs(vVar.b(view2) - vVar.e(view))) / ((float) (Math.abs(nVar.getPosition(view) - nVar.getPosition(view2)) + 1)))) + ((float) (vVar.k() - vVar.e(view))));
    }

    public static void r0(TextView textView, int i2) {
        int i3;
        k(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i3 = fontMetricsInt.top;
        } else {
            i3 = fontMetricsInt.ascent;
        }
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static int s(RecyclerView.y yVar, v vVar, View view, View view2, RecyclerView.n nVar, boolean z) {
        if (nVar.getChildCount() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return yVar.b();
        }
        return (int) ((((float) (vVar.b(view2) - vVar.e(view))) / ((float) (Math.abs(nVar.getPosition(view) - nVar.getPosition(view2)) + 1))) * ((float) yVar.b()));
    }

    public static void s0(TextView textView, int i2) {
        int i3;
        k(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i3 = fontMetricsInt.bottom;
        } else {
            i3 = fontMetricsInt.descent;
        }
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static float[] t(float[] fArr, int i2, int i3) {
        if (i2 <= i3) {
            int length = fArr.length;
            if (i2 < 0 || i2 > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i4 = i3 - i2;
            int min = Math.min(i4, length - i2);
            float[] fArr2 = new float[i4];
            System.arraycopy(fArr, i2, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    public static void t0(TextView textView, int i2) {
        k(i2);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i2 != fontMetricsInt) {
            textView.setLineSpacing((float) (i2 - fontMetricsInt), 1.0f);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0014 A[SYNTHETIC, Splitter:B:13:0x0014] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean u(java.io.File r0, android.content.res.Resources r1, int r2) {
        /*
            java.io.InputStream r1 = r1.openRawResource(r2)     // Catch:{ all -> 0x0010 }
            boolean r0 = v(r0, r1)     // Catch:{ all -> 0x000e }
            if (r1 == 0) goto L_0x000d
            r1.close()     // Catch:{ IOException -> 0x000d }
        L_0x000d:
            return r0
        L_0x000e:
            r0 = move-exception
            goto L_0x0012
        L_0x0010:
            r0 = move-exception
            r1 = 0
        L_0x0012:
            if (r1 == 0) goto L_0x0017
            r1.close()     // Catch:{ IOException -> 0x0017 }
        L_0x0017:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.a.b.b.a.u(java.io.File, android.content.res.Resources, int):boolean");
    }

    public static void u0(TextView textView, h0.i.g.b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            Objects.requireNonNull(bVar);
            textView.setText((CharSequence) null);
            return;
        }
        b.a S = S(textView);
        Objects.requireNonNull(bVar);
        S.a((b.a) null);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0047 A[SYNTHETIC, Splitter:B:25:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0050 A[SYNTHETIC, Splitter:B:31:0x0050] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean v(java.io.File r5, java.io.InputStream r6) {
        /*
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskWrites()
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x002a }
            r3.<init>(r5, r1)     // Catch:{ IOException -> 0x002a }
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
        L_0x000f:
            int r2 = r6.read(r5)     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            r4 = -1
            if (r2 == r4) goto L_0x001a
            r3.write(r5, r1, r2)     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            goto L_0x000f
        L_0x001a:
            r5 = 1
            r3.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            android.os.StrictMode.setThreadPolicy(r0)
            return r5
        L_0x0022:
            r5 = move-exception
            r2 = r3
            goto L_0x004e
        L_0x0025:
            r5 = move-exception
            r2 = r3
            goto L_0x002b
        L_0x0028:
            r5 = move-exception
            goto L_0x004e
        L_0x002a:
            r5 = move-exception
        L_0x002b:
            java.lang.String r6 = "TypefaceCompatUtil"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r3.<init>()     // Catch:{ all -> 0x0028 }
            java.lang.String r4 = "Error copying resource contents to temp file: "
            r3.append(r4)     // Catch:{ all -> 0x0028 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0028 }
            r3.append(r5)     // Catch:{ all -> 0x0028 }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x0028 }
            android.util.Log.e(r6, r5)     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x004a
            r2.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L_0x004e:
            if (r2 == 0) goto L_0x0053
            r2.close()     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            android.os.StrictMode.setThreadPolicy(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.a.b.b.a.v(java.io.File, java.io.InputStream):boolean");
    }

    public static void v0(Drawable drawable, int i2) {
        drawable.setTint(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008a, code lost:
        if (r13 == 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008c, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0097 A[Catch:{ NumberFormatException -> 0x00bc }, LOOP:3: B:25:0x006c->B:45:0x0097, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0096 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static h0.i.c.d[] w(java.lang.String r17) {
        /*
            r0 = r17
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 1
            r4 = r3
            r3 = r2
        L_0x000f:
            int r5 = r17.length()
            if (r4 >= r5) goto L_0x00e3
        L_0x0015:
            int r5 = r17.length()
            r6 = 69
            r7 = 101(0x65, float:1.42E-43)
            if (r4 >= r5) goto L_0x0039
            char r5 = r0.charAt(r4)
            int r8 = r5 + -65
            int r9 = r5 + -90
            int r9 = r9 * r8
            if (r9 <= 0) goto L_0x0031
            int r8 = r5 + -97
            int r9 = r5 + -122
            int r9 = r9 * r8
            if (r9 > 0) goto L_0x0036
        L_0x0031:
            if (r5 == r7) goto L_0x0036
            if (r5 == r6) goto L_0x0036
            goto L_0x0039
        L_0x0036:
            int r4 = r4 + 1
            goto L_0x0015
        L_0x0039:
            java.lang.String r2 = r0.substring(r2, r4)
            java.lang.String r2 = r2.trim()
            int r5 = r2.length()
            if (r5 <= 0) goto L_0x00d9
            char r5 = r2.charAt(r3)
            r8 = 122(0x7a, float:1.71E-43)
            if (r5 == r8) goto L_0x00cb
            char r5 = r2.charAt(r3)
            r8 = 90
            if (r5 != r8) goto L_0x0059
            goto L_0x00cb
        L_0x0059:
            int r5 = r2.length()     // Catch:{ NumberFormatException -> 0x00bc }
            float[] r5 = new float[r5]     // Catch:{ NumberFormatException -> 0x00bc }
            int r8 = r2.length()     // Catch:{ NumberFormatException -> 0x00bc }
            r9 = 1
            r10 = r9
            r9 = r3
        L_0x0066:
            if (r10 >= r8) goto L_0x00b1
            r11 = r3
            r12 = r11
            r13 = r12
            r14 = r10
        L_0x006c:
            int r15 = r2.length()     // Catch:{ NumberFormatException -> 0x00bc }
            if (r14 >= r15) goto L_0x009a
            char r15 = r2.charAt(r14)     // Catch:{ NumberFormatException -> 0x00bc }
            r7 = 32
            if (r15 == r7) goto L_0x0090
            r7 = 101(0x65, float:1.42E-43)
            if (r15 == r6) goto L_0x008e
            if (r15 == r7) goto L_0x008e
            switch(r15) {
                case 44: goto L_0x0092;
                case 45: goto L_0x0088;
                case 46: goto L_0x0084;
                default: goto L_0x0083;
            }     // Catch:{ NumberFormatException -> 0x00bc }
        L_0x0083:
            goto L_0x0093
        L_0x0084:
            if (r12 != 0) goto L_0x008c
            r12 = 1
            goto L_0x0093
        L_0x0088:
            if (r14 == r10) goto L_0x0093
            if (r13 != 0) goto L_0x0093
        L_0x008c:
            r11 = 1
            goto L_0x0092
        L_0x008e:
            r13 = 1
            goto L_0x0094
        L_0x0090:
            r7 = 101(0x65, float:1.42E-43)
        L_0x0092:
            r3 = 1
        L_0x0093:
            r13 = 0
        L_0x0094:
            if (r3 == 0) goto L_0x0097
            goto L_0x009a
        L_0x0097:
            int r14 = r14 + 1
            goto L_0x006c
        L_0x009a:
            if (r10 >= r14) goto L_0x00a9
            int r3 = r9 + 1
            java.lang.String r10 = r2.substring(r10, r14)     // Catch:{ NumberFormatException -> 0x00bc }
            float r10 = java.lang.Float.parseFloat(r10)     // Catch:{ NumberFormatException -> 0x00bc }
            r5[r9] = r10     // Catch:{ NumberFormatException -> 0x00bc }
            r9 = r3
        L_0x00a9:
            if (r11 == 0) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            int r14 = r14 + 1
        L_0x00ae:
            r10 = r14
            r3 = 0
            goto L_0x0066
        L_0x00b1:
            float[] r3 = t(r5, r3, r9)     // Catch:{ NumberFormatException -> 0x00bc }
            r5 = 0
            r16 = r5
            r5 = r3
            r3 = r16
            goto L_0x00cd
        L_0x00bc:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r3 = "error in parsing \""
            java.lang.String r4 = "\""
            java.lang.String r2 = i0.d.a.a.a.o0(r3, r2, r4)
            r1.<init>(r2, r0)
            throw r1
        L_0x00cb:
            float[] r5 = new float[r3]
        L_0x00cd:
            char r2 = r2.charAt(r3)
            h0.i.c.d r3 = new h0.i.c.d
            r3.<init>(r2, r5)
            r1.add(r3)
        L_0x00d9:
            int r2 = r4 + 1
            r3 = 0
            r16 = r4
            r4 = r2
            r2 = r16
            goto L_0x000f
        L_0x00e3:
            int r4 = r4 - r2
            r3 = 1
            if (r4 != r3) goto L_0x00fc
            int r3 = r17.length()
            if (r2 >= r3) goto L_0x00fc
            char r0 = r0.charAt(r2)
            r2 = 0
            float[] r2 = new float[r2]
            h0.i.c.d r3 = new h0.i.c.d
            r3.<init>(r0, r2)
            r1.add(r3)
        L_0x00fc:
            int r0 = r1.size()
            h0.i.c.d[] r0 = new h0.i.c.d[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            h0.i.c.d[] r0 = (h0.i.c.d[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.a.b.b.a.w(java.lang.String):h0.i.c.d[]");
    }

    public static void w0(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static final <VM extends k0> m0.c<VM> x(Fragment fragment, m0.r.d<VM> dVar, m0.n.a.a<? extends n0> aVar, m0.n.a.a<? extends m0.b> aVar2) {
        i.e(fragment, "$this$createViewModelLazy");
        i.e(dVar, "viewModelClass");
        i.e(aVar, "storeProducer");
        if (aVar2 == null) {
            aVar2 = new FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1(fragment);
        }
        return new l0(dVar, aVar, aVar2);
    }

    public static void x0(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    public static h0.i.c.d[] y(h0.i.c.d[] dVarArr) {
        if (dVarArr == null) {
            return null;
        }
        h0.i.c.d[] dVarArr2 = new h0.i.c.d[dVarArr.length];
        for (int i2 = 0; i2 < dVarArr.length; i2++) {
            dVarArr2[i2] = new h0.i.c.d(dVarArr[i2]);
        }
        return dVarArr2;
    }

    public static void y0(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        z0 z0Var = z0.c;
        if (z0Var != null && z0Var.q == view) {
            z0.c((z0) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            z0 z0Var2 = z0.d;
            if (z0Var2 != null && z0Var2.q == view) {
                z0Var2.b();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new z0(view, charSequence);
    }

    public static final <T> void z(o<T> oVar, r rVar, o<T> oVar2, n nVar) {
        i.e(oVar, "$this$dispatchDiff");
        i.e(rVar, "callback");
        i.e(oVar2, "newList");
        i.e(nVar, "diffResult");
        if (nVar.b) {
            i.e(oVar, "oldList");
            i.e(oVar2, "newList");
            i.e(rVar, "callback");
            i.e(nVar, "diffResult");
            q qVar = new q(oVar, oVar2, rVar);
            nVar.a.b(qVar);
            int min = Math.min(qVar.f.b(), qVar.a);
            int b2 = qVar.g.b() - qVar.a;
            boolean z = false;
            if (b2 > 0) {
                if (min > 0) {
                    qVar.h.d(0, min, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
                }
                qVar.h.a(0, b2);
            } else if (b2 < 0) {
                qVar.h.b(0, -b2);
                int i2 = min + b2;
                if (i2 > 0) {
                    qVar.h.d(0, i2, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
                }
            }
            qVar.a = qVar.g.b();
            int min2 = Math.min(qVar.f.c(), qVar.b);
            int c2 = qVar.g.c();
            int i3 = qVar.b;
            int i4 = c2 - i3;
            int i5 = qVar.a + qVar.c + i3;
            int i6 = i5 - min2;
            if (i6 != qVar.f.e() - min2) {
                z = true;
            }
            if (i4 > 0) {
                qVar.h.a(i5, i4);
            } else if (i4 < 0) {
                qVar.h.b(i5 + i4, -i4);
                min2 += i4;
            }
            if (min2 > 0 && z) {
                qVar.h.d(i6, min2, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
            }
            qVar.b = qVar.g.c();
            return;
        }
        i.e(rVar, "callback");
        i.e(oVar, "oldList");
        i.e(oVar2, "newList");
        int max = Math.max(oVar.b(), oVar2.b());
        int min3 = Math.min(oVar.a() + oVar.b(), oVar2.a() + oVar2.b());
        int i7 = min3 - max;
        if (i7 > 0) {
            rVar.b(max, i7);
            rVar.a(max, i7);
        }
        int min4 = Math.min(max, min3);
        int max2 = Math.max(max, min3);
        int b3 = oVar.b();
        int e2 = oVar2.e();
        if (b3 > e2) {
            b3 = e2;
        }
        int a2 = oVar.a() + oVar.b();
        int e3 = oVar2.e();
        if (a2 > e3) {
            a2 = e3;
        }
        DiffingChangePayload diffingChangePayload = DiffingChangePayload.ITEM_TO_PLACEHOLDER;
        int i8 = min4 - b3;
        if (i8 > 0) {
            rVar.d(b3, i8, diffingChangePayload);
        }
        int i9 = a2 - max2;
        if (i9 > 0) {
            rVar.d(max2, i9, diffingChangePayload);
        }
        int b4 = oVar2.b();
        int e4 = oVar.e();
        if (b4 > e4) {
            b4 = e4;
        }
        int a3 = oVar2.a() + oVar2.b();
        int e5 = oVar.e();
        if (a3 > e5) {
            a3 = e5;
        }
        DiffingChangePayload diffingChangePayload2 = DiffingChangePayload.PLACEHOLDER_TO_ITEM;
        int i10 = min4 - b4;
        if (i10 > 0) {
            rVar.d(b4, i10, diffingChangePayload2);
        }
        int i11 = a3 - max2;
        if (i11 > 0) {
            rVar.d(max2, i11, diffingChangePayload2);
        }
        int e6 = oVar2.e() - oVar.e();
        if (e6 > 0) {
            rVar.a(oVar.e(), e6);
        } else if (e6 < 0) {
            rVar.b(oVar.e() + e6, -e6);
        }
    }

    public static final <T> n0.a.g2.d<T> z0(p<? super c0<T>, ? super c<? super m0.i>, ? extends Object> pVar) {
        i.e(pVar, "block");
        return m0.r.t.a.r.m.a1.a.d0(new s(new SimpleChannelFlowKt$simpleChannelFlow$1(pVar, (c) null)), -2, (BufferOverflow) null, 2, (Object) null);
    }
}
