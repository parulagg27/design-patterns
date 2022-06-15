package abstractfactory;

import abstractfactory.domain.Chair;
import abstractfactory.domain.Table;
import abstractfactory.domain.VictorianChair;
import abstractfactory.domain.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory {

    public Chair createChair() {
        return new VictorianChair();
    }

    public Table createTable() {
        return new VictorianTable();
    }
}
