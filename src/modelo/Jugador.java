package modelo;

public class Jugador {

    private String nombre;
    private TipoImagen tipoImagen;
    private int tablero[][];
    private int tablero4[][];
    private int tablero5[][];

    public Jugador() {
        tablero = new int[3][3];
        tablero4 = new int[4][4];
        tablero5 = new int[5][5];
        limpiar();
    }

    public Jugador(TipoImagen tipoImagen) {
        this.tipoImagen = tipoImagen;
        tablero = new int[4][4];
        tablero4 = new int[4][4];
        tablero5 = new int[5][5];
        limpiar();
    }

    public Jugador(String nombre, TipoImagen tipoImagen) {
        this.nombre = nombre;
        this.tipoImagen = tipoImagen;
        tablero = new int[3][3];
        tablero4 = new int[4][4];
        tablero5 = new int[5][5];
        limpiar();
    }

    public void limpiar() {
        if (tablero != null) {
            int dimension = tablero.length;
            for (int i = 0; i < dimension; i++) {
                for (int j = 0; j < dimension; j++) {
                    tablero[i][j] = 0;
                }
            }
        }
        if (tablero4 != null) {
            int dimension = tablero4.length;
            for (int i = 0; i < dimension; i++) {
                for (int j = 0; j < dimension; j++) {
                    tablero4[i][j] = 0;
                }
            }
        }
        if (tablero5 != null) {
            int dimension = tablero5.length;
            for (int i = 0; i < dimension; i++) {
                for (int j = 0; j < dimension; j++) {
                    tablero5[i][j] = 0;
                }
            }
        }
    }

