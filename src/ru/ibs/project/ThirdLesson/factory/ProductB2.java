package ru.ibs.project.ThirdLesson.factory;

public class ProductB2 implements ProductB{

    private final ProductA productA;

    public ProductB2(ProductA productA) {
        this.productA = productA;
    }

    @Override
    public ProductA getProductA() {
        return productA;
    }


}
