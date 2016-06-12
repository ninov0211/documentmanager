package entity;

import entity.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "zprivilageController")
@ViewScoped
public class ZprivilageController extends AbstractController<Zprivilage> {

    @Inject
    private MobilePageController mobilePageController;

    public ZprivilageController() {
        // Inform the Abstract parent controller of the concrete Zprivilage Entity
        super(Zprivilage.class);
    }

}
