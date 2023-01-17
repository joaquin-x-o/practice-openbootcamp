public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setNombre("Elvis");
        cliente.setEdad(25);
        cliente.setTelefono(387654321);
        cliente.setCredito((float) 46.8);

        System.out.println("El nombre del cliente es: " + cliente.getNombre());
        System.out.println("Su edad es: " + cliente.getEdad());
        System.out.println("Su teléfono es: " + cliente.getTelefono());
        System.out.println("Su crédito es de: " + cliente.getCredito());

        System.out.println("-------------------------------------------------");

    Trabajador trabajador = new Trabajador();

        trabajador.setNombre("Michael");
        trabajador.setEdad(29);
        trabajador.setTelefono(387123654);
        trabajador.setSalario(1200);

        System.out.println("El nombre del trabajador es: " + trabajador.getNombre());
        System.out.println("Su edad es: " + trabajador.getEdad());
        System.out.println("Su teléfono es: " + trabajador.getTelefono());
        System.out.println("Su salario es de: $" + trabajador.getSalario());
    }
}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }
}

class Cliente extends Persona {
    private float credito;

    public void setCredito(float credito) {
        this.credito = credito;
    }
    public float getCredito() {
        return this.credito;
    }
}

class Trabajador extends Persona{
   private float salario;

   public void setSalario(float salario){
       this.salario = salario;
   }
   public float getSalario(){

       return this.salario;
   }

}
