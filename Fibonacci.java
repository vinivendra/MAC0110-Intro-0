class Fibonacci {
  
  // Os dois métodos são, basicamente, equivalentes; o que muda é o modo de se chegar ao (mesmo) resultado.
  // O primeiro usa recursão, o segundo usa o "while"; o segundo é mais eficiente.
  
  int f (int n) {
    if (n==0){
      return 0;
    }
    else if (n==1){
      return 1;
    }
    else {
      return (f(n-1)+f(n-2));
    }
  }
  
  void imprimeFibonacci (int quant){
    int fm2 = -1;
    int fm1 = -2;
    int f = 0;
    
    while (quant > 0){
      f = fm2 + fm1;
      System.out.println(f);
      fm2 = fm1;
      fm1 = f;
      quant --; // é a mesma coisa que "quant = quant - 1;".
    }
  }
  
}