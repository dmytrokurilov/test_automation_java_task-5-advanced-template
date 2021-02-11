package com.epam.test.automation.java.practice5;

public class ArrayRectangles {

    private final Rectangle[] rectangleArray;

    public ArrayRectangles(int n)
    {
        rectangleArray = new Rectangle[n];
    }
    public ArrayRectangles(Rectangle ... rectangles)
    {
        rectangleArray = rectangles;
    }

    public boolean addRectangle(Rectangle rectangle) {
        for (int i = 0; i < rectangleArray.length; i++)
        {
            if (rectangleArray[i] == null)
            {
                rectangleArray[i] = rectangle;
                return true;
            }
        }
        return false;
    }

    public int numberMaxArea() {
        int indexOfMaxRectangleArea = 0;
        double maxSquare = 0;
        for (int i = 0; i < rectangleArray.length; i++)
        {
            if (rectangleArray[i].area() > maxSquare)
            {
                indexOfMaxRectangleArea = i;
                maxSquare = rectangleArray[i].area();
            }
        }
        return indexOfMaxRectangleArea;
    }

    public int numberMinPerimeter() {
        int number = 0;
        double minPerimeter = rectangleArray[0].perimeter();
        for (int i = 1; i < rectangleArray.length; i++)
        {
            if (rectangleArray[i] != null && minPerimeter > rectangleArray[i].perimeter())
            {
                minPerimeter = rectangleArray[i].perimeter();
                number = i;
            }
        }
        return number;
    }

    public int numberSquares() {
        int c = 0;
        for (int i = 0; i < rectangleArray.length; i++)
        {
            if (rectangleArray[i].isSquare())
            {
                c++;
            }
        }
        return c;
    }

}
