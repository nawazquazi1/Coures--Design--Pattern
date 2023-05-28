package course.model;

import course.imodel.IceCream;

public class ButterScotchIceCream extends IceCream {
    @Override
    public String getDescription(){
        return "Butter Scotch";
    }

    @Override
    public int cost() {
        return 60;
    }
}
