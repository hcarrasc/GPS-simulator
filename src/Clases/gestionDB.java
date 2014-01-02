package Clases;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author hcarrasc
 */
public class gestionDB {
    
    int contador = 27;
    
    Punto ps = new Punto(); 
    
    public void poblarNodos(int id, int x, int y) throws ClassNotFoundException, SQLException{
        
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection( 
                "jdbc:postgresql://localhost:5432/proyectoGPS", "postgres","progressive"
                );
        
        if (con != null) {
            System.out.println("You made it, take control your database now!");
        }
        
        Statement stat = con.createStatement();
        //Resulset res = stat.executeQuery("INSERT INTO nodo VALUES (1,"+x+","+y+");");
        
        stat.executeUpdate("INSERT INTO nodo VALUES ("+id+","+x+","+y+");");
        con.close();
    }

    
    
    public void poblarCalles(arista a) throws ClassNotFoundException, SQLException{
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection( 
                "jdbc:postgresql://localhost:5432/proyectoGPS", "postgres","progressive"
                );
        if (con != null) {
            System.out.println("Accesado a DB.. iniciando consulta");
        }
        
        Statement stat = con.createStatement();
        stat.executeUpdate("INSERT INTO arista VALUES("
                +contador+","
                +a.idOrigen+","
                +a.idDestino+",'"
                +a.nombreCalle+"',"
                +a.sentido+","
                +a.distancia+","
                +a.velocidad+","
                +a.densidad+","
                +a.estacionamiento+","
                +a.comerciales+","
                +a.administrativo+","
                +a.ocio+","
                +a.peatonal+");");

        contador++;
        con.close();
    }
    
    public Punto GetPunto(Punto p) throws ClassNotFoundException, SQLException{
        
        boolean noEncontrado = true;
        Punto newp = new Punto();
        System.out.println(p.x+"-"+p.y);
        
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection( 
                "jdbc:postgresql://localhost:5432/proyectoGPS", "postgres","progressive"
                );
        
        if (con != null) {
            System.out.println("Accesado a DB.. iniciando consulta");
        }
        
        Statement stat = con.createStatement();
        ResultSet rs = stat.executeQuery(
              "SELECT n.idnodo, n.coordenadax, n.coordenaday "+
              "FROM nodo n, nodo n2 "+
              "WHERE "+
              "( "+
              "n.idnodo IN ("+
                            "SELECT idnodo "+
                            "FROM nodo "+
                            "WHERE  coordenadax = "+(p.x)+") "+
              "OR "+ 
              "n.idnodo IN ("+
                            "SELECT idnodo "+
                            "FROM nodo "+
                            "WHERE  coordenadax = "+(p.x-1)+") "+
              "OR "+
              "n.idnodo IN ("+
                            "SELECT idnodo "+
                            "FROM nodo "+
                            "WHERE  coordenadax = "+(p.x+1)+") "+ 
              "OR "+
              "n.idnodo IN ("+
                            "SELECT idnodo "+
                            "FROM nodo "+
                            "WHERE  coordenadax = "+(p.x+2)+") "+
              "OR "+
              "n.idnodo IN ("+
                            "SELECT idnodo "+
                            "FROM nodo "+
                            "WHERE  coordenadax = "+(p.x-2)+")) "+

            "AND "+
            "(n2.coordenaday = "+(p.y)+
                " OR n2.coordenaday = "+(p.y+1)+
                " OR n2.coordenaday = "+(p.y+2)+
                " OR n2.coordenaday = "+(p.y-2)+
                " OR n2.coordenaday = "+(p.y-1)+")"
          + " AND n.idnodo = n2.idnodo"
        );
   
        while(rs.next()){
                noEncontrado = false;
                newp.idpunto = rs.getInt(1);
                newp.x       = rs.getInt(2);
                newp.y       = rs.getInt(3);
                System.out.println("Punto real en DB:"+newp.idpunto+"-"+newp.x+"-"+newp.y);
        }
        if(noEncontrado){ newp.x = 0; newp.y = 0; }
        rs.close();
        
        return newp;
    }
    
    public ArrayList<Punto> GetAllPuntos() throws ClassNotFoundException, SQLException{
        
        ArrayList<Punto> puntos = new ArrayList();
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proyectoGPS", "postgres","progressive");
        Statement stat = con.createStatement();
        ResultSet rs = stat.executeQuery("SELECT * FROM nodo");
        int i=0;
        while(rs.next()){
            //System.out.println(rs.getInt(1)+"->"+rs.getInt(2)+"->"+rs.getInt(3));
            ps.idpunto = rs.getInt(1);
            ps.x       = rs.getInt(2);
            ps.y       = rs.getInt(3);
            puntos.add(ps);
            System.out.println(puntos.get(i).idpunto);
            i++;
        }
        return puntos;
    }
    
    
    
    
}


