/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.model;

import java.awt.Graphics;

/**
 *
 * @author James
 */
public abstract class GameObject {
    private String name;
    public abstract void draw(Graphics g);
}
