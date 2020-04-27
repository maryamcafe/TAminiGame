package com.company.shape;

import com.company.interfaces.Movable;
import com.company.interfaces.Paintable;
import com.company.listener.Listener;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Shape implements Movable, Paintable {

    private int x ,y ,speedX, speedY;

    private Color color;
    private boolean isLive;
    private Listener mouse;

    public Shape(){

    }


    @Override
    public void move() {

    }

    @Override
    public void paint(Graphics g) {

    }
}
