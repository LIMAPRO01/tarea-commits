primer commit

    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var montoTotalCompra = 1000;
        
        System.out.println("¿Cual es el monto de compra?: ");
        var montoCompra = Double.parseDouble(consola.nextLine());
        
        System.out.println("¿eres miembro de la tienda (true/false)? ");
        var miembroTienda = Boolean.parseBoolean(consola.nextLine());
        
        var descuento = 0.0;
segundo commit
        
        if (montoCompra >= montoTotalCompra && miembroTienda){
            descuento = 0.1;
            }
        else if(miembroTienda){
            descuento = 0.05;
        }
        else {
            descuento  = 0;
        }

