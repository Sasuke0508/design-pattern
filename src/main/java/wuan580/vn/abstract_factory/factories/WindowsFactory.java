package wuan580.vn.abstract_factory.factories;

import wuan580.vn.abstract_factory.buttons.Button;
import wuan580.vn.abstract_factory.buttons.WindowsButton;
import wuan580.vn.abstract_factory.checkboxes.Checkbox;
import wuan580.vn.abstract_factory.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
