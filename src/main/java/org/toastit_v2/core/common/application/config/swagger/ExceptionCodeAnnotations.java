package org.toastit_v2.core.common.application.config.swagger;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.toastit_v2.core.common.application.code.CommonExceptionCode;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExceptionCodeAnnotations {

    CommonExceptionCode[] value();

}
