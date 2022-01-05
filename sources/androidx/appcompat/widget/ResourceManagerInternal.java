package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.appcompat.resources.R;
import h0.b.f.b0;
import h0.b.f.b1;
import h0.b.f.j;
import h0.b.f.r0;
import h0.b.f.u0;
import h0.c0.a.a.d;
import h0.f.e;
import h0.f.f;
import h0.f.h;
import h0.f.i;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

public final class ResourceManagerInternal {
    private static final a COLOR_FILTER_CACHE = new a(6);
    private static final boolean DEBUG = false;
    private static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    private static ResourceManagerInternal INSTANCE = null;
    private static final String PLATFORM_VD_CLAZZ = "android.graphics.drawable.VectorDrawable";
    private static final String SKIP_DRAWABLE_TAG = "appcompat_skip_skip";
    private static final String TAG = "ResourceManagerInternal";
    private h<String, b> mDelegates;
    private final WeakHashMap<Context, e<WeakReference<Drawable.ConstantState>>> mDrawableCaches = new WeakHashMap<>(0);
    private boolean mHasCheckedVectorDrawableSetup;
    private c mHooks;
    private i<String> mKnownDrawableIdTags;
    private WeakHashMap<Context, i<ColorStateList>> mTintLists;
    private TypedValue mTypedValue;

    public static class a extends f<Integer, PorterDuffColorFilter> {
        public a(int i) {
            super(i);
        }
    }

    public interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface c {
    }

    private void addDelegate(String str, b bVar) {
        if (this.mDelegates == null) {
            this.mDelegates = new h<>();
        }
        this.mDelegates.put(str, bVar);
    }

    private synchronized boolean addDrawableToCache(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        e eVar = this.mDrawableCaches.get(context);
        if (eVar == null) {
            eVar = new e();
            this.mDrawableCaches.put(context, eVar);
        }
        eVar.o(j, new WeakReference(constantState));
        return true;
    }

    private void addTintListToCache(Context context, int i, ColorStateList colorStateList) {
        if (this.mTintLists == null) {
            this.mTintLists = new WeakHashMap<>();
        }
        i iVar = this.mTintLists.get(context);
        if (iVar == null) {
            iVar = new i();
            this.mTintLists.put(context, iVar);
        }
        iVar.b(i, colorStateList);
    }

