class Box {
    private int length;

    public void setLength(int length) {
        this.length = length;
    }

    public void print(Box b) {
        System.out.println("Length: " + b.length);
    }

    public void show() {
        print(this);
    }
}

class Demo {
    public static void main(String[] args) {
        Box b = new Box();
        b.setLength(25);
        b.show();
    }
}
