package AbstractFactory.factory;

import AbstractFactory.factory.Button;
import AbstractFactory.factory.ComboBox;
import AbstractFactory.factory.SkinFactory;
import AbstractFactory.factory.TextField;
import AbstractFactory.summer.SummerButton;
import AbstractFactory.summer.SummerComboBox;
import AbstractFactory.summer.SummerTextField;

/**
 * Spring皮肤工厂：具体工厂
 */
public class SummerSkinFactory implements SkinFactory {
    public Button createButton() {
        return new SummerButton();
    }

    public TextField createTextField() {
        return new SummerTextField();
    }

    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