    private void checkVectorDrawableSetup(Context context) {
        if (!this.mHasCheckedVectorDrawableSetup) {
            this.mHasCheckedVectorDrawableSetup = true;
            Drawable drawable = getDrawable(context, R.drawable.abc_vector_test);
            if (drawable == null || !isVectorDrawable(drawable)) {
                this.mHasCheckedVectorDrawableSetup = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    private static long createCacheKey(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable createDrawableIfNeeded(Context context, int i) {
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        context.getResources().getValue(i, typedValue, true);
        long createCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, createCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        c cVar = this.mHooks;
        LayerDrawable layerDrawable = null;
        if (cVar != null) {
            j.a aVar = (j.a) cVar;
            Objects.requireNonNull(aVar);
            if (i == androidx.appcompat.R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{getDrawable(context, androidx.appcompat.R.drawable.abc_cab_background_internal_bg), getDrawable(context, androidx.appcompat.R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == androidx.appcompat.R.drawable.abc_ratingbar_material) {
                layerDrawable = aVar.c(this, context, androidx.appcompat.R.dimen.abc_star_big);
            } else if (i == androidx.appcompat.R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = aVar.c(this, context, androidx.appcompat.R.dimen.abc_star_medium);
            } else if (i == androidx.appcompat.R.drawable.abc_ratingbar_small_material) {
                layerDrawable = aVar.c(this, context, androidx.appcompat.R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            addDrawableToCache(context, createCacheKey, layerDrawable);
        }
        return layerDrawable;
    }

    private static PorterDuffColorFilter createTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return getPorterDuffColorFilter(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized ResourceManagerInternal get() {
        ResourceManagerInternal resourceManagerInternal;
        synchronized (ResourceManagerInternal.class) {
            if (INSTANCE == null) {
                ResourceManagerInternal resourceManagerInternal2 = new ResourceManagerInternal();
                INSTANCE = resourceManagerInternal2;
                installDefaultInflateDelegates(resourceManagerInternal2);
            }
            resourceManagerInternal = INSTANCE;
        }
        return resourceManagerInternal;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable getCachedDrawable(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, h0.f.e<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.mDrawableCaches     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            h0.f.e r0 = (h0.f.e) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.j(r5, r1)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.p(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ResourceManagerInternal.getCachedDrawable(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (ResourceManagerInternal.class) {
            a aVar = COLOR_FILTER_CACHE;
            Objects.requireNonNull(aVar);
            int i2 = (i + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) aVar.a(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                Objects.requireNonNull(aVar);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) aVar.b(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    private ColorStateList getTintListFromCache(Context context, int i) {
        i iVar;
        WeakHashMap<Context, i<ColorStateList>> weakHashMap = this.mTintLists;
        if (weakHashMap == null || (iVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) iVar.f(i, null);
    }

    private static void installDefaultInflateDelegates(ResourceManagerInternal resourceManagerInternal) {
    }

    private static boolean isVectorDrawable(Drawable drawable) {
        return (drawable instanceof d) || PLATFORM_VD_CLAZZ.equals(drawable.getClass().getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable loadDrawableFromDelegates(android.content.Context r11, int r12) {
        /*
            r10 = this;
            h0.f.h<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal$b> r0 = r10.mDelegates
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b2
            h0.f.i<java.lang.String> r0 = r10.mKnownDrawableIdTags
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.f(r12, r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            h0.f.h<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal$b> r3 = r10.mDelegates
            java.lang.Object r0 = r3.getOrDefault(r0, r1)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            h0.f.i r0 = new h0.f.i
            r0.<init>()
            r10.mKnownDrawableIdTags = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.mTypedValue
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.mTypedValue = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.mTypedValue
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = createCacheKey(r0)
            android.graphics.drawable.Drawable r6 = r10.getCachedDrawable(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00aa
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            h0.f.i<java.lang.String> r8 = r10.mKnownDrawableIdTags     // Catch:{ Exception -> 0x00a2 }
            r8.b(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            h0.f.h<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal$b> r8 = r10.mDelegates     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.appcompat.widget.ResourceManagerInternal$b r3 = (androidx.appcompat.widget.ResourceManagerInternal.b) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00aa
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.addDrawableToCache(r11, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00aa
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00aa:
            if (r6 != 0) goto L_0x00b1
            h0.f.i<java.lang.String> r11 = r10.mKnownDrawableIdTags
            r11.b(r12, r2)
        L_0x00b1:
            return r6
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ResourceManagerInternal.loadDrawableFromDelegates(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    private Drawable tintDrawable(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList tintList = getTintList(context, i);
        if (tintList != null) {
            if (b0.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setTintList(tintList);
            PorterDuff.Mode tintMode = getTintMode(i);
            if (tintMode == null) {
                return drawable;
            }
            drawable.setTintMode(tintMode);
            return drawable;
        }
        c cVar = this.mHooks;
        if (cVar != null) {
            j.a aVar = (j.a) cVar;
            Objects.requireNonNull(aVar);
            boolean z2 = true;
            if (i == androidx.appcompat.R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int i2 = androidx.appcompat.R.attr.colorControlNormal;
                int c2 = r0.c(context, i2);
                PorterDuff.Mode mode = j.a;
                aVar.e(findDrawableByLayerId, c2, mode);
                aVar.e(layerDrawable.findDrawableByLayerId(16908303), r0.c(context, i2), mode);
                aVar.e(layerDrawable.findDrawableByLayerId(16908301), r0.c(context, androidx.appcompat.R.attr.colorControlActivated), mode);
            } else if (i == androidx.appcompat.R.drawable.abc_ratingbar_material || i == androidx.appcompat.R.drawable.abc_ratingbar_indicator_material || i == androidx.appcompat.R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                int b2 = r0.b(context, androidx.appcompat.R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = j.a;
                aVar.e(findDrawableByLayerId2, b2, mode2);
                Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(16908303);
                int i3 = androidx.appcompat.R.attr.colorControlActivated;
                aVar.e(findDrawableByLayerId3, r0.c(context, i3), mode2);
                aVar.e(layerDrawable2.findDrawableByLayerId(16908301), r0.c(context, i3), mode2);
            } else {
                z2 = false;
            }
            if (z2) {
                return drawable;
            }
        }
        if (tintDrawableUsingColorFilter(context, i, drawable) || !z) {
            return drawable;
        }
        return null;
    }

    public synchronized Drawable getDrawable(Context context, int i) {
        return getDrawable(context, i, false);
    }

    public synchronized ColorStateList getTintList(Context context, int i) {
        ColorStateList tintListFromCache;
        tintListFromCache = getTintListFromCache(context, i);
        if (tintListFromCache == null) {
            c cVar = this.mHooks;
            tintListFromCache = cVar == null ? null : ((j.a) cVar).d(context, i);
            if (tintListFromCache != null) {
                addTintListToCache(context, i, tintListFromCache);
            }
        }
        return tintListFromCache;
    }

    public PorterDuff.Mode getTintMode(int i) {
        c cVar = this.mHooks;
        if (cVar == null) {
            return null;
        }
        Objects.requireNonNull((j.a) cVar);
        if (i == androidx.appcompat.R.drawable.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    public synchronized void onConfigurationChanged(Context context) {
        e eVar = this.mDrawableCaches.get(context);
        if (eVar != null) {
            eVar.c();
        }
    }

    public synchronized Drawable onDrawableLoadedFromResources(Context context, b1 b1Var, int i) {
        Drawable loadDrawableFromDelegates = loadDrawableFromDelegates(context, i);
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = b1Var.a(i);
        }
        if (loadDrawableFromDelegates == null) {
            return null;
        }
        return tintDrawable(context, i, false, loadDrawableFromDelegates);
    }

    public synchronized void setHooks(c cVar) {
        this.mHooks = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean tintDrawableUsingColorFilter(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            androidx.appcompat.widget.ResourceManagerInternal$c r0 = r7.mHooks
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x006e
            h0.b.f.j$a r0 = (h0.b.f.j.a) r0
            java.util.Objects.requireNonNull(r0)
            android.graphics.PorterDuff$Mode r3 = h0.b.f.j.a
            int[] r4 = r0.a
            boolean r4 = r0.a(r4, r9)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            if (r4 == 0) goto L_0x001c
            int r5 = androidx.appcompat.R.attr.colorControlNormal
            goto L_0x0045
        L_0x001c:
            int[] r4 = r0.c
            boolean r4 = r0.a(r4, r9)
            if (r4 == 0) goto L_0x0027
            int r5 = androidx.appcompat.R.attr.colorControlActivated
            goto L_0x0045
        L_0x0027:
            int[] r4 = r0.d
            boolean r0 = r0.a(r4, r9)
            if (r0 == 0) goto L_0x0032
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0045
        L_0x0032:
            int r0 = androidx.appcompat.R.drawable.abc_list_divider_mtrl_alpha
            if (r9 != r0) goto L_0x0041
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r0 = java.lang.Math.round(r0)
            goto L_0x0047
        L_0x0041:
            int r0 = androidx.appcompat.R.drawable.abc_dialog_material_background
            if (r9 != r0) goto L_0x0049
        L_0x0045:
            r9 = r5
            r0 = r6
        L_0x0047:
            r4 = r1
            goto L_0x004c
        L_0x0049:
            r9 = r2
            r4 = r9
            r0 = r6
        L_0x004c:
            if (r4 == 0) goto L_0x006a
            boolean r4 = h0.b.f.b0.a(r10)
            if (r4 == 0) goto L_0x0058
            android.graphics.drawable.Drawable r10 = r10.mutate()
        L_0x0058:
            int r8 = h0.b.f.r0.c(r8, r9)
            android.graphics.PorterDuffColorFilter r8 = h0.b.f.j.c(r8, r3)
            r10.setColorFilter(r8)
            if (r0 == r6) goto L_0x0068
            r10.setAlpha(r0)
        L_0x0068:
            r8 = r1
            goto L_0x006b
        L_0x006a:
            r8 = r2
        L_0x006b:
            if (r8 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r1 = r2
        L_0x006f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ResourceManagerInternal.tintDrawableUsingColorFilter(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    public synchronized Drawable getDrawable(Context context, int i, boolean z) {
        Drawable loadDrawableFromDelegates;
        checkVectorDrawableSetup(context);
        loadDrawableFromDelegates = loadDrawableFromDelegates(context, i);
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = createDrawableIfNeeded(context, i);
        }
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = h0.i.b.a.getDrawable(context, i);
        }
        if (loadDrawableFromDelegates != null) {
            loadDrawableFromDelegates = tintDrawable(context, i, z, loadDrawableFromDelegates);
        }
        if (loadDrawableFromDelegates != null) {
            int[] iArr = b0.a;
        }
        return loadDrawableFromDelegates;
    }

    public static void tintDrawable(Drawable drawable, u0 u0Var, int[] iArr) {
        if (!b0.a(drawable) || drawable.mutate() == drawable) {
            boolean z = u0Var.d;
            if (z || u0Var.c) {
                drawable.setColorFilter(createTintFilter(z ? u0Var.a : null, u0Var.c ? u0Var.b : DEFAULT_MODE, iArr));
            } else {
                drawable.clearColorFilter();
            }
        } else {
            Log.d(TAG, "Mutated drawable is not the same instance as the input.");
        }
    }
}
