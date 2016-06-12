package entity;

import entity.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "ztdocController")
@ViewScoped
public class ZtdocController extends AbstractController<Ztdoc> {

    @Inject
    private MobilePageController mobilePageController;

    public ZtdocController() {
        // Inform the Abstract parent controller of the concrete Ztdoc Entity
        super(Ztdoc.class);
    }

}
