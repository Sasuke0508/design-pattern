package wuan580.vn.abstract_factory.factories;

import wuan580.vn.abstract_factory.buttons.Button;
import wuan580.vn.abstract_factory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
