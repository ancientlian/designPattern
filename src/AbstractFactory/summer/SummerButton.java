package AbstractFactory.summer;

import AbstractFactory.factory.Button;

/**
 * Summer按钮类：具体产品
 */
public class SummerButton implements Button {
    public void display() {
        System.out.println("显示浅蓝色按钮。");
    }
}
