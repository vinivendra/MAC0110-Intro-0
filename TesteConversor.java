class TesteConversor {
  
  void teste() {
    
    Conversor aConversor = new Conversor ();
    if (aConversor.celsiusParaFahrenheit(40) == 104) {
      
      System.out.println("Teste funcionou para 104");
      
    }
    else {
      
      System.out.println("Teste não funcionou para 104, deu " + aConversor.celsiusParaFahrenheit(40));
      
    }
    
  }
  
}