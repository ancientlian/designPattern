package AbstractFactory.factory;

import AbstractFactory.factory.Button;
import AbstractFactory.factory.ComboBox;
import AbstractFactory.factory.SkinFactory;
import AbstractFactory.factory.TextField;
import AbstractFactory.spring.SpringButton;
import AbstractFactory.spring.SpringComboBox;
import AbstractFactory.spring.SpringTextField;

/**
 * Spring皮肤工厂：具体工厂
 */
public class SpringSkinFactory implements SkinFactory {
    public Button createButton() {
        return new SpringButton();
    }

    public TextField createTextField() {
        return new SpringTextField();
    }

    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
