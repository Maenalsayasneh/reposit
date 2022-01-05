package com.pubnub.api;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.vendor.Base64;
import i0.d.a.a.a;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.EmptySet;
import m0.j.g;
import m0.n.b.i;
import q0.b0;
import q0.d0;
import q0.h0.c;
import q0.v;
import q0.w;
import r0.f;

public class PubNubUtil {
    public static final String AUTH_QUERY_PARAM_NAME = "auth";
    private static final String CHARSET = "UTF-8";
    public static final String SIGNATURE_QUERY_PARAM_NAME = "signature";
    public static final String TIMESTAMP_QUERY_PARAM_NAME = "timestamp";
    private static final Logger log = Logger.getLogger(PubNubUtil.class.getName());

    private PubNubUtil() {
    }

    public static String generateSignature(PNConfiguration pNConfiguration, String str, Map<String, String> map, String str2, String str3, int i) {
        StringBuilder sb = new StringBuilder();
        map.put("timestamp", String.valueOf(i));
        String preparePamArguments = preparePamArguments(map);
        boolean z = !str.startsWith("/publish") || !str2.equalsIgnoreCase("post");
        if (!z) {
            sb.append(pNConfiguration.getSubscribeKey());
            sb.append("\n");
            sb.append(pNConfiguration.getPublishKey());
            sb.append("\n");
            sb.append(str);
            sb.append("\n");
            sb.append(preparePamArguments);
        } else {
            sb.append(str2.toUpperCase());
            sb.append("\n");
            sb.append(pNConfiguration.getPublishKey());
            sb.append("\n");
            a.s(sb, str, "\n", preparePamArguments, "\n");
            sb.append(str3);
        }
        try {
            String signSHA256 = signSHA256(pNConfiguration.getSecretKey(), sb.toString());
            if (z) {
                return "v2.".concat(removeTrailingEqualSigns(signSHA256));
            }
            return signSHA256;
        } catch (PubNubException | UnsupportedEncodingException e) {
            Logger logger = log;
            StringBuilder P0 = a.P0("signature failed on SignatureInterceptor: ");
            P0.append(e.toString());
            logger.warning(P0.toString());
            return "";
        }
    }

    public static <T> boolean isNullOrEmpty(Collection<T> collection) {
        return collection == null || collection.isEmpty();
    }

