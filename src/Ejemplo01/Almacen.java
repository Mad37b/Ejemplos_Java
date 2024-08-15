package Ejemplo01;

public class Almacen {
	// aqui se guarda , carga y descarga la mercancia 
	
private int cantidadInventario = 0;	
int medidas;
String tamaño;
String [] tipoMedidas = {"centimetros","metros"};
String [] lugares = {"luca","albacete","Froilan","Uerta"};


/** Getters y setters **/
public int getMedidas() {
	return medidas;
}
public void setMedidas(int medidas) {
	this.medidas = medidas;
}
public String getTamaño() {
	return tamaño;
}
public void setTamaño(String tamaño) {
	this.tamaño = tamaño;
}

}
