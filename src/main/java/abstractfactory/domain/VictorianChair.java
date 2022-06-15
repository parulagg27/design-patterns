package abstractfactory.domain;

import abstractfactory.domain.Chair;

public class VictorianChair implements Chair {

    public boolean hasLegs() {
        return true;
    }

    public String sitOn() {
        return "Seated on Victorian Chair";
    }
}
