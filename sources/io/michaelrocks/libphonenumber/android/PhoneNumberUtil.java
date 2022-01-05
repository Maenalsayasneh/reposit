package io.michaelrocks.libphonenumber.android;

import android.content.Context;
import i0.j.f.p.h;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import io.michaelrocks.libphonenumber.android.internal.RegexCache;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k0.a.a.a.b;
import k0.a.a.a.d;
import k0.a.a.a.e.a;

public class PhoneNumberUtil {
    public static final Logger a = Logger.getLogger(PhoneNumberUtil.class.getName());
    public static final Map<Integer, String> b;
    public static final Map<Character, Character> c;
    public static final Map<Character, Character> d;
    public static final Map<Character, Character> e;
    public static final Map<Character, Character> f;
    public static final String g;
    public static final Pattern h = Pattern.compile("[+＋]+");
    public static final Pattern i = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]+");
    public static final Pattern j = Pattern.compile("(\\p{Nd})");
    public static final Pattern k = Pattern.compile("[+＋\\p{Nd}]");
    public static final Pattern l = Pattern.compile("[\\\\/] *x");
    public static final Pattern m = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
    public static final Pattern n = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
    public static final String o;
    public static final String p;
    public static final Pattern q;
    public static final Pattern r;
    public static final Pattern s = Pattern.compile("(\\$\\d)");
    public static final Pattern t = Pattern.compile("\\(?\\$1\\)?");
    public final Set<Integer> A = new HashSet();
    public final d u;
    public final Map<Integer, List<String>> v;
    public final a w = new a();
    public final Set<String> x = new HashSet(35);
    public final RegexCache y = new RegexCache(100);
    public final Set<String> z = new HashSet(320);

    public enum PhoneNumberFormat {
        E164,
        INTERNATIONAL,
        NATIONAL,
        RFC3966
    }

    public enum PhoneNumberType {
        FIXED_LINE,
        MOBILE,
        FIXED_LINE_OR_MOBILE,
        TOLL_FREE,
        PREMIUM_RATE,
        SHARED_COST,
        VOIP,
        PERSONAL_NUMBER,
        PAGER,
        UAN,
        VOICEMAIL,
        UNKNOWN
    }

    public enum ValidationResult {
        IS_POSSIBLE,
        IS_POSSIBLE_LOCAL_ONLY,
        INVALID_COUNTRY_CODE,
        TOO_SHORT,
        INVALID_LENGTH,
        TOO_LONG
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(54, "9");
        b = Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        Collections.unmodifiableSet(hashSet2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put('0', '0');
        hashMap2.put('1', '1');
        hashMap2.put('2', '2');
        hashMap2.put('3', '3');
        hashMap2.put('4', '4');
        hashMap2.put('5', '5');
        hashMap2.put('6', '6');
        hashMap2.put('7', '7');
        hashMap2.put('8', '8');
        hashMap2.put('9', '9');
        HashMap hashMap3 = new HashMap(40);
        hashMap3.put('A', '2');
        hashMap3.put('B', '2');
        hashMap3.put('C', '2');
        hashMap3.put('D', '3');
        hashMap3.put('E', '3');
        hashMap3.put('F', '3');
        hashMap3.put('G', '4');
        hashMap3.put('H', '4');
        hashMap3.put('I', '4');
        hashMap3.put('J', '5');
        hashMap3.put('K', '5');
        hashMap3.put('L', '5');
        hashMap3.put('M', '6');
        hashMap3.put('N', '6');
        hashMap3.put('O', '6');
        hashMap3.put('P', '7');
        hashMap3.put('Q', '7');
        hashMap3.put('R', '7');
        hashMap3.put('S', '7');
        hashMap3.put('T', '8');
        hashMap3.put('U', '8');
        hashMap3.put('V', '8');
        hashMap3.put('W', '9');
        hashMap3.put('X', '9');
        hashMap3.put('Y', '9');
        hashMap3.put('Z', '9');
        Map<Character, Character> unmodifiableMap = Collections.unmodifiableMap(hashMap3);
        d = unmodifiableMap;
        HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(unmodifiableMap);
        hashMap4.putAll(hashMap2);
        e = Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.putAll(hashMap2);
        hashMap5.put('+', '+');
        hashMap5.put('*', '*');
        hashMap5.put('#', '#');
        c = Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        for (Character charValue : unmodifiableMap.keySet()) {
            char charValue2 = charValue.charValue();
            hashMap6.put(Character.valueOf(Character.toLowerCase(charValue2)), Character.valueOf(charValue2));
            hashMap6.put(Character.valueOf(charValue2), Character.valueOf(charValue2));
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put('-', '-');
        hashMap6.put(65293, '-');
        hashMap6.put(8208, '-');
        hashMap6.put(8209, '-');
        hashMap6.put(8210, '-');
        hashMap6.put(8211, '-');
        hashMap6.put(8212, '-');
        hashMap6.put(8213, '-');
        hashMap6.put(8722, '-');
        hashMap6.put('/', '/');
        hashMap6.put(65295, '/');
        hashMap6.put(' ', ' ');
        hashMap6.put(12288, ' ');
        hashMap6.put(8288, ' ');
        hashMap6.put('.', '.');
        hashMap6.put(65294, '.');
        f = Collections.unmodifiableMap(hashMap6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> map = d;
        sb.append(Arrays.toString(map.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(map.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String sb2 = sb.toString();
        g = sb2;
        String str = "\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*" + sb2 + "\\p{Nd}" + "]*";
        o = str;
        String a2 = a(",;xｘ#＃~～");
        p = a2;
        a("xｘ#＃~～");
        q = Pattern.compile("(?:" + a2 + ")$", 66);
        r = Pattern.compile(str + "(?:" + a2 + ")?", 66);
        Pattern.compile("(\\D+)");
    }

    public PhoneNumberUtil(d dVar, Map<Integer, List<String>> map) {
        this.u = dVar;
        this.v = map;
        for (Map.Entry next : map.entrySet()) {
            List list = (List) next.getValue();
            if (list.size() != 1 || !"001".equals(list.get(0))) {
                this.z.addAll(list);
            } else {
                this.A.add(next.getKey());
            }
        }
        if (this.z.remove("001")) {
            a.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.x.addAll(map.get(1));
    }

    public static String a(String str) {
        return i0.d.a.a.a.y0(i0.d.a.a.a.U0(";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|[", str, "]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*", "(\\p{Nd}{1,7})", "#?|[- ]+("), "\\p{Nd}", "{1,5})#");
    }

    public static PhoneNumberUtil b(Context context) {
        if (context != null) {
            return new PhoneNumberUtil(new d(new b(context.getAssets())), h.Z0());
        }
        throw new IllegalArgumentException("context could not be null.");
    }

    public static boolean c(Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc) {
        if (phonemetadata$PhoneNumberDesc.q.size() == 1 && phonemetadata$PhoneNumberDesc.q.get(0).intValue() == -1) {
            return false;
        }
        return true;
    }

    public static boolean f(String str) {
        return str.length() == 0 || t.matcher(str).matches();
    }

    public static boolean s(CharSequence charSequence) {
        if (charSequence.length() < 2) {
            return false;
        }
        return r.matcher(charSequence).matches();
    }

    public static StringBuilder v(StringBuilder sb) {
        if (n.matcher(sb).matches()) {
            sb.replace(0, sb.length(), x(sb, e, true));
        } else {
            sb.replace(0, sb.length(), w(sb));
        }
        return sb;
    }

    public static String w(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            int digit = Character.digit(charSequence.charAt(i2), 10);
            if (digit != -1) {
                sb.append(digit);
            }
        }
        return sb.toString();
    }

    public static String x(CharSequence charSequence, Map<Character, Character> map, boolean z2) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char charAt = charSequence.charAt(i2);
            Character ch = map.get(Character.valueOf(Character.toUpperCase(charAt)));
            if (ch != null) {
                sb.append(ch);
            } else if (!z2) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public final ValidationResult A(CharSequence charSequence, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, PhoneNumberType phoneNumberType) {
        List<Integer> list;
        ArrayList arrayList;
        Phonemetadata$PhoneNumberDesc l2 = l(phonemetadata$PhoneMetadata, phoneNumberType);
        ArrayList arrayList2 = l2.q.isEmpty() ? phonemetadata$PhoneMetadata.d.q : l2.q;
        List<Integer> list2 = l2.x;
        if (phoneNumberType == PhoneNumberType.FIXED_LINE_OR_MOBILE) {
            if (!c(l(phonemetadata$PhoneMetadata, PhoneNumberType.FIXED_LINE))) {
                return A(charSequence, phonemetadata$PhoneMetadata, PhoneNumberType.MOBILE);
            }
            Phonemetadata$PhoneNumberDesc l3 = l(phonemetadata$PhoneMetadata, PhoneNumberType.MOBILE);
            if (c(l3)) {
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (l3.q.size() == 0) {
                    list = phonemetadata$PhoneMetadata.d.q;
                } else {
                    list = l3.q;
                }
                arrayList3.addAll(list);
                Collections.sort(arrayList3);
                if (list2.isEmpty()) {
                    arrayList = l3.x;
                } else {
                    ArrayList arrayList4 = new ArrayList(list2);
                    arrayList4.addAll(l3.x);
                    Collections.sort(arrayList4);
                    arrayList = arrayList4;
                }
                list2 = arrayList;
                arrayList2 = arrayList3;
            }
        }
        if (((Integer) arrayList2.get(0)).intValue() == -1) {
            return ValidationResult.INVALID_LENGTH;
        }
        int length = charSequence.length();
        if (list2.contains(Integer.valueOf(length))) {
            return ValidationResult.IS_POSSIBLE_LOCAL_ONLY;
        }
        int intValue = ((Integer) arrayList2.get(0)).intValue();
        if (intValue == length) {
            return ValidationResult.IS_POSSIBLE;
        }
        if (intValue > length) {
            return ValidationResult.TOO_SHORT;
        }
        if (((Integer) arrayList2.get(arrayList2.size() - 1)).intValue() < length) {
            return ValidationResult.TOO_LONG;
        }
        return arrayList2.subList(1, arrayList2.size()).contains(Integer.valueOf(length)) ? ValidationResult.IS_POSSIBLE : ValidationResult.INVALID_LENGTH;
    }

    public int d(StringBuilder sb, StringBuilder sb2) {
        if (!(sb.length() == 0 || sb.charAt(0) == '0')) {
            int length = sb.length();
            int i2 = 1;
            while (i2 <= 3 && i2 <= length) {
                int parseInt = Integer.parseInt(sb.substring(0, i2));
                if (this.v.containsKey(Integer.valueOf(parseInt))) {
                    sb2.append(sb.substring(i2));
                    return parseInt;
                }
                i2++;
            }
        }
        return 0;
    }

    public String e(Phonenumber$PhoneNumber phonenumber$PhoneNumber, PhoneNumberFormat phoneNumberFormat) {
        List<Phonemetadata$NumberFormat> list;
        Phonemetadata$NumberFormat phonemetadata$NumberFormat;
        if (phonenumber$PhoneNumber.d == 0 && phonenumber$PhoneNumber.b2) {
            String str = phonenumber$PhoneNumber.c2;
            if (str.length() > 0) {
                return str;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        sb.setLength(0);
        int i2 = phonenumber$PhoneNumber.c;
        String k2 = k(phonenumber$PhoneNumber);
        PhoneNumberFormat phoneNumberFormat2 = PhoneNumberFormat.E164;
        if (phoneNumberFormat == phoneNumberFormat2) {
            sb.append(k2);
            z(i2, phoneNumberFormat2, sb);
        } else if (!this.v.containsKey(Integer.valueOf(i2))) {
            sb.append(k2);
        } else {
            Phonemetadata$PhoneMetadata j2 = j(i2, n(i2));
            if (j2.Q2.size() == 0 || phoneNumberFormat == PhoneNumberFormat.NATIONAL) {
                list = j2.P2;
            } else {
                list = j2.Q2;
            }
            Iterator<Phonemetadata$NumberFormat> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    phonemetadata$NumberFormat = null;
                    break;
                }
                phonemetadata$NumberFormat = it.next();
                int a2 = phonemetadata$NumberFormat.a();
                if (a2 != 0) {
                    if (!this.y.a(phonemetadata$NumberFormat.q.get(a2 - 1)).matcher(k2).lookingAt()) {
                        continue;
                    }
                }
                if (this.y.a(phonemetadata$NumberFormat.c).matcher(k2).matches()) {
                    break;
                }
            }
            if (phonemetadata$NumberFormat != null) {
                String str2 = phonemetadata$NumberFormat.d;
                Matcher matcher = this.y.a(phonemetadata$NumberFormat.c).matcher(k2);
                PhoneNumberFormat phoneNumberFormat3 = PhoneNumberFormat.NATIONAL;
                String str3 = phonemetadata$NumberFormat.y;
                if (phoneNumberFormat != phoneNumberFormat3 || str3 == null || str3.length() <= 0) {
                    k2 = matcher.replaceAll(str2);
                } else {
                    k2 = matcher.replaceAll(s.matcher(str2).replaceFirst(str3));
                }
                if (phoneNumberFormat == PhoneNumberFormat.RFC3966) {
                    Matcher matcher2 = i.matcher(k2);
                    if (matcher2.lookingAt()) {
                        k2 = matcher2.replaceFirst("");
                    }
                    k2 = matcher2.reset(k2).replaceAll("-");
                }
            }
            sb.append(k2);
            if (phonenumber$PhoneNumber.q && phonenumber$PhoneNumber.x.length() > 0) {
                if (phoneNumberFormat == PhoneNumberFormat.RFC3966) {
                    sb.append(";ext=");
                    sb.append(phonenumber$PhoneNumber.x);
                } else if (j2.I2) {
                    sb.append(j2.J2);
                    sb.append(phonenumber$PhoneNumber.x);
                } else {
                    sb.append(" ext. ");
                    sb.append(phonenumber$PhoneNumber.x);
                }
            }
            z(i2, phoneNumberFormat, sb);
        }
        return sb.toString();
    }

    public final int g(String str) {
        Phonemetadata$PhoneMetadata i2 = i(str);
        if (i2 != null) {
            return i2.C2;
        }
        throw new IllegalArgumentException(i0.d.a.a.a.n0("Invalid region code: ", str));
    }

    public Phonemetadata$PhoneMetadata h(int i2) {
        if (!this.v.containsKey(Integer.valueOf(i2))) {
            return null;
        }
        d dVar = this.u;
        Objects.requireNonNull(dVar);
        List list = (List) ((HashMap) h.Z0()).get(Integer.valueOf(i2));
        boolean z2 = false;
        if (list.size() == 1 && "001".equals(list.get(0))) {
            z2 = true;
        }
        if (!z2) {
            return null;
        }
        return dVar.b.a(Integer.valueOf(i2), dVar.d, dVar.a);
    }

    public Phonemetadata$PhoneMetadata i(String str) {
        if (!r(str)) {
            return null;
        }
        d dVar = this.u;
        return dVar.b.a(str, dVar.c, dVar.a);
    }

    public final Phonemetadata$PhoneMetadata j(int i2, String str) {
        if ("001".equals(str)) {
            return h(i2);
        }
        return i(str);
    }

    public String k(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        int i2;
        StringBuilder sb = new StringBuilder();
        if (phonenumber$PhoneNumber.Y1 && (i2 = phonenumber$PhoneNumber.a2) > 0) {
            char[] cArr = new char[i2];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(phonenumber$PhoneNumber.d);
        return sb.toString();
    }

    public Phonemetadata$PhoneNumberDesc l(Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, PhoneNumberType phoneNumberType) {
        switch (phoneNumberType.ordinal()) {
            case 0:
            case 2:
                return phonemetadata$PhoneMetadata.x;
            case 1:
                return phonemetadata$PhoneMetadata.Y1;
            case 3:
                return phonemetadata$PhoneMetadata.a2;
            case 4:
                return phonemetadata$PhoneMetadata.c2;
            case 5:
                return phonemetadata$PhoneMetadata.e2;
            case 6:
                return phonemetadata$PhoneMetadata.i2;
            case 7:
                return phonemetadata$PhoneMetadata.g2;
            case 8:
                return phonemetadata$PhoneMetadata.k2;
            case 9:
                return phonemetadata$PhoneMetadata.m2;
            case 10:
                return phonemetadata$PhoneMetadata.q2;
            default:
                return phonemetadata$PhoneMetadata.d;
        }
    }

    public final PhoneNumberType m(String str, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata) {
        if (!o(str, phonemetadata$PhoneMetadata.d)) {
            return PhoneNumberType.UNKNOWN;
        }
        if (o(str, phonemetadata$PhoneMetadata.c2)) {
            return PhoneNumberType.PREMIUM_RATE;
        }
        if (o(str, phonemetadata$PhoneMetadata.a2)) {
            return PhoneNumberType.TOLL_FREE;
        }
        if (o(str, phonemetadata$PhoneMetadata.e2)) {
            return PhoneNumberType.SHARED_COST;
        }
        if (o(str, phonemetadata$PhoneMetadata.i2)) {
            return PhoneNumberType.VOIP;
        }
        if (o(str, phonemetadata$PhoneMetadata.g2)) {
            return PhoneNumberType.PERSONAL_NUMBER;
        }
        if (o(str, phonemetadata$PhoneMetadata.k2)) {
            return PhoneNumberType.PAGER;
        }
        if (o(str, phonemetadata$PhoneMetadata.m2)) {
            return PhoneNumberType.UAN;
        }
        if (o(str, phonemetadata$PhoneMetadata.q2)) {
            return PhoneNumberType.VOICEMAIL;
        }
        if (o(str, phonemetadata$PhoneMetadata.x)) {
            if (phonemetadata$PhoneMetadata.O2) {
                return PhoneNumberType.FIXED_LINE_OR_MOBILE;
            }
            if (o(str, phonemetadata$PhoneMetadata.Y1)) {
                return PhoneNumberType.FIXED_LINE_OR_MOBILE;
            }
            return PhoneNumberType.FIXED_LINE;
        } else if (phonemetadata$PhoneMetadata.O2 || !o(str, phonemetadata$PhoneMetadata.Y1)) {
            return PhoneNumberType.UNKNOWN;
        } else {
            return PhoneNumberType.MOBILE;
        }
    }

    public String n(int i2) {
        List list = this.v.get(Integer.valueOf(i2));
        if (list == null) {
            return "ZZ";
        }
        return (String) list.get(0);
    }

    public boolean o(String str, Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc) {
        int length = str.length();
        List<Integer> list = phonemetadata$PhoneNumberDesc.q;
        if (list.size() <= 0 || list.contains(Integer.valueOf(length))) {
            return this.w.a(str, phonemetadata$PhoneNumberDesc, false);
        }
        return false;
    }

    public boolean p(CharSequence charSequence, String str) {
        ValidationResult validationResult;
        try {
            Phonenumber$PhoneNumber y2 = y(charSequence, str);
            PhoneNumberType phoneNumberType = PhoneNumberType.UNKNOWN;
            String k2 = k(y2);
            int i2 = y2.c;
            if (!this.v.containsKey(Integer.valueOf(i2))) {
                validationResult = ValidationResult.INVALID_COUNTRY_CODE;
            } else {
                validationResult = A(k2, j(i2, n(i2)), phoneNumberType);
            }
            return validationResult == ValidationResult.IS_POSSIBLE || validationResult == ValidationResult.IS_POSSIBLE_LOCAL_ONLY;
        } catch (NumberParseException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0074, code lost:
        r0 = r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean q(io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber r8) {
        /*
            r7 = this;
            int r0 = r8.c
            java.util.Map<java.lang.Integer, java.util.List<java.lang.String>> r1 = r7.v
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r2)
            java.util.List r1 = (java.util.List) r1
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0030
            java.util.logging.Logger r1 = a
            java.util.logging.Level r4 = java.util.logging.Level.INFO
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Missing/invalid country_code ("
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = ")"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r1.log(r4, r0)
            goto L_0x0076
        L_0x0030:
            int r0 = r1.size()
            if (r0 != r3) goto L_0x003d
            java.lang.Object r0 = r1.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0077
        L_0x003d:
            java.lang.String r0 = r7.k(r8)
            java.util.Iterator r1 = r1.iterator()
        L_0x0045:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0076
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            io.michaelrocks.libphonenumber.android.Phonemetadata$PhoneMetadata r5 = r7.i(r4)
            boolean r6 = r5.S2
            if (r6 == 0) goto L_0x006c
            io.michaelrocks.libphonenumber.android.internal.RegexCache r6 = r7.y
            java.lang.String r5 = r5.T2
            java.util.regex.Pattern r5 = r6.a(r5)
            java.util.regex.Matcher r5 = r5.matcher(r0)
            boolean r5 = r5.lookingAt()
            if (r5 == 0) goto L_0x0045
            goto L_0x0074
        L_0x006c:
            io.michaelrocks.libphonenumber.android.PhoneNumberUtil$PhoneNumberType r5 = r7.m(r0, r5)
            io.michaelrocks.libphonenumber.android.PhoneNumberUtil$PhoneNumberType r6 = io.michaelrocks.libphonenumber.android.PhoneNumberUtil.PhoneNumberType.UNKNOWN
            if (r5 == r6) goto L_0x0045
        L_0x0074:
            r0 = r4
            goto L_0x0077
        L_0x0076:
            r0 = 0
        L_0x0077:
            int r1 = r8.c
            io.michaelrocks.libphonenumber.android.Phonemetadata$PhoneMetadata r4 = r7.j(r1, r0)
            if (r4 == 0) goto L_0x009b
            java.lang.String r5 = "001"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x008e
            int r0 = r7.g(r0)
            if (r1 == r0) goto L_0x008e
            goto L_0x009b
        L_0x008e:
            java.lang.String r8 = r7.k(r8)
            io.michaelrocks.libphonenumber.android.PhoneNumberUtil$PhoneNumberType r8 = r7.m(r8, r4)
            io.michaelrocks.libphonenumber.android.PhoneNumberUtil$PhoneNumberType r0 = io.michaelrocks.libphonenumber.android.PhoneNumberUtil.PhoneNumberType.UNKNOWN
            if (r8 == r0) goto L_0x009b
            r2 = r3
        L_0x009b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.michaelrocks.libphonenumber.android.PhoneNumberUtil.q(io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber):boolean");
    }

    public final boolean r(String str) {
        return str != null && this.z.contains(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int t(java.lang.CharSequence r7, io.michaelrocks.libphonenumber.android.Phonemetadata$PhoneMetadata r8, java.lang.StringBuilder r9, boolean r10, io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber r11) throws io.michaelrocks.libphonenumber.android.NumberParseException {
        /*
            r6 = this;
            int r0 = r7.length()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r7)
            if (r8 == 0) goto L_0x0012
            java.lang.String r7 = r8.D2
            goto L_0x0014
        L_0x0012:
            java.lang.String r7 = "NonMatch"
        L_0x0014:
            int r2 = r0.length()
            r3 = 1
            if (r2 != 0) goto L_0x001e
            io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber$CountryCodeSource r7 = io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY
            goto L_0x007c
        L_0x001e:
            java.util.regex.Pattern r2 = h
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r4 = r2.lookingAt()
            if (r4 == 0) goto L_0x0037
            int r7 = r2.end()
            r0.delete(r1, r7)
            v(r0)
            io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber$CountryCodeSource r7 = io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN
            goto L_0x007c
        L_0x0037:
            io.michaelrocks.libphonenumber.android.internal.RegexCache r2 = r6.y
            java.util.regex.Pattern r7 = r2.a(r7)
            v(r0)
            java.util.regex.Matcher r7 = r7.matcher(r0)
            boolean r2 = r7.lookingAt()
            if (r2 == 0) goto L_0x0074
            int r7 = r7.end()
            java.util.regex.Pattern r2 = j
            java.lang.String r4 = r0.substring(r7)
            java.util.regex.Matcher r2 = r2.matcher(r4)
            boolean r4 = r2.find()
            if (r4 == 0) goto L_0x006f
            java.lang.String r2 = r2.group(r3)
            java.lang.String r2 = w(r2)
            java.lang.String r4 = "0"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x006f
            goto L_0x0074
        L_0x006f:
            r0.delete(r1, r7)
            r7 = r3
            goto L_0x0075
        L_0x0074:
            r7 = r1
        L_0x0075:
            if (r7 == 0) goto L_0x007a
            io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber$CountryCodeSource r7 = io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD
            goto L_0x007c
        L_0x007a:
            io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber$CountryCodeSource r7 = io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY
        L_0x007c:
            if (r10 == 0) goto L_0x0088
            java.util.Objects.requireNonNull(r11)
            java.util.Objects.requireNonNull(r7)
            r11.d2 = r3
            r11.e2 = r7
        L_0x0088:
            io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber$CountryCodeSource r2 = io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY
            if (r7 == r2) goto L_0x00b0
            int r7 = r0.length()
            r8 = 2
            if (r7 <= r8) goto L_0x00a6
            int r7 = r6.d(r0, r9)
            if (r7 == 0) goto L_0x009c
            r11.c = r7
            return r7
        L_0x009c:
            io.michaelrocks.libphonenumber.android.NumberParseException r7 = new io.michaelrocks.libphonenumber.android.NumberParseException
            io.michaelrocks.libphonenumber.android.NumberParseException$ErrorType r8 = io.michaelrocks.libphonenumber.android.NumberParseException.ErrorType.INVALID_COUNTRY_CODE
            java.lang.String r9 = "Country calling code supplied was not recognised."
            r7.<init>(r8, r9)
            throw r7
        L_0x00a6:
            io.michaelrocks.libphonenumber.android.NumberParseException r7 = new io.michaelrocks.libphonenumber.android.NumberParseException
            io.michaelrocks.libphonenumber.android.NumberParseException$ErrorType r8 = io.michaelrocks.libphonenumber.android.NumberParseException.ErrorType.TOO_SHORT_AFTER_IDD
            java.lang.String r9 = "Phone number had an IDD, but after this was not long enough to be a viable phone number."
            r7.<init>(r8, r9)
            throw r7
        L_0x00b0:
            if (r8 == 0) goto L_0x0103
            int r7 = r8.C2
            java.lang.String r2 = java.lang.String.valueOf(r7)
            java.lang.String r4 = r0.toString()
            boolean r5 = r4.startsWith(r2)
            if (r5 == 0) goto L_0x0103
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r2 = r2.length()
            java.lang.String r2 = r4.substring(r2)
            r5.<init>(r2)
            io.michaelrocks.libphonenumber.android.Phonemetadata$PhoneNumberDesc r2 = r8.d
            r4 = 0
            r6.u(r5, r8, r4)
            k0.a.a.a.e.a r4 = r6.w
            boolean r4 = r4.a(r0, r2, r1)
            if (r4 != 0) goto L_0x00e5
            k0.a.a.a.e.a r4 = r6.w
            boolean r2 = r4.a(r5, r2, r1)
            if (r2 != 0) goto L_0x00ef
        L_0x00e5:
            io.michaelrocks.libphonenumber.android.PhoneNumberUtil$PhoneNumberType r2 = io.michaelrocks.libphonenumber.android.PhoneNumberUtil.PhoneNumberType.UNKNOWN
            io.michaelrocks.libphonenumber.android.PhoneNumberUtil$ValidationResult r8 = r6.A(r0, r8, r2)
            io.michaelrocks.libphonenumber.android.PhoneNumberUtil$ValidationResult r0 = io.michaelrocks.libphonenumber.android.PhoneNumberUtil.ValidationResult.TOO_LONG
            if (r8 != r0) goto L_0x0103
        L_0x00ef:
            r9.append(r5)
            if (r10 == 0) goto L_0x0100
            io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber$CountryCodeSource r8 = io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN
            java.util.Objects.requireNonNull(r11)
            java.util.Objects.requireNonNull(r8)
            r11.d2 = r3
            r11.e2 = r8
        L_0x0100:
            r11.c = r7
            return r7
        L_0x0103:
            r11.c = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.michaelrocks.libphonenumber.android.PhoneNumberUtil.t(java.lang.CharSequence, io.michaelrocks.libphonenumber.android.Phonemetadata$PhoneMetadata, java.lang.StringBuilder, boolean, io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber):int");
    }

    public boolean u(StringBuilder sb, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, StringBuilder sb2) {
        int length = sb.length();
        String str = phonemetadata$PhoneMetadata.L2;
        if (!(length == 0 || str.length() == 0)) {
            Matcher matcher = this.y.a(str).matcher(sb);
            if (matcher.lookingAt()) {
                Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc = phonemetadata$PhoneMetadata.d;
                boolean a2 = this.w.a(sb, phonemetadata$PhoneNumberDesc, false);
                int groupCount = matcher.groupCount();
                String str2 = phonemetadata$PhoneMetadata.N2;
                if (str2 != null && str2.length() != 0 && matcher.group(groupCount) != null) {
                    StringBuilder sb3 = new StringBuilder(sb);
                    sb3.replace(0, length, matcher.replaceFirst(str2));
                    if (a2 && !this.w.a(sb3.toString(), phonemetadata$PhoneNumberDesc, false)) {
                        return false;
                    }
                    if (sb2 != null && groupCount > 1) {
                        sb2.append(matcher.group(1));
                    }
                    sb.replace(0, sb.length(), sb3.toString());
                    return true;
                } else if (a2 && !this.w.a(sb.substring(matcher.end()), phonemetadata$PhoneNumberDesc, false)) {
                    return false;
                } else {
                    if (!(sb2 == null || groupCount <= 0 || matcher.group(groupCount) == null)) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return true;
                }
            }
        }
        return false;
    }

    public Phonenumber$PhoneNumber y(CharSequence charSequence, String str) throws NumberParseException {
        int i2;
        CharSequence charSequence2;
        Phonenumber$PhoneNumber phonenumber$PhoneNumber = new Phonenumber$PhoneNumber();
        if (charSequence == null) {
            throw new NumberParseException(NumberParseException.ErrorType.NOT_A_NUMBER, "The phone number supplied was null.");
        } else if (charSequence.length() <= 250) {
            StringBuilder sb = new StringBuilder();
            String charSequence3 = charSequence.toString();
            int indexOf = charSequence3.indexOf(";phone-context=");
            String str2 = "";
            if (indexOf >= 0) {
                int i3 = indexOf + 15;
                if (i3 < charSequence3.length() - 1 && charSequence3.charAt(i3) == '+') {
                    int indexOf2 = charSequence3.indexOf(59, i3);
                    if (indexOf2 > 0) {
                        sb.append(charSequence3.substring(i3, indexOf2));
                    } else {
                        sb.append(charSequence3.substring(i3));
                    }
                }
                int indexOf3 = charSequence3.indexOf("tel:");
                sb.append(charSequence3.substring(indexOf3 >= 0 ? indexOf3 + 4 : 0, indexOf));
            } else {
                Matcher matcher = k.matcher(charSequence3);
                if (matcher.find()) {
                    charSequence2 = charSequence3.subSequence(matcher.start(), charSequence3.length());
                    Matcher matcher2 = m.matcher(charSequence2);
                    if (matcher2.find()) {
                        charSequence2 = charSequence2.subSequence(0, matcher2.start());
                    }
                    Matcher matcher3 = l.matcher(charSequence2);
                    if (matcher3.find()) {
                        charSequence2 = charSequence2.subSequence(0, matcher3.start());
                    }
                } else {
                    charSequence2 = str2;
                }
                sb.append(charSequence2);
            }
            int indexOf4 = sb.indexOf(";isub=");
            if (indexOf4 > 0) {
                sb.delete(indexOf4, sb.length());
            }
            if (s(sb)) {
                if (r(str) || (sb.length() != 0 && h.matcher(sb).lookingAt())) {
                    Matcher matcher4 = q.matcher(sb);
                    if (matcher4.find() && s(sb.substring(0, matcher4.start()))) {
                        int groupCount = matcher4.groupCount();
                        int i4 = 1;
                        while (true) {
                            if (i4 > groupCount) {
                                break;
                            } else if (matcher4.group(i4) != null) {
                                str2 = matcher4.group(i4);
                                sb.delete(matcher4.start(), sb.length());
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                    if (str2.length() > 0) {
                        phonenumber$PhoneNumber.q = true;
                        phonenumber$PhoneNumber.x = str2;
                    }
                    Phonemetadata$PhoneMetadata i5 = i(str);
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        i2 = t(sb, i5, sb2, false, phonenumber$PhoneNumber);
                    } catch (NumberParseException e2) {
                        Matcher matcher5 = h.matcher(sb);
                        if (e2.c != NumberParseException.ErrorType.INVALID_COUNTRY_CODE || !matcher5.lookingAt()) {
                            throw new NumberParseException(e2.c, e2.getMessage());
                        }
                        i2 = t(sb.substring(matcher5.end()), i5, sb2, false, phonenumber$PhoneNumber);
                        if (i2 == 0) {
                            throw new NumberParseException(NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
                        }
                    }
                    if (i2 != 0) {
                        String n2 = n(i2);
                        if (!n2.equals(str)) {
                            i5 = j(i2, n2);
                        }
                    } else {
                        v(sb);
                        sb2.append(sb);
                        if (str != null) {
                            phonenumber$PhoneNumber.c = i5.C2;
                        }
                    }
                    if (sb2.length() >= 2) {
                        if (i5 != null) {
                            StringBuilder sb3 = new StringBuilder();
                            StringBuilder sb4 = new StringBuilder(sb2);
                            u(sb4, i5, sb3);
                            ValidationResult A2 = A(sb4, i5, PhoneNumberType.UNKNOWN);
                            if (!(A2 == ValidationResult.TOO_SHORT || A2 == ValidationResult.IS_POSSIBLE_LOCAL_ONLY || A2 == ValidationResult.INVALID_LENGTH)) {
                                sb2 = sb4;
                            }
                        }
                        int length = sb2.length();
                        if (length < 2) {
                            throw new NumberParseException(NumberParseException.ErrorType.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
                        } else if (length <= 17) {
                            if (sb2.length() > 1 && sb2.charAt(0) == '0') {
                                phonenumber$PhoneNumber.y = true;
                                phonenumber$PhoneNumber.Y1 = true;
                                int i6 = 1;
                                while (i6 < sb2.length() - 1 && sb2.charAt(i6) == '0') {
                                    i6++;
                                }
                                if (i6 != 1) {
                                    phonenumber$PhoneNumber.Z1 = true;
                                    phonenumber$PhoneNumber.a2 = i6;
                                }
                            }
                            phonenumber$PhoneNumber.d = Long.parseLong(sb2.toString());
                            return phonenumber$PhoneNumber;
                        } else {
                            throw new NumberParseException(NumberParseException.ErrorType.TOO_LONG, "The string supplied is too long to be a phone number.");
                        }
                    } else {
                        throw new NumberParseException(NumberParseException.ErrorType.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
                    }
                } else {
                    throw new NumberParseException(NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
                }
            } else {
                throw new NumberParseException(NumberParseException.ErrorType.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
            }
        } else {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_LONG, "The string supplied was too long to parse.");
        }
    }

    public final void z(int i2, PhoneNumberFormat phoneNumberFormat, StringBuilder sb) {
        int ordinal = phoneNumberFormat.ordinal();
        if (ordinal == 0) {
            sb.insert(0, i2).insert(0, '+');
        } else if (ordinal == 1) {
            sb.insert(0, " ").insert(0, i2).insert(0, '+');
        } else if (ordinal == 3) {
            sb.insert(0, "-").insert(0, i2).insert(0, '+').insert(0, "tel:");
        }
    }
}