    public TipoImagen tresEnRaya(Jugador jugadorRival) {
        if (tablero[0][0] == 1 && tablero[0][1] == 1 && tablero[0][2] == 1) {
            return TipoImagen.LINEA1;
        }
        if (tablero[1][0] == 1 && tablero[1][1] == 1 && tablero[1][2] == 1) {
            return TipoImagen.LINEA2;
        }
        if (tablero[2][0] == 1 && tablero[2][1] == 1 && tablero[2][2] == 1) {
            return TipoImagen.LINEA3;
        }
        if (tablero[0][0] == 1 && tablero[1][0] == 1 && tablero[2][0] == 1) {
            return TipoImagen.LINEA4;
        }
        if (tablero[0][1] == 1 && tablero[1][1] == 1 && tablero[2][1] == 1) {
            return TipoImagen.LINEA5;
        }
        if (tablero[0][2] == 1 && tablero[1][2] == 1 && tablero[2][2] == 1) {
            return TipoImagen.LINEA6;
        }
        if (tablero[2][0] == 1 && tablero[1][1] == 1 && tablero[0][2] == 1) {
            return TipoImagen.LINEA7;
        }
        if (tablero[0][0] == 1 && tablero[1][1] == 1 && tablero[2][2] == 1) {
            return TipoImagen.LINEA8;
        }

        int contador = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == 1) {
                    contador++;
                }
                if (jugadorRival.getTablero()[i][j] == 1) {
                    contador++;
                }
            }
        }

        if (contador == 9) {
            return TipoImagen.EMPATE;
        }

        return null;
    }

    public TipoImagen cuatroEnRaya(Jugador jugadorRival) {
        // Validación para líneas horizontales
    if (tablero4[0][0] == 1 && tablero4[0][1] == 1 && tablero4[0][2] == 1 && tablero4[0][3] == 1) return TipoImagen.LINEA1;
    if (tablero4[1][0] == 1 && tablero4[1][1] == 1 && tablero4[1][2] == 1 && tablero4[1][3] == 1) return TipoImagen.LINEA2;
    if (tablero4[2][0] == 1 && tablero4[2][1] == 1 && tablero4[2][2] == 1 && tablero4[2][3] == 1) return TipoImagen.LINEA2;
    if (tablero4[3][0] == 1 && tablero4[3][1] == 1 && tablero4[3][2] == 1 && tablero4[3][3] == 1) return TipoImagen.LINEA3;

    // Validación para líneas verticales
    if (tablero4[0][0] == 1 && tablero4[1][0] == 1 && tablero4[2][0] == 1 && tablero4[3][0] == 1) return TipoImagen.LINEA4;
    if (tablero4[0][1] == 1 && tablero4[1][1] == 1 && tablero4[2][1] == 1 && tablero4[3][1] == 1) return TipoImagen.LINEA5;
    if (tablero4[0][2] == 1 && tablero4[1][2] == 1 && tablero4[2][2] == 1 && tablero4[3][2] == 1) return TipoImagen.LINEA5;
    if (tablero4[0][3] == 1 && tablero4[1][3] == 1 && tablero4[2][3] == 1 && tablero4[3][3] == 1) return TipoImagen.LINEA6;

    // Validación para líneas diagonales
    if (tablero4[3][0] == 1 && tablero4[2][1] == 1 && tablero4[1][2] == 1 && tablero4[0][3] == 1) return TipoImagen.LINEA7;
    if (tablero4[0][0] == 1 && tablero4[1][1] == 1 && tablero4[2][2] == 1 && tablero4[3][3] == 1) return TipoImagen.LINEA8;


        int contador = 0;
        for (int i = 0; i < tablero4.length; i++) {
            for (int j = 0; j < tablero4.length; j++) {
                if (tablero4[i][j] == 1) {
                    contador++;
                }
                if (jugadorRival.getTablero4()[i][j] == 1) {
                    contador++;
                }
            }
        }

        if (contador == 16) {
            return TipoImagen.EMPATE;
        }

        return null;
    }

    public TipoImagen cincoEnRaya(Jugador jugadorRival) {
        if (tablero5[0][0] == 1 && tablero5[0][1] == 1 && tablero5[0][2] == 1 && tablero5[0][3] == 1 && tablero5[0][4] == 1) {
            return TipoImagen.LINEA1;
        }
        if (tablero5[1][0] == 1 && tablero5[1][1] == 1 && tablero5[1][2] == 1 && tablero5[1][3] == 1 && tablero5[1][4] == 1) {
            return TipoImagen.LINEA2;
        }
        if (tablero5[2][0] == 1 && tablero5[2][1] == 1 && tablero5[2][2] == 1 && tablero5[2][3] == 1 && tablero5[2][4] == 1) {
            return TipoImagen.LINEA2;
        }
        if (tablero5[3][0] == 1 && tablero5[3][1] == 1 && tablero5[3][2] == 1 && tablero5[3][3] == 1 && tablero5[3][4] == 1) {
            return TipoImagen.LINEA3;
        }
        if (tablero5[4][0] == 1 && tablero5[4][1] == 1 && tablero5[4][2] == 1 && tablero5[4][3] == 1 && tablero5[4][4] == 1) {
            return TipoImagen.LINEA3;
        }

        // Validación para líneas verticales
        if (tablero5[0][0] == 1 && tablero5[1][0] == 1 && tablero5[2][0] == 1 && tablero5[3][0] == 1 && tablero5[4][0] == 1) {
            return TipoImagen.LINEA6;
        }
        if (tablero5[0][1] == 1 && tablero5[1][1] == 1 && tablero5[2][1] == 1 && tablero5[3][1] == 1 && tablero5[4][1] == 1) {
            return TipoImagen.LINEA4;
        }
        if (tablero5[0][2] == 1 && tablero5[1][2] == 1 && tablero5[2][2] == 1 && tablero5[3][2] == 1 && tablero5[4][2] == 1) {
            return TipoImagen.LINEA5;
        }
        if (tablero5[0][3] == 1 && tablero5[1][3] == 1 && tablero5[2][3] == 1 && tablero5[3][3] == 1 && tablero5[4][3] == 1) {
            return TipoImagen.LINEA6;
        }
        if (tablero5[0][4] == 1 && tablero5[1][4] == 1 && tablero5[2][4] == 1 && tablero5[3][4] == 1 && tablero5[4][4] == 1) {
            return TipoImagen.LINEA6;
        }

        // Validación para líneas diagonales
        if (tablero5[4][0] == 1 && tablero5[3][1] == 1 && tablero5[2][2] == 1 && tablero5[1][3] == 1 && tablero5[0][4] == 1) {
            return TipoImagen.LINEA7;
        }
        if (tablero5[0][0] == 1 && tablero5[1][1] == 1 && tablero5[2][2] == 1 && tablero5[3][3] == 1 && tablero5[4][4] == 1) {
            return TipoImagen.LINEA7;
        }

        int contador = 0;
        for (int i = 0; i < tablero5.length; i++) {
            for (int j = 0; j < tablero5.length; j++) {
                if (tablero5[i][j] == 1) {
                    contador++;
                }
                if (jugadorRival.getTablero5()[i][j] == 1) {
                    contador++;
                }
            }
        }

        if (contador == 25) {
            return TipoImagen.EMPATE;
        }

        return null;
    }

    public int[][] getTablero4() {
        return tablero4;
    }

    public int[][] getTablero5() {
        return tablero5;
    }

    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoImagen getTipoImagen() {
        return tipoImagen;
    }

    public void setTipoImagen(TipoImagen tipoImagen) {
        this.tipoImagen = tipoImagen;
    }

}
