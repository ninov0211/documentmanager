package entity;

import entity.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "zdeptController")
@ViewScoped
public class ZdeptController extends AbstractController<Zdept> {

    @Inject
    private MobilePageController mobilePageController;

    public ZdeptController() {
        // Inform the Abstract parent controller of the concrete Zdept Entity
        super(Zdept.class);
    }

}
