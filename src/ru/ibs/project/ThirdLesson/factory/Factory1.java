package ru.ibs.project.ThirdLesson.factory;

public class Factory1 implements Factory{
    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB(ProductA productA) {
        ProductB1 productB1 = new ProductB1();
        productB1.setProductA(productA);
        return productB1;
    }
}
