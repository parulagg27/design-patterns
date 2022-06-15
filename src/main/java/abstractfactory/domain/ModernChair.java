package abstractfactory.domain;

import abstractfactory.domain.Chair;

public class ModernChair implements Chair {

    public boolean hasLegs() {
        return false;
    }

    public String sitOn() {
        return "Seated on Modern Chair";
    }
}
