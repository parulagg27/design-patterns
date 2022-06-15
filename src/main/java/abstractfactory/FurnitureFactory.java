package abstractfactory;

import abstractfactory.domain.Chair;
import abstractfactory.domain.Table;

public interface FurnitureFactory {

    Chair createChair();

    Table createTable();
}
