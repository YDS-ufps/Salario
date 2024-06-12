
/**
 * Write a description of class docente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class docente
{
   //atributos
   private String nombre;
   private String codigo;
   private String correo;
   private String genero;
   
   //constructor
   public docente(String nombre,String codigo,String correo, String genero){
       this.nombre = nombre;
       this.codigo = codigo;
       this.correo = correo;
       this.genero = genero;
   }
   
   public String getnombre(){
       return nombre;
   }
   public String getcodigo(){
       return codigo;
   }
   public String getcorreo(){
       return correo;
   }
   public String getgenero(){
       return genero;
   }
   
   public void setnombre(String newnombre){
       this.nombre = newnombre;
   }
   public void setcodigo(String newcodigo){
       this.codigo = newcodigo;
   }
   public void setcorreo(String newcorreo){
       this.correo = newcorreo;
    }
    public void setgenero(String newgenero){
       this.genero = newgenero;
   }
   
   public void mostrar(){
       System. out. println("nombre");
   }
}

