package powerzhou.com.testapp.injector.annotion;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by Administrator on 2017/3/10 0010.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface Type {
    String value() default "";
}
