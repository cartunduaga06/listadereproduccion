public class Main {


    public static void main(String[] args) {
        //creamos el factory
        CancionFactory listaReproduccion =new CancionFactory();

        Cancion cancion = listaReproduccion.getCancion("Mis canciones favoritas");
        
        cancion.descripcion();
    }







}
