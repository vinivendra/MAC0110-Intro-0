class Prisma {
  
  double n=0;
  double l=0;
  double h=0;
  double area=0;
  double volume=0;

  //setTamanhoENumeroDeLados
  //calcula área da base
  //calcula volume
  
  void setTamanhoENumeroDeLados (double l, double n, double h) {
    
    if (l <= 0) System.out.println ("O tamanho dos lados tem que ser maior que 0");
    if (n <= 0) System.out.println ("O numero de lados tem que ser maior do que 0");
    if (h <= 0) System.out.println ("A altura tem que ser maior do que 0");
    
    this.l = l;
    this.n = n;
    this.h = h;
    
  }
  
  
  
  void calculaAreaDaBase () {
    
  double angulo = (3.1415926*2/n);
  double cosseno = Math.cos(angulo);
  double seno = Math.sin(angulo);
  double resultado1 = ((l*l) / (2-2*cosseno));
  double a = Math.sqrt (resultado1);
  area = (a * a * seno * n / 2);
  System.out.println ("A área da base vale " + area);
    
  }
  
  void calculaVolumeDoPrisma () {
    
    if (area==0) calculaAreaDaBase();
    volume = area * h;
    System.out.println ("O volume do prisma vale " + volume);
    
  }
  
  
  
}