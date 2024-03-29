import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RetanguloTeste {
    @Test

    public void TestandoCalcularArea() {

        Retangulo retangulo = new Retangulo(5,6);

        int resultado= retangulo.calcularArea();
        assertEquals(30,resultado);

        if ((resultado == retangulo.calcularArea())){
            System.out.println("Resultado esperado!");
        }

    }
    @Test
    public void TestandoCalcularPerimetro() {

        Retangulo retangulo = new Retangulo(5,6);

        int resultado= retangulo.calcularPerimetro();
        assertEquals(22,resultado);

        if ((resultado==retangulo.calcularPerimetro())){
            System.out.println("Resultado esperado!");
        }

    }
    @Test
    public void testVolume(){
        Retangulo retangulo = new Retangulo(5,6,10);

        int calcFormula = retangulo.calcVolume();
        assertEquals(300,calcFormula);

        if ((calcFormula == retangulo.calcVolume())){
            System.out.println("Volume esperado!");
        }
    }

    @Test
    public void volumePiramide(){
        piramide tri = new piramide(9,10);

        int calPiramide = tri.piramideVolume();
        assertEquals(30,calPiramide);

        if ((calPiramide == tri.piramideVolume())){
            System.out.println("Volume da piramide encontrado!");
        }
    }


}
