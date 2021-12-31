package oikos.app.common.utils.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/** Created by Mohamed Haamdi on 26/06/2021 */
@Target({ElementType.FIELD})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = NullOrMinValidator.class)
public @interface NullOrMin {
  String message() default "{javax.validation.constraints.Pattern.message}";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};

  double value();
}
