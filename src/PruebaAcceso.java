public class PruebaAcceso {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(555);
        //cuenta.saldo = 200;
        cuenta.depositar(400);
        cuenta.retirar(300);
        //cuenta.setAgencia(-22);
        //cuenta.saldo = cuenta.saldo - 300; // daria valores negativos de saldo
        //podemos evitar que den valores negativos de la siguiente manera
        //Encapsulamiento: private o public de los valores de las clases
        //vamos aa empezar a usar Getters

        //obetenemos el valor del saldo guardado en la variable y lo imprimimos
        //esta impresión esta usando un Getter en la clase Cuenta
        System.out.println(cuenta.getSaldo());
        System.out.println(cuenta.getAgencia());

        Cliente cliente = new Cliente();
        cliente.setNombre("Hugo");
        cliente.setDocumento("fdfdfdfdfdf");
        //vamos a referencias de un objeto cuenta a un objeto cliente los metodos
        cuenta.setTitular(cliente);
        //acá refrenciamos al mismo lugar de memoria e imnprimimos el mismo valor
        //todos referencian al new Cliente() creado arriba
        System.out.println(cliente.getNombre());
        System.out.println(cuenta.getTitular().getNombre());
    }
}
