package wuan580.vn.factory_method.factory;

import wuan580.vn.factory_method.buttons.Button;
import wuan580.vn.factory_method.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
