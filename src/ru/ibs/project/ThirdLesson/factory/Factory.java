package ru.ibs.project.ThirdLesson.factory;

public interface Factory {
    ProductA createProductA();
    ProductB createProductB(ProductA productA);
}
