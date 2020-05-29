package jww.qk.reflection.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Qiankun
 * @date 2020/2/20 0020 -16:01
 * @title
 **/
interface Human{

    String getBelief();

    void eat(String food);
}

class HumanUtil{
    public void method1(){
        System.out.println("通用方法一");
    }
    public void method2(){
        System.out.println("通用方法二");
    }
}

class SuperMan implements Human{

    @Override
    public String getBelief() {
        return "I belive I can fly!";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃" + food);
    }
}

class ProxyFactory{
    public static Object getProxyInstance(Object object){
        MyInvocationHandler myInvocationHandler =
                                new MyInvocationHandler();

        myInvocationHandler.bind(object);

        return Proxy.newProxyInstance(
                object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                myInvocationHandler
        );
    }
}

class MyInvocationHandler implements InvocationHandler{

    private Object obj;

    public void bind(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        HumanUtil humanUtil = new HumanUtil();
        humanUtil.method1();


        Object invoke = method.invoke(obj, args);
        humanUtil.method2();
        return invoke;
    }
}

public class ProxyTest {
    public static void main(String[] args){
        SuperMan superMan = new SuperMan();
        Human instance1 =
                (Human) ProxyFactory.getProxyInstance(superMan);

        String belief = instance1.getBelief();
        System.out.println(belief);
        instance1.eat("四川麻辣烫");


        NickCloFactory nickCloFactory  =
                  new NickCloFactory();
        Object proxyInstance = ProxyFactory.getProxyInstance(nickCloFactory);

        ClothFactory proxyInstance1 = (ClothFactory) proxyInstance;
        proxyInstance1.produceCloth();



    }
}