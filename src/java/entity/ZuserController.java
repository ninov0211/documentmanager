package entity;

import entity.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "zuserController")
@ViewScoped
public class ZuserController extends AbstractController<Zuser> {

    @Inject
    private MobilePageController mobilePageController;

    public ZuserController() {
        // Inform the Abstract parent controller of the concrete Zuser Entity
        super(Zuser.class);
    }

    /**
     * Sets the "items" attribute with a collection of Zdoc entities that are
     * retrieved from Zuser?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Zdoc page
     */
    public String navigateZdocCollection() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Zdoc_items", this.getSelected().getZdocCollection());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/zdoc/index";
    }

}
