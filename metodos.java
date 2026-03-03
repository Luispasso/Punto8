import java.util.Scanner;
public class metodos {

    public static void registro(datos[][] m)
    {
      Scanner sc = new Scanner(System.in);
      String c1, c2, c3, c4;
      int opc;
          System.out.println("INGRESE EL NOMBRE DE LA PRIMERA CATEGORIA");
          c1 = sc.next();
          System.out.println("INGRESE EL NOMBRE DE LA SEGUNDA CATEGORIA");
          c2 = sc.next();
          System.out.println("INGRESE EL NOMBRE DE LA TERCERA CATEGORIA");
          c3 = sc.next();
          System.out.println("INGRESE EL NOMBRE DE LA CUARTA CATEGORIA");
          c4 = sc.next();

          for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                datos o = new datos();
                System.out.println("INGRESE EL NOMBRE DEL SIGUIENTE PRODUCTO");
                o.setNombre(sc.next());
                System.out.println("INGRESE EL PESO");
                o.setPeso(sc.nextDouble());

                System.out.println("INGRESE LA CATEGORIA");
                System.out.println("1." + c1);
                System.out.println("2." + c2);
                System.out.println("3." + c3);
                System.out.println("4." + c4);
                opc = sc.nextInt();
                if(opc == 1)
                    o.setCategoria(c1);
                else if(opc == 2)
                    o.setCategoria(c2);
                else if(opc == 3)
                    o.setCategoria(c3);
                else if(opc == 4)
                    o.setCategoria(c4);

                m[i][j] = o;
            }
          }
          organizar(m, c1, c2, c3, c4);
    }

   public static void organizar(datos[][] m, String c1, String c2, String c3, String c4) {
        datos [] v1 = new datos[4];
        datos [] v2 = new datos[4];
        datos [] v3 = new datos[4];
        datos [] v4 = new datos[4];
        datos [][] s = new datos[4][4];
         int con1 = 0, con2 = 0, con3 = 0, con4 = 0;


        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                
                if(m[i][j].getCategoria().equalsIgnoreCase(c1))
                {
                    v1[con1] = m[i][j];
                    con1++;
                }
                else if(m[i][j].getCategoria().equalsIgnoreCase(c2))
                {
                    v2[con2] = m[i][j];
                    con2++;
                }
                else if(m[i][j].getCategoria().equalsIgnoreCase(c3))
                {
                    v3[con3] = m[i][j];
                    con3++;
                }
                else if(m[i][j].getCategoria().equalsIgnoreCase(c4))
                {
                    v4[con4] = m[i][j];
                    con4++;
                }
            }
        }
  
        

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                
                if(i == 0)
                    s[i][j] = v1[j];
                else if(i == 1)
                    s[i][j] = v2[j];
                else if(i == 2)
                    s[i][j] = v3[j];
                else
                    s[i][j] = v4[j];
            }
        }
      imprima(s);
    }



    public static void imprima(datos[][] s) {

        for (int i = 0; i < s.length; i++) {
            System.out.println("-----------------------------------");
            for (int j = 0; j < s.length; j++) {
                if(s[i][j] != null)
                System.out.println(s[i][j].getNombre() + " " + s[i][j].getPeso() + " " + s[i][j].getCategoria());
            }
        }
    }

}
