package org.yulran.lesson4.hfgd;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
    public @interface UserTypeAnnotation {
        String value() default "Загальні методи для всіх типів користувачів";
        int defaultActivityLevel() default 0; // Рівень активності за замовчуванням
        boolean defaultPremiumStatus() default false; // Статус преміум-користувача за замовчуванням
    }



