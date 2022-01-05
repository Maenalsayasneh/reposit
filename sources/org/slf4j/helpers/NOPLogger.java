package org.slf4j.helpers;

public class NOPLogger extends MarkerIgnoringBase {
    public static final NOPLogger c = new NOPLogger();

    public final void a(String str, Throwable th) {
    }

    public final void b(String str, Throwable th) {
    }

    public final void c(String str) {
    }

    public final void debug(String str) {
    }

    public String getName() {
        return "NOP";
    }

    public final void info(String str) {
    }
}
