/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test_arthurvalter.pkg0001;

/**
 *
 * @author Admin
 */
//declaaração de classe
public class Test_ArthurValter0001 {
     //Atributos
      String Name;
      String Curso;
     /** @param args the command line arguments
     */
    public static void main(String[] args) {
       Test_ArthurValter0001 Aluno = new Test_ArthurValter0001();
        Aluno.Name= "Rebeca";
        Aluno.Curso = "ADM";
         Test_ArthurValter0001 Aluno1 = Aluno;
        System.out.println(Aluno.Curso);
        System.out.println(Aluno.Name);
        Aluno1.Name = "Mateus";
        System.out.println(Aluno1.Name);
        // TODO code application logic here
    }
    
}
