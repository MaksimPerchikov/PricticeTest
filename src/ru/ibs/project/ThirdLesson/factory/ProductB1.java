package ru.ibs.project.ThirdLesson.factory;

public class ProductB1 implements ProductB{
    private ProductA productA;

    public ProductA getProductA() {
        return productA;
    }

    public void setProductA(ProductA productA) {
        this.productA = productA;
    }
}
