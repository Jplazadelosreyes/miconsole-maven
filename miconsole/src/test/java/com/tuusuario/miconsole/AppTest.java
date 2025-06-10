package com.tuusuario.miconsole;

import org.junit.Test;
import static org.junit.Assert.*;

import com.google.gson.Gson;
import org.apache.commons.lang3.StringUtils;

public class AppTest 
{
    @Test
    public void testTrimText()
    {
        String texto = "   hola mundo   ";
        String resultado = StringUtils.trim(texto);
        assertEquals("hola mundo", resultado);
    }

    @Test
    public void testPersonaJson()
    {
        Persona persona = new Persona("Prueba", 25);
        String json = new Gson().toJson(persona);
        assertTrue(json.contains("Prueba"));
        assertTrue(json.contains("25"));
    }
}