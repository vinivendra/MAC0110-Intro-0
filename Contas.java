class Contas {
 
  double calculaQuadrado (double x) {
    
   return x*x; 
    
  }
  
  double calculaCubo (double x) {
    
   return x * calculaQuadrado (x); //Não precisa por self
    
  }
  
}