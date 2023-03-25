public class Cuenta {
    //encapsulamos la variable saldo
   private double saldo;//
    // la ponemos privada para que otra clase no me modifique el valor y lo lleve a negativo
    private int agencia;
    private int numero;
   private Cliente titular;

   //vamos a contar cuantas cuentas se van creando con uin variable estatica
    private static int total = 1;

   //Creamos sun objeto llamado el constructor que nos permite
    //manipular el objeto creado por fuera de esta clase desde su
    //nacimiento, para asi evitar errores de inicializacion en 0 por defecto
    // usamos el constructor para obligar a crear una cuenta con un número
    //que se válido y no cometer errores de numeros negativos o cero.
    //esto para estos casos es más efectivo que un get y set
    public Cuenta(int agencia){
        if (agencia <= 0) {
            System.out.println("no se permite cero");
            this.agencia = 1;
        } else {
            this.agencia = agencia;// le decimos que el valor sea agencia
        }
        System.out.println("Se van creando : " + total + " cuentas");
        total++;
    }
    public void depositar(double valor) {
        this.saldo += valor;
    }
    public boolean retirar (double valor) {
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, Cuenta cuenta) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            cuenta.depositar(valor);
            return true;
        }else {
            return false;
        }
    }

    //Getter para obetener el saldo
    public double getSaldo() {
        return this.saldo;
    }

    //vamos a usar metodos Set y get para agencia
//comentamos el metodo sett de agencia porque ya creamos un constructor para ello
 //asi solo se puede manipular al momento de la creacion del objeto en si
    //a traves del constructor
    //   public void setAgencia(int agencia) {
  //      if (agencia > 0) {
   //         this.agencia = agencia;
     //   }else {
       //     System.out.println("No permitido valores negativos");
        //}
    //}
    public int getAgencia() {
        return agencia;
    }
    //asignatos setter y getter para el objeto cliente

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    //asi aseguramos que no se pueda manipular el total facilente
    //asi tenemos la posibilidad de manipularla a traves de un metodo
    public static int getTotal() {
        return total;
    }
}
