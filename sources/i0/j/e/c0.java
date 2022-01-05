package i0.j.e;

import com.instabug.library.internal.utils.stability.execution.ReturnableExecutable;
import com.instabug.library.internal.utils.stability.handler.exception.ExceptionHandler;
import java.lang.reflect.Field;

/* compiled from: ReflectionUtils */
public class c0 {
    public static final ExceptionHandler a = new ExceptionHandler().withPenaltyLog("ReflectionUtils");

    /* compiled from: ReflectionUtils */
    public static class a implements ReturnableExecutable<Object> {
        public final /* synthetic */ Field a;
        public final /* synthetic */ Object b;

        public a(Field field, Object obj) {
            this.a = field;
            this.b = obj;
        }

        public Object execute() throws Exception {
            return this.a.get(this.b);
        }
    }

    public static Object a(Field field, Object obj) {
        return a.executeAndGet(new a(field, obj));
    }
}
