public class Persona {
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas = 0;

    // Constructor vacio
    public Persona(){
        this.id = ++Persona.numeroPersonas;
    }

    // Constructor con argumentos
    public Persona(String nombre, String tel, String email){
        this();// Se llama el constructor vacio
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Daniel Campdelacreu", "623456476", "dani@gmail.con");
        System.out.println(persona1);
    }
}