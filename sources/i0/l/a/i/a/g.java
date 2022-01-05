package i0.l.a.i.a;

import java.io.IOException;

/* compiled from: JStylerObj */
public class g {
    public static final e a = new e((a) null);
    public static final f b = new f((a) null);
    public static final d c = new d((a) null);
    public static final c d = new c((a) null);
    public static final b e = new b((a) null);

    /* compiled from: JStylerObj */
    public static class b implements h {
        public b(a aVar) {
        }

        public void a(String str, Appendable appendable) {
            try {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt == 12) {
                        appendable.append("\\f");
                    } else if (charAt == 13) {
                        appendable.append("\\r");
                    } else if (charAt == '\"') {
                        appendable.append("\\\"");
                    } else if (charAt == '/') {
                        appendable.append("\\/");
                    } else if (charAt != '\\') {
                        switch (charAt) {
                            case 8:
                                appendable.append("\\b");
                                break;
                            case 9:
                                appendable.append("\\t");
                                break;
                            case 10:
                                appendable.append("\\n");
                                break;
                            default:
                                if ((charAt >= 0 && charAt <= 31) || ((charAt >= 127 && charAt <= 159) || (charAt >= 8192 && charAt <= 8447))) {
                                    appendable.append("\\u");
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> 12) & 15));
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> 8) & 15));
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> 4) & 15));
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> 0) & 15));
                                    break;
                                } else {
                                    appendable.append(charAt);
                                    break;
                                }
                                break;
                        }
                    } else {
                        appendable.append("\\\\");
                    }
                }
            } catch (IOException unused) {
                throw new RuntimeException("Impossible Error");
            }
        }
    }

    /* compiled from: JStylerObj */
    public static class c implements h {
        public c(a aVar) {
        }

        public void a(String str, Appendable appendable) {
            try {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt == 12) {
                        appendable.append("\\f");
                    } else if (charAt == 13) {
                        appendable.append("\\r");
                    } else if (charAt == '\"') {
                        appendable.append("\\\"");
                    } else if (charAt != '\\') {
                        switch (charAt) {
                            case 8:
                                appendable.append("\\b");
                                break;
                            case 9:
                                appendable.append("\\t");
                                break;
                            case 10:
                                appendable.append("\\n");
                                break;
                            default:
                                if ((charAt >= 0 && charAt <= 31) || ((charAt >= 127 && charAt <= 159) || (charAt >= 8192 && charAt <= 8447))) {
                                    appendable.append("\\u");
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> 12) & 15));
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> 8) & 15));
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> 4) & 15));
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> 0) & 15));
                                    break;
                                } else {
                                    appendable.append(charAt);
                                    break;
                                }
                        }
                    } else {
                        appendable.append("\\\\");
                    }
                }
            } catch (IOException unused) {
                throw new RuntimeException("Impossible Exeption");
            }
        }
    }

    /* compiled from: JStylerObj */
    public static class d implements C0196g {
        public d(a aVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0078, code lost:
            if (r3 == '.') goto L_0x007a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x007a, code lost:
            r7 = r7 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x007c, code lost:
            if (r7 >= r1) goto L_0x0086;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x007e, code lost:
            r3 = r10.charAt(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0082, code lost:
            if (r3 < '0') goto L_0x0086;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0084, code lost:
            if (r3 <= '9') goto L_0x007a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0086, code lost:
            if (r7 != r1) goto L_0x0089;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0088, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x008b, code lost:
            if (r3 == 'E') goto L_0x0091;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x008f, code lost:
            if (r3 != 'e') goto L_0x00a5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0091, code lost:
            r7 = r7 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0093, code lost:
            if (r7 != r1) goto L_0x0096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0095, code lost:
            return false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0096, code lost:
            r3 = r10.charAt(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x009c, code lost:
            if (r3 == '+') goto L_0x00a0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x009e, code lost:
            if (r3 != '-') goto L_0x00a5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x00a0, code lost:
            r7 = r7 + 1;
            r10.charAt(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x00a5, code lost:
            if (r7 != r1) goto L_0x00a8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x00a7, code lost:
            return false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x00a8, code lost:
            if (r7 >= r1) goto L_0x00b6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x00aa, code lost:
            r3 = r10.charAt(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ae, code lost:
            if (r3 < '0') goto L_0x00b6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x00b0, code lost:
            if (r3 <= '9') goto L_0x00b3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x00b3, code lost:
            r7 = r7 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x00b6, code lost:
            if (r7 != r1) goto L_0x00b9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x00b8, code lost:
            return true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(java.lang.String r10) {
            /*
                r9 = this;
                r0 = 0
                if (r10 != 0) goto L_0x0004
                return r0
            L_0x0004:
                int r1 = r10.length()
                r2 = 1
                if (r1 != 0) goto L_0x000c
                return r2
            L_0x000c:
                java.lang.String r3 = r10.trim()
                if (r3 == r10) goto L_0x0013
                return r2
            L_0x0013:
                char r3 = r10.charAt(r0)
                boolean r4 = i0.l.a.i.a.g.b(r3)
                if (r4 != 0) goto L_0x00ba
                boolean r3 = i0.l.a.i.a.g.c(r3)
                if (r3 == 0) goto L_0x0025
                goto L_0x00ba
            L_0x0025:
                r3 = r2
            L_0x0026:
                if (r3 >= r1) goto L_0x004d
                char r4 = r10.charAt(r3)
                r5 = 125(0x7d, float:1.75E-43)
                if (r4 == r5) goto L_0x003f
                r5 = 93
                if (r4 == r5) goto L_0x003f
                r5 = 44
                if (r4 == r5) goto L_0x003f
                r5 = 58
                if (r4 != r5) goto L_0x003d
                goto L_0x003f
            L_0x003d:
                r5 = r0
                goto L_0x0040
            L_0x003f:
                r5 = r2
            L_0x0040:
                if (r5 != 0) goto L_0x004c
                boolean r4 = i0.l.a.i.a.g.c(r4)
                if (r4 == 0) goto L_0x0049
                goto L_0x004c
            L_0x0049:
                int r3 = r3 + 1
                goto L_0x0026
            L_0x004c:
                return r2
            L_0x004d:
                boolean r3 = i0.l.a.i.a.g.a(r10)
                if (r3 == 0) goto L_0x0054
                return r2
            L_0x0054:
                char r3 = r10.charAt(r0)
                r4 = 45
                r5 = 57
                r6 = 48
                if (r3 < r6) goto L_0x0062
                if (r3 <= r5) goto L_0x0064
            L_0x0062:
                if (r3 != r4) goto L_0x00b9
            L_0x0064:
                r7 = r2
            L_0x0065:
                if (r7 >= r1) goto L_0x0073
                char r3 = r10.charAt(r7)
                if (r3 < r6) goto L_0x0073
                if (r3 <= r5) goto L_0x0070
                goto L_0x0073
            L_0x0070:
                int r7 = r7 + 1
                goto L_0x0065
            L_0x0073:
                if (r7 != r1) goto L_0x0076
                return r2
            L_0x0076:
                r8 = 46
                if (r3 != r8) goto L_0x007c
            L_0x007a:
                int r7 = r7 + 1
            L_0x007c:
                if (r7 >= r1) goto L_0x0086
                char r3 = r10.charAt(r7)
                if (r3 < r6) goto L_0x0086
                if (r3 <= r5) goto L_0x007a
            L_0x0086:
                if (r7 != r1) goto L_0x0089
                return r2
            L_0x0089:
                r8 = 69
                if (r3 == r8) goto L_0x0091
                r8 = 101(0x65, float:1.42E-43)
                if (r3 != r8) goto L_0x00a5
            L_0x0091:
                int r7 = r7 + 1
                if (r7 != r1) goto L_0x0096
                return r0
            L_0x0096:
                char r3 = r10.charAt(r7)
                r8 = 43
                if (r3 == r8) goto L_0x00a0
                if (r3 != r4) goto L_0x00a5
            L_0x00a0:
                int r7 = r7 + 1
                r10.charAt(r7)
            L_0x00a5:
                if (r7 != r1) goto L_0x00a8
                return r0
            L_0x00a8:
                if (r7 >= r1) goto L_0x00b6
                char r3 = r10.charAt(r7)
                if (r3 < r6) goto L_0x00b6
                if (r3 <= r5) goto L_0x00b3
                goto L_0x00b6
            L_0x00b3:
                int r7 = r7 + 1
                goto L_0x00a8
            L_0x00b6:
                if (r7 != r1) goto L_0x00b9
                return r2
            L_0x00b9:
                return r0
            L_0x00ba:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.l.a.i.a.g.d.a(java.lang.String):boolean");
        }
    }

    /* compiled from: JStylerObj */
    public static class e implements C0196g {
        public e(a aVar) {
        }

        public boolean a(String str) {
            if (str == null) {
                return false;
            }
            int length = str.length();
            if (length == 0 || str.trim() != str) {
                return true;
            }
            char charAt = str.charAt(0);
            if ((charAt >= '0' && charAt <= '9') || charAt == '-') {
                return true;
            }
            for (int i = 0; i < length; i++) {
                char charAt2 = str.charAt(i);
                if ((charAt2 == 13 || charAt2 == 10 || charAt2 == 9 || charAt2 == ' ') || g.b(charAt2)) {
                    return true;
                }
                if ((charAt2 == 8 || charAt2 == 12 || charAt2 == 10) || g.c(charAt2)) {
                    return true;
                }
            }
            return g.a(str);
        }
    }

    /* compiled from: JStylerObj */
    public static class f implements C0196g {
        public f(a aVar) {
        }

        public boolean a(String str) {
            return true;
        }
    }

    /* renamed from: i0.l.a.i.a.g$g  reason: collision with other inner class name */
    /* compiled from: JStylerObj */
    public interface C0196g {
        boolean a(String str);
    }

    /* compiled from: JStylerObj */
    public interface h {
        void a(String str, Appendable appendable);
    }

    public static boolean a(String str) {
        if (str.length() < 3) {
            return false;
        }
        char charAt = str.charAt(0);
        if (charAt == 'n') {
            return str.equals("null");
        }
        if (charAt == 't') {
            return str.equals("true");
        }
        if (charAt == 'f') {
            return str.equals("false");
        }
        if (charAt == 'N') {
            return str.equals("NaN");
        }
        return false;
    }

    public static boolean b(char c2) {
        return c2 == '{' || c2 == '[' || c2 == ',' || c2 == '}' || c2 == ']' || c2 == ':' || c2 == '\'' || c2 == '\"';
    }

    public static boolean c(char c2) {
        return (c2 >= 0 && c2 <= 31) || (c2 >= 127 && c2 <= 159) || (c2 >= 8192 && c2 <= 8447);
    }
}
