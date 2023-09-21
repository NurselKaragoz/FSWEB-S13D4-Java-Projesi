package com.homework;

public class Point {
   private int x;
   private int y;

   public Point(int x,int y){
    setX(x);
    setY(y);
   }
   public void setX(int x){
      this.x=x;
   }
   public void setY(int y){
      this.y=y;
   }

   public int getX() {
      return x;
   }

   public int getY() {
      return y;
   }

   public double  Distance(){
      return Math.sqrt(x * x + y * y);

   }
   public double  Distance(Point p){
      int xDiff = this.x - p.getX();
      int yDiff = this.y - p.getY();
      return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
   }
   public double Distance (int a, int b){
      int xDiff = this.x - a;
      int yDiff = this.y - b;
      return Math.sqrt(xDiff * xDiff + yDiff * yDiff);

   }
}
