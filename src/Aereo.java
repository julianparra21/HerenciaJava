
public class Aereo extends Principal{
  public Aereo() {
	  volar();
  }
  
  public void volar() {
	// TODO Auto-generated method stub
	System.out.println("EL vehiculo esta volando");
}

private String nombreAereo;
  public String getNombreAereo() {
	return nombreAereo;
}
public void setNombreAereo(String nombreAereo) {
	this.nombreAereo = nombreAereo;
}

}
