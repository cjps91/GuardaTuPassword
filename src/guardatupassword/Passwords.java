package guardatupassword;
// Generated 13 jun. 2019 21:33:11 by Hibernate Tools 4.3.1



/**
 * Passwords generated by hbm2java
 */
public class Passwords  implements java.io.Serializable {


     private int id;
     private String servicio;
     private String pass;

    public Passwords() {
    }

    public Passwords(int id, String servicio, String pass) {
       this.id = id;
       this.servicio = servicio;
       this.pass = pass;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getServicio() {
        return this.servicio;
    }
    
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
    public String getPass() {
        return this.pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }




}


