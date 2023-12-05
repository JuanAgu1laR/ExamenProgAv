package com.mycompany.examenprogav;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
        
public class Calculadora extends JFrame{
    JLabel A;
    JLabel B;
    JLabel C;
    JTextField cuadroA;
    JTextField cuadroB;
    JTextField cuadroC;
    JButton calcular;
    JButton limpiar;
    JLabel creditos;
    
    public Calculadora() {
    this.initComponents();
    }
    
    private void initComponents(){
    setVisible(false);
    
    setLayout(new FlowLayout());
    setSize(400,200);
    setTitle("Calculadora");
    
    A = new JLabel("A");
    B = new JLabel("B");
    C = new JLabel("C");
    cuadroA = new JTextField();
    cuadroB = new JTextField();
    cuadroC = new JTextField();
    calcular = new JButton("Calcular");
    limpiar = new JButton("Limpiar");
    creditos = new JLabel("Práctica hecha por Juan David Aguilar Tejeida");
    
    A.setPreferredSize(new Dimension(10,30));
    cuadroA.setPreferredSize(new Dimension(100,30));
    B.setPreferredSize(new Dimension(10,30));
    cuadroB.setPreferredSize(new Dimension(100,30));
    C.setPreferredSize(new Dimension(10,30));
    cuadroC.setPreferredSize(new Dimension(100,30));
    calcular.setPreferredSize(new Dimension(100,40));
    limpiar.setPreferredSize(new Dimension(100,40));
    creditos.setPreferredSize(new Dimension(270,40));
    
    add(A);
    add(cuadroA);
    add(B);
    add(cuadroB);
    add(C);
    add(cuadroC);
    add(calcular);
    add(limpiar);
    add(creditos);
    
    setVisible(false); 
        setLayout(new FlowLayout()); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(380,170);
        setTitle("Calculadora");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true); 
    }
    
    public static void main(String[] args){
    
      Calculadora hola = new Calculadora();
      
    }
}
