package eventos.modelo.beans;

import java.io.Serializable;
import java.util.Objects;

public class Tipo implements Serializable {
	
	
				//PROPIEDADES
				private static final long serialVersionUID = 1L;
				private int idTipo;
				private String nombre;
				private String descripcion;
			
				
//------------------------------------------------------------------------------------------>				
				
				
				//CONSTRUCTOR CON PARAMETROS
				public Tipo(int idTipo, String nombre, String descripcion) {
					super();
					this.idTipo = idTipo;
					this.nombre = nombre;
					this.descripcion = descripcion;
				}


				//CONSTRUCTOR SIN PARAMETROS
				public Tipo() {
					super();
				}

								
//------------------------------------------------------------------------------------------>

				
				//MÉTODOS SETTER Y GETTER
				public int getIdTipo() {
					return idTipo;
				}
				public void setIdTipo(int idTipo) {
					this.idTipo = idTipo;
				}


				public String getNombre() {
					return nombre;
				}
				public void setNombre(String nombre) {
					this.nombre = nombre;
				}


				public String getDescripcion() {
					return descripcion;
				}
				public void setDescripcion(String descripcion) {
					this.descripcion = descripcion;
				}
	
				
//------------------------------------------------------------------------------------------>
				
				
				//MÉTODOS HASH_CODE Y EQUAL
				@Override
				public int hashCode() {
					return Objects.hash(idTipo);
				}


				@Override
				public boolean equals(Object obj) {
					if (this == obj)
						return true;
					if (!(obj instanceof Tipo))
						return false;
					Tipo other = (Tipo) obj;
					return idTipo == other.idTipo;
				}
				
				
//------------------------------------------------------------------------------------------>
				
				
				//MÉTODO TO_STRING IMPRIME DATOS
				@Override
				public String toString() {
					return "Tipo [idTipo=" + idTipo + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
				}
}
