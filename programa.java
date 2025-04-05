primer commit

    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var montoTotalCompra = 1000;
        
        System.out.println("¿Cual es el monto de compra?: ");
        var montoCompra = Double.parseDouble(consola.nextLine());
        
        System.out.println("¿eres miembro de la tienda (true/false)? ");
        var miembroTienda = Boolean.parseBoolean(consola.nextLine());
        
        var descuento = 0.0;

