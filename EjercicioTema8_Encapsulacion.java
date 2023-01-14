public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(19);
        persona.setNombre("Joaquín");
        persona.setNumeroDeTelefono(351654321);

        System.out.println("La edad de persona es: " + persona.getEdad());
        System.out.println("Su nombre es: " + persona.getNombre());
        System.out.println("Su número de teléfono es: " + persona.getNumeroDeTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int NumeroDeTelefono;

    public void setEdad (int edad) {
        this.edad = edad;
    }

    public int getEdad () {
        return edad;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getNombre (){
        return nombre;
    }
    public void setNumeroDeTelefono (int numeroDeTelefono){
        this.NumeroDeTelefono = numeroDeTelefono;
    }
    public int getNumeroDeTelefono (){
        return NumeroDeTelefono;
    }

}