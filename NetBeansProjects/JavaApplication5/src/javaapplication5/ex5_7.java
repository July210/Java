package javaapplication5;

import java.awt.*;
import java.applet.Applet;

public class ex5_7 extends Applet {
    Label display;
    Panel bottom;
    Panel num_panel;
    Panel func_panel;
    Button number[] = new Button[10];
    Button function[] = new Button[6];

    public void init() {
        setLayout(new BorderLayout());
        display = new Label("0", Label.RIGHT);
        add("North", display);
        bottom = new Panel();
        bottom.setLayout(new BorderLayout());
        num_panel = new Panel();
        num_panel.setLayout(new GridLayout(4, 3));
        for (int x = 9; x >= 0; x--) {
            number[x] = new Button((new String()).valueOf(x));
            num_panel.add(number[x]);
        }
        function[4] = new Button(".");
        num_panel.add(function[4]);
        function[5] = new Button("=");
        num_panel.add(function[5]);
        bottom.add("Center", num_panel);
        func_panel = new Panel();
        func_panel.setLayout(new GridLayout(4, 1));
        function[0] = new Button("+");
        function[1] = new Button("-");
        function[2] = new Button("*");
        function[3] = new Button("/");
        for (int x = 0; x < 4; x++)
            func_panel.add(function[x]);
        bottom.add("East", func_panel);
        add("Center", bottom);
    }
}