import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int codMenuPpal = 0, codMenuTipico = 0, codMenuCarta = 0, codMenuInter = 0;
        int platosTipico = 0, platosCarta = 0, platosInter = 0;
        int platosTotal = 0;
        int precioTotal = 0, precio1 = 0, precio2 = 0;
        String nombre;

        do {
            String menu = "MENU RESTAURANTE\n\n";
            menu += "1. Plato Tipico\n";
            menu += "2. Plato a la Carta\n";
            menu += "3. Plato Internacional\n";
            menu += "4. Salir\n\n";
            menu += "Por favor seleccione una opcion\n";
            codMenuPpal = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (codMenuPpal) {
                case 1:
                    do {
                        String menuTipico = "MENU TIPICO\n\n";
                        menuTipico += "1. Frijoles\n";
                        menuTipico += "2. Sopa de Verduras\n";
                        menuTipico += "3. Regresar\n\n";
                        menuTipico += "4. Por favor selecciones una opción\n";
                        codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog(menuTipico));

                        switch (codMenuTipico) {
                            case 1:
                                precio1 = 12000;
                                JOptionPane.showMessageDialog(null, "se ha solicitado un plato de frijoles, el costo es de $" + precio1);
                                precioTotal += precio1;
                                platosTipico++;
                                break;
                            case 2:
                                precio2 = 8000;
                                JOptionPane.showMessageDialog(null, "se ha solicitado un plato de sopa de verduras, el costo es de $" + precio2);
                                precioTotal += precio2;
                                platosTipico++;
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Regresando al menu principal...");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a " + "un codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }

                        codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir el menu tipico, \n" +
                                " de lo contrario ingrese cualquier numero para regresar al menu principal "));

                        if (codMenuTipico != 1){
                            codMenuTipico = 3;
                        }
                    }while (codMenuTipico != 3);
                    break;
                case 2:
                    do {
                        String platoCarta = "MENU A la carta\n\n";
                        platoCarta += "1. carne asada\n";
                        platoCarta += "2. chuleta de cerdo\n";
                        platoCarta += "3. Regresar\n\n";
                        platoCarta += "4. Por favor selecciones una opción\n";
                        codMenuCarta = Integer.parseInt(JOptionPane.showInputDialog(platoCarta));

                        switch (codMenuCarta) {
                            case 1:
                                precio1 = 20000;
                                JOptionPane.showMessageDialog(null, "se ha solicitado un plato de carne asada, el costo es de $" + precio1);
                                precioTotal += precio1;
                                platosCarta++;
                                break;
                            case 2:
                                precio2 = 19000;
                                JOptionPane.showMessageDialog(null, "se ha solicitado un plato de chuleta de cerdo, el costo es de $" + precio2);
                                precioTotal += precio2;
                                platosCarta++;
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Regresando al menu principal...");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a " + "un codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }

                        codMenuCarta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir el menu a la carta, \n" +
                                " de lo contrario ingrese cualquier numero para regresar al menu principal "));

                        if (codMenuCarta != 1){
                            codMenuCarta = 3;
                        }
                    }while (codMenuCarta != 3);
                    break;

                case 3:
                    do {
                        String menuInter = "MENU INTERNACIONAL\n\n";
                        menuInter += "1. Ceviche\n";
                        menuInter += "2. Espagueti\n";
                        menuInter += "3. Regresar\n\n";
                        menuInter += "4. Por favor selecciones una opción\n";
                        codMenuInter = Integer.parseInt(JOptionPane.showInputDialog(menuInter));

                        switch (codMenuInter) {
                            case 1:
                                precio1 = 18000;
                                JOptionPane.showMessageDialog(null, "se ha solicitado un plato de ceviche, el costo es de $" + precio1);
                                precioTotal += precio1;
                                platosInter++;
                                break;
                            case 2:
                                precio2 = 15000;
                                JOptionPane.showMessageDialog(null, "se ha solicitado un plato de espagueti, el costo es de $" + precio2);
                                precioTotal += precio2 ;
                                platosInter++;
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Regresando al menu principal...");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a " + "un codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }

                        codMenuInter = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir el menu Internacional, \n" +
                                " de lo contrario ingrese cualquier numero para regresar al menu principal "));

                        if (codMenuInter != 1){
                            codMenuInter = 3;
                        }
                    }while (codMenuInter != 3);
                    break;
                case 4:
                    platosTotal += platosTipico + platosCarta + platosInter;
                    if (platosTotal != 0) {
                        JOptionPane.showMessageDialog(null, "imprimiendo factura...");
                        nombre = JOptionPane.showInputDialog(null, "ingrese su nombre");
                        JOptionPane.showMessageDialog(null, "Factura\n\n" +
                                "Nombre: " + nombre + "\n" +
                                "Platos Tipicos: " + platosTipico + "\n" +
                                "Platos a la Carta: " + platosCarta + "\n" +
                                "Platos Internacionales: " + platosInter + "\n" +
                                "total de los platos: " + platosTotal + "\n" +
                                "Precio Total: $" + precioTotal + "\n" +
                                "Gracias por su compra!");
                    }else {
                        JOptionPane.showMessageDialog(null, "vuelva pronto!");
                    }

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No corresponde a un " +
                            "codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        }while (codMenuPpal != 4);{
            JOptionPane.showMessageDialog(null, "No corresponde a un " +
                    "codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }
}
