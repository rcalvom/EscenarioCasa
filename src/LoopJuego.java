
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;


/**
 *
 * @author Ricardo Andrés Calvo
 */
public class LoopJuego extends AnimationTimer {
    private final GraphicsContext gc;
    private final Image imagen;
    private long cont;
   
    @Override
    public void handle(long l) {
        
        //borrar y redibujar el fondo
        //Muro superior
        gc.clearRect(0, 0, 416,384);
        gc.drawImage(imagen,325,177,32,32,0,0,32,32);
        for (int i = 1; i <= 6; i++) {
            gc.drawImage(imagen,325,109,32,64,32*i,0,32,64);
        }
        gc.drawImage(imagen,289,81,32,32,32*7,0,32,32);
        for (int i = 8; i <= 11; i++) {
            gc.drawImage(imagen,325,109,32,64,32*i,0,32,64);
        }
        gc.drawImage(imagen,365,176,32,32,32*12,0,32,32);
        //Muro lateral izquierdo
        for (int i = 1; i <= 5; i++) {
            gc.drawImage(imagen,365,250,32,32,0,32*i,32,32);
        }
        gc.drawImage(imagen,243,2,32,32,0,32*6,32,32);
        for (int i = 7; i <= 10; i++) {
            gc.drawImage(imagen,365,250,32,32,0,32*i,32,32);
        }
        gc.drawImage(imagen,325,215,32,32,0,32*11,32,32);
        //Muro lateral derecho
        for (int i = 1; i <= 3; i++) {
            gc.drawImage(imagen,365,250,32,32,32*12,32*i,32,32);
        }
        gc.drawImage(imagen,289,118,32,32,32*12,32*4,32,32);
        for (int i = 5; i <= 10; i++) {
            gc.drawImage(imagen,365,250,32,32,32*12,32*i,32,32);
        }
        gc.drawImage(imagen,365,214,32,32,32*12,32*11,32,32);
        //Muros inferiores
        for (int i = 1; i <= 2; i++) {
            gc.drawImage(imagen,326,250,32,32,32*i,32*11,32,32);
        }
        gc.drawImage(imagen,289,2,32,32,32*3,32*11,32,32);
        gc.drawImage(imagen,289,44,32,32,32*6,32*11,32,32);
        gc.drawImage(imagen,325,74,32,32,32*7,32*11,32,32);
        for (int i = 8; i <= 11; i++) {
            gc.drawImage(imagen,326,250,32,32,32*i,32*11,32,32);
        }
        //Muro intermedio superior
        for (int i = 1; i <= 5; i++) {
            gc.drawImage(imagen,365,250,32,32,32*7,32*i,32,32);
        }
        gc.drawImage(imagen,289,118,32,32,32*7,32*6,32,32);
        gc.drawImage(imagen,364,2,32,64,32*6,32*6,32,64);
        gc.drawImage(imagen,325,2,32,64,32*7,32*7,32,64);
        //Muro intermedio izquierda
        for (int i = 1; i <= 2; i++) {
            gc.drawImage(imagen,325,109,32,64,32*i,32*6,32,64);
        }
        gc.drawImage(imagen,365,73,32,64,32*3,32*6,32,64);
        //Muro intermedio inferior
        gc.drawImage(imagen,365,141,32,32,32*7,32*10,32,32);
        //Muro intermedio derecha
        gc.drawImage(imagen,364,2,32,64,32*9,32*4,32,64);
        for (int i = 10; i <= 11; i++) {
            gc.drawImage(imagen,325,109,32,64,32*i,32*4,32,64);
        }
        //piso cocina
        for (int i = 1; i <= 6; i++) {
            for (int j = 2; j <= 5; j++) {
                gc.drawImage(imagen,166,15,32,32,32*i,32*j,32,32);
            }
        }
        gc.drawImage(imagen,166,15,32,32,32*4,32*6,32,32);
        gc.drawImage(imagen,166,15,32,32,32*5,32*6,32,32);
        //piso pasillo
        gc.drawImage(imagen,217,78,64,32,32*4,32*7,64,32);
        gc.drawImage(imagen,248,41,32,32,32*8,32*5,32,32);
        //piso sala
        for (int i = 1; i <= 6; i++) {
            for (int j = 8; j <= 10; j++) {
                gc.drawImage(imagen,203,15,32,32,32*i,32*j,32,32);
            }
        }
        gc.drawImage(imagen,203,15,32,32,32*4,32*11,32,32);
        gc.drawImage(imagen,203,15,32,32,32*5,32*11,32,32);
        gc.drawImage(imagen,203,15,32,32,32*7,32*9,32,32);
        for (int i = 8; i <= 11; i++) {
            for (int j = 6; j <= 10; j++) {
                gc.drawImage(imagen,203,15,32,32,32*i,32*j,32,32);
            }
        }
        //piso baño
        for (int i = 8; i <= 11; i++) {
            for (int j = 2; j <= 3; j++) {
                gc.drawImage(imagen,130,15,32,32,32*i,32*j,32,32);
            }
        }
        gc.drawImage(imagen,130,15,32,32,32*8,32*4,32,32);
        //Objetos Cocina
        gc.drawImage(imagen,13,113,31,51,32*1,32*1+(64-51),31,51);
        gc.drawImage(imagen,73,45,31,61,32*2,32*1+(64-61),31,61);
        gc.drawImage(imagen,176,60,31,44,32*3,32*1+(64-44),31,44);
        gc.drawImage(imagen,6,53,63,50,32*4,32*1+(64-50),63,50);
        gc.drawImage(imagen,183,211,18,26,32*6+5,32*1+5,18,26);
        gc.drawImage(imagen,109,63,63,39,32*1+(64-39),32*4,63,39);
        gc.drawImage(imagen,212,184,28,20,32*5-15,32*6+5,28,20);
        gc.drawImage(imagen,183,185,20,16,32*6-15,32*5+5,20,16);
        
        //Actualizar el contador de tiempo
        this.cont++;    
    }
    
    public LoopJuego(GraphicsContext gc) {
        this.gc = gc;
        this.imagen = new Image("Imagenes/silveira_neto_gpl_pixelart_tilese_version_2.png");
  
    }   
}