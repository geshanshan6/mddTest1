package demo.ioc;
public class TextHelloImpl implements IHello {
    @Override
    public void sayHello() {
        System.out.println("say hello by text.");
    }
}