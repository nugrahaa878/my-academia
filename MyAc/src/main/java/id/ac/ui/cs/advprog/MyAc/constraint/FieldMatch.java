package id.ac.ui.cs.advprog.MyAc.constraint;

import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({
        TYPE,
        ANNOTATION_TYPE
})
@Retention(RUNTIME)
@Documented
public @interface FieldMatch {
    String message() default "{constraints.field-match}";
    Class < ? > [] groups() default {};
    Class < ? extends Payload> [] payload() default {};
    String first();
    String second();

    @Target({
            TYPE,
            ANNOTATION_TYPE
    })
    @Retention(RUNTIME)
    @Documented
    @interface List {
        FieldMatch[] value();
    }
}
