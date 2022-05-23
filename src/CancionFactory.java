import java.util.HashMap;

public class CancionFactory {

    private static final HashMap<String, Cancion> cancionMap = new HashMap<>();

public Cancion getCancion(String listaReproduccion) {
        Cancion cancion = cancionMap.get(listaReproduccion);
        if(cancion==null){
            cancion =new Cancion(listaReproduccion);
            cancionMap.put(listaReproduccion, cancion);
            System.out.println("creando lista de reproduccion " + listaReproduccion);
            return  cancion;
        }

    System.out.println("Recuperando Objecto de lista de reproduccion: " + listaReproduccion);
    return cancion;



}


}
