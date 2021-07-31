package ru.imatveev.structural.bridge;

import java.util.logging.Logger;

/**
 * <h2>split figure's properties by some fields (shape, color)</h2>
 * <h2>it's easily, than create 4 classes (like 'RedSquare', 'RedCircle', etc)</h2>
 */
public record Figure(IShape shape, IColor color) implements IFigure{
    private static final Logger log = Logger.getLogger(Figure.class.getSimpleName());

    public void draw() {
        log.info(() -> "draw " + color.fill() + " " + shape.get());
    }
}
