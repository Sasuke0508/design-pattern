package wuan580.vn.abstract_factory.factories;

import wuan580.vn.abstract_factory.buttons.Button;
import wuan580.vn.abstract_factory.buttons.MacOSButton;
import wuan580.vn.abstract_factory.checkboxes.Checkbox;
import wuan580.vn.abstract_factory.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
