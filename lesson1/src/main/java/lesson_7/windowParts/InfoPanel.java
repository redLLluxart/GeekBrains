package lesson_7.windowParts;

import lesson_7.MainWindow;
import lesson_7.windowParts.areas.GameControlArea;
import lesson_7.windowParts.areas.GameInfoArea;
import lesson_7.windowParts.areas.PlayerControlArea;
import lesson_7.windowParts.areas.PlayerInfoArea;

import javax.swing.*;
import java.awt.*;

public class InfoPanel extends JPanel {

    private GameControlArea gameControlArea;
    private GameInfoArea gameInfoArea;
    private PlayerInfoArea playerInfoArea;
    private PlayerControlArea playerControlArea;

    private JTextArea logs;
    private JScrollPane scrollBox;

    private MainWindow mainWindow;

    public InfoPanel(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        setLayout(new GridLayout(5, 1));

        gameControlArea = new GameControlArea(this);
        gameInfoArea = new GameInfoArea(this);
        playerInfoArea = new PlayerInfoArea(this);
        playerControlArea = new PlayerControlArea(this);

        createLogArea();

        add(gameControlArea);
        add(gameInfoArea);
        add(playerInfoArea);
        add(playerControlArea);
        add(scrollBox);
    }

    private void createLogArea() {
        logs = new JTextArea();
        logs.setLineWrap(true);
        scrollBox = new JScrollPane(logs);
    }
}
