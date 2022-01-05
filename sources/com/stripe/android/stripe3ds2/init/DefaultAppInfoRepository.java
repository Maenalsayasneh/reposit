package com.stripe.android.stripe3ds2.init;

import android.content.Context;
import android.content.SharedPreferences;
import i0.j.f.p.h;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import m0.c;
import m0.l.e;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;
import n0.a.m0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B!\b\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013B!\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;", "Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;", "Lcom/stripe/android/stripe3ds2/init/AppInfo;", "initAppInfo", "()Lcom/stripe/android/stripe3ds2/init/AppInfo;", "get", "(Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;", "store", "Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;", "", "appVersion", "I", "Lm0/l/e;", "workContext", "<init>", "(Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;ILm0/l/e;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "(Landroid/content/Context;ILm0/l/e;)V", "Companion", "Store", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: DefaultAppInfoRepository.kt */
public final class DefaultAppInfoRepository implements AppInfoRepository {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final int INVALID_VERSION_CODE = -1;
    /* access modifiers changed from: private */
    public final int appVersion;
    /* access modifiers changed from: private */
    public final Store store;

    @m0.l.f.a.c(c = "com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$1", f = "DefaultAppInfoRepository.kt", l = {47}, m = "invokeSuspend")
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    /* renamed from: com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$1  reason: invalid class name */
    /* compiled from: DefaultAppInfoRepository.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<f0, m0.l.c<? super m0.i>, Object> {
        public int I$0;
        public int label;
        public final /* synthetic */ DefaultAppInfoRepository this$0;

        {
            this.this$0 = r1;
        }

        public final m0.l.c<m0.i> create(Object obj, m0.l.c<?> cVar) {
            i.e(cVar, "completion");
            return new AnonymousClass1(this.this$0, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create(obj, (m0.l.c) obj2)).invokeSuspend(m0.i.a);
        }

        public final Object invokeSuspend(Object obj) {
            int i;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                h.d4(obj);
                int access$getAppVersion$p = this.this$0.appVersion;
                Store access$getStore$p = this.this$0.store;
                this.I$0 = access$getAppVersion$p;
                this.label = 1;
                Object obj2 = access$getStore$p.get(this);
                if (obj2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i = access$getAppVersion$p;
                obj = obj2;
            } else if (i2 == 1) {
                i = this.I$0;
                h.d4(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AppInfo appInfo = (AppInfo) obj;
            if (appInfo == null || i != appInfo.getVersion()) {
                AppInfo unused = this.this$0.initAppInfo();
            }
            return m0.i.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Companion;", "", "Landroid/content/Context;", "context", "", "getAppVersion", "(Landroid/content/Context;)I", "INVALID_VERSION_CODE", "I", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: DefaultAppInfoRepository.kt */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: private */
        public final int getAppVersion(Context context) {
            Object obj;
            try {
                obj = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (Throwable th) {
                obj = h.l0(th);
            }
            if (obj instanceof Result.Failure) {
                obj = -1;
            }
            return ((Number) obj).intValue();
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\tJ\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;", "", "Lcom/stripe/android/stripe3ds2/init/AppInfo;", "get", "(Lm0/l/c;)Ljava/lang/Object;", "appInfo", "Lm0/i;", "save", "(Lcom/stripe/android/stripe3ds2/init/AppInfo;)V", "Default", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: DefaultAppInfoRepository.kt */
    public interface Store {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u00020\t8B@\u0002X\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store$Default;", "Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;", "Lcom/stripe/android/stripe3ds2/init/AppInfo;", "get", "(Lm0/l/c;)Ljava/lang/Object;", "appInfo", "Lm0/i;", "save", "(Lcom/stripe/android/stripe3ds2/init/AppInfo;)V", "Landroid/content/SharedPreferences;", "sharedPrefs$delegate", "Lm0/c;", "getSharedPrefs", "()Landroid/content/SharedPreferences;", "sharedPrefs", "Lm0/l/e;", "workContext", "Lm0/l/e;", "", "appVersion", "I", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;ILm0/l/e;)V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: DefaultAppInfoRepository.kt */
        public static final class Default implements Store {
            /* access modifiers changed from: private */
            public static final Companion Companion = new Companion((f) null);
            @Deprecated
            private static final String KEY_APP_VERSION = "app_version";
            @Deprecated
            private static final String KEY_SDK_APP_ID = "sdk_app_id";
            @Deprecated
            private static final String PREFS_NAME = "app_info";
            private final int appVersion;
            private final c sharedPrefs$delegate;
            private final e workContext;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store$Default$Companion;", "", "", "KEY_APP_VERSION", "Ljava/lang/String;", "KEY_SDK_APP_ID", "PREFS_NAME", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
            /* compiled from: DefaultAppInfoRepository.kt */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(f fVar) {
                    this();
                }
            }

            public Default(Context context, int i, e eVar) {
                i.e(context, "context");
                i.e(eVar, "workContext");
                this.appVersion = i;
                this.workContext = eVar;
                this.sharedPrefs$delegate = h.H2(new DefaultAppInfoRepository$Store$Default$sharedPrefs$2(context));
            }

            /* access modifiers changed from: private */
            public final SharedPreferences getSharedPrefs() {
                return (SharedPreferences) this.sharedPrefs$delegate.getValue();
            }

            public Object get(m0.l.c<? super AppInfo> cVar) {
                return a.k4(this.workContext, new DefaultAppInfoRepository$Store$Default$get$2(this, (m0.l.c) null), cVar);
            }

            public void save(AppInfo appInfo) {
                i.e(appInfo, "appInfo");
                getSharedPrefs().edit().putInt("app_version", this.appVersion).putString(KEY_SDK_APP_ID, appInfo.getSdkAppId()).apply();
            }
        }

        Object get(m0.l.c<? super AppInfo> cVar);

        void save(AppInfo appInfo);
    }

    public DefaultAppInfoRepository(Store store2, int i, e eVar) {
        i.e(store2, "store");
        i.e(eVar, "workContext");
        this.store = store2;
        this.appVersion = i;
        a.E2(a.h(eVar), (e) null, (CoroutineStart) null, new AnonymousClass1(this, (m0.l.c) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final AppInfo initAppInfo() {
        String uuid = UUID.randomUUID().toString();
        i.d(uuid, "UUID.randomUUID().toString()");
        AppInfo appInfo = new AppInfo(uuid, this.appVersion);
        this.store.save(appInfo);
        return appInfo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object get(m0.l.c<? super com.stripe.android.stripe3ds2.init.AppInfo> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$get$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$get$1 r0 = (com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$get$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$get$1 r0 = new com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$get$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.L$0
            com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository r0 = (com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository) r0
            i0.j.f.p.h.d4(r5)
            goto L_0x0044
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            i0.j.f.p.h.d4(r5)
            com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$Store r5 = r4.store
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.get(r0)
            if (r5 != r1) goto L_0x0043
            return r1
        L_0x0043:
            r0 = r4
        L_0x0044:
            com.stripe.android.stripe3ds2.init.AppInfo r5 = (com.stripe.android.stripe3ds2.init.AppInfo) r5
            if (r5 == 0) goto L_0x0049
            goto L_0x004d
        L_0x0049:
            com.stripe.android.stripe3ds2.init.AppInfo r5 = r0.initAppInfo()
        L_0x004d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository.get(m0.l.c):java.lang.Object");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DefaultAppInfoRepository(Context context) {
        this(context, Companion.getAppVersion(context), (e) m0.c);
        i.e(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DefaultAppInfoRepository(Context context, int i, e eVar) {
        this((Store) new Store.Default(context, i, eVar), i, eVar);
        i.e(context, "context");
        i.e(eVar, "workContext");
    }
}
