package duplicadas;


public class ArrrayDuplicadas {
	public static void main (String args[]){
		
		String[] array = {"abracadabra","allottee","assessee","keles","kenes","Alfalgo"};
		String[] result = new String[array.length];
		for (int i = 0; i < array.length; i++) {
		    String atual = array[i];
		    StringBuilder sb = new StringBuilder();
		    char anterior = 0;
		    for (int j = 0; j < atual.length(); j++) {
		        char c = atual.charAt(j);
		        if (c != anterior) {
		            sb.append(c);
		        }
		        anterior = c;
		    }
		    result[i] = sb.toString();
		    System.out.println(result[i]); 
  }	
 }
}


