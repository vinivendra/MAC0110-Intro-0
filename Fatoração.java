class Fatoração {
  
  void imprimeFatoresPrimos (int x) {
    Primos p = new Primos ();
    int primo = p.proximoPrimo();
    
    while (x > 1) {
      if (x % primo == 0) {
        System.out.println (primo);
        x = x / primo;
      }
      else {
        primo = p.proximoPrimo();
      }
    }
  }
}
