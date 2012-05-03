class Baskara {
  
  double a, b, c = 0;
  double delta = 0;
  
  void setValues (double a, double b, double c) {
    
    if (a==0) System.out.print("Ô lesado, Baskara é só pra equações de segundo grau. Faz direito!");
    
    else {
      this.a = a;
      this.b = b;
      this.c = c;
    
      this.delta = (b*b)-(4*a*c);
    }
    
  }

    
  void numeroDeRaizesReais () {
    
    if (delta < 0) {
      
      System.out.println ("Não existem raízes reais, apenas imaginárias.");
      
    }
    
    else if (delta > 0) {
      
      double x1 = 0;
      double x2 = 0;
      
      double raizDelta = java.lang.Math.sqrt(delta);
      
      x1 = (( -1 * b) + raizDelta) / 2 * a;
      x2 = (( -1 * b) - raizDelta) / 2 * a;
        
      System.out.println ("Uma raíz vale " + x1 + ", a outra vale " + x2);
        
    }
    
    else {
      
      double x = 0;
      
      x = ((-b) / (2 * a));
      
      System.out.println ("Ambas as raízes valem " + x);
      
    }
    
  }
    
  void numeroDeRaizesImaginarias () {
    
    if (delta >= 0) {
      
      System.out.println ("Não existem raízes imaginárias, apenas reais");
      
    }
    
    else {
      
      double imag = java.lang.Math.sqrt(-1 * delta) / (2*a);
      double real = (-b)/(2*a);
      
        System.out.println ("Uma raiz vale " + real + " + " + imag + "i, a outra vale " + real + " - " + imag + "i" );
      
    }
    
  }
  
}