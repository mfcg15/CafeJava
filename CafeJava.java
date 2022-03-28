import java.util.ArrayList; // import the ArrayList class

public class CafeJava {
    public static void main(String[] args) {
        // VARIABLES DE LA APP
        // Líneas de texto que aparecerán en la app 
        String saludoGeneral = "Bienvenido al Café Java, ";
        String mensajePendiente = ", tu pedido estará listo en breve.";
        String mensajeListo = ", tu pedido está listo.";
        String mensajeMostrarTotal = "Tu total es $ ";
        String mensajes[] = {saludoGeneral,mensajePendiente,mensajeListo,mensajeMostrarTotal};
        
        // Variables de menú (agrega las tuyas a continuación)
        float precioMocha = 3.5f;
        float precioCafeFiltro = 4.5f;
        float precioCafeLeche = 2.5f;
        float precioCapuchino = 2.8f;

        ArrayList<Float> totalPedido1 = new ArrayList<Float>();
        totalPedido1.add(precioMocha);

        ArrayList<Float> totalPedido2 = new ArrayList<Float>();
        totalPedido2.add(precioCapuchino);

        ArrayList<Float> totalPedido3 = new ArrayList<Float>();
        totalPedido3.add(precioCafeLeche);
        totalPedido3.add(precioCafeLeche);

        ArrayList<Float> totalPedido4 = new ArrayList<Float>();
        totalPedido4.add(precioCafeFiltro);
        totalPedido4.add(precioCafeLeche);
        
        // Variables de nombre de cliente (agrega las tuyas a continuación)
        String cliente1 = "Cindhuri";
        String cliente2 = "Sam";
        String cliente3 = "Jimmy";
        String cliente4 = "Noah";
    
        // Finalizaciones de pedidos (agrega las tuyas a continuación)
        boolean estaListoOrden1 = false;
        boolean estaListoOrden2 = false;
        boolean estaListoOrden3 = false;
        boolean estaListoOrden4 = false;


        pedido(estaListoOrden1,cliente1,mensajes,totalPedido1);
        pedido(estaListoOrden2,cliente2,mensajes,totalPedido2);
        pedido(estaListoOrden3,cliente3,mensajes,totalPedido3);
        pedido(estaListoOrden4,cliente4,mensajes,totalPedido4);
    }

    public static void pedido (boolean estado, String cliente, String mensajes[], ArrayList<Float> precios)
    {
        float total = 0;

        if(estado == true)
        {
            System.out.println(mensajes[0] + cliente + mensajes[2]); 
            if(precios.size()>1)
            {
                
                for(int i = 0 ; i < precios.size();i++)
                {
                    total += precios.get(i);
                }

                System.out.println(mensajes[3]+total);
            }
            else
            {
                System.out.println(mensajes[3]+precios.get(0));
            }
        }
        else
        {
            System.out.println(mensajes[0] + cliente+mensajes[1]);
        }
    }
}