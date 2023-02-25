
import java.util.ArrayList;
import java.util.Scanner;

public class Pixrgb_20424317_EspinozaOrtiz extends Pixel_20424317_EspinozaOrtiz {
    private int red;
    private int green;
    private int blue;
    public Pixrgb_20424317_EspinozaOrtiz(int x, int y, int red, int green, int blue, int prof) {
        super(x, y, prof);
        this.red=red;
        this.green=green;
        this.blue=blue;
    }
    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }//funcion que permite crear pixrgb
    public void crearpixrgb(){
        Scanner valx= new Scanner(System.in);
        System.out.println("Inserte el valor de x");
        int x=valx.nextInt();
        setX(x);

        Scanner valy=new Scanner(System.in);
        System.out.println("Inserte el valor de y");
        int y=valy.nextInt();
        setY(y);

        Scanner re=new Scanner(System.in);
        System.out.println("Inserte el valor del Red");
        int rojo=re.nextInt();
        setRed(rojo);

        Scanner gree=new Scanner(System.in);
        System.out.println("Inserte el valor del Green");
        int verde=gree.nextInt();
        setGreen(verde);

        Scanner blu=new Scanner(System.in);
        System.out.println("Inserte el valor del Blue");
        int azul=blu.nextInt();
        setBlue(azul);

        Scanner valprof=new Scanner(System.in);
        System.out.println("Inserte el valor de profundidad");
        int prof=valprof.nextInt();
        setProf(prof);



    }

    @Override
    public String toString() {
        return "Pixrgb{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }

    /**
     * funcion que permite crear pixmap, utiliza la funcion de crear pixrgb
     * @return
     */
    public static Imagen_20424317_EspinozaOrtiz crearPixmap() {

        Pixbit_20424317_EspinozaOrtiz pixel;
        ArrayList<Pixel_20424317_EspinozaOrtiz> pixeles = new ArrayList<>();


        Scanner larg = new Scanner(System.in);
        System.out.println("Inserte el largo de la imagen");
        int largo = larg.nextInt();
        Scanner anch = new Scanner(System.in);
        System.out.println("Inserte el ancho de la imagen");
        int ancho = anch.nextInt();

        int npix = ancho * largo;
        int j = 1;
        while (j <= npix) {
            System.out.println("pixrgb");
            System.out.println(j);
            Pixrgb_20424317_EspinozaOrtiz pixrgb= new Pixrgb_20424317_EspinozaOrtiz(0,0,0,0,0,0);
            pixrgb.crearpixrgb();
            pixeles.add(pixrgb);
            System.out.println("el valor ingresado del Red es:");
            System.out.println(pixrgb.getRed());
            System.out.println("el valor ingresado del Green es:");
            System.out.println(pixrgb.getGreen());
            System.out.println("el valor ingresado del Blue es:");
            System.out.println(pixrgb.getBlue());
            j++;
        }
        Imagen_20424317_EspinozaOrtiz pixmap= new Imagen_20424317_EspinozaOrtiz(largo,ancho,pixeles);
        return pixmap;
    }
}
