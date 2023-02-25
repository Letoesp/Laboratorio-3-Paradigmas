import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * En el main se  tiene un menú desplegable con todos los métodos y un ejemplo de mapa integrado
         * en memoria.
         * Se crea una imagen a modo de ejemplo y se ingresa al array de imagenes.
         * Se tiene un contador que ayuda a visualizar la cantidad de elementos del array de imagenes.
         */

        Imagen_20424317_EspinozaOrtiz[] imagenes = new Imagen_20424317_EspinozaOrtiz[5];
        int elementos=1;

        ArrayList<Pixel_20424317_EspinozaOrtiz> ejemplo = new ArrayList<>();
        Pixbit_20424317_EspinozaOrtiz pixbit0 = new Pixbit_20424317_EspinozaOrtiz(1, 2, 3, 3);
        ejemplo.add(pixbit0);
        Pixbit_20424317_EspinozaOrtiz pixbit1 = new Pixbit_20424317_EspinozaOrtiz(2, 2, 3, 4);
        ejemplo.add(pixbit1);
        Pixbit_20424317_EspinozaOrtiz pixbit2 = new Pixbit_20424317_EspinozaOrtiz(1, 1, 3, 5);
        ejemplo.add(pixbit2);
        Pixbit_20424317_EspinozaOrtiz pixbit3 = new Pixbit_20424317_EspinozaOrtiz(2, 1, 3, 2);
        ejemplo.add(pixbit3);


        Imagen_20424317_EspinozaOrtiz ejemp = new Imagen_20424317_EspinozaOrtiz(2, 2, ejemplo);
        imagenes[0]=ejemp;


        Imagen_20424317_EspinozaOrtiz.isBitmap(ejemp);
        Imagen_20424317_EspinozaOrtiz.isPixmap(ejemp);
        Imagen_20424317_EspinozaOrtiz.isHexmap(ejemp);
/**
 * a modo de ejemplo, se aplica las funciones de pertenencia en la imagen de ejemplo.
 *
 * A continuación se presenta el menú, que incluye un manipulador de imagenes.
 */






        //Interface
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        do {
            System.out.println("////Manipulador de imagenes////");
            System.out.println("Seleccione su opción");
            System.out.println("1. Crear una imagen");
            System.out.println("2. Modificar una imagen");
            System.out.println("3. Visualizar imagenes");
            System.out.println("4. Salir");
            System.out.println("Escribe una de las opciones:");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1:


                    imagenes[elementos]= Imagen_20424317_EspinozaOrtiz.crearimagen();
                    imagenes.toString();
                    elementos=elementos+1;

                    break;
                case 2:
                    System.out.println("Has seleccionado modificar una imagen");
                    Imagen_20424317_EspinozaOrtiz.ModImagen(imagenes, elementos);


                    break;
                case 3:
                    System.out.println("Has seleccionado visualizar las imagenes");
                    for(int i=0;i<elementos;i++)
                        System.out.println(imagenes[i].toString());
                    //SeleccionarImagen(imagenes, cantidad);



                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }
        }
        while (!salir);
    }
}