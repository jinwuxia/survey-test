package entity;

public class Pair {
    private String x;
    private String y;

    public Pair(String x, String y) {
        this.x = x;
        this.y = y;
    }
    public String getX() {
        return x;
    }

    public String getY() {
        return y;
    }

    public void setX(String x) {
        this.x = x;
    }

    public void setY(String y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        Pair newobj = (Pair) obj;
        if (newobj.getX().equals(this.x) && newobj.getY().equals(this.y)) {
            return true;
        }
        if (newobj.getY().equals(this.x) && newobj.getX().equals(this.y)) {
            return true;
        }
        return false;
    }
}
