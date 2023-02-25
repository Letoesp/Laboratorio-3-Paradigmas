import java.util.ArrayList;
import java.util.Scanner;

public class Pixhex_20424317_EspinozaOrtiz extends Pixel_20424317_EspinozaOrtiz {
    private String hex;

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    @Override
    public String toString() {
        return "Pixhex{" +
                "hex='" + hex + '\'' +
                '}';
    }

    public Pixhex_20424317_EspinozaOrtiz(int x, int y, String hex, int prof) {
        super(x, y, prof);
        this.hex= hex;
    }//funcion auxiliar que permite crear un pixhex
    public void crearpixhex(){
        Scanner valx= new Scanner(System.in);
        System.out.println("Inserte el valor de x");
        int x=valx.nextInt();
        setX(x);

        Scanner valy=new Scanner(System.in);
        System.out.println("Inserte el valor de y");
        int y=valy.nextInt();
        setY(y);

        Scanner val=new Scanner(System.in);
        System.out.println("Inserte el valor del pixhex");
        String hexa=val.nextLine();
        setHex(hexa);

        Scanner valprof=new Scanner(System.in);
        System.out.println("Inserte el valor de profundidad");
        int prof=valprof.nextInt();
        setProf(prof);



    }

    /**
     * funcion que permite crear un hexmap, utiliza la funcion auxiliar para crear los pixhex
     * @return
     */
    public static Imagen_20424317_EspinozaOrtiz crearHexmap() {

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
            System.out.println("pixhex");
            System.out.println(j);
            Pixhex_20424317_EspinozaOrtiz pixhex = new Pixhex_20424317_EspinozaOrtiz(0, 0, "hola", 0);
            pixhex.crearpixhex();
            pixeles.add(pixhex);
            System.out.println("el valor ingresado del pixbit es:");
            System.out.println(pixhex.getHex());
            j++;
        }
        Imagen_20424317_EspinozaOrtiz pixmap= new Imagen_20424317_EspinozaOrtiz(largo,ancho,pixeles);
        return pixmap;
    }


}