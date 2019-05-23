public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1,2,3,4);
        System.out.println(movablePoint.toString());
        movablePoint.move();

        System.out.println(movablePoint.toString());
    }
}
