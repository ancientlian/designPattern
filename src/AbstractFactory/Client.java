package AbstractFactory;

import AbstractFactory.factory.Button;
import AbstractFactory.factory.ComboBox;
import AbstractFactory.factory.SkinFactory;
import AbstractFactory.factory.TextField;
import AbstractFactory.utils.XMLUtil;

public class Client {
    public static void main(String args[]) {
        //使用抽象层定义
        SkinFactory factory;
        Button bt;
        TextField tf;
        ComboBox cb;
        factory = (SkinFactory) XMLUtil.getBean();
        assert factory != null;
        bt = factory.createButton();
        tf = factory.createTextField();
        cb = factory.createComboBox();
        bt.display();
        tf.display();
        cb.display();
    }
}