    public static String joinLong(List<Long> list, String str) {
        StringBuilder sb = new StringBuilder();
        for (Long longValue : list) {
            sb.append(Long.toString(longValue.longValue()).toLowerCase());
            sb.append(InstabugDbContract.COMMA_SEP);
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

    public static String joinString(List<String> list, String str) {
        StringBuilder sb = new StringBuilder();
        for (String append : list) {
            sb.append(append);
            sb.append(str);
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

    public static String pamEncode(String str) {
        String urlEncode = urlEncode(str);
        return urlEncode != null ? urlEncode.replace("*", "%2A").replace("!", "%21").replace("'", "%27").replace("(", "%28").replace(")", "%29").replace("[", "%5B").replace("]", "%5D").replace("~", "%7E") : urlEncode;
    }

    public static String preparePamArguments(Map<String, String> map) {
        Iterator it = new TreeSet(map.keySet()).iterator();
        String str = "";
        int i = 0;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (i != 0) {
                str = str.concat("&");
            }
            str = str.concat(str2).concat("=").concat(pamEncode(map.get(str2)));
            i++;
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
        r5.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] readBytes(java.io.InputStream r5) throws java.io.IOException {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 8192(0x2000, float:1.14794E-41)
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x001e }
        L_0x0009:
            int r2 = r5.read(r1)     // Catch:{ all -> 0x001e }
            r3 = -1
            if (r2 == r3) goto L_0x0014
            r4 = 0
            r0.write(r1, r4, r2)     // Catch:{ all -> 0x001e }
        L_0x0014:
            if (r2 != r3) goto L_0x0009
            byte[] r5 = r0.toByteArray()     // Catch:{ all -> 0x001e }
            r0.close()
            return r5
        L_0x001e:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0025 }
            goto L_0x0029
        L_0x0025:
            r0 = move-exception
            r5.addSuppressed(r0)
        L_0x0029:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pubnub.api.PubNubUtil.readBytes(java.io.InputStream):byte[]");
    }

    public static String removeTrailingEqualSigns(String str) {
        while (str.charAt(str.length() - 1) == '=') {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    public static String replaceLast(String str, String str2, String str3) {
        int lastIndexOf = str.lastIndexOf(str2);
        return lastIndexOf > -1 ? str.substring(0, lastIndexOf).concat(str3).concat(str.substring(str2.length() + lastIndexOf, str.length())) : str;
    }

    private static String requestBodyToString(b0 b0Var) {
        d0 d0Var = b0Var.e;
        if (d0Var == null) {
            return "";
        }
        try {
            f fVar = new f();
            d0Var.d(fVar);
            return fVar.w();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static boolean shouldSignRequest(PNConfiguration pNConfiguration) {
        return pNConfiguration.getSecretKey() != null;
    }

    public static b0 signRequest(b0 b0Var, PNConfiguration pNConfiguration, int i) {
        Map<Class<?>, Object> map;
        Map map2;
        if (!shouldSignRequest(pNConfiguration)) {
            return b0Var;
        }
        String generateSignature = generateSignature(pNConfiguration, b0Var, i);
        w.a f = b0Var.b.f();
        f.a("timestamp", String.valueOf(i));
        f.a(SIGNATURE_QUERY_PARAM_NAME, generateSignature);
        w b = f.b();
        i.e(b0Var, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        new LinkedHashMap();
        String str = b0Var.c;
        d0 d0Var = b0Var.e;
        if (b0Var.f.isEmpty()) {
            map = new LinkedHashMap<>();
        } else {
            map = g.B0(b0Var.f);
        }
        v.a j = b0Var.d.j();
        i.e(b, "url");
        v d = j.d();
        byte[] bArr = c.a;
        i.e(map, "$this$toImmutableMap");
        if (map.isEmpty()) {
            map2 = g.o();
        } else {
            map2 = Collections.unmodifiableMap(new LinkedHashMap(map));
            i.d(map2, "Collections.unmodifiableMap(LinkedHashMap(this))");
        }
        return new b0(b, str, d, d0Var, map2);
    }

    public static String signSHA256(String str, String str2) throws PubNubException, UnsupportedEncodingException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes("UTF-8"), "HmacSHA256");
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            try {
                instance.init(secretKeySpec);
                return new String(Base64.encode(instance.doFinal(str2.getBytes("UTF-8")), 0), "UTF-8").replace('+', '-').replace('/', '_').replace("\n", "");
            } catch (InvalidKeyException e) {
                throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_CRYPTO_ERROR).errormsg(e.getMessage()).cause(e).build();
            }
        } catch (NoSuchAlgorithmException e2) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_CRYPTO_ERROR).errormsg(e2.getMessage()).cause(e2).build();
        }
    }

    public static String urlDecode(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static String urlEncode(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    private static String generateSignature(PNConfiguration pNConfiguration, b0 b0Var, int i) {
        Set<String> set;
        HashMap hashMap = new HashMap();
        w wVar = b0Var.b;
        if (wVar.j == null) {
            set = EmptySet.c;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            m0.q.c e = m0.q.i.e(m0.q.i.f(0, wVar.j.size()), 2);
            int i2 = e.c;
            int i3 = e.d;
            int i4 = e.q;
            if (i4 < 0 ? i2 >= i3 : i2 <= i3) {
                while (true) {
                    String str = wVar.j.get(i2);
                    i.c(str);
                    linkedHashSet.add(str);
                    if (i2 == i3) {
                        break;
                    }
                    i2 += i4;
                }
            }
            set = Collections.unmodifiableSet(linkedHashSet);
            i.d(set, "Collections.unmodifiableSet(result)");
        }
        for (String str2 : set) {
            hashMap.put(str2, b0Var.b.h(str2));
        }
        return generateSignature(pNConfiguration, b0Var.b.b(), hashMap, b0Var.c, requestBodyToString(b0Var), i);
    }
}
