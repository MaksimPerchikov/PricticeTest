package ru.ibs.project.ThirdLesson.factory;

public class Factory2 implements Factory{
    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB(ProductA productA) {
        return new ProductB2(productA);
    }
}
