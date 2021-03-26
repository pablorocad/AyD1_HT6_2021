package Proceso;

import Objetos.Carrera;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

public class PabloAndresRocaDominguezUedi {

    @InjectMocks
    private AsignarHorario asignarHorario;

    @Mock
    private RegistroAcademico registroAcademico;

    @Mock
    private Carrera carrera;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void codHorarioTest(){

        when(registroAcademico.cheequearCarnet()).thenReturn(true);

        try {
            when(carrera.procesarCarrera()).thenReturn(4);
        } catch (Exception e) {
            e.printStackTrace();
        }

        when(registroAcademico.getAnio()).thenReturn(1997);

        try {

            Horario horario = asignarHorario.generarHorario(carrera, registroAcademico);
            assertEquals("nocturno", horario.getDescripcion());

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Test
    public void descHorarioTest() {
        when(registroAcademico.cheequearCarnet()).thenReturn(true);

        try {

            when(carrera.procesarCarrera()).thenReturn(4);

        } catch (Exception e) {
            e.printStackTrace();
        }

        when(registroAcademico.getAnio()).thenReturn(1997);

        try {

            Horario horario = asignarHorario.generarHorario(carrera, registroAcademico);
            assertEquals("nocturno", horario.getDescripcion());

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}