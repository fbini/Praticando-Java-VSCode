package data;

import java.time.LocalDate;

public class javaTime {
    public static void main(String[] args) {

        /* -- LocalDate - para trabalhar com data
         * -- LocalTime - para trabalhar somente com hora
         * -- LocalDateTime - para trabalhar com data e hora completas
         * 
         * -- of() - que recebe o ano, mês e dia, ou, no caso de hora, a hora e o minuto
         * -- parse() - que recebe uma string no formato ISO e a converte
         * -- now() - que retorna o momento exato atual, seja a data, o horário ou ambos
         * 
         */


         LocalDate dataCompra = LocalDate.now();
         LocalDate dataPrimeiraparecela = LocalDate.of(2025, 5, 10);

        
    }    
}
