class Trigonometria {
  
  double ep = 1e-3;
  
  void ep (double eps) {
    ep = eps;
  }

  double sen (double x) {
    double termo = x;
    double seno =x;
    int k = 0;
    
    while ((termo * termo) > (ep * ep)) { //Elevamos ao quadrado ambos os lados para não precisqar do módulo (a>b => a²>b²).
      
      k = k + 1;
      
      termo = -(termo * (x*x) / ((2*k+1) * (2*k)));
      
      seno = seno + termo;
      
    }
    return seno;
  }
}