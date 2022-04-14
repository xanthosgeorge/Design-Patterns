package com.company;

import java.awt.*;

public class Geometricshape extends Container {
 private  Shape shape;
 Geometricshape (Shape shape1)
 {
     this.shape = shape1;

 }
public int getXLowerRightCorner ()
    {
        return shape.getWidth();
    }
    public int getYLowerRightCorner ()
    {
        return shape.getHeight();
    }



}
