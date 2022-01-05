package retrofit2;

import t0.v;

public class HttpException extends RuntimeException {
    public HttpException(v<?> vVar) {
        super("HTTP " + vVar.a.y + " " + vVar.a.x);
        int i = vVar.a.y;
    }
}
