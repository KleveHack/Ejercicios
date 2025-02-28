/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4Ej1;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Estudiante {//Inicio class
    private String Name;
    private int Age;
    private double averageGrade;
    
    public Estudiante(String Name, int Age, double averageGrade){
        this.setname(Name);
        this.setage(Age);
        this.setAverageGrade(averageGrade);
                
    }
    
    public String getname(){
    return Name;
    }
    
    public void setname(String Name){
        if (Name != null && !Name.trim().isEmpty()) {//Inicio if
            this.Name = Name;
        }else{
            System.out.println("Error : The name can't be empty");
        }//Fin else
    }
    
    public int getage(){
    return Age;
    }
    
    public void setage(int Age){
        if (Age >=0) {//inicio if
            this.Age = Age;
        }else{
            System.out.println("Error : The Age must be positive number");
        }//fin else
    }
    
    public double getAverageGrade(){
        return averageGrade;
    }
    
    public void setAverageGrade(double averageGrade){
        if (averageGrade >= 0 && averageGrade <= 10) {
            this.averageGrade = averageGrade;
        } else {
            System.out.println("Error : The average grade must be to 0 between 10");
        }
    }
    
}//Fin class
/*
Ejercicio 1: Clase Estudiante
Crea una clase Estudiante con las propiedades nombre, edad y notaPromedio. Define:
Todas las propiedades deben ser privadas.---
Proporciona métodos get y set para cada propiedad, incluyendo validaciones en los métodos set.-
Crea una clase de prueba para crear instancias de Estudiante y acceder a las propiedades.
*/