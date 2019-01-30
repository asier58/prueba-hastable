package prueba;

import java.util.Enumeration;
import java.util.Hashtable;

public class froga {

	public static void main(String[] args) {
		String frase = "mi casa es azul y tambien es grande";
		Hashtable<String,Integer> contenedor=new Hashtable<String,Integer>();
		Object clave;
		

        String[] result = frase.split(" ");
        int contador;

        for(String s : result){
        	if (contenedor.containsKey(s)) {
        		contador=contenedor.get(s);
        		contador=contador+1;
        		contenedor.put(s, contador);
        		contador=0;
        		}
        	else {
        		contenedor.put(s,1);
        	}
            System.out.println(s);}
        System.out.println(contenedor);

        
        

        
        
        
        
	}

}
