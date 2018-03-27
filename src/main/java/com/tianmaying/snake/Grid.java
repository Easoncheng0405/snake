package com.tianmaying.snake;


public class Grid {
    private Snake snake ;
    int width;
    int height;
    public Grid(int width, int height) {
        // your code here
        snake = new Snake();
        this.width = width;
        this.height = height;

    }

    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }

    public Snake getSnake(){
        return this.snake;
    }

}