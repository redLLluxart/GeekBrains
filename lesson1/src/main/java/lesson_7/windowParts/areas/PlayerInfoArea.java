package lesson_7.windowParts.areas;

import lesson_7.windowParts.InfoPanel;

import javax.swing.*;
import java.awt.*;

public class PlayerInfoArea extends JPanel {
    private JLabel hp;
    private JLabel exp;
    private JLabel coins;

    private InfoPanel infoPanel;

    public PlayerInfoArea(InfoPanel infoPanel) {
        this.infoPanel = infoPanel;

        setLayout(new GridLayout(4,1));

        hp = new JLabel("Health ?");
        exp = new JLabel("Expirience ?");
        coins = new JLabel("Coins ?");

        add(new JLabel("= Player Info ="), CENTER_ALIGNMENT);
        add(hp);
        add(exp);
        add(coins);
    }
}
