/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

/**
 *
 * @author isaac
 */
public class ServicoCalculadora {

    private Integer resultado;

    public String getResultado() {
        return resultado.toString();
    }

    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }

    public void calcularResultado(String op, Integer a, Integer b) {
        switch (op) {
            case "+": {
                setResultado(a + b);
                break;
            }
            case "-": {
                setResultado(a - b);
                break;
            }

            case "X": {
                setResultado(a * b);
                break;
            }
            case "/": {
                if (a.equals(0)) {
                    setResultado(0);
                    break;
                }

                setResultado(a / b);
                break;
            }
            default:
                break;
        }
    }

}
