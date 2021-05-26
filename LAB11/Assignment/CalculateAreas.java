package com.company;


public class CalculateAreas {

    private final Shape[] shape;
    private final double[] area;


    public CalculateAreas(Shape[] obj) {
        shape = new Shape[obj.length];
        System.arraycopy(obj, 0, shape, 0, obj.length);
        area = new double[100];
    }


    public void calArea() {
        double shapeArea;
        for (int i = 0; i < shape.length; i++) {
            if (shape[i] != null) {
                shapeArea = shape[i].area();
                area[i] = shapeArea;
            }


        }
    }

    @Override
    public String toString() {
        String printShapeArea = "";
        for (int i = 0; i < shape.length; i++) {
            if (area[i] != 0) {
                printShapeArea = printShapeArea + "First Shape Area: " + area[i] + "\n";
            }

        }
        return "All Shapes Area:\n" + printShapeArea;
    }
}
