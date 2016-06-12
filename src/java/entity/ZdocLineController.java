package entity;

import entity.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "zdocLineController")
@ViewScoped
public class ZdocLineController extends AbstractController<ZdocLine> {

    @Inject
    private ZdocController zdocIdController;
    @Inject
    private MobilePageController mobilePageController;

    public ZdocLineController() {
        // Inform the Abstract parent controller of the concrete ZdocLine Entity
        super(ZdocLine.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        zdocIdController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Zdoc controller in order to display
     * its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareZdocId(ActionEvent event) {
        if (this.getSelected() != null && zdocIdController.getSelected() == null) {
            zdocIdController.setSelected(this.getSelected().getZdocId());
        }
    }
}
