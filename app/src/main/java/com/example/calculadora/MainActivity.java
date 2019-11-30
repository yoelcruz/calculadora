package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText pantalla;   //Variable a la que se la da valor cuando introducimos datos en la pantalla por el resultado de una operacion
    public double operando1, operando2, resultado;
    int idOperacion;  //identificador para cada operacion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pantalla =(EditText)findViewById(R.id.caja);  //aquí indicamos que la variable pantalla va a almacenar lo que recoja el editText c
    }                                                   //con un id de caja

    public void button1 (View v){
        String captura = pantalla.getText().toString(); //se guarda lo que recoja pantalla en forma de texto
        captura = captura +"1";
        pantalla.setText(captura);                       //se añade el valor de captura en la variable pantalla
    }

    public void button2 (View v){
        String captura = pantalla.getText().toString();
        captura = captura +"2";
        pantalla.setText(captura);
    }

    public void button3 (View v){
        String captura = pantalla.getText().toString();
        captura = captura +"3";
        pantalla.setText(captura);
    }

    public void button4 (View v){
        String captura = pantalla.getText().toString();
        captura = captura +"4";
        pantalla.setText(captura);
    }

    public void button5 (View v){
        String captura = pantalla.getText().toString();
        captura = captura +"5";
        pantalla.setText(captura);
    }

    public void button6 (View v){
        String captura = pantalla.getText().toString();
        captura = captura +"6";
        pantalla.setText(captura);
    }

    public void button7 (View v){
        String captura = pantalla.getText().toString();
        captura = captura +"7";
        pantalla.setText(captura);
    }

    public void button8 (View v){
        String captura = pantalla.getText().toString();
        captura = captura +"8";
        pantalla.setText(captura);
    }

    public void button9 (View v){
        String captura = pantalla.getText().toString();
        captura = captura +"9";
        pantalla.setText(captura);
    }

    public void button0 (View v){
        String captura = pantalla.getText().toString();
        captura = captura +"0";
        pantalla.setText(captura);
    }

    public void buttonPunto (View v){
        String captura = pantalla.getText().toString();
        captura = captura +".";
        pantalla.setText(captura);
    }

