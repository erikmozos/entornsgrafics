package Institut;

public class Professor extends Persona {

    String assignaturaDonada;

    public Professor() {
    }

    public Professor(String nom, String dni, int edat, String assignaturaDonada) {
        super(nom, dni, edat);
        this.assignaturaDonada = assignaturaDonada;
    }

    public String getNom() {
        return nom;
    }

    public String getDni() {
        return dni;
    }

    public int getEdat() {
        return edat;
    }

    public String getAssignaturaDonada() {
        return assignaturaDonada;
    }

    public void mostrarDades() {
        System.out.println("Soc " + nom + ", el meu dni és " + dni + " i soc professor de " + assignaturaDonada + " amb " + edat + " anys.");
    }
}
