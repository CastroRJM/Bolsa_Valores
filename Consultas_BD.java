/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_Bolsa;
import clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JOptionPane;
 
public class Consultas_BD {
  private String tabla;
  private int id;
  private String atributo2;
  private boolean encontrado=false;


    public Consultas_BD() {
    }

    public Consultas_BD(String tabla, int id, String atributo2) {
        this.tabla = tabla;
        this.id = id;
        this.atributo2 = atributo2;
    }

    public Consultas_BD(String tabla, int id) {
        this.tabla = tabla;
        this.id = id;
    }

    public Consultas_BD(String tabla) {
        this.tabla = tabla;
    }

    

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public String getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(String atributo2) {
        this.atributo2 = atributo2;
    }
  
   public void Insertar(){
       try{
         Connection cn = Conexion.conectar();
         PreparedStatement pst = cn.prepareStatement("Insert into "+tabla+" values(?,?)");
         
         pst.setInt(1,id);
         pst.setString(2, atributo2);
         
         pst.executeUpdate();
         
         cn.close();
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"Mal Conectado");
       }
   }
   
   public String Buscar(String campo_id){
       String nacion="";
       try{
           Connection cn = Conexion.conectar();
           PreparedStatement pst = cn.prepareStatement("Select * from "+tabla+" where "+campo_id+"='"+id+"'");
           ResultSet rs = pst.executeQuery();
           
           if(rs.next()){
                nacion = rs.getString(2);
           }else{
               JOptionPane.showMessageDialog(null,"No existe");
               nacion = "";
           }
       }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Mal Conectado");
       }
       return nacion;
   }
   
   public void Modificar(String campo_id_descripcion, String campo_id){
       try{
           Connection cn = Conexion.conectar();
           PreparedStatement pst = cn.prepareStatement("Update "+tabla+" set "+campo_id_descripcion+"=? where "+campo_id+"='"+id+"'");
           pst.setString(1,atributo2);
           pst.executeUpdate();
           cn.close();
           
           JOptionPane.showMessageDialog(null,"Actualizacion Lograda");
           
           
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"Mal Conectado");
       }
   }
   
   public void Eliminar(String campo_id){
       try{
           Connection cn = Conexion.conectar();
           PreparedStatement pst2 = cn.prepareStatement("Delete from "+tabla+" where "+campo_id+"='"+id+"'");
           JOptionPane.showMessageDialog(null,"Eliminacion Exitosa");
           pst2.executeUpdate();
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"Mal Conectado");
    }
   }
    public Persona_Bolsa Buscar_Bolsa(int id_bolsa,Persona_Bolsa p1){
        try{
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("Select * from bolsa where id_bolsa='"+id_bolsa+"'");
            ResultSet rs= pst.executeQuery();
            if(rs.next()){
                 int bolsa = rs.getInt("id_empleado");
                 String nombre = rs.getString("nombre");
                 String apellido_p = rs.getString("apellido_p");
                 String apellido_m= rs.getString("apellido_m");
                 String sexo = rs.getString("sexo");
                 String fecha_n = rs.getString("fecha_nacimiento");
                 String direccion = rs.getString("direccion");
                 String telefono = rs.getString("telefono");
                 String fecha_ingreso = rs.getString("fecha_ingreso");
                 int nac = rs.getInt("id_nac");
                 int perfil = rs.getInt("id_perfil");
                 int esc = rs.getInt("id_esc");
                 int exp = rs.getInt("id_exp");
                 String curp = rs.getString("curp");
                 String estatus= rs.getString("estatus");
                 String observa = rs.getString("observaciones");
                 
               
                p1 = new Persona_Bolsa(bolsa,nombre,apellido_p,apellido_m,sexo,fecha_n,direccion,telefono,fecha_ingreso,nac,perfil,esc,exp,curp,estatus,observa);
                
            }
           
        }catch(SQLException ex){
            
        }
        return p1;
    }
    
   
   public void Agregar_Bolsa(int id_bolsa,String name,String apellidoP,String apellidoM,String sexo,String fecha_n,String direccion,
      String telefono,String fecha_i,int id_nac,int id_perfil,int id_esc,int id_exp, String curp, String estatus, String observaciones){
      try{
          Connection cn = Conexion.conectar();
          PreparedStatement pst = cn.prepareStatement("Insert into bolsa values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
          
          pst.setInt(1, id_bolsa);
          pst.setString(2, name);
          pst.setString(3, apellidoP);
          pst.setString(4, apellidoM);
          pst.setString(5, sexo);
          pst.setString(6, fecha_n);
          pst.setString(7, direccion);
          pst.setString(8, telefono);
          pst.setString(9, fecha_i);
          pst.setInt(10,id_nac);
          pst.setInt(11, id_perfil);
          pst.setInt(12, id_esc);
          pst.setInt(13, id_exp);
          pst.setString(14, curp);
          pst.setString(15, estatus);
          pst.setString(16, observaciones);
          
          pst.executeUpdate();
          cn.close();
          
          JOptionPane.showMessageDialog(null,"La persona "+name+" ha sido agregada a la bolsa");
          
      }catch(SQLException ex){
         JOptionPane.showMessageDialog(null,"Mal Conectado"); 
      }
   }
   
   public void Insertar_Muerto_Bolsa(String nombre,String apellido_p,String apellido_m,int id_bolsa,String razon){
       try{
           Connection cn= Conexion.conectar();
           PreparedStatement pst = cn.prepareStatement("Insert into muerto values(?,?,?,?,?,?)");
           pst.setInt(1, 0);
           pst.setString(2, nombre);
           pst.setString(3, apellido_p);
           pst.setString(4, apellido_m);
           pst.setInt(5, id_bolsa);
           pst.setString(6, razon);
           
           JOptionPane.showMessageDialog(null,nombre+" agregado a muerto");
           
           pst.executeUpdate();
           cn.close();
       }catch(SQLException ex){
           
       }
   }
   public void Eliminar_Bolsa(int id_bolsa){
       try{
           Connection cn =Conexion.conectar();
           PreparedStatement pst = cn.prepareStatement("Delete from bolsa where id_empleado='"+id_bolsa+"'");
      
          pst.executeUpdate();
          cn.close();
          
       }catch(SQLException ex){
          JOptionPane.showMessageDialog(null,"Mal Conectado");
       }
   }
   
   public void agregar_Empleado(int id_empleado,int id_bolsa,int horario,int id_puesto, int depto,String estatus,String observaciones,int seguro,String fecha,int horas){
     try{
         Connection cn = Conexion.conectar();
         PreparedStatement pst = cn.prepareStatement("Insert into empleado values(?,?,?,?,?,?,?,?,?,?)");
         pst.setInt(1, id_empleado);
         pst.setInt(2, id_bolsa);
         pst.setInt(3, horario);
         pst.setInt(4, id_puesto);
         pst.setInt(5, depto);
         pst.setString(6, estatus);
         pst.setString(7, observaciones);
         pst.setInt(8, seguro);
         pst.setString(9, fecha);
         pst.setInt(10, horas);
         
         pst.executeUpdate();
         cn.close();
         JOptionPane.showMessageDialog(null,"El empleado ha sido agregado");
     }catch(SQLException ex){
         JOptionPane.showMessageDialog(null,"Mal Conectado"); 
     }
   }
   
   public void Modificar_Documentos(int id_bolsa,int id_doc,int id_doc2){
       try{
           Connection cn = Conexion.conectar();
           PreparedStatement pst = cn.prepareStatement("Update bolsa_documentos set id_doc=? where id_bolsa='"+id_bolsa+"' and id_doc='"+id_doc2+"'");
           pst.setInt(1, id_doc);
           pst.executeUpdate();
           cn.close();
       }catch(SQLException ex){
           
       }
   }
   
     public void Modificar_Cursos(int id_empleado,int id_curso,int id_curso2){
       try{
           Connection cn = Conexion.conectar();
           PreparedStatement pst = cn.prepareStatement("Update curso_empleado set id_curso=? where id_empleado='"+id_empleado+"' and id_curso='"+id_curso2+"'");
           pst.setInt(1, id_curso);
           pst.executeUpdate();
           cn.close();
       }catch(SQLException ex){
           
       }
   }
   
   public boolean Encontrar_Empleados(int id_bolsa){
       boolean buscar=false;
       try{
           Connection cn = Conexion.conectar();
           PreparedStatement pst =cn.prepareStatement("Select * from empleado where id_bolsa='"+id_bolsa+"'");
           ResultSet rs = pst.executeQuery();
           if(rs.next()){
               buscar = true;
           }
           
       }catch(SQLException ex){
           
       }
       return buscar;
   }
   public boolean Encontrar_Muertos(String nombre,String apellidoP,String apellidoM){
      
       try{
           Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("Select * from muerto where nombre='"+nombre+"'"
                    + " and apellido_p='"+apellidoP+"' and apellido_m='"+apellidoM+"'");
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
              JOptionPane.showMessageDialog(null,"Ya no se puede agregar esa persona, porque esta en muerto","ERROR",JOptionPane.ERROR_MESSAGE);
              encontrado = true;
            }
       }catch(SQLException ex){
              JOptionPane.showMessageDialog(null,"Mal Conectado");
       }
      return encontrado;
   }
   
   public void Agregar_Bolsa_Documento(String table,int id_bolsa,ArrayList<Integer>documentos){
      try{
          
            Connection cn =Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("Insert into "+table+" values (?,?)");
            Set<Integer> hashSet = new HashSet<Integer>(documentos);
            documentos.clear();
            documentos.addAll(hashSet);
            for(Integer cadena:documentos){
                 pst.setInt(1, id_bolsa);
              pst.setInt(2, cadena);
              pst.executeUpdate(); 
           
            } 
          cn.close();
      }catch(SQLException ex){
          JOptionPane.showMessageDialog(null,"Mal Conectado"); 
      }
   }

   public boolean EncontrarRepeteciones_ID(String campo_id){
       try{
           Connection cn = Conexion.conectar();
           PreparedStatement pst = cn.prepareStatement("Select * from "+tabla+" where "+campo_id+" ='"+id+"'");
           ResultSet rs = pst.executeQuery();
           if(rs.next()){
               encontrado = true;
           }else{
               encontrado = false;
           }
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"Mal Conectado");
       }
       return encontrado;
   }
    
   
   public boolean EncontrarRepeteciones(String campo_id,String campo_id_descripcion){
       try{
           Connection cn = Conexion.conectar();
           PreparedStatement pst = cn.prepareStatement("Select * from "+tabla+" where "+campo_id+" ='"+id+"' or "+campo_id_descripcion+" ='"+atributo2+"'");
           ResultSet rs = pst.executeQuery();
           if(rs.next()){
               encontrado = true;
           }else{
               encontrado = false;
           }
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"Mal Conectado");
       }
       return encontrado;
   }
   
 public boolean Encontrar_IMSS(String campo_descripcion,int atributo3){
      try{
        Connection cn = Conexion.conectar();
        PreparedStatement pst = cn.prepareStatement("Select * from "+tabla+" where "+campo_descripcion+" ='"+atributo3+"'");
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            encontrado =true;
        }else{
            encontrado =false;
        }
    }catch(SQLException ex){
        
    } 
  return encontrado;
 }
 
 
  
}
