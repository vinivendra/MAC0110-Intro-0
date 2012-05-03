class Matematica {
  
  double mediaDigitos (int n) {
    double soma = 0;
    int total = 0;
    while (n != 0){
      soma = soma + (n % 10);
      n = n/10;
      total = total + 1;
  }
    return soma/total;
  }
  
  int inversoDigitos (int n) {
    int soma = 0;
    while (n != 0){
      soma = (soma * 10) + (n % 10);
      n = n/10;
  }
    return soma;
  }
  
  void imprimeTabuada (int limite) {
    int i = 1;
    int j = 1;
    while (i <= limite) {
      j = 1;
      while (j <= limite) {
        System.out.print(i + "x" + j + " = " + (i*j) + ", ");
        if (j == limite) {
          System.out.println("");
        }
        j = j+1;
      }
      i = i + 1;
    }
  }
}