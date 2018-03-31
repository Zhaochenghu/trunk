package cn.com.leanvision.annotation.spf;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/********************************
 * Created by lvshicheng on 2016/12/4.
 ********************************/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.SOURCE)
public @interface LvSpfConfig {

  boolean encryption() default false;

  boolean save() default true;

  boolean commit() default false;

  boolean preferences() default false;

  /**
   * 如果是true全局参数通过get(name1)或者get(name2)使用都是一样的,如果是false,那么字段名会带上name(name1_fieldName)
   */
  boolean global() default true;
}
