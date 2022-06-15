package abstractfactory;

import abstractfactory.domain.Chair;
import abstractfactory.domain.ModernChair;
import abstractfactory.domain.ModernTable;
import abstractfactory.domain.Table;

public class ModernFurnitureFactory implements FurnitureFactory {

    public Chair createChair() {
        return new ModernChair();
    }

    public Table createTable() {
        return new ModernTable();
    }
}
