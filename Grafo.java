import java.util.*;

public class Grafo {
	
	private Map<String, ArrayList<String>> listaAdyacencia;

    public Grafo() {
        listaAdyacencia = new HashMap<>();
    }

    public void agregarVertice(String vertice) {
        listaAdyacencia.put(vertice, new ArrayList<>());
    }

    public void agregarArista(String vertice1, String vertice2) {
        listaAdyacencia.get(vertice1).add(vertice2);
        listaAdyacencia.get(vertice2).add(vertice1);
    }

    public void calcularGradosVertices() {
        System.out.println("Secuencia de grados de los vertices del grafo: ");
        for (String vertice : listaAdyacencia.keySet()) {
            System.out.println(vertice + ": " + listaAdyacencia.get(vertice).size());
        }
    }

    public void mostrarListaAdyacencia() {
        System.out.println("\nLista de adyacencia del grafo:");
        for (String vertice : listaAdyacencia.keySet()) {
            System.out.println(vertice + " = " + listaAdyacencia.get(vertice));
        }
    }
	
	public static void main(String[] args) {
		
		 Grafo grafo = new Grafo();
	       
	        String[] vertices = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
	        for (String vertice : vertices) {
	            grafo.agregarVertice(vertice);
	        }
	        
	        String[][] aristas = {
	            {"A", "B"}, {"A", "C"}, {"B", "D"}, {"B", "E"}, {"C", "F"}, 
	            {"C", "G"}, {"D", "E"}, {"D", "H"}, {"E", "I"}, {"F", "G"},
	            {"G", "H"}, {"H", "I"}, {"I", "F"}
	        };

	        for (String[] arista : aristas) {
	            grafo.agregarArista(arista[0], arista[1]);
	        }
	        
	        grafo.calcularGradosVertices();
	        grafo.mostrarListaAdyacencia();
	}

}
