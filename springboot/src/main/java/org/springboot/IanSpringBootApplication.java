package org.springboot;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface IanSpringBootApplication {
    //target那裏的表示這註解可以寫到類上面(限定)
    //  public enum ElementType {
    //    TYPE, // 適用 class, interface, enum
    //    FIELD, // 適用 field
    //    METHOD, // 適用 method
    //    PARAMETER, // 適用 method 上之 parameter
    //    CONSTRUCTOR, // 適用 constructor
    //    LOCAL_VARIABLE, // 適用區域變數
    //    ANNOTATION_TYPE, // 適用 annotation 型態
    //    PACKAGE // 適用 package
    //  }
    //retention部分
    //    public enum RetentionPolicy {
    //        SOURCE, // 編譯器處理完Annotation資訊後就沒事了
    //        CLASS, // 編譯器將Annotation儲存於class檔中，預設
    //        RUNTIME // 編譯器將Annotation儲存於class檔中，可由VM讀入
    //    }
    //用 @Documented 注解修饰的注解类会被 JavaDoc 工具提取成文档。
    //@Inhererited 通过对注解上使用元注解Inherited声明出的注解，在使用时用在类上，可以被子类所继承，对属性或方法无效。
}
