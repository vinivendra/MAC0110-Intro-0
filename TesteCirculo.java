class TesteCirculo {
  
  void testePontual (){
    
    double raio1 = 1.2;
    double raio2 = 10;
    double raio3 = 1004.5;
    
    Circulo.circ = new Circulo();
    circ.raio(raio1);
    if (circ.calculaArea() == 3.14159 * raio1 * raio1) System.out.println ("A Area funciona para " + raio1);
    else System.out.printl("A Area nao funciona para " + raio1);
    if (circ.calculaPerimetro() == 3.14159 * 2 * raio1) System.out.println ("O perimetro funciona para " + raio1);
    else System.out.printl("O perimetro nao funciona para " + raio1);
    
    circ.raio(raio2);
    if (circ.calculaArea() == 3.14159 * raio2* raio2) System.out.println ("A Area funciona para " + raio2);
    else System.out.printl("A Area nao funciona para " + raio2);
    if (circ.calculaPerimetro() == 3.14159 * 2 * raio2) System.out.println ("O perimetro funciona para " + raio2);
    else System.out.printl("O perimetro nao funciona para " + raio2);
    
    circ.raio(raio3);
    if (circ.calculaArea() == 3.14159 * raio3 * raio3) System.out.println ("A Area funciona para " + raio3);
    else System.out.printl("A Area nao funciona para " + raio3);
    if (circ.calculaPerimetro() == 3.14159 * 2 * raio3) System.out.println ("O perimetro funciona para " + raio3);
    else System.out.printl("O perimetro nao funciona para " + raio3);
    
  }
  
}