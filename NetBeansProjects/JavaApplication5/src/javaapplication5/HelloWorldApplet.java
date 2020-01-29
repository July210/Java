package javaapplication5;

import java.awt.Graphics;


public class HelloWorldApplet extends java.applet.Applet {

    private static final long serialVersionUID = -1879245228290566081L;

    public void paint(Graphics g) {
       g.drawString ("Hello World!",5,25);
    }
}