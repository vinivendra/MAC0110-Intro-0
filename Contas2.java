class Contas2 {
  
  double calculaCubo (double x) {
    
   Contas calc1 = new Contas (); //c1 só é visível dentro desse método, não no Interactions, nem em outro método da mesma classe.
   return x * calc1.calculaQuadrado (x); //Não precisa por self
    
  }
  
}

/*
 Desde que a classe externa referenciada num documento esteja num arquivo na mesma pasta do documento,
 o programa percebe e compila normalmente, sem a necessidade de incluir, etc.
 
 Classe estática - classe que não precisa exatamente de um objeto, ela "é" o próprio objeto.
 É usada em casos como esse, em que não é snecessária mais de uma instância da classe.
 Btw, nós não estamos usando classes estáticas, e sim objetos comuns.
*/