package uva.tds.pr2.equipo05;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

=======
>>>>>>> 099b9154dd7fbb7ab76e21977741661f744dcf28
/**
 * Implementación de la clae parada
 * @author martorb
 * @author ismpere
 */
public class Parada{

	/**
	 * Constructor por defecto de la clase parada
	 * @param id Identificador de la parada
	 * @param gd Direccion de la parada
	 * @assert.pre id.length>0 && id.length<=50
	 * @assert.pre gd!=null
	 * @assert.pre id!=null
	 */
	public Parada(String id, GD gd) {
<<<<<<< HEAD
		assert(gd!=null);
		assert(id!=null);
		assert(id.length()>0 && id.length()<=50);
		
		this.id = id;
		this.gd = gd;
=======
		// TODO Auto-generated constructor stub
>>>>>>> 099b9154dd7fbb7ab76e21977741661f744dcf28
	}
	
	/**
	 * Devuelve identificador de la parada
	 * @return Id Identificador
	 */
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Devuelve la direccion de la parada
	 * @return gd direccion
	 */
	public GD getGD() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * Cambia el id de la parada
	 * @param id nuevo identificador
	 * @assert.pre id!=null && id.length>0 && id.length<=50
	 */
	public void setId(String id) {
<<<<<<< HEAD
		assert(id!=null && id.length()>0 && id.length()<=50);
		this.id = id;
=======
		// TODO Auto-generated method stub
		
>>>>>>> 099b9154dd7fbb7ab76e21977741661f744dcf28
	}
	/**
	 * Cambia la direccion de la parada
	 * @param gd Nueva direccion
	 * @assert.pre gd!=null
	 */
	public void setGD(GD gd) {
<<<<<<< HEAD
		assert(gd!=null);
		this.gd = gd;
=======
		// TODO Auto-generated method stub
		
>>>>>>> 099b9154dd7fbb7ab76e21977741661f744dcf28
	}
	/**
	 * Devuelve la distancia en metros entre dos paradas
	 * @param p Parada a la que calcular la distancia desde this
	 * @return distancia entre las paradas
<<<<<<< HEAD
	 * @assert.pre p!=null
	 */
	public double getDistanciaEntre(Parada p) {
		assert(p!=null);
		
		if(p==this || p.equals(this))
			return 0.0;
		
		return gd.getDistanciaAt(p.getGD());
=======
	 * @assert.pre !this.equals(p)
	 * @throws IllegalArgumentException si p==null
	 */
	public double getDistanciaEntre(Parada p) {
		// TODO Auto-generated method stub
		return 0.0;
>>>>>>> 099b9154dd7fbb7ab76e21977741661f744dcf28
	}
	/**
	 * Devuelve si hay paradas repetidas en una lista de paradas
	 * @param p lista de paradas
	 * @return hayParadasRepetidas
<<<<<<< HEAD
	 * @assert.pre p!=null
	 * @assert.pre p[] !contains null
	 */
	public static boolean existeAlgunaParadaRepetida(Parada[] p) {
		assert(p!=null);
		assert(!new ArrayList<Parada>(Arrays.asList(p)).contains(null));
		
		if(p.length<2)
			return false;
		else{
			boolean repetida = false;
			ArrayList<Parada> conjuntoAux = new ArrayList<>();
			
			for(int i=0; i<p.length; i++){
				if(conjuntoAux.contains(p[i])){
					repetida = true;
					break;
				}
				else
					conjuntoAux.add(p[i]);
			}
			return repetida;
		}
	}
	
	@Override
	/**
	 * @see 
	 */
	public boolean equals(Object other){
	    if (other == null) 
	    	return false;
	    if (other == this) 
	    	return true;
	    if (!(other instanceof Parada))
	    	return false;
	    
	    return gd.equals(((Parada)other).getGD());
	}
	
	/**
	 * @see
	 */
	@Override
    public int hashCode() {
        return Objects.hash(id,gd);
    }
=======
	 * @throws IllegalArgumentException si alguna de las paradas es null
	 */
	public static boolean existeAlgunaParadaRepetida(Parada[] p) {
		// TODO Auto-generated method stub
		return false;
	}
	
>>>>>>> 099b9154dd7fbb7ab76e21977741661f744dcf28
}