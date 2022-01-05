package p0.a;

import com.pubnub.api.vendor.FileEncryptionUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import oauth.signpost.http.HttpParameters;

/* compiled from: OAuth */
public class a {
    public static final i0.h.d.a.a.a.a a = new i0.h.d.a.a.a.a("-._~", false);

    public static String a(String str, String... strArr) {
        String str2 = "?";
        if (str.contains(str2)) {
            str2 = "&";
        }
        StringBuilder sb = new StringBuilder(i0.d.a.a.a.n0(str, str2));
        for (int i = 0; i < strArr.length; i += 2) {
            if (i > 0) {
                sb.append("&");
            }
            sb.append(f(strArr[i]));
            sb.append("=");
            sb.append(f(strArr[i + 1]));
        }
        return sb.toString();
    }

    public static void b(String str, String str2) {
        if (System.getProperty("debug") != null) {
            PrintStream printStream = System.out;
            printStream.println("[SIGNPOST] " + str + ": " + str2);
        }
    }

    public static HttpParameters c(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
            sb.append(readLine);
        }
        return d(sb.toString());
    }

    public static HttpParameters d(String str) {
        String str2;
        String str3;
        HttpParameters httpParameters = new HttpParameters();
        if (str == null || str.length() == 0) {
            return httpParameters;
        }
        for (String str4 : str.split("\\&")) {
            int indexOf = str4.indexOf(61);
            if (indexOf < 0) {
                str3 = e(str4);
                str2 = null;
            } else {
                String e = e(str4.substring(0, indexOf));
                str2 = e(str4.substring(indexOf + 1));
                str3 = e;
            }
            httpParameters.c(str3, str2, false);
        }
        return httpParameters;
    }

    public static String e(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLDecoder.decode(str, FileEncryptionUtil.ENCODING_UTF_8);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: char} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String f(java.lang.String r19) {
        /*
            r0 = r19
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = ""
            return r0
        L_0x0007:
            i0.h.d.a.a.a.a r1 = a
            java.util.Objects.requireNonNull(r1)
            int r2 = r19.length()
            r3 = 0
            r4 = r3
        L_0x0012:
            if (r4 >= r2) goto L_0x0232
            char r5 = r0.charAt(r4)
            boolean[] r6 = r1.e
            int r7 = r6.length
            if (r5 >= r7) goto L_0x0025
            boolean r5 = r6[r5]
            if (r5 != 0) goto L_0x0022
            goto L_0x0025
        L_0x0022:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0025:
            int r2 = r19.length()
            java.lang.ThreadLocal<char[]> r5 = i0.h.d.a.a.a.b.a
            java.lang.Object r5 = r5.get()
            char[] r5 = (char[]) r5
            r6 = r3
            r7 = r6
        L_0x0033:
            if (r4 >= r2) goto L_0x0219
            if (r4 >= r2) goto L_0x0211
            int r8 = r4 + 1
            char r9 = r0.charAt(r4)
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r9 < r10) goto L_0x00ac
            r10 = 57343(0xdfff, float:8.0355E-41)
            if (r9 <= r10) goto L_0x0048
            goto L_0x00ac
        L_0x0048:
            r10 = 56319(0xdbff, float:7.892E-41)
            java.lang.String r11 = " at index "
            java.lang.String r12 = "' with value "
            if (r9 > r10) goto L_0x0087
            if (r8 != r2) goto L_0x0055
            int r9 = -r9
            goto L_0x00ac
        L_0x0055:
            char r10 = r0.charAt(r8)
            boolean r13 = java.lang.Character.isLowSurrogate(r10)
            if (r13 == 0) goto L_0x0064
            int r9 = java.lang.Character.toCodePoint(r9, r10)
            goto L_0x00ac
        L_0x0064:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected low surrogate but got char '"
            r1.append(r2)
            r1.append(r10)
            r1.append(r12)
            r1.append(r10)
            r1.append(r11)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0087:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected low surrogate character '"
            r1.append(r2)
            r1.append(r9)
            r1.append(r12)
            r1.append(r9)
            r1.append(r11)
            int r8 = r8 + -1
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00ac:
            if (r9 < 0) goto L_0x0209
            boolean[] r8 = r1.e
            int r10 = r8.length
            r11 = 2
            r12 = 32
            r13 = 1
            if (r9 >= r10) goto L_0x00bd
            boolean r8 = r8[r9]
            if (r8 == 0) goto L_0x00bd
            r8 = 0
            goto L_0x00df
        L_0x00bd:
            if (r9 != r12) goto L_0x00c6
            boolean r8 = r1.d
            if (r8 == 0) goto L_0x00c6
            char[] r8 = i0.h.d.a.a.a.a.b
            goto L_0x00df
        L_0x00c6:
            r8 = 127(0x7f, float:1.78E-43)
            r10 = 37
            r12 = 3
            if (r9 > r8) goto L_0x00e2
            char[] r8 = new char[r12]
            r8[r3] = r10
            char[] r10 = i0.h.d.a.a.a.a.c
            r12 = r9 & 15
            char r12 = r10[r12]
            r8[r11] = r12
            int r12 = r9 >>> 4
            char r10 = r10[r12]
            r8[r13] = r10
        L_0x00df:
            r12 = r11
            goto L_0x01b6
        L_0x00e2:
            r8 = 2047(0x7ff, float:2.868E-42)
            r13 = 5
            r14 = 6
            r15 = 8
            r16 = 4
            if (r9 > r8) goto L_0x0115
            char[] r8 = new char[r14]
            r8[r3] = r10
            r8[r12] = r10
            char[] r10 = i0.h.d.a.a.a.a.c
            r12 = r9 & 15
            char r12 = r10[r12]
            r8[r13] = r12
            int r12 = r9 >>> 4
            r13 = r12 & 3
            r13 = r13 | 8
            char r13 = r10[r13]
            r8[r16] = r13
            int r12 = r12 >>> r11
            r13 = r12 & 15
            char r13 = r10[r13]
            r8[r11] = r13
            int r12 = r12 >>> 4
            r12 = r12 | 12
            char r10 = r10[r12]
            r13 = 1
            r8[r13] = r10
            goto L_0x00df
        L_0x0115:
            r8 = 1
            r13 = 65535(0xffff, float:9.1834E-41)
            r11 = 9
            r17 = 7
            if (r9 > r13) goto L_0x015a
            char[] r11 = new char[r11]
            r11[r3] = r10
            r13 = 69
            r11[r8] = r13
            r11[r12] = r10
            r11[r14] = r10
            char[] r8 = i0.h.d.a.a.a.a.c
            r10 = r9 & 15
            char r10 = r8[r10]
            r11[r15] = r10
            int r10 = r9 >>> 4
            r12 = r10 & 3
            r12 = r12 | 8
            char r12 = r8[r12]
            r11[r17] = r12
            r12 = 2
            int r10 = r10 >>> r12
            r12 = r10 & 15
            char r12 = r8[r12]
            r13 = 5
            r11[r13] = r12
            int r10 = r10 >>> 4
            r12 = r10 & 3
            r12 = r12 | 8
            char r12 = r8[r12]
            r11[r16] = r12
            r12 = 2
            int r10 = r10 >>> r12
            char r8 = r8[r10]
            r11[r12] = r8
            r13 = 1
            r8 = r11
            r12 = 2
            goto L_0x01b6
        L_0x015a:
            r8 = 1114111(0x10ffff, float:1.561202E-39)
            if (r9 > r8) goto L_0x01fd
            r8 = 12
            char[] r8 = new char[r8]
            r8[r3] = r10
            r13 = 70
            r18 = 1
            r8[r18] = r13
            r8[r12] = r10
            r8[r14] = r10
            r8[r11] = r10
            r10 = 11
            char[] r11 = i0.h.d.a.a.a.a.c
            r12 = r9 & 15
            char r12 = r11[r12]
            r8[r10] = r12
            int r10 = r9 >>> 4
            r12 = 10
            r13 = r10 & 3
            r13 = r13 | 8
            char r13 = r11[r13]
            r8[r12] = r13
            r12 = 2
            int r10 = r10 >>> r12
            r12 = r10 & 15
            char r12 = r11[r12]
            r8[r15] = r12
            int r10 = r10 >>> 4
            r12 = r10 & 3
            r12 = r12 | 8
            char r12 = r11[r12]
            r8[r17] = r12
            r12 = 2
            int r10 = r10 >>> r12
            r12 = r10 & 15
            char r12 = r11[r12]
            r13 = 5
            r8[r13] = r12
            int r10 = r10 >>> 4
            r12 = r10 & 3
            r12 = r12 | 8
            char r12 = r11[r12]
            r8[r16] = r12
            r12 = 2
            int r10 = r10 >>> r12
            r10 = r10 & 7
            char r10 = r11[r10]
            r8[r12] = r10
            r13 = r18
        L_0x01b6:
            if (r8 == 0) goto L_0x01dd
            int r10 = r4 - r6
            int r11 = r7 + r10
            int r14 = r8.length
            int r14 = r14 + r11
            int r15 = r5.length
            if (r15 >= r14) goto L_0x01ce
            int r15 = r2 - r4
            int r15 = r15 + r14
            int r15 = r15 + 32
            char[] r14 = new char[r15]
            if (r7 <= 0) goto L_0x01cd
            java.lang.System.arraycopy(r5, r3, r14, r3, r7)
        L_0x01cd:
            r5 = r14
        L_0x01ce:
            if (r10 <= 0) goto L_0x01d4
            r0.getChars(r6, r4, r5, r7)
            r7 = r11
        L_0x01d4:
            int r6 = r8.length
            if (r6 <= 0) goto L_0x01dd
            int r6 = r8.length
            java.lang.System.arraycopy(r8, r3, r5, r7, r6)
            int r6 = r8.length
            int r7 = r7 + r6
        L_0x01dd:
            boolean r6 = java.lang.Character.isSupplementaryCodePoint(r9)
            if (r6 == 0) goto L_0x01e5
            r11 = r12
            goto L_0x01e6
        L_0x01e5:
            r11 = r13
        L_0x01e6:
            int r6 = r4 + r11
            r4 = r6
        L_0x01e9:
            if (r4 >= r2) goto L_0x0033
            char r8 = r0.charAt(r4)
            boolean[] r9 = r1.e
            int r10 = r9.length
            if (r8 >= r10) goto L_0x0033
            boolean r8 = r9[r8]
            if (r8 != 0) goto L_0x01fa
            goto L_0x0033
        L_0x01fa:
            int r4 = r4 + 1
            goto L_0x01e9
        L_0x01fd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid unicode character value "
            java.lang.String r1 = i0.d.a.a.a.e0(r1, r9)
            r0.<init>(r1)
            throw r0
        L_0x0209:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trailing high surrogate at end of input"
            r0.<init>(r1)
            throw r0
        L_0x0211:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "Index exceeds specified range"
            r0.<init>(r1)
            throw r0
        L_0x0219:
            int r1 = r2 - r6
            if (r1 <= 0) goto L_0x022d
            int r1 = r1 + r7
            int r4 = r5.length
            if (r4 >= r1) goto L_0x0229
            char[] r4 = new char[r1]
            if (r7 <= 0) goto L_0x0228
            java.lang.System.arraycopy(r5, r3, r4, r3, r7)
        L_0x0228:
            r5 = r4
        L_0x0229:
            r0.getChars(r6, r2, r5, r7)
            r7 = r1
        L_0x022d:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r3, r7)
        L_0x0232:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.a.a.f(java.lang.String):java.lang.String");
    }
}
