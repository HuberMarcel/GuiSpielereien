package de.javafish.gui;


import java.awt.*;

public class SwingTools {

    public static Point getCenterOnScreen(int screen, Dimension dimension) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] gs = ge.getScreenDevices();
        GraphicsDevice gd = gs[screen];
        GraphicsConfiguration[] gc = gd.getConfigurations();
        Rectangle screenBounds = gc[0].getBounds();

        Point pos = new Point();
        pos.x = screenBounds.x + (screenBounds.width / 2) - (dimension.width / 2);
        pos.y = screenBounds.y + (screenBounds.height / 2) - (dimension.height / 2);

        return pos;
    }

    public static void centerOnScreen(int screen, Frame frame) {
        frame.setLocation(SwingTools.getCenterOnScreen(screen, frame.getSize()));
    }
}
