package AbstractFactory.summer;

import AbstractFactory.factory.ComboBox;

/**
 * Spring按钮类：具体产品
 */
public class SummerComboBox implements ComboBox {
    public void display() {
        System.out.println("显示蓝色边框组合框。");
    }
}
