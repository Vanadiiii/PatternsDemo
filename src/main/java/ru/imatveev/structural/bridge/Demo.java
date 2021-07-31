package ru.imatveev.structural.bridge;

public class Demo {
    public static void main(String[] args) {
        IColor color = new RedColor();
        IShape shape = new Circle();

        IFigure figure = new Figure(shape, color);

        figure.draw();
    }
}
