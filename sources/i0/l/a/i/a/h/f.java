package i0.l.a.i.a.h;

import com.nimbusds.jose.shaded.json.parser.ParseException;
import java.io.IOException;

/* compiled from: JSONParserMemory */
public abstract class f extends e {
    public int w;

    public f(int i) {
        super(i);
    }

    public void f() throws ParseException, IOException {
        if (this.p || this.f != '\'') {
            g gVar = (g) this;
            int indexOf = gVar.x.indexOf(this.f, this.l + 1);
            if (indexOf != -1) {
                gVar.k = gVar.x.substring(this.l + 1, indexOf);
                if (this.k.indexOf(92) == -1) {
                    if (!this.t) {
                        int length = this.k.length();
                        for (int i = 0; i < length; i++) {
                            char charAt = this.k.charAt(i);
                            if (charAt >= 0) {
                                if (charAt <= 31) {
                                    throw new ParseException(this.l + i, 0, Character.valueOf(charAt));
                                } else if (charAt == 127) {
                                    throw new ParseException(this.l + i, 0, Character.valueOf(charAt));
                                }
                            }
                        }
                    }
                    this.l = indexOf;
                    c();
                    return;
                }
                this.i.b = -1;
                char c = this.f;
                while (true) {
                    c();
                    char c2 = this.f;
                    if (c2 == '\"' || c2 == '\'') {
                        if (c == c2) {
                            c();
                            this.k = this.i.toString();
                            return;
                        }
                        this.i.a(c2);
                    } else if (c2 != '\\') {
                        if (c2 != 127) {
                            switch (c2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                    break;
                                case 26:
                                    throw new ParseException(this.l - 1, 3, (Object) null);
                                default:
                                    this.i.a(c2);
                                    continue;
                            }
                        }
                        if (!this.t) {
                            throw new ParseException(this.l, 0, Character.valueOf(this.f));
                        }
                    } else {
                        c();
                        char c3 = this.f;
                        if (c3 == '\"') {
                            this.i.a('\"');
                        } else if (c3 == '\'') {
                            this.i.a('\'');
                        } else if (c3 == '/') {
                            this.i.a('/');
                        } else if (c3 == '\\') {
                            this.i.a('\\');
                        } else if (c3 == 'b') {
                            this.i.a(8);
                        } else if (c3 == 'f') {
                            this.i.a(12);
                        } else if (c3 == 'n') {
                            this.i.a(10);
                        } else if (c3 == 'r') {
                            this.i.a(13);
                        } else if (c3 == 'x') {
                            this.i.a(g(2));
                        } else if (c3 == 't') {
                            this.i.a(9);
                        } else if (c3 == 'u') {
                            this.i.a(g(4));
                        }
                    }
                }
            } else {
                throw new ParseException(this.w, 3, (Object) null);
            }
        } else if (this.o) {
            boolean[] zArr = e.a;
            int i2 = this.l;
            i(zArr);
            k(i2, this.l);
        } else {
            throw new ParseException(this.l, 0, Character.valueOf(this.f));
        }
    }

    public void k(int i, int i2) {
        g gVar = (g) this;
        gVar.k = gVar.x.substring(i, i2);
        this.k = this.k.trim();
    }
}
