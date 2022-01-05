package h0.t;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.navigation.common.R;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import h0.f.i;
import h0.t.b;
import i0.d.a.a.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: NavInflater */
public final class p {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    public Context b;
    public t c;

    public p(Context context, t tVar) {
        this.b = context;
        this.c = tVar;
    }

    public static r a(TypedValue typedValue, r rVar, r rVar2, String str, String str2) throws XmlPullParserException {
        if (rVar == null || rVar == rVar2) {
            return rVar != null ? rVar : rVar2;
        }
        StringBuilder U0 = a.U0("Type is ", str, " but found ", str2, ": ");
        U0.append(typedValue.data);
        throw new XmlPullParserException(U0.toString());
    }

    public final k b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        int depth;
        int i2;
        String str;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        k a2 = this.c.c(xmlResourceParser.getName()).a();
        a2.o(this.b, attributeSet2);
        int i3 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i3 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                return a2;
            }
            if (next == 2 && depth <= depth2) {
                String name = xmlResourceParser.getName();
                if ("argument".equals(name)) {
                    TypedArray obtainAttributes = resources2.obtainAttributes(attributeSet2, R.styleable.NavArgument);
                    String string = obtainAttributes.getString(R.styleable.NavArgument_android_name);
                    if (string != null) {
                        e d = d(obtainAttributes, resources2, i);
                        if (a2.a2 == null) {
                            a2.a2 = new HashMap<>();
                        }
                        a2.a2.put(string, d);
                        obtainAttributes.recycle();
                    } else {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                } else {
                    int i4 = i;
                    if ("deepLink".equals(name)) {
                        TypedArray obtainAttributes2 = resources2.obtainAttributes(attributeSet2, R.styleable.NavDeepLink);
                        String string2 = obtainAttributes2.getString(R.styleable.NavDeepLink_uri);
                        String string3 = obtainAttributes2.getString(R.styleable.NavDeepLink_action);
                        String string4 = obtainAttributes2.getString(R.styleable.NavDeepLink_mimeType);
                        if (!TextUtils.isEmpty(string2) || !TextUtils.isEmpty(string3) || !TextUtils.isEmpty(string4)) {
                            String str2 = null;
                            String replace = string2 != null ? string2.replace("${applicationId}", this.b.getPackageName()) : null;
                            if (!TextUtils.isEmpty(string3)) {
                                str = string3.replace("${applicationId}", this.b.getPackageName());
                                if (str.isEmpty()) {
                                    throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                                }
                            } else {
                                str = null;
                            }
                            if (string4 != null) {
                                str2 = string4.replace("${applicationId}", this.b.getPackageName());
                            }
                            h hVar = new h(replace, str, str2);
                            if (a2.Y1 == null) {
                                a2.Y1 = new ArrayList<>();
                            }
                            a2.Y1.add(hVar);
                            obtainAttributes2.recycle();
                        } else {
                            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                        }
                    } else {
                        if ("action".equals(name)) {
                            TypedArray obtainAttributes3 = resources2.obtainAttributes(attributeSet2, R.styleable.NavAction);
                            int resourceId = obtainAttributes3.getResourceId(R.styleable.NavAction_android_id, 0);
                            d dVar = new d(obtainAttributes3.getResourceId(R.styleable.NavAction_destination, 0));
                            dVar.b = new q(obtainAttributes3.getBoolean(R.styleable.NavAction_launchSingleTop, false), obtainAttributes3.getResourceId(R.styleable.NavAction_popUpTo, -1), obtainAttributes3.getBoolean(R.styleable.NavAction_popUpToInclusive, false), obtainAttributes3.getResourceId(R.styleable.NavAction_enterAnim, -1), obtainAttributes3.getResourceId(R.styleable.NavAction_exitAnim, -1), obtainAttributes3.getResourceId(R.styleable.NavAction_popEnterAnim, -1), obtainAttributes3.getResourceId(R.styleable.NavAction_popExitAnim, -1));
                            Bundle bundle = new Bundle();
                            int depth3 = xmlResourceParser.getDepth() + i3;
                            int i5 = i4;
                            while (true) {
                                int next2 = xmlResourceParser.next();
                                if (next2 == i3) {
                                    i2 = depth2;
                                    break;
                                }
                                int depth4 = xmlResourceParser.getDepth();
                                i2 = depth2;
                                if (depth4 < depth3 && next2 == 3) {
                                    break;
                                }
                                if (next2 == 2 && depth4 <= depth3) {
                                    if ("argument".equals(xmlResourceParser.getName())) {
                                        TypedArray obtainAttributes4 = resources2.obtainAttributes(attributeSet2, R.styleable.NavArgument);
                                        String string5 = obtainAttributes4.getString(R.styleable.NavArgument_android_name);
                                        if (string5 != null) {
                                            e d2 = d(obtainAttributes4, resources2, i5);
                                            boolean z = d2.c;
                                            if (z && z) {
                                                d2.a.d(bundle, string5, d2.d);
                                            }
                                            obtainAttributes4.recycle();
                                        } else {
                                            throw new XmlPullParserException("Arguments must have a name");
                                        }
                                    }
                                    i5 = i4;
                                }
                                depth2 = i2;
                                i3 = 1;
                            }
                            if (!bundle.isEmpty()) {
                                dVar.c = bundle;
                            }
                            i3 = 1;
                            if (!(!(a2 instanceof b.a))) {
                                throw new UnsupportedOperationException("Cannot add action " + resourceId + " to " + a2 + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                            } else if (resourceId != 0) {
                                if (a2.Z1 == null) {
                                    a2.Z1 = new i<>();
                                }
                                a2.Z1.h(resourceId, dVar);
                                obtainAttributes3.recycle();
                            } else {
                                throw new IllegalArgumentException("Cannot have an action with actionId 0");
                            }
                        } else {
                            i2 = depth2;
                            if (Include.INCLUDE_PARAM_NAME.equals(name) && (a2 instanceof m)) {
                                TypedArray obtainAttributes5 = resources2.obtainAttributes(attributeSet2, androidx.navigation.R.styleable.NavInclude);
                                ((m) a2).r(c(obtainAttributes5.getResourceId(androidx.navigation.R.styleable.NavInclude_graph, 0)));
                                obtainAttributes5.recycle();
                            } else if (a2 instanceof m) {
                                ((m) a2).r(b(resources, xmlResourceParser, attributeSet, i));
                            }
                        }
                        depth2 = i2;
                    }
                }
                i2 = depth2;
                depth2 = i2;
            }
        }
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049 A[Catch:{ Exception -> 0x0053, all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b A[Catch:{ Exception -> 0x0053, all -> 0x0051 }] */
    @android.annotation.SuppressLint({"ResourceType"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h0.t.m c(int r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.b
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.XmlResourceParser r1 = r0.getXml(r7)
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r1)
        L_0x000e:
            int r3 = r1.next()     // Catch:{ Exception -> 0x0053 }
            r4 = 2
            if (r3 == r4) goto L_0x0019
            r5 = 1
            if (r3 == r5) goto L_0x0019
            goto L_0x000e
        L_0x0019:
            if (r3 != r4) goto L_0x0049
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x0053 }
            h0.t.k r2 = r6.b(r0, r1, r2, r7)     // Catch:{ Exception -> 0x0053 }
            boolean r4 = r2 instanceof h0.t.m     // Catch:{ Exception -> 0x0053 }
            if (r4 == 0) goto L_0x002d
            h0.t.m r2 = (h0.t.m) r2     // Catch:{ Exception -> 0x0053 }
            r1.close()
            return r2
        L_0x002d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0053 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0053 }
            r4.<init>()     // Catch:{ Exception -> 0x0053 }
            java.lang.String r5 = "Root element <"
            r4.append(r5)     // Catch:{ Exception -> 0x0053 }
            r4.append(r3)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = "> did not inflate into a NavGraph"
            r4.append(r3)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0053 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0053 }
            throw r2     // Catch:{ Exception -> 0x0053 }
        L_0x0049:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = "No start tag found"
            r2.<init>(r3)     // Catch:{ Exception -> 0x0053 }
            throw r2     // Catch:{ Exception -> 0x0053 }
        L_0x0051:
            r7 = move-exception
            goto L_0x007b
        L_0x0053:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x0051 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r4.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r5 = "Exception inflating "
            r4.append(r5)     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = r0.getResourceName(r7)     // Catch:{ all -> 0x0051 }
            r4.append(r7)     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = " line "
            r4.append(r7)     // Catch:{ all -> 0x0051 }
            int r7 = r1.getLineNumber()     // Catch:{ all -> 0x0051 }
            r4.append(r7)     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0051 }
            r3.<init>(r7, r2)     // Catch:{ all -> 0x0051 }
            throw r3     // Catch:{ all -> 0x0051 }
        L_0x007b:
            r1.close()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.t.p.c(int):h0.t.m");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:110|111|112|113|114|115) */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r2 = h0.t.r.d;
        r2.c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        r2 = h0.t.r.f;
        r2.c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        r2 = h0.t.r.h;
        r2.c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0262, code lost:
        r2 = h0.t.r.j;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:110:0x0250 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:112:0x0256 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:114:0x025c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final h0.t.e d(android.content.res.TypedArray r17, android.content.res.Resources r18, int r19) throws org.xmlpull.v1.XmlPullParserException {
        /*
            r16 = this;
            r0 = r17
            int r1 = androidx.navigation.common.R.styleable.NavArgument_nullable
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            java.lang.ThreadLocal<android.util.TypedValue> r3 = a
            java.lang.Object r4 = r3.get()
            android.util.TypedValue r4 = (android.util.TypedValue) r4
            if (r4 != 0) goto L_0x001b
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            r3.set(r4)
        L_0x001b:
            int r3 = androidx.navigation.common.R.styleable.NavArgument_argType
            java.lang.String r3 = r0.getString(r3)
            java.lang.String r5 = "reference"
            java.lang.String r6 = "float"
            java.lang.String r7 = "boolean"
            java.lang.String r8 = "integer"
            if (r3 == 0) goto L_0x0149
            java.lang.String r9 = r18.getResourcePackageName(r19)
            h0.t.r<java.lang.Integer> r10 = h0.t.r.a
            boolean r11 = r8.equals(r3)
            if (r11 == 0) goto L_0x0039
            goto L_0x014a
        L_0x0039:
            h0.t.r<int[]> r10 = h0.t.r.c
            java.lang.String r11 = "integer[]"
            boolean r11 = r11.equals(r3)
            if (r11 == 0) goto L_0x0045
            goto L_0x014a
        L_0x0045:
            h0.t.r<java.lang.Long> r10 = h0.t.r.d
            java.lang.String r11 = "long"
            boolean r11 = r11.equals(r3)
            if (r11 == 0) goto L_0x0051
            goto L_0x014a
        L_0x0051:
            h0.t.r<long[]> r10 = h0.t.r.e
            java.lang.String r11 = "long[]"
            boolean r11 = r11.equals(r3)
            if (r11 == 0) goto L_0x005d
            goto L_0x014a
        L_0x005d:
            h0.t.r<java.lang.Boolean> r10 = h0.t.r.h
            boolean r11 = r7.equals(r3)
            if (r11 == 0) goto L_0x0067
            goto L_0x014a
        L_0x0067:
            h0.t.r<boolean[]> r10 = h0.t.r.i
            java.lang.String r11 = "boolean[]"
            boolean r11 = r11.equals(r3)
            if (r11 == 0) goto L_0x0073
            goto L_0x014a
        L_0x0073:
            h0.t.r<java.lang.String> r10 = h0.t.r.j
            java.lang.String r11 = "string"
            boolean r11 = r11.equals(r3)
            if (r11 == 0) goto L_0x007f
            goto L_0x014a
        L_0x007f:
            h0.t.r<java.lang.String[]> r11 = h0.t.r.k
            java.lang.String r12 = "string[]"
            boolean r12 = r12.equals(r3)
            if (r12 == 0) goto L_0x008c
        L_0x0089:
            r10 = r11
            goto L_0x014a
        L_0x008c:
            h0.t.r<java.lang.Float> r11 = h0.t.r.f
            boolean r12 = r6.equals(r3)
            if (r12 == 0) goto L_0x0095
            goto L_0x0089
        L_0x0095:
            h0.t.r<float[]> r11 = h0.t.r.g
            java.lang.String r12 = "float[]"
            boolean r12 = r12.equals(r3)
            if (r12 == 0) goto L_0x00a0
            goto L_0x0089
        L_0x00a0:
            h0.t.r<java.lang.Integer> r11 = h0.t.r.b
            boolean r12 = r5.equals(r3)
            if (r12 == 0) goto L_0x00a9
            goto L_0x0089
        L_0x00a9:
            boolean r11 = r3.isEmpty()
            if (r11 != 0) goto L_0x014a
            java.lang.String r10 = "."
            boolean r10 = r3.startsWith(r10)     // Catch:{ ClassNotFoundException -> 0x0142 }
            if (r10 == 0) goto L_0x00c9
            if (r9 == 0) goto L_0x00c9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0142 }
            r10.<init>()     // Catch:{ ClassNotFoundException -> 0x0142 }
            r10.append(r9)     // Catch:{ ClassNotFoundException -> 0x0142 }
            r10.append(r3)     // Catch:{ ClassNotFoundException -> 0x0142 }
            java.lang.String r9 = r10.toString()     // Catch:{ ClassNotFoundException -> 0x0142 }
            goto L_0x00ca
        L_0x00c9:
            r9 = r3
        L_0x00ca:
            java.lang.String r10 = "[]"
            boolean r10 = r3.endsWith(r10)     // Catch:{ ClassNotFoundException -> 0x0142 }
            if (r10 == 0) goto L_0x00fc
            int r10 = r9.length()     // Catch:{ ClassNotFoundException -> 0x0142 }
            int r10 = r10 + -2
            java.lang.String r9 = r9.substring(r2, r10)     // Catch:{ ClassNotFoundException -> 0x0142 }
            java.lang.Class r10 = java.lang.Class.forName(r9)     // Catch:{ ClassNotFoundException -> 0x0142 }
            java.lang.Class<android.os.Parcelable> r11 = android.os.Parcelable.class
            boolean r11 = r11.isAssignableFrom(r10)     // Catch:{ ClassNotFoundException -> 0x0142 }
            if (r11 == 0) goto L_0x00ee
            h0.t.r$m r9 = new h0.t.r$m     // Catch:{ ClassNotFoundException -> 0x0142 }
            r9.<init>(r10)     // Catch:{ ClassNotFoundException -> 0x0142 }
            goto L_0x010d
        L_0x00ee:
            java.lang.Class<java.io.Serializable> r11 = java.io.Serializable.class
            boolean r11 = r11.isAssignableFrom(r10)     // Catch:{ ClassNotFoundException -> 0x0142 }
            if (r11 == 0) goto L_0x012b
            h0.t.r$o r9 = new h0.t.r$o     // Catch:{ ClassNotFoundException -> 0x0142 }
            r9.<init>(r10)     // Catch:{ ClassNotFoundException -> 0x0142 }
            goto L_0x010d
        L_0x00fc:
            java.lang.Class r10 = java.lang.Class.forName(r9)     // Catch:{ ClassNotFoundException -> 0x0142 }
            java.lang.Class<android.os.Parcelable> r11 = android.os.Parcelable.class
            boolean r11 = r11.isAssignableFrom(r10)     // Catch:{ ClassNotFoundException -> 0x0142 }
            if (r11 == 0) goto L_0x010f
            h0.t.r$n r9 = new h0.t.r$n     // Catch:{ ClassNotFoundException -> 0x0142 }
            r9.<init>(r10)     // Catch:{ ClassNotFoundException -> 0x0142 }
        L_0x010d:
            r10 = r9
            goto L_0x014a
        L_0x010f:
            java.lang.Class<java.lang.Enum> r11 = java.lang.Enum.class
            boolean r11 = r11.isAssignableFrom(r10)     // Catch:{ ClassNotFoundException -> 0x0142 }
            if (r11 == 0) goto L_0x011d
            h0.t.r$l r9 = new h0.t.r$l     // Catch:{ ClassNotFoundException -> 0x0142 }
            r9.<init>(r10)     // Catch:{ ClassNotFoundException -> 0x0142 }
            goto L_0x010d
        L_0x011d:
            java.lang.Class<java.io.Serializable> r11 = java.io.Serializable.class
            boolean r11 = r11.isAssignableFrom(r10)     // Catch:{ ClassNotFoundException -> 0x0142 }
            if (r11 == 0) goto L_0x012b
            h0.t.r$p r9 = new h0.t.r$p     // Catch:{ ClassNotFoundException -> 0x0142 }
            r9.<init>(r10)     // Catch:{ ClassNotFoundException -> 0x0142 }
            goto L_0x010d
        L_0x012b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ ClassNotFoundException -> 0x0142 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0142 }
            r1.<init>()     // Catch:{ ClassNotFoundException -> 0x0142 }
            r1.append(r9)     // Catch:{ ClassNotFoundException -> 0x0142 }
            java.lang.String r2 = " is not Serializable or Parcelable."
            r1.append(r2)     // Catch:{ ClassNotFoundException -> 0x0142 }
            java.lang.String r1 = r1.toString()     // Catch:{ ClassNotFoundException -> 0x0142 }
            r0.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x0142 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x0142 }
        L_0x0142:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0149:
            r10 = 0
        L_0x014a:
            int r9 = androidx.navigation.common.R.styleable.NavArgument_android_defaultValue
            boolean r11 = r0.getValue(r9, r4)
            r12 = 1
            if (r11 == 0) goto L_0x026a
            h0.t.r<java.lang.Integer> r11 = h0.t.r.b
            java.lang.String r13 = "' for "
            java.lang.String r14 = "unsupported value '"
            r15 = 16
            if (r10 != r11) goto L_0x0197
            int r0 = r4.resourceId
            if (r0 == 0) goto L_0x0167
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x026b
        L_0x0167:
            int r0 = r4.type
            if (r0 != r15) goto L_0x0175
            int r0 = r4.data
            if (r0 != 0) goto L_0x0175
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x026b
        L_0x0175:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r14)
            java.lang.CharSequence r2 = r4.string
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r10.b()
            r1.append(r2)
            java.lang.String r2 = ". Must be a reference to a resource."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0197:
            int r2 = r4.resourceId
            if (r2 == 0) goto L_0x01c8
            if (r10 != 0) goto L_0x01a4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r10 = r11
            goto L_0x026b
        L_0x01a4:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r14)
            java.lang.CharSequence r2 = r4.string
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r10.b()
            r1.append(r2)
            java.lang.String r2 = ". You must use a \""
            r1.append(r2)
            java.lang.String r2 = "\" type to reference other resources."
            java.lang.String r1 = i0.d.a.a.a.y0(r1, r5, r2)
            r0.<init>(r1)
            throw r0
        L_0x01c8:
            h0.t.r<java.lang.String> r2 = h0.t.r.j
            if (r10 != r2) goto L_0x01d2
            java.lang.String r0 = r0.getString(r9)
            goto L_0x026b
        L_0x01d2:
            int r0 = r4.type
            r2 = 3
            if (r0 == r2) goto L_0x0241
            r2 = 4
            if (r0 == r2) goto L_0x0232
            r2 = 5
            if (r0 == r2) goto L_0x021c
            r2 = 18
            if (r0 == r2) goto L_0x020a
            if (r0 < r15) goto L_0x01f5
            r2 = 31
            if (r0 > r2) goto L_0x01f5
            h0.t.r<java.lang.Integer> r0 = h0.t.r.a
            h0.t.r r10 = a(r4, r10, r0, r3, r8)
            int r0 = r4.data
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x026b
        L_0x01f5:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "unsupported argument type "
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
            int r2 = r4.type
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x020a:
            h0.t.r<java.lang.Boolean> r0 = h0.t.r.h
            h0.t.r r10 = a(r4, r10, r0, r3, r7)
            int r0 = r4.data
            if (r0 == 0) goto L_0x0216
            r0 = r12
            goto L_0x0217
        L_0x0216:
            r0 = 0
        L_0x0217:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x026b
        L_0x021c:
            h0.t.r<java.lang.Integer> r0 = h0.t.r.a
            java.lang.String r2 = "dimension"
            h0.t.r r10 = a(r4, r10, r0, r3, r2)
            android.util.DisplayMetrics r0 = r18.getDisplayMetrics()
            float r0 = r4.getDimension(r0)
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x026b
        L_0x0232:
            h0.t.r<java.lang.Float> r0 = h0.t.r.f
            h0.t.r r10 = a(r4, r10, r0, r3, r6)
            float r0 = r4.getFloat()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x026b
        L_0x0241:
            java.lang.CharSequence r0 = r4.string
            java.lang.String r0 = r0.toString()
            if (r10 != 0) goto L_0x0265
            h0.t.r<java.lang.Integer> r2 = h0.t.r.a     // Catch:{ IllegalArgumentException -> 0x0250 }
            r2.c(r0)     // Catch:{ IllegalArgumentException -> 0x0250 }
        L_0x024e:
            r10 = r2
            goto L_0x0265
        L_0x0250:
            h0.t.r<java.lang.Long> r2 = h0.t.r.d     // Catch:{ IllegalArgumentException -> 0x0256 }
            r2.c(r0)     // Catch:{ IllegalArgumentException -> 0x0256 }
            goto L_0x024e
        L_0x0256:
            h0.t.r<java.lang.Float> r2 = h0.t.r.f     // Catch:{ IllegalArgumentException -> 0x025c }
            r2.c(r0)     // Catch:{ IllegalArgumentException -> 0x025c }
            goto L_0x024e
        L_0x025c:
            h0.t.r<java.lang.Boolean> r2 = h0.t.r.h     // Catch:{ IllegalArgumentException -> 0x0262 }
            r2.c(r0)     // Catch:{ IllegalArgumentException -> 0x0262 }
            goto L_0x024e
        L_0x0262:
            h0.t.r<java.lang.String> r2 = h0.t.r.j
            goto L_0x024e
        L_0x0265:
            java.lang.Object r0 = r10.c(r0)
            goto L_0x026b
        L_0x026a:
            r0 = 0
        L_0x026b:
            if (r0 == 0) goto L_0x026e
            goto L_0x0270
        L_0x026e:
            r0 = 0
            r12 = 0
        L_0x0270:
            if (r10 == 0) goto L_0x0273
            goto L_0x0274
        L_0x0273:
            r10 = 0
        L_0x0274:
            if (r10 != 0) goto L_0x0353
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 == 0) goto L_0x027f
            h0.t.r<java.lang.Integer> r2 = h0.t.r.a
        L_0x027c:
            r10 = r2
            goto L_0x0353
        L_0x027f:
            boolean r2 = r0 instanceof int[]
            if (r2 == 0) goto L_0x0286
            h0.t.r<int[]> r2 = h0.t.r.c
            goto L_0x027c
        L_0x0286:
            boolean r2 = r0 instanceof java.lang.Long
            if (r2 == 0) goto L_0x028d
            h0.t.r<java.lang.Long> r2 = h0.t.r.d
            goto L_0x027c
        L_0x028d:
            boolean r2 = r0 instanceof long[]
            if (r2 == 0) goto L_0x0294
            h0.t.r<long[]> r2 = h0.t.r.e
            goto L_0x027c
        L_0x0294:
            boolean r2 = r0 instanceof java.lang.Float
            if (r2 == 0) goto L_0x029b
            h0.t.r<java.lang.Float> r2 = h0.t.r.f
            goto L_0x027c
        L_0x029b:
            boolean r2 = r0 instanceof float[]
            if (r2 == 0) goto L_0x02a2
            h0.t.r<float[]> r2 = h0.t.r.g
            goto L_0x027c
        L_0x02a2:
            boolean r2 = r0 instanceof java.lang.Boolean
            if (r2 == 0) goto L_0x02a9
            h0.t.r<java.lang.Boolean> r2 = h0.t.r.h
            goto L_0x027c
        L_0x02a9:
            boolean r2 = r0 instanceof boolean[]
            if (r2 == 0) goto L_0x02b0
            h0.t.r<boolean[]> r2 = h0.t.r.i
            goto L_0x027c
        L_0x02b0:
            boolean r2 = r0 instanceof java.lang.String
            if (r2 != 0) goto L_0x034f
            if (r0 != 0) goto L_0x02b8
            goto L_0x034f
        L_0x02b8:
            boolean r2 = r0 instanceof java.lang.String[]
            if (r2 == 0) goto L_0x02bf
            h0.t.r<java.lang.String[]> r2 = h0.t.r.k
            goto L_0x027c
        L_0x02bf:
            java.lang.Class r2 = r0.getClass()
            boolean r2 = r2.isArray()
            if (r2 == 0) goto L_0x02e7
            java.lang.Class<android.os.Parcelable> r2 = android.os.Parcelable.class
            java.lang.Class r3 = r0.getClass()
            java.lang.Class r3 = r3.getComponentType()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x02e7
            h0.t.r$m r2 = new h0.t.r$m
            java.lang.Class r3 = r0.getClass()
            java.lang.Class r3 = r3.getComponentType()
            r2.<init>(r3)
            goto L_0x027c
        L_0x02e7:
            java.lang.Class r2 = r0.getClass()
            boolean r2 = r2.isArray()
            if (r2 == 0) goto L_0x0310
            java.lang.Class<java.io.Serializable> r2 = java.io.Serializable.class
            java.lang.Class r3 = r0.getClass()
            java.lang.Class r3 = r3.getComponentType()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0310
            h0.t.r$o r2 = new h0.t.r$o
            java.lang.Class r3 = r0.getClass()
            java.lang.Class r3 = r3.getComponentType()
            r2.<init>(r3)
            goto L_0x027c
        L_0x0310:
            boolean r2 = r0 instanceof android.os.Parcelable
            if (r2 == 0) goto L_0x031f
            h0.t.r$n r2 = new h0.t.r$n
            java.lang.Class r3 = r0.getClass()
            r2.<init>(r3)
            goto L_0x027c
        L_0x031f:
            boolean r2 = r0 instanceof java.lang.Enum
            if (r2 == 0) goto L_0x032e
            h0.t.r$l r2 = new h0.t.r$l
            java.lang.Class r3 = r0.getClass()
            r2.<init>(r3)
            goto L_0x027c
        L_0x032e:
            boolean r2 = r0 instanceof java.io.Serializable
            if (r2 == 0) goto L_0x033d
            h0.t.r$p r2 = new h0.t.r$p
            java.lang.Class r3 = r0.getClass()
            r2.<init>(r3)
            goto L_0x027c
        L_0x033d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Object of type "
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
            java.lang.String r3 = " is not supported for navigation arguments."
            java.lang.String r0 = i0.d.a.a.a.d0(r0, r2, r3)
            r1.<init>(r0)
            throw r1
        L_0x034f:
            h0.t.r<java.lang.String> r2 = h0.t.r.j
            goto L_0x027c
        L_0x0353:
            h0.t.e r2 = new h0.t.e
            r2.<init>(r10, r1, r0, r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.t.p.d(android.content.res.TypedArray, android.content.res.Resources, int):h0.t.e");
    }
}
