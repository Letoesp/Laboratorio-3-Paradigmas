import java.util.ArrayList;
import java.util.Scanner;


/**
 * TDAimagen que posee un largo, ancho y contiene un array de pixeles.
 */
public class Imagen_20424317_EspinozaOrtiz {
    private int largo;
    private int ancho;
    private ArrayList<Pixel_20424317_EspinozaOrtiz> pixeles;

    public Imagen_20424317_EspinozaOrtiz(int largo, int ancho, ArrayList<Pixel_20424317_EspinozaOrtiz> pixeles) {
        this.largo = largo;
        this.ancho = ancho;
        this.pixeles = pixeles;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public ArrayList<Pixel_20424317_EspinozaOrtiz> getPixeles() {
        return pixeles;
    }

    public void setPixeles(ArrayList<Pixel_20424317_EspinozaOrtiz> pixeles) {
        this.pixeles = pixeles;
    }
    /**
     * Función crear imagen, que crea imagenes a pedido del usuario.
     * la imagen creada se guarda en el array general de imagenes.
     */
    public static Imagen_20424317_EspinozaOrtiz crearimagen() {

        int opcion;
        Scanner input = new Scanner(System.in);
        System.out.println("Has seleccionado crear una imagen");
        System.out.println("Ingresar pixeles de la imagen a crear de Izquierda a Derecha desde la esquina superior Izquierda de la representación  ");
        System.out.println("EJEMPLO:");
        System.out.println("PIXEL1 PIXEL2");
        System.out.println("PIXEL3 PIXEL4");
        System.out.println("Escribe una de las opciones:");
        System.out.println("1. Crear bitmap");
        System.out.println("2. Crear pixmap");
        System.out.println("3. Crear hexmap");
        System.out.println("4. Volver");

        ArrayList<Pixel_20424317_EspinozaOrtiz> pixeles = new ArrayList<>();
        Imagen_20424317_EspinozaOrtiz imagen = new Imagen_20424317_EspinozaOrtiz(0, 0, pixeles);
        opcion = input.nextInt();

        if (opcion == 1) {
            imagen = Pixbit_20424317_EspinozaOrtiz.crearBitmap();
        }
        if (opcion == 2) {
            imagen = Pixrgb_20424317_EspinozaOrtiz.crearPixmap();
        }
        if (opcion == 3) {
            imagen = Pixhex_20424317_EspinozaOrtiz.crearHexmap();
        }
        System.out.println("imagen creada con éxito");
        System.out.println(imagen.toString());
        return imagen;
    }


    @Override
    public String toString() {
        return "Imagen{" +
                "largo=" + largo +
                ", ancho=" + ancho +
                ", pixeles=" + pixeles +
                '}';
    }

    /**
     * funcion que permite verificar si una imagen es bitmap
     * @param imagen
     * @return
     */
    public static boolean isBitmap(Imagen_20424317_EspinozaOrtiz imagen) {
        ArrayList<Pixel_20424317_EspinozaOrtiz> pixeles = imagen.getPixeles();
        String tipo = pixeles.get(0).toString();
        if (tipo.contains("Pixbit")) {
            System.out.println("La imagen ingresada es Bitmap");
            return true;
        } else {
            System.out.println("La imagen ingresada no es Bitmap");
            return false;
        }
    }

    /**
     * funcion que permite verificar si una imagen es pixmap
     * @param imagen
     * @return
     */
    public static boolean isPixmap(Imagen_20424317_EspinozaOrtiz imagen) {
        ArrayList<Pixel_20424317_EspinozaOrtiz> pixeles = imagen.getPixeles();
        String tipo = pixeles.get(0).toString();
        if (tipo.contains("Pixrgb")) {
            System.out.println("La imagen ingresada es Pixmap");
            return true;
        } else {
            System.out.println("La imagen ingresada no es Pixmap");
            return false;
        }
    }

    /**
     * funcion que permite verificar si una imagen es hexmap
     * @param imagen
     * @return
     */
    public static boolean isHexmap(Imagen_20424317_EspinozaOrtiz imagen) {
        ArrayList<Pixel_20424317_EspinozaOrtiz> pixeles = imagen.getPixeles();
        String tipo = pixeles.get(0).toString();
        if (tipo.contains("Pixhex")) {
            System.out.println("La imagen ingresada es Hexmap");
            return true;
        } else {
            System.out.println("La imagen ingresada no es Hexmap");
            return false;
        }
    }

    /**
     * función que permite invertir una imagen horizontalmente.
     *
     * @param imagen
     * @return
     */
    private static Imagen_20424317_EspinozaOrtiz FlipH(Imagen_20424317_EspinozaOrtiz imagen) {
        ArrayList<Pixel_20424317_EspinozaOrtiz> pixeles = imagen.getPixeles();
        int anch = imagen.getAncho();
        for (int i = 0; i < pixeles.size(); i++) {
            for (int j = 1; j <= imagen.getLargo(); j++) {
                for (int k = imagen.getAncho(); k >= 1; k--) {
                    if (j == imagen.getPixeles().get(i).getY() && k == imagen.getPixeles().get(i).getX()) {
                        pixeles.get(i).getY();
                        System.out.println("Pixel"+i);
                        System.out.print("(");
                        System.out.print(pixeles.get(i).getX());
                        System.out.print(",");
                        System.out.print(pixeles.get(i).getY());
                        System.out.println(")");
                        pixeles.get(i).moverpixelH(anch);
                        System.out.println("Coordenada Y Actualizada:");
                        System.out.print("(");
                        System.out.print(pixeles.get(i).getX());
                        System.out.print(",");
                        System.out.print(pixeles.get(i).getY());
                        System.out.println(")");

                    }
                }
            }
        }

        System.out.println("\n");


        return imagen;
    }    /**
     * función que permite invertir una imagen verticalmente.
     *
     * @param imagen
     * @return
     */
    private static Imagen_20424317_EspinozaOrtiz FlipV(Imagen_20424317_EspinozaOrtiz imagen) {
        ArrayList<Pixel_20424317_EspinozaOrtiz> pixeles = imagen.getPixeles();
        int larg = imagen.getLargo();
        for (int i = 0; i < pixeles.size(); i++) {
            for (int j = 1; j <= imagen.getLargo(); j++) {
                for (int k = imagen.getAncho(); k >= 1; k--) {
                    if (j == imagen.getPixeles().get(i).getY() && k == imagen.getPixeles().get(i).getX()) {
                        pixeles.get(i).getX();
                        System.out.println("Pixel"+i);
                        System.out.print("(");
                        System.out.print(pixeles.get(i).getX());
                        System.out.print(",");
                        System.out.print(pixeles.get(i).getY());
                        System.out.println(")");
                        pixeles.get(i).moverpixelV(larg);
                        System.out.println("Coordenada X Actualizada:");
                        System.out.print("(");
                        System.out.print(pixeles.get(i).getX());
                        System.out.print(",");
                        System.out.print(pixeles.get(i).getY());
                        System.out.println(")");

                    }
                }
            }
        }

        System.out.println("\n");


        return imagen;
    }

    /**
     * funcion que permite cortar una imagen a partir de cuadrantes seleccionados.
     * @param imagen
     * @return
     */
    private static Imagen_20424317_EspinozaOrtiz Crop(Imagen_20424317_EspinozaOrtiz imagen) {
        ArrayList<Pixel_20424317_EspinozaOrtiz> pixeles = imagen.getPixeles();
        ArrayList <Pixel_20424317_EspinozaOrtiz> pixeles1 = new ArrayList<>();
        Pixel_20424317_EspinozaOrtiz aux;
        Scanner input = new Scanner(System.in);
        int x1;
        int y1;
        int x2;
        int y2;
        int opcion = 0;
        System.out.println("Escoja los cuadrantes minimos para cortar la imagen");
        System.out.println("x1: ");
        x1 = input.nextInt();
        System.out.println("y1: ");
        y1 = input.nextInt();
        System.out.println("Escoja los cuadrantes maximos para cortar la imagen");
        System.out.print("x2: ");
        x2 = input.nextInt();
        System.out.print("y2: ");
        y2 = input.nextInt();
        int newancho = y2-y1 + 1;
        int newlargo = x2-x1 + 1;
        for(int i = 0; i < pixeles.size(); i++){
            aux = pixeles.get(i);
            if(aux.getX() >= x1 && aux.getY() >= y1){
                if(aux.getX() <= x2 && aux.getY() <= y2){
                    pixeles1.add(aux);
                }
            }

        }
        imagen = new Imagen_20424317_EspinozaOrtiz(newancho, newlargo, pixeles1);
        System.out.println(imagen.toString());

        return imagen;
    }

    /**
     * funcion que permite seleccionar que modificacion hacer a una imagen.
     * @param imagenes
     * @param elementos
     */
    public static void ModImagen(Imagen_20424317_EspinozaOrtiz[] imagenes, int elementos) {
        Scanner opcion = new Scanner(System.in);
        int numero;
        System.out.println("Presione el numero de la imagen a modificar:");
        for (int i = 0; i < elementos; i++){
            System.out.println(i + "-->" + imagenes[i]);
        }
        numero = opcion.nextInt();
        System.out.println("Has seleccionado la imagen " + numero );
        System.out.println(" Elija una opcion");
        imagenes[numero] = ElegirMod(imagenes[numero]);

    }

    private static Imagen_20424317_EspinozaOrtiz ElegirMod(Imagen_20424317_EspinozaOrtiz imagen) {
        Scanner read = new Scanner(System.in);
        System.out.println("1 FlipH");
        System.out.println("2 FlipV");
        System.out.println("3 Crop");
        int opcion = 0;
        opcion = read.nextInt();
        if(opcion == 1) {
            imagen = FlipH(imagen);
        }
        if(opcion == 2){
            imagen = FlipV(imagen);
        }
        if(opcion == 3){
            imagen = Crop(imagen);
        }

        return imagen;
    }
}