package ru.ibs.project.TestBlog;

public class PairNumberFactory {
    public <T extends Number, D extends Number> Pair<T,D> create(T first,D second){
        return new Pair<>(first,second);
    }
}
