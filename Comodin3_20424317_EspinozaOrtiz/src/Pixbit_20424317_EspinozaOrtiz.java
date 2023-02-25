import java.util.ArrayList;
import java.util.Scanner;

public class Pixbit_20424317_EspinozaOrtiz extends Pixel_20424317_EspinozaOrtiz {
    private int valor;

    public Pixbit_20424317_EspinozaOrtiz(int x, int y, int prof, int valor) {
        super(x, y, prof);
        this.valor = valor;
    }


    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    //funcion auxiliar que permite crear un pixbit
    public void crearpixbit() {
        Scanner valx = new Scanner(System.in);
        System.out.println("Inserte el valor de x");
        int x = valx.nextInt();
        setX(x);

        Scanner valy = new Scanner(System.in);
        System.out.println("Inserte el valor de y");
        int y = valy.nextInt();
        setY(y);

        Scanner val = new Scanner(System.in);
        System.out.println("Inserte el valor del pixbit");
        int valor = val.nextInt();
        setValor(valor);

        Scanner valprof = new Scanner(System.in);
        System.out.println("Inserte el valor de profundidad");
        int prof = valprof.nextInt();
        setProf(prof);


    }

    /**
     * funcion que permite crear un bitmap, utiliza una funcion auxiliar que permite crear pixbits.
     * @return
     */
    public static Imagen_20424317_EspinozaOrtiz crearBitmap() {

        Pixbit_20424317_EspinozaOrtiz pixel;
        ArrayList<Pixel_20424317_EspinozaOrtiz> pixeles = new ArrayList<>();

        System.out.println("Inserte el largo de la imagen");
        Scanner larg = new Scanner(System.in);
        int largo = larg.nextInt();
        Scanner anch = new Scanner(System.in);
        System.out.println("Inserte el ancho de la imagen");
        int ancho = anch.nextInt();

        int npix = ancho * largo;
        int j = 1;
        while (j <= npix) {
            System.out.println("pixbit");
            System.out.println(j);
            Pixbit_20424317_EspinozaOrtiz pixbit = new Pixbit_20424317_EspinozaOrtiz(0, 0, 0, 0);
            pixbit.crearpixbit();
            pixeles.add(pixbit);
            System.out.println("el valor ingresado del pixbit es:");
            System.out.println(pixbit.getValor());
            j++;
        }
        Imagen_20424317_EspinozaOrtiz bitmap= new Imagen_20424317_EspinozaOrtiz(largo,ancho,pixeles);
        return bitmap;
    }

    @Override
    public String toString() {

        return "Pixbit{" +
                "valor=" + valor +
                '}';
    }
}