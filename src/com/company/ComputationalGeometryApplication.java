package com.company;

public class ComputationalGeometryApplication
{
    Geometricshape cga ;
        ComputationalGeometryApplication ()
        {
            Shape shape = new Shape();
            this.cga = new Geometricshape(shape);

        }

        public void printAxis()
        {
            System.out.println("Lower Right Corner. X: " + cga.getXLowerRightCorner()
                    + " Y: " + cga.getYLowerRightCorner());
        }


}
