package AbstractFactory.summer;

import AbstractFactory.factory.TextField;

/**
 * Summer文本框类：具体产品
 */
public class SummerTextField implements TextField {
    public void display() {
        System.out.println("显示蓝色边框文本框。");
    }
}
