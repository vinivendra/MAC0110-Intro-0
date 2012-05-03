class Circulo {
  
  double raio;
  
  void raio (double r){
    
    raio = r;
    
  }
  
  double calculaArea (){
    
    return 3.14159 * raio * raio;
    
  }
  
  double calculaPerimetro (){
    
    return 6.28318 * raio;
    
  }
  
}