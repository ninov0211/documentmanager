package entity;

import entity.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "zdocController")
@ViewScoped
public class ZdocController extends AbstractController<Zdoc> {

    @Inject
    private ZuserController zuserIdController;
    @Inject
    private ZstatusdocController zstatusdocIdController;
    @Inject
    private ZstatusController zstatusIdController;
    @Inject
    private MobilePageController mobilePageController;

    public ZdocController() {
        // Inform the Abstract parent controller of the concrete Zdoc Entity
        super(Zdoc.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        zuserIdController.setSelected(null);
        zstatusdocIdController.setSelected(null);
        zstatusIdController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Zuser controller in order to display
     * its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareZuserId(ActionEvent event) {
        if (this.getSelected() != null && zuserIdController.getSelected() == null) {
            zuserIdController.setSelected(this.getSelected().getZuserId());
        }
    }

    /**
     * Sets the "selected" attribute of the Zstatusdoc controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareZstatusdocId(ActionEvent event) {
        if (this.getSelected() != null && zstatusdocIdController.getSelected() == null) {
            zstatusdocIdController.setSelected(this.getSelected().getZstatusdocId());
        }
    }

    /**
     * Sets the "selected" attribute of the Zstatus controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareZstatusId(ActionEvent event) {
        if (this.getSelected() != null && zstatusIdController.getSelected() == null) {
            zstatusIdController.setSelected(this.getSelected().getZstatusId());
        }
    }

    /**
     * Sets the "items" attribute with a collection of ZdocLine entities that
     * are retrieved from Zdoc?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for ZdocLine page
     */
    public String navigateZdocLineCollection() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("ZdocLine_items", this.getSelected().getZdocLineCollection());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/zdocLine/index";
    }

}
