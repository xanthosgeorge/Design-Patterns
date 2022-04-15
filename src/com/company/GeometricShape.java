package com.company;

import java.awt.*;

public class GeometricShape extends Container {
 private  Shape shape;

 GeometricShape (Shape shape)
 {
     this.shape = shape;

 }
public int getXLowerRightCorner ()
    {
        return shape.getWidth();
    }
    public int getYLowerRightCorner ()
    {
        return shape.getHeight();
    }

    /*
    LCOM --> 1 - (3+ 0)/3 = 0
     */


}
