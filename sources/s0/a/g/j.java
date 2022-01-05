package s0.a.g;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Vector;

public final class j {
    public static String a;

    public static class a implements PrivilegedAction<String> {
        public Object run() {
            return System.getProperty("line.separator");
        }
    }

    static {
        try {
            a = (String) AccessController.doPrivileged(new a());
        } catch (Exception unused) {
            try {
                a = String.format("%n", new Object[0]);
            } catch (Exception unused2) {
                a = "\n";
            }
        }
    }

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    public static String[] b(String str, char c) {
        int i;
        Vector vector = new Vector();
        boolean z = true;
        while (true) {
            if (!z) {
                break;
            }
            int indexOf = str.indexOf(c);
            if (indexOf > 0) {
                vector.addElement(str.substring(0, indexOf));
                str = str.substring(indexOf + 1);
            } else {
                vector.addElement(str);
                z = false;
            }
        }
        int size = vector.size();
        String[] strArr = new String[size];
        for (i = 0; i != size; i++) {
            strArr[i] = (String) vector.elementAt(i);
        }
        return strArr;
    }

    public static byte[] c(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    public static String d(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) ((c - 'A') + 97);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    public static void e(char[] cArr, OutputStream outputStream) throws IOException {
        char c;
        int i;
        char c2;
        int i2;
        int i3;
        int i4 = 0;
        while (i4 < cArr.length) {
            char c3 = cArr[i4];
            if (c3 >= 128) {
                if (c3 < 2048) {
                    i = (c3 >> 6) | 192;
                    c2 = c3;
                } else {
                    if (c3 < 55296 || c3 > 57343) {
                        i2 = (c3 >> 12) | 224;
                        i3 = c3;
                    } else {
                        i4++;
                        if (i4 < cArr.length) {
                            char c4 = cArr[i4];
                            if (c3 <= 56319) {
                                i3 = (((c3 & 1023) << 10) | (c4 & 1023)) + 0;
                                outputStream.write((i3 >> 18) | 240);
                                i2 = ((i3 >> 12) & 63) | 128;
                            } else {
                                throw new IllegalStateException("invalid UTF-16 codepoint");
                            }
                        } else {
                            throw new IllegalStateException("invalid UTF-16 codepoint");
                        }
                    }
                    outputStream.write(i2);
                    i = ((i3 >> 6) & 63) | 128;
                    c2 = i3;
                }
                outputStream.write(i);
                c = (c2 & true) | true;
            } else {
                c = c3;
            }
            outputStream.write(c);
            i4++;
        }
    }

    public static byte[] f(char[] cArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            e(cArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
    }

    public static String g(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                charArray[i] = (char) ((c - 'a') + 65);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }
}
