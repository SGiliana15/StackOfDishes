package org.example;

public class DishStack {
    private Dish[] stackArray;
    private int top;
    private int maxSize;

    public DishStack() {
        this.maxSize = 10;
        this.stackArray = new Dish[maxSize];
        this.top = -1;
    }

    public DishStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new Dish[maxSize];
        this.top = -1;
    }

    public void push(Dish dish) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push new Dish.");
            return;
        }
        stackArray[++top] = dish;
    }

    public Dish pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
        Dish poppedDish = stackArray[top];
        stackArray[top--] = null;
        return poppedDish;
    }

    public Dish peek() {
        if (top == -1) {
            System.out.println("Stack is empty. Nothing to peek.");
            return null;
        }
        return stackArray[top];
    }

    public int size() {
        return top + 1;
    }
}