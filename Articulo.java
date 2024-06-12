
/**
 * Write a description of class Articulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Articulo
{
   private String titulo;
   private String autor; 
   private String institucion;
   private String referenciaBibliograficas;
   
   public Articulo(String titulo,String autor,String institucion,String referenciaBibliograficas){
       this.titulo= titulo;
       this.autor = autor;
       this.institucion = institucion;
       this.referenciaBibliograficas = referenciaBibliograficas;
   }
   // get y setthers
   public String gettitulo(){
       return titulo;
   }
    public String getautor(){
       return autor;
   }
   public String getinstitucion(){
       return institucion;
   }
   public String getreferenciasBibliograficas(){
       return referenciaBibliograficas;
    }
    
    public void settitulo(String newtitulo){
        this. titulo = newtitulo;
    }
    public void setautor(String newautor){
        this. autor = newautor;
    }
    public void setinstitucion(String newinstitucion){
        this. institucion = newinstitucion;
    }
    public void setreferenciaBibliograficas(String newreferenciaBibliograficas){
        this. referenciaBibliograficas = newreferenciaBibliograficas;
    } 
    
    public void mostrar(){
        System.out.println ("");
    }
}
