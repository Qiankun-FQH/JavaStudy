package jww.qk.reflection.proxy;

/**
 * @author Qiankun
 * @date 2020/2/20 0020 -15:53
 * @title
 **/

interface ClothFactory{

    void produceCloth();
}

class ProxyClothFactory implements ClothFactory{

    private ClothFactory factory;

    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }

    @Override
    public void produceCloth() {
        System.out.println("代理做一些准备方法");
        factory.produceCloth();
        System.out.println("代理工厂做一些后续的收尾工作");
    }
}

class NickCloFactory implements ClothFactory{

    @Override
    public void produceCloth() {
        System.out.println("Nick 生产一批运动服");
    }
}

public class StaticProxyTest {
    public static void main(String[] args){
        ClothFactory nike = new NickCloFactory();
        ClothFactory proxyClothFactory = new ProxyClothFactory(nike);

        proxyClothFactory.produceCloth();

    }

}
