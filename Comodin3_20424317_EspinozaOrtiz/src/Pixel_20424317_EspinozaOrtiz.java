public class Pixel_20424317_EspinozaOrtiz {
    private int x;
    private int y;
    private int prof;

    public Pixel_20424317_EspinozaOrtiz(int x, int y, int prof) {
        //Attributes
        this.x = x;
        this.y = y;
        this.prof = prof;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getProf() {
        return prof;
    }

    public void setProf(int prof) {
        this.prof = prof;
    }


    @Override
    public String toString() {
        return "Pixel{" +
                "x=" + x +
                ", y=" + y +
                ", prof=" + prof +
                '}';
    }//funcion auxiliar que permite mover un pixel horizontalmente
    public void moverpixelH(int ancho){
        int newancho=ancho-1-this.y;
        setY(newancho);
    }
    //funcion auxiliar que permite mover un pixel verticalmente
    public void moverpixelV(int largo){
        int newlargo=largo-1-this.x;
        setX(newlargo);
    }
}