//    public void buttonParentesis (View v){
//        String captura = pantalla.getText().toString();
//        pantalla.setText("("+captura+")");
//    }

    public void buttonSumar (View v){
        try{                            //para hacer robusto el sistema, por si por error presionamos el boton si añadir operando antes
            String aux1 =pantalla.getText().toString();  //variable que donde se guarda el texto que recoja la variable pantalla
            operando1 = Double.parseDouble(aux1);  //Convertimos el tipo string en double para guardar el valor de aux1 en operando1
        }catch (NumberFormatException nfe){}

        pantalla.setText("");  //limpiamos la pantalla para que al presionar el boton de la operacion podamos ingresar el siguiente operador
        idOperacion=1;  //para indicar que la operacion 1 es la suma
    }

    public void buttonRestar (View v){
        try{                            //para hacer robusto el sistema, por si por error presionamos el boton si añadir operando antes
            String aux1 =pantalla.getText().toString();  //variable que donde se guarda el texto que recoja la variable pantalla
            operando1 = Double.parseDouble(aux1);  //Convertimos el tipo string en double para guardar el valor de aux1 en operando1
        }catch (NumberFormatException nfe){}

        pantalla.setText("");  //limpiamos la pantalla para que al presionar el boton de la operacion podamos ingresar el siguiente operador
        idOperacion=2;  //para indicar que la operacion 2 es restar
    }

    public void buttonMultiplicar (View v){
        try{                            //para hacer robusto el sistema, por si por error presionamos el boton si añadir operando antes
            String aux1 =pantalla.getText().toString();  //variable que donde se guarda el texto que recoja la variable pantalla
            operando1 = Double.parseDouble(aux1);  //Convertimos el tipo string en double para guardar el valor de aux1 en operando1
        }catch (NumberFormatException nfe){}

        pantalla.setText("");  //limpiamos la pantalla para que al presionar el boton de la operacion podamos ingresar el siguiente operador
        idOperacion=3;  //para indicar que la operacion 3 es multiplicar
    }

    public void buttonDividir (View v){
        try{                            //para hacer robusto el sistema, por si por error presionamos el boton si añadir operando antes
            String aux1 =pantalla.getText().toString();  //variable que donde se guarda el texto que recoja la variable pantalla
            operando1 = Double.parseDouble(aux1);  //Convertimos el tipo string en double para guardar el valor de aux1 en operando1
        }catch (NumberFormatException nfe){}

        pantalla.setText("");  //limpiamos la pantalla para que al presionar el boton de la operacion podamos ingresar el siguiente operador
        idOperacion=4;  //para indicar que la operacion 4 es dividir
    }

    public void buttonSeno (View v){
        try{                            //para hacer robusto el sistema, por si por error presionamos el boton si añadir operando antes
            String aux1 =pantalla.getText().toString();  //variable que donde se guarda el texto que recoja la variable pantalla
            operando1 = Double.parseDouble(aux1);  //Convertimos el tipo string en double para guardar el valor de aux1 en operando1
        }catch (NumberFormatException nfe){}

        pantalla.setText("sin("+operando1+")");  //Añadimos el simbolo de la operacion al presionar el boton
        idOperacion=5;  //para indicar que la operacion 5 es el seno
    }

    public void buttonCoseno (View v){
        try{                            //para hacer robusto el sistema, por si por error presionamos el boton si añadir operando antes
            String aux1 =pantalla.getText().toString();  //variable que donde se guarda el texto que recoja la variable pantalla
            operando1 = Double.parseDouble(aux1);  //Convertimos el tipo string en double para guardar el valor de aux1 en operando1
        }catch (NumberFormatException nfe){}

        pantalla.setText("cos("+operando1+")");  //Añadimos el simbolo de la operacion al presionar el boton
        idOperacion=6;  //para indicar que la operacion 6 es el coseno
    }

    public void buttonTangente (View v){
        try{                            //para hacer robusto el sistema, por si por error presionamos el boton si añadir operando antes
            String aux1 =pantalla.getText().toString();  //variable que donde se guarda el texto que recoja la variable pantalla
            operando1 = Double.parseDouble(aux1);  //Convertimos el tipo string en double para guardar el valor de aux1 en operando1
        }catch (NumberFormatException nfe){}

        pantalla.setText("tan("+operando1+")");  //Añadimos el simbolo de la operacion al presionar el boton
        idOperacion=7;  //para indicar que la operacion 7 es la tangente
    }

    public void buttonIgual (View v){
        try{                            //para hacer robusto el sistema, ya que algunas operaciones solo se hacen con un numero
            String aux2 =pantalla.getText().toString();  //variable que donde se guarda el texto que recoja la variable pantalla
            operando2 = Double.parseDouble(aux2);  //Convertimos el tipo string en double para guardar el valor de aux2 en operando1
        }catch (NumberFormatException nfe){}
        pantalla.setText("");

        if (idOperacion == 1){
            resultado = operando1 + operando2;
        }

        else if (idOperacion == 2){
            resultado = operando1 - operando2;
        }

        else if (idOperacion == 3){
            resultado = operando1 * operando2;
        }

        else if (idOperacion == 4) {
            if (operando2 == 0) {
                pantalla.setText("Error");
            } else {
                resultado = operando1 / operando2;
            }
        }

        else if (idOperacion == 5) {
            double rad = Math.toRadians(operando1);
            resultado = (Math.sin(rad));
        }

        else if (idOperacion == 6) {
            double rad = Math.toRadians(operando1);
            resultado = (Math.cos(rad));
        }

        else if (idOperacion == 7) {
            double rad = Math.toRadians(operando1);
            resultado = (Math.tan(rad));
        }

        pantalla.setText(""+resultado);
        operando1 = resultado;
    }

    public void buttonClear (View v) {
        pantalla.setText("");
        operando1 = 0.00;
        operando2 = 0.00;
        resultado = 0.00;
    }

    public void buttonBorrarUltimo (View v){    //nos va a permitir saber la longitud del ingreso e ir restando el ultimo digito ingresado
        if (!pantalla.getText().toString().equals("")){
            pantalla.setText(pantalla.getText().subSequence(0,pantalla.getText().length()-1)+"");
        }
    }




}
