package com.stripe.android.utils;

import i0.j.f.p.h;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\b\u001a\u0004\u0018\u00010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0007¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/utils/ClassUtils;", "", "Ljava/lang/Class;", "clazz", "", "", "allowedFields", "obj", "getInternalObject", "(Ljava/lang/Class;Ljava/util/Set;Ljava/lang/Object;)Ljava/lang/Object;", "", "Ljava/lang/reflect/Field;", "findField", "(Ljava/lang/Class;Ljava/util/Collection;)Ljava/lang/reflect/Field;", "allowedMethods", "Ljava/lang/reflect/Method;", "findMethod", "(Ljava/lang/Class;Ljava/util/Collection;)Ljava/lang/reflect/Method;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ClassUtils.kt */
public final class ClassUtils {
    public static final ClassUtils INSTANCE = new ClassUtils();

    private ClassUtils() {
    }

    public static final Field findField(Class<?> cls, Collection<String> collection) {
        Field field;
        i.e(cls, "clazz");
        i.e(collection, "allowedFields");
        Field[] declaredFields = cls.getDeclaredFields();
        i.d(declaredFields, "fields");
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                field = null;
                break;
            }
            field = declaredFields[i];
            i.d(field, "it");
            if (collection.contains(field.getName())) {
                break;
            }
            i++;
        }
        if (field == null) {
            return null;
        }
        field.setAccessible(true);
        return field;
    }

    public static final Method findMethod(Class<?> cls, Collection<String> collection) {
        i.e(cls, "clazz");
        i.e(collection, "allowedMethods");
        Method[] declaredMethods = cls.getDeclaredMethods();
        i.d(declaredMethods, "clazz.declaredMethods");
        for (Method method : declaredMethods) {
            i.d(method, "it");
            if (collection.contains(method.getName())) {
                return method;
            }
        }
        return null;
    }

    public static final Object getInternalObject(Class<?> cls, Set<String> set, Object obj) {
        Object obj2;
        i.e(cls, "clazz");
        i.e(set, "allowedFields");
        i.e(obj, "obj");
        Field findField = findField(cls, set);
        if (findField == null) {
            return null;
        }
        try {
            obj2 = findField.get(obj);
        } catch (Throwable th) {
            obj2 = h.l0(th);
        }
        if (obj2 instanceof Result.Failure) {
            return null;
        }
        return obj2;
    }
}
