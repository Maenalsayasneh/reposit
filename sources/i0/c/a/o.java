package i0.c.a;

import android.content.Context;
import android.location.Geocoder;
import java.util.Locale;

/* compiled from: DeviceInfo */
public class o {
    public static final String a = "i0.c.a.o";
    public boolean b = true;
    public Context c;
    public b d;

    /* compiled from: DeviceInfo */
    public class b {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public boolean k;
        public boolean l;

        /* JADX WARNING: Removed duplicated region for block: B:52:0x012e A[SYNTHETIC, Splitter:B:52:0x012e] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0154  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(i0.c.a.o.a r13) {
            /*
                r11 = this;
                java.lang.String r13 = "phone"
                i0.c.a.o.this = r12
                r11.<init>()
                java.lang.String r0 = android.os.Build.MANUFACTURER
                java.lang.String r1 = "Amazon"
                boolean r0 = r1.equals(r0)
                java.lang.String r1 = "Google Play Services not available"
                r2 = 1
                r3 = 0
                r4 = 0
                if (r0 == 0) goto L_0x0033
                android.content.Context r12 = r12.c
                android.content.ContentResolver r12 = r12.getContentResolver()
                java.lang.String r0 = "limit_ad_tracking"
                int r0 = android.provider.Settings.Secure.getInt(r12, r0, r3)
                if (r0 != r2) goto L_0x0026
                r0 = r2
                goto L_0x0027
            L_0x0026:
                r0 = r3
            L_0x0027:
                r11.k = r0
                java.lang.String r0 = "advertising_id"
                java.lang.String r12 = android.provider.Settings.Secure.getString(r12, r0)
                r11.a = r12
                goto L_0x00a5
            L_0x0033:
                java.lang.String r0 = "com.google.android.gms.ads.identifier.AdvertisingIdClient"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x009a, InvocationTargetException -> 0x0092, Exception -> 0x0087 }
                java.lang.String r5 = "getAdvertisingIdInfo"
                java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException -> 0x009a, InvocationTargetException -> 0x0092, Exception -> 0x0087 }
                java.lang.Class<android.content.Context> r7 = android.content.Context.class
                r6[r3] = r7     // Catch:{ ClassNotFoundException -> 0x009a, InvocationTargetException -> 0x0092, Exception -> 0x0087 }
                java.lang.reflect.Method r0 = r0.getMethod(r5, r6)     // Catch:{ ClassNotFoundException -> 0x009a, InvocationTargetException -> 0x0092, Exception -> 0x0087 }
                java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ ClassNotFoundException -> 0x009a, InvocationTargetException -> 0x0092, Exception -> 0x0087 }
                android.content.Context r12 = r12.c     // Catch:{ ClassNotFoundException -> 0x009a, InvocationTargetException -> 0x0092, Exception -> 0x0087 }
                r5[r3] = r12     // Catch:{ ClassNotFoundException -> 0x009a, InvocationTargetException -> 0x0092, Exception -> 0x0087 }
                java.lang.Object r12 = r0.invoke(r4, r5)     // Catch:{ ClassNotFoundException -> 0x009a, InvocationTargetException -> 0x0092, Exception -> 0x0087 }
                java.lang.Class r0 = r12.getClass()     // Catch:{ ClassNotFoundException -> 0x009a, InvocationTargetException -> 0x0092, Exception -> 0x0087 }
                java.lang.String r5 = "isLimitAdTrackingEnabled"
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x009a, InvocationTargetException -> 0x0092, Exception -> 0x0087 }
                java.lang.reflect.Method r0 = r0.getMethod(r5, r6)     // Catch:{ ClassNotFoundException -> 0x009a, InvocationTargetException -> 0x0092, Exception -> 0x0087 }
                java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x009a, InvocationTargetException -> 0x0092, Exception -> 0x0087 }
                java.lang.Object r0 = r0.invoke(r12, r5)     // Catch:{ ClassNotFoundException -> 0x009a, InvocationTargetException -> 0x0092, Exception -> 0x0087 }
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ ClassNotFoundException -> 0x009a, InvocationTargetException -> 0x0092, Exception -> 0x0087 }
                if (r0 == 0) goto L_0x006d
                boolean r0 = r0.booleanValue()     // Catch:{ ClassNotFoundException -> 0x009a, InvocationTargetException -> 0x0092, Exception -> 0x0087 }
                if (r0 == 0) goto L_0x006d
                r0 = r2
                goto L_0x006e
            L_0x006d:
                r0 = r3
            L_0x006e:
                r11.k = r0     // Catch:{ ClassNotFoundException -> 0x009a, InvocationTargetException -> 0x0092, Exception -> 0x0087 }
                java.lang.Class r0 = r12.getClass()     // Catch:{ ClassNotFoundException -> 0x009a, InvocationTargetException -> 0x0092, Exception -> 0x0087 }
                java.lang.String r5 = "getId"
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x009a, InvocationTargetException -> 0x0092, Exception -> 0x0087 }
                java.lang.reflect.Method r0 = r0.getMethod(r5, r6)     // Catch:{ ClassNotFoundException -> 0x009a, InvocationTargetException -> 0x0092, Exception -> 0x0087 }
                java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x009a, InvocationTargetException -> 0x0092, Exception -> 0x0087 }
                java.lang.Object r12 = r0.invoke(r12, r5)     // Catch:{ ClassNotFoundException -> 0x009a, InvocationTargetException -> 0x0092, Exception -> 0x0087 }
                java.lang.String r12 = (java.lang.String) r12     // Catch:{ ClassNotFoundException -> 0x009a, InvocationTargetException -> 0x0092, Exception -> 0x0087 }
                r11.a = r12     // Catch:{ ClassNotFoundException -> 0x009a, InvocationTargetException -> 0x0092, Exception -> 0x0087 }
                goto L_0x00a3
            L_0x0087:
                r12 = move-exception
                i0.c.a.k r0 = i0.c.a.k.a
                java.lang.String r5 = i0.c.a.o.a
                java.lang.String r6 = "Encountered an error connecting to Google Play Services"
                r0.b(r5, r6, r12)
                goto L_0x00a3
            L_0x0092:
                i0.c.a.k r12 = i0.c.a.k.a
                java.lang.String r0 = i0.c.a.o.a
                r12.c(r0, r1)
                goto L_0x00a3
            L_0x009a:
                i0.c.a.k r12 = i0.c.a.k.a
                java.lang.String r0 = i0.c.a.o.a
                java.lang.String r5 = "Google Play Services SDK not found!"
                r12.c(r0, r5)
            L_0x00a3:
                java.lang.String r12 = r11.a
            L_0x00a5:
                r11.a = r12
                i0.c.a.o r12 = i0.c.a.o.this     // Catch:{ NameNotFoundException | Exception -> 0x00be }
                android.content.Context r12 = r12.c     // Catch:{ NameNotFoundException | Exception -> 0x00be }
                android.content.pm.PackageManager r12 = r12.getPackageManager()     // Catch:{ NameNotFoundException | Exception -> 0x00be }
                i0.c.a.o r0 = i0.c.a.o.this     // Catch:{ NameNotFoundException | Exception -> 0x00be }
                android.content.Context r0 = r0.c     // Catch:{ NameNotFoundException | Exception -> 0x00be }
                java.lang.String r0 = r0.getPackageName()     // Catch:{ NameNotFoundException | Exception -> 0x00be }
                android.content.pm.PackageInfo r12 = r12.getPackageInfo(r0, r3)     // Catch:{ NameNotFoundException | Exception -> 0x00be }
                java.lang.String r12 = r12.versionName     // Catch:{ NameNotFoundException | Exception -> 0x00be }
                goto L_0x00bf
            L_0x00be:
                r12 = r4
            L_0x00bf:
                r11.c = r12
                java.lang.String r12 = "android"
                r11.d = r12
                java.lang.String r12 = android.os.Build.VERSION.RELEASE
                r11.e = r12
                java.lang.String r12 = android.os.Build.BRAND
                r11.f = r12
                java.lang.String r12 = android.os.Build.MANUFACTURER
                r11.g = r12
                java.lang.String r12 = android.os.Build.MODEL
                r11.h = r12
                i0.c.a.o r12 = i0.c.a.o.this     // Catch:{ Exception -> 0x00e4 }
                android.content.Context r12 = r12.c     // Catch:{ Exception -> 0x00e4 }
                java.lang.Object r12 = r12.getSystemService(r13)     // Catch:{ Exception -> 0x00e4 }
                android.telephony.TelephonyManager r12 = (android.telephony.TelephonyManager) r12     // Catch:{ Exception -> 0x00e4 }
                java.lang.String r12 = r12.getNetworkOperatorName()     // Catch:{ Exception -> 0x00e4 }
                goto L_0x00e5
            L_0x00e4:
                r12 = r4
            L_0x00e5:
                r11.i = r12
                i0.c.a.o r12 = i0.c.a.o.this
                boolean r0 = r12.b
                if (r0 != 0) goto L_0x00ee
                goto L_0x0126
            L_0x00ee:
                android.location.Location r12 = r12.d()
                if (r12 == 0) goto L_0x0126
                boolean r0 = android.location.Geocoder.isPresent()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException -> 0x0126 }
                if (r0 == 0) goto L_0x0126
                i0.c.a.o r0 = i0.c.a.o.this     // Catch:{ IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException -> 0x0126 }
                android.location.Geocoder r5 = r0.c()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException -> 0x0126 }
                double r6 = r12.getLatitude()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException -> 0x0126 }
                double r8 = r12.getLongitude()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException -> 0x0126 }
                r10 = 1
                java.util.List r12 = r5.getFromLocation(r6, r8, r10)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException -> 0x0126 }
                if (r12 == 0) goto L_0x0126
                java.util.Iterator r12 = r12.iterator()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException -> 0x0126 }
            L_0x0113:
                boolean r0 = r12.hasNext()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException -> 0x0126 }
                if (r0 == 0) goto L_0x0126
                java.lang.Object r0 = r12.next()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException -> 0x0126 }
                android.location.Address r0 = (android.location.Address) r0     // Catch:{ IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException -> 0x0126 }
                if (r0 == 0) goto L_0x0113
                java.lang.String r12 = r0.getCountryCode()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException -> 0x0126 }
                goto L_0x0127
            L_0x0126:
                r12 = r4
            L_0x0127:
                boolean r0 = i0.c.a.r.d(r12)
                if (r0 != 0) goto L_0x012e
                goto L_0x015c
            L_0x012e:
                i0.c.a.o r12 = i0.c.a.o.this     // Catch:{ Exception -> 0x014c }
                android.content.Context r12 = r12.c     // Catch:{ Exception -> 0x014c }
                java.lang.Object r12 = r12.getSystemService(r13)     // Catch:{ Exception -> 0x014c }
                android.telephony.TelephonyManager r12 = (android.telephony.TelephonyManager) r12     // Catch:{ Exception -> 0x014c }
                int r13 = r12.getPhoneType()     // Catch:{ Exception -> 0x014c }
                r0 = 2
                if (r13 == r0) goto L_0x014c
                java.lang.String r12 = r12.getNetworkCountryIso()     // Catch:{ Exception -> 0x014c }
                if (r12 == 0) goto L_0x014c
                java.util.Locale r13 = java.util.Locale.US     // Catch:{ Exception -> 0x014c }
                java.lang.String r12 = r12.toUpperCase(r13)     // Catch:{ Exception -> 0x014c }
                goto L_0x014d
            L_0x014c:
                r12 = r4
            L_0x014d:
                boolean r13 = i0.c.a.r.d(r12)
                if (r13 != 0) goto L_0x0154
                goto L_0x015c
            L_0x0154:
                java.util.Locale r12 = java.util.Locale.getDefault()
                java.lang.String r12 = r12.getCountry()
            L_0x015c:
                r11.b = r12
                java.util.Locale r12 = java.util.Locale.getDefault()
                java.lang.String r12 = r12.getLanguage()
                r11.j = r12
                java.lang.String r12 = "Google Play Services Util not found!"
                java.lang.String r13 = "i0.h.a.b.c.d"
                java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ NoClassDefFoundError -> 0x01d0, ClassNotFoundException -> 0x01c8, NoSuchMethodException -> 0x01c0, InvocationTargetException -> 0x01b8, IllegalAccessException -> 0x01b0, Exception -> 0x0196 }
                java.lang.String r0 = "isGooglePlayServicesAvailable"
                java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ NoClassDefFoundError -> 0x01d0, ClassNotFoundException -> 0x01c8, NoSuchMethodException -> 0x01c0, InvocationTargetException -> 0x01b8, IllegalAccessException -> 0x01b0, Exception -> 0x0196 }
                java.lang.Class<android.content.Context> r6 = android.content.Context.class
                r5[r3] = r6     // Catch:{ NoClassDefFoundError -> 0x01d0, ClassNotFoundException -> 0x01c8, NoSuchMethodException -> 0x01c0, InvocationTargetException -> 0x01b8, IllegalAccessException -> 0x01b0, Exception -> 0x0196 }
                java.lang.reflect.Method r13 = r13.getMethod(r0, r5)     // Catch:{ NoClassDefFoundError -> 0x01d0, ClassNotFoundException -> 0x01c8, NoSuchMethodException -> 0x01c0, InvocationTargetException -> 0x01b8, IllegalAccessException -> 0x01b0, Exception -> 0x0196 }
                java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ NoClassDefFoundError -> 0x01d0, ClassNotFoundException -> 0x01c8, NoSuchMethodException -> 0x01c0, InvocationTargetException -> 0x01b8, IllegalAccessException -> 0x01b0, Exception -> 0x0196 }
                i0.c.a.o r5 = i0.c.a.o.this     // Catch:{ NoClassDefFoundError -> 0x01d0, ClassNotFoundException -> 0x01c8, NoSuchMethodException -> 0x01c0, InvocationTargetException -> 0x01b8, IllegalAccessException -> 0x01b0, Exception -> 0x0196 }
                android.content.Context r5 = r5.c     // Catch:{ NoClassDefFoundError -> 0x01d0, ClassNotFoundException -> 0x01c8, NoSuchMethodException -> 0x01c0, InvocationTargetException -> 0x01b8, IllegalAccessException -> 0x01b0, Exception -> 0x0196 }
                r0[r3] = r5     // Catch:{ NoClassDefFoundError -> 0x01d0, ClassNotFoundException -> 0x01c8, NoSuchMethodException -> 0x01c0, InvocationTargetException -> 0x01b8, IllegalAccessException -> 0x01b0, Exception -> 0x0196 }
                java.lang.Object r13 = r13.invoke(r4, r0)     // Catch:{ NoClassDefFoundError -> 0x01d0, ClassNotFoundException -> 0x01c8, NoSuchMethodException -> 0x01c0, InvocationTargetException -> 0x01b8, IllegalAccessException -> 0x01b0, Exception -> 0x0196 }
                java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ NoClassDefFoundError -> 0x01d0, ClassNotFoundException -> 0x01c8, NoSuchMethodException -> 0x01c0, InvocationTargetException -> 0x01b8, IllegalAccessException -> 0x01b0, Exception -> 0x0196 }
                if (r13 == 0) goto L_0x0193
                int r12 = r13.intValue()     // Catch:{ NoClassDefFoundError -> 0x01d0, ClassNotFoundException -> 0x01c8, NoSuchMethodException -> 0x01c0, InvocationTargetException -> 0x01b8, IllegalAccessException -> 0x01b0, Exception -> 0x0196 }
                if (r12 != 0) goto L_0x0193
                goto L_0x0194
            L_0x0193:
                r2 = r3
            L_0x0194:
                r3 = r2
                goto L_0x01d7
            L_0x0196:
                r12 = move-exception
                i0.c.a.k r13 = i0.c.a.k.a
                java.lang.String r0 = i0.c.a.o.a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Error when checking for Google Play Services: "
                r1.append(r2)
                r1.append(r12)
                java.lang.String r12 = r1.toString()
                r13.c(r0, r12)
                goto L_0x01d7
            L_0x01b0:
                i0.c.a.k r12 = i0.c.a.k.a
                java.lang.String r13 = i0.c.a.o.a
                r12.c(r13, r1)
                goto L_0x01d7
            L_0x01b8:
                i0.c.a.k r12 = i0.c.a.k.a
                java.lang.String r13 = i0.c.a.o.a
                r12.c(r13, r1)
                goto L_0x01d7
            L_0x01c0:
                i0.c.a.k r12 = i0.c.a.k.a
                java.lang.String r13 = i0.c.a.o.a
                r12.c(r13, r1)
                goto L_0x01d7
            L_0x01c8:
                i0.c.a.k r13 = i0.c.a.k.a
                java.lang.String r0 = i0.c.a.o.a
                r13.c(r0, r12)
                goto L_0x01d7
            L_0x01d0:
                i0.c.a.k r13 = i0.c.a.k.a
                java.lang.String r0 = i0.c.a.o.a
                r13.c(r0, r12)
            L_0x01d7:
                r11.l = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.c.a.o.b.<init>(i0.c.a.o, i0.c.a.o$a):void");
        }
    }

    public o(Context context, boolean z) {
        this.c = context;
        this.b = z;
    }

    public String a() {
        return b().a;
    }

    public final b b() {
        if (this.d == null) {
            this.d = new b((a) null);
        }
        return this.d;
    }

    public Geocoder c() {
        return new Geocoder(this.c, Locale.ENGLISH);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0041 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.location.Location d() {
        /*
            r7 = this;
            java.lang.String r0 = "Failed to get most recent location"
            boolean r1 = r7.b
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            android.content.Context r1 = r7.c
            java.lang.String r3 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r3 = i0.c.a.r.a(r1, r3)
            r4 = 1
            if (r3 != 0) goto L_0x001e
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r1 = i0.c.a.r.a(r1, r3)
            if (r1 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r1 = 0
            goto L_0x001f
        L_0x001e:
            r1 = r4
        L_0x001f:
            if (r1 != 0) goto L_0x0022
            return r2
        L_0x0022:
            android.content.Context r1 = r7.c
            java.lang.String r3 = "location"
            java.lang.Object r1 = r1.getSystemService(r3)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            if (r1 != 0) goto L_0x002f
            return r2
        L_0x002f:
            java.util.List r3 = r1.getProviders(r4)     // Catch:{ Exception | SecurityException -> 0x0034 }
            goto L_0x0035
        L_0x0034:
            r3 = r2
        L_0x0035:
            if (r3 != 0) goto L_0x0038
            return r2
        L_0x0038:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0041:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0068
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            android.location.Location r5 = r1.getLastKnownLocation(r5)     // Catch:{ SecurityException -> 0x005a, Exception -> 0x0052 }
            goto L_0x0062
        L_0x0052:
            i0.c.a.k r5 = i0.c.a.k.a
            java.lang.String r6 = a
            r5.c(r6, r0)
            goto L_0x0061
        L_0x005a:
            i0.c.a.k r5 = i0.c.a.k.a
            java.lang.String r6 = a
            r5.c(r6, r0)
        L_0x0061:
            r5 = r2
        L_0x0062:
            if (r5 == 0) goto L_0x0041
            r4.add(r5)
            goto L_0x0041
        L_0x0068:
            r0 = -1
            java.util.Iterator r3 = r4.iterator()
        L_0x006e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0088
            java.lang.Object r4 = r3.next()
            android.location.Location r4 = (android.location.Location) r4
            long r5 = r4.getTime()
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 <= 0) goto L_0x006e
            long r0 = r4.getTime()
            r2 = r4
            goto L_0x006e
        L_0x0088:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.c.a.o.d():android.location.Location");
    }
}
