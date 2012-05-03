class Primos {
  
  int limiteInferior = 0;
  
  void limiteInferior (int l) {
    limiteInferior = l;
  }
  
  boolean ePrimo (int x) {
    if (x < 2) {
      return false;
    }
    else {
      int divisores = 1;
      int candidato = 2;
      while (candidato < x && divisores == 1) {
        if (x % candidato == 0) {
          divisores = divisores + 1;
        }
        candidato = candidato + 1;
      }
      return divisores == 1;//É bool; se divisores for igual a 1, return true; else if divisores > 1, return false.
    }
  }
  
  int proximoPrimo() {
    limiteInferior = limiteInferior + 1;
    while (!ePrimo(limiteInferior)) {
      limiteInferior = limiteInferior + 1;
    }
    return limiteInferior;
  }
  
}