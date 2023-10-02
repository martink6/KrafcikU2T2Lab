public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int cord) {
        this.x = cord; this.y = cord;
    }

    public Point() {
        this.x = 0; this.y = 0;
    }

    public int getX() {
        return this.x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return this.y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public String coordinate() {
        return String.format("(%d, %d)", this.x, this.y);
    }

    public String quadrant() {
        //0,0 = origin
        //any,0 = on axis
        //pos,pos = I
        //neg,pos = II
        //neg,neg = III
        //pos,neg = IV


        if (this.x == 0 | this.y == 0) {
            return "on an axis";
        }
        if (this.x == 0 && this.y == 0) {
            return "I";
        }
        if (this.x > 0 && this.y > 0) {
            return "I";
        }
        if (this.x < 0 && this.y > 0) {
            return "II";
        }
        if (this.x < 0 && this.y < 0) {
            return "III";
        }
        if (this.x > 0 && this.y < 0) {
            return "IV";
        }
        return "error";
    }
}
