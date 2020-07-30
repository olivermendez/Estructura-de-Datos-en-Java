/** 
* Curso de Fundamentos de Java
* @version 1.01 Julio 30
* @autor Oliver Mendez
*/ 

class Welcome
{
    public static void main (String args[]) {
        String saludo = "Hola Mundo!";
        System.out.println(saludo);

        //Tipos de enteros

        int num1 = 30; // –2,147,483,648 a 2,147,483,647 (Poco mas de 2mil millones)
        short num2 = 30000; // -32,768 a 32,767
        long num3 = 1000; // –9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
        byte num4 = 100; // –128 a 127

        //Tipos de punto flotante

        float num5 = 3.14F; // Aproximadamente ± 3.40282347E + 38F (6–7 dígitos decimales significativos).
        double num6 = 3.14D; //Aproximadamente ± 1.79769313486231570E + 308 (15 dígitos decimales significativos)
        

        //Secuencias de escape para caracteres especiales
        System.out.println(" Retroceso: \b");
        System.out.println(" Lengueta: \t");
        System.out.println(" Linea de alimentacion: \n");
        System.out.println(" Retorno de carro: \r");
        System.out.println(" Cita doble: \"");
        System.out.println(" Una frase: \'");
        System.out.println(" Barra invertia: \\");
        

    }

}




