package jww.qk.reflection.java2;

import jww.qk.reflection.java1.Person;
import jww.qk.team.service.TeamService;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author Qiankun
 * @date 2020/2/20 0020 -14:54
 * @title
 **/
public class MethodTest {

    //
    @Test
    public void test1(){
        Class<Person> personClass = Person.class;

        Method[] methods =
                personClass.getMethods();
        for(Method m : methods){
            System.out.println(m);
        }
        System.out.println("------------");
        Method[] methods2 =
                personClass.getDeclaredMethods();
        for(Method m : methods2){
            System.out.println(m);
        }
    }
    //
    @Test
    public void test2(){

        Class<Person> personClass = Person.class;

        Method[] methods2 =
                personClass.getDeclaredMethods();
        for(Method m : methods2){
            Annotation[] annotations = m.getAnnotations();
            for(Annotation a : annotations){
               // System.out.println(a);
            }

            //System.out.println(Modifier.toString(m.getModifiers()) + "\t");

            Class<?> returnType = m.getReturnType();
            System.out.println(returnType);


       //     System.out.println(m.getName());
        //    System.out.println("(");

            Class<?>[] parameterTypes = m.getParameterTypes();
            if(!(parameterTypes == null && parameterTypes.length == 0))
            {
                for(int i=0; i < parameterTypes.length; i++){
                    if(i == parameterTypes.length - 1){
           //             System.out.println(parameterTypes[i].getName());
                      //  break;;
                    }
         //           System.out.println(parameterTypes[i].getName() + "arg_" + i);
                }
            }

          //  System.out.println(")");


            Class<?>[] exceptionTypes = m.getExceptionTypes();
            if(exceptionTypes.length > 0)
            {
                System.out.println("throws ");
                for (int i = 0; i < exceptionTypes.length; i++) {
                    if(i == exceptionTypes.length - 1){
                        System.out.println(exceptionTypes[i].getName());
                        break;
                    }
                    System.out.println(exceptionTypes[i].getName() + ",");
                }
            }
        }

    }
}
