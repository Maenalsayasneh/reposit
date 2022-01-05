package h0.i.g.f;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: LinkifyCompat */
public final class b {
    public static final Comparator<C0046b> a = new a();

    /* compiled from: LinkifyCompat */
    public class a implements Comparator<C0046b> {
        public int compare(Object obj, Object obj2) {
            int i;
            int i2;
            C0046b bVar = (C0046b) obj;
            C0046b bVar2 = (C0046b) obj2;
            int i3 = bVar.c;
            int i4 = bVar2.c;
            if (i3 < i4) {
                return -1;
            }
            if (i3 > i4 || (i = bVar.d) < (i2 = bVar2.d)) {
                return 1;
            }
            if (i > i2) {
                return -1;
            }
            return 0;
        }
    }

    /* renamed from: h0.i.g.f.b$b  reason: collision with other inner class name */
    /* compiled from: LinkifyCompat */
    public static class C0046b {
        public URLSpan a;
        public String b;
        public int c;
        public int d;
    }

    public static void a(TextView textView) {
        if (!(textView.getMovementMethod() instanceof LinkMovementMethod) && textView.getLinksClickable()) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x006e */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e A[LOOP:1: B:24:0x006e->B:73:0x006e, LOOP_START, PHI: r2 r12 
      PHI: (r2v19 int) = (r2v18 int), (r2v20 int) binds: [B:23:0x0069, B:73:0x006e] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r12v16 java.lang.String) = (r12v15 java.lang.String), (r12v17 java.lang.String) binds: [B:23:0x0069, B:73:0x006e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:24:0x006e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(android.text.Spannable r11, int r12) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 28
            r3 = 0
            if (r0 < r2) goto L_0x000a
            r0 = r1
            goto L_0x000b
        L_0x000a:
            r0 = r3
        L_0x000b:
            if (r0 == 0) goto L_0x0012
            boolean r11 = android.text.util.Linkify.addLinks(r11, r12)
            return r11
        L_0x0012:
            if (r12 != 0) goto L_0x0015
            return r3
        L_0x0015:
            int r0 = r11.length()
            java.lang.Class<android.text.style.URLSpan> r2 = android.text.style.URLSpan.class
            java.lang.Object[] r0 = r11.getSpans(r3, r0, r2)
            android.text.style.URLSpan[] r0 = (android.text.style.URLSpan[]) r0
            int r2 = r0.length
            int r2 = r2 - r1
        L_0x0023:
            if (r2 < 0) goto L_0x002d
            r4 = r0[r2]
            r11.removeSpan(r4)
            int r2 = r2 + -1
            goto L_0x0023
        L_0x002d:
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0035
            r0 = 4
            android.text.util.Linkify.addLinks(r11, r0)
        L_0x0035:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2 = r12 & 1
            if (r2 == 0) goto L_0x0052
            java.util.regex.Pattern r6 = h0.i.h.c.g
            java.lang.String r2 = "http://"
            java.lang.String r4 = "https://"
            java.lang.String r5 = "rtsp://"
            java.lang.String[] r7 = new java.lang.String[]{r2, r4, r5}
            android.text.util.Linkify$MatchFilter r8 = android.text.util.Linkify.sUrlMatchFilter
            r9 = 0
            r4 = r0
            r5 = r11
            e(r4, r5, r6, r7, r8, r9)
        L_0x0052:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0065
            java.util.regex.Pattern r6 = h0.i.h.c.h
            java.lang.String r2 = "mailto:"
            java.lang.String[] r7 = new java.lang.String[]{r2}
            r8 = 0
            r9 = 0
            r4 = r0
            r5 = r11
            e(r4, r5, r6, r7, r8, r9)
        L_0x0065:
            r12 = r12 & 8
            if (r12 == 0) goto L_0x00ac
            java.lang.String r12 = r11.toString()
            r2 = r3
        L_0x006e:
            java.lang.String r4 = d(r12)     // Catch:{ UnsupportedOperationException -> 0x00ac }
            if (r4 == 0) goto L_0x00ac
            int r5 = r12.indexOf(r4)     // Catch:{ UnsupportedOperationException -> 0x00ac }
            if (r5 >= 0) goto L_0x007b
            goto L_0x00ac
        L_0x007b:
            h0.i.g.f.b$b r6 = new h0.i.g.f.b$b     // Catch:{ UnsupportedOperationException -> 0x00ac }
            r6.<init>()     // Catch:{ UnsupportedOperationException -> 0x00ac }
            int r7 = r4.length()     // Catch:{ UnsupportedOperationException -> 0x00ac }
            int r7 = r7 + r5
            int r5 = r5 + r2
            r6.c = r5     // Catch:{ UnsupportedOperationException -> 0x00ac }
            int r2 = r2 + r7
            r6.d = r2     // Catch:{ UnsupportedOperationException -> 0x00ac }
            java.lang.String r12 = r12.substring(r7)     // Catch:{ UnsupportedOperationException -> 0x00ac }
            java.lang.String r5 = "UTF-8"
            java.lang.String r4 = java.net.URLEncoder.encode(r4, r5)     // Catch:{ UnsupportedEncodingException -> 0x006e }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ UnsupportedOperationException -> 0x00ac }
            r5.<init>()     // Catch:{ UnsupportedOperationException -> 0x00ac }
            java.lang.String r7 = "geo:0,0?q="
            r5.append(r7)     // Catch:{ UnsupportedOperationException -> 0x00ac }
            r5.append(r4)     // Catch:{ UnsupportedOperationException -> 0x00ac }
            java.lang.String r4 = r5.toString()     // Catch:{ UnsupportedOperationException -> 0x00ac }
            r6.b = r4     // Catch:{ UnsupportedOperationException -> 0x00ac }
            r0.add(r6)     // Catch:{ UnsupportedOperationException -> 0x00ac }
            goto L_0x006e
        L_0x00ac:
            int r12 = r11.length()
            java.lang.Class<android.text.style.URLSpan> r2 = android.text.style.URLSpan.class
            java.lang.Object[] r12 = r11.getSpans(r3, r12, r2)
            android.text.style.URLSpan[] r12 = (android.text.style.URLSpan[]) r12
            r2 = r3
        L_0x00b9:
            int r4 = r12.length
            if (r2 >= r4) goto L_0x00db
            h0.i.g.f.b$b r4 = new h0.i.g.f.b$b
            r4.<init>()
            r5 = r12[r2]
            r4.a = r5
            r5 = r12[r2]
            int r5 = r11.getSpanStart(r5)
            r4.c = r5
            r5 = r12[r2]
            int r5 = r11.getSpanEnd(r5)
            r4.d = r5
            r0.add(r4)
            int r2 = r2 + 1
            goto L_0x00b9
        L_0x00db:
            java.util.Comparator<h0.i.g.f.b$b> r12 = a
            java.util.Collections.sort(r0, r12)
            int r12 = r0.size()
            r2 = r3
        L_0x00e5:
            r4 = -1
            int r5 = r12 + -1
            if (r2 >= r5) goto L_0x0128
            java.lang.Object r6 = r0.get(r2)
            h0.i.g.f.b$b r6 = (h0.i.g.f.b.C0046b) r6
            int r7 = r2 + 1
            java.lang.Object r8 = r0.get(r7)
            h0.i.g.f.b$b r8 = (h0.i.g.f.b.C0046b) r8
            int r9 = r6.c
            int r10 = r8.c
            if (r9 > r10) goto L_0x0126
            int r6 = r6.d
            if (r6 <= r10) goto L_0x0126
            int r8 = r8.d
            if (r8 > r6) goto L_0x0107
            goto L_0x010b
        L_0x0107:
            int r6 = r6 - r9
            int r8 = r8 - r10
            if (r6 <= r8) goto L_0x010d
        L_0x010b:
            r6 = r7
            goto L_0x0112
        L_0x010d:
            if (r6 >= r8) goto L_0x0111
            r6 = r2
            goto L_0x0112
        L_0x0111:
            r6 = r4
        L_0x0112:
            if (r6 == r4) goto L_0x0126
            java.lang.Object r12 = r0.get(r6)
            h0.i.g.f.b$b r12 = (h0.i.g.f.b.C0046b) r12
            android.text.style.URLSpan r12 = r12.a
            if (r12 == 0) goto L_0x0121
            r11.removeSpan(r12)
        L_0x0121:
            r0.remove(r6)
            r12 = r5
            goto L_0x00e5
        L_0x0126:
            r2 = r7
            goto L_0x00e5
        L_0x0128:
            int r12 = r0.size()
            if (r12 != 0) goto L_0x012f
            return r3
        L_0x012f:
            java.util.Iterator r12 = r0.iterator()
        L_0x0133:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0154
            java.lang.Object r0 = r12.next()
            h0.i.g.f.b$b r0 = (h0.i.g.f.b.C0046b) r0
            android.text.style.URLSpan r2 = r0.a
            if (r2 != 0) goto L_0x0133
            java.lang.String r2 = r0.b
            int r3 = r0.c
            int r0 = r0.d
            android.text.style.URLSpan r4 = new android.text.style.URLSpan
            r4.<init>(r2)
            r2 = 33
            r11.setSpan(r4, r3, r0, r2)
            goto L_0x0133
        L_0x0154:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.i.g.f.b.b(android.text.Spannable, int):boolean");
    }

    public static boolean c(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Linkify.addLinks(textView, i);
        }
        if (i == 0) {
            return false;
        }
        CharSequence text = textView.getText();
        if (!(text instanceof Spannable)) {
            SpannableString valueOf = SpannableString.valueOf(text);
            if (!b(valueOf, i)) {
                return false;
            }
            a(textView);
            textView.setText(valueOf);
            return true;
        } else if (!b((Spannable) text, i)) {
            return false;
        } else {
            a(textView);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        r2 = -r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        r13 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ba, code lost:
        if (h0.i.g.f.a.a(r2.group(0)) != false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e9, code lost:
        r5 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x019f, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0199 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String d(java.lang.String r18) {
        /*
            r0 = r18
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x000d
            java.lang.String r0 = android.webkit.WebView.findAddress(r18)
            return r0
        L_0x000d:
            java.util.regex.Pattern r1 = h0.i.g.f.a.c
            java.util.regex.Matcher r1 = r1.matcher(r0)
            r2 = 0
            r3 = r2
        L_0x0015:
            boolean r3 = r1.find(r3)
            if (r3 == 0) goto L_0x01ca
            java.lang.String r3 = r1.group(r2)
            boolean r3 = h0.i.g.f.a.a(r3)
            if (r3 == 0) goto L_0x01c4
            int r3 = r1.start()
            int r5 = r1.end()
            java.util.regex.Pattern r6 = h0.i.g.f.a.b
            java.util.regex.Matcher r6 = r6.matcher(r0)
            r7 = 1
            r8 = -1
            java.lang.String r9 = ""
            r15 = r2
            r10 = r7
            r11 = r10
            r14 = r11
            r12 = r8
            r13 = r12
        L_0x003d:
            int r4 = r18.length()
            if (r5 >= r4) goto L_0x01b2
            boolean r4 = r6.find(r5)
            if (r4 != 0) goto L_0x004e
            int r4 = r18.length()
            goto L_0x0060
        L_0x004e:
            int r4 = r6.end()
            int r16 = r6.start()
            int r4 = r4 - r16
            r2 = 25
            if (r4 <= r2) goto L_0x0064
            int r4 = r6.end()
        L_0x0060:
            int r2 = -r4
        L_0x0061:
            r13 = r2
            goto L_0x019f
        L_0x0064:
            int r2 = r6.start()
            if (r5 >= r2) goto L_0x007c
            int r2 = r5 + 1
            char r4 = r0.charAt(r5)
            java.lang.String r5 = "\n\u000b\f\r  "
            int r4 = r5.indexOf(r4)
            if (r4 == r8) goto L_0x007a
            int r10 = r10 + 1
        L_0x007a:
            r5 = r2
            goto L_0x0064
        L_0x007c:
            r2 = 5
            if (r10 <= r2) goto L_0x0081
            goto L_0x0137
        L_0x0081:
            int r11 = r11 + r7
            r4 = 14
            if (r11 <= r4) goto L_0x0088
            goto L_0x0137
        L_0x0088:
            if (r5 <= 0) goto L_0x0099
            int r4 = r5 + -1
            char r4 = r0.charAt(r4)
            java.lang.String r2 = ":,\"'\t                　\n\u000b\f\r  "
            int r2 = r2.indexOf(r4)
            if (r2 != r8) goto L_0x0099
            goto L_0x00bd
        L_0x0099:
            java.util.regex.Pattern r2 = h0.i.g.f.a.c
            java.util.regex.Matcher r2 = r2.matcher(r0)
            int r4 = r18.length()
            java.util.regex.Matcher r2 = r2.region(r5, r4)
            boolean r4 = r2.lookingAt()
            if (r4 == 0) goto L_0x00bd
            java.util.regex.MatchResult r2 = r2.toMatchResult()
            r4 = 0
            java.lang.String r17 = r2.group(r4)
            boolean r4 = h0.i.g.f.a.a(r17)
            if (r4 == 0) goto L_0x00bd
            goto L_0x00be
        L_0x00bd:
            r2 = 0
        L_0x00be:
            if (r2 == 0) goto L_0x00cc
            if (r14 == 0) goto L_0x00c6
            if (r10 <= r7) goto L_0x00c6
            int r2 = -r5
            goto L_0x0061
        L_0x00c6:
            if (r12 != r8) goto L_0x00c9
            r12 = r5
        L_0x00c9:
            r2 = 0
            goto L_0x01a8
        L_0x00cc:
            r2 = 0
            java.lang.String r4 = r6.group(r2)
            java.util.regex.Pattern r2 = h0.i.g.f.a.e
            java.util.regex.Matcher r2 = r2.matcher(r4)
            boolean r2 = r2.matches()
            if (r2 == 0) goto L_0x00e0
            r15 = r7
            goto L_0x01a6
        L_0x00e0:
            r2 = 5
            if (r11 != r2) goto L_0x00eb
            if (r15 != 0) goto L_0x00eb
            int r2 = r6.end()
        L_0x00e9:
            r5 = r2
            goto L_0x0137
        L_0x00eb:
            if (r15 == 0) goto L_0x01a6
            r2 = 4
            if (r11 <= r2) goto L_0x01a6
            if (r5 <= 0) goto L_0x0101
            int r2 = r5 + -1
            char r2 = r0.charAt(r2)
            java.lang.String r4 = ",*•\t                　\n\u000b\f\r  "
            int r2 = r4.indexOf(r2)
            if (r2 != r8) goto L_0x0101
            goto L_0x011a
        L_0x0101:
            java.util.regex.Pattern r2 = h0.i.g.f.a.d
            java.util.regex.Matcher r2 = r2.matcher(r0)
            int r4 = r18.length()
            java.util.regex.Matcher r2 = r2.region(r5, r4)
            boolean r4 = r2.lookingAt()
            if (r4 == 0) goto L_0x011a
            java.util.regex.MatchResult r2 = r2.toMatchResult()
            goto L_0x011b
        L_0x011a:
            r2 = 0
        L_0x011b:
            if (r2 == 0) goto L_0x01a6
            java.lang.String r4 = "et"
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L_0x013a
            r4 = 0
            java.lang.String r5 = r2.group(r4)
            java.lang.String r4 = "al"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x013a
            int r2 = r2.end()
            goto L_0x00e9
        L_0x0137:
            r2 = 0
            goto L_0x01b2
        L_0x013a:
            java.util.regex.Pattern r4 = h0.i.g.f.a.b
            java.util.regex.Matcher r4 = r4.matcher(r0)
            int r5 = r2.end()
            boolean r5 = r4.find(r5)
            if (r5 == 0) goto L_0x01a1
            r5 = 0
            java.lang.String r9 = r4.group(r5)
            int r5 = r2.groupCount()
        L_0x0153:
            if (r5 <= 0) goto L_0x0161
            int r14 = r5 + -1
            java.lang.String r5 = r2.group(r5)
            if (r5 == 0) goto L_0x015f
            r5 = r14
            goto L_0x0161
        L_0x015f:
            r5 = r14
            goto L_0x0153
        L_0x0161:
            java.util.regex.Pattern r2 = h0.i.g.f.a.g
            java.util.regex.Matcher r2 = r2.matcher(r9)
            boolean r2 = r2.matches()
            if (r2 == 0) goto L_0x0196
            h0.i.g.f.a$a[] r2 = h0.i.g.f.a.a
            r2 = r2[r5]
            java.util.Objects.requireNonNull(r2)
            r5 = 2
            r14 = 0
            java.lang.String r5 = r9.substring(r14, r5)
            int r5 = java.lang.Integer.parseInt(r5)
            int r9 = r2.a
            if (r9 > r5) goto L_0x0186
            int r9 = r2.b
            if (r5 <= r9) goto L_0x0191
        L_0x0186:
            int r9 = r2.c
            if (r5 == r9) goto L_0x0191
            int r2 = r2.d
            if (r5 != r2) goto L_0x018f
            goto L_0x0191
        L_0x018f:
            r2 = 0
            goto L_0x0192
        L_0x0191:
            r2 = r7
        L_0x0192:
            if (r2 == 0) goto L_0x0196
            r2 = r7
            goto L_0x0197
        L_0x0196:
            r2 = 0
        L_0x0197:
            if (r2 == 0) goto L_0x01a6
            int r2 = r4.end()
            goto L_0x0061
        L_0x019f:
            r2 = 0
            goto L_0x01ba
        L_0x01a1:
            int r2 = r2.end()
            r13 = r2
        L_0x01a6:
            r2 = 0
            r14 = 0
        L_0x01a8:
            java.lang.String r9 = r6.group(r2)
            int r5 = r6.end()
            goto L_0x003d
        L_0x01b2:
            if (r13 <= 0) goto L_0x01b5
            goto L_0x01ba
        L_0x01b5:
            if (r12 <= 0) goto L_0x01b8
            goto L_0x01b9
        L_0x01b8:
            r12 = r5
        L_0x01b9:
            int r13 = -r12
        L_0x01ba:
            if (r13 <= 0) goto L_0x01c1
            java.lang.String r4 = r0.substring(r3, r13)
            goto L_0x01cb
        L_0x01c1:
            int r3 = -r13
            goto L_0x0015
        L_0x01c4:
            int r3 = r1.end()
            goto L_0x0015
        L_0x01ca:
            r4 = 0
        L_0x01cb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.i.g.f.b.d(java.lang.String):java.lang.String");
    }

    public static void e(ArrayList<C0046b> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        boolean z;
        Spannable spannable2 = spannable;
        String[] strArr2 = strArr;
        Linkify.MatchFilter matchFilter2 = matchFilter;
        Matcher matcher = pattern.matcher(spannable2);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if (matchFilter2 == null || matchFilter2.acceptMatch(spannable2, start, end)) {
                C0046b bVar = new C0046b();
                String group = matcher.group(0);
                int i = 0;
                while (true) {
                    z = true;
                    if (i >= strArr2.length) {
                        z = false;
                        break;
                    }
                    if (group.regionMatches(true, 0, strArr2[i], 0, strArr2[i].length())) {
                        if (!group.regionMatches(false, 0, strArr2[i], 0, strArr2[i].length())) {
                            group = strArr2[i] + group.substring(strArr2[i].length());
                        }
                    } else {
                        i++;
                    }
                }
                if (!z && strArr2.length > 0) {
                    group = i0.d.a.a.a.y0(new StringBuilder(), strArr2[0], group);
                }
                bVar.b = group;
                bVar.c = start;
                bVar.d = end;
                arrayList.add(bVar);
            }
        }
    }
}
