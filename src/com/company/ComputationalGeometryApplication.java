package com.company;

public class ComputationalGeometryApplication
{
    GeometricShape cga ;
        ComputationalGeometryApplication ()
        {
            Shape shape = new Shape();
            this.cga = new GeometricShape(shape);

        }

        public void printAxis()
        {
            System.out.println("Lower Right Corner. X: " + cga.getXLowerRightCorner()
                    + " Y: " + cga.getYLowerRightCorner());
        }

    // LCOM --> 1 - (2 / 2 * 1) = 1 - 1 = 0
}
